package scut.carson_ho.diy_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Carson_Ho on 17/2/20.
 */
public class CircleView extends View {

    private int mColor;
    // 设置画笔变量
    Paint mPaint1;

    // 自定义View的三个构造函数
    public CircleView(Context context) {
        super(context);

        // 在构造函数里初始化画笔的操作
        init();
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
        init();

    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // 加载自定义属性集合CircleView
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CircleView);

        // 解析集合中的属性circle_color属性
        // 该属性的id为:R.styleable.CircleView_circle_color
        // 第二个参数是默认设置颜色
        mColor = a.getColor(R.styleable.CircleView_circle_color,Color.RED);

        // 解析后释放资源
        a.recycle();

        init();
    }

    // 画笔初始化
    private void init() {

        // 创建画笔
        mPaint1 = new Paint();
        // 设置画笔颜色为蓝色
        mPaint1.setColor(mColor);
        // 设置画笔宽度为10px
        mPaint1.setStrokeWidth(5f);
        //设置画笔模式为填充
        mPaint1.setStyle(Paint.Style.FILL);

    }


    // 复写onDraw()
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        final int paddingLeft = getPaddingLeft();
        final int paddingRight = getPaddingRight();
        final int paddingTop = getPaddingTop();
        final int paddingBottom = getPaddingBottom();


        // 获取控件的高度和宽度
        int width = getWidth() - paddingLeft - paddingRight;
        int height = getHeight() - paddingTop - paddingBottom;

        // 设置圆的半径 = 宽,高最小值的2分之1
        int r = Math.min(width, height) / 2;

        // 画出圆(蓝色)
        // 圆心 = 控件的中央,半径 = 宽,高最小值的2分之1
        canvas.drawCircle(paddingLeft + width / 2, paddingTop + height / 2, r, mPaint1);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);


        // 获取宽-测量规则的模式和大小
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        // 获取高-测量规则的模式和大小
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        // 设置默认宽 / 高值
        // 默认宽/高的设定并无固定依据,根据需要灵活设置
        // 类似TextView,ImageView等针对wrap_content均在onMeasure()对设置默认宽 / 高值有特殊处理,具体读者可以自行查看
        int mWidth = 400;
        int mHeight = 400;

        if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(mWidth, mHeight);
        } else if (widthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(mWidth, heightSize);
        } else if (heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(widthSize, mHeight);
        }
        

    }
}
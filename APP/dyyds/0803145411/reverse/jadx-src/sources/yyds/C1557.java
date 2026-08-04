package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛷᛵᛵᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1557 extends Drawable {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f7929 = 0;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public float f7930;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Path f7931;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final float f7932;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final float f7933;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Paint f7934;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f7935;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public ValueAnimator f7936;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f7937;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public float f7938;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Paint f7939;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f7940;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f7941;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Paint f7942;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public float f7943;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public ValueAnimator f7944;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final float f7945;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final float f7946;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final float f7947;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public float f7948;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Paint f7949;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f7950;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final RectF f7951;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Paint f7952;

    static {
        NativeUtil.classesInit0(97);
    }

    public C1557(Context context) {
        AbstractC2328.m4341(-871207919059822L);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7935 = f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f7939 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(-1);
        this.f7949 = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.f7952 = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        this.f7934 = paint4;
        this.f7951 = new RectF();
        Paint paint5 = new Paint(1);
        paint5.setColor(-1);
        paint5.setStyle(style);
        this.f7942 = paint5;
        Path path = new Path();
        path.moveTo(-3.0f, -8.0f);
        path.lineTo(-12.0f, 0.0f);
        path.lineTo(-3.0f, 8.0f);
        path.lineTo(-3.0f, 3.5f);
        path.cubicTo(5.0f, 3.5f, 9.0f, 6.0f, 12.0f, 11.0f);
        path.cubicTo(11.0f, 2.0f, 6.0f, -3.5f, -3.0f, -3.5f);
        path.close();
        this.f7931 = path;
        this.f7933 = 48.0f * f;
        this.f7947 = 17.0f * f;
        this.f7945 = 18.5f * f;
        this.f7946 = 24.0f * f;
        this.f7932 = f * 4.0f;
        this.f7937 = 1.0f;
        this.f7950 = 1;
        this.f7948 = 1.0f;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static native int m3206(int i, int i2, float f);

    @Override // android.graphics.drawable.Drawable
    public final native void draw(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public final native int getOpacity();

    @Override // android.graphics.drawable.Drawable
    public final native void setAlpha(int i);

    @Override // android.graphics.drawable.Drawable
    public final native void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final native void m3207();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final native void m3208(Rect rect, float f, float f2, boolean z, int i, int i2, int i3, int i4, float f3);
}

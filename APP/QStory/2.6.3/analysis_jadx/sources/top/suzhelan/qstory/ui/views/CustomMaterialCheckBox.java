package top.suzhelan.qstory.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.C2266;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.Metadata;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p323.ViewOnClickListenerC8715;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;", "Landroid/view/View;", "", "checked", "Lkotlin/飘花落叶言子楪兰苏哲世;", "setCheckedImmediate", "(Z)V", "value", "飘花落叶言子楪兰世哲苏", "Z", "isChecked", "()Z", "setChecked", "Lkotlin/Function1;", "飘花落叶言子楪兰苏世哲", "L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;", "getOnCheckedChangeListener", "()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;", "setOnCheckedChangeListener", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V", "onCheckedChangeListener", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CustomMaterialCheckBox extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f16259 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final float f16260;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float f16261;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Path f16262;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Paint f16263;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Paint f16264;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Paint f16265;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final float f16266;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final float f16267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters and from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f16269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ValueAnimator f16270;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final RectF f16271;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters and from kotlin metadata */
    public InterfaceC6558 onCheckedChangeListener;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f16273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f16274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f16275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f16276;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        this.f16276 = context.getColor(R.color.iceberg_blue_dark);
        this.f16274 = context.getColor(R.color.grey);
        this.f16275 = 12.0f;
        this.f16269 = 280L;
        this.f16271 = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f16265 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density * 1.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint2.setStrokeJoin(join);
        this.f16264 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeJoin(join);
        paint3.setColor(-1);
        this.f16263 = paint3;
        this.f16262 = new Path();
        float f = getResources().getDisplayMetrics().density;
        this.f16261 = f;
        this.f16260 = 20.0f * f;
        this.f16267 = 1.0f * f;
        this.f16266 = f * 2.5f;
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new ViewOnClickListenerC8715(this, 2));
    }

    public final InterfaceC6558 getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f16270;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜");
        canvas.getClass();
        super.onDraw(canvas);
        float f = this.f16275 * this.f16261;
        float f2 = this.f16273;
        RectF rectF = this.f16271;
        if (f2 < 1.0f) {
            float f3 = this.f16267 / 2.0f;
            RectF rectF2 = new RectF(rectF.left + f3, rectF.top + f3, rectF.right - f3, rectF.bottom - f3);
            int i = this.f16274;
            Paint paint = this.f16264;
            paint.setColor(i);
            paint.setAlpha((int) ((1.0f - this.f16273) * 255.0f));
            float f4 = f - f3;
            canvas.drawRoundRect(rectF2, f4, f4, paint);
        }
        if (this.f16273 > 0.0f) {
            int i2 = this.f16276;
            Paint paint2 = this.f16265;
            paint2.setColor(i2);
            paint2.setAlpha((int) (this.f16273 * 255.0f));
            canvas.drawRoundRect(rectF, f, f, paint2);
        }
        if (this.f16273 > 0.1f) {
            Path path = this.f16262;
            path.reset();
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float f5 = this.f16260 * 0.3f;
            path.moveTo(fCenterX - (0.65f * f5), (0.05f * f5) + fCenterY);
            float f6 = 0.55f * f5;
            path.lineTo(fCenterX - (0.15f * f5), fCenterY + f6);
            path.lineTo((f5 * 0.7f) + fCenterX, fCenterY - f6);
            float fMin = Math.min(this.f16273 * 1.2f, 1.0f);
            canvas.save();
            canvas.scale(fMin, fMin, rectF.centerX(), rectF.centerY());
            int i3 = (int) (this.f16273 * 255.0f);
            Paint paint3 = this.f16263;
            paint3.setAlpha(i3);
            canvas.drawPath(path, paint3);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float f = this.f16260;
        setMeasuredDimension(View.resolveSize((int) (paddingLeft + f + getPaddingRight()), i), View.resolveSize((int) (f + getPaddingTop() + getPaddingBottom()), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16271.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f16263.setStrokeWidth(this.f16266);
        this.f16264.setStrokeWidth(this.f16267);
    }

    public final void setChecked(boolean z) {
        if (this.isChecked != z) {
            this.isChecked = z;
            ValueAnimator valueAnimator = this.f16270;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16273, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.setDuration(this.f16269);
            valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
            valueAnimatorOfFloat.addUpdateListener(new C2266(this, 3));
            valueAnimatorOfFloat.start();
            this.f16270 = valueAnimatorOfFloat;
        }
    }

    public final void setCheckedImmediate(boolean checked) {
        ValueAnimator valueAnimator = this.f16270;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setChecked(checked);
        this.f16273 = checked ? 1.0f : 0.0f;
        invalidate();
    }

    public final void setOnCheckedChangeListener(InterfaceC6558 interfaceC6558) {
        this.onCheckedChangeListener = interfaceC6558;
    }
}

package top.suzhelan.qstory.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.C2266;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.Metadata;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p323.ViewOnClickListenerC8713;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;", "Landroid/view/View;", "", "checked", "Lkotlin/飘花落叶言子楪兰苏哲世;", "setCheckedImmediate", "(Z)V", "value", "飘花落叶言子世楪苏兰哲", "Z", "isChecked", "()Z", "setChecked", "Lkotlin/Function1;", "飘花落叶言子世楪哲苏兰", "L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;", "getOnCheckedChangeListener", "()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;", "setOnCheckedChangeListener", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V", "onCheckedChangeListener", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CustomMaterialSwitch extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f16277 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Paint f16278;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Paint f16279;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RectF f16280;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters and from kotlin metadata */
    public InterfaceC6558 onCheckedChangeListener;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters and from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ValueAnimator f16283;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Paint f16284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f16285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f16286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f16287;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f16288;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f16289;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f16290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f16291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f16292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f16293;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMaterialSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        this.f16293 = context.getColor(R.color.iceberg_blue_dark);
        this.f16291 = context.getColor(R.color.grey);
        float f = getResources().getDisplayMetrics().density;
        this.f16292 = f;
        float f2 = 9.0f * f;
        this.f16286 = f2;
        this.f16285 = 2.0f * f2;
        this.f16289 = f * 36.0f;
        this.f16290 = f2;
        this.f16287 = 280L;
        this.f16280 = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f16279 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(-1);
        this.f16278 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(1073741824);
        this.f16284 = paint3;
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new ViewOnClickListenerC8713(this, 1));
    }

    public final InterfaceC6558 getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f16283;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜");
        canvas.getClass();
        super.onDraw(canvas);
        float f = this.f16288;
        int i = this.f16291;
        int i2 = (i >> 24) & Opcodes.CONST_METHOD_TYPE;
        int i3 = (i >> 16) & Opcodes.CONST_METHOD_TYPE;
        int i4 = (i >> 8) & Opcodes.CONST_METHOD_TYPE;
        int i5 = i & Opcodes.CONST_METHOD_TYPE;
        int i6 = this.f16293;
        int i7 = (i6 >> 24) & Opcodes.CONST_METHOD_TYPE;
        int i8 = (i6 >> 16) & Opcodes.CONST_METHOD_TYPE;
        int i9 = ((int) ((((i6 & Opcodes.CONST_METHOD_TYPE) - i5) * f) + i5)) | (((int) (((i7 - i2) * f) + i2)) << 24) | (((int) (((i8 - i3) * f) + i3)) << 16) | (((int) (((((i6 >> 8) & Opcodes.CONST_METHOD_TYPE) - i4) * f) + i4)) << 8);
        Paint paint = this.f16279;
        paint.setColor(i9);
        float f2 = this.f16290;
        RectF rectF = this.f16280;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float f3 = rectF.left;
        float f4 = this.f16286;
        float fWidth = ((rectF.width() - (2.0f * f4)) * this.f16288) + f3 + f4;
        float fCenterY = rectF.centerY();
        canvas.drawCircle(fWidth, (this.f16292 * 1.0f) + fCenterY, f4, this.f16284);
        canvas.drawCircle(fWidth, fCenterY, f4, this.f16278);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize((int) (this.f16289 + getPaddingLeft() + getPaddingRight()), i), View.resolveSize((int) (this.f16285 + getPaddingTop() + getPaddingBottom()), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        float f3 = this.f16289;
        float f4 = this.f16285;
        this.f16280.set(f - (f3 / 2.0f), f2 - (f4 / 2.0f), (f3 / 2.0f) + f, (f4 / 2.0f) + f2);
    }

    public final void setChecked(boolean z) {
        if (this.isChecked != z) {
            this.isChecked = z;
            ValueAnimator valueAnimator = this.f16283;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16288, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.setDuration(this.f16287);
            valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.5f));
            valueAnimatorOfFloat.addUpdateListener(new C2266(this, 4));
            valueAnimatorOfFloat.start();
            this.f16283 = valueAnimatorOfFloat;
        }
    }

    public final void setCheckedImmediate(boolean checked) {
        ValueAnimator valueAnimator = this.f16283;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setChecked(checked);
        this.f16288 = checked ? 1.0f : 0.0f;
        invalidate();
    }

    public final void setOnCheckedChangeListener(InterfaceC6558 interfaceC6558) {
        this.onCheckedChangeListener = interfaceC6558;
    }
}

package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛶᛳᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1298 extends C2133 {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public boolean f5948;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public Drawable f5949;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f5950;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f5951;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public ColorStateList f5952;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final C2030 f5953;

    public C1298(C2030 c2030) {
        super(c2030);
        this.f5952 = null;
        this.f5951 = null;
        this.f5950 = false;
        this.f5948 = false;
        this.f5953 = c2030;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m2581(Canvas canvas) {
        if (this.f5949 != null) {
            int max = this.f5953.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5949.getIntrinsicWidth();
                int intrinsicHeight = this.f5949.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5949.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5949.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // yyds.C2133
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void mo2582(AttributeSet attributeSet, int i) {
        super.mo2582(attributeSet, R.attr.seekBarStyle);
        C2030 c2030 = this.f5953;
        Context context = c2030.getContext();
        int[] iArr = AbstractC1592.f8102;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        Context context2 = c2030.getContext();
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(c2030, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable drawableM1564 = c0644M1535.m1564(0);
        if (drawableM1564 != null) {
            c2030.setThumb(drawableM1564);
        }
        Drawable drawableM1554 = c0644M1535.m1554(1);
        Drawable drawable = this.f5949;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f5949 = drawableM1554;
        if (drawableM1554 != null) {
            drawableM1554.setCallback(c2030);
            drawableM1554.setLayoutDirection(c2030.getLayoutDirection());
            if (drawableM1554.isStateful()) {
                drawableM1554.setState(c2030.getDrawableState());
            }
            m2583();
        }
        c2030.invalidate();
        if (typedArray.hasValue(3)) {
            this.f5951 = AbstractC2137.m4076(typedArray.getInt(3, -1), this.f5951);
            this.f5948 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f5952 = c0644M1535.m1556(2);
            this.f5950 = true;
        }
        c0644M1535.m1568();
        m2583();
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final void m2583() {
        Drawable drawable = this.f5949;
        if (drawable != null) {
            if (this.f5950 || this.f5948) {
                Drawable drawableMutate = drawable.mutate();
                this.f5949 = drawableMutate;
                if (this.f5950) {
                    drawableMutate.setTintList(this.f5952);
                }
                if (this.f5948) {
                    this.f5949.setTintMode(this.f5951);
                }
                if (this.f5949.isStateful()) {
                    this.f5949.setState(this.f5953.getDrawableState());
                }
            }
        }
    }
}

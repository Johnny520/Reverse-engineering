package yyds;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.StateSet;

/* JADX INFO: renamed from: yyds.ᛳᛳᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0549 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public GradientDrawable f2625;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f2626;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public GradientDrawable f2627;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ColorStateList f2628;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f2629;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2676 f2630;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public GradientDrawable f2631;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f2632;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2633;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public ColorStateList f2634;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Paint f2635 = new Paint(1);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public ColorStateList f2636;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f2637;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f2638;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f2639;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f2640;

    public C0549(C2676 c2676) {
        new Rect();
        new RectF();
        this.f2638 = false;
        this.f2630 = c2676;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0441 m1390() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f2627 = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f2639 + 1.0E-5f);
        this.f2627.setColor(-1);
        m1391();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f2625 = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f2639 + 1.0E-5f);
        this.f2625.setColor(0);
        this.f2625.setStroke(this.f2633, this.f2636);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.f2627, this.f2625}), this.f2632, this.f2640, this.f2637, this.f2629);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f2631 = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f2639 + 1.0E-5f);
        this.f2631.setColor(-1);
        ColorStateList colorStateList = this.f2634;
        int[] iArr = AbstractC2328.f11478;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(AbstractC2328.f11477, colorStateList.getDefaultColor()) : 0;
        int iMin = Math.min(Color.alpha(colorForState) * 2, 255);
        int i = AbstractC2138.f10564;
        if (iMin < 0 || iMin > 255) {
            C0188.m798("alpha must be between 0 and 255.");
            return null;
        }
        int i2 = (colorForState & 16777215) | (iMin << 24);
        int[][] iArr2 = {iArr, StateSet.NOTHING};
        int colorForState2 = colorStateList != null ? colorStateList.getColorForState(AbstractC2328.f11476, colorStateList.getDefaultColor()) : 0;
        int iMin2 = Math.min(Color.alpha(colorForState2) * 2, 255);
        if (iMin2 >= 0 && iMin2 <= 255) {
            return new C0441(new ColorStateList(iArr2, new int[]{i2, (iMin2 << 24) | (colorForState2 & 16777215)}), insetDrawable, this.f2631);
        }
        C0188.m798("alpha must be between 0 and 255.");
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1391() {
        GradientDrawable gradientDrawable = this.f2627;
        if (gradientDrawable != null) {
            gradientDrawable.setTintList(this.f2628);
            PorterDuff.Mode mode = this.f2626;
            if (mode != null) {
                this.f2627.setTintMode(mode);
            }
        }
    }
}

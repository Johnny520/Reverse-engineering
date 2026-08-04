package yyds;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᲇᲁᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2526 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC0185 f12448;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Rect f12449;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f12450;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f12451;

    public C2526(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12449 = new Rect();
        this.f12450 = true;
        this.f12451 = false;
    }

    public C2526(int i, int i2) {
        super(i, i2);
        this.f12449 = new Rect();
        this.f12450 = true;
        this.f12451 = false;
    }

    public C2526(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f12449 = new Rect();
        this.f12450 = true;
        this.f12451 = false;
    }

    public C2526(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12449 = new Rect();
        this.f12450 = true;
        this.f12451 = false;
    }

    public C2526(C2526 c2526) {
        super((ViewGroup.LayoutParams) c2526);
        this.f12449 = new Rect();
        this.f12450 = true;
        this.f12451 = false;
    }
}

package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Xu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1025Xu extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public final RunnableC0562N2 f3266q;

    /* JADX INFO: renamed from: r */
    public int f3267r;

    /* JADX INFO: renamed from: s */
    public final C1021Xq f3268s;

    public AbstractC1025Xu(Context r5, AttributeSet r6) {
        super(r5, r6, R.attr.materialClockStyle);
        LayoutInflater.from(r5).inflate(R.layout.material_radial_view_group, this);
        C1021Xq r1 = new C1021Xq();
        this.f3268s = r1;
        C0768Rv r2 = new C0768Rv(0.5f);
        C0685Px r3 = r1.f3241b.f2902a.m1516f();
        r3.f2196e = r2;
        r3.f2197f = r2;
        r3.f2198g = r2;
        r3.f2199h = r2;
        r1.setShapeAppearanceModel(r3.m1383a());
        this.f3268s.m1928n(ColorStateList.valueOf(-1));
        setBackground(this.f3268s);
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC0939Vu.f2954w, R.attr.materialClockStyle, 0);
        this.f3267r = r52.getDimensionPixelSize(0, 0);
        this.f3266q = new RunnableC0562N2(22, this);
        r52.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, ViewGroup.LayoutParams r3) {
        super.addView(r1, r2, r3);
        if (r1.getId() != (-1)) goto L5;
        r1.setId(View.generateViewId());
    L5:
        Handler r12 = getHandler();
        if (r12 == null) goto L9;
        RunnableC0562N2 r22 = this.f3266q;
        r12.removeCallbacks(r22);
        r12.post(r22);
        return;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1936m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1936m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View r2) {
        super.onViewRemoved(r2);
        Handler r22 = getHandler();
        if (r22 == null) goto L6;
        RunnableC0562N2 r0 = this.f3266q;
        r22.removeCallbacks(r0);
        r22.post(r0);
        return;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        this.f3268s.m1928n(ColorStateList.valueOf(r2));
    }
}

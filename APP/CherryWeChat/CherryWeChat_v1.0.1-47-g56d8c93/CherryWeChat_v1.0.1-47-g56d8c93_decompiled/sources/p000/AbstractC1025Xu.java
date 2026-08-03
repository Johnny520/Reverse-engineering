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

    public AbstractC1025Xu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C1021Xq c1021Xq = new C1021Xq();
        this.f3268s = c1021Xq;
        C0768Rv c0768Rv = new C0768Rv(0.5f);
        C0685Px c0685PxM1516f = c1021Xq.f3241b.f2902a.m1516f();
        c0685PxM1516f.f2196e = c0768Rv;
        c0685PxM1516f.f2197f = c0768Rv;
        c0685PxM1516f.f2198g = c0768Rv;
        c0685PxM1516f.f2199h = c0768Rv;
        c1021Xq.setShapeAppearanceModel(c0685PxM1516f.m1383a());
        this.f3268s.m1928n(ColorStateList.valueOf(-1));
        setBackground(this.f3268s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2954w, R.attr.materialClockStyle, 0);
        this.f3267r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3266q = new RunnableC0562N2(22, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0562N2 runnableC0562N2 = this.f3266q;
            handler.removeCallbacks(runnableC0562N2);
            handler.post(runnableC0562N2);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1936m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1936m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0562N2 runnableC0562N2 = this.f3266q;
            handler.removeCallbacks(runnableC0562N2);
            handler.post(runnableC0562N2);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3268s.m1928n(ColorStateList.valueOf(i));
    }
}

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
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242fz extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public final RunnableC0884x8 f1849p;

    /* JADX INFO: renamed from: q */
    public int f1850q;

    /* JADX INFO: renamed from: r */
    public final C0350iu f1851r;

    public AbstractC0242fz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0350iu c0350iu = new C0350iu();
        this.f1851r = c0350iu;
        s00 s00Var = new s00(0.5f);
        l30 l30VarM1802e = c0350iu.f2585a.f2266a.m1802e();
        l30VarM1802e.f2908e = s00Var;
        l30VarM1802e.f2909f = s00Var;
        l30VarM1802e.f2910g = s00Var;
        l30VarM1802e.f2911h = s00Var;
        c0350iu.setShapeAppearanceModel(l30VarM1802e.m1731a());
        this.f1851r.m1537j(ColorStateList.valueOf(-1));
        C0350iu c0350iu2 = this.f1851r;
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(this, c0350iu2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1457t, R.attr.materialClockStyle, 0);
        this.f1850q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1849p = new RunnableC0884x8(11, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = oa0.f3426a;
            view.setId(y90.m2729a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0884x8 runnableC0884x8 = this.f1849p;
            handler.removeCallbacks(runnableC0884x8);
            handler.post(runnableC0884x8);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo756e();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo756e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0884x8 runnableC0884x8 = this.f1849p;
            handler.removeCallbacks(runnableC0884x8);
            handler.post(runnableC0884x8);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f1851r.m1537j(ColorStateList.valueOf(i));
    }
}

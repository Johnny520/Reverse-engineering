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

/* JADX INFO: renamed from: yy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947yy extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public final RunnableC0581p1 f5412p;

    /* JADX INFO: renamed from: q */
    public int f5413q;

    /* JADX INFO: renamed from: r */
    public final C0200eu f5414r;

    public AbstractC0947yy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0200eu c0200eu = new C0200eu();
        this.f5414r = c0200eu;
        l00 l00Var = new l00(0.5f);
        e30 e30VarM1139e = c0200eu.f1842a.f1633a.m1139e();
        e30VarM1139e.f1697e = l00Var;
        e30VarM1139e.f1698f = l00Var;
        e30VarM1139e.f1699g = l00Var;
        e30VarM1139e.f1700h = l00Var;
        c0200eu.setShapeAppearanceModel(e30VarM1139e.m982a());
        this.f5414r.m1085j(ColorStateList.valueOf(-1));
        C0200eu c0200eu2 = this.f5414r;
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(this, c0200eu2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5061t, R.attr.materialClockStyle, 0);
        this.f5413q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5412p = new RunnableC0581p1(11, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = ja0.f2600a;
            view.setId(t90.m2364a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0581p1 runnableC0581p1 = this.f5412p;
            handler.removeCallbacks(runnableC0581p1);
            handler.post(runnableC0581p1);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo797e();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo797e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0581p1 runnableC0581p1 = this.f5412p;
            handler.removeCallbacks(runnableC0581p1);
            handler.post(runnableC0581p1);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f5414r.m1085j(ColorStateList.valueOf(i));
    }
}

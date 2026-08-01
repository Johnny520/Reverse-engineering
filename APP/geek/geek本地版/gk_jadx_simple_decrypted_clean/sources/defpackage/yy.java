package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class yy extends ConstraintLayout {
    public final p1 p;
    public int q;
    public final eu r;

    public yy(Context r5, AttributeSet r6) {
        super(r5, r6, R.attr.materialClockStyle);
        LayoutInflater.from(r5).inflate(R.layout.material_radial_view_group, this);
        eu r1 = new eu();
        this.r = r1;
        l00 r2 = new l00(0.5f);
        e30 r3 = r1.a.a.e();
        r3.e = r2;
        r3.f = r2;
        r3.g = r2;
        r3.h = r2;
        r1.setShapeAppearanceModel(r3.a());
        this.r.j(ColorStateList.valueOf(-1));
        eu r12 = this.r;
        WeakHashMap r22 = ja0.a;
        s90.q(this, r12);
        TypedArray r52 = r5.obtainStyledAttributes(r6, wy.t, R.attr.materialClockStyle, 0);
        this.q = r52.getDimensionPixelSize(0, 0);
        this.p = new p1(11, this);
        r52.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, ViewGroup.LayoutParams r3) {
        super.addView(r1, r2, r3);
        if (r1.getId() != (-1)) goto L5;
        WeakHashMap r22 = ja0.a;
        r1.setId(t90.a());
    L5:
        Handler r12 = getHandler();
        if (r12 == null) goto L9;
        p1 r23 = this.p;
        r12.removeCallbacks(r23);
        r12.post(r23);
        return;
    }

    public abstract void e();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View r2) {
        super.onViewRemoved(r2);
        Handler r22 = getHandler();
        if (r22 == null) goto L6;
        p1 r0 = this.p;
        r22.removeCallbacks(r0);
        r22.post(r0);
        return;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        this.r.j(ColorStateList.valueOf(r2));
    }
}

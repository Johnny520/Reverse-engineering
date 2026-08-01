package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f70 implements dv {
    public ku a;
    public ou b;
    public final /* synthetic */ Toolbar c;

    public f70(Toolbar r1) {
        this.c = r1;
    }

    @Override // defpackage.dv
    public final boolean c() {
        return false;
    }

    @Override // defpackage.dv
    public final boolean d(ou r7) {
        Toolbar r0 = this.c;
        KeyEvent.Callback r1 = r0.i;
        if ((r1 instanceof ya) == false) goto L5;
        ((ya) r1).onActionViewCollapsed();
    L5:
        r0.removeView(r0.i);
        r0.removeView(r0.h);
        r0.i = null;
        ArrayList r2 = r0.E;
        int r3 = r2.size() - 1;
    L6:
        if (r3 < 0) goto L8;
        r0.addView((View) r2.get(r3));
        r3 = r3 - 1;
        goto L6
    L8:
        r2.clear();
        this.b = null;
        r0.requestLayout();
        r7.C = false;
        r7.n.p(false);
        r0.u();
        return true;
    }

    @Override // defpackage.dv
    public final boolean g(ou r7) {
        Toolbar r0 = this.c;
        r0.c();
        ViewParent r1 = r0.h.getParent();
        if (r1 != r0) goto L5;
    L8:
        View r12 = r7.getActionView();
        r0.i = r12;
        this.b = r7;
        ViewParent r13 = r12.getParent();
        if (r13 != r0) goto L11;
    L14:
        int r14 = r0.getChildCount() - 1;
    L15:
        if (r14 < 0) goto L22;
        View r4 = r0.getChildAt(r14);
        if (((g70) r4.getLayoutParams()).b == 2) goto L21;
        if (r4 == r0.a) goto L21;
        r0.removeViewAt(r14);
        r0.E.add(r4);
    L21:
        r14 = r14 - 1;
        goto L15
    L22:
        r0.requestLayout();
        r7.C = true;
        r7.n.p(false);
        KeyEvent.Callback r72 = r0.i;
        if ((r72 instanceof ya) == false) goto L25;
        ((ya) r72).onActionViewExpanded();
    L25:
        r0.u();
        return true;
    L11:
        if ((r13 instanceof ViewGroup) == false) goto L13;
        ((ViewGroup) r13).removeView(r0.i);
    L13:
        g70 r15 = Toolbar.h();
        r15.a = (r0.n & 112) | 8388611;
        r15.b = 2;
        r0.i.setLayoutParams(r15);
        r0.addView(r0.i);
        goto L14
    L5:
        if ((r1 instanceof ViewGroup) == false) goto L7;
        ((ViewGroup) r1).removeView(r0.h);
    L7:
        r0.addView(r0.h);
        goto L8
    }

    @Override // defpackage.dv
    public final void h() {
        if (this.b == null) goto L16;
        ku r0 = this.a;
        if (r0 == null) goto L12;
        int r02 = r0.f.size();
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L12;
        if (this.a.getItem(r1) == this.b) goto L17;
        r1 = r1 + 1;
        goto L7
    L17:
        return;
    L12:
        d(this.b);
        return;
    }

    @Override // defpackage.dv
    public final void i(Context r2, ku r3) {
        ku r22 = this.a;
        if (r22 == null) goto L7;
        ou r0 = this.b;
        if (r0 == null) goto L7;
        r22.d(r0);
    L7:
        this.a = r3;
    }

    @Override // defpackage.dv
    public final boolean k(c50 r1) {
        return false;
    }

    @Override // defpackage.dv
    public final void a(ku r1, boolean r2) {
    }
}

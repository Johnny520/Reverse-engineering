package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;

/* JADX INFO: renamed from: Rl */
/* JADX INFO: loaded from: classes.dex */
public final class C0758Rl implements InterfaceC2560tv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0973Wl f2407a;

    public C0758Rl(C0973Wl r1) {
        this.f2407a = r1;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: a */
    public final void mo1552a(MotionEvent r10) {
        C0973Wl r0 = this.f2407a;
        RunnableC0431K0 r1 = r0.f3046r;
        r0.f3051w.f3928a.onTouchEvent(r10);
        VelocityTracker r2 = r0.f3047s;
        if (r2 == null) goto L6;
        r2.addMovement(r10);
    L6:
        if (r0.f3040l == (-1)) goto L39;
        int r22 = r10.getActionMasked();
        int r4 = r10.findPointerIndex(r0.f3040l);
        if (r4 < 0) goto L11;
        r0.m1852f(r22, r4, r10);
    L11:
        AbstractC1166o r5 = r0.f3031c;
        if (r5 == null) goto L40;
        int r6 = 0;
        if (r22 != 1) goto L17;
    L35:
        r0.m1859n(null, 0);
        r0.f3040l = -1;
        return;
    L17:
        if (r22 != 2) goto L19;
        if (r4 < 0) goto L38;
        r0.m1860o(r0.f3043o, r4, r10);
        r0.m1857l(r5);
        r0.f3045q.removeCallbacks(r1);
        r1.run();
        r0.f3045q.invalidate();
        return;
    L38:
        return;
    L19:
        if (r22 != 3) goto L21;
        VelocityTracker r102 = r0.f3047s;
        if (r102 == null) goto L35;
        r102.clear();
        goto L35
    L21:
        if (r22 != 6) goto L41;
        int r12 = r10.getActionIndex();
        if (r10.getPointerId(r12) != r0.f3040l) goto L37;
        if (r12 != 0) goto L27;
        r6 = 1;
    L27:
        r0.f3040l = r10.getPointerId(r6);
        r0.m1860o(r0.f3043o, r12, r10);
        return;
    L37:
        return;
    L41:
        return;
    L40:
        return;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: b */
    public final boolean mo1553b(MotionEvent r10) {
        C0973Wl r0 = this.f2407a;
        r0.f3051w.f3928a.onTouchEvent(r10);
        int r1 = r10.getActionMasked();
        C0801Sl r2 = null;
        if (r1 != 0) goto L24;
        r0.f3040l = r10.getPointerId(0);
        r0.f3032d = r10.getX();
        r0.f3033e = r10.getY();
        VelocityTracker r12 = r0.f3047s;
        if (r12 == null) goto L7;
        r12.recycle();
    L7:
        r0.f3047s = VelocityTracker.obtain();
        if (r0.f3031c != null) goto L33;
        ArrayList r13 = r0.f3044p;
        if (r13.isEmpty() == true) goto L18;
        View r5 = r0.m1855i(r10);
        int r6 = r13.size() - 1;
    L13:
        if (r6 < 0) goto L18;
        C0801Sl r7 = (C0801Sl) r13.get(r6);
        if (r7.f2512e.itemView == r5) goto L16;
        r6 = r6 - 1;
        goto L13
    L16:
        r2 = r7;
    L18:
        if (r2 == null) goto L33;
        AbstractC1166o r14 = r2.f2512e;
        r0.f3032d -= r2.f2516i;
        r0.f3033e -= r2.f2517j;
        r0.m1854h(r14, true);
        if (r0.f3029a.remove(r14.itemView) == false) goto L22;
        r0.f3041m.mo1531a(r0.f3045q, r14);
    L22:
        r0.m1859n(r14, r2.f2513f);
        r0.m1860o(r0.f3043o, 0, r10);
    L33:
        VelocityTracker r15 = r0.f3047s;
        if (r15 == null) goto L37;
        r15.addMovement(r10);
    L37:
        if (r0.f3031c == null) goto L39;
        return true;
    L39:
        return false;
    L24:
        if (r1 == 3) goto L32;
        if (r1 == 1) goto L32;
        int r22 = r0.f3040l;
        if (r22 == (-1)) goto L33;
        int r23 = r10.findPointerIndex(r22);
        if (r23 < 0) goto L33;
        r0.m1852f(r1, r23, r10);
    L32:
        r0.f3040l = -1;
        r0.m1859n(null, 0);
        goto L33
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: c */
    public final void mo1554c(boolean r3) {
        if (r3 == true) goto L4;
        return;
    L4:
        this.f2407a.m1859n(null, 0);
    }
}

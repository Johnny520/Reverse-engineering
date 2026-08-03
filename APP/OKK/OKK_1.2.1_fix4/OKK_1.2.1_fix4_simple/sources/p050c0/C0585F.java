package p050c0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p001A0.RunnableC0028d;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p052d0.C0758s;

/* JADX INFO: renamed from: c0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0585F extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public float f1760b;

    /* JADX INFO: renamed from: c */
    public boolean f1761c;

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r6) {
        C0758s r02 = C0588G.f1770c;
        if (r02 != null) goto L6;
        return;
    L6:
        if (C0710y.m1807b() == true) goto L8;
        return;
    L8:
        Object[] r1 = r6.f2670c;
        AbstractC0307g.m702d(r1, "args");
        Object r12 = AbstractC0179j.m537n0(0, r1);
        View r4 = null;
        if ((r12 instanceof MotionEvent) == false) goto L11;
        MotionEvent r13 = (MotionEvent) r12;
    L12:
        if (r13 != null) goto L14;
        return;
    L14:
        Object r62 = r6.f2669b;
        if ((r62 instanceof View) == false) goto L17;
        r4 = (View) r62;
    L17:
        if (r4 != null) goto L19;
        return;
    L19:
        C0588G r63 = C0588G.f1768a;
        Context r64 = r4.getContext();
        AbstractC0307g.m702d(r64, "getContext(...)");
        if (C0588G.m1431r(r64) == true) goto L22;
        return;
    L22:
        int r65 = r13.getActionMasked();
        if (r65 != 0) goto L25;
        this.f1760b = r13.getRawY();
        this.f1761c = false;
        return;
    L25:
        if (r65 == 1) goto L41;
        if (r65 == 2) goto L32;
        if (r65 == 3) goto L41;
        return;
    L32:
        if (Math.abs(r13.getRawY() - this.f1760b) <= 18.0f) goto L45;
        this.f1761c = true;
        if (r02.f2641G == true) goto L50;
        r02.f2641G = true;
        int r66 = r02.getHeight();
        int r14 = r02.m1940c(50.0f);
        if (r66 >= r14) goto L39;
        r66 = r14;
    L39:
        float r67 = r02.m1940c(40.0f) + r66;
        r02.animate().cancel();
        r02.animate().translationY(r67).setDuration(220).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f)).start();
        return;
    L50:
        return;
    L45:
        return;
    L41:
        if (this.f1761c == false) goto L47;
        r4.postDelayed(new RunnableC0028d(5, r02), 800);
        return;
    L47:
        return;
    L11:
        r13 = null;
        goto L12
    }
}

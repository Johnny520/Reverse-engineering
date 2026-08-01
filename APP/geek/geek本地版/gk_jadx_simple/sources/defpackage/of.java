package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class of implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ uf c;

    public /* synthetic */ of(uf r1, ArrayList r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L27;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        ArrayList r0 = this.b;
        int r1 = r0.size();
        int r2 = 0;
    L5:
        uf r3 = this.c;
        if (r2 >= r1) goto L8;
        Object r4 = r0.get(r2);
        r2 = r2 + 1;
        b00 r42 = (b00) r4;
        r3.getClass();
        View r5 = r42.a;
        ViewPropertyAnimator r6 = r5.animate();
        r3.o.add(r42);
        r6.alpha(1.0f).setDuration(r3.c).setListener(new pf(r3, r42, r5, r6)).start();
        goto L5
    L8:
        r0.clear();
        r3.l.remove(r0);
        return;
    L10:
        ArrayList r02 = this.b;
        int r12 = r02.size();
        int r22 = 0;
    L11:
        uf r43 = this.c;
        if (r22 >= r12) goto L25;
        Object r32 = r02.get(r22);
        r22 = r22 + 1;
        sf r52 = (sf) r32;
        ArrayList r9 = r43.r;
        long r10 = r43.f;
        b00 r33 = r52.a;
        View r62 = null;
        if (r33 != null) goto L16;
        View r7 = null;
    L17:
        b00 r34 = r52.b;
        if (r34 == null) goto L20;
        r62 = r34.a;
    L20:
        View r122 = r62;
        if (r7 == null) goto L23;
        ViewPropertyAnimator r63 = r7.animate().setDuration(r10);
        r9.add(r52.a);
        r63.translationX(r52.e - r52.c);
        r63.translationY(r52.f - r52.d);
        r63.alpha(0.0f).setListener(new rf(r43, r52, r63, r7, 0)).start();
    L23:
        if (r122 == null) goto L11;
        ViewPropertyAnimator r64 = r122.animate();
        r9.add(r52.b);
        r64.translationX(0.0f).translationY(0.0f).setDuration(r10).alpha(1.0f).setListener(new rf(r43, r52, r64, r122, 1)).start();
        goto L11
    L16:
        r7 = r33.a;
        goto L17
    L25:
        r02.clear();
        r43.n.remove(r02);
        return;
    L27:
        ArrayList r03 = this.b;
        int r13 = r03.size();
        int r23 = 0;
    L28:
        uf r44 = this.c;
        if (r23 >= r13) goto L36;
        Object r35 = r03.get(r23);
        r23 = r23 + 1;
        tf r36 = (tf) r35;
        b00 r53 = r36.a;
        int r65 = r36.b;
        int r72 = r36.c;
        int r8 = r36.d;
        int r37 = r36.e;
        r44.getClass();
        View r73 = r53.a;
        int r66 = r8 - r65;
        int r82 = r37 - r72;
        if (r66 == 0) goto L33;
        r73.animate().translationX(0.0f);
    L33:
        if (r82 == 0) goto L35;
        r73.animate().translationY(0.0f);
    L35:
        ViewPropertyAnimator r92 = r73.animate();
        r44.p.add(r53);
        r92.setDuration(r44.e).setListener(new qf(r44, r53, r66, r73, r82, r92)).start();
        goto L28
    L36:
        r03.clear();
        r44.m.remove(r03);
    }
}

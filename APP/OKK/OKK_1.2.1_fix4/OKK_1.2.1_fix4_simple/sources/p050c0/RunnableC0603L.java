package p050c0;

import android.view.View;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0603L implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1852c;

    public /* synthetic */ RunnableC0603L(int r1, View r2, Object r3) {
        this.f1850a = r1;
        this.f1851b = r2;
        this.f1852c = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View r02 = this.f1851b;
        Object r2 = this.f1852c;
        switch(this.f1850a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$currentMsg");
        C0639a0 r1 = C0639a0.f1967a;
        if (C0639a0.m1562S(C0639a0.m1587i0(r02, r2)) == false) goto L8;
        return;
    L8:
        if (C0639a0.m1561R(r2) == true) goto L21;
        C0639a0.m1601p0("left swipe quote retry after clear failed for ".concat(r2.getClass().getName()));
        return;
    L21:
        return;
    L12:
        AbstractC0307g.m703e(r2, "$currentMsg");
        C0639a0 r12 = C0639a0.f1967a;
        Object r03 = C0639a0.m1587i0(r02, r2);
        if (C0639a0.m1562S(r03) == false) goto L16;
        return;
    L16:
        if (C0639a0.m1561R(r03) == true) goto L23;
        C0639a0.m1601p0("left swipe quote retry failed for ".concat(r03.getClass().getName()));
        return;
    }
}

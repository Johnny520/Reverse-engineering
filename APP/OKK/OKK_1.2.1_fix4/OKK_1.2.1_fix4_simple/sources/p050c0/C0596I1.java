package p050c0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p056f0.C0826f0;
import p056f0.C0830i;

/* JADX INFO: renamed from: c0.I1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0596I1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1826b;

    public /* synthetic */ C0596I1(int r1, boolean r2) {
        this.f1826b = r1;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b r5) {
        Activity r1 = null;
        switch(this.f1826b) {
            case 0: goto L37;
            case 1: goto L27;
            case 2: goto L17;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        Object r52 = r5.f2669b;
        AbstractC0307g.m702d(r52, "thisObject");
        C0826f0 r02 = C0826f0.f2992a;
        C0826f0.m2140f(r52);
        return;
    L6:
        Object r53 = r5.f2669b;
        AbstractC0307g.m702d(r53, "thisObject");
        C0826f0.m2135a(r53);
        return;
    L8:
        Object r54 = r5.f2669b;
        AbstractC0307g.m702d(r54, "thisObject");
        C0826f0.m2135a(r54);
        return;
    L10:
        Object r03 = r5.f2669b;
        if ((r03 instanceof Activity) == false) goto L13;
        r1 = (Activity) r03;
    L13:
        if (r1 == null) goto L63;
        C0830i r04 = C0830i.f3000a;
        C0830i.m2151a(r1, "hook:" + r5.f2668a.getName());
        return;
    L63:
        return;
    L17:
        Object[] r05 = r5.f2670c;
        AbstractC0307g.m702d(r05, "args");
        if (AbstractC0307g.m699a(AbstractC0179j.m537n0(0, r05), Boolean.TRUE) == false) goto L64;
        Object r55 = r5.f2669b;
        if ((r55 instanceof Activity) == false) goto L23;
        r1 = (Activity) r55;
    L23:
        if (r1 == null) goto L65;
        C0830i.m2151a(r1, "focus");
        return;
    L65:
        return;
    L64:
        return;
    L27:
        Object r56 = r5.f2669b;
        if ((r56 instanceof Activity) == false) goto L30;
        r1 = (Activity) r56;
    L30:
        if (r1 != null) goto L33;
        return;
    L33:
        if (C0575B1.f1701a.m1393e() == false) goto L67;
        Object r57 = C0590G1.f1792a;
        C0590G1.m1439B(r1);
        return;
    L67:
        return;
    L37:
        Object r58 = r5.f2669b;
        if ((r58 instanceof Activity) == false) goto L40;
        r1 = (Activity) r58;
    L40:
        if (r1 == null) goto L70;
        Object r59 = C0590G1.f1792a;
        C0590G1.m1466x(r1);
        Window r510 = r1.getWindow();
        if (r510 == null) goto L47;
        View r511 = r510.getDecorView();
        if (r511 == null) goto L47;
        r511.postDelayed(new RunnableC0701v(r1, 4), 400);
    L47:
        Window r512 = r1.getWindow();
        if (r512 == null) goto L52;
        View r513 = r512.getDecorView();
        if (r513 == null) goto L52;
        r513.postDelayed(new RunnableC0701v(r1, 5), 1200);
    L52:
        Window r514 = r1.getWindow();
        if (r514 == null) goto L57;
        View r515 = r514.getDecorView();
        if (r515 == null) goto L57;
        r515.postDelayed(new RunnableC0701v(r1, 6), 2600);
    L57:
        Window r516 = r1.getWindow();
        if (r516 == null) goto L68;
        View r517 = r516.getDecorView();
        if (r517 == null) goto L69;
        r517.postDelayed(new RunnableC0701v(r1, 7), 5200);
        return;
    L69:
        return;
    L68:
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r3) {
        switch(this.f1826b) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L6:
        if (C0575B1.f1701a.m1393e() == false) goto L15;
        Object r02 = r3.f2669b;
        if ((r02 instanceof Activity) == false) goto L10;
        Activity r03 = (Activity) r02;
    L11:
        if (r03 == null) goto L13;
        Object r1 = C0590G1.f1792a;
        C0590G1.m1462t(r03);
    L13:
        r3.f2670c[0] = Boolean.FALSE;
        return;
    L10:
        r03 = null;
        goto L11
    }

    public C0596I1(int r1) {
        this.f1826b = r1;
        switch(r1) {
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        C0830i r12 = C0830i.f3000a;
        return;
    L6:
        C0826f0 r13 = C0826f0.f2992a;
        return;
    L8:
        C0826f0 r14 = C0826f0.f2992a;
    }

    public C0596I1(ClassLoader r1) {
        this.f1826b = 6;
        C0826f0 r12 = C0826f0.f2992a;
    }
}

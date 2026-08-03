package p050c0;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p029P0.InterfaceC0286l;

/* JADX INFO: renamed from: c0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0582E extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0286l f1751c;

    public /* synthetic */ C0582E(InterfaceC0286l r1, int r2) {
        this.f1750b = r2;
        this.f1751c = r1;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b r2) {
        switch(this.f1750b) {
            case 0: goto L25;
            case 1: goto L15;
            default: goto L5;
        };
    L5:
        if (C0710y.m1807b() == false) goto L30;
        Object r22 = r2.f2670c[0];
        if ((r22 instanceof Number) == false) goto L10;
        Number r23 = (Number) r22;
    L11:
        if (r23 == null) goto L29;
        Integer r24 = Integer.valueOf(r23.intValue());
        this.f1751c.invoke(r24);
        return;
    L29:
        return;
    L10:
        r23 = null;
        goto L11
    L30:
        return;
    L15:
        if (C0710y.m1807b() == false) goto L32;
        Object r25 = r2.f2670c[0];
        if ((r25 instanceof Boolean) == false) goto L20;
        Boolean r26 = (Boolean) r25;
    L21:
        if (r26 == null) goto L31;
        this.f1751c.invoke(r26);
        return;
    L31:
        return;
    L20:
        r26 = null;
        goto L21
    L32:
        return;
    L25:
        if (C0710y.m1807b() == false) goto L33;
        this.f1751c.invoke(r2);
        return;
    }
}

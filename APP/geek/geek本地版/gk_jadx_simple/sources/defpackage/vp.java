package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class vp extends s6 {
    public final sp b;
    public mw c;
    public final /* synthetic */ wp d;
    public final /* synthetic */ vo e;

    public vp(sp r1, wp r2, vo r3) {
        this.d = r2;
        this.e = r3;
        this.b = r1;
    }

    @Override // defpackage.s6
    public final void b(Object r5, Object r6) {
        vr r52 = (vr) r5;
        if (r6 != null) goto L5;
        boolean r62 = true;
    L6:
        sp r0 = this.b;
        if (r62 == false) goto L9;
        vo r1 = r0;
    L10:
        if (r1 == null) goto L19;
        AtomicReferenceFieldUpdater r2 = vr.a;
    L13:
        if (r2.compareAndSet(r52, this, r1) == true) goto L14;
        if (r2.get(r52) == this) goto L13;
        return;
    L14:
        if (r62 == false) goto L23;
        mw r53 = this.c;
        ip.l(r53);
        r0.g(r53);
        return;
    L23:
        return;
    L19:
        return;
    L9:
        r1 = this.c;
        goto L10
    L5:
        r62 = false;
        goto L6
    }

    @Override // defpackage.s6
    public final l0 c(Object r2) {
        vr r22 = (vr) r2;
        if (this.d.x() != this.e) goto L7;
        return null;
    L7:
        return a80.g;
    }
}

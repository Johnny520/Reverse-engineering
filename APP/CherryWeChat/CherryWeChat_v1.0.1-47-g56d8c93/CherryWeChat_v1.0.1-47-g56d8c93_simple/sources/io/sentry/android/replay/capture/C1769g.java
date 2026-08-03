package io.sentry.android.replay.capture;

import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1769g extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1770h f6453c;

    public /* synthetic */ C1769g(C1770h r1, int r2) {
        this.f6452b = r2;
        this.f6453c = r1;
        super(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r3) {
        switch(this.f6452b) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        AbstractC1775m r32 = (AbstractC1775m) r3;
        if ((r32 instanceof C1773k) == false) goto L8;
        C1770h r0 = this.f6453c;
        r0.f6458v.add(r32);
        r0.m3957l(r0.m3955j() + 1);
    L8:
        return C0829TC.f2620a;
    L9:
        AbstractC1775m r33 = (AbstractC1775m) r3;
        if ((r33 instanceof C1773k) == false) goto L13;
        C1770h r02 = this.f6453c;
        r02.f6458v.add(r33);
        r02.m3957l(r02.m3955j() + 1);
    L13:
        return C0829TC.f2620a;
    }
}

package io.sentry.android.replay.capture;

import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1778p extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1779q f6467c;

    public /* synthetic */ C1778p(C1779q r1, int r2) {
        this.f6466b = r2;
        this.f6467c = r1;
        super(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r3) {
        switch(this.f6466b) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        AbstractC1775m r32 = (AbstractC1775m) r3;
        if ((r32 instanceof C1773k) == false) goto L8;
        C1779q r0 = this.f6467c;
        C1773k.m3966a((C1773k) r32, r0.f6469s);
        r0.m3957l(r0.m3955j() + 1);
    L8:
        return C0829TC.f2620a;
    L9:
        AbstractC1775m r33 = (AbstractC1775m) r3;
        if ((r33 instanceof C1773k) == false) goto L13;
        C1773k r34 = (C1773k) r33;
        C1779q r02 = this.f6467c;
        C1773k.m3966a(r34, r02.f6469s);
        r02.m3957l(r02.m3955j() + 1);
        r02.m3958m(r34.f6459a.f7285u);
    L13:
        return C0829TC.f2620a;
    }
}

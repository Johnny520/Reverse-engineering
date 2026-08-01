package p178i3;

import p074O2.InterfaceC1046d;
import p160f3.C2135g;
import p184j3.AbstractC2383b;
import p184j3.AbstractC2385d;

/* JADX INFO: renamed from: i3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2340u extends AbstractC2385d {

    /* JADX INFO: renamed from: a */
    public long f7628a;

    /* JADX INFO: renamed from: b */
    public C2135g f7629b;

    @Override // p184j3.AbstractC2385d
    /* JADX INFO: renamed from: a */
    public final boolean mo4149a(AbstractC2383b abstractC2383b) {
        C2338s c2338s = (C2338s) abstractC2383b;
        if (this.f7628a >= 0) {
            return false;
        }
        long j5 = c2338s.f7621l;
        if (j5 < c2338s.f7622m) {
            c2338s.f7622m = j5;
        }
        this.f7628a = j5;
        return true;
    }

    @Override // p184j3.AbstractC2385d
    /* JADX INFO: renamed from: b */
    public final InterfaceC1046d[] mo4150b(AbstractC2383b abstractC2383b) {
        long j5 = this.f7628a;
        this.f7628a = -1L;
        this.f7629b = null;
        return ((C2338s) abstractC2383b).m4164v(j5);
    }
}

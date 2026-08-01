package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ps1 extends p000.sr1 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f8692;

    public ps1(long r1, p000.ps1 r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = p000.os1.f8239
            r1.<init>(r2)
            r0.f8692 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.<init>(r1)
            long r1 = r3.f10004
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r3 = r3.hashCode()
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.sr1
    /* JADX INFO: renamed from: ζ */
    public final int mo4588() {
            r0 = this;
            int r0 = p000.os1.f8239
            return r0
    }

    @Override // p000.sr1
    /* JADX INFO: renamed from: η */
    public final void mo4589(int r2, p000.InterfaceC0880up r3) {
            r1 = this;
            uy r3 = p000.os1.f8238
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f8692
            r0.set(r2, r3)
            r1.m5531()
            return
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5581 extends Yue.AbstractC5548<Yue.C5581> {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f20568;

    public C5581(long r1, @Yue.InterfaceC4543 Yue.C5581 r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = Yue.C5579.m20904()
            r1.<init>(r2)
            r0.f20568 = r1
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.append(r1)
            long r1 = r3.m20811()
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC5548
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public int mo20812() {
            r1 = this;
            int r0 = Yue.C5579.m20904()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m20915(int r3) {
            r2 = this;
            Yue.ۥۢ۠ۦۢ r0 = Yue.C5579.m20901()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f20568
            r1.set(r3, r0)
            r2.m20813()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m20916(int r2, @Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4543 java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f20568
            boolean r2 = Yue.C1449.m7118(r0, r2, r3, r4)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.Object m20917(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f20568
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.Object m20918(int r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f20568
            java.lang.Object r2 = r0.getAndSet(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m20919(int r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f20568
            r0.set(r2, r3)
            return
    }
}

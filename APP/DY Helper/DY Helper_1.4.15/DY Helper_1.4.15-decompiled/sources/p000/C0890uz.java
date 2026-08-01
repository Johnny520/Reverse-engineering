package p000;

/* JADX INFO: renamed from: uz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0890uz extends p000.AbstractRunnableC0928vz {

    /* JADX INFO: renamed from: η */
    public final p000.C0015ae f11032;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ kotlinx.coroutines.AbstractC0481 f11033;

    public C0890uz(kotlinx.coroutines.AbstractC0481 r1, long r2, p000.C0015ae r4) {
            r0 = this;
            r0.f11033 = r1
            r0.<init>()
            r0.f11492 = r2
            r1 = -1
            r0.f11493 = r1
            r0.f11032 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            ae r0 = r1.f11032
            kotlinx.coroutines.γ r1 = r1.f11033
            r0.m69(r1)
            return
    }

    @Override // p000.AbstractRunnableC0928vz
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            ae r2 = r2.f11032
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

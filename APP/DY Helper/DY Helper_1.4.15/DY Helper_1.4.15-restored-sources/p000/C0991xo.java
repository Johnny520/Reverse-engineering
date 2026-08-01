package p000;

/* JADX INFO: renamed from: xo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0991xo implements p000.ss1 {

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.atomic.AtomicReference f12246;

    public C0991xo(p000.C0275f7 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f12246 = r0
            return
    }

    @Override // p000.ss1
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.f12246
            r0 = 0
            java.lang.Object r1 = r1.getAndSet(r0)
            ss1 r1 = (p000.ss1) r1
            if (r1 == 0) goto L10
            java.util.Iterator r1 = r1.iterator()
            return r1
        L10:
            java.lang.String r1 = "This sequence can be consumed only once."
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }
}

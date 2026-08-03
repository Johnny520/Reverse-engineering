package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ug.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f13193a;

    public c0() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.f13193a = r0
            return
    }

    @Override // ug.d
    public final boolean a(ug.b r2) {
            r1 = this;
            tg.b0 r2 = (tg.b0) r2
            java.util.concurrent.atomic.AtomicReference r2 = r1.f13193a
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            l3.q r0 = tg.s.f13246b
            r2.set(r0)
            r2 = 1
            return r2
    }

    @Override // ug.d
    public final wf.c[] b(ug.b r2) {
            r1 = this;
            tg.b0 r2 = (tg.b0) r2
            java.util.concurrent.atomic.AtomicReference r2 = r1.f13193a
            r0 = 0
            r2.set(r0)
            wf.c[] r2 = ug.c.f13806a
            return r2
    }
}

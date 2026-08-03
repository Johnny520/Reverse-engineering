package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class t0 extends qg.y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11095i;

    public t0(qg.r0 r6) {
            r5 = this;
            r0 = 1
            r5.<init>(r0)
            r5.L(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = qg.y0.f11125h
            java.lang.Object r1 = r6.get(r5)
            qg.j r1 = (qg.j) r1
            boolean r2 = r1 instanceof qg.k
            r3 = 0
            if (r2 == 0) goto L17
            qg.k r1 = (qg.k) r1
            goto L18
        L17:
            r1 = r3
        L18:
            r2 = 0
            if (r1 == 0) goto L3b
            qg.y0 r1 = r1.j()
        L1f:
            boolean r4 = r1.G()
            if (r4 == 0) goto L26
            goto L3c
        L26:
            java.lang.Object r1 = r6.get(r1)
            qg.j r1 = (qg.j) r1
            boolean r4 = r1 instanceof qg.k
            if (r4 == 0) goto L33
            qg.k r1 = (qg.k) r1
            goto L34
        L33:
            r1 = r3
        L34:
            if (r1 == 0) goto L3b
            qg.y0 r1 = r1.j()
            goto L1f
        L3b:
            r0 = r2
        L3c:
            r5.f11095i = r0
            return
    }

    @Override // qg.y0
    public final boolean G() {
            r1 = this;
            boolean r0 = r1.f11095i
            return r0
    }

    @Override // qg.y0
    public final boolean H() {
            r1 = this;
            r0 = 1
            return r0
    }
}

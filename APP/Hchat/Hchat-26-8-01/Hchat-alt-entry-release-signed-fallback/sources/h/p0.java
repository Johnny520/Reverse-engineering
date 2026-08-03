package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.q0 f4733h;

    public /* synthetic */ p0(h.q0 r1, int r2) {
            r0 = this;
            r0.f4732g = r2
            r0.f4733h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4732g
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            i.e1 r4 = (i.e1) r4
            h.f0 r0 = h.f0.f4659g
            h.f0 r1 = h.f0.f4660h
            boolean r0 = r4.a(r0, r1)
            h.q0 r2 = r3.f4733h
            if (r0 == 0) goto L21
            h.r0 r4 = r2.f4741z
            h.h1 r4 = r4.f4746a
            h.f1 r4 = r4.f4691b
            if (r4 == 0) goto L1e
            i.y r4 = r4.f4664b
            goto L39
        L1e:
            i.r0 r4 = h.m0.f4719c
            goto L39
        L21:
            h.f0 r0 = h.f0.f4661i
            boolean r4 = r4.a(r1, r0)
            if (r4 == 0) goto L37
            h.s0 r4 = r2.A
            h.h1 r4 = r4.f4753a
            h.f1 r4 = r4.f4691b
            if (r4 == 0) goto L34
            i.y r4 = r4.f4664b
            goto L39
        L34:
            i.r0 r4 = h.m0.f4719c
            goto L39
        L37:
            i.r0 r4 = h.m0.f4719c
        L39:
            return r4
        L3a:
            i.e1 r4 = (i.e1) r4
            h.f0 r0 = h.f0.f4659g
            h.f0 r1 = h.f0.f4660h
            boolean r0 = r4.a(r0, r1)
            r2 = 0
            if (r0 == 0) goto L48
            goto L59
        L48:
            h.f0 r0 = h.f0.f4661i
            boolean r4 = r4.a(r1, r0)
            if (r4 == 0) goto L57
            h.q0 r4 = r3.f4733h
            h.s0 r4 = r4.A
            h.h1 r4 = r4.f4753a
            goto L59
        L57:
            i.r0 r2 = h.m0.f4720d
        L59:
            if (r2 != 0) goto L5d
            i.r0 r2 = h.m0.f4720d
        L5d:
            return r2
    }
}

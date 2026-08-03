package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.m1 f5645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.j1 f5646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.k1 f5647c;

    public d1(i.k1 r1, i.m1 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f5647c = r1
            r0.f5645a = r2
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f5646b = r1
            return
    }

    public final i.c1 a(fg.l r9, fg.l r10) {
            r8 = this;
            i0.j1 r0 = r8.f5646b
            java.lang.Object r1 = r0.getValue()
            i.c1 r1 = (i.c1) r1
            i.k1 r2 = r8.f5647c
            if (r1 != 0) goto L3b
            i.c1 r1 = new i.c1
            i.g1 r3 = new i.g1
            java.lang.Object r4 = r2.c()
            java.lang.Object r4 = r10.invoke(r4)
            java.lang.Object r5 = r2.c()
            java.lang.Object r5 = r10.invoke(r5)
            i.m1 r6 = r8.f5645a
            fg.l r7 = r6.f5730a
            java.lang.Object r5 = r7.invoke(r5)
            i.q r5 = (i.q) r5
            r5.d()
            r3.<init>(r2, r4, r5, r6)
            r1.<init>(r8, r3, r9, r10)
            r0.setValue(r1)
            w0.p r0 = r2.f5715i
            r0.add(r3)
        L3b:
            gg.m r10 = (gg.m) r10
            r1.f5617i = r10
            r1.f5616h = r9
            i.e1 r9 = r2.f()
            r1.a(r9)
            return r1
    }
}

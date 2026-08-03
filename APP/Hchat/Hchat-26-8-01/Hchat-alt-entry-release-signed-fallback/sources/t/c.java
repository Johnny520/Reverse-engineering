package t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f12958a;

    public c() {
            r2 = this;
            r2.<init>()
            j0.b r0 = new j0.b
            r1 = 16
            t.e[] r1 = new t.e[r1]
            r0.<init>(r1)
            r2.f12958a = r0
            return
    }

    public final java.lang.Object a(e1.c r9, yf.c r10) {
            r8 = this;
            boolean r0 = r10 instanceof t.b
            if (r0 == 0) goto L13
            r0 = r10
            t.b r0 = (t.b) r0
            int r1 = r0.f12957m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12957m = r1
            goto L18
        L13:
            t.b r0 = new t.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12955k
            int r1 = r0.f12957m
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r9 = r0.f12954j
            int r1 = r0.f12953i
            java.lang.Object[] r3 = r0.f12952h
            e1.c r4 = r0.f12951g
            f8.i.I0(r10)
            r10 = r4
            goto L65
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L35:
            f8.i.I0(r10)
            j0.b r10 = r8.f12958a
            java.lang.Object[] r1 = r10.f6671g
            int r10 = r10.f6673i
            r3 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r7
        L45:
            if (r1 >= r9) goto L67
            r4 = r3[r1]
            t.e r4 = (t.e) r4
            i.e0 r5 = new i.e0
            r6 = 23
            r5.<init>(r10, r6)
            r0.f12951g = r10
            r0.f12952h = r3
            r0.f12953i = r1
            r0.f12954j = r9
            r0.f12957m = r2
            java.lang.Object r4 = oh.h.k(r4, r5, r0)
            xf.a r5 = xf.a.f21579g
            if (r4 != r5) goto L65
            return r5
        L65:
            int r1 = r1 + r2
            goto L45
        L67:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}

package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z7.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7874i;

    public /* synthetic */ d(java.util.Iterator r1, int r2) {
            r0 = this;
            r0.f7874i = r2
            r0.<init>(r1)
            return
    }

    @Override // z7.m
    public final java.util.Iterator b(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f7874i
            switch(r0) {
                case 0: goto L44;
                case 1: goto L31;
                case 2: goto L29;
                default: goto L5;
            }
        L5:
            r7.s r10 = (r7.s) r10
            r10.W()
            java.lang.Object r10 = r10.f11582p
            java.util.Iterator r10 = y7.a.g(r10)
            be.m r0 = new be.m
            r1 = 2
            java.lang.Class<l7.f> r2 = l7.f.class
            r3 = 0
            r0.<init>(r2, r1, r3)
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L22
            z7.h r10 = z7.h.f22606g
            goto L28
        L22:
            z7.g r1 = new z7.g
            r1.<init>(r10, r0)
            r10 = r1
        L28:
            return r10
        L29:
            l7.l r10 = (l7.l) r10
            r0 = 0
            java.util.Iterator r10 = r10.W(r0)
            return r10
        L31:
            l7.f r10 = (l7.f) r10
            l7.d r0 = new l7.d
            o7.f r10 = r10.f7878q
            j7.d r10 = r10.f9571m
            z7.c r10 = r10.f9563k
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
            r0.<init>(r10, r1)
            return r0
        L44:
            o7.j r10 = (o7.j) r10
            java.lang.Class<l7.f> r0 = l7.f.class
            k7.a r0 = r10.u(r0)
            l7.f r0 = (l7.f) r0
            if (r0 != 0) goto L53
            z7.h r10 = z7.h.f22606g
            goto Lb9
        L53:
            j7.e r1 = r10.f9586m
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
            r3 = r2
        L5d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L9e
            java.lang.Object r4 = r1.next()
            l7.m r4 = (l7.m) r4
            s7.b r4 = r4.f7890o
            o7.c r5 = r4.f12372n
            r6 = r5
            s7.c r6 = (s7.c) r6
            k7.f r6 = r6.f9564l
            okio.a r7 = r7.k.f11567p
            if (r6 != r7) goto L92
            s7.c r5 = (s7.c) r5
            z7.c r4 = r5.f9563k
            int r4 = r4.size()
            r6 = 0
            r7 = r2
        L80:
            if (r6 >= r4) goto L9a
            k7.a r8 = r5.Q(r6)
            r7.k r8 = (r7.k) r8
            int r8 = r8.N()
            if (r8 <= r7) goto L8f
            r7 = r8
        L8f:
            int r6 = r6 + 1
            goto L80
        L92:
            z7.c r4 = r4.f9563k
            int r4 = r4.size()
            int r7 = r4 + (-1)
        L9a:
            if (r7 <= r3) goto L5d
            r3 = r7
            goto L5d
        L9e:
            int r1 = r0.U()
            int r1 = r1 << 24
            l7.j r10 = r10.f9585l
            p7.a r10 = r10.f7869m
            p7.g r10 = (p7.g) r10
            r7.c r10 = r10.f10286r
            int r10 = r10.get()
            int r10 = r10 << 16
            r10 = r10 | r1
            o7.i r1 = new o7.i
            r1.<init>(r3, r10, r0)
            r10 = r1
        Lb9:
            return r10
    }
}

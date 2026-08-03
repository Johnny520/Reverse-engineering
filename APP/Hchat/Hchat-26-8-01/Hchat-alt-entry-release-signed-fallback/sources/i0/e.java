package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements wf.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1.d f5865h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i0.e f5866i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0.e f5867j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i0.e f5868k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i0.e f5869l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i0.e f5870m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5871g;

    static {
            g1.d r0 = new g1.d
            r1 = 14
            r0.<init>(r1)
            i0.e.f5865h = r0
            i0.e r0 = new i0.e
            r1 = 1
            r0.<init>(r1)
            i0.e.f5866i = r0
            i0.e r0 = new i0.e
            r1 = 2
            r0.<init>(r1)
            i0.e.f5867j = r0
            i0.e r0 = new i0.e
            r1 = 3
            r0.<init>(r1)
            i0.e.f5868k = r0
            i0.e r0 = new i0.e
            r1 = 4
            r0.<init>(r1)
            i0.e.f5869l = r0
            i0.e r0 = new i0.e
            r1 = 5
            r0.<init>(r1)
            i0.e.f5870m = r0
            return
    }

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f5871g = r1
            r0.<init>()
            return
    }

    public static final void a(i0.e r8) {
            tg.b0 r0 = i0.y1.f6095z
        L2:
            tg.b0 r0 = i0.y1.f6095z
            java.lang.Object r1 = r0.getValue()
            q0.b r1 = (q0.b) r1
            p0.b r2 = r1.f10570i
            java.lang.Object r3 = r2.get(r8)
            q0.a r3 = (q0.a) r3
            if (r3 != 0) goto L16
            r3 = r1
            goto L78
        L16:
            java.lang.Object r4 = r3.f10565a
            java.lang.Object r3 = r3.f10566b
            p0.j r5 = r2.f10050g
            r6 = 0
            if (r8 == 0) goto L24
            int r7 = r8.hashCode()
            goto L25
        L24:
            r7 = r6
        L25:
            p0.j r6 = r5.v(r7, r6, r8)
            if (r5 != r6) goto L2c
            goto L3b
        L2c:
            if (r6 != 0) goto L31
            p0.b r2 = p0.b.f10049i
            goto L3b
        L31:
            p0.b r5 = new p0.b
            int r2 = r2.f10051h
            int r2 = r2 + (-1)
            r5.<init>(r6, r2)
            r2 = r5
        L3b:
            r0.b r5 = r0.b.f11305a
            if (r4 == r5) goto L53
            java.lang.Object r6 = r2.get(r4)
            r6.getClass()
            q0.a r6 = (q0.a) r6
            q0.a r7 = new q0.a
            java.lang.Object r6 = r6.f10565a
            r7.<init>(r6, r3)
            p0.b r2 = r2.a(r4, r7)
        L53:
            if (r3 == r5) goto L69
            java.lang.Object r6 = r2.get(r3)
            r6.getClass()
            q0.a r6 = (q0.a) r6
            q0.a r7 = new q0.a
            java.lang.Object r6 = r6.f10566b
            r7.<init>(r4, r6)
            p0.b r2 = r2.a(r3, r7)
        L69:
            if (r4 == r5) goto L6e
            java.lang.Object r6 = r1.f10568g
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r3 == r5) goto L73
            java.lang.Object r4 = r1.f10569h
        L73:
            q0.b r3 = new q0.b
            r3.<init>(r6, r4, r2)
        L78:
            if (r1 == r3) goto L85
            l3.q r2 = ug.c.f13807b
            if (r1 != 0) goto L7f
            r1 = r2
        L7f:
            boolean r0 = r0.h(r1, r3)
            if (r0 == 0) goto L2
        L85:
            return
    }

    public boolean b(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5871g
            switch(r0) {
                case 2: goto L10;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = gg.l.a(r2, r3)
            return r2
        La:
            if (r2 != r3) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
        L10:
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f5871g
            switch(r0) {
                case 2: goto L13;
                case 3: goto L10;
                case 4: goto L5;
                case 5: goto Ld;
                case 6: goto L5;
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "Empty"
            return r0
        Ld:
            java.lang.String r0 = "StructuralEqualityPolicy"
            return r0
        L10:
            java.lang.String r0 = "ReferentialEqualityPolicy"
            return r0
        L13:
            java.lang.String r0 = "NeverEqualPolicy"
            return r0
    }
}

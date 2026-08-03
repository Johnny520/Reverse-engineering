package x6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x6.f f21204h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x6.f f21205i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x6.f f21206j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21207g;

    static {
            x6.f r0 = new x6.f
            r1 = 0
            r0.<init>(r1)
            x6.f.f21204h = r0
            x6.f r0 = new x6.f
            r1 = 1
            r0.<init>(r1)
            x6.f.f21205i = r0
            x6.f r0 = new x6.f
            r1 = 2
            r0.<init>(r1)
            x6.f.f21206j = r0
            return
    }

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f21207g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f21207g
            switch(r0) {
                case 0: goto Laf;
                case 1: goto L5a;
                default: goto L5;
            }
        L5:
            u6.c r4 = (u6.c) r4
            java.lang.Class<u6.d> r0 = u6.d.class
            gg.f r1 = gg.v.a(r0)
            java.lang.Class<u6.b> r2 = u6.b.class
            gg.f r2 = gg.v.a(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L23
            u6.b r0 = new u6.b
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto L4c
        L23:
            gg.f r2 = gg.v.a(r0)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L37
            u6.d r0 = new u6.d
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto L4c
        L37:
            java.lang.Class<u6.a> r2 = u6.a.class
            gg.f r2 = gg.v.a(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4f
            u6.a r0 = new u6.a
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
        L4c:
            u6.d r0 = (u6.d) r0
            goto L59
        L4f:
            gg.f r4 = gg.v.a(r0)
            java.lang.String r0 = "Unsupported accessor type: "
            g1.d.h(r4, r0)
            r0 = 0
        L59:
            return r0
        L5a:
            u6.c r4 = (u6.c) r4
            java.lang.Class<u6.b> r0 = u6.b.class
            gg.f r1 = gg.v.a(r0)
            gg.f r2 = gg.v.a(r0)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L76
            u6.b r0 = new u6.b
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto La1
        L76:
            java.lang.Class<u6.d> r2 = u6.d.class
            gg.f r2 = gg.v.a(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L8c
            u6.d r0 = new u6.d
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto La1
        L8c:
            java.lang.Class<u6.a> r2 = u6.a.class
            gg.f r2 = gg.v.a(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La4
            u6.a r0 = new u6.a
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
        La1:
            u6.b r0 = (u6.b) r0
            goto Lae
        La4:
            gg.f r4 = gg.v.a(r0)
            java.lang.String r0 = "Unsupported accessor type: "
            g1.d.h(r4, r0)
            r0 = 0
        Lae:
            return r0
        Laf:
            u6.c r4 = (u6.c) r4
            java.lang.Class<u6.a> r0 = u6.a.class
            gg.f r1 = gg.v.a(r0)
            java.lang.Class<u6.b> r2 = u6.b.class
            gg.f r2 = gg.v.a(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lcd
            u6.b r0 = new u6.b
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto Lf6
        Lcd:
            java.lang.Class<u6.d> r2 = u6.d.class
            gg.f r2 = gg.v.a(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Le3
            u6.d r0 = new u6.d
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
            goto Lf6
        Le3:
            gg.f r2 = gg.v.a(r0)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lf9
            u6.a r0 = new u6.a
            java.lang.reflect.Member r4 = r4.a()
            r0.<init>(r4)
        Lf6:
            u6.a r0 = (u6.a) r0
            goto L103
        Lf9:
            gg.f r4 = gg.v.a(r0)
            java.lang.String r0 = "Unsupported accessor type: "
            g1.d.h(r4, r0)
            r0 = 0
        L103:
            return r0
    }
}

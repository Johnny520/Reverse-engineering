package xd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends md.e implements ud.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mh.b f21537j = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ud.n f21538i;

    static {
            java.lang.Class<xd.a> r0 = xd.a.class
            mh.b r0 = mh.d.b(r0)
            xd.a.f21537j = r0
            return
    }

    public a(ud.n r1) {
            r0 = this;
            r0.<init>()
            r0.f21538i = r1
            return
    }

    public java.util.List i() {
            r1 = this;
            java.util.List r0 = r1.u()
            return r0
    }

    @Override // ud.n
    public boolean l(ud.j r2, ud.j r3) {
            r1 = this;
            java.lang.String r2 = "Replace sub block not supported for class \"{}\""
            java.lang.Class r3 = r1.getClass()
            mh.b r0 = xd.a.f21537j
            r0.h(r3, r2)
            r2 = 0
            return r2
    }
}

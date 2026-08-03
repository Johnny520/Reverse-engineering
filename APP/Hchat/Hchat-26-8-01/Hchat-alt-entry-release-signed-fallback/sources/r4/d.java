package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4.d0 f11382a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v4.d0 f11383b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v4.d0 f11384c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v4.d0 f11385d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v4.d0 f11386e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v4.d0 f11387f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v4.d0 f11388g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.d0 f11389h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.c0 f11390i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v4.c0 f11391j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v4.c0 f11392k = null;

    static {
            java.lang.String r0 = "Ldalvik/annotation/AnnotationDefault;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11382a = r0
            java.lang.String r0 = "Ldalvik/annotation/EnclosingClass;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11383b = r0
            java.lang.String r0 = "Ldalvik/annotation/EnclosingMethod;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11384c = r0
            java.lang.String r0 = "Ldalvik/annotation/InnerClass;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11385d = r0
            java.lang.String r0 = "Ldalvik/annotation/MemberClasses;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11386e = r0
            java.lang.String r0 = "Ldalvik/annotation/Signature;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11387f = r0
            java.lang.String r0 = "Ldalvik/annotation/SourceDebugExtension;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11388g = r0
            java.lang.String r0 = "Ldalvik/annotation/Throws;"
            w4.c r0 = w4.c.m(r0)
            v4.d0 r0 = v4.d0.l(r0)
            r4.d.f11389h = r0
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "accessFlags"
            r0.<init>(r1)
            r4.d.f11390i = r0
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "name"
            r0.<init>(r1)
            r4.d.f11391j = r0
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "value"
            r0.<init>(r1)
            r4.d.f11392k = r0
            return
    }

    public static v4.d a(w4.e r5) {
            int r0 = r5.size()
            v4.c r1 = new v4.c
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto L1b
            w4.c r4 = r5.getType(r3)
            v4.d0 r4 = v4.d0.l(r4)
            r1.m(r3, r4)
            int r3 = r3 + 1
            goto Lb
        L1b:
            r1.f22555g = r2
            v4.d r5 = new v4.d
            r5.<init>(r1)
            return r5
    }
}

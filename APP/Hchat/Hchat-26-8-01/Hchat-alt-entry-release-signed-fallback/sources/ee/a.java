package ee;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f2727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f2728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee.b f2729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ud.a f2730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ee.b f2731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.List f2732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2733i;

    public a(ud.r r2, ud.a r3, java.util.ArrayList r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2727c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f2728d = r0
            ee.b r0 = new ee.b
            r0.<init>()
            r1.f2729e = r0
            r1.f2725a = r2
            r1.f2730f = r3
            r1.f2726b = r4
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            ee.b r0 = r5.f2729e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.ArrayList r1 = r5.f2727c
            java.lang.String r2 = "\n  "
            java.lang.String r1 = xe.s.j(r1, r2)
            java.lang.String r2 = "\n dups:\n  "
            java.lang.String r3 = "\n}"
            java.lang.String r4 = "FinallyExtractInfo{\n finally:\n  "
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}

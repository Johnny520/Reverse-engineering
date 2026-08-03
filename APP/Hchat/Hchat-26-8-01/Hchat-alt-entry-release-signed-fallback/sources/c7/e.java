package c7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f1037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1039d;

    static {
            java.lang.String r0 = "AndroidManifest.xml"
            y7.a.q(r0)
            java.lang.String r0 = "resources.arsc"
            y7.a.q(r0)
            return
    }

    public e(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            r1.f1038c = r0
            r0 = -1
            r1.f1039d = r0
            r1.f1036a = r2
            java.lang.String r2 = a7.a.R(r2)
            r1.f1037b = r2
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f1037b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.f1036a
            return r0
    }

    public abstract java.io.InputStream b();

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof c7.e
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            c7.e r2 = (c7.e) r2
            java.lang.String r0 = r1.f1036a
            java.lang.String r2 = r2.f1036a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f1036a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.f1036a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

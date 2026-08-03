package p3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3.a f10090b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f10091a;

    static {
            p3.a r0 = new p3.a
            r0.<init>()
            p3.a.f10090b = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f10091a = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p3.a
            if (r0 == 0) goto L12
            p3.a r2 = (p3.a) r2
            java.util.LinkedHashMap r2 = r2.f10091a
            java.util.LinkedHashMap r0 = r1.f10091a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.LinkedHashMap r0 = r1.f10091a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CreationExtras(extras="
            r0.<init>(r1)
            java.util.LinkedHashMap r1 = r2.f10091a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qe.a0 f10934b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qe.a0 f10935c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qe.a0 f10936d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qe.a0 f10937e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set f10938a;

    static {
            r0 = 0
            qe.z[] r0 = new qe.z[r0]
            qe.a0 r0 = a(r0)
            qe.a0.f10934b = r0
            qe.z r0 = qe.z.f11007g
            qe.z[] r1 = new qe.z[]{r0}
            qe.a0 r1 = a(r1)
            qe.a0.f10935c = r1
            qe.z r1 = qe.z.f11008h
            qe.z[] r1 = new qe.z[]{r0, r1}
            qe.a0 r1 = a(r1)
            qe.a0.f10936d = r1
            qe.z r1 = qe.z.f11010j
            qe.z r2 = qe.z.f11009i
            qe.z[] r0 = new qe.z[]{r0, r1, r2}
            qe.a0 r0 = a(r0)
            qe.a0.f10937e = r0
            return
    }

    public a0(java.util.EnumSet r1) {
            r0 = this;
            r0.<init>()
            r0.f10938a = r1
            return
    }

    public static qe.a0 a(qe.z... r4) {
            int r0 = r4.length
            if (r0 != 0) goto La
            java.lang.Class<qe.z> r4 = qe.z.class
            java.util.EnumSet r4 = java.util.EnumSet.noneOf(r4)
            goto L27
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L1f
            r3 = r4[r2]
            java.util.Objects.requireNonNull(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L12
        L1f:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            java.util.EnumSet r4 = java.util.EnumSet.copyOf(r4)
        L27:
            qe.a0 r0 = new qe.a0
            r0.<init>(r4)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.Set r0 = r1.f10938a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

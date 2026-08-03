package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f8016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public le.b f8017b;

    static {
            java.lang.Class<le.c> r0 = le.c.class
            mh.d.b(r0)
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f8016a = r0
            le.b r0 = new le.b
            r0.<init>()
            r1.f8017b = r0
            return
    }

    public final void a(ud.a r2) {
            r1 = this;
            if (r2 == 0) goto L9
            le.b r0 = r1.f8017b
            java.util.HashSet r0 = r0.f8014a
            r0.add(r2)
        L9:
            return
    }

    public final void b() {
            r1 = this;
            java.util.ArrayDeque r0 = r1.f8016a
            java.lang.Object r0 = r0.pop()
            le.b r0 = (le.b) r0
            r1.f8017b = r0
            return
    }

    public final void c(xd.a r3) {
            r2 = this;
            le.b r0 = r2.f8017b
            java.util.ArrayDeque r1 = r2.f8016a
            r1.push(r0)
            int r0 = r1.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 > r1) goto L1c
            le.b r0 = r2.f8017b
            r0.getClass()
            le.b r1 = new le.b
            r1.<init>(r0, r3)
            r2.f8017b = r1
            return
        L1c:
            af.f r3 = new af.f
            java.lang.String r0 = "Regions stack size limit reached"
            r3.<init>(r0)
            throw r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.ArrayDeque r0 = r4.f8016a
            int r0 = r0.size()
            le.b r1 = r4.f8017b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Region stack size: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", last: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}

package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.x f9871c;

    public c1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9869a = r0
            r0 = 1
            r1.f9870b = r0
            r0 = 0
            r1.f9871c = r0
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.c1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.c1 r5 = (p.c1) r5
            float r1 = r4.f9869a
            float r3 = r5.f9869a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            boolean r1 = r4.f9870b
            boolean r3 = r5.f9870b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            p.x r1 = r4.f9871c
            p.x r5 = r5.f9871c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f9869a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f9870b
            int r0 = eh.a.h(r0, r1, r2)
            p.x r2 = r3.f9871c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RowColumnParentData(weight="
            r0.<init>(r1)
            float r1 = r2.f9869a
            r0.append(r1)
            java.lang.String r1 = ", fill="
            r0.append(r1)
            boolean r1 = r2.f9870b
            r0.append(r1)
            java.lang.String r1 = ", crossAxisAlignment="
            r0.append(r1)
            p.x r1 = r2.f9871c
            r0.append(r1)
            java.lang.String r1 = ", flowLayoutData=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

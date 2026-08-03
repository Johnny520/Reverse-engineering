package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf.b f3138b;

    public a(java.lang.String r1, sf.b r2) {
            r0 = this;
            r0.<init>()
            r0.f3137a = r1
            r0.f3138b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof f2.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f2.a r5 = (f2.a) r5
            java.lang.String r1 = r5.f3137a
            java.lang.String r3 = r4.f3137a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            sf.b r1 = r4.f3138b
            sf.b r5 = r5.f3138b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f3137a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            sf.b r2 = r3.f3138b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AccessibilityAction(label="
            r0.<init>(r1)
            java.lang.String r1 = r2.f3137a
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            sf.b r1 = r2.f3138b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

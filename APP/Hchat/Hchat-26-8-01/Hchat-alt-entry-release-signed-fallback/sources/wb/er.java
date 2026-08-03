package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class er {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16009d;

    public er(boolean r1, boolean r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f16006a = r1
            r0.f16007b = r2
            r0.f16008c = r3
            r0.f16009d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.er
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.er r5 = (wb.er) r5
            boolean r1 = r4.f16006a
            boolean r3 = r5.f16006a
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f16007b
            boolean r3 = r5.f16007b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            float r1 = r4.f16008c
            float r3 = r5.f16008c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L25
            return r2
        L25:
            float r1 = r4.f16009d
            float r5 = r5.f16009d
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f16006a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f16007b
            int r0 = eh.a.h(r0, r1, r2)
            float r2 = r3.f16008c
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f16009d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Options(glass="
            r0.<init>(r1)
            boolean r1 = r2.f16006a
            r0.append(r1)
            java.lang.String r1 = ", clearBackground="
            r0.append(r1)
            boolean r1 = r2.f16007b
            r0.append(r1)
            java.lang.String r1 = ", horizontalMarginDp="
            r0.append(r1)
            float r1 = r2.f16008c
            r0.append(r1)
            java.lang.String r1 = ", bottomMarginDp="
            r0.append(r1)
            float r1 = r2.f16009d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

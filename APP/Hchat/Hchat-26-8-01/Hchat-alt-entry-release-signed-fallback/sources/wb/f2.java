package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f16053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f16054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f16055c;

    public f2(java.util.List r1, java.util.Set r2, java.util.Set r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f16053a = r1
            r0.f16054b = r2
            r0.f16055c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.f2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.f2 r5 = (wb.f2) r5
            java.util.List r1 = r4.f16053a
            java.util.List r3 = r5.f16053a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Set r1 = r4.f16054b
            java.util.Set r3 = r5.f16054b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.Set r1 = r4.f16055c
            java.util.Set r5 = r5.f16055c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.util.List r0 = r2.f16053a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Set r1 = r2.f16054b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r0 = r2.f16055c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConversationGroupPickerData(options="
            r0.<init>(r1)
            java.util.List r1 = r2.f16053a
            r0.append(r1)
            java.lang.String r1 = ", friendIds="
            r0.append(r1)
            java.util.Set r1 = r2.f16054b
            r0.append(r1)
            java.lang.String r1 = ", officialIds="
            r0.append(r1)
            java.util.Set r1 = r2.f16055c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

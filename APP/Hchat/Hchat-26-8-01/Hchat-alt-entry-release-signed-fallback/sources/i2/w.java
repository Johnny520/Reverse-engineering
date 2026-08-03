package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6403b;

    public w(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f6402a = r2
            r0.f6403b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof i2.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.w r5 = (i2.w) r5
            boolean r1 = r5.f6402a
            boolean r3 = r4.f6402a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.f6403b
            int r5 = r5.f6403b
            if (r1 != r5) goto L1a
            return r0
        L1a:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f6402a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f6403b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlatformParagraphStyle(includeFontPadding="
            r0.<init>(r1)
            boolean r1 = r2.f6402a
            r0.append(r1)
            java.lang.String r1 = ", emojiSupportMatch="
            r0.append(r1)
            int r1 = r2.f6403b
            java.lang.String r1 = i2.j.a(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6333a;

    public /* synthetic */ j(int r1) {
            r0 = this;
            r0.<init>()
            r0.f6333a = r1
            return
    }

    public static java.lang.String a(int r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "EmojiSupportMatch.Default"
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            java.lang.String r2 = "EmojiSupportMatch.None"
            return r2
        Lb:
            r0 = 2
            if (r2 != r0) goto L11
            java.lang.String r2 = "EmojiSupportMatch.All"
            return r2
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid(value="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i2.j
            if (r0 != 0) goto L5
            goto Ld
        L5:
            i2.j r2 = (i2.j) r2
            int r2 = r2.f6333a
            int r0 = r1.f6333a
            if (r0 == r2) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f6333a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f6333a
            java.lang.String r0 = a(r0)
            return r0
    }
}

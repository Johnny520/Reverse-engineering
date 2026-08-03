package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.lang.CharSequence {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f6760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f6761h;

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            char[] r0 = r1.f6760g
            char r2 = r0[r2]
            return r2
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            char[] r0 = r1.f6760g
            int r0 = r0.length
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.f6760g
            int r4 = r4 - r3
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f6761h
            if (r0 != 0) goto Ld
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.f6760g
            r0.<init>(r1)
            r2.f6761h = r0
        Ld:
            java.lang.String r0 = r2.f6761h
            return r0
    }
}

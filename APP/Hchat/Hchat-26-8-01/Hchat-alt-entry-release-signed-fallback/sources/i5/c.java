package i5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a.a implements v5.c {
    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            java.lang.String r0 = r1.getType()
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r0 = r1.getType()
            java.lang.String r2 = r2.toString()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L26
            boolean r0 = r2 instanceof v5.c
            if (r0 == 0) goto L15
            java.lang.String r0 = r1.getType()
            v5.c r2 = (v5.c) r2
            java.lang.String r2 = r2.getType()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L26
            java.lang.String r0 = r1.getType()
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.equals(r2)
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getType()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            java.lang.String r0 = r1.getType()
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.getType()
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.t(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}

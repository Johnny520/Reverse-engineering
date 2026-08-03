package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f4975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.textclassifier.TextClassification f4977c;

    public r0(java.lang.CharSequence r1, long r2, android.view.textclassifier.TextClassification r4) {
            r0 = this;
            r0.<init>()
            r0.f4975a = r1
            r0.f4976b = r2
            r0.f4977c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h0.r0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h0.r0 r8 = (h0.r0) r8
            java.lang.CharSequence r1 = r7.f4975a
            java.lang.CharSequence r3 = r8.f4975a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f4976b
            long r5 = r8.f4976b
            boolean r1 = i2.m0.b(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            android.view.textclassifier.TextClassification r1 = r7.f4977c
            android.view.textclassifier.TextClassification r8 = r8.f4977c
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f4975a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = i2.m0.f6359c
            long r2 = r4.f4976b
            int r0 = eh.a.f(r0, r1, r2)
            android.view.textclassifier.TextClassification r1 = r4.f4977c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextClassificationResult(text="
            r0.<init>(r1)
            java.lang.CharSequence r1 = r3.f4975a
            r0.append(r1)
            java.lang.String r1 = ", selection="
            r0.append(r1)
            long r1 = r3.f4976b
            java.lang.String r1 = i2.m0.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", textClassification="
            r0.append(r1)
            android.view.textclassifier.TextClassification r1 = r3.f4977c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

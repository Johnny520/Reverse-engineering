package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3841c;

    public w0(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f3839a = r3
            r0.f3840b = r1
            r0.f3841c = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof fb.w0
            if (r0 != 0) goto L8
            goto L26
        L8:
            fb.w0 r3 = (fb.w0) r3
            boolean r0 = r2.f3839a
            boolean r1 = r3.f3839a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f3840b
            java.lang.String r1 = r3.f3840b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f3841c
            java.lang.String r3 = r3.f3841c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f3839a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3840b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3841c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImageData(base64="
            r0.<init>(r1)
            boolean r1 = r3.f3839a
            r0.append(r1)
            java.lang.String r1 = ", mimeType="
            r0.append(r1)
            java.lang.String r1 = r3.f3840b
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f3841c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}

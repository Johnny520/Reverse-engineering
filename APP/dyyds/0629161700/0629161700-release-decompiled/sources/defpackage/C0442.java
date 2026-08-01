package defpackage;

/* JADX INFO: renamed from: ᛳᛳᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0442 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0619 f2176;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0533 f2177;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Class f2178;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f2179;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2180;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f2181;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f2182;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Class f2183;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f2184;

    public C0442(java.lang.Object r2, defpackage.InterfaceC1711 r3, int r4, int r5, defpackage.C0619 r6, java.lang.Class r7, java.lang.Class r8, defpackage.C0533 r9) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f2182 = r2
            r1.f2184 = r3
            r1.f2180 = r4
            r1.f2179 = r5
            r1.f2176 = r6
            r1.f2178 = r7
            java.lang.String r2 = "Transcode class must not be null"
            defpackage.C0292.m944(r8, r2)
            r1.f2183 = r8
            r1.f2177 = r9
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0442
            if (r0 == 0) goto L50
            ᛳᛳᛸᛷ r3 = (defpackage.C0442) r3
            java.lang.Object r0 = r2.f2182
            java.lang.Object r1 = r3.f2182
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            ᲀᛷᛶᲈ r0 = r2.f2184
            ᲀᛷᛶᲈ r1 = r3.f2184
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            int r0 = r2.f2179
            int r1 = r3.f2179
            if (r0 != r1) goto L50
            int r0 = r2.f2180
            int r1 = r3.f2180
            if (r0 != r1) goto L50
            ᛴᛱᲇᛵ r0 = r2.f2176
            ᛴᛱᲇᛵ r1 = r3.f2176
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            java.lang.Class r0 = r2.f2178
            java.lang.Class r1 = r3.f2178
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            java.lang.Class r0 = r2.f2183
            java.lang.Class r1 = r3.f2183
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            ᛳᛸᲁᛶ r2 = r2.f2177
            ᛳᛸᲁᛶ r3 = r3.f2177
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L50
            r2 = 1
            return r2
        L50:
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r2 = this;
            int r0 = r2.f2181
            if (r0 != 0) goto L50
            java.lang.Object r0 = r2.f2182
            int r0 = r0.hashCode()
            r2.f2181 = r0
            int r0 = r0 * 31
            ᲀᛷᛶᲈ r1 = r2.f2184
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f2180
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f2179
            int r1 = r1 + r0
            r2.f2181 = r1
            int r1 = r1 * 31
            ᛴᛱᲇᛵ r0 = r2.f2176
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.f2181 = r0
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f2178
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f2181 = r1
            int r1 = r1 * 31
            java.lang.Class r0 = r2.f2183
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.f2181 = r0
            int r0 = r0 * 31
            ᛳᛸᲁᛶ r1 = r2.f2177
            ᛴᛱᲇᛵ r1 = r1.f2651
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f2181 = r1
            return r1
        L50:
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EngineKey{model="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f2182
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.f2180
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.f2179
            r0.append(r1)
            java.lang.String r1 = ", resourceClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f2178
            r0.append(r1)
            java.lang.String r1 = ", transcodeClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f2183
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            ᲀᛷᛶᲈ r1 = r2.f2184
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r2.f2181
            r0.append(r1)
            java.lang.String r1 = ", transformations="
            r0.append(r1)
            ᛴᛱᲇᛵ r1 = r2.f2176
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            ᛳᛸᲁᛶ r2 = r2.f2177
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}

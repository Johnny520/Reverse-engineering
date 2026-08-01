package defpackage;

/* JADX INFO: renamed from: ᛱᛸᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0150 {
    java.lang.String getName();

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    boolean mo671();

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    void mo672(java.lang.String r1);

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    void mo673(java.lang.String r1);

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    default boolean mo674(int r11) {
            r10 = this;
            r0 = 40
            r1 = 30
            r2 = 20
            r3 = 10
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r11 == r8) goto L21
            if (r11 == r7) goto L1f
            if (r11 == r6) goto L1d
            if (r11 == r5) goto L1b
            if (r11 != r4) goto L19
            r9 = 0
            goto L22
        L19:
            r10 = 0
            throw r10
        L1b:
            r9 = r3
            goto L22
        L1d:
            r9 = r2
            goto L22
        L1f:
            r9 = r1
            goto L22
        L21:
            r9 = r0
        L22:
            if (r9 == 0) goto L74
            if (r9 == r3) goto L6f
            if (r9 == r2) goto L6a
            if (r9 == r1) goto L65
            if (r9 != r0) goto L31
            boolean r10 = r10.mo671()
            return r10
        L31:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            if (r11 == r8) goto L4c
            if (r11 == r7) goto L49
            if (r11 == r6) goto L46
            if (r11 == r5) goto L43
            if (r11 == r4) goto L40
            java.lang.String r11 = "null"
            goto L4e
        L40:
            java.lang.String r11 = "TRACE"
            goto L4e
        L43:
            java.lang.String r11 = "DEBUG"
            goto L4e
        L46:
            java.lang.String r11 = "INFO"
            goto L4e
        L49:
            java.lang.String r11 = "WARN"
            goto L4e
        L4c:
            java.lang.String r11 = "ERROR"
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Level ["
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = "] not recognized."
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L65:
            boolean r10 = r10.mo678()
            return r10
        L6a:
            boolean r10 = r10.mo680()
            return r10
        L6f:
            boolean r10 = r10.mo677()
            return r10
        L74:
            boolean r10 = r10.mo676()
            return r10
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    void mo675(java.lang.String r1, java.lang.Throwable r2);

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    boolean mo676();

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    boolean mo677();

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    boolean mo678();

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    void mo679(java.lang.Object r1);

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    boolean mo680();

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    void mo681(java.lang.Object r1);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    void mo682(java.lang.String r1, java.lang.Object... r2);

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    void mo683(java.lang.Object r1, java.lang.Boolean r2);

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    void mo684(java.lang.String r1, java.lang.Object... r2);
}

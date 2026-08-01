package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛶᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0869 {
    java.lang.String getName();

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    void mo376(java.lang.String r1, java.lang.Object... r2);

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    boolean mo377();

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    void mo378(java.lang.String r1, java.lang.Throwable r2);

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    void mo379(java.lang.Object r1);

    /* JADX INFO: renamed from: ᛷᲁᲁ */
    void mo380(java.lang.String r1);

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    default boolean mo1441(int r11) {
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
            boolean r10 = r10.mo381()
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
            boolean r10 = r10.mo377()
            return r10
        L6a:
            boolean r10 = r10.mo383()
            return r10
        L6f:
            boolean r10 = r10.mo385()
            return r10
        L74:
            boolean r10 = r10.mo382()
            return r10
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    boolean mo381();

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    boolean mo382();

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    boolean mo383();

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    void mo384(java.lang.String r1, java.lang.Object... r2);

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    boolean mo385();

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    void mo386(java.lang.Object r1, java.lang.Boolean r2);

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ */
    void mo387(java.lang.Object r1);

    /* JADX INFO: renamed from: ᲈᛳᲀ */
    void mo388(java.lang.String r1);
}

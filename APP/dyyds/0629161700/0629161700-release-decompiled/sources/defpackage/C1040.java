package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f4620;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4621;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f4622;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f4623;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f4624;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m2000() {
            r6 = this;
            int r0 = r6.f4623
            r1 = r0 & 7
            r2 = 2
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L1a
            int r1 = r6.f4621
            int r5 = r6.f4624
            if (r1 <= r5) goto L11
            r1 = r4
            goto L16
        L11:
            if (r1 != r5) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = r3
        L16:
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            goto L5c
        L1a:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == 0) goto L30
            int r1 = r6.f4621
            int r5 = r6.f4622
            if (r1 <= r5) goto L26
            r1 = r4
            goto L2b
        L26:
            if (r1 != r5) goto L2a
            r1 = r2
            goto L2b
        L2a:
            r1 = r3
        L2b:
            int r1 = r1 << r3
            r1 = r1 & r0
            if (r1 != 0) goto L30
            goto L5c
        L30:
            r1 = r0 & 1792(0x700, float:2.511E-42)
            if (r1 == 0) goto L47
            int r1 = r6.f4620
            int r5 = r6.f4624
            if (r1 <= r5) goto L3c
            r1 = r4
            goto L41
        L3c:
            if (r1 != r5) goto L40
            r1 = r2
            goto L41
        L40:
            r1 = r3
        L41:
            int r1 = r1 << 8
            r1 = r1 & r0
            if (r1 != 0) goto L47
            goto L5c
        L47:
            r1 = r0 & 28672(0x7000, float:4.0178E-41)
            if (r1 == 0) goto L5e
            int r1 = r6.f4620
            int r6 = r6.f4622
            if (r1 <= r6) goto L53
            r2 = r4
            goto L57
        L53:
            if (r1 != r6) goto L56
            goto L57
        L56:
            r2 = r3
        L57:
            int r6 = r2 << 12
            r6 = r6 & r0
            if (r6 != 0) goto L5e
        L5c:
            r6 = 0
            return r6
        L5e:
            return r4
    }
}

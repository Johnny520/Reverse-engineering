package defpackage;

/* JADX INFO: renamed from: ᛴᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0671 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0671 f3247 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0671 f3248 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1072 f3249;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1516 f3250;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f3251;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1516 f3252;

    static {
            ᛴᛵᛱ r0 = new ᛴᛵᛱ
            r1 = 0
            r0.<init>(r1)
            defpackage.C0671.f3247 = r0
            ᛴᛵᛱ r0 = new ᛴᛵᛱ
            r1 = 2
            r0.<init>(r1)
            defpackage.C0671.f3248 = r0
            return
    }

    public C0671(int r2) {
            r1 = this;
            r1.<init>()
            r2 = r2 & 2
            r0 = 0
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = r0
        Lb:
            r1.f3251 = r0
            ᲀᛴᛱᛱ r0 = defpackage.AbstractC1849.f8082
            r1.f3250 = r0
            r1.f3252 = r0
            if (r2 == 0) goto L1a
            ᛷᲈᲀ r2 = defpackage.AbstractC1849.f8080
            r1.f3249 = r2
            return
        L1a:
            ᲀᛴᛱᛱ r2 = defpackage.AbstractC1849.f8081
            r1.f3249 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1517(java.lang.String r3, java.lang.StringBuilder r4) {
            r2 = this;
            ᛸᛶᛸᲁ r0 = r2.f3250
            boolean r0 = r0.mo2570(r3)
            if (r0 != 0) goto Lc
            r4.append(r3)
            return
        Lc:
            r0 = 34
            r4.append(r0)
            ᛴᛵᛱ r1 = defpackage.AbstractC2325.f9838
            if (r3 != 0) goto L16
            goto L1b
        L16:
            ᛶᛵᛴᲈ r2 = r2.f3249
            r2.mo2041(r3, r4)
        L1b:
            r4.append(r0)
            return
    }
}

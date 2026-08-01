package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0451 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C1884 f2218;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f2219;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f2220;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.String f2221;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f2222;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1884 f2223;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.util.Iterator f2224;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f2225;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C1419 f2226;

    public C0451(defpackage.C1884 r1, java.lang.String r2, java.lang.String r3, defpackage.InterfaceC0140 r4) {
            r0 = this;
            r0.f2223 = r1
            r0.f2225 = r2
            r0.f2222 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛳᛴᛳᲀ r0 = (defpackage.C0451) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            ᛳᛴᛳᲀ r4 = new ᛳᛴᛳᲀ
            java.lang.String r0 = r2.f2225
            java.lang.String r1 = r2.f2222
            ᲁᛷᛵ r2 = r2.f2223
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f2220
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            r2 = 1
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r0 == 0) goto L66
            if (r0 == r2) goto L62
            r2 = 2
            if (r0 != r2) goto L54
            int r0 = r10.f2219
            java.util.Iterator r4 = r10.f2224
            java.lang.String r5 = r10.f2221
            ᲁᛷᛵ r6 = r10.f2218
            ᛸᛱᛴᲁ r7 = r10.f2226
            defpackage.AbstractC0762.m1680(r11)
        L1b:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L78
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Object r9 = r7.f6211
            java.lang.String r9 = (java.lang.String) r9
            r8.append(r9)
            r9 = 47
            r8.append(r9)
            r8.append(r11)
            java.lang.String r11 = r8.toString()
            r7.f6211 = r11
            r10.f2226 = r7
            r10.f2218 = r6
            r10.f2221 = r5
            r10.f2224 = r4
            r10.f2219 = r0
            r10.f2220 = r2
            java.lang.Object r11 = r6.m3301(r11, r5, r10)
            if (r11 != r3) goto L1b
            goto L77
        L54:
            r10 = -438108423626286(0xfffe718aef0961d2, double:NaN)
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            r10 = 0
            return r10
        L62:
            defpackage.AbstractC0762.m1680(r11)
            return r1
        L66:
            defpackage.AbstractC0762.m1680(r11)
            r10.f2220 = r2
            ᲁᛷᛵ r11 = r10.f2223
            java.lang.String r0 = r10.f2225
            java.lang.String r2 = r10.f2222
            java.lang.Object r10 = r11.m3301(r0, r2, r10)
            if (r10 != r3) goto L78
        L77:
            return r3
        L78:
            return r1
    }
}

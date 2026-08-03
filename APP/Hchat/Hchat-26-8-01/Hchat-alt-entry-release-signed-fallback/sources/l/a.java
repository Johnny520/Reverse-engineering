package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.v {
    @Override // fg.v
    public final java.lang.Object a(java.lang.Object r9, java.lang.Boolean r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, i0.h0 r14, java.lang.Integer r15) {
            r8 = this;
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r10.booleanValue()
            r2 = r11
            l.d r2 = (l.d) r2
            r4 = r12
            fg.q r4 = (fg.q) r4
            r5 = r13
            fg.a r5 = (fg.a) r5
            int r9 = r15.intValue()
            r10 = r9 & 6
            y0.l r3 = y0.l.f21818a
            if (r10 != 0) goto L25
            boolean r10 = r14.f(r3)
            if (r10 == 0) goto L22
            r10 = 4
            goto L23
        L22:
            r10 = 2
        L23:
            r10 = r10 | r9
            goto L26
        L25:
            r10 = r9
        L26:
            r11 = r9 & 48
            if (r11 != 0) goto L36
            boolean r11 = r14.f(r0)
            if (r11 == 0) goto L33
            r11 = 32
            goto L35
        L33:
            r11 = 16
        L35:
            r10 = r10 | r11
        L36:
            r11 = r9 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L46
            boolean r11 = r14.g(r1)
            if (r11 == 0) goto L43
            r11 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r11 = 128(0x80, float:1.8E-43)
        L45:
            r10 = r10 | r11
        L46:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L56
            boolean r11 = r14.f(r2)
            if (r11 == 0) goto L53
            r11 = 2048(0x800, float:2.87E-42)
            goto L55
        L53:
            r11 = 1024(0x400, float:1.435E-42)
        L55:
            r10 = r10 | r11
        L56:
            r11 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L66
            boolean r11 = r14.h(r4)
            if (r11 == 0) goto L63
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L65
        L63:
            r11 = 8192(0x2000, float:1.148E-41)
        L65:
            r10 = r10 | r11
        L66:
            r11 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L77
            boolean r9 = r14.h(r5)
            if (r9 == 0) goto L74
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L76
        L74:
            r9 = 65536(0x10000, float:9.1835E-41)
        L76:
            r10 = r10 | r9
        L77:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r10
            r11 = 599186(0x92492, float:8.39638E-40)
            if (r9 == r11) goto L82
            r9 = 1
            goto L83
        L82:
            r9 = 0
        L83:
            r11 = r10 & 1
            boolean r9 = r14.S(r11, r9)
            if (r9 == 0) goto La3
            int r9 = r10 >> 3
            r9 = r9 & 1022(0x3fe, float:1.432E-42)
            int r11 = r10 << 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r9 = r9 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r7 = r9 | r10
            r6 = r14
            l.i.c(r0, r1, r2, r3, r4, r5, r6, r7)
            goto La7
        La3:
            r6 = r14
            r6.V()
        La7:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}

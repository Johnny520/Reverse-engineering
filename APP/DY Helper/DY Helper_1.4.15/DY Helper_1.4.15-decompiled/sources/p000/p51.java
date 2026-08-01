package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p51 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.p51 f8427 = null;

    static {
            p51 r0 = new p51
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            p000.p51.f8427 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r7, p000.InterfaceC0676p6 r8, p000.rw1 r9, p000.en1 r10, p000.r71 r11) {
            r6 = this;
            r6 = 0
            java.lang.Object r10 = r7.m2056(r6)
            zm0 r10 = (p000.zm0) r10
            r11 = 1
            java.lang.Object r7 = r7.m2056(r11)
            q80 r7 = (p000.q80) r7
            int r7 = r9.m5153(r7)
            int r0 = r9.f9557
            java.lang.String r1 = "Check failed"
            if (r0 >= r7) goto L19
            goto L1c
        L19:
            p000.AbstractC0804sn.m5526(r1)
        L1c:
            p000.pd2.m4463(r9, r8, r7)
            int r0 = r9.f9557
            int r2 = r9.f9559
        L23:
            if (r2 < 0) goto L32
            boolean r3 = r9.m5129(r2)
            if (r3 != 0) goto L32
            int[] r3 = r9.f9539
            int r2 = r9.m5134(r2, r3)
            goto L23
        L32:
            int r2 = r2 + r11
            r3 = r6
        L34:
            if (r2 >= r0) goto L65
            boolean r4 = r9.m5171(r0, r2)
            if (r4 == 0) goto L46
            boolean r4 = r9.m5129(r2)
            if (r4 == 0) goto L43
            r3 = r6
        L43:
            int r2 = r2 + 1
            goto L34
        L46:
            boolean r4 = r9.m5129(r2)
            if (r4 == 0) goto L4e
            r4 = r11
            goto L5e
        L4e:
            int[] r4 = r9.f9539
            int r5 = r9.m5167(r2)
            int r5 = r5 * 5
            int r5 = r5 + 1
            r4 = r4[r5]
            r5 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r5
        L5e:
            int r3 = r3 + r4
            int r4 = r9.m5170(r2)
            int r2 = r2 + r4
            goto L34
        L65:
            int r0 = r9.f9557
            if (r0 >= r7) goto L99
            boolean r0 = r9.m5171(r7, r0)
            if (r0 == 0) goto L93
            int r0 = r9.f9557
            int r2 = r9.f9558
            if (r0 >= r2) goto L8f
            int[] r2 = r9.f9539
            int r0 = r9.m5167(r0)
            int r0 = r0 * 5
            int r0 = r0 + r11
            r0 = r2[r0]
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r2
            if (r0 == 0) goto L8f
            int r0 = r9.f9557
            java.lang.Object r0 = r9.m5133(r0)
            r8.mo3773(r0)
            r3 = r6
        L8f:
            r9.m5145()
            goto L65
        L93:
            int r0 = r9.m5141()
            int r3 = r3 + r0
            goto L65
        L99:
            if (r0 != r7) goto L9c
            goto L9f
        L9c:
            p000.AbstractC0804sn.m5526(r1)
        L9f:
            r10.f13169 = r3
            return
    }
}

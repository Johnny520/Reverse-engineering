package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 {

    /* JADX INFO: renamed from: α */
    public final p000.uk1 f12660;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f12661;

    /* JADX INFO: renamed from: γ */
    public final int f12662;

    /* JADX INFO: renamed from: δ */
    public final p000.C1076zz f12663;

    /* JADX INFO: renamed from: ε */
    public final p000.C0384i5 f12664;

    /* JADX INFO: renamed from: ζ */
    public final int f12665;

    /* JADX INFO: renamed from: η */
    public final int f12666;

    /* JADX INFO: renamed from: θ */
    public final int f12667;

    /* JADX INFO: renamed from: ι */
    public int f12668;

    public yk1(p000.uk1 r1, java.util.ArrayList r2, int r3, p000.C1076zz r4, p000.C0384i5 r5, int r6, int r7, int r8) {
            r0 = this;
            r0.<init>()
            r0.f12660 = r1
            r0.f12661 = r2
            r0.f12662 = r3
            r0.f12663 = r4
            r0.f12664 = r5
            r0.f12665 = r6
            r0.f12666 = r7
            r0.f12667 = r8
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.yk1 m6921(p000.yk1 r9, int r10, p000.C1076zz r11, p000.C0384i5 r12, int r13) {
            r0 = r13 & 1
            if (r0 == 0) goto L6
            int r10 = r9.f12662
        L6:
            r3 = r10
            r10 = r13 & 2
            if (r10 == 0) goto Ld
            zz r11 = r9.f12663
        Ld:
            r4 = r11
            r10 = r13 & 4
            if (r10 == 0) goto L14
            i5 r12 = r9.f12664
        L14:
            r5 = r12
            int r6 = r9.f12665
            int r7 = r9.f12666
            int r8 = r9.f12667
            r5.getClass()
            yk1 r0 = new yk1
            uk1 r1 = r9.f12660
            java.util.ArrayList r2 = r9.f12661
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.zn1 m6922(p000.C0384i5 r11) {
            r10 = this;
            r11.getClass()
            java.util.ArrayList r0 = r10.f12661
            int r1 = r0.size()
            int r2 = r10.f12662
            if (r2 >= r1) goto L9b
            int r1 = r10.f12668
            r3 = 1
            int r1 = r1 + r3
            r10.f12668 = r1
            java.lang.String r1 = " must call proceed() exactly once"
            zz r4 = r10.f12663
            java.lang.String r5 = "network interceptor "
            if (r4 == 0) goto L5b
            java.lang.Object r6 = r4.f13381
            c00 r6 = (p000.c00) r6
            al1 r6 = r6.mo1094()
            java.lang.Object r7 = r11.f4914
            og0 r7 = (p000.og0) r7
            r6.getClass()
            r7.getClass()
            p r6 = r6.f316
            og0 r6 = r6.f8371
            int r8 = r7.f8094
            int r9 = r6.f8094
            if (r8 != r9) goto L50
            java.lang.String r7 = r7.f8093
            java.lang.String r6 = r6.f8093
            boolean r6 = p000.ln0.m3626(r7, r6)
            if (r6 == 0) goto L50
            int r6 = r10.f12668
            if (r6 != r3) goto L46
            goto L5b
        L46:
            int r2 = r2 - r3
            java.lang.Object r10 = r0.get(r2)
            p000.C1080.m7276(r5, r10, r1)
        L4e:
            r10 = 0
            return r10
        L50:
            int r2 = r2 - r3
            java.lang.Object r10 = r0.get(r2)
            java.lang.String r11 = " must retain the same host and port"
            p000.C1080.m7276(r5, r10, r11)
            goto L4e
        L5b:
            int r6 = r2 + 1
            r7 = 0
            r8 = 58
            yk1 r10 = m6921(r10, r6, r7, r11, r8)
            java.lang.Object r11 = r0.get(r2)
            jn0 r11 = (p000.jn0) r11
            zn1 r2 = r11.mo2973(r10)
            if (r2 == 0) goto L82
            if (r4 == 0) goto L81
            int r0 = r0.size()
            if (r6 >= r0) goto L81
            int r10 = r10.f12668
            if (r10 != r3) goto L7d
            goto L81
        L7d:
            p000.C1080.m7276(r5, r11, r1)
            goto L4e
        L81:
            return r2
        L82:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "interceptor "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = " returned null"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L9b:
            java.lang.String r10 = "Check failed."
            p000.C1080.m7279(r10)
            goto L4e
    }
}

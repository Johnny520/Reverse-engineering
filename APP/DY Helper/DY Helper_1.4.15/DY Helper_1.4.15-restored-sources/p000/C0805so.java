package p000;

/* JADX INFO: renamed from: so */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0805so {

    /* JADX INFO: renamed from: α */
    public final p000.AbstractC0432ji f9978;

    /* JADX INFO: renamed from: β */
    public final p000.AbstractC0432ji f9979;

    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0432ji f9980;

    /* JADX INFO: renamed from: δ */
    public final float[] f9981;

    public C0805so(p000.AbstractC0432ji r9, p000.AbstractC0432ji r10, int r11) {
            r8 = this;
            long r0 = r9.f5475
            long r2 = p000.AbstractC0213di.f3165
            boolean r0 = p000.AbstractC0213di.m1746(r0, r2)
            if (r0 == 0) goto Lf
            ji r0 = p000.ln0.m3623(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f5475
            boolean r1 = p000.AbstractC0213di.m1746(r4, r2)
            if (r1 == 0) goto L1d
            ji r1 = p000.ln0.m3623(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            float[] r4 = p000.AbstractC0782s1.f9648
            r5 = 3
            if (r11 != r5) goto L69
            long r6 = r9.f5475
            boolean r11 = p000.AbstractC0213di.m1746(r6, r2)
            long r6 = r10.f5475
            boolean r2 = p000.AbstractC0213di.m1746(r6, r2)
            if (r11 == 0) goto L34
            if (r2 == 0) goto L34
            goto L69
        L34:
            if (r11 != 0) goto L38
            if (r2 == 0) goto L69
        L38:
            if (r11 == 0) goto L3b
            goto L3c
        L3b:
            r9 = r10
        L3c:
            po1 r9 = (p000.po1) r9
            nb2 r9 = r9.f8625
            if (r11 == 0) goto L47
            float[] r11 = r9.m4018()
            goto L48
        L47:
            r11 = r4
        L48:
            if (r2 == 0) goto L4e
            float[] r4 = r9.m4018()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6a
        L69:
            r4 = 0
        L6a:
            r8.<init>(r10, r0, r1, r4)
            return
    }

    public C0805so(p000.AbstractC0432ji r1, p000.AbstractC0432ji r2, p000.AbstractC0432ji r3, float[] r4) {
            r0 = this;
            r0.<init>()
            r0.f9978 = r1
            r0.f9979 = r2
            r0.f9980 = r3
            r0.f9981 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public long mo4939(long r10) {
            r9 = this;
            float r0 = p000.C0114ci.m1197(r10)
            float r1 = p000.C0114ci.m1196(r10)
            float r2 = p000.C0114ci.m1194(r10)
            float r7 = p000.C0114ci.m1193(r10)
            ji r10 = r9.f9979
            long r3 = r10.mo570(r0, r1, r2)
            r11 = 32
            long r5 = r3 >> r11
            int r11 = (int) r5
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10.mo571(r0, r1, r2)
            float[] r0 = r9.f9981
            if (r0 == 0) goto L3e
            r1 = 0
            r1 = r0[r1]
            float r11 = r11 * r1
            r1 = 1
            r1 = r0[r1]
            float r3 = r3 * r1
            r1 = 2
            r0 = r0[r1]
            float r10 = r10 * r0
        L3e:
            r6 = r10
            r4 = r11
            r5 = r3
            ji r3 = r9.f9980
            ji r8 = r9.f9978
            long r9 = r3.mo572(r4, r5, r6, r7, r8)
            return r9
    }
}

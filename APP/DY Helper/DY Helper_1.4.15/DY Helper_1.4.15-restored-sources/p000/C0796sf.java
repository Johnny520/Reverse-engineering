package p000;

/* JADX INFO: renamed from: sf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0796sf {

    /* JADX INFO: renamed from: α */
    public boolean f9879;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f9880;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f9881;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f9882;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f9883;

    /* JADX INFO: renamed from: α */
    public int m5493(p000.C0574n5 r19, androidx.compose.p001ui.platform.AndroidComposeView r20, boolean r21) {
            r18 = this;
            r1 = r18
            java.lang.Object r0 = r1.f9881
            ke0 r0 = (p000.ke0) r0
            java.lang.Object r2 = r1.f9883
            ne0 r2 = (p000.ne0) r2
            boolean r3 = r1.f9879
            r4 = 0
            if (r3 == 0) goto L10
            return r4
        L10:
            r3 = 1
            r1.f9879 = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.f9882     // Catch: java.lang.Throwable -> L3c
            y21 r5 = (p000.y21) r5     // Catch: java.lang.Throwable -> L3c
            r6 = r19
            r7 = r20
            n5 r5 = r5.m6816(r6, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r5.f7387     // Catch: java.lang.Throwable -> L3c
            zv0 r6 = (p000.zv0) r6     // Catch: java.lang.Throwable -> L3c
            int r7 = r6.m7238()     // Catch: java.lang.Throwable -> L3c
            r8 = r4
        L28:
            if (r8 >= r7) goto L41
            java.lang.Object r9 = r6.m7239(r8)     // Catch: java.lang.Throwable -> L3c
            ai1 r9 = (p000.ai1) r9     // Catch: java.lang.Throwable -> L3c
            boolean r10 = r9.f262     // Catch: java.lang.Throwable -> L3c
            if (r10 != 0) goto L3f
            boolean r9 = r9.f266     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L39
            goto L3f
        L39:
            int r8 = r8 + 1
            goto L28
        L3c:
            r0 = move-exception
            goto Lcf
        L3f:
            r7 = r4
            goto L42
        L41:
            r7 = r3
        L42:
            int r8 = r6.m7238()     // Catch: java.lang.Throwable -> L3c
            r9 = r4
        L47:
            if (r9 >= r8) goto L83
            java.lang.Object r10 = r6.m7239(r9)     // Catch: java.lang.Throwable -> L3c
            ai1 r10 = (p000.ai1) r10     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L57
            boolean r11 = p000.j81.m2901(r10)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L80
        L57:
            java.lang.Object r11 = r1.f9880     // Catch: java.lang.Throwable -> L3c
            r12 = r11
            yp0 r12 = (p000.yp0) r12     // Catch: java.lang.Throwable -> L3c
            long r13 = r10.f261     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r11 = r1.f9883     // Catch: java.lang.Throwable -> L3c
            r15 = r11
            ne0 r15 = (p000.ne0) r15     // Catch: java.lang.Throwable -> L3c
            int r11 = r10.f267     // Catch: java.lang.Throwable -> L3c
            r17 = 1
            r16 = r11
            r12.m7010(r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L3c
            v11 r11 = r2.f7580     // Catch: java.lang.Throwable -> L3c
            boolean r11 = r11.m6022()     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L80
            long r11 = r10.f259     // Catch: java.lang.Throwable -> L3c
            boolean r10 = p000.j81.m2901(r10)     // Catch: java.lang.Throwable -> L3c
            r0.m3206(r11, r2, r10)     // Catch: java.lang.Throwable -> L3c
            r2.clear()     // Catch: java.lang.Throwable -> L3c
        L80:
            int r9 = r9 + 1
            goto L47
        L83:
            r2 = r21
            boolean r0 = r0.m3207(r5, r2)     // Catch: java.lang.Throwable -> L3c
            int r2 = r6.m7238()     // Catch: java.lang.Throwable -> L3c
            r5 = r4
        L8e:
            if (r5 >= r2) goto Lad
            java.lang.Object r7 = r6.m7239(r5)     // Catch: java.lang.Throwable -> L3c
            ai1 r7 = (p000.ai1) r7     // Catch: java.lang.Throwable -> L3c
            long r8 = p000.j81.m2884(r7, r3)     // Catch: java.lang.Throwable -> L3c
            r10 = 0
            boolean r8 = p000.o41.m4203(r8, r10)     // Catch: java.lang.Throwable -> L3c
            if (r8 != 0) goto Laa
            boolean r7 = r7.m170()     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto Laa
            r2 = r3
            goto Lae
        Laa:
            int r5 = r5 + 1
            goto L8e
        Lad:
            r2 = r4
        Lae:
            int r5 = r6.m7238()     // Catch: java.lang.Throwable -> L3c
            r7 = r4
        Lb3:
            if (r7 >= r5) goto Lc6
            java.lang.Object r8 = r6.m7239(r7)     // Catch: java.lang.Throwable -> L3c
            ai1 r8 = (p000.ai1) r8     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r8.m170()     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto Lc3
            r5 = r3
            goto Lc7
        Lc3:
            int r7 = r7 + 1
            goto Lb3
        Lc6:
            r5 = r4
        Lc7:
            int r2 = r2 << r3
            r0 = r0 | r2
            int r2 = r5 << 2
            r0 = r0 | r2
            r1.f9879 = r4
            return r0
        Lcf:
            r1.f9879 = r4
            throw r0
    }
}

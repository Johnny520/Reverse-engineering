package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 {

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ int f4409 = 0;

    /* JADX INFO: renamed from: α */
    public final boolean f4410;

    /* JADX INFO: renamed from: β */
    public final int f4411;

    /* JADX INFO: renamed from: γ */
    public final int f4412;

    /* JADX INFO: renamed from: δ */
    public final p000.av0 f4413;

    static {
            gl0 r0 = new gl0
            r0.<init>()
            return
    }

    public gl0() {
            r2 = this;
            av0 r0 = p000.av0.f1319
            r2.<init>()
            r1 = 1
            r2.f4410 = r1
            r2.f4411 = r1
            r2.f4412 = r1
            r2.f4413 = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.gl0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            gl0 r3 = (p000.gl0) r3
            boolean r0 = r2.f4410
            boolean r1 = r3.f4410
            if (r0 == r1) goto L11
            goto L2a
        L11:
            int r0 = r2.f4411
            int r1 = r3.f4411
            if (r0 != r1) goto L2a
            int r0 = r2.f4412
            int r1 = r3.f4412
            if (r0 != r1) goto L2a
            av0 r2 = r2.f4413
            av0 r3 = r3.f4413
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L28
            goto L2a
        L28:
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            int r1 = java.lang.Boolean.hashCode(r0)
            r2 = 31
            int r1 = r1 * r2
            int r0 = p000.a12.m14(r0, r1, r2)
            boolean r1 = r3.f4410
            int r0 = p000.lz1.m3678(r0, r2, r1)
            int r1 = r3.f4411
            int r0 = p000.a12.m14(r1, r0, r2)
            int r1 = r3.f4412
            r2 = 961(0x3c1, float:1.347E-42)
            int r0 = p000.a12.m14(r1, r0, r2)
            av0 r3 = r3.f4413
            java.lang.Object r3 = r3.f1320
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImeOptions(singleLine=false, capitalization="
            r0.<init>(r1)
            java.lang.String r1 = "None"
            r0.append(r1)
            java.lang.String r2 = ", autoCorrect="
            r0.append(r2)
            boolean r2 = r13.f4410
            r0.append(r2)
            java.lang.String r2 = ", keyboardType="
            r0.append(r2)
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            java.lang.String r6 = "Invalid"
            r7 = 3
            r8 = 2
            r9 = 1
            java.lang.String r10 = "Unspecified"
            int r11 = r13.f4411
            if (r11 != 0) goto L2c
            r11 = r10
            goto L5e
        L2c:
            if (r11 != r9) goto L31
            java.lang.String r11 = "Text"
            goto L5e
        L31:
            if (r11 != r8) goto L36
            java.lang.String r11 = "Ascii"
            goto L5e
        L36:
            if (r11 != r7) goto L3b
            java.lang.String r11 = "Number"
            goto L5e
        L3b:
            if (r11 != r5) goto L40
            java.lang.String r11 = "Phone"
            goto L5e
        L40:
            if (r11 != r4) goto L45
            java.lang.String r11 = "Uri"
            goto L5e
        L45:
            if (r11 != r3) goto L4a
            java.lang.String r11 = "Email"
            goto L5e
        L4a:
            if (r11 != r2) goto L4f
            java.lang.String r11 = "Password"
            goto L5e
        L4f:
            r12 = 8
            if (r11 != r12) goto L56
            java.lang.String r11 = "NumberPassword"
            goto L5e
        L56:
            r12 = 9
            if (r11 != r12) goto L5d
            java.lang.String r11 = "Decimal"
            goto L5e
        L5d:
            r11 = r6
        L5e:
            r0.append(r11)
            java.lang.String r11 = ", imeAction="
            r0.append(r11)
            r11 = -1
            int r12 = r13.f4412
            if (r12 != r11) goto L6d
            r1 = r10
            goto L94
        L6d:
            if (r12 != 0) goto L70
            goto L94
        L70:
            if (r12 != r9) goto L75
            java.lang.String r1 = "Default"
            goto L94
        L75:
            if (r12 != r8) goto L7a
            java.lang.String r1 = "Go"
            goto L94
        L7a:
            if (r12 != r7) goto L7f
            java.lang.String r1 = "Search"
            goto L94
        L7f:
            if (r12 != r5) goto L84
            java.lang.String r1 = "Send"
            goto L94
        L84:
            if (r12 != r4) goto L89
            java.lang.String r1 = "Previous"
            goto L94
        L89:
            if (r12 != r3) goto L8e
            java.lang.String r1 = "Next"
            goto L94
        L8e:
            if (r12 != r2) goto L93
            java.lang.String r1 = "Done"
            goto L94
        L93:
            r1 = r6
        L94:
            r0.append(r1)
            java.lang.String r1 = ", platformImeOptions=null, hintLocales="
            r0.append(r1)
            av0 r13 = r13.f4413
            r0.append(r13)
            r13 = 41
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            return r13
    }
}

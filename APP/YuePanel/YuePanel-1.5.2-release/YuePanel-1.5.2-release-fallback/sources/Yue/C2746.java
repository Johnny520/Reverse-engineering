package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2746 extends Yue.C2104 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Yue.C2108 f9023;

    public C2746(Yue.C6104 r1, java.lang.String r2, Yue.C0648 r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            Yue.ۥ۠۠ۥۧ r1 = new Yue.ۥ۠۠ۥۧ
            r1.<init>()
            r0.f9023 = r1
            return
    }

    @Override // Yue.C2104, Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۠ۢۦۥ r0 = r1.m12034()
            return r0
    }

    @Override // Yue.C2104, Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo5129() {
            r1 = this;
            Yue.ۥ۠ۢۦۥ r0 = r1.m12034()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void mo12032(Yue.AbstractC4398 r2) {
            r1 = this;
            super.mo12032(r2)
            Yue.ۥ۠۠ۥۧ r0 = r1.f9023
            r0.remove(r2)
            return
    }

    @Override // Yue.C2104
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public /* bridge */ /* synthetic */ Yue.C2104 mo8938() {
            r1 = this;
            Yue.ۥ۠ۢۦۥ r0 = r1.m12034()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public Yue.C2746 m12033(Yue.C2104 r2) {
            r1 = this;
            Yue.ۥ۠۠ۥۧ r0 = r1.f9023
            r0.add(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public Yue.C2746 m12034() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = super.mo8938()
            Yue.ۥ۠ۢۦۥ r0 = (Yue.C2746) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public Yue.C2108 m12035() {
            r1 = this;
            Yue.ۥ۠۠ۥۧ r0 = r1.f9023
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public java.util.List<Yue.InterfaceC1478.InterfaceC1480> m12036() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.ۥ۠۠ۥۧ r1 = r7.f9023
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥۢ۠ۨۡ r3 = r2.m9921()
            boolean r3 = r3.m22905()
            if (r3 != 0) goto L22
            goto Lb
        L22:
            java.lang.String r3 = "disabled"
            boolean r3 = r2.mo14514(r3)
            if (r3 == 0) goto L2b
            goto Lb
        L2b:
            java.lang.String r3 = "name"
            java.lang.String r3 = r2.mo14513(r3)
            int r4 = r3.length()
            if (r4 != 0) goto L38
            goto Lb
        L38:
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.mo14513(r4)
            java.lang.String r5 = "button"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 != 0) goto Lb
            java.lang.String r5 = "image"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L4f
            goto Lb
        L4f:
            java.lang.String r5 = "select"
            boolean r5 = r2.m17282(r5)
            if (r5 == 0) goto L92
            java.lang.String r4 = "option[selected]"
            Yue.ۥ۠۠ۥۧ r4 = r2.m9913(r4)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L62:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠۠ۥۥ r5 = (Yue.C2104) r5
            java.lang.String r5 = r5.m9930()
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r5 = Yue.C3157.C3160.m13376(r3, r5)
            r0.add(r5)
            r5 = 1
            goto L62
        L7b:
            if (r5 != 0) goto Lb
            java.lang.String r4 = "option"
            Yue.ۥ۠۠ۥۥ r2 = r2.m9915(r4)
            if (r2 == 0) goto Lb
            java.lang.String r2 = r2.m9930()
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13376(r3, r2)
            r0.add(r2)
            goto Lb
        L92:
            java.lang.String r5 = "checkbox"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto Lb0
            java.lang.String r5 = "radio"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto La3
            goto Lb0
        La3:
            java.lang.String r2 = r2.m9930()
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13376(r3, r2)
            r0.add(r2)
            goto Lb
        Lb0:
            java.lang.String r4 = "checked"
            boolean r4 = r2.mo14514(r4)
            if (r4 == 0) goto Lb
            java.lang.String r4 = r2.m9930()
            int r4 = r4.length()
            if (r4 <= 0) goto Lc7
            java.lang.String r2 = r2.m9930()
            goto Lc9
        Lc7:
            java.lang.String r2 = "on"
        Lc9:
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13376(r3, r2)
            r0.add(r2)
            goto Lb
        Ld2:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public Yue.InterfaceC1478 m12037() {
            r3 = this;
            java.lang.String r0 = "action"
            boolean r1 = r3.mo14514(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = r3.mo14512(r0)
            goto L11
        Ld:
            java.lang.String r0 = r3.mo9794()
        L11:
            java.lang.String r1 = "Could not determine a form action URL for submit. Ensure you set a base URI when parsing."
            Yue.C6657.m25633(r0, r1)
            java.lang.String r1 = "method"
            java.lang.String r1 = r3.mo14513(r1)
            java.lang.String r2 = "POST"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L27
            Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = Yue.InterfaceC1478.EnumC1481.f4624
            goto L29
        L27:
            Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = Yue.InterfaceC1478.EnumC1481.f4623
        L29:
            Yue.ۥ۠۟ۧۥ r2 = r3.m17287()
            if (r2 == 0) goto L38
            Yue.ۥ۟ۦۧۤ r2 = r2.m8945()
            Yue.ۥ۟ۦۧۤ r2 = r2.mo7240()
            goto L3c
        L38:
            Yue.ۥ۟ۦۧۤ r2 = Yue.C3410.m14175()
        L3c:
            Yue.ۥ۟ۦۧۤ r0 = r2.mo7239(r0)
            java.util.List r2 = r3.m12036()
            Yue.ۥ۟ۦۧۤ r0 = r0.mo7236(r2)
            Yue.ۥ۟ۦۧۤ r0 = r0.mo7222(r1)
            return r0
    }
}

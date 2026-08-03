package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1004<T> extends Yue.AbstractC1001<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<Yue.InterfaceC4951<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f2887;

    public C1004(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC4951<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.f2887 = r1
            return
    }

    public /* synthetic */ C1004(Yue.InterfaceC2839 r1, Yue.InterfaceC1632 r2, int r3, Yue.EnumC0847 r4, int r5, Yue.C1769 r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r2 = Yue.C2141.f6728
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            Yue.ۥۣۣ۟ r4 = Yue.EnumC0847.f2389
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m5537(Yue.C1004 r0, Yue.InterfaceC4951 r1, Yue.InterfaceC1598 r2) {
            Yue.ۥۣ۠ۢۢ<Yue.ۥۡۥۡۤ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r0 = r0.f2887
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto Ld
            return r0
        Ld:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "block["
            r0.append(r1)
            Yue.ۥۣ۠ۢۢ<Yue.ۥۡۥۡۤ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.f2887
            r0.append(r1)
            java.lang.String r1 = "] -> "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            java.lang.Object r1 = m5537(r0, r1, r2)
            return r1
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r2 = this;
            Yue.ۥ۟ۤۡۡ r0 = new Yue.ۥ۟ۤۡۡ
            Yue.ۥۣ۠ۢۢ<Yue.ۥۡۥۡۤ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.f2887
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}

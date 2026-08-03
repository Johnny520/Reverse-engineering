package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1853 extends Yue.C1814 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f5704;

    public C1853(Yue.AbstractC7012 r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof Yue.C3078
            if (r1 == 0) goto Lc
            Yue.ۥ۟ۨۨۥ$ۥ r1 = Yue.C1814.EnumC1815.f5572
            r0.f5563 = r1
            goto L10
        Lc:
            Yue.ۥ۟ۨۨۥ$ۥ r1 = Yue.C1814.EnumC1815.f5573
            r0.f5563 = r1
        L10:
            return
    }

    @Override // Yue.C1814
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo8539(int r2) {
            r1 = this;
            boolean r0 = r1.f5568
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f5568 = r0
            r1.f5565 = r2
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            Yue.ۥۣ۟ۨۨ r0 = (Yue.InterfaceC1812) r0
            r0.mo5453(r0)
            goto L10
        L20:
            return
    }
}

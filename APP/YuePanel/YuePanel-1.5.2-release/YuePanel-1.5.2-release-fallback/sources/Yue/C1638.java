package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1638 {
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2310
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <E extends Yue.InterfaceC1632.InterfaceC1635> E m7912(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r2, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof Yue.AbstractC0045
            r1 = 0
            if (r0 == 0) goto L25
            Yue.ۥ۟۟ۡ r3 = (Yue.AbstractC0045) r3
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r2.getKey()
            boolean r0 = r3.m380(r0)
            if (r0 == 0) goto L24
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r3.m381(r2)
            boolean r3 = r2 instanceof Yue.InterfaceC1632.InterfaceC1635
            if (r3 == 0) goto L24
            r1 = r2
        L24:
            return r1
        L25:
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r2.getKey()
            if (r0 != r3) goto L2c
            goto L2d
        L2c:
            r2 = r1
        L2d:
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1632 m7913(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r2 instanceof Yue.AbstractC0045
            if (r0 == 0) goto L23
            Yue.ۥ۟۟ۡ r2 = (Yue.AbstractC0045) r2
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
            boolean r0 = r2.m380(r0)
            if (r0 == 0) goto L22
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r2.m381(r1)
            if (r2 == 0) goto L22
            Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
        L22:
            return r1
        L23:
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
            if (r0 != r2) goto L2b
            Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
        L2b:
            return r1
    }
}

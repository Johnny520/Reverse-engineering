package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public interface InterfaceC2855<T> extends Yue.InterfaceC2464<T> {

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۧ$ۥ, reason: contains not printable characters */
    public static final class C2856 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.InterfaceC2464 m12300(Yue.InterfaceC2855 r0, Yue.InterfaceC1632 r1, int r2, Yue.EnumC0847 r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L18
                r5 = r4 & 1
                if (r5 == 0) goto L8
                Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
            L8:
                r5 = r4 & 2
                if (r5 == 0) goto Ld
                r2 = -3
            Ld:
                r4 = r4 & 4
                if (r4 == 0) goto L13
                Yue.ۥۣۣ۟ r3 = Yue.EnumC0847.f2389
            L13:
                Yue.ۥۣ۠ۢۡ r0 = r0.mo5533(r1, r2, r3)
                return r0
            L18:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: fuse"
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ */
    Yue.InterfaceC2464<T> mo5533(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3);
}

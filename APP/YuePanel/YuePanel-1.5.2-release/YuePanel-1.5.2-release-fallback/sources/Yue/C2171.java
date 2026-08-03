package Yue;

import java.lang.Enum;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2171<E extends java.lang.Enum<E>> implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2171.C2172 f6782 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f6783 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<E> f6784;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۟$ۥ, reason: contains not printable characters */
    public static final class C2172 {
        public C2172() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C2172(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠ۡ۠۟$ۥ r0 = new Yue.ۥ۠ۡ۠۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C2171.f6782 = r0
            return
    }

    public C2171(@Yue.InterfaceC4418 E[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            Yue.C3329.m13903(r2)
            r1.f6784 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m10159() {
            r2 = this;
            java.lang.Class<E extends java.lang.Enum<E>> r0 = r2.f6784
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.String r1 = "c.enumConstants"
            Yue.C3329.m13905(r0, r1)
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            Yue.ۥ۠ۡ۟ۧ r0 = Yue.C2169.m10153(r0)
            return r0
    }
}

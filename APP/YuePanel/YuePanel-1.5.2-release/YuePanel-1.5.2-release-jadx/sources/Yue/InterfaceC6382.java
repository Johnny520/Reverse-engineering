package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6382 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۥ$ۥ */
    public enum EnumC0967 {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    /* JADX INFO: renamed from: ۥ */
    EnumC0967 mo1559(AbstractC6381 abstractC6381, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    default EnumC0967 m2831(AbstractC6381 abstractC6381, int i) {
        return EnumC0967.CONTINUE;
    }
}

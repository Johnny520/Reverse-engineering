package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
public interface InterfaceC7813 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۦ$ۥ */
    public static final class C1367 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3909(@InterfaceC6399 InterfaceC7813 interfaceC7813) {
            return C4555.m13439(interfaceC7813.mo5784());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m3910(@InterfaceC6399 InterfaceC7813 interfaceC7813) {
            return !C4555.m13439(interfaceC7813.mo5784());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static InterfaceC7813 m24779(@InterfaceC6399 InterfaceC7813 interfaceC7813, long j) {
            return interfaceC7813.mo5783(C4555.m13459(j));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC7813 m24780(@InterfaceC6399 InterfaceC7813 interfaceC7813, long j) {
            return new C3176(interfaceC7813, j, null);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    boolean mo46();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    InterfaceC7813 mo47(long j);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    InterfaceC7813 mo5783(long j);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    long mo5784();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    boolean mo5785();
}

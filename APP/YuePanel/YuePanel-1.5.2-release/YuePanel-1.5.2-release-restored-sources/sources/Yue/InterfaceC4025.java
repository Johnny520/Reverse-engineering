package Yue;

import Yue.InterfaceC7813;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
public interface InterfaceC4025 extends InterfaceC7813, Comparable<InterfaceC4025> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡۦ$ۥ */
    public static final class C0310 {
        /* JADX INFO: renamed from: ۥ */
        public static int m985(@InterfaceC6399 InterfaceC4025 interfaceC4025, @InterfaceC6399 InterfaceC4025 interfaceC40252) {
            C5499.m17103(interfaceC40252, "other");
            return C4555.m13394(interfaceC4025.mo5786(interfaceC40252), C4555.f9803.m13508());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m986(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            return InterfaceC7813.C1367.m3909(interfaceC4025);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m11378(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            return InterfaceC7813.C1367.m3910(interfaceC4025);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC4025 m11379(@InterfaceC6399 InterfaceC4025 interfaceC4025, long j) {
            return interfaceC4025.mo5783(C4555.m13459(j));
        }
    }

    boolean equals(@InterfaceC6489 Object obj);

    int hashCode();

    @Override // Yue.InterfaceC7813
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    InterfaceC4025 mo47(long j);

    @Override // Yue.InterfaceC7813
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    InterfaceC4025 mo5783(long j);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    long mo5786(@InterfaceC6399 InterfaceC4025 interfaceC4025);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    int mo5787(@InterfaceC6399 InterfaceC4025 interfaceC4025);
}

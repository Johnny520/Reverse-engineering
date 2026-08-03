package Yue;

import Yue.InterfaceC7814;

/* JADX INFO: renamed from: Yue.ۥۡۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public final class C6267 implements InterfaceC7814.InterfaceC7816 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C6267 f1955 = new C6267();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f15468 = System.nanoTime();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private final long m19292() {
        return System.nanoTime() - f15468;
    }

    @InterfaceC6399
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC7814.InterfaceC7816, Yue.InterfaceC7814
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ InterfaceC4025 mo44() {
        return InterfaceC7814.C1369.C7815.m24781(m19295());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final long m2734(long j, long j2) {
        return InterfaceC7814.C1369.C7815.m24784(C5884.m18204(j, EnumC4559.f9810, j2));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m19293(long j, long j2) {
        return C5884.m18208(j, j2, EnumC4559.f9810);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long m19294(long j) {
        return C5884.m18206(m19292(), j, EnumC4559.f9810);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long m19295() {
        return InterfaceC7814.C1369.C7815.m24784(m19292());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC7814
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ InterfaceC7813 mo44() {
        return InterfaceC7814.C1369.C7815.m24781(m19295());
    }
}

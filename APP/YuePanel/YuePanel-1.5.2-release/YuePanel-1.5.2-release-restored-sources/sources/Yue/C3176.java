package Yue;

import Yue.InterfaceC7813;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3176 implements InterfaceC7813 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7813 f4757;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f4758;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۣۢۡۦ), (r2v0 long) A[MD:(Yue.ۥۣۢۡۦ, long):void (m)] (LINE:1) call: Yue.ۥ۟۠ۢ۟.<init>(Yue.ۥۣۢۡۦ, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3176(InterfaceC7813 interfaceC7813, long j, C4335 c4335) {
        this(interfaceC7813, j);
    }

    @Override // Yue.InterfaceC7813
    /* JADX INFO: renamed from: ۥ */
    public boolean mo46() {
        return InterfaceC7813.C1367.m3910(this);
    }

    @Override // Yue.InterfaceC7813
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7813 mo47(long j) {
        return InterfaceC7813.C1367.m24779(this, j);
    }

    @Override // Yue.InterfaceC7813
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC7813 mo5783(long j) {
        return new C3176(this.f4757, C4555.m13442(this.f4758, j), null);
    }

    @Override // Yue.InterfaceC7813
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public long mo5784() {
        return C4555.m13441(this.f4757.mo5784(), this.f4758);
    }

    @Override // Yue.InterfaceC7813
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo5785() {
        return InterfaceC7813.C1367.m3909(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m6515() {
        return this.f4758;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC7813 m6516() {
        return this.f4757;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3176(InterfaceC7813 interfaceC7813, long j) {
        C5499.m17103(interfaceC7813, "mark");
        this.f4757 = interfaceC7813;
        this.f4758 = j;
    }
}

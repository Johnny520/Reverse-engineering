package p215oc;

/* JADX INFO: renamed from: oc.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5726u extends InterfaceC5717l {
    /* JADX INFO: renamed from: p */
    static /* synthetic */ void m23180p(InterfaceC5726u interfaceC5726u, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: write");
            return;
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        interfaceC5726u.write(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: I */
    void mo23099I(byte b10);

    /* JADX INFO: renamed from: Y */
    void mo23101Y(InterfaceC5718m interfaceC5718m, long j10);

    /* JADX INFO: renamed from: b */
    C5708d mo23102b();

    /* JADX INFO: renamed from: p0 */
    void mo23118p0();

    /* JADX INFO: renamed from: s0 */
    long mo23120s0(InterfaceC5718m interfaceC5718m);

    /* JADX INFO: renamed from: v */
    void mo23122v(short s10);

    void write(byte[] bArr, int i10, int i11);
}

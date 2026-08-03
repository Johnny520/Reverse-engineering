package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8050 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m4071(int i, InterfaceC5124<? super Integer, C8048> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = interfaceC5124.invoke(Integer.valueOf(i2)).m26245();
        }
        return C8049.m26247(bArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final byte[] m4072(byte... bArr) {
        C5499.m17103(bArr, "elements");
        return bArr;
    }
}

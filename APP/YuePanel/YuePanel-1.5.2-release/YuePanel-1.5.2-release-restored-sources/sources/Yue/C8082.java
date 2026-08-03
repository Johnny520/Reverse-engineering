package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8082 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final short[] m4119(int i, InterfaceC5124<? super Integer, C8080> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = interfaceC5124.invoke(Integer.valueOf(i2)).m26642();
        }
        return C8081.m26644(sArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final short[] m4120(short... sArr) {
        C5499.m17103(sArr, "elements");
        return sArr;
    }
}

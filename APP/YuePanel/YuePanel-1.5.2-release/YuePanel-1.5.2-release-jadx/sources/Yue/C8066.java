package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8066 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final long[] m4096(int i, InterfaceC5124<? super Integer, C8064> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = interfaceC5124.invoke(Integer.valueOf(i2)).m26462();
        }
        return C8065.m26464(jArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final long[] m4097(long... jArr) {
        C5499.m17103(jArr, "elements");
        return jArr;
    }
}

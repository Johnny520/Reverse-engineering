package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8059 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final int[] m4085(int i, InterfaceC5124<? super Integer, C8057> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = interfaceC5124.invoke(Integer.valueOf(i2)).m26372();
        }
        return C8058.m26374(iArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int[] m4086(int... iArr) {
        C5499.m17103(iArr, "elements");
        return iArr;
    }
}

package defpackage;

import nuke.data.cipher.NativeCrypto;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kf(String str, int i) {
        this.h = i;
        this.i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        String str = this.i;
        switch (i) {
            case 0:
                return op0.u(str);
            case 1:
                return NativeCrypto.nativeConfKeyName(str);
            case 2:
                return NativeCrypto.nativeConfDecrypt(str);
            default:
                return NativeCrypto.nativeConfEncrypt(str);
        }
    }
}

package p000;

import nuke.data.cipher.NativeCrypto;

/* JADX INFO: renamed from: kf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0385kf implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5482h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f5483i;

    public /* synthetic */ C0385kf(String str, int i) {
        this.f5482h = i;
        this.f5483i = str;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f5482h;
        String str = this.f5483i;
        switch (i) {
            case 0:
                return op0.m3598u(str);
            case 1:
                return NativeCrypto.nativeConfKeyName(str);
            case 2:
                return NativeCrypto.nativeConfDecrypt(str);
            default:
                return NativeCrypto.nativeConfEncrypt(str);
        }
    }
}

package p050I3;

import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;
import p095T.AbstractC1385s;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: I3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0802b implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2579d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f2580e;

    public /* synthetic */ C0802b(String str, int i5) {
        this.f2579d = i5;
        this.f2580e = str;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2579d) {
            case 0:
                return NativeCrypto.m6456(this.f2580e);
            case BuildConfig.VERSION_CODE /* 1 */:
                return NativeCrypto.m6450(this.f2580e);
            case 2:
                return NativeCrypto.m6451(this.f2580e);
            case 3:
                return NativeCrypto.m6452(this.f2580e);
            default:
                return AbstractC1385s.m2629s(this.f2580e);
        }
    }
}

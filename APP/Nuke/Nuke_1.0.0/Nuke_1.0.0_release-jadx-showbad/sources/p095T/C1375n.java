package p095T;

import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: T.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1375n implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4843d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1383r f4844e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1375n(C1383r c1383r, int i5) {
        this.f4843d = i5;
        this.f4844e = c1383r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f4843d) {
            case 0:
                throw null;
            case BuildConfig.VERSION_CODE /* 1 */:
                return this.f4844e.m2594m();
            default:
                return this.f4844e.m2594m();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1375n(C1383r c1383r, AbstractC1346X abstractC1346X) {
        this.f4843d = 0;
        this.f4844e = c1383r;
    }
}

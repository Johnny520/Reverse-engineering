package p027E4;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: E4.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0335v implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1061d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0318e f1062e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0335v(InterfaceC0318e interfaceC0318e, int i5) {
        this.f1061d = i5;
        this.f1062e = interfaceC0318e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1061d) {
            case 0:
                this.f1062e.cancel();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f1062e.cancel();
                break;
            default:
                this.f1062e.cancel();
                break;
        }
        return C0891q.f2780a;
    }
}

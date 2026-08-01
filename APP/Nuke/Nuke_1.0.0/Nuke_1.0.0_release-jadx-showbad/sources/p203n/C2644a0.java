package p203n;

import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: n.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2644a0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8420d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2642Z f8421e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2644a0(C2642Z c2642z, int i5) {
        this.f8420d = i5;
        this.f8421e = c2642z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f8420d) {
            case 0:
                return new C2646b0(this.f8421e, 0);
            default:
                return new C2646b0(this.f8421e, 1);
        }
    }
}

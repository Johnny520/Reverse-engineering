package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0500n6 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4185h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0500n6(int i, InterfaceC0322ik interfaceC0322ik, int i2) {
        super(i, interfaceC0322ik);
        this.f4185h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        switch (this.f4185h) {
            case 0:
                return new C0500n6(2, interfaceC0322ik, 0);
            default:
                return new C0500n6(2, interfaceC0322ik, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4185h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0500n6) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                ((C0500n6) mo15g((ny0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
                return na1Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        switch (this.f4185h) {
            case 0:
                w60.m4891M(obj);
                return Choreographer.getInstance();
            default:
                w60.m4891M(obj);
                return na1.f4229a;
        }
    }
}

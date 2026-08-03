package p358y2;

import android.os.Handler;
import android.os.Looper;
import gg.AbstractC1417m;
import p015b0.RunnableC0133c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p293u2.C4242l;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: y2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5975j extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24280g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5989x f24281h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5975j(C5989x c5989x, int i9) {
        super(1);
        this.f24280g = i9;
        this.f24281h = c5989x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f24280g) {
            case 0:
                InterfaceC4428t interfaceC4428tMo8863b0 = ((InterfaceC4428t) obj).mo8863b0();
                interfaceC4428tMo8863b0.getClass();
                this.f24281h.m10728q(interfaceC4428tMo8863b0);
                break;
            case 1:
                C4242l c4242l = new C4242l(((C4242l) obj).f13918a);
                C5989x c5989x = this.f24281h;
                c5989x.m11097setPopupContentSizefhxjrPA(c4242l);
                c5989x.m10729r();
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                C5989x c5989x2 = this.f24281h;
                Handler handler = c5989x2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1220a.invoke();
                } else {
                    Handler handler2 = c5989x2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0133c(interfaceC1220a, 8));
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}

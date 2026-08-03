package p354xh;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2677y2;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p332wb.C5086lp;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xh.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5822g implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1809a1 f23660b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5822g(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f23659a = i9;
        this.f23660b = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f23659a) {
            case 0:
                Object objM6119d = AbstractC2677y2.m6119d(interfaceC3918x, null, new C5086lp(this.f23660b, 27), interfaceC5557c, 7);
                if (objM6119d != EnumC5799a.f23547g) {
                    break;
                }
                break;
            default:
                Object objM6119d2 = AbstractC2677y2.m6119d(interfaceC3918x, null, new C5829n(this.f23660b, 1), interfaceC5557c, 7);
                if (objM6119d2 != EnumC5799a.f23547g) {
                    break;
                }
                break;
        }
        return C3967n.f12976a;
    }
}

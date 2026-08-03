package p332wb;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p049d9.C0750k;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p174m.AbstractC2677y2;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.bu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4764bu implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f16167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3955b f16168c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4764bu(int i9, InterfaceC3955b interfaceC3955b, boolean z9) {
        this.f16166a = i9;
        this.f16167b = z9;
        this.f16168c = interfaceC3955b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f16166a) {
            case 0:
                return !this.f16167b ? C3967n.f12976a : AbstractC0000a.m78n(interfaceC3918x, new C0750k((InterfaceC1220a) this.f16168c, (InterfaceC5557c) null, 6), interfaceC5557c);
            default:
                return !this.f16167b ? C3967n.f12976a : AbstractC2677y2.m6119d(interfaceC3918x, null, new C5068l7((InterfaceC1231l) this.f16168c, interfaceC3918x), interfaceC5557c, 7);
        }
    }
}

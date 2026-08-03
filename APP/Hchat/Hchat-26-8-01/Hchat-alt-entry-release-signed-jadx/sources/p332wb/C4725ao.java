package p332wb;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p267s1.InterfaceC3918x;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.ao */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4725ao implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1231l f15848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4767c0 f15849c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4725ao(InterfaceC1231l interfaceC1231l, C4767c0 c4767c0, int i9) {
        this.f15847a = i9;
        this.f15848b = interfaceC1231l;
        this.f15849c = c4767c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f15847a) {
            case 0:
                return AbstractC0000a.m78n(interfaceC3918x, new C5544zn(this.f15848b, this.f15849c, null, 0), interfaceC5557c);
            default:
                return AbstractC0000a.m78n(interfaceC3918x, new C5544zn(this.f15848b, this.f15849c, null, 1), interfaceC5557c);
        }
    }
}

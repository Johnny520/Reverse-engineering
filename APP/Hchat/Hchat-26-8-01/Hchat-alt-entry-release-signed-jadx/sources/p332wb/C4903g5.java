package p332wb;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p267s1.InterfaceC3918x;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.g5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4903g5 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1231l f17331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4837e5 f17332c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4903g5(InterfaceC1231l interfaceC1231l, C4837e5 c4837e5, int i9) {
        this.f17330a = i9;
        this.f17331b = interfaceC1231l;
        this.f17332c = c4837e5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f17330a) {
            case 0:
                return AbstractC0000a.m78n(interfaceC3918x, new C4870f5(this.f17331b, this.f17332c, null, 0), interfaceC5557c);
            default:
                return AbstractC0000a.m78n(interfaceC3918x, new C4870f5(this.f17331b, this.f17332c, null, 1), interfaceC5557c);
        }
    }
}

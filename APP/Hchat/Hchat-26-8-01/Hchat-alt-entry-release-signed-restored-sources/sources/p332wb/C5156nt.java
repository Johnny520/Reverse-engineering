package p332wb;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p267s1.InterfaceC3918x;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.nt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5156nt implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f19298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1220a f19299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1220a f19300c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1809a1 f19301d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5156nt(float f3, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a1) {
        this.f19298a = f3;
        this.f19299b = interfaceC1220a;
        this.f19300c = interfaceC1220a2;
        this.f19301d = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        return AbstractC0000a.m78n(interfaceC3918x, new C5123mt(this.f19298a, this.f19299b, this.f19300c, this.f19301d, null), interfaceC5557c);
    }
}

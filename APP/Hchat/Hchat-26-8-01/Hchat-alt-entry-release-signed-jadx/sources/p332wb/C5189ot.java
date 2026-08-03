package p332wb;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p036c9.C0479q0;
import p036c9.C0497w0;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2615j0;
import p174m.C2602g0;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.ot */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5189ot implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1809a1 f19518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1809a1 f19519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1809a1 f19520c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC4233c f19521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1809a1 f19522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1809a1 f19523f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5189ot(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC4233c interfaceC4233c, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f19518a = interfaceC1809a1;
        this.f19519b = interfaceC1809a12;
        this.f19520c = interfaceC1809a13;
        this.f19521d = interfaceC4233c;
        this.f19522e = interfaceC1809a14;
        this.f19523f = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        InterfaceC1809a1 interfaceC1809a1 = this.f19518a;
        InterfaceC1809a1 interfaceC1809a12 = this.f19519b;
        InterfaceC1809a1 interfaceC1809a13 = this.f19520c;
        C4714ad c4714ad = new C4714ad(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, 9);
        C0497w0 c0497w0 = new C0497w0(interfaceC1809a12, interfaceC1809a1, interfaceC1809a13, 4);
        C0497w0 c0497w02 = new C0497w0(interfaceC1809a12, interfaceC1809a1, interfaceC1809a13, 5);
        C0479q0 c0479q0 = new C0479q0(this.f19521d, interfaceC1809a1, this.f19522e, this.f19523f, 28);
        float f3 = AbstractC2615j0.f8497a;
        Object objM78n = AbstractC0000a.m78n(interfaceC3918x, new C2602g0(c4714ad, c0497w0, c0497w02, c0479q0, null), interfaceC5557c);
        return objM78n == EnumC5799a.f23547g ? objM78n : C3967n.f12976a;
    }
}

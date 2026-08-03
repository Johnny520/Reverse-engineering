package sh;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p172lg.C2561a;
import p267s1.C3906l0;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3996c1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1854l2 f13077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2561a f13078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f13079c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1809a1 f13080d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1809a1 f13081e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1809a1 f13082f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3996c1(InterfaceC1854l2 interfaceC1854l2, C2561a c2561a, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f13077a = interfaceC1854l2;
        this.f13078b = c2561a;
        this.f13079c = z9;
        this.f13080d = interfaceC1809a1;
        this.f13081e = interfaceC1809a12;
        this.f13082f = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        Object objM8105k1 = ((C3906l0) interfaceC3918x).m8105k1(new C3992b1(this.f13077a, this.f13078b, this.f13079c, this.f13080d, this.f13081e, this.f13082f, null), interfaceC5557c);
        return objM8105k1 == EnumC5799a.f23547g ? objM8105k1 : C3967n.f12976a;
    }
}

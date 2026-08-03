package p321w;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p000a.AbstractC0000a;
import p049d9.C0750k;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p100h0.C1511d1;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2677y2;
import p249qg.AbstractC3603v;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p332wb.C4922go;
import p332wb.EnumC5329t4;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4628q implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15323c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4628q(InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a) {
        this.f15321a = 3;
        this.f15323c = interfaceC1231l;
        this.f15322b = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f15321a) {
            case 0:
                Object objM6119d = AbstractC2677y2.m6119d(interfaceC3918x, null, new C4622o((InterfaceC1809a1) this.f15322b, (InterfaceC1231l) this.f15323c, 1), interfaceC5557c, 7);
                return objM6119d == EnumC5799a.f23547g ? objM6119d : C3967n.f12976a;
            case 1:
                Object objM7551e = AbstractC3603v.m7551e(new C4593e0(interfaceC3918x, (InterfaceC4647y0) this.f15322b, (C1511d1) this.f15323c, null, 0), interfaceC5557c);
                return objM7551e == EnumC5799a.f23547g ? objM7551e : C3967n.f12976a;
            case 2:
                return AbstractC0000a.m78n(interfaceC3918x, new C4922go((EnumC5329t4) this.f15322b, (InterfaceC1231l) this.f15323c, null), interfaceC5557c);
            default:
                return AbstractC0000a.m78n(interfaceC3918x, new C0750k((InterfaceC1231l) this.f15323c, (InterfaceC1220a) this.f15322b, null, 5), interfaceC5557c);
        }
    }

    public /* synthetic */ C4628q(Object obj, int i9, Object obj2) {
        this.f15321a = i9;
        this.f15322b = obj;
        this.f15323c = obj2;
    }
}

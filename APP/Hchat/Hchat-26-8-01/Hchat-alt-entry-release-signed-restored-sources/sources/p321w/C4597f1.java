package p321w;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p015b0.C0146l;
import p070f0.C0970b;
import p085fg.InterfaceC1220a;
import p100h0.C1520g1;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2677y2;
import p174m.C2647r0;
import p174m.C2656t1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p332wb.C5068l7;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4597f1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f15151d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4597f1(Object obj, Object obj2, Object obj3, int i9) {
        this.f15148a = i9;
        this.f15149b = obj;
        this.f15150c = obj2;
        this.f15151d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        int i9 = this.f15148a;
        Object obj = this.f15151d;
        Object obj2 = this.f15150c;
        Object obj3 = this.f15149b;
        switch (i9) {
            case 0:
                C4594e1 c4594e1 = new C4594e1((InterfaceC3599t) obj3, (InterfaceC1809a1) obj2, null);
                C0146l c0146l = new C0146l((InterfaceC1809a1) obj, 15);
                C2647r0 c2647r0 = AbstractC2677y2.f8731a;
                Object objM7551e = AbstractC3603v.m7551e(new C0970b(interfaceC3918x, c4594e1, c0146l, new C2656t1(interfaceC3918x), null, 3), interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM7551e != enumC5799a) {
                    objM7551e = c3967n;
                }
                return objM7551e == enumC5799a ? objM7551e : c3967n;
            default:
                return AbstractC2677y2.m6119d(interfaceC3918x, new C5068l7((InterfaceC4233c) obj3, 18, (InterfaceC1220a) obj2), new C1520g1((InterfaceC1220a) obj, 2), interfaceC5557c, 5);
        }
    }
}

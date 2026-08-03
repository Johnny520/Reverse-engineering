package p187n;

import java.util.ArrayList;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tg.InterfaceC4187e;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2850d implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9242g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f9243h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f9244i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2850d(ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f9242g = i9;
        this.f9243h = arrayList;
        this.f9244i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f9242g) {
            case 0:
                InterfaceC2856j interfaceC2856j = (InterfaceC2856j) obj;
                boolean z9 = interfaceC2856j instanceof C2848b;
                ArrayList arrayList = this.f9243h;
                if (z9) {
                    arrayList.add(interfaceC2856j);
                } else if (interfaceC2856j instanceof C2849c) {
                    arrayList.remove(((C2849c) interfaceC2856j).f9241a);
                } else if (interfaceC2856j instanceof C2847a) {
                    arrayList.remove(((C2847a) interfaceC2856j).f9240a);
                }
                this.f9244i.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC2856j interfaceC2856j2 = (InterfaceC2856j) obj;
                boolean z10 = interfaceC2856j2 instanceof C2854h;
                ArrayList arrayList2 = this.f9243h;
                if (z10) {
                    arrayList2.add(interfaceC2856j2);
                } else if (interfaceC2856j2 instanceof C2855i) {
                    arrayList2.remove(((C2855i) interfaceC2856j2).f9250a);
                }
                this.f9244i.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                InterfaceC2856j interfaceC2856j3 = (InterfaceC2856j) obj;
                boolean z11 = interfaceC2856j3 instanceof C2859m;
                ArrayList arrayList3 = this.f9243h;
                if (z11) {
                    arrayList3.add(interfaceC2856j3);
                } else if (interfaceC2856j3 instanceof C2860n) {
                    arrayList3.remove(((C2860n) interfaceC2856j3).f9253a);
                } else if (interfaceC2856j3 instanceof C2858l) {
                    arrayList3.remove(((C2858l) interfaceC2856j3).f9252a);
                }
                this.f9244i.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return C3967n.f12976a;
    }
}

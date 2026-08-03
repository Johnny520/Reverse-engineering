package p100h0;

import java.util.ArrayList;
import p065eb.C0859c0;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: h0.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1541o0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5140g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f5141h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1541o0(int i9, ArrayList arrayList) {
        this.f5140g = i9;
        this.f5141h = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f5140g) {
            case 0:
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                ArrayList arrayList = this.f5141h;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    abstractC4374a1.m8816A((AbstractC4377b1) arrayList.get(i9), 0, 0, 0.0f);
                }
                return C3967n.f12976a;
            case 1:
                AbstractC4374a1 abstractC4374a12 = (AbstractC4374a1) obj;
                abstractC4374a12.getClass();
                int i10 = 0;
                for (AbstractC4377b1 abstractC4377b1 : this.f5141h) {
                    AbstractC4374a1.m8811E(abstractC4374a12, abstractC4377b1, 0, i10);
                    i10 += abstractC4377b1.f14594h;
                }
                return C3967n.f12976a;
            case 2:
                AbstractC4374a1 abstractC4374a13 = (AbstractC4374a1) obj;
                ArrayList arrayList2 = this.f5141h;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    AbstractC4374a1.m8811E(abstractC4374a13, (AbstractC4377b1) arrayList2.get(i11), 0, 0);
                }
                return C3967n.f12976a;
            default:
                return ((C0859c0) this.f5141h.get(((Integer) obj).intValue())).f2626a;
        }
    }
}

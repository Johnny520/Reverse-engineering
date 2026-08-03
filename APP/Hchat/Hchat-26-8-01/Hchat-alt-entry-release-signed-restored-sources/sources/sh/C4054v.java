package sh;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p100h0.C1548s;
import p117i0.InterfaceC1809a1;
import p119i2.C1935k0;
import p276sf.C3967n;
import p345x8.C5726s;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: sh.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4054v implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13405g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f13406h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f13407i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4054v(int i9, int i10, Object obj) {
        this.f13405g = i10;
        this.f13406h = obj;
        this.f13407i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f13405g) {
            case 0:
                ((InterfaceC1231l) ((InterfaceC1809a1) this.f13406h).getValue()).invoke(Integer.valueOf(this.f13407i));
                return C3967n.f12976a;
            case 1:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f13406h;
                ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                int i9 = this.f13407i;
                arrayListM8409R1.add(i9 - 1, (C5726s) arrayListM8409R1.remove(i9));
                interfaceC1809a1.setValue(arrayListM8409R1);
                return C3967n.f12976a;
            case 2:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f13406h;
                ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a12.getValue());
                int i10 = this.f13407i;
                arrayListM8409R12.add(i10 + 1, (C5726s) arrayListM8409R12.remove(i10));
                interfaceC1809a12.setValue(arrayListM8409R12);
                return C3967n.f12976a;
            case 3:
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f13406h;
                ArrayList arrayListM8409R13 = AbstractC4166m.m8409R1((List) interfaceC1809a13.getValue());
                arrayListM8409R13.remove(this.f13407i);
                boolean zIsEmpty = arrayListM8409R13.isEmpty();
                List listM99x0 = arrayListM8409R13;
                if (zIsEmpty) {
                    listM99x0 = AbstractC0000a.m99x0(new C5726s(31, null, null));
                }
                interfaceC1809a13.setValue(listM99x0);
                return C3967n.f12976a;
            case 4:
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f13406h;
                Set set = (Set) interfaceC1809a14.getValue();
                int i11 = this.f13407i;
                interfaceC1809a14.setValue(set.contains(Integer.valueOf(i11)) ? AbstractC4156d0.m8351S((Set) interfaceC1809a14.getValue(), Integer.valueOf(i11)) : AbstractC4156d0.m8354V((Set) interfaceC1809a14.getValue(), Integer.valueOf(i11)));
                return C3967n.f12976a;
            default:
                return Integer.valueOf(((C1935k0) ((C1548s) this.f13406h).f5164e).f6562b.m4827d(this.f13407i));
        }
    }

    public /* synthetic */ C4054v(int i9, InterfaceC1809a1 interfaceC1809a1, int i10) {
        this.f13405g = i10;
        this.f13407i = i9;
        this.f13406h = interfaceC1809a1;
    }
}

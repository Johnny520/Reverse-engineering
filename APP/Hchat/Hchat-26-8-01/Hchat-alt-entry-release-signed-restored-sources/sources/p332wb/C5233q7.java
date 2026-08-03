package p332wb;

import java.util.ArrayList;
import java.util.List;
import na.C2920h;
import p051db.C0765c;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p345x8.C5726s;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.q7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5233q7 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20131g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f20132h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20133i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5233q7(int i9, InterfaceC1809a1 interfaceC1809a1, int i10) {
        this.f20131g = i10;
        this.f20132h = i9;
        this.f20133i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f20131g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f20133i;
                interfaceC1809a1.setValue(AbstractC4955ho.m9610m7((C0765c) interfaceC1809a1.getValue(), this.f20132h, str));
                break;
            case 1:
                C2920h c2920h = (C2920h) obj;
                c2920h.getClass();
                int i9 = this.f20132h;
                if (i9 >= 0) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f20133i;
                    if (i9 < ((List) interfaceC1809a12.getValue()).size()) {
                        ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a12.getValue());
                        arrayListM8409R1.set(i9, AbstractC4955ho.m9645q6(c2920h));
                        interfaceC1809a12.setValue(arrayListM8409R1);
                    }
                }
                return C3967n.f12976a;
            case 2:
                C5726s c5726s = (C5726s) obj;
                c5726s.getClass();
                AbstractC4955ho.m9342H(this.f20133i, this.f20132h, c5726s);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                InterfaceC1809a1 interfaceC1809a13 = this.f20133i;
                interfaceC1809a13.setValue(AbstractC4955ho.m9610m7((C0765c) interfaceC1809a13.getValue(), this.f20132h, str2));
                break;
        }
        return C3967n.f12976a;
    }
}

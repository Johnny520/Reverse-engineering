package p332wb;

import java.util.ArrayList;
import java.util.List;
import na.C2920h;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.ka */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5038ka implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18339g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f18340h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18341i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18342j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5038ka(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f18339g = 2;
        this.f18341i = interfaceC1809a1;
        this.f18340h = i9;
        this.f18342j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18339g) {
            case 0:
                int i9 = this.f18340h;
                if (i9 > 0) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f18341i;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                    C2920h c2920h = (C2920h) arrayListM8409R1.remove(i9);
                    int i10 = i9 - 1;
                    arrayListM8409R1.add(i10, c2920h);
                    interfaceC1809a1.setValue(arrayListM8409R1);
                    this.f18342j.setValue(Integer.valueOf(i10));
                }
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = this.f18341i;
                int iM54b0 = AbstractC0000a.m54b0((List) interfaceC1809a12.getValue());
                int i11 = this.f18340h;
                if (i11 < iM54b0) {
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a12.getValue());
                    C2920h c2920h2 = (C2920h) arrayListM8409R12.remove(i11);
                    int i12 = i11 + 1;
                    arrayListM8409R12.add(i12, c2920h2);
                    interfaceC1809a12.setValue(arrayListM8409R12);
                    this.f18342j.setValue(Integer.valueOf(i12));
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a13 = this.f18341i;
                ArrayList arrayListM8409R13 = AbstractC4166m.m8409R1((List) interfaceC1809a13.getValue());
                arrayListM8409R13.remove(this.f18340h);
                interfaceC1809a13.setValue(arrayListM8409R13);
                this.f18342j.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5038ka(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i10) {
        this.f18339g = i10;
        this.f18340h = i9;
        this.f18341i = interfaceC1809a1;
        this.f18342j = interfaceC1809a12;
    }
}

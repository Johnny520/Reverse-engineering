package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4166m;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: wb.ck */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4787ck implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16357g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC4701a0 f16358h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16359i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f16360j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16361k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16362l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16363m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4787ck(AbstractC4701a0 abstractC4701a0, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16358h = abstractC4701a0;
        this.f16359i = interfaceC1809a1;
        this.f16360j = sharedPreferences;
        this.f16361k = interfaceC1809a12;
        this.f16362l = interfaceC1809a13;
        this.f16363m = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        ArrayList arrayListM8398G1;
        switch (this.f16357g) {
            case 0:
                C4298i c4298i = (C4298i) obj;
                c4298i.getClass();
                C5157nu c5157nu = ((C5520z) this.f16358h).f22308a;
                InterfaceC1809a1 interfaceC1809a1 = this.f16359i;
                int size = ((List) interfaceC1809a1.getValue()).size();
                int i9 = c5157nu.f19302a;
                if (i9 < 0 || i9 >= size) {
                    arrayListM8398G1 = AbstractC4166m.m8398G1((List) interfaceC1809a1.getValue(), c4298i);
                } else {
                    arrayListM8398G1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                    arrayListM8398G1.set(i9, c4298i);
                }
                ArrayList arrayList = arrayListM8398G1;
                interfaceC1809a1.setValue(arrayList);
                InterfaceC1809a1 interfaceC1809a12 = this.f16361k;
                if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                    interfaceC1809a12.setValue(c4298i.f14300a);
                }
                AbstractC4955ho.m9358J(this.f16360j, interfaceC1809a1, this.f16362l, interfaceC1809a12, arrayList, null, (String) interfaceC1809a12.getValue(), 32);
                this.f16363m.setValue(null);
                break;
            default:
                C4297h c4297h = (C4297h) obj;
                c4297h.getClass();
                InterfaceC1809a1 interfaceC1809a13 = this.f16359i;
                ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a13.getValue());
                int size2 = arrayListM8409R1.size();
                int i10 = ((C5456x) this.f16358h).f21841a.f19083a;
                if (i10 >= 0 && i10 < size2) {
                    arrayListM8409R1.remove(i10);
                }
                interfaceC1809a13.setValue(AbstractC4955ho.m9682u7(arrayListM8409R1, AbstractC0000a.m99x0(c4297h)));
                AbstractC4955ho.m9358J(this.f16360j, this.f16361k, interfaceC1809a13, this.f16362l, null, (List) interfaceC1809a13.getValue(), null, 80);
                this.f16363m.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4787ck(AbstractC4701a0 abstractC4701a0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16358h = abstractC4701a0;
        this.f16359i = interfaceC1809a1;
        this.f16361k = interfaceC1809a12;
        this.f16360j = sharedPreferences;
        this.f16362l = interfaceC1809a13;
        this.f16363m = interfaceC1809a14;
    }
}

package p332wb;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: wb.dk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4820dk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16651g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC4701a0 f16652h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16653i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f16654j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16655k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16656l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16657m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4820dk(AbstractC4701a0 abstractC4701a0, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16652h = abstractC4701a0;
        this.f16653i = interfaceC1809a1;
        this.f16654j = sharedPreferences;
        this.f16655k = interfaceC1809a12;
        this.f16656l = interfaceC1809a13;
        this.f16657m = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() throws JSONException {
        switch (this.f16651g) {
            case 0:
                C5157nu c5157nu = ((C5520z) this.f16652h).f22308a;
                InterfaceC1809a1 interfaceC1809a1 = this.f16653i;
                int size = ((List) interfaceC1809a1.getValue()).size();
                int i9 = c5157nu.f19302a;
                if (i9 >= 0 && i9 < size) {
                    String str = ((C4298i) ((List) interfaceC1809a1.getValue()).get(i9)).f14300a;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                    arrayListM8409R1.remove(i9);
                    interfaceC1809a1.setValue(arrayListM8409R1);
                    InterfaceC1809a1 interfaceC1809a12 = this.f16655k;
                    List<C4297h> list = (List) interfaceC1809a12.getValue();
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                    for (C4297h c4297hM8632a : list) {
                        if (AbstractC1416l.m3825a(c4297hM8632a.f14292e, str)) {
                            c4297hM8632a = C4297h.m8632a(c4297hM8632a, null, null, null, false, HttpUrl.FRAGMENT_ENCODE_SET, 15);
                        }
                        arrayList.add(c4297hM8632a);
                    }
                    interfaceC1809a12.setValue(arrayList);
                    InterfaceC1809a1 interfaceC1809a13 = this.f16656l;
                    if (AbstractC1416l.m3825a((String) interfaceC1809a13.getValue(), str)) {
                        C4298i c4298i = (C4298i) AbstractC4166m.m8424v1((List) interfaceC1809a1.getValue());
                        String str2 = c4298i != null ? c4298i.f14300a : null;
                        if (str2 == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        interfaceC1809a13.setValue(str2);
                    }
                    AbstractC4955ho.m9358J(this.f16654j, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, null, null, null, 112);
                }
                this.f16657m.setValue(null);
                break;
            default:
                InterfaceC1809a1 interfaceC1809a14 = this.f16653i;
                int size2 = ((List) interfaceC1809a14.getValue()).size();
                C5456x c5456x = (C5456x) this.f16652h;
                int i10 = c5456x.f21841a.f19083a;
                if (i10 >= 0 && i10 < size2) {
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a14.getValue());
                    arrayListM8409R12.remove(c5456x.f21841a.f19083a);
                    interfaceC1809a14.setValue(arrayListM8409R12);
                    AbstractC4955ho.m9358J(this.f16654j, this.f16655k, interfaceC1809a14, this.f16656l, null, (List) interfaceC1809a14.getValue(), null, 80);
                }
                this.f16657m.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4820dk(AbstractC4701a0 abstractC4701a0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a14) {
        this.f16652h = abstractC4701a0;
        this.f16653i = interfaceC1809a1;
        this.f16655k = interfaceC1809a12;
        this.f16656l = interfaceC1809a13;
        this.f16654j = sharedPreferences;
        this.f16657m = interfaceC1809a14;
    }
}

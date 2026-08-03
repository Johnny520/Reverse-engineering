package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.ng */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5143ng implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19204g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f19205h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19206i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19207j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19208k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5143ng(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f19204g = 0;
        this.f19206i = interfaceC1809a1;
        this.f19205h = sharedPreferences;
        this.f19207j = interfaceC1809a12;
        this.f19208k = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f19204g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f19206i;
                interfaceC1809a1.setValue(str);
                AbstractC4955ho.m9358J(this.f19205h, this.f19207j, this.f19208k, interfaceC1809a1, null, null, str, 48);
                break;
            case 1:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19599I5, 3);
                C3623h.m7604a(c3623h, null, new C3874d(2099790647, new C5203pa(this.f19205h, this.f19206i, this.f19207j, this.f19208k, 5), true), 3);
                break;
            case 2:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19768g0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(282755047, new C5203pa(this.f19205h, this.f19206i, this.f19207j, this.f19208k, 3), true), 3);
                break;
            default:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5292s0) it.next()).f20550a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!AbstractC3149m.m6721t0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                InterfaceC1809a1 interfaceC1809a12 = this.f19206i;
                interfaceC1809a12.setValue(setM8412U1);
                this.f19207j.setValue(Boolean.FALSE);
                this.f19205h.edit().putString("block_at_all_notification_groups", AbstractC4955ho.m9316D5((Set) interfaceC1809a12.getValue())).apply();
                this.f19208k.setValue(C4733b.f15953a);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5143ng(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f19204g = i9;
        this.f19205h = sharedPreferences;
        this.f19206i = interfaceC1809a1;
        this.f19207j = interfaceC1809a12;
        this.f19208k = interfaceC1809a13;
    }
}

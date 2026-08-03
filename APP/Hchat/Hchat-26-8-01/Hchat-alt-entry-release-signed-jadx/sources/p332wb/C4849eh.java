package p332wb;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import na.C2922j;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: wb.eh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4849eh implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16905g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f16906h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16907i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16908j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16909k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16910l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4849eh(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16905g = 0;
        this.f16907i = interfaceC1809a1;
        this.f16908j = interfaceC1809a12;
        this.f16906h = sharedPreferences;
        this.f16909k = interfaceC1809a13;
        this.f16910l = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f16905g) {
            case 0:
                C4759bp c4759bp = (C4759bp) obj;
                c4759bp.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f16907i;
                int size = ((List) interfaceC1809a1.getValue()).size();
                int i9 = c4759bp.f16109b;
                String str = (i9 < 0 || i9 >= size) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2922j) ((List) interfaceC1809a1.getValue()).get(i9)).f9512a;
                InterfaceC1809a1 interfaceC1809a12 = this.f16908j;
                interfaceC1809a12.setValue(str);
                AbstractC4955ho.m9481Y2(this.f16906h, interfaceC1809a1, this.f16909k, interfaceC1809a12, null, null, str, 48);
                this.f16910l.setValue(null);
                break;
            case 1:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19568E2, 3);
                C3623h.m7604a(c3623h, null, new C3874d(588862142, new C5265r6(this.f16906h, 6), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19575F2, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1089064700, new C4873f8(this.f16907i, this.f16908j, this.f16909k, this.f16910l, 0), true), 3);
                break;
            case 2:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19916z2, 3);
                SharedPreferences sharedPreferences = this.f16906h;
                InterfaceC1809a1 interfaceC1809a13 = this.f16907i;
                C3623h.m7604a(c3623h2, null, new C3874d(-428314057, new C5332t7(sharedPreferences, interfaceC1809a13, this.f16908j, 6), true), 3);
                if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19540A2, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(800646418, new C5332t7(sharedPreferences, this.f16909k, this.f16910l, 7), true), 3);
                }
                return C3967n.f12976a;
            case 3:
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19776h0, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-750242400, new C4745bb(this.f16906h, this.f16907i, this.f16908j, this.f16909k, this.f16910l, 5), true), 3);
                break;
            case 4:
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19579G, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(2129052763, new C4745bb(this.f16906h, this.f16907i, this.f16908j, this.f16909k, this.f16910l, 0), true), 3);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                Set setM9715y6 = AbstractC4955ho.m9715y6(str2);
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(setM9715y6));
                Iterator it = setM9715y6.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    InterfaceC1809a1 interfaceC1809a14 = this.f16907i;
                    InterfaceC1809a1 interfaceC1809a15 = this.f16908j;
                    Object obj2 = null;
                    if (!zHasNext) {
                        if (arrayList.size() == 1) {
                            C4297h c4297h = (C4297h) AbstractC4166m.m8422t1(arrayList);
                            Iterator it2 = ((List) interfaceC1809a14.getValue()).iterator();
                            int i10 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i10 = -1;
                                } else if (!AbstractC1416l.m3825a(((C4297h) it2.next()).f14289b, c4297h.f14289b)) {
                                    i10++;
                                }
                            }
                            Integer numValueOf = i10 >= 0 ? Integer.valueOf(i10) : null;
                            this.f16909k.setValue(new C5124mu(numValueOf != null ? numValueOf.intValue() : ((List) interfaceC1809a14.getValue()).size(), c4297h, i10 >= 0));
                        } else if (!arrayList.isEmpty()) {
                            interfaceC1809a14.setValue(AbstractC4955ho.m9682u7((List) interfaceC1809a14.getValue(), arrayList));
                            AbstractC4955ho.m9358J(this.f16906h, interfaceC1809a15, interfaceC1809a14, this.f16910l, null, (List) interfaceC1809a14.getValue(), null, 80);
                        }
                        return C3967n.f12976a;
                    }
                    String str3 = (String) it.next();
                    Iterator it3 = ((List) interfaceC1809a14.getValue()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (AbstractC1416l.m3825a(((C4297h) next).f14289b, str3)) {
                                obj2 = next;
                            }
                        }
                    }
                    C4297h c4297h2 = (C4297h) obj2;
                    if (c4297h2 == null) {
                        c4297h2 = new C4297h(str3, str3, AbstractC4955ho.m9592k7(str3), ((List) interfaceC1809a15.getValue()).size() == 1 ? ((C4298i) AbstractC4166m.m8422t1((List) interfaceC1809a15.getValue())).f14300a : HttpUrl.FRAGMENT_ENCODE_SET, false);
                    }
                    arrayList.add(c4297h2);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4849eh(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f16905g = i9;
        this.f16906h = sharedPreferences;
        this.f16907i = interfaceC1809a1;
        this.f16908j = interfaceC1809a12;
        this.f16909k = interfaceC1809a13;
        this.f16910l = interfaceC1809a14;
    }

    public /* synthetic */ C4849eh(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a14) {
        this.f16905g = 5;
        this.f16907i = interfaceC1809a1;
        this.f16908j = interfaceC1809a12;
        this.f16909k = interfaceC1809a13;
        this.f16906h = sharedPreferences;
        this.f16910l = interfaceC1809a14;
    }
}

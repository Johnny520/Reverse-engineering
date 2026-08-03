package p000;

import android.content.SharedPreferences;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2479s implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8713b;

    public /* synthetic */ C2479s(int i, Object obj) {
        this.f8712a = i;
        this.f8713b = obj;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        int i = this.f8712a;
        C0829TC c0829tc = C0829TC.f2620a;
        Object obj2 = this.f8713b;
        switch (i) {
            case 0:
                if (obj != ((AbstractC0000A) obj2)) {
                    break;
                }
                break;
            case 1:
                C0183EA.f539a.getClass();
                C0183EA.m382j((String) obj);
                ((C1495ha) obj2).m2861g();
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                InterfaceC1416fj interfaceC1416fj = ((C2629ve) obj2).f9136o;
                if (interfaceC1416fj != null) {
                    interfaceC1416fj.mo90g(bool);
                }
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l((C1505hk) obj2, iIntValue, null, 4), 3);
                break;
            case 4:
                C0809St c0809St = (C0809St) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                break;
            case 5:
                LinearLayout linearLayout = (LinearLayout) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-743029340213L), zBooleanValue);
                linearLayout.setVisibility(zBooleanValue ? 0 : 8);
                break;
            case 6:
                C0212Ex c0212Ex = (C0212Ex) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1174c(((C1128aA) obj2).getKey(), zBooleanValue2);
                break;
            default:
                AbstractC0295Gu.m625r(-576900007196725L);
                ((C1494hG) obj).f5263a.m4864C(obj2);
                break;
        }
        return c0829tc;
    }
}

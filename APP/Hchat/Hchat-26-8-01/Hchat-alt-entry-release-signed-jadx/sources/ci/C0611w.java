package ci;

import android.view.View;
import android.view.Window;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1329q;
import p116i.C1741c1;
import p116i.C1743d0;
import p116i.C1744d1;
import p116i.C1752g0;
import p116i.C1753g1;
import p116i.C1765k1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1898z;
import p126ia.C2020n;
import p222p.C3255s1;
import p265s.C3866x0;
import p269s3.C3923a;
import p269s3.C3927e;
import p321w.C4621n1;
import p322w0.C4665p;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: ci.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611w implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1921c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0611w(Object obj, int i9, Object obj2) {
        this.f1919a = i9;
        this.f1920b = obj;
        this.f1921c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        Integer num;
        int i9 = this.f1919a;
        Object obj = this.f1921c;
        Object obj2 = this.f1920b;
        switch (i9) {
            case 0:
                AbstractC4171r.m8433i1(C0610v.f1916h, (C4665p) obj2);
                AbstractC4171r.m8433i1(C0610v.f1917i, (C4665p) obj);
                break;
            case 1:
                ((C1752g0) obj2).f5844a.m5064j((C1743d0) obj);
                break;
            case 2:
                ((C1765k1) obj2).f5898j.remove((C1765k1) obj);
                break;
            case 3:
                C1765k1 c1765k1 = (C1765k1) obj2;
                C1741c1 c1741c1 = (C1741c1) ((C1744d1) obj).f5828b.getValue();
                if (c1741c1 != null) {
                    c1765k1.f5897i.remove(c1741c1.f5797g);
                }
                break;
            case 4:
                ((C1765k1) obj2).f5897i.remove((C1753g1) obj);
                break;
            case 5:
                C3255s1 c3255s1 = (C3255s1) obj2;
                View view = (View) obj;
                int i10 = c3255s1.f10380t - 1;
                c3255s1.f10380t = i10;
                if (i10 == 0) {
                    int i11 = AbstractC1329q.f4395a;
                    AbstractC1321m.m3524b(view, null);
                    AbstractC1329q.m3555b(view, null);
                    view.removeOnAttachStateChangeListener(c3255s1.f10381u);
                }
                break;
            case 6:
                ((C3866x0) obj2).f12675i.m2338k(obj);
                break;
            case 7:
                ((C3923a) obj2).m8120a();
                ((C3927e) obj).f12905e = null;
                break;
            case 8:
                ((C4621n1) obj2).f15301c.remove((InterfaceC1231l) obj);
                break;
            case 9:
                Window window = (Window) obj2;
                if (window != null && (num = (Integer) obj) != null) {
                    window.setSoftInputMode(num.intValue());
                    break;
                }
                break;
            default:
                ((C2020n) obj2).invoke(null);
                ((InterfaceC1220a) ((InterfaceC1809a1) obj).getValue()).invoke();
                break;
        }
    }
}

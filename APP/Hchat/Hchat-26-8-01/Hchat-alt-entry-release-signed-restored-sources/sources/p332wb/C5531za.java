package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gb.C1379c;
import gb.C1391o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p036c9.C0439g0;
import p051db.C0768f;
import p063e9.C0832c;
import p080fb.C1109c1;
import p080fb.C1192y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import sh.C3998d;

/* JADX INFO: renamed from: wb.za */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5531za implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22384g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f22385h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22386i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f22387j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f22388k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f22389l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f22390m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f22391n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f22392o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f22393p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f22394q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f22395r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5531za(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, List list, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        this.f22390m = sharedPreferences;
        this.f22387j = interfaceC1809a1;
        this.f22389l = interfaceC1809a12;
        this.f22392o = interfaceC1809a13;
        this.f22385h = list;
        this.f22393p = interfaceC1809a14;
        this.f22394q = interfaceC1809a15;
        this.f22388k = interfaceC1809a16;
        this.f22386i = interfaceC1809a17;
        this.f22395r = interfaceC1809a18;
        this.f22391n = interfaceC1809a19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f22384g) {
            case 0:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22390m;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f22394q;
                String str = (String) this.f22388k;
                List list = (List) this.f22385h;
                ArrayList arrayList = (ArrayList) this.f22395r;
                List list2 = (List) this.f22386i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f22391n;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f22393p;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, new C3874d(-432730665, new C5293s1(this.f22387j, 14), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(786480384, new C5293s1(this.f22389l, 15), true), 3);
                InterfaceC1809a1 interfaceC1809a12 = this.f22392o;
                if (!((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19659R2, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(901404997, new C4899g1(interfaceC1220a, interfaceC1220a2, 4), true), 3);
                }
                C3623h.m7604a(c3623h, null, new C3874d(1271117215, new C3998d(str, 3), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(1755754046, new C4911gd(list, arrayList, list2, interfaceC1235p, interfaceC1809a12, interfaceC1809a1, 0), true), 3);
                return C3967n.f12976a;
            case 1:
                List list3 = (List) this.f22385h;
                List list4 = (List) this.f22386i;
                String str2 = (String) this.f22388k;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f22393p;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f22390m;
                Context context = (Context) this.f22394q;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f22395r;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f22391n;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                int i9 = 3;
                C3623h.m7604a(c3623h2, null, new C3874d(1800740759, new C5293s1(this.f22387j, 16), true), 3);
                C3623h.m7604a(c3623h2, null, new C3874d(157646158, new C0439g0(3, interfaceC1231l, str2), true), 3);
                boolean zIsEmpty = list3.isEmpty();
                InterfaceC1809a1 interfaceC1809a13 = this.f22389l;
                if (!zIsEmpty && !((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, new C3874d(-1187897998, new C0768f(list3, 10, interfaceC1220a3), true), 3);
                }
                C3623h.m7604a(c3623h2, null, new C3874d(-2047996209, new C5140nd(0, list4), true), 3);
                if (list3.isEmpty()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19901x1, 3);
                } else if (list4.isEmpty()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19915z1, 3);
                } else {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        int i10 = i9;
                        C3623h.m7604a(c3623h2, null, new C3874d(-1106504371, new C4833e1((C0832c) it.next(), context, interfaceC1231l2, interfaceC1235p2, interfaceC1809a13, this.f22392o), true), i10);
                        i9 = i10;
                    }
                }
                return C3967n.f12976a;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f22390m;
                List list5 = (List) this.f22385h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f22393p;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f22394q;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f22388k;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f22386i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f22395r;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f22391n;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19564D5, 3);
                InterfaceC1809a1 interfaceC1809a110 = this.f22387j;
                InterfaceC1809a1 interfaceC1809a111 = this.f22389l;
                InterfaceC1809a1 interfaceC1809a112 = this.f22392o;
                C3623h.m7604a(c3623h3, null, new C3874d(-504530403, new C5203pa(sharedPreferences, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, 4), true), 3);
                if (((Boolean) interfaceC1809a110.getValue()).booleanValue() || ((Boolean) interfaceC1809a111.getValue()).booleanValue() || ((Boolean) interfaceC1809a112.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19571E5, 3);
                    C3623h.m7604a(c3623h3, null, new C3874d(992403960, new C4801d1(list5, interfaceC1809a110, interfaceC1809a14, interfaceC1809a15, interfaceC1809a111, interfaceC1809a112, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19), true), 3);
                }
                return C3967n.f12976a;
            case 3:
                C1391o c1391o = (C1391o) this.f22390m;
                Context context2 = (Context) this.f22394q;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f22388k;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f22393p;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f22385h;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f22386i;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f22395r;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f22391n;
                C1379c c1379c = (C1379c) obj;
                c1379c.getClass();
                InterfaceC1809a1 interfaceC1809a118 = this.f22387j;
                if (((String) interfaceC1809a118.getValue()) == null) {
                    if (c1379c.f4583f) {
                        interfaceC1809a118.setValue(c1379c.f4578a);
                        InterfaceC1809a1 interfaceC1809a119 = this.f22389l;
                        interfaceC1809a119.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        AbstractC3603v.m7563q(interfaceC3599t, null, new C5282rn(context2, c1391o, c1379c, this.f22392o, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a119, interfaceC1809a118, null, 1), 3);
                    } else {
                        Toast.makeText(context2, "只能删除自己的评论", 0).show();
                    }
                }
                return C3967n.f12976a;
            default:
                List list6 = (List) this.f22385h;
                C1192y c1192y = (C1192y) this.f22390m;
                C1109c1 c1109c1 = (C1109c1) this.f22394q;
                Context context3 = (Context) this.f22388k;
                C1845j1 c1845j1 = (C1845j1) this.f22386i;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f22393p;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f22395r;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f22391n;
                String str3 = (String) obj;
                str3.getClass();
                c1845j1.setValue(list6);
                this.f22387j.setValue(c1192y);
                this.f22389l.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f22392o.setValue(str3);
                interfaceC1809a120.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                C5491y2.m9774F0(context3, c1109c1);
                interfaceC1809a121.setValue(null);
                C5491y2.m9812X0(interfaceC1809a122, 0);
                Toast.makeText(context3, "已回滚到所选消息", 0).show();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C5531za(C1391o c1391o, Context context, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f22390m = c1391o;
        this.f22394q = context;
        this.f22388k = interfaceC3599t;
        this.f22387j = interfaceC1809a1;
        this.f22389l = interfaceC1809a12;
        this.f22392o = interfaceC1809a13;
        this.f22393p = interfaceC1809a14;
        this.f22385h = interfaceC1809a15;
        this.f22386i = interfaceC1809a16;
        this.f22395r = interfaceC1809a17;
        this.f22391n = interfaceC1809a18;
    }

    public /* synthetic */ C5531za(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, String str, List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a14) {
        this.f22387j = interfaceC1809a1;
        this.f22389l = interfaceC1809a12;
        this.f22392o = interfaceC1809a13;
        this.f22390m = interfaceC1220a;
        this.f22394q = interfaceC1220a2;
        this.f22388k = str;
        this.f22385h = list;
        this.f22395r = arrayList;
        this.f22386i = list2;
        this.f22391n = interfaceC1235p;
        this.f22393p = interfaceC1809a14;
    }

    public /* synthetic */ C5531za(List list, C1192y c1192y, C1109c1 c1109c1, Context context, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f22385h = list;
        this.f22390m = c1192y;
        this.f22394q = c1109c1;
        this.f22388k = context;
        this.f22386i = c1845j1;
        this.f22387j = interfaceC1809a1;
        this.f22389l = interfaceC1809a12;
        this.f22392o = interfaceC1809a13;
        this.f22393p = interfaceC1809a14;
        this.f22395r = interfaceC1809a15;
        this.f22391n = interfaceC1809a16;
    }

    public /* synthetic */ C5531za(List list, List list2, InterfaceC1809a1 interfaceC1809a1, String str, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a12, InterfaceC1220a interfaceC1220a, Context context, InterfaceC1231l interfaceC1231l2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a13) {
        this.f22385h = list;
        this.f22386i = list2;
        this.f22387j = interfaceC1809a1;
        this.f22388k = str;
        this.f22393p = interfaceC1231l;
        this.f22389l = interfaceC1809a12;
        this.f22390m = interfaceC1220a;
        this.f22394q = context;
        this.f22395r = interfaceC1231l2;
        this.f22391n = interfaceC1235p;
        this.f22392o = interfaceC1809a13;
    }
}

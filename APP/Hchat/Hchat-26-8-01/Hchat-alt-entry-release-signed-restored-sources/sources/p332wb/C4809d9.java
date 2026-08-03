package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p000a.AbstractC0000a;
import p080fb.C1107c;
import p080fb.C1109c1;
import p080fb.C1192y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.d9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4809d9 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16557g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f16558h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16559i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16560j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16561k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16562l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16563m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16564n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f16565o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f16566p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f16567q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f16568r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f16569s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f16570t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f16571u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f16572v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f16573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16574x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4809d9(SharedPreferences sharedPreferences, List list, String str, InterfaceC1231l interfaceC1231l, String str2, List list2, String str3, InterfaceC1231l interfaceC1231l2, String str4, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f16565o = sharedPreferences;
        this.f16566p = list;
        this.f16568r = str;
        this.f16572v = interfaceC1231l;
        this.f16569s = str2;
        this.f16567q = list2;
        this.f16570t = str3;
        this.f16573w = interfaceC1231l2;
        this.f16571u = str4;
        this.f16574x = interfaceC1220a;
        this.f16558h = interfaceC1809a1;
        this.f16559i = interfaceC1809a12;
        this.f16560j = interfaceC1809a13;
        this.f16561k = interfaceC1809a14;
        this.f16562l = interfaceC1809a15;
        this.f16563m = interfaceC1809a16;
        this.f16564n = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Object next;
        boolean z9;
        switch (this.f16557g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16565o;
                List list = (List) this.f16566p;
                String str = (String) this.f16568r;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f16572v;
                String str2 = (String) this.f16569s;
                List list2 = (List) this.f16567q;
                String str3 = (String) this.f16570t;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f16573w;
                String str4 = (String) this.f16571u;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16574x;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19788i4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(2051341756, new C5366u8(sharedPreferences, list, str, interfaceC1231l, str2, list2, str3, interfaceC1231l2, str4, interfaceC1220a, this.f16558h, this.f16559i, this.f16560j, this.f16561k, this.f16562l, this.f16563m, this.f16564n), true), 3);
                break;
            case 1:
                C1845j1 c1845j1 = (C1845j1) this.f16565o;
                C1845j1 c1845j12 = (C1845j1) this.f16566p;
                Context context = (Context) this.f16567q;
                C5453wt c5453wt = (C5453wt) this.f16568r;
                C1845j1 c1845j13 = (C1845j1) this.f16569s;
                C1845j1 c1845j14 = (C1845j1) this.f16570t;
                C1845j1 c1845j15 = (C1845j1) this.f16571u;
                C1845j1 c1845j16 = (C1845j1) this.f16572v;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f16573w;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16574x;
                long jLongValue = ((Long) obj).longValue();
                Iterator it = ((List) c1845j1.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C5288rt) next).f20535a == jLongValue) {
                        }
                    } else {
                        next = null;
                    }
                }
                C5288rt c5288rt = (C5288rt) next;
                if (c5288rt != null) {
                    List listM99x0 = AbstractC0000a.m99x0(c5288rt);
                    List list3 = (List) c1845j1.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        Context context2 = context;
                        C5453wt c5453wt2 = c5453wt;
                        if (((C5288rt) obj2).f20535a != jLongValue) {
                            arrayList.add(obj2);
                        }
                        context = context2;
                        c5453wt = c5453wt2;
                    }
                    Context context3 = context;
                    C5453wt c5453wt3 = c5453wt;
                    c1845j1.setValue(AbstractC4166m.m8397F1(listM99x0, arrayList));
                    if (((Boolean) c1845j12.getValue()).booleanValue()) {
                        C5491y2.m9854z0(context3, c5453wt3, this.f16558h, this.f16559i, c1845j13, c1845j14, this.f16560j, c1845j15, this.f16561k, this.f16562l, this.f16563m, c1845j12, c1845j16, this.f16564n, interfaceC1809a1, interfaceC1809a12);
                    }
                }
                break;
            default:
                C1845j1 c1845j17 = (C1845j1) this.f16565o;
                C1845j1 c1845j18 = (C1845j1) this.f16566p;
                C1845j1 c1845j19 = (C1845j1) this.f16567q;
                C1845j1 c1845j110 = (C1845j1) this.f16568r;
                C1845j1 c1845j111 = (C1845j1) this.f16569s;
                C1845j1 c1845j112 = (C1845j1) this.f16570t;
                C1845j1 c1845j113 = (C1845j1) this.f16571u;
                C1845j1 c1845j114 = (C1845j1) this.f16572v;
                Context context4 = (Context) this.f16573w;
                C5518yt c5518yt = (C5518yt) this.f16574x;
                int iIntValue = ((Integer) obj).intValue();
                if (!((Boolean) c1845j17.getValue()).booleanValue() && !((Boolean) c1845j18.getValue()).booleanValue() && !((Boolean) c1845j19.getValue()).booleanValue() && !C5491y2.m9781I0(c1845j110, c1845j111, c1845j112, c1845j113) && iIntValue >= 0 && iIntValue < ((List) c1845j114.getValue()).size()) {
                    boolean z10 = iIntValue < AbstractC0000a.m54b0((List) c1845j114.getValue());
                    LinkedHashSet linkedHashSetM8350R = AbstractC4156d0.m8350R(((C1107c) ((List) c1845j114.getValue()).get(iIntValue)).f3586c);
                    do {
                        z9 = false;
                        for (C1107c c1107c : (List) c1845j114.getValue()) {
                            if (!linkedHashSetM8350R.contains(c1107c.f3586c) && linkedHashSetM8350R.contains(c1107c.f3588e)) {
                                linkedHashSetM8350R.add(c1107c.f3586c);
                                z9 = true;
                            }
                        }
                    } while (z9);
                    List list4 = (List) c1845j114.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list4) {
                        if (linkedHashSetM8350R.contains(((C1107c) obj3).f3586c)) {
                            arrayList3.add(obj3);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                    C1192y c1192yM9776G0 = C5491y2.m9776G0(arrayList2);
                    InterfaceC1809a1 interfaceC1809a13 = this.f16558h;
                    if (c1192yM9776G0 == null && z10) {
                        c1192yM9776G0 = (C1192y) interfaceC1809a13.getValue();
                    }
                    InterfaceC1809a1 interfaceC1809a14 = this.f16559i;
                    C5491y2.m9837o1(c5518yt, context4, arrayList2, arrayList3, "删除消息", new C5237qb(arrayList2, c1192yM9776G0, (C1109c1) interfaceC1809a14.getValue(), context4, c1845j114, interfaceC1809a13, this.f16560j, this.f16561k, this.f16562l, interfaceC1809a14, this.f16563m, this.f16564n));
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4809d9(C1845j1 c1845j1, C1845j1 c1845j12, Context context, C5453wt c5453wt, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, C1845j1 c1845j110, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, C1845j1 c1845j114, C1845j1 c1845j115) {
        this.f16565o = c1845j1;
        this.f16566p = c1845j12;
        this.f16567q = context;
        this.f16568r = c5453wt;
        this.f16558h = c1845j13;
        this.f16559i = c1845j14;
        this.f16569s = c1845j15;
        this.f16570t = c1845j16;
        this.f16560j = c1845j17;
        this.f16571u = c1845j18;
        this.f16561k = c1845j19;
        this.f16562l = c1845j110;
        this.f16563m = c1845j111;
        this.f16572v = c1845j112;
        this.f16564n = c1845j113;
        this.f16573w = c1845j114;
        this.f16574x = c1845j115;
    }

    public /* synthetic */ C4809d9(C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, C1845j1 c1845j110, Context context, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, C1845j1 c1845j114, InterfaceC1809a1 interfaceC1809a1, C5518yt c5518yt) {
        this.f16565o = c1845j1;
        this.f16566p = c1845j12;
        this.f16567q = c1845j13;
        this.f16568r = c1845j14;
        this.f16569s = c1845j15;
        this.f16570t = c1845j16;
        this.f16571u = c1845j17;
        this.f16572v = c1845j18;
        this.f16558h = c1845j19;
        this.f16559i = c1845j110;
        this.f16573w = context;
        this.f16560j = c1845j111;
        this.f16561k = c1845j112;
        this.f16562l = c1845j113;
        this.f16563m = c1845j114;
        this.f16564n = interfaceC1809a1;
        this.f16574x = c5518yt;
    }
}

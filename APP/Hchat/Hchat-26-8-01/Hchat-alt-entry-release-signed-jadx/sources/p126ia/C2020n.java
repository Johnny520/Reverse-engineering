package p126ia;

import android.app.Activity;
import android.view.ViewGroup;
import gg.C1421q;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p036c9.C0414a;
import p036c9.C0416a1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p144k.C2209s1;
import p230p8.C3360l;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4329c;
import p332wb.AbstractC5193p0;
import p332wb.C4833e1;
import p332wb.C4871f6;
import p332wb.C5166o6;
import p332wb.C5293s1;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.C4173t;

/* JADX INFO: renamed from: ia.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2020n implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6822g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f6823h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6824i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6825j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6826k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6827l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6828m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f6829n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f6830o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2020n(C1425u c1425u, boolean z9, C5166o6 c5166o6, C1421q c1421q, ArrayList arrayList, C1425u c1425u2, ViewGroup viewGroup, C0416a1 c0416a1) {
        this.f6824i = c1425u;
        this.f6823h = z9;
        this.f6825j = c5166o6;
        this.f6826k = c1421q;
        this.f6829n = arrayList;
        this.f6827l = c1425u2;
        this.f6828m = viewGroup;
        this.f6830o = c0416a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.f6822g) {
            case 0:
                List list = (List) this.f6824i;
                C2023q c2023q = (C2023q) this.f6826k;
                Activity activity = (Activity) this.f6827l;
                C3360l c3360l = (C3360l) this.f6828m;
                ArrayList arrayList = (ArrayList) this.f6829n;
                List list2 = ((C2009c) this.f6830o).f6778a;
                List list3 = (List) this.f6825j;
                String str = (String) ((C3958e) list.get(((Integer) obj).intValue())).f12961g;
                int iHashCode = str.hashCode();
                if (iHashCode != -1046651901) {
                    if (iHashCode != -594517255) {
                        if (iHashCode == 1885557875 && str.equals("选择点赞好友")) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(((C2010d) it.next()).f6782a);
                            }
                            c2023q.m4981h(activity, c3360l, arrayList, linkedHashSet, "朋友圈伪集赞");
                        } else {
                            c2023q.getClass();
                            C5491y2.m9803S1(activity, "清空伪集赞", "清空后恢复该朋友圈的真实点赞显示。", new C2019m(0, activity, c2023q, c3360l), new C2209s1(7), EnumC5092lv.f18824j);
                        }
                    } else if (str.equals("随机选择好友")) {
                        c2023q.m4982i(activity, c3360l, list3, list2.size(), this.f6823h, false);
                    }
                } else if (str.equals("凭空生成点赞")) {
                    c2023q.m4982i(activity, c3360l, C4173t.f13710g, list2.size(), true, true);
                }
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f6824i;
                String str2 = (String) this.f6825j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f6826k;
                C0414a c0414a = (C0414a) this.f6827l;
                C0414a c0414a2 = (C0414a) this.f6828m;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f6829n;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f6830o;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19779h3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1579579798, new C4833e1(interfaceC1809a1, str2, interfaceC1231l, c0414a, c0414a2, interfaceC1231l2), true), 3);
                if (this.f6823h) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19787i3, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(1382184325, new C5293s1(interfaceC1809a12, 1), true), 3);
                }
                break;
            default:
                C1425u c1425u = (C1425u) this.f6824i;
                C5166o6 c5166o6 = (C5166o6) this.f6825j;
                C1421q c1421q = (C1421q) this.f6826k;
                ArrayList arrayList2 = (ArrayList) this.f6829n;
                C1425u c1425u2 = (C1425u) this.f6827l;
                ViewGroup viewGroup = (ViewGroup) this.f6828m;
                C0416a1 c0416a1 = (C0416a1) this.f6830o;
                InterfaceC1220a c4871f6 = (InterfaceC1220a) obj;
                c1425u.f4738g = c4871f6;
                if (this.f6823h) {
                    if (c4871f6 == null) {
                        c4871f6 = new C4871f6(c1421q, c5166o6, c1425u, arrayList2, c1425u2, viewGroup, c0416a1, 2);
                    }
                    c5166o6.f19319c = c4871f6;
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2020n(C4329c c4329c, C2023q c2023q, Activity activity, C3360l c3360l, ArrayList arrayList, C2009c c2009c, List list, boolean z9) {
        this.f6824i = c4329c;
        this.f6826k = c2023q;
        this.f6827l = activity;
        this.f6828m = c3360l;
        this.f6829n = arrayList;
        this.f6830o = c2009c;
        this.f6825j = list;
        this.f6823h = z9;
    }

    public /* synthetic */ C2020n(boolean z9, InterfaceC1809a1 interfaceC1809a1, String str, InterfaceC1231l interfaceC1231l, C0414a c0414a, C0414a c0414a2, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a12) {
        this.f6823h = z9;
        this.f6824i = interfaceC1809a1;
        this.f6825j = str;
        this.f6826k = interfaceC1231l;
        this.f6827l = c0414a;
        this.f6828m = c0414a2;
        this.f6829n = interfaceC1231l2;
        this.f6830o = interfaceC1809a12;
    }
}

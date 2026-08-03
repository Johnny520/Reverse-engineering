package p036c9;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import bi.C0315c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okio.Utf8;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p014b.C0126e;
import p020b5.C0184c;
import p020b5.C0192k;
import p041d1.C0676v;
import p057e1.C0807b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p100h0.C1511d1;
import p117i0.C1829f1;
import p119i2.AbstractC1923e0;
import p126ia.C2009c;
import p126ia.C2010d;
import p126ia.C2020n;
import p126ia.C2023q;
import p144k.C2209s1;
import p190n2.C2884s;
import p218og.AbstractC3156t;
import p230p8.C3360l;
import p276sf.C3958e;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p304uf.C4329c;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.C4642w;
import p321w.EnumC4602h0;
import p332wb.C5026jv;
import p332wb.C5097m3;
import p332wb.C5491y2;
import p348xb.C5763i;
import p357y1.C5892i1;
import p357y1.InterfaceC5885g2;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: c9.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0490u implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1475g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1476h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1477i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f1478j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1479k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1480l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0490u(Activity activity, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        this.f1475g = 1;
        this.f1476h = activity;
        this.f1479k = interfaceC1231l;
        this.f1477i = str;
        this.f1480l = str2;
        this.f1478j = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i9 = this.f1475g;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        C3967n c3967n = C3967n.f12976a;
        boolean z10 = this.f1478j;
        Object obj2 = this.f1480l;
        Object obj3 = this.f1479k;
        Object obj4 = this.f1477i;
        Object obj5 = this.f1476h;
        switch (i9) {
            case 0:
                Activity activity = (Activity) obj5;
                String str = (String) obj4;
                List list = (List) obj3;
                C0035c c0035c = (C0035c) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Handler handler = C0419b0.f1202a;
                    C0419b0.m1406d(activity, str, AbstractC0921a.m2250m(list.size(), "正在处理 ", " 个会话..."), new C0499x(z9 ? 1 : 0, list, str, z10), new C0458l(c0035c, activity, 3));
                }
                return c3967n;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                C5491y2.m9807U1((Activity) obj5, list2, (InterfaceC1231l) obj3, new C0315c(7), (String) obj4, (String) obj2, !z10, null, null, false, Utf8.MASK_2BYTES);
                return c3967n;
            case 2:
                C2023q c2023q = (C2023q) obj3;
                Activity activity2 = (Activity) obj5;
                C3360l c3360l = (C3360l) obj2;
                List list3 = (List) obj;
                list3.getClass();
                C0184c c0184c = c2023q.f6841a;
                SharedPreferences sharedPreferences = c2023q.f6844d;
                C2009c c2009cM815l = c0184c.m815l((String) obj4);
                List list4 = c2009cM815l.f6778a;
                HashSet hashSet = new HashSet();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C5026jv) it.next()).f18249a);
                }
                ArrayList<C2010d> arrayList = new ArrayList();
                for (Object obj6 : list4) {
                    if (!hashSet.contains(((C2010d) obj6).f6782a)) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                for (C2010d c2010d : arrayList) {
                    String str2 = c2010d.f6782a;
                    arrayList2.add(new C5026jv(str2, c2010d.f6783b, false, null, null, null, false, AbstractC3156t.m6740d0(str2, "wxid_hchat_fake_like_", false) ? AbstractC0000a.m99x0("虚拟点赞人") : C4173t.f13710g, 120));
                }
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(arrayList2, list3);
                boolean z11 = sharedPreferences.getBoolean("fake_like_auto_select", false);
                boolean z12 = this.f1478j;
                if (z11) {
                    int i10 = sharedPreferences.getInt("fake_like_auto_select_count", 50);
                    if (i10 < 1) {
                        i10 = 1;
                    }
                    List listM4978d = c2023q.m4978d(list3, i10, z12, false);
                    ArrayList arrayList3 = (ArrayList) listM4978d;
                    if (arrayList3.isEmpty()) {
                        C2023q.m4975j(activity2, "没有可自动勾选的点赞人");
                    } else {
                        ArrayList arrayListM8397F12 = AbstractC4166m.m8397F1(listM4978d, arrayListM8397F1);
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj7 : arrayListM8397F12) {
                            if (hashSet2.add(((C5026jv) obj7).f18249a)) {
                                arrayList4.add(obj7);
                            }
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add(((C5026jv) it2.next()).f18249a);
                        }
                        c2023q.m4981h(activity2, c3360l, arrayList4, linkedHashSet, "自动勾选伪集赞");
                        if (arrayList3.size() < i10) {
                            C2023q.m4975j(activity2, "可选人数不足，已勾选 " + arrayList3.size() + " 人");
                        }
                    }
                } else {
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    c4329cM7E.add(new C3958e("选择点赞好友", list4.isEmpty() ? z12 ? "从好友及非好友中手动选择" : "从好友列表手动选择" : AbstractC0921a.m2250m(list4.size(), "当前已选择 ", " 人")));
                    c4329cM7E.add(new C3958e("随机选择好友", "按数量随机勾选，候选不足时可生成虚拟点赞人"));
                    c4329cM7E.add(new C3958e("凭空生成点赞", "无需真实好友，随机生成指定数量的虚拟点赞人"));
                    if (!list4.isEmpty()) {
                        c4329cM7E.add(new C3958e("清空伪集赞", "移除该朋友圈的全部本地点赞"));
                    }
                    C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                    C5491y2.m9811W1(activity2, "朋友圈伪集赞", list4.isEmpty() ? "选择好友或按数量随机生成" : AbstractC0921a.m2250m(list4.size(), "当前共 ", " 个伪造点赞"), c4329cM90t, new C2020n(c4329cM90t, c2023q, activity2, c3360l, arrayListM8397F1, c2009cM815l, list3, z12), new C2209s1(7));
                }
                return c3967n;
            case 3:
                C4629q0 c4629q0 = (C4629q0) obj5;
                C0676v c0676v = (C0676v) obj4;
                C1511d1 c1511d1 = (C1511d1) obj3;
                C0192k c0192k = (C0192k) obj2;
                C0807b c0807b = (C0807b) obj;
                if (c4629q0.m9049b()) {
                    InterfaceC5885g2 interfaceC5885g2 = c4629q0.f15328c;
                    if (interfaceC5885g2 != null) {
                        ((C5892i1) interfaceC5885g2).m10613b();
                    }
                } else {
                    C0676v.m1859a(c0676v);
                }
                if (c4629q0.m9049b() && z10) {
                    if (c4629q0.m9048a() != EnumC4602h0.f15181h) {
                        C4618m1 c4618m1M9051d = c4629q0.m9051d();
                        if (c4618m1M9051d != null) {
                            long j3 = c0807b.f2414a;
                            C0126e c0126e = c4629q0.f15329d;
                            C4642w c4642w = c4629q0.f15347v;
                            int iM9037b = c4618m1M9051d.m9037b(j3, true);
                            c0192k.m861n(iM9037b);
                            c4642w.invoke(C2884s.m6290a((C2884s) c0126e.f332h, null, AbstractC1923e0.m4784b(iM9037b, iM9037b), 5));
                            if (c4629q0.f15326a.f15436a.f6529h.length() > 0) {
                                c4629q0.f15336k.setValue(EnumC4602h0.f15182i);
                            }
                        }
                    } else {
                        c1511d1.m4021g(c0807b);
                    }
                }
                return c3967n;
            default:
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) obj4;
                C1829f1 c1829f1 = (C1829f1) obj3;
                C1829f1 c1829f12 = (C1829f1) obj2;
                C0807b c0807b2 = (C0807b) obj;
                C5763i c5763i = ((C5097m3) obj5).f18834a;
                if (c5763i == null) {
                    z9 = true;
                } else if (c1829f1.m4488g() != 0.0f) {
                    float fM4488g = c1829f1.m4488g() * c5763i.m10457c();
                    float fMo1601x0 = interfaceC4233c.mo1601x0(4);
                    float fIntBitsToFloat = z10 ? Float.intBitsToFloat((int) (c0807b2.f2414a >> 32)) + fMo1601x0 + fM4488g : Float.intBitsToFloat((int) (c0807b2.f2414a >> 32)) + (((c1829f12.m4488g() - fMo1601x0) - c1829f1.m4488g()) - fM4488g);
                    if (0.0f <= fIntBitsToFloat && fIntBitsToFloat <= c1829f12.m4488g()) {
                    }
                }
                return Boolean.valueOf(z9);
        }
    }

    public /* synthetic */ C0490u(Activity activity, String str, List list, boolean z9, C0035c c0035c) {
        this.f1475g = 0;
        this.f1476h = activity;
        this.f1477i = str;
        this.f1479k = list;
        this.f1478j = z9;
        this.f1480l = c0035c;
    }

    public /* synthetic */ C0490u(C2023q c2023q, String str, boolean z9, Activity activity, C3360l c3360l) {
        this.f1475g = 2;
        this.f1479k = c2023q;
        this.f1477i = str;
        this.f1478j = z9;
        this.f1476h = activity;
        this.f1480l = c3360l;
    }

    public /* synthetic */ C0490u(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i9) {
        this.f1475g = i9;
        this.f1476h = obj;
        this.f1477i = obj2;
        this.f1478j = z9;
        this.f1479k = obj3;
        this.f1480l = obj4;
    }
}

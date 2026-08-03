package ca;

import android.app.Activity;
import bi.C0315c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p019b4.C0178b;
import p027c0.C0361f;
import p036c9.C0446i;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p197n9.C2912a;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: ca.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0525l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1627g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1628h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0517e0 f1629i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f1630j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0525l(Activity activity, C0517e0 c0517e0, InterfaceC1231l interfaceC1231l) {
        this.f1628h = activity;
        this.f1629i = c0517e0;
        this.f1630j = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f1627g) {
            case 0:
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C5026jv c5026jv = (C5026jv) obj2;
                    if (!c5026jv.f18251c && !c5026jv.f18255g && !c5026jv.f18254f.isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                C3011i c3011i = new C3011i(new C0795n(list, 6), true, new C0178b(14));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C3010h c3010h = new C3010h(c3011i);
                while (c3010h.hasNext()) {
                    Object next = c3010h.next();
                    linkedHashMap.put(((C5026jv) next).f18249a, next);
                }
                C4329c c4329cM7E = AbstractC0000a.m7E();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4171r.m8432h1(arrayList2, ((C5026jv) it.next()).f18254f);
                }
                for (String str : AbstractC4166m.m8401J1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)))) {
                    List listM6418b0 = AbstractC3015m.m6418b0(AbstractC3015m.m6409S(AbstractC3015m.m6413W(new C3011i(new C0795n(arrayList, 6), true, new C0532s(str, 0)), new C0178b(15))));
                    if (!listM6418b0.isEmpty()) {
                        c4329cM7E.add(new C0509a0(AbstractC4855en.m9263g("好友标签 · ", str), AbstractC3199a.m6836i(listM6418b0.size(), " 人"), listM6418b0));
                    }
                }
                C0517e0 c0517e0 = this.f1629i;
                for (C2912a c2912a : AbstractC5700d.m10254K(c0517e0.f1579a.f12143a)) {
                    List listM6418b02 = AbstractC3015m.m6418b0(AbstractC3015m.m6409S(new C3011i(new C0795n(c2912a.f9411c, 6), true, new C0361f(1, linkedHashMap, AbstractC0921a.m2246i(Map.class), "containsKey", "containsKey(Ljava/lang/Object;)Z", 0, 0, 11))));
                    if (!listM6418b02.isEmpty()) {
                        c4329cM7E.add(new C0509a0(AbstractC4855en.m9263g("群聊标签 · ", c2912a.f9410b), AbstractC3199a.m6836i(listM6418b02.size(), " 个群聊"), listM6418b02));
                    }
                }
                C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                boolean zIsEmpty = c4329cM90t.isEmpty();
                Activity activity = this.f1628h;
                if (zIsEmpty) {
                    c0517e0.m1532r(activity, "没有可用的标签");
                } else {
                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(c4329cM90t));
                    ListIterator listIterator = c4329cM90t.listIterator(0);
                    while (true) {
                        C4327a c4327a = (C4327a) listIterator;
                        if (c4327a.hasNext()) {
                            C0509a0 c0509a0 = (C0509a0) c4327a.next();
                            arrayList3.add(new C3958e(c0509a0.f1557a, c0509a0.f1558b));
                        } else {
                            C5491y2.m9818Z1(activity, "选择标签", HttpUrl.FRAGMENT_ENCODE_SET, arrayList3, null, new C0446i(c4329cM90t, 5, this.f1630j), new C0315c(7), 304);
                        }
                    }
                }
                break;
            default:
                list.getClass();
                Activity activity2 = this.f1628h;
                if (!activity2.isFinishing() && !activity2.isDestroyed()) {
                    if (list.isEmpty()) {
                        this.f1629i.m1532r(activity2, "没有可用联系人");
                    } else {
                        this.f1630j.invoke(list);
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0525l(C0517e0 c0517e0, Activity activity, InterfaceC1231l interfaceC1231l) {
        this.f1629i = c0517e0;
        this.f1628h = activity;
        this.f1630j = interfaceC1231l;
    }
}

package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p036c9.C0416a1;
import p036c9.C0482r0;
import p063e9.C0832c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p211o9.C3105r;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4175v;

/* JADX INFO: renamed from: wb.n7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5134n7 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19123g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f19124h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f19125i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19126j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19127k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f19128l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f19129m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f19130n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5134n7(C5034k6 c5034k6, AtomicBoolean atomicBoolean, String str, C1845j1 c1845j1, Context context, C5518yt c5518yt, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f19123g = i9;
        this.f19130n = c5034k6;
        this.f19126j = atomicBoolean;
        this.f19124h = str;
        switch (i9) {
            case 4:
                this.f19128l = c1845j1;
                this.f19125i = context;
                this.f19129m = c5518yt;
                this.f19127k = interfaceC1809a1;
                break;
            default:
                this.f19127k = c1845j1;
                this.f19125i = context;
                this.f19129m = c5518yt;
                this.f19128l = interfaceC1809a1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object next;
        switch (this.f19123g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f19130n;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f19126j;
                List list = (List) this.f19124h;
                Context context = (Context) this.f19125i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f19127k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f19128l;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f19129m;
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C0832c) it.next()).f2511b);
                }
                Boolean bool = Boolean.FALSE;
                interfaceC1809a1.setValue(bool);
                interfaceC1809a12.setValue(bool);
                interfaceC1809a13.setValue(C4175v.f13712g);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!hashSet.contains(((C0832c) obj).f2511b)) {
                        arrayList2.add(obj);
                    }
                }
                interfaceC1231l.invoke(arrayList2);
                AbstractC4855en.m9271o("已删除 ", arrayList.size(), " 个会话规则", context, 0);
                break;
            case 1:
                List list2 = (List) this.f19124h;
                Context context2 = (Context) this.f19125i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f19126j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f19127k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f19128l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f19129m;
                List list3 = (List) this.f19130n;
                if (list2.isEmpty()) {
                    Toast.makeText(context2, "请先新增模板", 0).show();
                } else if (AbstractC3149m.m6721t0((String) interfaceC1809a14.getValue())) {
                    Toast.makeText(context2, "请先选择模板", 0).show();
                } else if (((Set) interfaceC1809a15.getValue()).isEmpty()) {
                    Toast.makeText(context2, "请先选择群", 0).show();
                } else {
                    List<C5292s0> list4 = (List) interfaceC1809a16.getValue();
                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list4));
                    if (iM8438a0 < 16) {
                        iM8438a0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                    for (C5292s0 c5292s0 : list4) {
                        String str = c5292s0.f20550a;
                        String str2 = c5292s0.f20551b;
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = c5292s0.f20550a;
                        }
                        linkedHashMap.put(str, str2);
                    }
                    Set<String> set = (Set) interfaceC1809a15.getValue();
                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(set));
                    for (String str3 : set) {
                        String str4 = (String) linkedHashMap.get(str3);
                        if (str4 == null) {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (AbstractC1416l.m3825a(((C3105r) next).f10071a, str3)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            C3105r c3105r = (C3105r) next;
                            str4 = c3105r != null ? c3105r.f10072b : null;
                            if (str4 == null) {
                                str4 = str3;
                            }
                        }
                        arrayList3.add(new C3105r(str3, str4, (String) interfaceC1809a14.getValue()));
                    }
                    interfaceC1231l2.invoke(arrayList3);
                }
                return C3967n.f12976a;
            case 2:
                AbstractC4738b4 abstractC4738b4 = (AbstractC4738b4) this.f19130n;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f19126j;
                Map map = (Map) this.f19124h;
                Context context3 = (Context) this.f19125i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f19127k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f19128l;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f19129m;
                Set setM9715y6 = AbstractC4955ho.m9715y6((String) interfaceC1809a17.getValue());
                String str5 = ((C5524z3) abstractC4738b4).f22316a;
                String strM9316D5 = AbstractC4955ho.m9316D5(AbstractC4156d0.m8351S(setM9715y6, str5));
                List list5 = (List) interfaceC1809a18.getValue();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list5) {
                    if (!AbstractC1416l.m3825a(((C3105r) obj2).f10071a, str5)) {
                        arrayList4.add(obj2);
                    }
                }
                AbstractC4955ho.m9572i5(sharedPreferences, str5, strM9316D5, arrayList4);
                interfaceC1809a17.setValue(strM9316D5);
                interfaceC1809a18.setValue(arrayList4);
                map.remove(str5);
                Toast.makeText(context3, "群配置已删除", 0).show();
                interfaceC1809a19.setValue(null);
                break;
            case 3:
                C5034k6 c5034k6 = (C5034k6) this.f19130n;
                C5491y2.m9836n1((AtomicBoolean) this.f19126j, (String) this.f19124h, (InterfaceC1809a1) this.f19127k, (Context) this.f19125i, (C5518yt) this.f19129m, (InterfaceC1809a1) this.f19128l);
                c5034k6.invoke();
                break;
            case 4:
                C5034k6 c5034k62 = (C5034k6) this.f19130n;
                C5491y2.m9836n1((AtomicBoolean) this.f19126j, (String) this.f19124h, (C1845j1) this.f19128l, (Context) this.f19125i, (C5518yt) this.f19129m, (InterfaceC1809a1) this.f19127k);
                c5034k62.invoke();
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19130n;
                Activity activity = (Activity) this.f19126j;
                C1425u c1425u = (C1425u) this.f19124h;
                FrameLayout frameLayout = (FrameLayout) this.f19125i;
                C0416a1 c0416a1 = (C0416a1) this.f19127k;
                ViewGroup viewGroup = (ViewGroup) this.f19128l;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f19129m;
                if (atomicBoolean.compareAndSet(false, true)) {
                    C0482r0 c0482r0 = new C0482r0(c1425u, frameLayout, c0416a1, viewGroup, interfaceC1220a);
                    if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
                        c0482r0.invoke();
                    } else {
                        activity.runOnUiThread(new RunnableC4794cr(c0482r0, 2));
                    }
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5134n7(List list, Context context, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, List list2) {
        this.f19123g = 1;
        this.f19124h = list;
        this.f19125i = context;
        this.f19126j = interfaceC1231l;
        this.f19127k = interfaceC1809a1;
        this.f19128l = interfaceC1809a12;
        this.f19129m = interfaceC1809a13;
        this.f19130n = list2;
    }

    public /* synthetic */ C5134n7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f19123g = i9;
        this.f19130n = obj;
        this.f19126j = obj2;
        this.f19124h = obj3;
        this.f19125i = obj4;
        this.f19127k = obj5;
        this.f19128l = obj6;
        this.f19129m = obj7;
    }
}

package p086r0;

import android.widget.ListView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0294d;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p084q0.C0804d;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1143z;

/* JADX INFO: renamed from: r0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0829D extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0832E f2755b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0829D(C0832E c0832e, int i2) {
        this.f2754a = i2;
        this.f2755b = c0832e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i2;
        Object result;
        String strM1554o;
        Object obj;
        ListView listView;
        boolean z2 = true;
        int i3 = -1;
        C0832E c0832e = this.f2755b;
        switch (this.f2754a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                if (obj2 != null) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    ListView listView2 = objM258f0 instanceof ListView ? (ListView) objM258f0 : null;
                    if (listView2 != null) {
                        c0832e.f2779b = new WeakReference(obj2);
                        c0832e.f2778a = new WeakReference(listView2);
                        boolean z3 = AbstractC1126i.f3786a;
                        if (C1124g.m2448x()) {
                            if (AbstractC1135r.m2499u() && !C0832E.m1559w()) {
                                String strM1547b = C0832E.m1547b();
                                WeakReference weakReference = c0832e.f2784g;
                                if ((weakReference != null ? weakReference.get() : null) == obj2) {
                                    WeakReference weakReference2 = c0832e.f2785h;
                                    if ((weakReference2 != null ? (ListView) weakReference2.get() : null) == listView2) {
                                        z2 = false;
                                    }
                                }
                                boolean zM414a = AbstractC0223g.m414a(c0832e.f2786i, strM1547b);
                                c0832e.f2784g = new WeakReference(obj2);
                                c0832e.f2785h = new WeakReference(listView2);
                                c0832e.f2786i = strM1547b;
                                if (!z2 && zM414a) {
                                }
                            }
                            c0832e.m1564E();
                        }
                        break;
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                if (AbstractC1135r.f3833e == -1) {
                    try {
                        i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                    } catch (Exception e2) {
                        AbstractC0731a.m1385b(e2);
                        i2 = -1;
                    }
                    AbstractC1135r.f3833e = i2;
                }
                if (AbstractC1135r.f3833e == 3080) {
                    AbstractC0731a.m1384a("hide close friend allow 8.0.71 datasource single");
                    break;
                } else {
                    boolean z4 = AbstractC1126i.f3786a;
                    if (C1124g.m2448x() && (result = methodHookParam.getResult()) != null) {
                        c0832e.getClass();
                        List list = (List) C0832E.m1555p(result, "f434481b", "b");
                        if (list != null) {
                            Map map = (Map) C0832E.m1555p(methodHookParam.thisObject, "f434578s", "s");
                            for (int size = list.size() - 1; -1 < size; size--) {
                                Object obj3 = list.get(size);
                                if (obj3 != null && (strM1554o = C0832E.m1554o(obj3)) != null && c0832e.m1565F(strM1554o)) {
                                    list.remove(size);
                                    if (map != null) {
                                        map.remove(strM1554o);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2448x()) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                    String str = objM258f02 instanceof String ? (String) objM258f02 : null;
                    if (str != null && c0832e.m1565F(str)) {
                        Map map2 = (Map) C0832E.m1555p(methodHookParam.thisObject, "f434578s", "s");
                        if (map2 != null) {
                            map2.remove(str);
                        }
                        methodHookParam.setResult((Object) null);
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0832E.m1546a(c0832e, methodHookParam.thisObject);
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0832E.m1546a(c0832e, methodHookParam.thisObject);
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                if (obj4 != null) {
                    c0832e.f2780c = new WeakReference(obj4);
                    AbstractC0731a.m1384a("hide close friend datasource ctor", obj4.getClass().getName());
                    break;
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                if (AbstractC1135r.f3833e == -1) {
                    try {
                        i3 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                    } catch (Exception e3) {
                        AbstractC0731a.m1385b(e3);
                    }
                    AbstractC1135r.f3833e = i3;
                }
                if (AbstractC1135r.f3833e == 3080 && !c0832e.f2781d) {
                    boolean z6 = AbstractC1126i.f3786a;
                    if (C1124g.m2448x()) {
                        Object[] objArr3 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr3, "args");
                        Object objM258f03 = AbstractC0120h.m258f0(1, objArr3);
                        String str2 = objM258f03 instanceof String ? (String) objM258f03 : null;
                        if (str2 != null && c0832e.m1565F(str2) && (obj = methodHookParam.thisObject) != null) {
                            c0832e.f2780c = new WeakReference(obj);
                            WeakReference weakReference3 = c0832e.f2779b;
                            C0832E.m1561y(obj, C0832E.m1552k(weakReference3 != null ? weakReference3.get() : null, obj), str2);
                            WeakReference weakReference4 = c0832e.f2778a;
                            if (weakReference4 != null && (listView = (ListView) weakReference4.get()) != null) {
                                listView.post(new RunnableC0959z(this, c0832e));
                            }
                            Object[] objArr4 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr4, "args");
                            AbstractC0731a.m1384a("hide close friend live update hidden after native", AbstractC0120h.m258f0(0, objArr4), str2);
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        String string;
        boolean z2;
        int length;
        Object obj2;
        C0832E c0832e = this.f2755b;
        switch (this.f2754a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                if (obj3 == null) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    obj3 = objArr.length != 0 ? objArr[0] : null;
                }
                if (obj3 != null) {
                    c0832e.f2783f = obj3;
                    C1143z.f3876a.m2534h(obj3);
                }
                ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2448x() && (obj = methodHookParam.args[1]) != null && (string = obj.toString()) != null) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(2, objArr2);
                    c0832e.getClass();
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                    if (AbstractC0299i.m511i0(lowerCase, "fts", false) || AbstractC0299i.m511i0(lowerCase, "tophits", false) || AbstractC0299i.m511i0(lowerCase, "aux_index", false) || AbstractC0299i.m511i0(lowerCase, "search", false) || AbstractC0299i.m511i0(lowerCase, "matchinfo", false) || AbstractC0299i.m511i0(lowerCase, "snippet", false) || !(AbstractC0299i.m511i0(lowerCase, "rconversation", false) || AbstractC0299i.m511i0(lowerCase, "conversations", false))) {
                        z2 = false;
                    } else if (!C0832E.f2775o.m502a(string)) {
                        if (!c0832e.m1568f(string)) {
                            if (!(!AbstractC0299i.m511i0(lowerCase, "rconversation", false) ? false : c0832e.m1574t(objM258f0)) && !AbstractC0299i.m511i0(lowerCase, " from rconversation", false) && !AbstractC0299i.m511i0(lowerCase, " from conversations", false) && !AbstractC0299i.m511i0(lowerCase, "select * from rconversation", false) && !AbstractC0299i.m511i0(lowerCase, "select * from (select * from rconversation", false)) {
                            }
                        }
                        z2 = true;
                    } else if (c0832e.m1574t(objM258f0) || c0832e.m1568f(string)) {
                        z2 = true;
                    }
                    if (z2) {
                        ArrayList arrayList = ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a;
                        if (!arrayList.isEmpty()) {
                            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : arrayListM266h0) {
                                if (!AbstractC0307q.m534d0((String) obj4)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj5 : arrayList2) {
                                boolean z4 = AbstractC1126i.f3786a;
                                if (!C1124g.m2429e((String) obj5)) {
                                    arrayList3.add(obj5);
                                }
                            }
                            String strM271m0 = AbstractC0123k.m271m0(arrayList3, ",", null, null, new C0804d(22), 30);
                            if (C0832E.m1558v()) {
                                String strM351g = AbstractC0174d.m351g(arrayList.size(), "mask=");
                                boolean z5 = AbstractC1126i.f3786a;
                                AbstractC0731a.m1384a("hide close friend 65-66 sql filter", strM351g, AbstractC0174d.m351g(C1124g.m2439o().size(), "temp="), AbstractC0174d.m355k("hideValueBlank=", AbstractC0307q.m534d0(strM271m0)));
                            }
                            if (!AbstractC0307q.m534d0(strM271m0)) {
                                Object[] objArr3 = methodHookParam.args;
                                String string2 = AbstractC0299i.m508D0(string).toString();
                                boolean zM532b0 = AbstractC0307q.m532b0(string2, ";");
                                if (zM532b0) {
                                    string2 = AbstractC0299i.m513k0(string2);
                                }
                                C0294d c0294dM503b = C0832E.f2777q.m503b(0, string2);
                                if (c0294dM503b != null) {
                                    Matcher matcher = c0294dM503b.f670a;
                                    C0244c c0244cM176U = AbstractC0079h.m176U(matcher.start(), matcher.end());
                                    length = c0244cM176U != null ? c0244cM176U.f583a : string2.length();
                                }
                                String strSubstring = string2.substring(0, length);
                                AbstractC0223g.m417d(strSubstring, "substring(...)");
                                String string3 = AbstractC0299i.m508D0(strSubstring).toString();
                                String strSubstring2 = string2.substring(length);
                                AbstractC0223g.m417d(strSubstring2, "substring(...)");
                                String str = "username NOT IN (" + strM271m0 + ")";
                                objArr3[1] = string3 + (C0832E.f2776p.m502a(string3) ? " AND " : " WHERE ") + str + strSubstring2 + (zM532b0 ? ";" : "");
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                int i2 = -1;
                if (AbstractC1135r.f3833e == -1) {
                    try {
                        i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                    } catch (Exception e2) {
                        AbstractC0731a.m1385b(e2);
                    }
                    AbstractC1135r.f3833e = i2;
                }
                if (AbstractC1135r.f3833e != 3080 && !c0832e.f2781d) {
                    boolean z6 = AbstractC1126i.f3786a;
                    if (C1124g.m2448x()) {
                        Object[] objArr4 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr4, "args");
                        Object objM258f02 = AbstractC0120h.m258f0(1, objArr4);
                        String str2 = objM258f02 instanceof String ? (String) objM258f02 : null;
                        if (str2 != null && c0832e.m1565F(str2) && (obj2 = methodHookParam.thisObject) != null) {
                            c0832e.f2780c = new WeakReference(obj2);
                            WeakReference weakReference = c0832e.f2779b;
                            C0832E.m1561y(obj2, C0832E.m1552k(weakReference != null ? weakReference.get() : null, obj2), str2);
                            methodHookParam.setResult((Object) null);
                            Object[] objArr5 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr5, "args");
                            AbstractC0731a.m1384a("hide close friend live update blocked", AbstractC0120h.m258f0(0, objArr5), str2);
                        }
                        break;
                    }
                }
                break;
        }
    }
}

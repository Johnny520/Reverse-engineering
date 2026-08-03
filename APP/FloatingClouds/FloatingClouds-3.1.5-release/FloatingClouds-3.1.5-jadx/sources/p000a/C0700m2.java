package p000a;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.m2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0700m2 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2646b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0700m2(int i, Object obj) {
        this.f2645a = i;
        this.f2646b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(XposedInterface.Chain chain) {
        boolean zIsEmpty;
        Object obj;
        Object objM2206a;
        Object obj2;
        switch (this.f2645a) {
            case 0:
                C0738o2 c0738o2 = (C0738o2) this.f2646b;
                C0631i9.m1482e(chain, "chain");
                chain.proceed();
                c0738o2.f2915b = chain.getThisObject();
                if (c0738o2.f2914a && C0738o2.m1747e()) {
                    Object thisObject = chain.getThisObject();
                    C0631i9.m1481d(thisObject, "getThisObject(...)");
                    C0186K3.f638a.getClass();
                    c0738o2.m1748a(thisObject, C0267Oc.m748C(C0186K3.a.m508i().f2415G, 0, 100), 2);
                }
                return null;
            case 1:
                C0631i9.m1482e(chain, "chain");
                C0186K3.f638a.getClass();
                C0653jc c0653jcM508i = C0186K3.a.m508i();
                if (!C0186K3.a.m511l() || !c0653jcM508i.f2431a) {
                    return chain.proceed();
                }
                String string = chain.getArgs().get(1).toString();
                ArrayList arrayListM505f = C0186K3.a.m505f();
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                Iterator it = arrayListM505f.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MaskItemBean) it.next()).getMaskId());
                }
                if (!arrayList.isEmpty()) {
                    C0410Wc c0410Wc = (C0410Wc) ((C0910x3) this.f2646b).f3514a.m625a();
                    c0410Wc.getClass();
                    C0631i9.m1482e(string, "input");
                    if (c0410Wc.f1559a.matcher(string).find() || C0015Ae.m49H(string, "SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM FTS5MetaMessage", false) || C0015Ae.m49H(string, "SELECT FTS5MetaMessage.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM FTS5MetaMessage", false)) {
                        List args = chain.getArgs();
                        C0631i9.m1481d(args, "getArgs(...)");
                        ArrayList arrayListM1961y0 = C0834t3.m1961y0(args);
                        String strM1952p0 = C0834t3.m1952p0(arrayList, ",", new C0586g2(4), 30);
                        if (string.endsWith(";")) {
                            string = C0053Ce.m142W(string);
                        }
                        arrayListM1961y0.set(1, "SELECT * FROM (" + string + ") AS a WHERE aux_index NOT IN (" + strM1952p0 + ");");
                        C0726n9.m1670m("sql hide hit:", arrayListM1961y0.get(1));
                        return chain.proceed(arrayListM1961y0.toArray(new Object[0]));
                    }
                }
                return chain.proceed();
            case 2:
                C0611h8 c0611h8 = (C0611h8) this.f2646b;
                C0631i9.m1482e(chain, "chain");
                c0611h8.f2259a = chain.getThisObject();
                if (c0611h8.f2261c) {
                    return chain.proceed();
                }
                Object obj3 = chain.getArgs().get(0);
                if (obj3 instanceof List) {
                    c0611h8.f2264f = new ArrayList((Collection) obj3);
                }
                Object objProceed = chain.proceed();
                List list = C0198Kf.m549b(objProceed) ? (List) objProceed : null;
                if (list == null) {
                    return chain.proceed();
                }
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && C0186K3.a.m508i().f2445o) {
                    Boolean bool = C0186K3.f649l;
                    if (bool != null) {
                        zIsEmpty = bool.booleanValue();
                    } else {
                        zIsEmpty = C0186K3.a.m505f().isEmpty();
                        C0186K3.f649l = Boolean.valueOf(zIsEmpty);
                    }
                    if (!zIsEmpty) {
                        C0915x8 c0915x8 = C0915x8.f3530a;
                        if (!C0915x8.m2203a()) {
                            ArrayList arrayListM1462c = c0611h8.m1462c(list);
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: e() total=" + list.size() + " hidden=" + (list.size() - arrayListM1462c.size())}, 1));
                            if (!arrayListM1462c.isEmpty()) {
                                c0611h8.f2261c = true;
                                try {
                                    Method method = c0611h8.f2266h;
                                    Object objInvoke = method != null ? method.invoke(chain.getThisObject(), new ArrayList(arrayListM1462c)) : null;
                                    List list2 = objInvoke instanceof List ? (List) objInvoke : null;
                                    if (list2 != null) {
                                        if (!list2.isEmpty()) {
                                            c0611h8.f2261c = false;
                                            return list2;
                                        }
                                    }
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                                break;
                            }
                            return arrayListM1462c;
                        }
                    }
                }
                return list;
            case 3:
                C0820s8 c0820s8 = (C0820s8) this.f2646b;
                C0631i9.m1482e(chain, "chain");
                Object obj4 = chain.getArgs().get(1);
                Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                if (num == null) {
                    return chain.proceed();
                }
                int iIntValue = num.intValue();
                Object obj5 = chain.getArgs().get(0);
                chain.proceed();
                if (!C0820s8.m1920b() || obj5 == null || (obj = c0820s8.f3273a) == null) {
                    return null;
                }
                try {
                    Object objM19h = C0002A1.m19h(obj, "data");
                    objM2206a = objM19h instanceof List ? (List) objM19h : null;
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                boolean z = objM2206a instanceof C0901wd.a;
                Object obj6 = objM2206a;
                if (z) {
                    obj6 = null;
                }
                List list3 = (List) obj6;
                if (list3 == null || iIntValue >= list3.size() || (obj2 = list3.get(iIntValue)) == null) {
                    return null;
                }
                Object objM12a = C0002A1.m12a(obj2, "getUserName", new Object[0]);
                String str = objM12a instanceof String ? (String) objM12a : null;
                if (str == null) {
                    Object objM12a2 = C0002A1.m12a(obj2, "n", new Object[0]);
                    if (objM12a2 != null) {
                        Object objM12a3 = C0002A1.m12a(objM12a2, "getUserName", new Object[0]);
                        str = objM12a3 instanceof String ? (String) objM12a3 : null;
                        if (str == null) {
                            str = null;
                        }
                    }
                }
                if (str == null) {
                    return null;
                }
                ExecutorService executorService = C0582fh.f2149G;
                if (!C0582fh.a.m1423a(str)) {
                    return null;
                }
                try {
                    Object objM19h2 = C0002A1.m19h(obj5, "itemView");
                    View view = objM19h2 instanceof View ? (View) objM19h2 : null;
                    if (view == null) {
                        return null;
                    }
                    view.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        return null;
                    }
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
                break;
            case 4:
                C0631i9.m1482e(chain, "chain");
                chain.proceed();
                Object thisObject2 = chain.getThisObject();
                View view2 = thisObject2 instanceof View ? (View) thisObject2 : null;
                if (view2 != null) {
                    ((C0858u8) this.f2646b).m1988c(view2);
                }
                return null;
            case 5:
                C0631i9.m1482e(chain, "chain");
                Object thisObject3 = chain.getThisObject();
                if (!C0896w8.m2182c() || !((Class) this.f2646b).isInstance(thisObject3)) {
                    return chain.proceed();
                }
                C0631i9.m1479b(thisObject3);
                C0896w8.m2180a(thisObject3, C0896w8.m2184e());
                return chain.proceed();
            case 6:
                C0631i9.m1482e(chain, "chain");
                Object objProceed2 = chain.proceed();
                Cursor cursor = objProceed2 instanceof Cursor ? (Cursor) objProceed2 : null;
                if (cursor == null) {
                    return objProceed2;
                }
                C0896w8 c0896w8 = (C0896w8) this.f2646b;
                if (C0896w8.m2182c() && !(cursor instanceof C0322Re)) {
                    HashSet hashSetM2184e = C0896w8.m2184e();
                    WeakHashMap<Cursor, C0322Re> weakHashMap = c0896w8.f3498a;
                    try {
                        C0322Re c0322Re = weakHashMap.get(cursor);
                        if (c0322Re == null || c0322Re.isClosed()) {
                            c0322Re = new C0322Re(cursor, hashSetM2184e);
                            weakHashMap.put(cursor, c0322Re);
                            int i = c0322Re.f1155b;
                            if (i > 0) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] snsMsg filter " + i}, 1));
                            }
                            break;
                        }
                        return c0322Re;
                    } catch (Throwable th2) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("[HideSnsInteraction] snsMsg wrap fail: ", th2.getMessage())}, 1));
                    }
                }
                return cursor;
            default:
                C0631i9.m1482e(chain, "chain");
                return C0742o6.m1761a((C0742o6) this.f2646b, new C0004A3(5, chain));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0700m2(C0896w8 c0896w8, Class cls) {
        this.f2645a = 5;
        this.f2646b = cls;
    }
}

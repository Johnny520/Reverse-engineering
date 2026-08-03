package p000a;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.github.libxposed.api.XposedInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.g4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0588g4 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0816s4 f2190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0173J8 f2191c;

    public /* synthetic */ C0588g4(C0816s4 c0816s4, C0173J8 c0173j8, int i) {
        this.f2189a = i;
        this.f2190b = c0816s4;
        this.f2191c = c0173j8;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        Object objM2206a;
        ThreadLocal<Boolean> threadLocal;
        Boolean bool;
        Object objInvoke;
        Object objM2206a2;
        int i = 0;
        switch (this.f2189a) {
            case 0:
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                Object obj2 = chain.getArgs().get(0);
                if (obj2 != null && C0015Ae.m49H(obj2.getClass().getName(), "com.tencent.mm.ui.conversation", false)) {
                    this.f2190b.m1908p(this.f2191c, obj2.getClass());
                }
                return objProceed;
            case 1:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object objProceed2 = chain2.proceed();
                Object obj3 = chain2.getArgs().get(0);
                if (obj3 != null) {
                    String name = obj3.getClass().getName();
                    C0908x1.m2194b("[DIAG-T3-LV] ListView.setAdapter called, adapter=".concat(name));
                    C0816s4 c0816s4 = this.f2190b;
                    if (c0816s4.m1911s(obj3) && !C0015Ae.m49H(name, "com.tencent.mm.ui.contact", false)) {
                        C0908x1.m2194b("[DIAG-T3-LV] target adapter matched: ".concat(name));
                        Object thisObject = chain2.getThisObject();
                        ListView listView = thisObject instanceof ListView ? (ListView) thisObject : null;
                        if (listView != null) {
                            c0816s4.f3243j = new WeakReference<>(listView);
                        }
                        c0816s4.m1906n(this.f2191c, obj3.getClass());
                    }
                }
                return objProceed2;
            default:
                C0816s4 c0816s42 = this.f2190b;
                C0173J8 c0173j8 = this.f2191c;
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                if (!c0816s42.f3238e.get()) {
                    C0186K3.f638a.getClass();
                    if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
                        return chain3.proceed();
                    }
                }
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (!C0915x8.m2203a()) {
                    C0186K3.f638a.getClass();
                    if (!C0186K3.a.m505f().isEmpty() && !C0631i9.m1478a(c0816s42.f3255v.get(), Boolean.TRUE)) {
                        Object thisObject2 = chain3.getThisObject();
                        if (thisObject2 == null) {
                            return chain3.proceed();
                        }
                        if (!c0816s42.f3254u.contains(thisObject2.getClass()) && (thisObject2 instanceof ListAdapter)) {
                            try {
                                Method declaredMethod = thisObject2.getClass().getDeclaredMethod("getCount", null);
                                C0631i9.m1479b(declaredMethod);
                                c0173j8.m470f(declaredMethod).intercept(new C0759p4(c0816s42, c0173j8));
                                c0816s42.f3254u.add(thisObject2.getClass());
                            } catch (Throwable th) {
                            }
                            break;
                        }
                        if (!c0816s42.f3246m.containsKey(thisObject2) || C0631i9.m1478a(c0816s42.f3247n.get(thisObject2), Boolean.TRUE)) {
                            Boolean bool2 = c0816s42.f3255v.get();
                            Boolean bool3 = Boolean.TRUE;
                            if (!C0631i9.m1478a(bool2, bool3)) {
                                C0915x8 c0915x82 = C0915x8.f3530a;
                                if (!C0915x8.m2203a()) {
                                    c0816s42.f3255v.set(bool3);
                                    try {
                                        try {
                                            Object objM12a = C0002A1.m12a(thisObject2, "getCount", new Object[0]);
                                            objM2206a = objM12a instanceof Integer ? (Integer) objM12a : null;
                                        } finally {
                                        }
                                        if (objM2206a instanceof C0901wd.a) {
                                            objM2206a = null;
                                        }
                                        Integer num = (Integer) objM2206a;
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            if (iIntValue <= 0) {
                                                c0816s42.f3246m.put(thisObject2, new int[0]);
                                                ConcurrentHashMap<Object, Boolean> concurrentHashMap = c0816s42.f3247n;
                                                Boolean bool4 = Boolean.FALSE;
                                                concurrentHashMap.put(thisObject2, bool4);
                                                c0816s42.f3255v.set(bool4);
                                            } else {
                                                int[] iArr = new int[iIntValue];
                                                Method method = C0816s4.f3228Q;
                                                C0186K3.f638a.getClass();
                                                ArrayList arrayListM505f = C0186K3.a.m505f();
                                                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                                                Iterator it = arrayListM505f.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((MaskItemBean) it.next()).getMaskId());
                                                }
                                                HashSet hashSet = new HashSet(arrayList);
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] rebuildFilterCache: masks=" + arrayListM505f.size() + " items=" + iIntValue}, 1));
                                                StringBuilder sb = new StringBuilder();
                                                int i2 = 0;
                                                for (int i3 = 0; i3 < iIntValue; i3++) {
                                                    if (method != null) {
                                                        try {
                                                            objInvoke = method.invoke(thisObject2, Integer.valueOf(i3));
                                                        } catch (Throwable th2) {
                                                        }
                                                        if (objInvoke instanceof C0901wd.a) {
                                                            objInvoke = null;
                                                        }
                                                    } else {
                                                        try {
                                                            objInvoke = C0002A1.m12a(thisObject2, "getItem", Integer.valueOf(i3));
                                                        } catch (Throwable th22) {
                                                        }
                                                        if (objInvoke instanceof C0901wd.a) {
                                                            objInvoke = null;
                                                        }
                                                    }
                                                    if (objInvoke != null) {
                                                        String strM1895a = c0816s42.m1895a(objInvoke);
                                                        if (strM1895a == null || !hashSet.contains(strM1895a)) {
                                                            iArr[i2] = i3;
                                                            i2++;
                                                        } else if (i < 5 && !C0015Ae.m49H(strM1895a, "wxid_", true)) {
                                                            sb.append(strM1895a + ", ");
                                                            i++;
                                                        }
                                                    }
                                                    break;
                                                }
                                                if (i > 0) {
                                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] non-standard wxid in mask: " + ((Object) sb)}, 1));
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj4 : arrayListM505f) {
                                                    if (!C0015Ae.m49H(((MaskItemBean) obj4).getMaskId(), "wxid_", true)) {
                                                        arrayList2.add(obj4);
                                                    }
                                                }
                                                if (!arrayList2.isEmpty()) {
                                                    ArrayList arrayList3 = new ArrayList(C0758p3.m1800g0(arrayList2, 10));
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList3.add(((MaskItemBean) it2.next()).getMaskId());
                                                    }
                                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] non-standard wxid in scan: " + arrayList3}, 1));
                                                }
                                                c0816s42.f3246m.put(thisObject2, iArr);
                                                c0816s42.f3248o.put(thisObject2, Integer.valueOf(i2));
                                                c0816s42.f3249p.put(thisObject2, num);
                                                ConcurrentHashMap<Object, Boolean> concurrentHashMap2 = c0816s42.f3247n;
                                                bool = Boolean.FALSE;
                                                concurrentHashMap2.put(thisObject2, bool);
                                                threadLocal = c0816s42.f3255v;
                                            }
                                        } else {
                                            threadLocal = c0816s42.f3255v;
                                            bool = Boolean.FALSE;
                                        }
                                        threadLocal.set(bool);
                                    } catch (Throwable th3) {
                                        c0816s42.f3255v.set(Boolean.FALSE);
                                    }
                                }
                            }
                            break;
                        }
                        int[] iArr2 = c0816s42.f3246m.get(thisObject2);
                        if (iArr2 == null) {
                            return chain3.proceed();
                        }
                        Object obj5 = chain3.getArgs().get(0);
                        Integer num2 = obj5 instanceof Integer ? (Integer) obj5 : null;
                        if (num2 == null) {
                            return chain3.proceed();
                        }
                        int iIntValue2 = num2.intValue();
                        Integer num3 = c0816s42.f3248o.get(thisObject2);
                        int iIntValue3 = num3 != null ? num3.intValue() : iArr2.length;
                        if (iIntValue2 < 0 || iIntValue2 >= iIntValue3) {
                            return chain3.proceed();
                        }
                        Integer numValueOf = (iIntValue2 < 0 || iIntValue2 >= iArr2.length) ? null : Integer.valueOf(iArr2[iIntValue2]);
                        if (numValueOf != null) {
                            iIntValue2 = numValueOf.intValue();
                        }
                        if (chain3.getArgs().size() < 3) {
                            return chain3.proceed();
                        }
                        Object objProceed3 = chain3.proceed(new Object[]{Integer.valueOf(iIntValue2), chain3.getArgs().get(1), chain3.getArgs().get(2)});
                        if (objProceed3 instanceof View) {
                            try {
                                ListAdapter listAdapter = thisObject2 instanceof ListAdapter ? (ListAdapter) thisObject2 : null;
                                objM2206a2 = listAdapter != null ? listAdapter.getItem(iIntValue2) : null;
                            } catch (Throwable th4) {
                                objM2206a2 = C0920xd.m2206a(th4);
                            }
                            Object obj6 = objM2206a2 instanceof C0901wd.a ? null : objM2206a2;
                            String strM1895a2 = obj6 != null ? c0816s42.m1895a(obj6) : null;
                            if (strM1895a2 != null) {
                                ExecutorService executorService = C0582fh.f2149G;
                                if (C0582fh.a.m1423a(strM1895a2)) {
                                    Field field = C0816s4.f3227P;
                                    if (field != null) {
                                        try {
                                            field.set(obj6, "");
                                            C0413Wf c0413Wf = C0413Wf.f1577a;
                                        } catch (Throwable th5) {
                                            C0920xd.m2206a(th5);
                                        }
                                    } else {
                                        try {
                                            C0002A1.m20i(obj6, "field_content", "");
                                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                        } catch (Throwable th6) {
                                            C0920xd.m2206a(th6);
                                        }
                                    }
                                    try {
                                        C0002A1.m20i(obj6, "field_digest", "");
                                        C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                    } catch (Throwable th222) {
                                    }
                                    View view = (View) objProceed3;
                                    c0816s42.m1905m(view);
                                    c0816s42.m1904l(view);
                                }
                            }
                            break;
                        }
                        return objProceed3;
                    }
                }
                return chain3.proceed();
        }
    }
}

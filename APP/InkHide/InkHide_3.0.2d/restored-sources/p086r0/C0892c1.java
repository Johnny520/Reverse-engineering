package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.C0022W;
import p001A0.RunnableC0044q;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1140w;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0892c1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0901f1 f3078b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0892c1(C0901f1 c0901f1, int i2) {
        this.f3077a = i2;
        this.f3078b = c0901f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Window window;
        View decorView;
        int identifier;
        Field fieldM2513g;
        Object c0104d;
        boolean z2;
        int i2 = 0;
        int i3 = 1;
        int i4 = this.f3077a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i4) {
            case 0:
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2412C()) {
                    Object obj = methodHookParam.thisObject;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    this.f3078b.getClass();
                    if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (identifier = activity.getResources().getIdentifier("pt", "id", activity.getPackageName())) != 0) {
                        long[] jArr = C0901f1.f3168k;
                        while (i2 < 6) {
                            decorView.postDelayed(new RunnableC0044q(decorView, identifier, i3), jArr[i2]);
                            i2++;
                        }
                    }
                    break;
                }
                break;
            default:
                Object result = methodHookParam.getResult();
                if (result != null) {
                    boolean z4 = AbstractC1126i.f3786a;
                    boolean zM2412C = C1124g.m2412C();
                    List list = C0131s.f426a;
                    if (zM2412C) {
                        ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
                        C0022W c0022w = AbstractC1140w.f3852g;
                        List list2 = c0022w != null ? c0022w.f171i : null;
                        if (list2 == null) {
                            list2 = list;
                        }
                        Iterator it = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list2, AbstractC1140w.f3857l))).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String str = (String) it.next();
                                ConcurrentHashMap concurrentHashMap2 = AbstractC1140w.f3846a;
                                fieldM2513g = AbstractC1140w.m2513g(result.getClass(), str);
                                if (fieldM2513g != null) {
                                }
                            } else {
                                fieldM2513g = null;
                            }
                        }
                        if (fieldM2513g != null) {
                            try {
                                fieldM2513g.setAccessible(true);
                                Object obj2 = fieldM2513g.get(result);
                                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                                if ((number != null ? number.intValue() : 0) == 0) {
                                    z2 = false;
                                } else {
                                    if (AbstractC0223g.m414a(fieldM2513g.getType(), Integer.TYPE)) {
                                        fieldM2513g.setInt(result, 0);
                                    } else {
                                        fieldM2513g.set(result, 0);
                                    }
                                    z2 = true;
                                }
                                c0104d = Boolean.valueOf(z2);
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                            Throwable thM246a = AbstractC0105e.m246a(c0104d);
                            if (thM246a != null) {
                                AbstractC0731a.m1387d("sns clear group icon flag fail", thM246a);
                            }
                            Boolean bool = Boolean.FALSE;
                            if (c0104d instanceof C0104d) {
                                c0104d = bool;
                            }
                        }
                    }
                    boolean z5 = AbstractC1126i.f3786a;
                    if (C1124g.m2448x()) {
                        if (C1124g.m2443s() && C1124g.m2435k().getHideSnsLike()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            ConcurrentHashMap concurrentHashMap3 = AbstractC1140w.f3846a;
                            this.f3078b.getClass();
                            Set setM1918h = C0901f1.m1918h();
                            if (!setM1918h.isEmpty()) {
                                C0022W c0022w2 = AbstractC1140w.f3852g;
                                List list3 = c0022w2 != null ? c0022w2.f172j : null;
                                if (list3 == null) {
                                    list3 = list;
                                }
                                List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list3, AbstractC1140w.f3858m)));
                                C0022W c0022w3 = AbstractC1140w.f3852g;
                                List list4 = c0022w3 != null ? c0022w3.f173k : null;
                                if (list4 == null) {
                                    list4 = list;
                                }
                                List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list4, AbstractC1140w.f3859n)));
                                C0022W c0022w4 = AbstractC1140w.f3852g;
                                List list5 = c0022w4 != null ? c0022w4.f174l : null;
                                if (list5 == null) {
                                    list5 = list;
                                }
                                AbstractC1140w.m2512f(result, listM281w0, listM281w02, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list5, AbstractC1140w.f3860o))), setM1918h);
                                C0022W c0022w5 = AbstractC1140w.f3852g;
                                List list6 = c0022w5 != null ? c0022w5.f175m : null;
                                if (list6 == null) {
                                    list6 = list;
                                }
                                List listM281w03 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list6, AbstractC1140w.f3861p)));
                                C0022W c0022w6 = AbstractC1140w.f3852g;
                                List list7 = c0022w6 != null ? c0022w6.f176n : null;
                                if (list7 == null) {
                                    list7 = list;
                                }
                                List listM281w04 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list7, AbstractC1140w.f3862q)));
                                C0022W c0022w7 = AbstractC1140w.f3852g;
                                List list8 = c0022w7 != null ? c0022w7.f177o : null;
                                if (list8 != null) {
                                    list = list8;
                                }
                                AbstractC1140w.m2512f(result, listM281w03, listM281w04, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, AbstractC1140w.f3863r))), setM1918h);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}

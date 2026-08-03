package p000a;

import android.util.Log;
import android.view.View;
import io.github.libxposed.api.XposedInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a.n8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0725n8 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0782q8 f2846b;

    public /* synthetic */ C0725n8(C0782q8 c0782q8, int i) {
        this.f2845a = i;
        this.f2846b = c0782q8;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        ArrayList arrayListM1832f;
        switch (this.f2845a) {
            case 0:
                C0782q8 c0782q8 = this.f2846b;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                try {
                    c0782q8.getClass();
                    if (C0782q8.m1826j() && !C0631i9.m1478a(c0782q8.f3090h.get(), Boolean.TRUE)) {
                        Object thisObject = chain.getThisObject();
                        C0631i9.m1481d(thisObject, "getThisObject(...)");
                        c0782q8.m1836n(thisObject);
                    }
                    break;
                } catch (Throwable unused) {
                }
                return objProceed;
            case 1:
                C0782q8 c0782q82 = this.f2846b;
                C0631i9.m1482e(chain, "chain");
                Object objProceed2 = chain.proceed();
                try {
                    if (C0782q8.m1826j() && objProceed2 != null && objProceed2.getClass().getName().equals("com.tencent.mm.ui.contact.item.q1")) {
                        c0782q82.m1831e(objProceed2);
                    }
                    break;
                } catch (Exception unused2) {
                }
                return objProceed2;
            case 2:
                C0782q8 c0782q83 = this.f2846b;
                C0631i9.m1482e(chain, "chain");
                Object thisObject2 = chain.getThisObject();
                Object obj = chain.getArgs().get(0);
                chain.proceed();
                try {
                    if (C0782q8.m1826j() && obj != null && obj.getClass().getName().equals("com.tencent.mm.view.recyclerview.WxRecyclerAdapter") && (thisObject2 instanceof View) && C0631i9.m1478a(C0782q8.m1823a(((View) thisObject2).getContext()), "com.tencent.mm.ui.mvvm.MvvmContactListUI")) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] WxRecyclerAdapter captured from RecyclerView, scheduling filter"}, 1));
                        c0782q83.m1835m(obj);
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("MyPlugin-DexKit: [RecentForward] StdRv setAdapter filter err: ", th.getMessage())}, 1));
                    return null;
                }
            case 3:
                C0782q8 c0782q84 = this.f2846b;
                C0631i9.m1482e(chain, "chain");
                Object objProceed3 = chain.proceed();
                try {
                    if (!C0782q8.m1826j()) {
                        return objProceed3;
                    }
                    List list = objProceed3 instanceof List ? (List) objProceed3 : null;
                    if (list == null || (arrayListM1832f = c0782q84.m1832f(list)) == null) {
                        return objProceed3;
                    }
                    Log.i("MyPlugin-DexKit", "[RecentForward] SelectContactMvvmList.e filtered " + (list.size() - arrayListM1832f.size()) + "/" + list.size());
                    return arrayListM1832f;
                } catch (Throwable th2) {
                    Log.w("MyPlugin-DexKit", "[RecentForward] SelectContactMvvmList.e filter err: " + th2.getMessage());
                    return objProceed3;
                }
            default:
                C0782q8 c0782q85 = this.f2846b;
                C0631i9.m1482e(chain, "chain");
                Object objProceed4 = chain.proceed();
                try {
                    if (C0782q8.m1826j()) {
                        Object thisObject3 = chain.getThisObject();
                        C0631i9.m1481d(thisObject3, "getThisObject(...)");
                        c0782q85.m1834h(thisObject3);
                        break;
                    }
                } catch (Throwable unused3) {
                }
                return objProceed4;
        }
    }
}

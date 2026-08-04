package yyds;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: yyds.ᛷᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1680 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1680 f8568 = new C1680();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final ThreadLocal f8567 = new ThreadLocal();

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() throws JSONException, NoSuchMethodException {
        Object c2658;
        C1329 c1329 = C1329.f6114;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-639567447884654L, -639692001936238L);
        if (c0757 != null) {
            C0757.m1702(c0757, m678());
        }
        C0757 c07572 = (C0757) AbstractC2104.m4019(-639911045268334L, -640061369123694L);
        Method methodM1702 = c07572 != null ? C0757.m1702(c07572, m678()) : null;
        String strM4341 = AbstractC2328.m4341(-639730656641902L);
        AbstractC2328.m4341(-639872390562670L);
        List<C0757> listM3252 = C1586.m3252(strM4341);
        ArrayList arrayList = new ArrayList();
        for (C0757 c07573 : listM3252) {
            try {
                c2658 = C0757.m1702(c07573, f8568.m678());
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-957017070666606L) + c07573, thM4249);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            Method method = (Method) c2658;
            if (method != null) {
                arrayList.add(method);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((Method) obj).toGenericString())) {
                arrayList2.add(obj);
            }
        }
        for (Method method2 : arrayList2) {
            C1329 c13292 = C1329.f6114;
            C2701.f13261.getClass();
            XposedInterface.HookHandle hookHandleIntercept = C2701.m4785().hook(method2).intercept(new C2043(0));
            AbstractC2328.m4341(-957085790143342L);
            C0174.f998.getClass();
            C0174.m734(hookHandleIntercept);
        }
        m673(methodM1702, null, new C0061(24));
        C1329 c13293 = C1329.f6114;
        C0757 c07574 = (C0757) AbstractC2104.m4019(-640100023829358L, -640250347684718L);
        m673(c07574 != null ? C0757.m1702(c07574, m678()) : null, null, new C0061(25));
    }
}

package yyds;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: yyds.ᲈᛵᛲᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2651 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final ThreadLocal f13049;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2651 f13050;

    static {
        AbstractC2328.m4341(-975090293048174L);
        f13050 = new C2651();
        f13049 = new ThreadLocal();
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() throws JSONException {
        Object c2658;
        C1329 c1329 = C1329.f6114;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-642488025645934L, -642603989762926L);
        Method methodM1702 = c0757 != null ? C0757.m1702(c0757, m678()) : null;
        String strM4341 = AbstractC2328.m4341(-642642644468590L);
        AbstractC2328.m4341(-642775788454766L);
        List<C0757> listM3252 = C1586.m3252(strM4341);
        ArrayList arrayList = new ArrayList();
        for (C0757 c07572 : listM3252) {
            try {
                c2658 = C0757.m1702(c07572, f13050.m678());
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-974484702659438L) + c07572, thM4249);
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
            XposedInterface.HookHandle hookHandleIntercept = C2701.m4785().hook(method2).intercept(new C2043(1));
            AbstractC2328.m4341(-974553422136174L);
            C0174.f998.getClass();
            C0174.m734(hookHandleIntercept);
        }
        if (methodM1702 != null && !arrayList2.isEmpty()) {
            m673(methodM1702, null, new C0951(15));
        }
        C1329 c13293 = C1329.f6114;
        C0757 c07573 = (C0757) AbstractC2104.m4019(-642814443160430L, -642960472048494L);
        m673(c07573 != null ? C0757.m1702(c07573, m678()) : null, null, new C0951(16));
    }
}

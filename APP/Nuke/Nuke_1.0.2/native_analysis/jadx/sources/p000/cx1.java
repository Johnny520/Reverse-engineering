package p000;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1766h = 0;

    /* JADX INFO: renamed from: i */
    public final Method f1767i;

    /* JADX INFO: renamed from: j */
    public final int f1768j;

    /* JADX INFO: renamed from: k */
    public final x00 f1769k;

    /* JADX INFO: renamed from: l */
    public final Object f1770l;

    public cx1(Method method, int i, x00 x00Var, String str) {
        this.f1767i = method;
        this.f1768j = i;
        this.f1769k = x00Var;
        this.f1770l = str;
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f1766h;
        x00 x00Var = this.f1769k;
        Object obj2 = this.f1770l;
        Method method = this.f1767i;
        int i2 = this.f1768j;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    r82Var.m4406c((js0) obj2, (o82) x00Var.mo1846j(obj));
                    return;
                } catch (IOException e) {
                    throw xe1.m6110a0(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw xe1.m6110a0(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw xe1.m6110a0(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw xe1.m6110a0(method, i2, vi0.m5691j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", vi0.m5691j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    js0 js0Var = js0.f5193i;
                    r82Var.m4406c(ci0.m791P(strArr), (o82) x00Var.mo1846j(value));
                }
                return;
        }
    }

    public cx1(Method method, int i, js0 js0Var, x00 x00Var) {
        this.f1767i = method;
        this.f1768j = i;
        this.f1770l = js0Var;
        this.f1769k = x00Var;
    }
}

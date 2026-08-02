package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends op0 {
    public final /* synthetic */ int h = 0;
    public final Method i;
    public final int j;
    public final x00 k;
    public final Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cx1(Method method, int i, x00 x00Var, String str) {
        this.i = method;
        this.j = i;
        this.k = x00Var;
        this.l = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.op0
    public final void j(r82 r82Var, Object obj) {
        int i = this.h;
        x00 x00Var = this.k;
        Object obj2 = this.l;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    r82Var.c((js0) obj2, (o82) x00Var.j(obj));
                    return;
                } catch (IOException e) {
                    throw xe1.a0(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw xe1.a0(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw xe1.a0(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw xe1.a0(method, i2, vi0.j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", vi0.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    js0 js0Var = js0.i;
                    r82Var.c(ci0.P(strArr), (o82) x00Var.j(value));
                }
                return;
        }
    }

    public cx1(Method method, int i, js0 js0Var, x00 x00Var) {
        this.i = method;
        this.j = i;
        this.l = js0Var;
        this.k = x00Var;
    }
}

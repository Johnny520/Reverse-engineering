package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends op0 {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;
    public final boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ax1(Method method, int i, boolean z, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
        this.k = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.op0
    public final void j(r82 r82Var, Object obj) {
        int i = this.h;
        boolean z = this.k;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw xe1.a0(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw xe1.a0(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw xe1.a0(method, i2, vi0.j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw xe1.a0(method, i2, "Field map value '" + value + "' converted to null by " + sn.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    r82Var.a(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw xe1.a0(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw xe1.a0(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw xe1.a0(method, i2, vi0.j("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    r82Var.b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw xe1.a0(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw xe1.a0(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw xe1.a0(method, i2, vi0.j("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw xe1.a0(method, i2, "Query map value '" + value3 + "' converted to null by " + sn.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    r82Var.d(str3, string2, z);
                }
                return;
        }
    }
}

package p000;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f434h;

    /* JADX INFO: renamed from: i */
    public final Method f435i;

    /* JADX INFO: renamed from: j */
    public final int f436j;

    /* JADX INFO: renamed from: k */
    public final boolean f437k;

    public /* synthetic */ ax1(Method method, int i, boolean z, int i2) {
        this.f434h = i2;
        this.f435i = method;
        this.f436j = i;
        this.f437k = z;
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f434h;
        boolean z = this.f437k;
        Method method = this.f435i;
        int i2 = this.f436j;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw xe1.m6110a0(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw xe1.m6110a0(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw xe1.m6110a0(method, i2, vi0.m5691j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw xe1.m6110a0(method, i2, "Field map value '" + value + "' converted to null by " + C0700sn.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    r82Var.m4404a(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw xe1.m6110a0(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw xe1.m6110a0(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw xe1.m6110a0(method, i2, vi0.m5691j("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    r82Var.m4405b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw xe1.m6110a0(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw xe1.m6110a0(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw xe1.m6110a0(method, i2, vi0.m5691j("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw xe1.m6110a0(method, i2, "Query map value '" + value3 + "' converted to null by " + C0700sn.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    r82Var.m4407d(str3, string2, z);
                }
                return;
        }
    }
}

package retrofit2;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5776 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f15860;

    public /* synthetic */ C5776(int i, int i2, Method method, boolean z) {
        this.f15859 = i2;
        this.f15858 = method;
        this.f15857 = i;
        this.f15860 = z;
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15859;
        boolean z = this.f15860;
        Method method = this.f15858;
        int i2 = this.f15857;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC5785.m11181(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC5785.m11181(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC5785.m11181(method, i2, AbstractC0053.m158("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC5785.m11181(method, i2, "Field map value '" + value + "' converted to null by " + C5781.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c5759.m11147(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw AbstractC5785.m11181(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC5785.m11181(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC5785.m11181(method, i2, AbstractC0053.m158("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c5759.m11146(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw AbstractC5785.m11181(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC5785.m11181(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC5785.m11181(method, i2, AbstractC0053.m158("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC5785.m11181(method, i2, "Query map value '" + value3 + "' converted to null by " + C5781.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c5759.m11144(str3, string2, z);
                }
                return;
        }
    }
}

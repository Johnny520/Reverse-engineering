package retrofit2;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6606 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f16202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f16203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16204;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16205;

    public /* synthetic */ C6606(int i, int i2, Method method, boolean z) {
        this.f16204 = i2;
        this.f16203 = method;
        this.f16202 = i;
        this.f16205 = z;
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16204;
        boolean z = this.f16205;
        Method method = this.f16203;
        int i2 = this.f16202;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC6615.m11740(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC6615.m11740(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC6615.m11740(method, i2, AbstractC0900.m718("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC6615.m11740(method, i2, "Field map value '" + value + "' converted to null by " + C6611.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c6589.m11706(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw AbstractC6615.m11740(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC6615.m11740(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC6615.m11740(method, i2, AbstractC0900.m718("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c6589.m11705(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw AbstractC6615.m11740(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC6615.m11740(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC6615.m11740(method, i2, AbstractC0900.m718("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC6615.m11740(method, i2, "Query map value '" + value3 + "' converted to null by " + C6611.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c6589.m11703(str3, string2, z);
                }
                return;
        }
    }
}

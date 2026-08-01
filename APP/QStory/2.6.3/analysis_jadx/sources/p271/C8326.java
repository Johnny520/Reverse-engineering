package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p259.C8244;
import p259.C8245;
import p267.InterfaceC8265;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8326 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8325 f22959 = new C8325();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f22962 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f22961 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22960 = new HashMap();

    public C8326(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String strName = r5.name();
                String string = r5.toString();
                InterfaceC8265 interfaceC8265 = (InterfaceC8265) field2.getAnnotation(InterfaceC8265.class);
                if (interfaceC8265 != null) {
                    strName = interfaceC8265.value();
                    for (String str : interfaceC8265.alternate()) {
                        this.f22962.put(str, r5);
                    }
                }
                this.f22962.put(strName, r5);
                this.f22961.put(string, r5);
                this.f22960.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            C5925.m11304(e);
            throw null;
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        c8244.m13771(r2 == null ? null : (String) this.f22960.get(r2));
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        String strM13789 = c8245.m13789();
        Enum r0 = (Enum) this.f22962.get(strM13789);
        return r0 == null ? (Enum) this.f22961.get(strM13789) : r0;
    }
}

package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p259.C8243;
import p259.C8244;
import p267.InterfaceC8264;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8325 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8324 f22960 = new C8324();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f22963 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f22962 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22961 = new HashMap();

    public C8325(Class cls) {
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
                InterfaceC8264 interfaceC8264 = (InterfaceC8264) field2.getAnnotation(InterfaceC8264.class);
                if (interfaceC8264 != null) {
                    strName = interfaceC8264.value();
                    for (String str : interfaceC8264.alternate()) {
                        this.f22963.put(str, r5);
                    }
                }
                this.f22963.put(strName, r5);
                this.f22962.put(string, r5);
                this.f22961.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            C5919.m11243(e);
            throw null;
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        c8243.m13754(r2 == null ? null : (String) this.f22961.get(r2));
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        String strM13771 = c8244.m13771();
        Enum r0 = (Enum) this.f22963.get(strM13771);
        return r0 == null ? (Enum) this.f22962.get(strM13771) : r0;
    }
}

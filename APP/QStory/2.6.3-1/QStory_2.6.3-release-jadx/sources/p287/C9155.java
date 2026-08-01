package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p275.C9073;
import p275.C9074;
import p283.InterfaceC9094;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9155 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9154 f23304 = new C9154();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f23307 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f23306 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f23305 = new HashMap();

    public C9155(Class cls) {
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
                InterfaceC9094 interfaceC9094 = (InterfaceC9094) field2.getAnnotation(InterfaceC9094.class);
                if (interfaceC9094 != null) {
                    strName = interfaceC9094.value();
                    for (String str : interfaceC9094.alternate()) {
                        this.f23307.put(str, r5);
                    }
                }
                this.f23307.put(strName, r5);
                this.f23306.put(string, r5);
                this.f23305.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            C6755.m11863(e);
            throw null;
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        c9073.m14330(r2 == null ? null : (String) this.f23305.get(r2));
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        String strM14348 = c9074.m14348();
        Enum r0 = (Enum) this.f23307.get(strM14348);
        return r0 == null ? (Enum) this.f23306.get(strM14348) : r0;
    }
}

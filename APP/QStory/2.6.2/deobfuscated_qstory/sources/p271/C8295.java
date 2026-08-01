package p271;

import androidx.collection.C0276;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p007.AbstractC6136;
import p175.AbstractC7738;
import p259.C8244;
import p269.AbstractC8267;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8295 extends AbstractC8313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f22911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f22912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object[] f22913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Constructor f22914;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f22911 = map;
    }

    public C8295(Class cls, C8311 c8311, boolean z) {
        super(c8311);
        this.f22912 = new HashMap();
        AbstractC7738 abstractC7738 = AbstractC8267.f22885;
        Constructor constructorMo13063 = abstractC7738.mo13063(cls);
        this.f22914 = constructorMo13063;
        if (z) {
            C8294.m13822(null, constructorMo13063);
        } else {
            AbstractC8267.m13814(constructorMo13063);
        }
        String[] strArrMo13061 = abstractC7738.mo13061(cls);
        for (int i = 0; i < strArrMo13061.length; i++) {
            this.f22912.put(strArrMo13061[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f22914.getParameterTypes();
        this.f22913 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f22913[i2] = f22911.get(parameterTypes[i2]);
        }
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo13825(Object obj, C8244 c8244, C8312 c8312) {
        Object[] objArr = (Object[]) obj;
        String str = c8312.f22934;
        Integer num = (Integer) this.f22912.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC8267.m13818(this.f22914) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo7336 = c8312.f22938.mo7336(c8244);
        if (objMo7336 != null || !c8312.f22937) {
            objArr[iIntValue] = objMo7336;
        } else {
            StringBuilder sbM11550 = AbstractC6136.m11550("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM11550.append(c8244.m13789(false));
            throw new JsonParseException(sbM11550.toString());
        }
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo13826(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f22914;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC7738 abstractC7738 = AbstractC8267.f22885;
            C0276.m847("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8267.m13818(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8267.m13818(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            C0276.m847("Failed to invoke constructor '" + AbstractC8267.m13818(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            return null;
        }
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo13827() {
        return (Object[]) this.f22913.clone();
    }
}

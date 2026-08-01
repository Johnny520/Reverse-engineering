package p271;

import androidx.collection.C0276;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p009.AbstractC6183;
import p175.AbstractC7739;
import p259.C8245;
import p269.AbstractC8268;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8296 extends AbstractC8314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f22910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f22911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object[] f22912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Constructor f22913;

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
        f22910 = map;
    }

    public C8296(Class cls, C8312 c8312, boolean z) {
        super(c8312);
        this.f22911 = new HashMap();
        AbstractC7739 abstractC7739 = AbstractC8268.f22884;
        Constructor constructorMo13090 = abstractC7739.mo13090(cls);
        this.f22913 = constructorMo13090;
        if (z) {
            C8295.m13839(null, constructorMo13090);
        } else {
            AbstractC8268.m13831(constructorMo13090);
        }
        String[] strArrMo13088 = abstractC7739.mo13088(cls);
        for (int i = 0; i < strArrMo13088.length; i++) {
            this.f22911.put(strArrMo13088[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f22913.getParameterTypes();
        this.f22912 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f22912[i2] = f22910.get(parameterTypes[i2]);
        }
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo13842(Object obj, C8245 c8245, C8313 c8313) {
        Object[] objArr = (Object[]) obj;
        String str = c8313.f22933;
        Integer num = (Integer) this.f22911.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC8268.m13835(this.f22913) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo7323 = c8313.f22937.mo7323(c8245);
        if (objMo7323 != null || !c8313.f22936) {
            objArr[iIntValue] = objMo7323;
        } else {
            StringBuilder sbM11585 = AbstractC6183.m11585("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM11585.append(c8245.m13807(false));
            throw new JsonParseException(sbM11585.toString());
        }
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo13843(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f22913;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC7739 abstractC7739 = AbstractC8268.f22884;
            C0276.m848("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8268.m13835(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8268.m13835(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            C0276.m848("Failed to invoke constructor '" + AbstractC8268.m13835(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            return null;
        }
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo13844() {
        return (Object[]) this.f22912.clone();
    }
}

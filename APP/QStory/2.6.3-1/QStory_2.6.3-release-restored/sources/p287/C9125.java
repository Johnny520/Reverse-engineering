package p287;

import androidx.collection.C1123;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p025.AbstractC7012;
import p191.AbstractC8568;
import p275.C9074;
import p285.AbstractC9097;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9125 extends AbstractC9143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f23255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f23256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object[] f23257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Constructor f23258;

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
        f23255 = map;
    }

    public C9125(Class cls, C9141 c9141, boolean z) {
        super(c9141);
        this.f23256 = new HashMap();
        AbstractC8568 abstractC8568 = AbstractC9097.f23229;
        Constructor constructorMo13649 = abstractC8568.mo13649(cls);
        this.f23258 = constructorMo13649;
        if (z) {
            C9124.m14398(null, constructorMo13649);
        } else {
            AbstractC9097.m14390(constructorMo13649);
        }
        String[] strArrMo13647 = abstractC8568.mo13647(cls);
        for (int i = 0; i < strArrMo13647.length; i++) {
            this.f23256.put(strArrMo13647[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f23258.getParameterTypes();
        this.f23257 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f23257[i2] = f23255.get(parameterTypes[i2]);
        }
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo14401(Object obj, C9074 c9074, C9142 c9142) {
        Object[] objArr = (Object[]) obj;
        String str = c9142.f23278;
        Integer num = (Integer) this.f23256.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC9097.m14394(this.f23258) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo7882 = c9142.f23282.mo7882(c9074);
        if (objMo7882 != null || !c9142.f23281) {
            objArr[iIntValue] = objMo7882;
        } else {
            StringBuilder sbM12144 = AbstractC7012.m12144("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM12144.append(c9074.m14366(false));
            throw new JsonParseException(sbM12144.toString());
        }
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo14402(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f23258;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC8568 abstractC8568 = AbstractC9097.f23229;
            C1123.m1408("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC9097.m14394(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC9097.m14394(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            C1123.m1408("Failed to invoke constructor '" + AbstractC9097.m14394(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            return null;
        }
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo14403() {
        return (Object[]) this.f23257.clone();
    }
}

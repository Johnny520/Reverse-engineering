package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᲁᛳᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 extends AbstractC1229 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final HashMap f10944;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Constructor f10945;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object[] f10946;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final HashMap f10947;

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
        f10944 = map;
    }

    public C2211(Class cls, C1821 c1821) {
        super(c1821);
        this.f10947 = new HashMap();
        AbstractC1741 abstractC1741 = AbstractC1301.f5958;
        Constructor constructorMo2340 = abstractC1741.mo2340(cls);
        this.f10945 = constructorMo2340;
        AbstractC1301.m2588(constructorMo2340);
        String[] strArrMo2343 = abstractC1741.mo2343(cls);
        for (int i = 0; i < strArrMo2343.length; i++) {
            this.f10947.put(strArrMo2343[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f10945.getParameterTypes();
        this.f10946 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f10946[i2] = f10944.get(parameterTypes[i2]);
        }
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final Object mo2501(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f10945;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC1741 abstractC1741 = AbstractC1301.f5958;
            C1693.m3442("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC1301.m2586(constructor) + "' with args " + Arrays.toString(objArr), e2);
        } catch (InvocationTargetException e3) {
            C1693.m3442("Failed to invoke constructor '" + AbstractC1301.m2586(constructor) + "' with args " + Arrays.toString(objArr), e3.getCause());
            return null;
        }
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo2502(Object obj, C1942 c1942, C1782 c1782) {
        Object[] objArr = (Object[]) obj;
        String str = c1782.f8977;
        Integer num = (Integer) this.f10947.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC1301.m2586(this.f10945) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo484 = c1782.f8978.mo484(c1942);
        if (objMo484 != null || !c1782.f8976) {
            objArr[iIntValue] = objMo484;
        } else {
            StringBuilder sbM3998 = AbstractC2104.m3998("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM3998.append(c1942.m3749(false));
            throw new C1738(sbM3998.toString());
        }
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Object mo2503() {
        return (Object[]) this.f10946.clone();
    }
}

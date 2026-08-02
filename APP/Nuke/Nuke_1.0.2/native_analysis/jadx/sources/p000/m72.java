package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m72 extends j72 {

    /* JADX INFO: renamed from: e */
    public static final HashMap f6499e;

    /* JADX INFO: renamed from: b */
    public final Constructor f6500b;

    /* JADX INFO: renamed from: c */
    public final Object[] f6501c;

    /* JADX INFO: renamed from: d */
    public final HashMap f6502d;

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
        f6499e = map;
    }

    public m72(Class cls, l72 l72Var) {
        super(l72Var);
        this.f6502d = new HashMap();
        tp0 tp0Var = h72.f3884a;
        Constructor constructorMo1551v = tp0Var.mo1551v(cls);
        this.f6500b = constructorMo1551v;
        h72.m2121f(constructorMo1551v);
        String[] strArrMo1552x = tp0Var.mo1552x(cls);
        for (int i = 0; i < strArrMo1552x.length; i++) {
            this.f6502d.put(strArrMo1552x[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f6500b.getParameterTypes();
        this.f6501c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f6501c[i2] = f6499e.get(parameterTypes[i2]);
        }
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: d */
    public final Object mo2467d() {
        return (Object[]) this.f6501c.clone();
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: e */
    public final Object mo2468e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f6500b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            tp0 tp0Var = h72.f3884a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + h72.m2117b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + h72.m2117b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + h72.m2117b(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: f */
    public final void mo2469f(Object obj, l41 l41Var, i72 i72Var) {
        Object[] objArr = (Object[]) obj;
        String str = i72Var.f4473c;
        Integer num = (Integer) this.f6502d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + h72.m2117b(this.f6500b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo97b = i72Var.f4476f.mo97b(l41Var);
        if (objMo97b != null || !i72Var.f4477g) {
            objArr[iIntValue] = objMo97b;
            return;
        }
        throw new C0594pv("null is not allowed as value for record component '" + str + "' of primitive type; at path " + l41Var.m2831o(false));
    }
}

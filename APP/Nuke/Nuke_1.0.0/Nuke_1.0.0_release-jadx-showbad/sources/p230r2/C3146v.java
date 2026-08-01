package p230r2;

import com.bumptech.glide.AbstractC1923e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p027E4.C0330q;
import p241t2.AbstractC3211c;
import p258w2.C3390a;

/* JADX INFO: renamed from: r2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3146v extends AbstractC3143s {

    /* JADX INFO: renamed from: e */
    public static final HashMap f9901e;

    /* JADX INFO: renamed from: b */
    public final Constructor f9902b;

    /* JADX INFO: renamed from: c */
    public final Object[] f9903c;

    /* JADX INFO: renamed from: d */
    public final HashMap f9904d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        f9901e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3146v(Class cls, C3145u c3145u) {
        super(c3145u);
        this.f9904d = new HashMap();
        AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
        Constructor constructorMo3490z = abstractC1923e.mo3490z(cls);
        this.f9902b = constructorMo3490z;
        AbstractC3211c.m5492f(constructorMo3490z);
        String[] strArrMo3487C = abstractC1923e.mo3487C(cls);
        for (int i5 = 0; i5 < strArrMo3487C.length; i5++) {
            this.f9904d.put(strArrMo3487C[i5], Integer.valueOf(i5));
        }
        Class<?>[] parameterTypes = this.f9902b.getParameterTypes();
        this.f9903c = new Object[parameterTypes.length];
        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
            this.f9903c[i6] = f9901e.get(parameterTypes[i6]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: d */
    public final Object mo5416d() {
        return (Object[]) this.f9903c.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: e */
    public final Object mo5417e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f9902b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e5) {
            AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC3211c.m5488b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e7) {
            e = e7;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC3211c.m5488b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC3211c.m5488b(constructor) + "' with args " + Arrays.toString(objArr), e8.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: f */
    public final void mo5418f(Object obj, C3390a c3390a, C3142r c3142r) {
        Object[] objArr = (Object[]) obj;
        String str = c3142r.f9890c;
        Integer num = (Integer) this.f9904d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC3211c.m5488b(this.f9902b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo4964b = c3142r.f9893f.mo4964b(c3390a);
        if (objMo4964b != null || !c3142r.f9894g) {
            objArr[iIntValue] = objMo4964b;
            return;
        }
        throw new C0330q("null is not allowed as value for record component '" + str + "' of primitive type; at path " + c3390a.m5646m(false));
    }
}

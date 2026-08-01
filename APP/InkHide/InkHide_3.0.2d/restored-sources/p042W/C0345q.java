package p042W;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p006D.AbstractC0079h;
import p009E0.C0102b;
import p022L.AbstractC0174d;
import p045Y.AbstractC0357c;
import p051b0.C0493b;

/* JADX INFO: renamed from: W.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0345q extends AbstractC0343o {

    /* JADX INFO: renamed from: e */
    public static final HashMap f779e;

    /* JADX INFO: renamed from: b */
    public final Constructor f780b;

    /* JADX INFO: renamed from: c */
    public final Object[] f781c;

    /* JADX INFO: renamed from: d */
    public final HashMap f782d;

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
        f779e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0345q(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f782d = new HashMap();
        AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
        Constructor constructorMo208r = abstractC0079h.mo208r(cls);
        this.f780b = constructorMo208r;
        AbstractC0357c.m616e(constructorMo208r);
        String[] strArrMo210v = abstractC0079h.mo210v(cls);
        for (int i2 = 0; i2 < strArrMo210v.length; i2++) {
            this.f782d.put(strArrMo210v[i2], Integer.valueOf(i2));
        }
        Class<?>[] parameterTypes = this.f780b.getParameterTypes();
        this.f781c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f781c[i3] = f779e.get(parameterTypes[i3]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: c */
    public final Object mo602c() {
        return (Object[]) this.f781c.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: d */
    public final Object mo603d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f780b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0357c.m613b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0357c.m613b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0357c.m613b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: e */
    public final void mo604e(Object obj, C0493b c0493b, C0342n c0342n) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f782d;
        String str = c0342n.f767c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0357c.m613b(this.f780b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo476a = c0342n.f772h.mo476a(c0493b);
        if (objMo476a != null || !c0342n.f775k) {
            objArr[iIntValue] = objMo476a;
        } else {
            StringBuilder sbM357m = AbstractC0174d.m357m("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM357m.append(c0493b.mo575h());
            throw new C0102b(sbM357m.toString());
        }
    }
}

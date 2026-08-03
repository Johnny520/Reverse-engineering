package p151k6;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import p077f8.AbstractC1089i;
import p165l6.AbstractC2512c;

/* JADX INFO: renamed from: k6.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2321v extends AbstractC2315s {

    /* JADX INFO: renamed from: e */
    public static final HashMap f7645e;

    /* JADX INFO: renamed from: b */
    public final Constructor f7646b;

    /* JADX INFO: renamed from: c */
    public final Object[] f7647c;

    /* JADX INFO: renamed from: d */
    public final HashMap f7648d;

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
        f7645e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2321v(Class cls, C2319u c2319u) {
        super(c2319u);
        this.f7648d = new HashMap();
        AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
        Constructor constructorMo2804A = abstractC1089i.mo2804A(cls);
        this.f7646b = constructorMo2804A;
        AbstractC2512c.m5904f(constructorMo2804A);
        String[] strArrMo2805I = abstractC1089i.mo2805I(cls);
        for (int i9 = 0; i9 < strArrMo2805I.length; i9++) {
            this.f7648d.put(strArrMo2805I[i9], Integer.valueOf(i9));
        }
        Class<?>[] parameterTypes = this.f7646b.getParameterTypes();
        this.f7647c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f7647c[i10] = f7645e.get(parameterTypes[i10]);
        }
    }
}

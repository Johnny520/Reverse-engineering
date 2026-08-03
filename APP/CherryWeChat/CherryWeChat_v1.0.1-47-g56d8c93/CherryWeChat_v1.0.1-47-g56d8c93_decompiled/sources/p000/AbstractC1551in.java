package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: in */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1551in {

    /* JADX INFO: renamed from: a */
    public final Class f5508a;

    /* JADX INFO: renamed from: b */
    public final Map f5509b;

    /* JADX INFO: renamed from: c */
    public final Class f5510c;

    public AbstractC1551in(Class cls, C2481s1... c2481s1Arr) {
        this.f5508a = cls;
        HashMap map = new HashMap();
        for (C2481s1 c2481s1 : c2481s1Arr) {
            Class cls2 = c2481s1.f8716a;
            if (map.containsKey(cls2)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            map.put(cls2, c2481s1);
        }
        if (c2481s1Arr.length > 0) {
            this.f5510c = c2481s1Arr[0].f8716a;
        } else {
            this.f5510c = Void.class;
        }
        this.f5509b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public int mo2969a() {
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo2970b();

    /* JADX INFO: renamed from: c */
    public final Object m2971c(AbstractC0043B abstractC0043B, Class cls) {
        C2481s1 c2481s1 = (C2481s1) this.f5509b.get(cls);
        if (c2481s1 != null) {
            return c2481s1.m4966a(abstractC0043B);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2614v5 mo2972d();

    /* JADX INFO: renamed from: e */
    public abstract EnumC0888Um mo2973e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0043B mo2974f(AbstractC2744y6 abstractC2744y6);

    /* JADX INFO: renamed from: g */
    public abstract void mo2975g(AbstractC0043B abstractC0043B);
}

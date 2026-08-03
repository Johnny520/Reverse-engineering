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

    public AbstractC1551in(Class r7, C2481s1... r8) {
        this.f5508a = r7;
        HashMap r72 = new HashMap();
        int r0 = r8.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L10;
        C2481s1 r3 = r8[r2];
        Class r4 = r3.f8716a;
        if (r72.containsKey(r4) == true) goto L8;
        r72.put(r4, r3);
        r2 = r2 + 1;
        goto L3
    L8:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r4.getCanonicalName());
    L10:
        if (r8.length <= 0) goto L12;
        this.f5510c = r8[0].f8716a;
    L13:
        this.f5509b = Collections.unmodifiableMap(r72);
        return;
    L12:
        this.f5510c = Void.class;
        goto L13
    }

    /* JADX INFO: renamed from: a */
    public int mo2969a() {
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo2970b();

    /* JADX INFO: renamed from: c */
    public final Object m2971c(AbstractC0043B r3, Class r4) {
        C2481s1 r0 = (C2481s1) this.f5509b.get(r4);
        if (r0 == null) goto L7;
        return r0.m4966a(r3);
    L7:
        throw new IllegalArgumentException("Requested primitive class " + r4.getCanonicalName() + " not supported.");
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2614v5 mo2972d();

    /* JADX INFO: renamed from: e */
    public abstract EnumC0888Um mo2973e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0043B mo2974f(AbstractC2744y6 r1);

    /* JADX INFO: renamed from: g */
    public abstract void mo2975g(AbstractC0043B r1);
}

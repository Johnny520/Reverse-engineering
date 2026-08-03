package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0225F9 implements InterfaceC0502Lm, InterfaceC2747y9 {

    /* JADX INFO: renamed from: b */
    public static final Map f663b = null;

    /* JADX INFO: renamed from: a */
    public final Class f664a;

    static {
        List r0 = AbstractC2496sa.m4977b0(new Class[]{InterfaceC0884Ui.class, InterfaceC1416fj.class, Function2.class, C0373Im.class, C1354e8.class, InterfaceC2105jj.class, InterfaceC2149kj.class, InterfaceC2196lj.class, InterfaceC2239mj.class, InterfaceC2282nj.class, InterfaceC0927Vi.class, InterfaceC0970Wi.class, InterfaceC1013Xi.class, InterfaceC1056Yi.class, InterfaceC1099Zi.class, InterfaceC1144aj.class, InterfaceC1224bj.class, InterfaceC1267cj.class, InterfaceC1329dj.class, InterfaceC1372ej.class, InterfaceC1460gj.class, InterfaceC1504hj.class, InterfaceC1547ij.class});
        ArrayList r1 = new ArrayList(AbstractC2539ta.m5019d0(r0, 10));
        Iterator r02 = r0.iterator();
        int r2 = 0;
    L4:
        if (r02.hasNext() == false) goto L10;
        Object r3 = r02.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L8;
        r1.add(new C0208Et((Class) r3, Integer.valueOf(r2)));
        r2 = r4;
        goto L4
    L8:
        AbstractC2496sa.m4978c0();
        throw null;
    L10:
        f663b = AbstractC2598uq.m5111M(r1);
    }

    public C0225F9(Class r1) {
        this.f664a = r1;
    }

    @Override // p000.InterfaceC2747y9
    /* JADX INFO: renamed from: a */
    public final Class mo444a() {
        return this.f664a;
    }

    /* JADX INFO: renamed from: b */
    public final String m445b() {
        Class r0 = this.f664a;
        String r2 = null;
        if (r0.isAnonymousClass() == false) goto L6;
        return null;
    L6:
        if (r0.isLocalClass() == false) goto L21;
        String r1 = r0.getSimpleName();
        Method r22 = r0.getEnclosingMethod();
        if (r22 != null) goto L10;
        Constructor<?> r02 = r0.getEnclosingConstructor();
        if (r02 != null) goto L14;
        int r03 = AbstractC2564tz.m5056Q(r1, '$', 0, 6);
        if (r03 != (-1)) goto L19;
        return r1;
    L19:
        return r1.substring(r03 + 1, r1.length());
    L14:
        return AbstractC2564tz.m5067b0(r1, r02.getName() + '$');
    L10:
        return AbstractC2564tz.m5067b0(r1, r22.getName() + '$');
    L21:
        if (r0.isArray() == false) goto L30;
        Class<?> r04 = r0.getComponentType();
        if (r04.isPrimitive() == false) goto L27;
        String r05 = AbstractC0148Dc.m285s(r04.getName());
        if (r05 == null) goto L27;
        r2 = r05.concat("Array");
    L27:
        if (r2 != null) goto L29;
        return "Array";
    L29:
        return r2;
    L30:
        String r12 = AbstractC0148Dc.m285s(r0.getName());
        if (r12 == null) goto L33;
        return r12;
    L33:
        return r0.getSimpleName();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0225F9) == true) goto L5;
        return false;
    L5:
        if (AbstractC0295Gu.m624q(this).equals(AbstractC0295Gu.m624q((InterfaceC0502Lm) r2)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return AbstractC0295Gu.m624q(this).hashCode();
    }

    public final String toString() {
        return this.f664a + " (Kotlin reflection is not available)";
    }
}

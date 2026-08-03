package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0225F9 implements InterfaceC0502Lm, InterfaceC2747y9 {

    /* JADX INFO: renamed from: b */
    public static final Map f663b;

    /* JADX INFO: renamed from: a */
    public final Class f664a;

    static {
        List listM4977b0 = AbstractC2496sa.m4977b0(InterfaceC0884Ui.class, InterfaceC1416fj.class, Function2.class, C0373Im.class, C1354e8.class, InterfaceC2105jj.class, InterfaceC2149kj.class, InterfaceC2196lj.class, InterfaceC2239mj.class, InterfaceC2282nj.class, InterfaceC0927Vi.class, InterfaceC0970Wi.class, InterfaceC1013Xi.class, InterfaceC1056Yi.class, InterfaceC1099Zi.class, InterfaceC1144aj.class, InterfaceC1224bj.class, InterfaceC1267cj.class, InterfaceC1329dj.class, InterfaceC1372ej.class, InterfaceC1460gj.class, InterfaceC1504hj.class, InterfaceC1547ij.class);
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listM4977b0, 10));
        int i = 0;
        for (Object obj : listM4977b0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            arrayList.add(new C0208Et((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f663b = AbstractC2598uq.m5111M(arrayList);
    }

    public C0225F9(Class cls) {
        this.f664a = cls;
    }

    @Override // p000.InterfaceC2747y9
    /* JADX INFO: renamed from: a */
    public final Class mo444a() {
        return this.f664a;
    }

    /* JADX INFO: renamed from: b */
    public final String m445b() {
        String strM285s;
        Class cls = this.f664a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM285s2 = AbstractC0148Dc.m285s(cls.getName());
                return strM285s2 == null ? cls.getSimpleName() : strM285s2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM285s = AbstractC0148Dc.m285s(componentType.getName())) != null) {
                strConcat = strM285s.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC2564tz.m5067b0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM5056Q = AbstractC2564tz.m5056Q(simpleName, '$', 0, 6);
            return iM5056Q == -1 ? simpleName : simpleName.substring(iM5056Q + 1, simpleName.length());
        }
        return AbstractC2564tz.m5067b0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0225F9) && AbstractC0295Gu.m624q(this).equals(AbstractC0295Gu.m624q((InterfaceC0502Lm) obj));
    }

    public final int hashCode() {
        return AbstractC0295Gu.m624q(this).hashCode();
    }

    public final String toString() {
        return this.f664a + " (Kotlin reflection is not available)";
    }
}

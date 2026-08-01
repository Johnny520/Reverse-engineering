package p313v9;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2396x;
import p213oa.C5691b;
import p213oa.C5692c;

/* JADX INFO: renamed from: v9.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8864e0 implements InterfaceC2396x {

    /* JADX INFO: renamed from: a */
    public static final a f29430a = new a(null);

    /* JADX INFO: renamed from: U */
    public abstract Type mo34021U();

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public InterfaceC2369a mo8603b(C5692c c5692c) {
        Object obj;
        c5692c.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C5691b c5691bMo8595h = ((InterfaceC2369a) next).mo8595h();
            if (AbstractC1061t.m3842c(c5691bMo8595h != null ? c5691bMo8595h.m22982a() : null, c5692c)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC2369a) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC8864e0) && AbstractC1061t.m3842c(mo34021U(), ((AbstractC8864e0) obj).mo34021U());
    }

    public int hashCode() {
        return mo34021U().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo34021U();
    }

    /* JADX INFO: renamed from: v9.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC8864e0 m34024a(Type type) {
            type.getClass();
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C8860c0(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new C8875m(type) : type instanceof WildcardType ? new C8870h0((WildcardType) type) : new C8881s(type);
        }

        public a() {
        }
    }
}

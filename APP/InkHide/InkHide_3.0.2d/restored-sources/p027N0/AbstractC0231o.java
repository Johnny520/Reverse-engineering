package p027N0;

import java.util.List;
import java.util.Map;
import p011F0.C0115c;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: N0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m425a(Object obj) {
        if (obj instanceof InterfaceC0233a) {
            m429e(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            AbstractC0223g.m419f(e2, AbstractC0231o.class.getName());
            throw e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m426b(Object obj) {
        return (obj instanceof List) && !(obj instanceof InterfaceC0233a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m427c(Object obj) {
        return (obj instanceof Map) && !(obj instanceof InterfaceC0233a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C0115c m428d(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "array");
        return new C0115c(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m429e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC0223g.m419f(classCastException, AbstractC0231o.class.getName());
        throw classCastException;
    }
}

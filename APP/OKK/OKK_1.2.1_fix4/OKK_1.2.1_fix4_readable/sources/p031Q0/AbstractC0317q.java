package p031Q0;

import com.abc.core.runtime.C0817b;
import java.util.List;
import p007D0.InterfaceC0135a;
import p009E0.C0172c;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p029P0.InterfaceC0290p;
import p033R0.InterfaceC0319a;
import p033R0.InterfaceC0320b;

/* JADX INFO: renamed from: Q0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0317q {
    /* JADX INFO: renamed from: a */
    public static void m712a(Object obj) {
        if (obj != null) {
            if (obj instanceof InterfaceC0135a) {
                if ((obj instanceof InterfaceC0305e ? ((InterfaceC0305e) obj).getArity() : obj instanceof InterfaceC0275a ? 0 : obj instanceof InterfaceC0286l ? 1 : obj instanceof InterfaceC0290p ? 2 : obj instanceof C0817b ? 3 : -1) == 2) {
                    return;
                }
            }
            m715d(obj, "kotlin.jvm.functions.Function2");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m713b(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC0319a) || (obj instanceof InterfaceC0320b));
    }

    /* JADX INFO: renamed from: c */
    public static final C0172c m714c(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        return new C0172c(objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m715d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC0307g.m704f(classCastException, AbstractC0317q.class.getName());
        throw classCastException;
    }
}

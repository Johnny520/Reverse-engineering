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
    public static void m712a(Object r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if ((r2 instanceof InterfaceC0135a) == true) goto L6;
    L23:
        m715d(r2, "kotlin.jvm.functions.Function2");
        throw null;
    L6:
        if ((r2 instanceof InterfaceC0305e) == false) goto L9;
        int r02 = ((InterfaceC0305e) r2).getArity();
    L21:
        if (r02 != 2) goto L23;
        return;
    L9:
        if ((r2 instanceof InterfaceC0275a) == false) goto L12;
        r02 = 0;
        goto L21
    L12:
        if ((r2 instanceof InterfaceC0286l) == false) goto L15;
        r02 = 1;
        goto L21
    L15:
        if ((r2 instanceof InterfaceC0290p) == false) goto L18;
        r02 = 2;
        goto L21
    L18:
        if ((r2 instanceof C0817b) == false) goto L20;
        r02 = 3;
        goto L21
    L20:
        r02 = -1;
        goto L21
    }

    /* JADX INFO: renamed from: b */
    public static boolean m713b(Object r1) {
        if ((r1 instanceof List) == true) goto L5;
    L9:
        return false;
    L5:
        if ((r1 instanceof InterfaceC0319a) == true) goto L7;
    L8:
        return true;
    L7:
        if ((r1 instanceof InterfaceC0320b) == false) goto L9;
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public static final C0172c m714c(Object[] r1) {
        AbstractC0307g.m703e(r1, "array");
        return new C0172c(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m715d(Object r1, String r2) {
        if (r1 != null) goto L4;
        String r12 = "null";
    L5:
        ClassCastException r22 = new ClassCastException(r12 + " cannot be cast to " + r2);
        AbstractC0307g.m704f(r22, AbstractC0317q.class.getName());
        throw r22;
    L4:
        r12 = r1.getClass().getName();
        goto L5
    }
}

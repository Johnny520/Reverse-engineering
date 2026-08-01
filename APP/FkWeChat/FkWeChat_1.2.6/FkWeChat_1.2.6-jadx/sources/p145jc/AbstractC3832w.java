package p145jc;

import ec.AbstractC2157m0;
import java.lang.reflect.InvocationTargetException;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4693f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3832w {
    /* JADX INFO: renamed from: a */
    public static final void m15263a(InterfaceC0184l interfaceC0184l, Object obj, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
        C3825p0 c3825p0M15264b = m15264b(interfaceC0184l, obj, null);
        if (c3825p0M15264b != null) {
            AbstractC2157m0.m7839a(interfaceC5980j, c3825p0M15264b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C3825p0 m15264b(InterfaceC0184l interfaceC0184l, Object obj, C3825p0 c3825p0) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC0184l.mo27m(obj);
            return c3825p0;
        } catch (Throwable th) {
            if (c3825p0 != null && c3825p0.getCause() != th) {
                AbstractC4693f.m18753a(c3825p0, th);
                return c3825p0;
            }
            return new C3825p0("Exception in undelivered element handler for " + obj, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C3825p0 m15265c(InterfaceC0184l interfaceC0184l, Object obj, C3825p0 c3825p0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            c3825p0 = null;
        }
        return m15264b(interfaceC0184l, obj, c3825p0);
    }
}

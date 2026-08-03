package Yue;

import Yue.C7148;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7565 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f2946 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f2947 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f22864;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f22865;

    static {
        Object objM3438;
        Object objM34382;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(AbstractC3513.class.getCanonicalName());
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22403(objM3438) != null) {
            objM3438 = f2946;
        }
        f22864 = (String) objM3438;
        try {
            C7148.C1189 c11893 = C7148.f21560;
            objM34382 = C7148.m3438(C7565.class.getCanonicalName());
        } catch (Throwable th2) {
            C7148.C1189 c11894 = C7148.f21560;
            objM34382 = C7148.m3438(C7149.m3441(th2));
        }
        if (C7148.m22403(objM34382) != null) {
            objM34382 = f2947;
        }
        f22865 = (String) objM34382;
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m3733() {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m3734() {
    }

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final StackTraceElement m23675(@InterfaceC6399 String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <E extends Throwable> C6599<E, StackTraceElement[]> m23676(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !C5499.m17094(cause.getClass(), e.getClass())) {
            return C8003.m4014(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (m23682(stackTraceElement)) {
                return C8003.m4014(cause, stackTrace);
            }
        }
        return C8003.m4014(e, new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E extends Throwable> E m23677(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m23675("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int iM23680 = m23680(stackTrace, f22864);
        int i = 0;
        if (iM23680 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iM23680];
        for (int i2 = 0; i2 < iM23680; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iM23680] = it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final ArrayDeque<StackTraceElement> m23678(InterfaceC4246 interfaceC4246) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = interfaceC4246.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            interfaceC4246 = interfaceC4246.getCallerFrame();
            if (interfaceC4246 == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = interfaceC4246.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m23679(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C5499.m17094(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C5499.m17094(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C5499.m17094(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m23680(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C5499.m17094(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m23681(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) {
        th.initCause(th2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m23682(@InterfaceC6399 StackTraceElement stackTraceElement) {
        return C7627.m24008(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m23683(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m23682(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (m23679(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Object m23684(@InterfaceC6399 Throwable th, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Object m23685(Throwable th, InterfaceC4199<?> interfaceC4199) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <E extends Throwable> E m23686(E e, InterfaceC4246 interfaceC4246) {
        C6599 c6599M23676 = m23676(e);
        Throwable th = (Throwable) c6599M23676.m3062();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c6599M23676.m3063();
        Throwable thM23690 = m23690(th);
        if (thM23690 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> arrayDequeM23678 = m23678(interfaceC4246);
        if (arrayDequeM23678.isEmpty()) {
            return e;
        }
        if (th != e) {
            m23683(stackTraceElementArr, arrayDequeM23678);
        }
        return (E) m23677(th, thM23690, arrayDequeM23678);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <E extends Throwable> E m23687(@InterfaceC6399 E e) {
        return e;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <E extends Throwable> E m23688(@InterfaceC6399 E e, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <E extends Throwable> E m23689(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int iM23680 = m23680(stackTrace, f22865);
        int i = iM23680 + 1;
        int iM236802 = m23680(stackTrace, f22864);
        int i2 = 0;
        int i3 = (length - iM23680) - (iM236802 == -1 ? 0 : length - iM236802);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        while (i2 < i3) {
            stackTraceElementArr[i2] = i2 == 0 ? m23675("Coroutine boundary") : stackTrace[(i + i2) - 1];
            i2++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <E extends Throwable> E m23690(E e) {
        E e2 = (E) C4732.m14257(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof InterfaceC4224) || C5499.m17094(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <E extends Throwable> E m23691(@InterfaceC6399 E e) {
        return e;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <E extends Throwable> E m23692(@InterfaceC6399 E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && C5499.m17094(e2.getClass(), e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (m23682(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }
}

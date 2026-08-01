package p027N0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p009E0.C0102b;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: N0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0223g {

    /* JADX INFO: renamed from: a */
    public static final Object[] f564a = new Object[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m414a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m415b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m419f(nullPointerException, AbstractC0223g.class.getName());
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m416c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m419f(nullPointerException, AbstractC0223g.class.getName());
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m417d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m419f(nullPointerException, AbstractC0223g.class.getName());
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m418e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0223g.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m419f(nullPointerException, AbstractC0223g.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m419f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m420g(String str) {
        C0102b c0102b = new C0102b(AbstractC0174d.m353i("lateinit property ", str, " has not been initialized"));
        m419f(c0102b, AbstractC0223g.class.getName());
        throw c0102b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final Object[] m421h(Collection collection) {
        int size = collection.size();
        Object[] objArr = f564a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        m417d(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        m417d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final Object[] m422i(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    m416c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        m417d(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        m417d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}

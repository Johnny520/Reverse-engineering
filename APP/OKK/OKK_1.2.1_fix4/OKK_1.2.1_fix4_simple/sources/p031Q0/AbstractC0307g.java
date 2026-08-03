package p031Q0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p007D0.C0137c;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: Q0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0307g {

    /* JADX INFO: renamed from: a */
    public static final Object[] f590a = null;

    static {
        f590a = new Object[0];
    }

    /* JADX INFO: renamed from: a */
    public static boolean m699a(Object r02, Object r1) {
        if (r02 != null) goto L7;
        if (r1 != null) goto L5;
        return true;
    L5:
        return false;
    L7:
        return r02.equals(r1);
    }

    /* JADX INFO: renamed from: b */
    public static void m700b(Object r1) {
        if (r1 == null) goto L4;
        return;
    L4:
        NullPointerException r12 = new NullPointerException();
        m704f(r12, AbstractC0307g.class.getName());
        throw r12;
    }

    /* JADX INFO: renamed from: c */
    public static void m701c(Object r02, String r1) {
        if (r02 == null) goto L4;
        return;
    L4:
        NullPointerException r03 = new NullPointerException(r1);
        m704f(r03, AbstractC0307g.class.getName());
        throw r03;
    }

    /* JADX INFO: renamed from: d */
    public static void m702d(Object r1, String r2) {
        if (r1 == null) goto L4;
        return;
    L4:
        NullPointerException r12 = new NullPointerException(r2.concat(" must not be null"));
        m704f(r12, AbstractC0307g.class.getName());
        throw r12;
    }

    /* JADX INFO: renamed from: e */
    public static void m703e(Object r5, String r6) {
        if (r5 != null) goto L12;
        StackTraceElement[] r02 = Thread.currentThread().getStackTrace();
        String r2 = AbstractC0307g.class.getName();
        int r3 = 0;
    L5:
        if (r02[r3].getClassName().equals(r2) == true) goto L8;
        r3 = r3 + 1;
    L8:
        if (r02[r3].getClassName().equals(r2) == false) goto L10;
        r3 = r3 + 1;
        goto L8
    L10:
        StackTraceElement r03 = r02[r3];
        NullPointerException r52 = new NullPointerException("Parameter specified as non-null is null: method " + r03.getClassName() + "." + r03.getMethodName() + ", parameter " + r6);
        m704f(r52, AbstractC0307g.class.getName());
        throw r52;
    }

    /* JADX INFO: renamed from: f */
    public static void m704f(RuntimeException r5, String r6) {
        StackTraceElement[] r02 = r5.getStackTrace();
        int r1 = r02.length;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r6.equals(r02[r3].getClassName()) == false) goto L7;
        r2 = r3;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r02, r2 + 1, r1));
    }

    /* JADX INFO: renamed from: g */
    public static void m705g(String r2) {
        C0137c r02 = new C0137c(AbstractC0324d.m723f("lateinit property ", r2, " has not been initialized"));
        m704f(r02, AbstractC0307g.class.getName());
        throw r02;
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m706h(Collection r5) {
        m703e(r5, "collection");
        int r02 = r5.size();
        Object[] r1 = f590a;
        if (r02 == 0) goto L32;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == false) goto L33;
        Object[] r12 = new Object[r02];
        int r03 = 0;
    L9:
        int r2 = r03 + 1;
        r12[r03] = r52.next();
        if (r2 < r12.length) goto L24;
        if (r52.hasNext() == false) goto L34;
        int r04 = ((r2 * 3) + 1) >>> 1;
        if (r04 > r2) goto L21;
        r04 = 2147483645;
        if (r2 < 2147483645) goto L21;
        throw new OutOfMemoryError();
    L21:
        r12 = Arrays.copyOf(r12, r04);
        m702d(r12, "copyOf(...)");
    L22:
        r03 = r2;
        goto L9
    L34:
        return r12;
    L24:
        if (r52.hasNext() == true) goto L22;
        Object[] r13 = Arrays.copyOf(r12, r2);
        m702d(r13, "copyOf(...)");
        return r13;
    L33:
        return r1;
    L32:
        return r1;
    }

    /* JADX INFO: renamed from: i */
    public static final Object[] m707i(Collection r5, Object[] r6) {
        m703e(r5, "collection");
        r6.getClass();
        int r02 = r5.size();
        int r2 = 0;
        if (r02 == 0) goto L5;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == true) goto L13;
        if (r6.length <= 0) goto L44;
        r6[0] = null;
        return r6;
    L44:
        return r6;
    L13:
        if (r02 > r6.length) goto L15;
        Object[] r03 = r6;
    L16:
        int r3 = r2 + 1;
        r03[r2] = r52.next();
        if (r3 < r03.length) goto L31;
        if (r52.hasNext() == false) goto L46;
        int r22 = ((r3 * 3) + 1) >>> 1;
        if (r22 > r3) goto L28;
        r22 = 2147483645;
        if (r3 < 2147483645) goto L28;
        throw new OutOfMemoryError();
    L28:
        r03 = Arrays.copyOf(r03, r22);
        m702d(r03, "copyOf(...)");
    L29:
        r2 = r3;
        goto L16
    L46:
        return r03;
    L31:
        if (r52.hasNext() == true) goto L29;
        if (r03 != r6) goto L34;
        r6[r3] = null;
        return r6;
    L34:
        Object[] r62 = Arrays.copyOf(r03, r3);
        m702d(r62, "copyOf(...)");
        return r62;
    L15:
        Object r04 = Array.newInstance(r6.getClass().getComponentType(), r02);
        m701c(r04, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r03 = (Object[]) r04;
        goto L16
    L5:
        if (r6.length <= 0) goto L42;
        r6[0] = null;
        return r6;
    L42:
        return r6;
    }
}

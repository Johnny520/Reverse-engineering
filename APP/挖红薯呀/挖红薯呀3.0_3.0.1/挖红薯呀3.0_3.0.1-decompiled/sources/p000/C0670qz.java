package p000;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: qz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670qz {

    /* JADX INFO: renamed from: a */
    public static final C0670qz f5241a = new C0670qz();

    /* JADX INFO: renamed from: b */
    private static final u60 f5242b = new x51(new C0658qn(12));

    /* JADX INFO: renamed from: c */
    private static final u60 f5243c = new x51(new C0658qn(13));

    /* JADX INFO: renamed from: d */
    private static final u60 f5244d = new x51(new C0658qn(14));

    /* JADX INFO: renamed from: e */
    private static final u60 f5245e = new x51(new C0658qn(15));

    /* JADX INFO: renamed from: f */
    private static final u60 f5246f = new x51(new C0658qn(16));

    /* JADX INFO: renamed from: g */
    private static final u60 f5247g = new x51(new C0658qn(17));

    /* JADX INFO: renamed from: h */
    private static final u60 f5248h = new x51(new C0658qn(18));

    /* JADX INFO: renamed from: i */
    private static final u60 f5249i = new x51(new C0658qn(19));

    /* JADX INFO: renamed from: j */
    public static final int f5250j = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0670qz() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final int m3338A(Class<?> cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final Object m3339B(Class<?> cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final String m3340C(Class<?> cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final String m3349i() {
        return ik0.f2579a.m1592a(35, 29, 25, 86, 35, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final String m3350j() {
        return ik0.f2579a.m1592a(39, 17, 6, 84, 27, 16, 31, 69, 36, 46, 25, 85, 46, 23, 54, 88, 39, 29, 57, 85);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final String m3351k() {
        return ik0.f2579a.m1592a(39, 17, 6, 84, 27, 16, 31, 69, 36);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final String m3352l() {
        return ik0.f2579a.m1592a(36, 10, 25, 86, 34, 22, 17, 93);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final String m3353m() {
        return ik0.f2579a.m1592a(62, 10, 28, 110, 56, 17, 10, 84, 20, 20, 17, 67, 44, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m3354n() {
        return ik0.f2579a.m1592a(62, 10, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final String m3355o() {
        return ik0.f2579a.m1592a(60, 17, 20, 69, 35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m3356p() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 84, 37, 12, 25, 69, 34, 29, 3, 31, 2, 21, 17, 86, 46, 58, 21, 80, 37);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final String m3357s() {
        return (String) f5248h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    private final String m3358t() {
        return (String) f5249i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final String m3359u() {
        return (String) f5243c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final String m3360v() {
        return (String) f5245e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final String m3361w() {
        return (String) f5244d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private final String m3362x() {
        return (String) f5246f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final String m3363y() {
        return (String) f5247g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final String m3364z() {
        return (String) f5242b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final C0633pz m3365q(Object obj, ClassLoader classLoader) throws ClassNotFoundException {
        obj.getClass();
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass(m3364z());
        clsLoadClass.getClass();
        String strM3340C = m3340C(clsLoadClass, obj, m3359u());
        String strM3340C2 = m3340C(clsLoadClass, obj, m3361w());
        String strM3340C3 = m3340C(clsLoadClass, obj, m3360v());
        String strM3340C4 = m3340C(clsLoadClass, obj, m3362x());
        return new C0633pz(strM3340C, strM3340C2, strM3340C3 == null ? strM3340C4 : strM3340C3, m3338A(clsLoadClass, obj, m3363y()), m3338A(clsLoadClass, obj, m3357s()), !(strM3340C == null || strM3340C.length() == 0), m3339B(clsLoadClass, obj, m3358t()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final C0633pz m3366r(Object obj) {
        obj.getClass();
        Class<?> cls = obj.getClass();
        String strM3340C = m3340C(cls, obj, m3359u());
        String strM3340C2 = m3340C(cls, obj, m3361w());
        String strM3340C3 = m3340C(cls, obj, m3360v());
        String strM3340C4 = m3340C(cls, obj, m3362x());
        return new C0633pz(strM3340C, strM3340C2, strM3340C3 == null ? strM3340C4 : strM3340C3, m3338A(cls, obj, m3363y()), m3338A(cls, obj, m3357s()), !(strM3340C == null || strM3340C.length() == 0), m3339B(cls, obj, m3358t()));
    }
}

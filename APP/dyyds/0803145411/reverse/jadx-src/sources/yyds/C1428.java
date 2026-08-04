package yyds;

import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᛶᲁᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1428 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final String f6774 = C1308.m2591(AbstractC1324.class);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f6775;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0593[] f6776;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0357 f6777;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final HashMap f6778 = new HashMap();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f6779;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f6780;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f6781;

    public C1428(Class cls, C0593[] c0593Arr, C0357 c0357) {
        String strConcat;
        this.f6776 = c0593Arr;
        this.f6777 = c0357;
        String name = cls.getName();
        this.f6779 = name;
        if (name.startsWith("java.")) {
            strConcat = AbstractC2104.m4014("net.minidev.asm.", name, "AccAccess");
            this.f6781 = strConcat;
        } else {
            strConcat = name.concat("AccAccess");
            this.f6781 = strConcat;
        }
        this.f6775 = strConcat.replace('.', '/');
        this.f6780 = name.replace('.', '/');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2908(C1399 c1399, int i, C0680 c0680) {
        c1399.m2821(21, 2);
        if (i == 0) {
            c1399.m2813(154, c0680);
            return;
        }
        if (i == 1) {
            c1399.m2828(4);
            c1399.m2813(160, c0680);
            return;
        }
        if (i == 2) {
            c1399.m2828(5);
            c1399.m2813(160, c0680);
            return;
        }
        if (i == 3) {
            c1399.m2828(6);
            c1399.m2813(160, c0680);
            return;
        }
        if (i == 4) {
            c1399.m2828(7);
            c1399.m2813(160, c0680);
        } else if (i == 5) {
            c1399.m2828(8);
            c1399.m2813(160, c0680);
        } else {
            if (i < 6) {
                throw new RuntimeException("non supported negative values");
            }
            c1399.m2827(16, i);
            c1399.m2813(160, c0680);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2909(C1399 c1399, C0593 c0593) {
        C1399 c13992 = c1399;
        c13992.m2821(25, 1);
        String str = this.f6780;
        c13992.m2824(192, str);
        c13992.m2821(25, 3);
        Class cls = c0593.f2814;
        Method method = c0593.f2812;
        C1308 c1308M2594 = C1308.m2594(cls);
        Class cls2 = c0593.f2814;
        String strM2591 = C1308.m2591(cls2);
        Method method2 = (Method) this.f6778.get(cls2);
        if (method2 != null) {
            c13992.m2829(184, C1308.m2591(method2.getDeclaringClass()), method2.getName(), C1308.m2596(method2), false);
        } else if (cls2.isEnum()) {
            C0680 c0680 = new C0680();
            c13992.m2813(198, c0680);
            c13992.m2821(25, 3);
            c13992.m2829(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            c13992 = c1399;
            c13992.m2829(184, strM2591, "valueOf", AbstractC2104.m4014("(Ljava/lang/String;)L", strM2591, ";"), false);
            c13992.m2821(58, 3);
            c13992.m2811(c0680);
            c13992.m2832(3, 0, 0, null, null);
            c13992.m2821(25, 1);
            c13992.m2824(192, str);
            c13992.m2821(25, 3);
            c13992.m2824(192, strM2591);
        } else if (cls2.equals(String.class)) {
            C0680 c06802 = new C0680();
            c13992.m2813(198, c06802);
            c13992.m2821(25, 3);
            c13992.m2829(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            c13992.m2821(58, 3);
            c13992.m2811(c06802);
            c13992.m2832(3, 0, 0, null, null);
            c13992.m2821(25, 1);
            c13992.m2824(192, str);
            c13992.m2821(25, 3);
            c13992.m2824(192, strM2591);
        } else {
            c13992.m2824(192, strM2591);
        }
        if ((method == null && c0593.f2813 == null) || method == null) {
            c13992.m2815(181, str, c0593.f2810, c1308M2594.m2597());
        } else {
            String strM2596 = C1308.m2596(method);
            c1399.m2829(182, this.f6780, method.getName(), strM2596, false);
            c13992 = c1399;
        }
        c13992.m2828(177);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2910(C1399 c1399) {
        String strM2591 = C1308.m2591(NoSuchFieldException.class);
        c1399.m2824(187, strM2591);
        c1399.m2828(89);
        c1399.m2818("mapping " + this.f6779 + " failed to map field:");
        c1399.m2821(21, 2);
        c1399.m2829(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        c1399.m2829(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        c1399.m2829(183, strM2591, "<init>", "(Ljava/lang/String;)V", false);
        c1399.m2828(191);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2911(C1399 c1399) {
        String strM2591 = C1308.m2591(NoSuchFieldException.class);
        c1399.m2824(187, strM2591);
        c1399.m2828(89);
        c1399.m2818("mapping " + this.f6779 + " failed to map field:");
        c1399.m2821(25, 2);
        c1399.m2829(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        c1399.m2829(183, strM2591, "<init>", "(Ljava/lang/String;)V", false);
        c1399.m2828(191);
    }
}

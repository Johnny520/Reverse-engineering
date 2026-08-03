package p049b0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.C0406i;

/* JADX INFO: renamed from: b0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0566p {
    static {
    }

    /* JADX INFO: renamed from: a */
    public static Object m1376a(Object r11, String[] r12) {
        int r02 = 0;
        Object[] r1 = new Object[0];
        AbstractC0307g.m703e(r11, "receiver");
        int r2 = r12.length;
    L4:
        if (r02 >= r2) goto L39;
        String r4 = r12[r02];
        Class<?> r5 = r11.getClass();
        int r6 = r1.length;
        AbstractC0307g.m703e(r4, "name");
        C0406i r52 = AbstractC0358S.m861K(new C0565o(r5, null));
    L7:
        if (r52.hasNext() == false) goto L16;
        C0172c r7 = AbstractC0317q.m714c(((Class) r52.next()).getDeclaredMethods());
    L10:
        if (r7.hasNext() == false) goto L7;
        Method r9 = (Method) r7.next();
        if (AbstractC0307g.m699a(r9.getName(), r4) == false) goto L10;
        if (r9.getParameterTypes().length != r6) goto L10;
        r9.setAccessible(true);
    L17:
        if (r9 != null) goto L28;
        r02 = r02 + 1;
        goto L4
    L28:
        r9.setAccessible(true);     // Catch: Throwable -> L21
        Object r112 = r9.invoke(r11, Arrays.copyOf(r1, r1.length));     // Catch: Throwable -> L21
    L24:
        if ((r112 instanceof C0140f) == false) goto L27;
        return null;
    L27:
        return r112;
    L21:
        th = move-exception;
        r112 = AbstractC0040p.m116u(th);
        goto L24
    L16:
        r9 = null;
        goto L17
    L39:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m1377b(Object r6) {
        AbstractC0307g.m703e(r6, "instance");
        ArrayList r02 = new ArrayList();
        C0406i r1 = AbstractC0358S.m861K(new C0565o(r6.getClass(), null));
    L4:
        if (r1.hasNext() == false) goto L22;
        C0172c r2 = AbstractC0317q.m714c(((Class) r1.next()).getDeclaredFields());
    L7:
        if (r2.hasNext() == false) goto L4;
        Field r3 = (Field) r2.next();
        r3.setAccessible(true);     // Catch: Throwable -> L17
        Object r4 = r3.get(r6);     // Catch: Throwable -> L17
        if (r4 == null) goto L7;
        if ((r4 instanceof List) == true) goto L19;
        if (AbstractC0317q.m713b(r4) == false) goto L7;
    L19:
        r02.add(new C0139e(r3, r4));     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L7
    L22:
        return r02;
    }
}

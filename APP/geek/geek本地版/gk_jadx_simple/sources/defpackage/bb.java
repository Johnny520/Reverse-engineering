package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb extends ip {
    public static List f0(Object... r1) {
        if (r1.length <= 0) goto L7;
        List r12 = Arrays.asList(r1);
        ip.n("asList(...)", r12);
        return r12;
    L7:
        return yi.a;
    }

    public static void g0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

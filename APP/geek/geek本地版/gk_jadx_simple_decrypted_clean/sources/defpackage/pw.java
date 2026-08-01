package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class pw {
    public static boolean a(Object r0, Object r1) {
        return Objects.equals(r0, r1);
    }

    public static int b(Object... r0) {
        return Objects.hash(r0);
    }
}

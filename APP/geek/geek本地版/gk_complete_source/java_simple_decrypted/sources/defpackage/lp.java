package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lp {
    public static final Integer a = null;

    static {
        Integer r0 = null;
        Object r1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);     // Catch: Throwable -> L14
        if ((r1 instanceof Integer) == false) goto L7;
        Integer r12 = (Integer) r1;     // Catch: Throwable -> L14
    L8:
        if (r12 != null) goto L10;
    L12:
        a = r0;
        return;
    L10:
        if (r12.intValue() <= 0) goto L12;
        r0 = r12;
    L7:
        r12 = null;
        goto L8
    }
}

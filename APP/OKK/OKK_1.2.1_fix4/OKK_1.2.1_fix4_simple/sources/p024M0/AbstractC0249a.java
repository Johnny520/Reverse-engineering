package p024M0;

/* JADX INFO: renamed from: M0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0249a {

    /* JADX INFO: renamed from: a */
    public static final Integer f525a = null;

    static {
        Integer r02 = null;
        Object r1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);     // Catch: Throwable -> L14
        if ((r1 instanceof Integer) == false) goto L7;
        Integer r12 = (Integer) r1;     // Catch: Throwable -> L14
    L8:
        if (r12 != null) goto L10;
    L12:
        f525a = r02;
        return;
    L10:
        if (r12.intValue() <= 0) goto L12;
        r02 = r12;
    L7:
        r12 = null;
        goto L8
    }
}

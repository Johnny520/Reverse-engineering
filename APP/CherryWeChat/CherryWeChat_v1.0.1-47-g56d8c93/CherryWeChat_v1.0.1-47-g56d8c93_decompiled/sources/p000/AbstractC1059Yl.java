package p000;

/* JADX INFO: renamed from: Yl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1059Yl {

    /* JADX INFO: renamed from: a */
    public static final Integer f3367a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f3367a = num;
    }
}

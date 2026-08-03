package p000;

/* JADX INFO: renamed from: Xl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1016Xl {

    /* JADX INFO: renamed from: a */
    public static final Integer f3224a;

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
        f3224a = num;
    }
}

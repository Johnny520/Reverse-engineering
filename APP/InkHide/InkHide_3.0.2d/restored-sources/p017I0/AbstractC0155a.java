package p017I0;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0155a {

    /* JADX INFO: renamed from: a */
    public static final Integer f468a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        f468a = num;
    }
}

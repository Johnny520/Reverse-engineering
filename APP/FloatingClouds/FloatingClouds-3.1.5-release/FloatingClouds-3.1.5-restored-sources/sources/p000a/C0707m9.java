package p000a;

/* JADX INFO: renamed from: a.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0707m9 extends C0688l9 {

    /* JADX INFO: renamed from: a.m9$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Integer f2672a;

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
            f2672a = num;
        }
    }
}

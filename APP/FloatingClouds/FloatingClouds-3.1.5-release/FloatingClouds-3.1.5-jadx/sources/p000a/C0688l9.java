package p000a;

/* JADX INFO: renamed from: a.l9 */
/* JADX INFO: loaded from: classes.dex */
public class C0688l9 extends C0881vc {

    /* JADX INFO: renamed from: a.l9$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Integer f2552a;

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
            f2552a = num;
        }
    }

    @Override // p000a.C0881vc
    /* JADX INFO: renamed from: a */
    public final void mo1550a(Throwable th, Throwable th2) {
        C0631i9.m1482e(th, "cause");
        C0631i9.m1482e(th2, "exception");
        Integer num = a.f2552a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo1550a(th, th2);
        }
    }
}

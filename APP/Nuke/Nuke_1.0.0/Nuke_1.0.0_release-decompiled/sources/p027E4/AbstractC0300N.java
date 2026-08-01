package p027E4;

/* JADX INFO: renamed from: E4.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300N {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC0312a f960a;

    /* JADX INFO: renamed from: b */
    public static final C0314b f961b;

    /* JADX INFO: renamed from: c */
    public static final C0314b f962c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f960a = null;
            f961b = new C0314b(7);
            f962c = new C0314b(6);
        } else if (property.equals("Dalvik")) {
            f960a = new ExecutorC0312a();
            f961b = new C0301O(0);
            f962c = new C0317d(6);
        } else {
            f960a = null;
            f961b = new C0301O(1);
            f962c = new C0317d(6);
        }
    }
}

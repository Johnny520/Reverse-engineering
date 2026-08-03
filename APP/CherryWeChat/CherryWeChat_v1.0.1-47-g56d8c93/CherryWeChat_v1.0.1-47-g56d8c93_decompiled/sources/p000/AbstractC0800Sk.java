package p000;

/* JADX INFO: renamed from: Sk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800Sk {

    /* JADX INFO: renamed from: a */
    public static final int f2505a;

    /* JADX INFO: renamed from: b */
    public static final int f2506b;

    /* JADX INFO: renamed from: c */
    public static final int f2507c;

    static {
        int i;
        if (System.getProperty("os.name").contains("Windows")) {
            f2505a = 1;
        } else if (System.getProperty("os.name").contains("Linux")) {
            f2505a = 2;
        } else if (System.getProperty("os.name").contains("Mac")) {
            f2505a = 3;
        }
        if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
            f2507c = 2;
        } else if (System.getProperty("os.arch").startsWith("riscv")) {
            f2507c = 3;
        } else if (System.getProperty("os.arch").startsWith("loongarch")) {
            f2507c = 4;
        }
        if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
            f2506b = 2;
        } else if (System.getProperty("os.arch").contains("128")) {
            f2506b = 3;
        }
        boolean z = System.getProperty("moe.platform.name") != null;
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            f2505a = 4;
            f2506b = 1;
            f2507c = 1;
        }
        if (z || !((i = f2505a) == 4 || i == 1 || i == 2 || i == 3)) {
            f2505a = 5;
            f2506b = 1;
            f2507c = 1;
        }
    }
}

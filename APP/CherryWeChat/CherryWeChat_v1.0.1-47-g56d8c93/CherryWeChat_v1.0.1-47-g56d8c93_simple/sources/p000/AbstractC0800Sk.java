package p000;

/* JADX INFO: renamed from: Sk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800Sk {

    /* JADX INFO: renamed from: a */
    public static final int f2505a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f2506b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f2507c = 1;

    static {
        if (System.getProperty("os.name").contains("Windows") == false) goto L6;
        f2505a = 1;
    L12:
        if (System.getProperty("os.arch").startsWith("arm") == false) goto L14;
    L22:
        f2507c = 2;
    L24:
        if (System.getProperty("os.arch").contains("64") == false) goto L26;
    L31:
        f2506b = 2;
    L33:
        if (System.getProperty("moe.platform.name") == null) goto L35;
        boolean r0 = true;
    L36:
        String r1 = System.getProperty("java.runtime.name");
        if (r1 != null) goto L39;
    L41:
        if (r0 == true) goto L49;
        int r02 = f2505a;
        if (r02 == 4) goto L48;
        if (r02 == 1) goto L51;
        if (r02 == 2) goto L52;
        if (r02 != 3) goto L49;
        return;
    L52:
        return;
    L51:
        return;
    L48:
        return;
    L49:
        f2505a = 5;
        f2506b = 1;
        f2507c = 1;
        return;
    L39:
        if (r1.contains("Android Runtime") == false) goto L41;
        f2505a = 4;
        f2506b = 1;
        f2507c = 1;
        goto L41
    L35:
        r0 = false;
        goto L36
    L26:
        if (System.getProperty("os.arch").startsWith("armv8") == true) goto L31;
        if (System.getProperty("os.arch").contains("128") == false) goto L33;
        f2506b = 3;
        goto L33
    L14:
        if (System.getProperty("os.arch").startsWith("aarch64") == true) goto L22;
        if (System.getProperty("os.arch").startsWith("riscv") == false) goto L20;
        f2507c = 3;
        goto L24
    L20:
        if (System.getProperty("os.arch").startsWith("loongarch") == false) goto L24;
        f2507c = 4;
        goto L24
    L6:
        if (System.getProperty("os.name").contains("Linux") == false) goto L9;
        f2505a = 2;
        goto L12
    L9:
        if (System.getProperty("os.name").contains("Mac") == false) goto L12;
        f2505a = 3;
        goto L12
    }
}

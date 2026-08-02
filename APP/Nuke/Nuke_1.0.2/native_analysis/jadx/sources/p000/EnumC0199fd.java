package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0199fd {

    /* JADX INFO: renamed from: h */
    public static final EnumC0199fd f2906h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0199fd f2907i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0199fd[] f2908j;

    static {
        EnumC0199fd enumC0199fd = new EnumC0199fd("BoundReached", 0);
        f2906h = enumC0199fd;
        EnumC0199fd enumC0199fd2 = new EnumC0199fd("Finished", 1);
        f2907i = enumC0199fd2;
        f2908j = new EnumC0199fd[]{enumC0199fd, enumC0199fd2};
    }

    public static EnumC0199fd valueOf(String str) {
        return (EnumC0199fd) Enum.valueOf(EnumC0199fd.class, str);
    }

    public static EnumC0199fd[] values() {
        return (EnumC0199fd[]) f2908j.clone();
    }
}

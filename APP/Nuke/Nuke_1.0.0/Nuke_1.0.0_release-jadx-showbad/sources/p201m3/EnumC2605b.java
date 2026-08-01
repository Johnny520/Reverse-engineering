package p201m3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m3.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2605b {

    /* JADX INFO: renamed from: d */
    public static final EnumC2605b f8286d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2605b f8287e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2605b f8288f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2605b f8289g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2605b f8290h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC2605b[] f8291i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2605b enumC2605b = new EnumC2605b("CPU_ACQUIRED", 0);
        f8286d = enumC2605b;
        EnumC2605b enumC2605b2 = new EnumC2605b("BLOCKING", 1);
        f8287e = enumC2605b2;
        EnumC2605b enumC2605b3 = new EnumC2605b("PARKING", 2);
        f8288f = enumC2605b3;
        EnumC2605b enumC2605b4 = new EnumC2605b("DORMANT", 3);
        f8289g = enumC2605b4;
        EnumC2605b enumC2605b5 = new EnumC2605b("TERMINATED", 4);
        f8290h = enumC2605b5;
        f8291i = new EnumC2605b[]{enumC2605b, enumC2605b2, enumC2605b3, enumC2605b4, enumC2605b5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2605b valueOf(String str) {
        return (EnumC2605b) Enum.valueOf(EnumC2605b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2605b[] values() {
        return (EnumC2605b[]) f8291i.clone();
    }
}

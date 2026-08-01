package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1007zk {

    /* JADX INFO: renamed from: d */
    public static final EnumC1007zk f7916d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1007zk f7917e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1007zk f7918f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC1007zk[] f7919g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1007zk enumC1007zk = new EnumC1007zk("COROUTINE_SUSPENDED", 0);
        f7916d = enumC1007zk;
        EnumC1007zk enumC1007zk2 = new EnumC1007zk("UNDECIDED", 1);
        f7917e = enumC1007zk2;
        EnumC1007zk enumC1007zk3 = new EnumC1007zk("RESUMED", 2);
        f7918f = enumC1007zk3;
        f7919g = new EnumC1007zk[]{enumC1007zk, enumC1007zk2, enumC1007zk3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1007zk valueOf(String str) {
        return (EnumC1007zk) Enum.valueOf(EnumC1007zk.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1007zk[] values() {
        return (EnumC1007zk[]) f7919g.clone();
    }
}

package p117i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i0.u1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1885u1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1885u1 f6256g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1885u1 f6257h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1885u1 f6258i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1885u1 f6259j;

    /* JADX INFO: renamed from: k */
    public static final EnumC1885u1 f6260k;

    /* JADX INFO: renamed from: l */
    public static final EnumC1885u1 f6261l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC1885u1[] f6262m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1885u1 enumC1885u1 = new EnumC1885u1("ShutDown", 0);
        f6256g = enumC1885u1;
        EnumC1885u1 enumC1885u12 = new EnumC1885u1("ShuttingDown", 1);
        f6257h = enumC1885u12;
        EnumC1885u1 enumC1885u13 = new EnumC1885u1("Inactive", 2);
        f6258i = enumC1885u13;
        EnumC1885u1 enumC1885u14 = new EnumC1885u1("InactivePendingWork", 3);
        f6259j = enumC1885u14;
        EnumC1885u1 enumC1885u15 = new EnumC1885u1("Idle", 4);
        f6260k = enumC1885u15;
        EnumC1885u1 enumC1885u16 = new EnumC1885u1("PendingWork", 5);
        f6261l = enumC1885u16;
        f6262m = new EnumC1885u1[]{enumC1885u1, enumC1885u12, enumC1885u13, enumC1885u14, enumC1885u15, enumC1885u16};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1885u1 valueOf(String str) {
        return (EnumC1885u1) Enum.valueOf(EnumC1885u1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1885u1[] values() {
        return (EnumC1885u1[]) f6262m.clone();
    }
}

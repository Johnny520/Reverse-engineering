package p279t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4083c {

    /* JADX INFO: renamed from: g */
    public static final EnumC4083c f13526g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4083c f13527h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4083c[] f13528i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4083c enumC4083c = new EnumC4083c("Lsq2", 0);
        f13526g = enumC4083c;
        EnumC4083c enumC4083c2 = new EnumC4083c("Impulse", 1);
        f13527h = enumC4083c2;
        f13528i = new EnumC4083c[]{enumC4083c, enumC4083c2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4083c valueOf(String str) {
        return (EnumC4083c) Enum.valueOf(EnumC4083c.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4083c[] values() {
        return (EnumC4083c[]) f13528i.clone();
    }
}

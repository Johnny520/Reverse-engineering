package p095T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1392v0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC1392v0 f4934d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1392v0 f4935e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1392v0 f4936f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1392v0 f4937g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1392v0 f4938h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1392v0 f4939i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1392v0[] f4940j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1392v0 enumC1392v0 = new EnumC1392v0("ShutDown", 0);
        f4934d = enumC1392v0;
        EnumC1392v0 enumC1392v02 = new EnumC1392v0("ShuttingDown", 1);
        f4935e = enumC1392v02;
        EnumC1392v0 enumC1392v03 = new EnumC1392v0("Inactive", 2);
        f4936f = enumC1392v03;
        EnumC1392v0 enumC1392v04 = new EnumC1392v0("InactivePendingWork", 3);
        f4937g = enumC1392v04;
        EnumC1392v0 enumC1392v05 = new EnumC1392v0("Idle", 4);
        f4938h = enumC1392v05;
        EnumC1392v0 enumC1392v06 = new EnumC1392v0("PendingWork", 5);
        f4939i = enumC1392v06;
        f4940j = new EnumC1392v0[]{enumC1392v0, enumC1392v02, enumC1392v03, enumC1392v04, enumC1392v05, enumC1392v06};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1392v0 valueOf(String str) {
        return (EnumC1392v0) Enum.valueOf(EnumC1392v0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1392v0[] values() {
        return (EnumC1392v0[]) f4940j.clone();
    }
}

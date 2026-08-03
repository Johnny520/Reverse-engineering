package p256r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3708b {

    /* JADX INFO: renamed from: g */
    public static final EnumC3708b f12060g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3708b f12061h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3708b f12062i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3708b[] f12063j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3708b enumC3708b = new EnumC3708b("NO", 0);
        f12060g = enumC3708b;
        EnumC3708b enumC3708b2 = new EnumC3708b("NOTICE", 1);
        f12061h = enumC3708b2;
        EnumC3708b enumC3708b3 = new EnumC3708b("SILENT", 2);
        f12062i = enumC3708b3;
        f12063j = new EnumC3708b[]{enumC3708b, enumC3708b2, enumC3708b3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3708b valueOf(String str) {
        return (EnumC3708b) Enum.valueOf(EnumC3708b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3708b[] values() {
        return (EnumC3708b[]) f12063j.clone();
    }
}

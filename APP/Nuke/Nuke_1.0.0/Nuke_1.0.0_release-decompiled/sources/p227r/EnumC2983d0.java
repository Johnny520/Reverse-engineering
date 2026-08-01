package p227r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2983d0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC2983d0 f9447d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2983d0 f9448e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2983d0[] f9449f;

    static {
        EnumC2983d0 enumC2983d0 = new EnumC2983d0("Vertical", 0);
        f9447d = enumC2983d0;
        EnumC2983d0 enumC2983d02 = new EnumC2983d0("Horizontal", 1);
        f9448e = enumC2983d02;
        f9449f = new EnumC2983d0[]{enumC2983d0, enumC2983d02};
    }

    public static EnumC2983d0 valueOf(String str) {
        return (EnumC2983d0) Enum.valueOf(EnumC2983d0.class, str);
    }

    public static EnumC2983d0[] values() {
        return (EnumC2983d0[]) f9449f.clone();
    }
}

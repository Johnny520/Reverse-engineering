package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۢ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC7587 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC7587 f22943 = new EnumC7587("Ready", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC7587 f22944 = new EnumC7587("NotReady", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC7587 f22945 = new EnumC7587("Done", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final EnumC7587 f22946 = new EnumC7587("Failed", 3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7587[] f22947;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f22948;

    static {
        EnumC7587[] enumC7587ArrM3747 = m3747();
        f22947 = enumC7587ArrM3747;
        f22948 = C4655.m1607(enumC7587ArrM3747);
    }

    public EnumC7587(String str, int i) {
    }

    public static EnumC7587 valueOf(String str) {
        return (EnumC7587) Enum.valueOf(EnumC7587.class, str);
    }

    public static EnumC7587[] values() {
        return (EnumC7587[]) f22947.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC7587[] m3747() {
        return new EnumC7587[]{f22943, f22944, f22945, f22946};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC7587> m23749() {
        return f22948;
    }
}

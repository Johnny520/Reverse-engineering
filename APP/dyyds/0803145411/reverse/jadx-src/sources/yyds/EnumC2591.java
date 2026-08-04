package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᲈᛱᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2591 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC2591 f12770;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC2591 f12771;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2591[] f12772;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC2591 f12773;

    static {
        EnumC2591 enumC2591 = new EnumC2591("NO_OP", 0);
        f12771 = enumC2591;
        EnumC2591 enumC25912 = new EnumC2591("ADD", 1);
        f12773 = enumC25912;
        EnumC2591 enumC25913 = new EnumC2591("REMOVE", 2);
        f12770 = enumC25913;
        f12772 = new EnumC2591[]{enumC2591, enumC25912, enumC25913};
    }

    public static EnumC2591 valueOf(String str) {
        return (EnumC2591) Enum.valueOf(EnumC2591.class, str);
    }

    public static EnumC2591[] values() {
        return (EnumC2591[]) f12772.clone();
    }
}

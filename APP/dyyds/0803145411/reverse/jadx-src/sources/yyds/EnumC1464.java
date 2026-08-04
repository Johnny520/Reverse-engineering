package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛶᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1464 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1464[] f6966;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC1464 f6967;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final EnumC1464 f6968;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC1464 f6969;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumC1464 f6970;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC1464 f6971;

    static {
        EnumC1464 enumC1464 = new EnumC1464("DESTROYED", 0);
        f6969 = enumC1464;
        EnumC1464 enumC14642 = new EnumC1464("INITIALIZED", 1);
        f6971 = enumC14642;
        EnumC1464 enumC14643 = new EnumC1464("CREATED", 2);
        f6967 = enumC14643;
        EnumC1464 enumC14644 = new EnumC1464("STARTED", 3);
        f6970 = enumC14644;
        EnumC1464 enumC14645 = new EnumC1464("RESUMED", 4);
        f6968 = enumC14645;
        f6966 = new EnumC1464[]{enumC1464, enumC14642, enumC14643, enumC14644, enumC14645};
    }

    public static EnumC1464 valueOf(String str) {
        return (EnumC1464) Enum.valueOf(EnumC1464.class, str);
    }

    public static EnumC1464[] values() {
        return (EnumC1464[]) f6966.clone();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m2970(EnumC1464 enumC1464) {
        return compareTo(enumC1464) >= 0;
    }
}

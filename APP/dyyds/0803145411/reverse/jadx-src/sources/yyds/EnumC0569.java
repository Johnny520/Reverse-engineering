package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛳᛴᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0569 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0569[] f2745;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC0569 f2746;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC0569 f2747;

    static {
        EnumC0569 enumC0569 = new EnumC0569("OnErrorDiscard", 0);
        f2746 = enumC0569;
        EnumC0569 enumC05692 = new EnumC0569("OnErrorRecover", 1);
        f2747 = enumC05692;
        f2745 = new EnumC0569[]{enumC0569, enumC05692};
    }

    public static EnumC0569 valueOf(String str) {
        return (EnumC0569) Enum.valueOf(EnumC0569.class, str);
    }

    public static EnumC0569[] values() {
        return (EnumC0569[]) f2745.clone();
    }
}

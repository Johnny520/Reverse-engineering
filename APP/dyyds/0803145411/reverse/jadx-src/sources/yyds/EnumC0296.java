package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛲᛲᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0296 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC0296 f1566;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0296[] f1567;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC0296 f1568;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumC0296 f1569;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC0296 f1570;

    static {
        EnumC0296 enumC0296 = new EnumC0296("IMMEDIATE", 0);
        f1568 = enumC0296;
        EnumC0296 enumC02962 = new EnumC0296("HIGH", 1);
        f1570 = enumC02962;
        EnumC0296 enumC02963 = new EnumC0296("NORMAL", 2);
        f1566 = enumC02963;
        EnumC0296 enumC02964 = new EnumC0296("LOW", 3);
        f1569 = enumC02964;
        f1567 = new EnumC0296[]{enumC0296, enumC02962, enumC02963, enumC02964};
    }

    public static EnumC0296 valueOf(String str) {
        return (EnumC0296) Enum.valueOf(EnumC0296.class, str);
    }

    public static EnumC0296[] values() {
        return (EnumC0296[]) f1567.clone();
    }
}

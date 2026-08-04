package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛸᛴᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1765 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC1765 f8858;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1765[] f8859;

    static {
        EnumC1765 enumC1765 = new EnumC1765("COROUTINE_SUSPENDED", 0);
        f8858 = enumC1765;
        f8859 = new EnumC1765[]{enumC1765, new EnumC1765("UNDECIDED", 1), new EnumC1765("RESUMED", 2)};
    }

    public static EnumC1765 valueOf(String str) {
        return (EnumC1765) Enum.valueOf(EnumC1765.class, str);
    }

    public static EnumC1765[] values() {
        return (EnumC1765[]) f8859.clone();
    }
}

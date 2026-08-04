package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᲀᲀᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2065 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2065[] f10215;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC2065 f10216;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC2065 f10217;

    static {
        EnumC2065 enumC2065 = new EnumC2065("DEFERRED", 0);
        f10216 = enumC2065;
        EnumC2065 enumC20652 = new EnumC2065("IMMEDIATE", 1);
        f10217 = enumC20652;
        f10215 = new EnumC2065[]{enumC2065, enumC20652, new EnumC2065("EXCLUSIVE", 2)};
    }

    public static EnumC2065 valueOf(String str) {
        return (EnumC2065) Enum.valueOf(EnumC2065.class, str);
    }

    public static EnumC2065[] values() {
        return (EnumC2065[]) f10215.clone();
    }
}

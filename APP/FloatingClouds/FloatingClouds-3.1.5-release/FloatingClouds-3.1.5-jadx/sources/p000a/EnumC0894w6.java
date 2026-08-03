package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.w6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0894w6 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0894w6 f3496a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0894w6[] f3497b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0894w6 EF0;

    static {
        EnumC0894w6 enumC0894w6 = new EnumC0894w6("TOP_DOWN", 0);
        EnumC0894w6 enumC0894w62 = new EnumC0894w6("BOTTOM_UP", 1);
        f3496a = enumC0894w62;
        f3497b = new EnumC0894w6[]{enumC0894w6, enumC0894w62};
    }

    public EnumC0894w6() {
        throw null;
    }

    public static EnumC0894w6 valueOf(String str) {
        return (EnumC0894w6) Enum.valueOf(EnumC0894w6.class, str);
    }

    public static EnumC0894w6[] values() {
        return (EnumC0894w6[]) f3497b.clone();
    }
}

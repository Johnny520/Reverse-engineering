package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jk */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0377jk {

    /* JADX INFO: renamed from: a */
    public static final EnumC0377jk f2724a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0377jk[] f2725b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0377jk EF0;

    static {
        EnumC0377jk enumC0377jk = new EnumC0377jk("TOP_DOWN", 0);
        EnumC0377jk enumC0377jk2 = new EnumC0377jk("BOTTOM_UP", 1);
        f2724a = enumC0377jk2;
        f2725b = new EnumC0377jk[]{enumC0377jk, enumC0377jk2};
    }

    public static EnumC0377jk valueOf(String str) {
        return (EnumC0377jk) Enum.valueOf(EnumC0377jk.class, str);
    }

    public static EnumC0377jk[] values() {
        return (EnumC0377jk[]) f2725b.clone();
    }
}

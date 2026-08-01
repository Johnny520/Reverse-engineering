package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hk */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0301hk {

    /* JADX INFO: renamed from: a */
    public static final EnumC0301hk f2281a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0301hk[] f2282b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0301hk EF0;

    static {
        EnumC0301hk enumC0301hk = new EnumC0301hk("TOP_DOWN", 0);
        EnumC0301hk enumC0301hk2 = new EnumC0301hk("BOTTOM_UP", 1);
        f2281a = enumC0301hk2;
        f2282b = new EnumC0301hk[]{enumC0301hk, enumC0301hk2};
    }

    public static EnumC0301hk valueOf(String str) {
        return (EnumC0301hk) Enum.valueOf(EnumC0301hk.class, str);
    }

    public static EnumC0301hk[] values() {
        return (EnumC0301hk[]) f2282b.clone();
    }
}

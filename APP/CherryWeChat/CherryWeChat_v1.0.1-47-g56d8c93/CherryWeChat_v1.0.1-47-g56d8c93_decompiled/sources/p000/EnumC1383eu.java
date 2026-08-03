package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eu */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1383eu {

    /* JADX INFO: renamed from: a */
    public static final EnumC1383eu f4928a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1383eu[] f4929b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1383eu EF0;

    static {
        EnumC1383eu enumC1383eu = new EnumC1383eu("SRGB", 0);
        EnumC1383eu enumC1383eu2 = new EnumC1383eu("DISPLAY_P3", 1);
        f4928a = enumC1383eu2;
        f4929b = new EnumC1383eu[]{enumC1383eu, enumC1383eu2};
    }

    public static EnumC1383eu valueOf(String str) {
        return (EnumC1383eu) Enum.valueOf(EnumC1383eu.class, str);
    }

    public static EnumC1383eu[] values() {
        return (EnumC1383eu[]) f4929b.clone();
    }
}

package p026N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: N0.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0269j {

    /* JADX INFO: renamed from: a */
    public static final EnumC0269j f564a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0269j[] f565b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0269j EF0;

    static {
        EnumC0269j enumC0269j = new EnumC0269j("TOP_DOWN", 0);
        EnumC0269j enumC0269j2 = new EnumC0269j("BOTTOM_UP", 1);
        f564a = enumC0269j2;
        f565b = new EnumC0269j[]{enumC0269j, enumC0269j2};
    }

    public static EnumC0269j valueOf(String str) {
        return (EnumC0269j) Enum.valueOf(EnumC0269j.class, str);
    }

    public static EnumC0269j[] values() {
        return (EnumC0269j[]) f565b.clone();
    }
}

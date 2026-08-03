package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.u6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0856u6 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0856u6 f3361a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0856u6 f3362b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0856u6[] f3363c;

    static {
        EnumC0856u6 enumC0856u6 = new EnumC0856u6("Read", 0);
        f3361a = enumC0856u6;
        EnumC0856u6 enumC0856u62 = new EnumC0856u6("Write", 1);
        f3362b = enumC0856u62;
        f3363c = new EnumC0856u6[]{enumC0856u6, enumC0856u62};
    }

    public EnumC0856u6() {
        throw null;
    }

    public static EnumC0856u6 valueOf(String str) {
        return (EnumC0856u6) Enum.valueOf(EnumC0856u6.class, str);
    }

    public static EnumC0856u6[] values() {
        return (EnumC0856u6[]) f3363c.clone();
    }
}

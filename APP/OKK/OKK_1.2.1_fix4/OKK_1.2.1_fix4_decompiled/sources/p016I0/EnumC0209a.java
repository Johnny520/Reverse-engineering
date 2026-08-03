package p016I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0209a {

    /* JADX INFO: renamed from: a */
    public static final EnumC0209a f425a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0209a[] f426b;

    static {
        EnumC0209a enumC0209a = new EnumC0209a("COROUTINE_SUSPENDED", 0);
        f425a = enumC0209a;
        f426b = new EnumC0209a[]{enumC0209a, new EnumC0209a("UNDECIDED", 1), new EnumC0209a("RESUMED", 2)};
    }

    public static EnumC0209a valueOf(String str) {
        return (EnumC0209a) Enum.valueOf(EnumC0209a.class, str);
    }

    public static EnumC0209a[] values() {
        return (EnumC0209a[]) f426b.clone();
    }
}

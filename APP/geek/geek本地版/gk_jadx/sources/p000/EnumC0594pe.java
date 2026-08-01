package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pe */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0594pe {

    /* JADX INFO: renamed from: a */
    public static final EnumC0594pe f3883a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0594pe[] f3884b;

    static {
        EnumC0594pe enumC0594pe = new EnumC0594pe("COROUTINE_SUSPENDED", 0);
        f3883a = enumC0594pe;
        f3884b = new EnumC0594pe[]{enumC0594pe, new EnumC0594pe("UNDECIDED", 1), new EnumC0594pe("RESUMED", 2)};
    }

    public static EnumC0594pe valueOf(String str) {
        return (EnumC0594pe) Enum.valueOf(EnumC0594pe.class, str);
    }

    public static EnumC0594pe[] values() {
        return (EnumC0594pe[]) f3884b.clone();
    }
}

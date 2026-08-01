package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qe */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0630qe {

    /* JADX INFO: renamed from: a */
    public static final EnumC0630qe f3899a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0630qe[] f3900b;

    static {
        EnumC0630qe enumC0630qe = new EnumC0630qe("COROUTINE_SUSPENDED", 0);
        f3899a = enumC0630qe;
        f3900b = new EnumC0630qe[]{enumC0630qe, new EnumC0630qe("UNDECIDED", 1), new EnumC0630qe("RESUMED", 2)};
    }

    public static EnumC0630qe valueOf(String str) {
        return (EnumC0630qe) Enum.valueOf(EnumC0630qe.class, str);
    }

    public static EnumC0630qe[] values() {
        return (EnumC0630qe[]) f3900b.clone();
    }
}

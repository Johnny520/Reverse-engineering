package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gc */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1453gc {

    /* JADX INFO: renamed from: a */
    public static final EnumC1453gc f5148a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1453gc[] f5149b;

    static {
        EnumC1453gc enumC1453gc = new EnumC1453gc("COROUTINE_SUSPENDED", 0);
        f5148a = enumC1453gc;
        f5149b = new EnumC1453gc[]{enumC1453gc, new EnumC1453gc("UNDECIDED", 1), new EnumC1453gc("RESUMED", 2)};
    }

    public static EnumC1453gc valueOf(String str) {
        return (EnumC1453gc) Enum.valueOf(EnumC1453gc.class, str);
    }

    public static EnumC1453gc[] values() {
        return (EnumC1453gc[]) f5149b.clone();
    }
}

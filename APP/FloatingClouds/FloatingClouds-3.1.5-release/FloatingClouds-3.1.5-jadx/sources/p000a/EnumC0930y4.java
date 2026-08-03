package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0930y4 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0930y4 f3540a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0930y4[] f3541b;

    static {
        EnumC0930y4 enumC0930y4 = new EnumC0930y4("COROUTINE_SUSPENDED", 0);
        f3540a = enumC0930y4;
        f3541b = new EnumC0930y4[]{enumC0930y4, new EnumC0930y4("UNDECIDED", 1), new EnumC0930y4("RESUMED", 2)};
    }

    public EnumC0930y4() {
        throw null;
    }

    public static EnumC0930y4 valueOf(String str) {
        return (EnumC0930y4) Enum.valueOf(EnumC0930y4.class, str);
    }

    public static EnumC0930y4[] values() {
        return (EnumC0930y4[]) f3541b.clone();
    }
}

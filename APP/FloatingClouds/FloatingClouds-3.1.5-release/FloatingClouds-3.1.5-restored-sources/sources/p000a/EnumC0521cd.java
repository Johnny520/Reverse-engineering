package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.cd */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0521cd {

    /* JADX INFO: renamed from: a */
    public static final EnumC0521cd f1908a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0521cd f1909b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0521cd f1910c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0521cd[] f1911d;

    static {
        EnumC0521cd enumC0521cd = new EnumC0521cd("DEXKIT_PRIMARY", 0);
        f1908a = enumC0521cd;
        EnumC0521cd enumC0521cd2 = new EnumC0521cd("LITERAL_FALLBACK", 1);
        f1909b = enumC0521cd2;
        EnumC0521cd enumC0521cd3 = new EnumC0521cd("CACHE_HIT", 2);
        f1910c = enumC0521cd3;
        f1911d = new EnumC0521cd[]{enumC0521cd, enumC0521cd2, enumC0521cd3};
    }

    public EnumC0521cd() {
        throw null;
    }

    public static EnumC0521cd valueOf(String str) {
        return (EnumC0521cd) Enum.valueOf(EnumC0521cd.class, str);
    }

    public static EnumC0521cd[] values() {
        return (EnumC0521cd[]) f1911d.clone();
    }
}

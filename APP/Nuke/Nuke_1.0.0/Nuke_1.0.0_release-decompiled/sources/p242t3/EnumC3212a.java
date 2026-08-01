package p242t3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t3.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3212a {

    /* JADX INFO: renamed from: d */
    public static final EnumC3212a f9993d;

    /* JADX INFO: renamed from: e */
    public static final EnumC3212a f9994e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC3212a[] f9995f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3212a EF0;

    static {
        EnumC3212a enumC3212a = new EnumC3212a("NONE", 0);
        EnumC3212a enumC3212a2 = new EnumC3212a("ALL_JSON_OBJECTS", 1);
        f9993d = enumC3212a2;
        EnumC3212a enumC3212a3 = new EnumC3212a("POLYMORPHIC", 2);
        f9994e = enumC3212a3;
        f9995f = new EnumC3212a[]{enumC3212a, enumC3212a2, enumC3212a3};
    }

    public static EnumC3212a valueOf(String str) {
        return (EnumC3212a) Enum.valueOf(EnumC3212a.class, str);
    }

    public static EnumC3212a[] values() {
        return (EnumC3212a[]) f9995f.clone();
    }
}

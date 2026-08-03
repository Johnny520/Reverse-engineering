package p049b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0563m {

    /* JADX INFO: renamed from: a */
    public static final EnumC0563m f1664a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0563m f1665b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0563m f1666c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0563m[] f1667d;

    static {
        EnumC0563m enumC0563m = new EnumC0563m("OK", 0);
        f1664a = enumC0563m;
        EnumC0563m enumC0563m2 = new EnumC0563m("PARTIAL", 1);
        f1665b = enumC0563m2;
        EnumC0563m enumC0563m3 = new EnumC0563m("FAIL", 2);
        f1666c = enumC0563m3;
        f1667d = new EnumC0563m[]{enumC0563m, enumC0563m2, enumC0563m3};
    }

    public static EnumC0563m valueOf(String str) {
        return (EnumC0563m) Enum.valueOf(EnumC0563m.class, str);
    }

    public static EnumC0563m[] values() {
        return (EnumC0563m[]) f1667d.clone();
    }
}

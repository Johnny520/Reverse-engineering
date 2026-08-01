package p058L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0938j {

    /* JADX INFO: renamed from: d */
    public static final EnumC0938j f2940d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0938j f2941e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0938j f2942f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0938j f2943g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC0938j[] f2944h;

    static {
        EnumC0938j enumC0938j = new EnumC0938j("Up", 0);
        f2940d = enumC0938j;
        EnumC0938j enumC0938j2 = new EnumC0938j("Drag", 1);
        f2941e = enumC0938j2;
        EnumC0938j enumC0938j3 = new EnumC0938j("Timeout", 2);
        f2942f = enumC0938j3;
        EnumC0938j enumC0938j4 = new EnumC0938j("Cancel", 3);
        f2943g = enumC0938j4;
        f2944h = new EnumC0938j[]{enumC0938j, enumC0938j2, enumC0938j3, enumC0938j4};
    }

    public static EnumC0938j valueOf(String str) {
        return (EnumC0938j) Enum.valueOf(EnumC0938j.class, str);
    }

    public static EnumC0938j[] values() {
        return (EnumC0938j[]) f2944h.clone();
    }
}

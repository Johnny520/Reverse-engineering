package p029F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.S */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0380S {

    /* JADX INFO: renamed from: d */
    public static final EnumC0380S f1190d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0380S f1191e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0380S[] f1192f;

    static {
        EnumC0380S enumC0380S = new EnumC0380S("Min", 0);
        f1190d = enumC0380S;
        EnumC0380S enumC0380S2 = new EnumC0380S("Max", 1);
        f1191e = enumC0380S2;
        f1192f = new EnumC0380S[]{enumC0380S, enumC0380S2};
    }

    public static EnumC0380S valueOf(String str) {
        return (EnumC0380S) Enum.valueOf(EnumC0380S.class, str);
    }

    public static EnumC0380S[] values() {
        return (EnumC0380S[]) f1192f.clone();
    }
}

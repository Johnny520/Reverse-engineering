package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wu */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2688wu {

    /* JADX INFO: renamed from: a */
    public static final EnumC2688wu f9251a;

    /* JADX INFO: renamed from: b */
    public static final EnumC2688wu f9252b;

    /* JADX INFO: renamed from: c */
    public static final EnumC2688wu f9253c;

    /* JADX INFO: renamed from: d */
    public static final EnumC2688wu f9254d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC2688wu[] f9255e;

    static {
        EnumC2688wu enumC2688wu = new EnumC2688wu("IMMEDIATE", 0);
        f9251a = enumC2688wu;
        EnumC2688wu enumC2688wu2 = new EnumC2688wu("HIGH", 1);
        f9252b = enumC2688wu2;
        EnumC2688wu enumC2688wu3 = new EnumC2688wu("NORMAL", 2);
        f9253c = enumC2688wu3;
        EnumC2688wu enumC2688wu4 = new EnumC2688wu("LOW", 3);
        f9254d = enumC2688wu4;
        f9255e = new EnumC2688wu[]{enumC2688wu, enumC2688wu2, enumC2688wu3, enumC2688wu4};
    }

    public static EnumC2688wu valueOf(String str) {
        return (EnumC2688wu) Enum.valueOf(EnumC2688wu.class, str);
    }

    public static EnumC2688wu[] values() {
        return (EnumC2688wu[]) f9255e.clone();
    }
}

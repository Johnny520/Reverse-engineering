package p178i3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i3.v */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2341v {

    /* JADX INFO: renamed from: d */
    public static final EnumC2341v f7630d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2341v f7631e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2341v f7632f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2341v[] f7633g;

    static {
        EnumC2341v enumC2341v = new EnumC2341v("START", 0);
        f7630d = enumC2341v;
        EnumC2341v enumC2341v2 = new EnumC2341v("STOP", 1);
        f7631e = enumC2341v2;
        EnumC2341v enumC2341v3 = new EnumC2341v("STOP_AND_RESET_REPLAY_CACHE", 2);
        f7632f = enumC2341v3;
        f7633g = new EnumC2341v[]{enumC2341v, enumC2341v2, enumC2341v3};
    }

    public static EnumC2341v valueOf(String str) {
        return (EnumC2341v) Enum.valueOf(EnumC2341v.class, str);
    }

    public static EnumC2341v[] values() {
        return (EnumC2341v[]) f7633g.clone();
    }
}

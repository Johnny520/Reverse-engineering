package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.E */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0557E {

    /* JADX INFO: renamed from: d */
    public static final EnumC0557E f1672d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0557E f1673e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0557E f1674f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0557E f1675g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0557E f1676h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0557E[] f1677i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0557E enumC0557E = new EnumC0557E("Measuring", 0);
        f1672d = enumC0557E;
        EnumC0557E enumC0557E2 = new EnumC0557E("LookaheadMeasuring", 1);
        f1673e = enumC0557E2;
        EnumC0557E enumC0557E3 = new EnumC0557E("LayingOut", 2);
        f1674f = enumC0557E3;
        EnumC0557E enumC0557E4 = new EnumC0557E("LookaheadLayingOut", 3);
        f1675g = enumC0557E4;
        EnumC0557E enumC0557E5 = new EnumC0557E("Idle", 4);
        f1676h = enumC0557E5;
        f1677i = new EnumC0557E[]{enumC0557E, enumC0557E2, enumC0557E3, enumC0557E4, enumC0557E5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0557E valueOf(String str) {
        return (EnumC0557E) Enum.valueOf(EnumC0557E.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0557E[] values() {
        return (EnumC0557E[]) f1677i.clone();
    }
}

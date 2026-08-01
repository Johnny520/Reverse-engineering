package p000A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0050a0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0050a0 f204d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0050a0 f205e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0050a0 f206f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0050a0[] f207g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0050a0 enumC0050a0 = new EnumC0050a0("Cursor", 0);
        f204d = enumC0050a0;
        EnumC0050a0 enumC0050a02 = new EnumC0050a0("SelectionStart", 1);
        f205e = enumC0050a02;
        EnumC0050a0 enumC0050a03 = new EnumC0050a0("SelectionEnd", 2);
        f206f = enumC0050a03;
        f207g = new EnumC0050a0[]{enumC0050a0, enumC0050a02, enumC0050a03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0050a0 valueOf(String str) {
        return (EnumC0050a0) Enum.valueOf(EnumC0050a0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0050a0[] values() {
        return (EnumC0050a0[]) f207g.clone();
    }
}

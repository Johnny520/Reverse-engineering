package p021K0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K0.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0170i {

    /* JADX INFO: renamed from: a */
    public static final EnumC0170i f491a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0170i[] f492b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0170i EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0170i enumC0170i = new EnumC0170i("TOP_DOWN", 0);
        EnumC0170i enumC0170i2 = new EnumC0170i("BOTTOM_UP", 1);
        f491a = enumC0170i2;
        f492b = new EnumC0170i[]{enumC0170i, enumC0170i2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0170i valueOf(String str) {
        return (EnumC0170i) Enum.valueOf(EnumC0170i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0170i[] values() {
        return (EnumC0170i[]) f492b.clone();
    }
}

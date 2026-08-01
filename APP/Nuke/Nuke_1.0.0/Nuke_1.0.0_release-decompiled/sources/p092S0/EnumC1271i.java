package p092S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S0.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1271i {

    /* JADX INFO: renamed from: d */
    public static final EnumC1271i f4567d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1271i f4568e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1271i f4569f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1271i f4570g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1271i f4571h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1271i f4572i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1271i f4573j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC1271i[] f4574k;

    static {
        EnumC1271i enumC1271i = new EnumC1271i("Paragraph", 0);
        f4567d = enumC1271i;
        EnumC1271i enumC1271i2 = new EnumC1271i("Span", 1);
        f4568e = enumC1271i2;
        EnumC1271i enumC1271i3 = new EnumC1271i("VerbatimTts", 2);
        f4569f = enumC1271i3;
        EnumC1271i enumC1271i4 = new EnumC1271i("Url", 3);
        f4570g = enumC1271i4;
        EnumC1271i enumC1271i5 = new EnumC1271i("Link", 4);
        f4571h = enumC1271i5;
        EnumC1271i enumC1271i6 = new EnumC1271i("Clickable", 5);
        f4572i = enumC1271i6;
        EnumC1271i enumC1271i7 = new EnumC1271i("String", 6);
        f4573j = enumC1271i7;
        f4574k = new EnumC1271i[]{enumC1271i, enumC1271i2, enumC1271i3, enumC1271i4, enumC1271i5, enumC1271i6, enumC1271i7};
    }

    public static EnumC1271i valueOf(String str) {
        return (EnumC1271i) Enum.valueOf(EnumC1271i.class, str);
    }

    public static EnumC1271i[] values() {
        return (EnumC1271i[]) f4574k.clone();
    }
}

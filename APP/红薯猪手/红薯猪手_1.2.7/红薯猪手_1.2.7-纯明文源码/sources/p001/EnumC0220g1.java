package p001;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۟.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0220g1 implements InterfaceC0438w3 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final EnumC0220g1 f1468;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0220g1[] f1469;

    /* JADX INFO: renamed from: ۥ */
    public final Object f808;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f809;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Object f1470;

    static {
        EnumC0220g1 enumC0220g1 = new EnumC0220g1("NULL", "null", Boolean.FALSE);
        f1468 = enumC0220g1;
        EnumC0220g1[] enumC0220g1Arr = {enumC0220g1};
        f1469 = enumC0220g1Arr;
        new C0359q2(enumC0220g1Arr);
    }

    public EnumC0220g1(String str, String str2, Boolean bool) {
        this.f808 = bool;
        this.f809 = str2;
        this.f1470 = bool;
    }

    public static EnumC0220g1 valueOf(String str) {
        return (EnumC0220g1) Enum.valueOf(EnumC0220g1.class, str);
    }

    public static EnumC0220g1[] values() {
        return (EnumC0220g1[]) f1469.clone();
    }

    @Override // p001.InterfaceC0438w3
    public final String getKey() {
        return this.f809;
    }

    @Override // p001.InterfaceC0438w3
    /* JADX INFO: renamed from: ۥ */
    public final Object mo833() {
        return this.f1470;
    }
}

package p037G2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: G2.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0504p {

    /* JADX INFO: renamed from: d */
    public static final EnumC0504p f1589d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0504p[] f1590e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0504p EF0;

    static {
        EnumC0504p enumC0504p = new EnumC0504p("Left", 0);
        EnumC0504p enumC0504p2 = new EnumC0504p("Right", 1);
        f1589d = enumC0504p2;
        f1590e = new EnumC0504p[]{enumC0504p, enumC0504p2};
    }

    public static EnumC0504p valueOf(String str) {
        return (EnumC0504p) Enum.valueOf(EnumC0504p.class, str);
    }

    public static EnumC0504p[] values() {
        return (EnumC0504p[]) f1590e.clone();
    }
}

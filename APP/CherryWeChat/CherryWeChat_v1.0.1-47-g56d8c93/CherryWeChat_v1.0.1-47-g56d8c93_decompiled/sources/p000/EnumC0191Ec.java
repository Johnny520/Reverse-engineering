package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ec */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0191Ec {

    /* JADX INFO: renamed from: a */
    public static final EnumC0191Ec f576a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0191Ec f577b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0191Ec f578c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0191Ec[] f579d;

    static {
        EnumC0191Ec enumC0191Ec = new EnumC0191Ec("PREFER_ARGB_8888", 0);
        f576a = enumC0191Ec;
        EnumC0191Ec enumC0191Ec2 = new EnumC0191Ec("PREFER_RGB_565", 1);
        f577b = enumC0191Ec2;
        f579d = new EnumC0191Ec[]{enumC0191Ec, enumC0191Ec2};
        f578c = enumC0191Ec;
    }

    public static EnumC0191Ec valueOf(String str) {
        return (EnumC0191Ec) Enum.valueOf(EnumC0191Ec.class, str);
    }

    public static EnumC0191Ec[] values() {
        return (EnumC0191Ec[]) f579d.clone();
    }
}

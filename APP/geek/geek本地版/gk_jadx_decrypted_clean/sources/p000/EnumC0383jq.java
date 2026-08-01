package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jq */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0383jq {

    /* JADX INFO: renamed from: a */
    public static final EnumC0383jq f2656a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0383jq f2657b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0383jq f2658c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0383jq f2659d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0383jq f2660e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0383jq[] f2661f;

    static {
        EnumC0383jq enumC0383jq = new EnumC0383jq("DESTROYED", 0);
        f2656a = enumC0383jq;
        EnumC0383jq enumC0383jq2 = new EnumC0383jq("INITIALIZED", 1);
        f2657b = enumC0383jq2;
        EnumC0383jq enumC0383jq3 = new EnumC0383jq("CREATED", 2);
        f2658c = enumC0383jq3;
        EnumC0383jq enumC0383jq4 = new EnumC0383jq("STARTED", 3);
        f2659d = enumC0383jq4;
        EnumC0383jq enumC0383jq5 = new EnumC0383jq("RESUMED", 4);
        f2660e = enumC0383jq5;
        f2661f = new EnumC0383jq[]{enumC0383jq, enumC0383jq2, enumC0383jq3, enumC0383jq4, enumC0383jq5};
    }

    public static EnumC0383jq valueOf(String str) {
        return (EnumC0383jq) Enum.valueOf(EnumC0383jq.class, str);
    }

    public static EnumC0383jq[] values() {
        return (EnumC0383jq[]) f2661f.clone();
    }
}

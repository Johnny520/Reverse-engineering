package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nq */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0531nq {

    /* JADX INFO: renamed from: a */
    public static final EnumC0531nq f3329a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0531nq f3330b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0531nq f3331c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0531nq f3332d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0531nq f3333e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0531nq[] f3334f;

    static {
        EnumC0531nq enumC0531nq = new EnumC0531nq("DESTROYED", 0);
        f3329a = enumC0531nq;
        EnumC0531nq enumC0531nq2 = new EnumC0531nq("INITIALIZED", 1);
        f3330b = enumC0531nq2;
        EnumC0531nq enumC0531nq3 = new EnumC0531nq("CREATED", 2);
        f3331c = enumC0531nq3;
        EnumC0531nq enumC0531nq4 = new EnumC0531nq("STARTED", 3);
        f3332d = enumC0531nq4;
        EnumC0531nq enumC0531nq5 = new EnumC0531nq("RESUMED", 4);
        f3333e = enumC0531nq5;
        f3334f = new EnumC0531nq[]{enumC0531nq, enumC0531nq2, enumC0531nq3, enumC0531nq4, enumC0531nq5};
    }

    public static EnumC0531nq valueOf(String str) {
        return (EnumC0531nq) Enum.valueOf(EnumC0531nq.class, str);
    }

    public static EnumC0531nq[] values() {
        return (EnumC0531nq[]) f3334f.clone();
    }
}

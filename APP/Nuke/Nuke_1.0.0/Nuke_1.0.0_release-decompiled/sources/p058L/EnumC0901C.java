package p058L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.C */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0901C {

    /* JADX INFO: renamed from: d */
    public static final EnumC0901C f2801d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0901C f2802e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0901C f2803f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0901C[] f2804g;

    static {
        EnumC0901C enumC0901C = new EnumC0901C("Left", 0);
        f2801d = enumC0901C;
        EnumC0901C enumC0901C2 = new EnumC0901C("Middle", 1);
        f2802e = enumC0901C2;
        EnumC0901C enumC0901C3 = new EnumC0901C("Right", 2);
        f2803f = enumC0901C3;
        f2804g = new EnumC0901C[]{enumC0901C, enumC0901C2, enumC0901C3};
    }

    public static EnumC0901C valueOf(String str) {
        return (EnumC0901C) Enum.valueOf(EnumC0901C.class, str);
    }

    public static EnumC0901C[] values() {
        return (EnumC0901C[]) f2804g.clone();
    }
}

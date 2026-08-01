package p108V3;

import p053J3.C0861v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V3.S */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1545S {

    /* JADX INFO: renamed from: d */
    public static final EnumC1545S f5372d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1545S f5373e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1545S f5374f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC1545S[] f5375g;

    static {
        EnumC1545S enumC1545S = new EnumC1545S(C0861v.NORMAL, 0);
        f5372d = enumC1545S;
        EnumC1545S enumC1545S2 = new EnumC1545S("UNAVAILABLE", 1);
        f5373e = enumC1545S2;
        EnumC1545S enumC1545S3 = new EnumC1545S("LOCKED", 2);
        f5374f = enumC1545S3;
        f5375g = new EnumC1545S[]{enumC1545S, enumC1545S2, enumC1545S3};
    }

    public static EnumC1545S valueOf(String str) {
        return (EnumC1545S) Enum.valueOf(EnumC1545S.class, str);
    }

    public static EnumC1545S[] values() {
        return (EnumC1545S[]) f5375g.clone();
    }
}

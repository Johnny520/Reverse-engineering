package com.abc.internal.probe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.r */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0568r {

    /* JADX INFO: renamed from: a */
    public static final EnumC0568r f1679a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0568r f1680b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0568r f1681c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0568r[] f1682d;

    static {
        EnumC0568r enumC0568r = new EnumC0568r("CN", 0);
        f1679a = enumC0568r;
        EnumC0568r enumC0568r2 = new EnumC0568r("PLAY", 1);
        f1680b = enumC0568r2;
        EnumC0568r enumC0568r3 = new EnumC0568r("UNKNOWN", 2);
        f1681c = enumC0568r3;
        f1682d = new EnumC0568r[]{enumC0568r, enumC0568r2, enumC0568r3};
    }

    public static EnumC0568r valueOf(String str) {
        return (EnumC0568r) Enum.valueOf(EnumC0568r.class, str);
    }

    public static EnumC0568r[] values() {
        return (EnumC0568r[]) f1682d.clone();
    }
}

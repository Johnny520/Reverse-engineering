package com.abc.core.features;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0640a1 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0640a1 f1993a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0640a1 f1994b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0640a1[] f1995c;

    static {
        EnumC0640a1 enumC0640a1 = new EnumC0640a1("None", 0);
        f1993a = enumC0640a1;
        EnumC0640a1 enumC0640a12 = new EnumC0640a1("Left", 1);
        f1994b = enumC0640a12;
        f1995c = new EnumC0640a1[]{enumC0640a1, enumC0640a12, new EnumC0640a1("Right", 2)};
    }

    public static EnumC0640a1 valueOf(String str) {
        return (EnumC0640a1) Enum.valueOf(EnumC0640a1.class, str);
    }

    public static EnumC0640a1[] values() {
        return (EnumC0640a1[]) f1995c.clone();
    }
}

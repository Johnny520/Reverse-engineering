package com.bumptech.glide;

import p053J3.C0861v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.bumptech.glide.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1928j {

    /* JADX INFO: renamed from: d */
    public static final EnumC1928j f6547d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1928j f6548e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1928j f6549f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1928j f6550g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1928j[] f6551h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1928j enumC1928j = new EnumC1928j("IMMEDIATE", 0);
        f6547d = enumC1928j;
        EnumC1928j enumC1928j2 = new EnumC1928j("HIGH", 1);
        f6548e = enumC1928j2;
        EnumC1928j enumC1928j3 = new EnumC1928j(C0861v.NORMAL, 2);
        f6549f = enumC1928j3;
        EnumC1928j enumC1928j4 = new EnumC1928j("LOW", 3);
        f6550g = enumC1928j4;
        f6551h = new EnumC1928j[]{enumC1928j, enumC1928j2, enumC1928j3, enumC1928j4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1928j valueOf(String str) {
        return (EnumC1928j) Enum.valueOf(EnumC1928j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1928j[] values() {
        return (EnumC1928j[]) f6551h.clone();
    }
}

package yyds;

import com.android.NativeUtil;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛶᛶᛲᛵ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1351 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C0468 f6245;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1351[] f6246;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final EnumC1947 f6247;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f6248;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final EnumC1054 f6249;

    static {
        NativeUtil.classesInit0(28);
        String strM4341 = AbstractC2328.m4341(-198414177043310L);
        EnumC1054 enumC1054 = EnumC1054.f4792;
        EnumC1947 enumC1947 = EnumC1947.f9790;
        EnumC1351 enumC1351 = new EnumC1351(strM4341, 0, 6601, enumC1054, enumC1947);
        String strM43412 = AbstractC2328.m4341(-198461421683566L);
        EnumC1054 enumC10542 = EnumC1054.f4793;
        EnumC1351 enumC13512 = new EnumC1351(strM43412, 1, 6602, enumC10542, enumC1947);
        String strM43413 = AbstractC2328.m4341(-198508666323822L);
        EnumC1947 enumC19472 = EnumC1947.f9793;
        EnumC1351 enumC13513 = new EnumC1351(strM43413, 2, 6603, enumC1054, enumC19472);
        EnumC1351 enumC13514 = new EnumC1351(AbstractC2328.m4341(-198568795865966L), 3, 6604, enumC10542, enumC19472);
        String strM43414 = AbstractC2328.m4341(-198628925408110L);
        EnumC1947 enumC19473 = EnumC1947.f9791;
        EnumC1351[] enumC1351Arr = {enumC1351, enumC13512, enumC13513, enumC13514, new EnumC1351(strM43414, 4, 6605, enumC1054, enumC19473), new EnumC1351(AbstractC2328.m4341(-198680465015662L), 5, 6606, enumC10542, enumC19473)};
        f6246 = enumC1351Arr;
        f6245 = new C0468(enumC1351Arr);
    }

    public EnumC1351(String str, int i, int i2, EnumC1054 enumC1054, EnumC1947 enumC1947) {
        this.f6248 = i2;
        this.f6249 = enumC1054;
        this.f6247 = enumC1947;
    }

    public static native EnumC1351 valueOf(String str);

    public static native EnumC1351[] values();
}

package p190n0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n0.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5388m {

    /* JADX INFO: renamed from: q */
    public static final EnumC5388m f16584q = new EnumC5388m("CROSSED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5388m f16585r = new EnumC5388m("NOT_CROSSED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC5388m f16586s = new EnumC5388m("COLLAPSED", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC5388m[] f16587t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f16588u;

    static {
        EnumC5388m[] enumC5388mArrM21942a = m21942a();
        f16587t = enumC5388mArrM21942a;
        f16588u = AbstractC7198b.m28437a(enumC5388mArrM21942a);
    }

    public EnumC5388m(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5388m[] m21942a() {
        return new EnumC5388m[]{f16584q, f16585r, f16586s};
    }

    public static EnumC5388m valueOf(String str) {
        return (EnumC5388m) Enum.valueOf(EnumC5388m.class, str);
    }

    public static EnumC5388m[] values() {
        return (EnumC5388m[]) f16587t.clone();
    }
}

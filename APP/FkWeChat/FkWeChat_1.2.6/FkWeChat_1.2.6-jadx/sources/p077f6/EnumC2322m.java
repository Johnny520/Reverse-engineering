package p077f6;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f6.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2322m {

    /* JADX INFO: renamed from: q */
    public static final EnumC2322m f6360q = new EnumC2322m("IMAGE_WIDTH", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2322m f6361r = new EnumC2322m("MAX_WIDTH", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2322m[] f6362s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f6363t;

    static {
        EnumC2322m[] enumC2322mArrM8481a = m8481a();
        f6362s = enumC2322mArrM8481a;
        f6363t = AbstractC7198b.m28437a(enumC2322mArrM8481a);
    }

    public EnumC2322m(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2322m[] m8481a() {
        return new EnumC2322m[]{f6360q, f6361r};
    }

    public static EnumC2322m valueOf(String str) {
        return (EnumC2322m) Enum.valueOf(EnumC2322m.class, str);
    }

    public static EnumC2322m[] values() {
        return (EnumC2322m[]) f6362s.clone();
    }
}

package p191n1;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n1.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5484m {

    /* JADX INFO: renamed from: q */
    public static final EnumC5484m f16867q = new EnumC5484m("VIEW_APPEAR", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5484m f16868r = new EnumC5484m("VIEW_DISAPPEAR", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC5484m[] f16869s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f16870t;

    static {
        EnumC5484m[] enumC5484mArrM22297a = m22297a();
        f16869s = enumC5484mArrM22297a;
        f16870t = AbstractC7198b.m28437a(enumC5484mArrM22297a);
    }

    public EnumC5484m(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5484m[] m22297a() {
        return new EnumC5484m[]{f16867q, f16868r};
    }

    public static EnumC5484m valueOf(String str) {
        return (EnumC5484m) Enum.valueOf(EnumC5484m.class, str);
    }

    public static EnumC5484m[] values() {
        return (EnumC5484m[]) f16869s.clone();
    }
}

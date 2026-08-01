package ga;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ga.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2599k {

    /* JADX INFO: renamed from: q */
    public static final EnumC2599k f6897q = new EnumC2599k("FORCE_FLEXIBILITY", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2599k f6898r = new EnumC2599k("NULLABLE", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2599k f6899s = new EnumC2599k("NOT_NULL", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC2599k[] f6900t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f6901u;

    static {
        EnumC2599k[] enumC2599kArrM9266a = m9266a();
        f6900t = enumC2599kArrM9266a;
        f6901u = AbstractC7198b.m28437a(enumC2599kArrM9266a);
    }

    public EnumC2599k(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2599k[] m9266a() {
        return new EnumC2599k[]{f6897q, f6898r, f6899s};
    }

    public static EnumC2599k valueOf(String str) {
        return (EnumC2599k) Enum.valueOf(EnumC2599k.class, str);
    }

    public static EnumC2599k[] values() {
        return (EnumC2599k[]) f6900t.clone();
    }
}

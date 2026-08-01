package p121i3;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i3.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3191u {

    /* JADX INFO: renamed from: q */
    public static final EnumC3191u f8484q = new EnumC3191u("Ltr", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC3191u f8485r = new EnumC3191u("Rtl", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC3191u[] f8486s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f8487t;

    static {
        EnumC3191u[] enumC3191uArrM12093a = m12093a();
        f8486s = enumC3191uArrM12093a;
        f8487t = AbstractC7198b.m28437a(enumC3191uArrM12093a);
    }

    public EnumC3191u(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3191u[] m12093a() {
        return new EnumC3191u[]{f8484q, f8485r};
    }

    public static EnumC3191u valueOf(String str) {
        return (EnumC3191u) Enum.valueOf(EnumC3191u.class, str);
    }

    public static EnumC3191u[] values() {
        return (EnumC3191u[]) f8486s.clone();
    }
}

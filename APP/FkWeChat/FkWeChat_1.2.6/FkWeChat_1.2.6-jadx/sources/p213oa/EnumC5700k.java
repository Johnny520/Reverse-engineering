package p213oa;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oa.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5700k {

    /* JADX INFO: renamed from: q */
    public static final EnumC5700k f18029q = new EnumC5700k("BEGINNING", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5700k f18030r = new EnumC5700k("MIDDLE", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC5700k f18031s = new EnumC5700k("AFTER_DOT", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC5700k[] f18032t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f18033u;

    static {
        EnumC5700k[] enumC5700kArrM23072a = m23072a();
        f18032t = enumC5700kArrM23072a;
        f18033u = AbstractC7198b.m28437a(enumC5700kArrM23072a);
    }

    public EnumC5700k(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5700k[] m23072a() {
        return new EnumC5700k[]{f18029q, f18030r, f18031s};
    }

    public static EnumC5700k valueOf(String str) {
        return (EnumC5700k) Enum.valueOf(EnumC5700k.class, str);
    }

    public static EnumC5700k[] values() {
        return (EnumC5700k[]) f18032t.clone();
    }
}

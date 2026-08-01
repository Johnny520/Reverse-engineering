package p135j2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j2.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3572u {

    /* JADX INFO: renamed from: q */
    public static final EnumC3572u f9931q = new EnumC3572u("Width", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC3572u f9932r = new EnumC3572u("Height", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC3572u[] f9933s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f9934t;

    static {
        EnumC3572u[] enumC3572uArrM13364a = m13364a();
        f9933s = enumC3572uArrM13364a;
        f9934t = AbstractC7198b.m28437a(enumC3572uArrM13364a);
    }

    public EnumC3572u(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3572u[] m13364a() {
        return new EnumC3572u[]{f9931q, f9932r};
    }

    public static EnumC3572u valueOf(String str) {
        return (EnumC3572u) Enum.valueOf(EnumC3572u.class, str);
    }

    public static EnumC3572u[] values() {
        return (EnumC3572u[]) f9933s.clone();
    }
}

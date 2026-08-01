package p099gc;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2732a {

    /* JADX INFO: renamed from: q */
    public static final EnumC2732a f7138q = new EnumC2732a("SUSPEND", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2732a f7139r = new EnumC2732a("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2732a f7140s = new EnumC2732a("DROP_LATEST", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC2732a[] f7141t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f7142u;

    static {
        EnumC2732a[] enumC2732aArrM9676a = m9676a();
        f7141t = enumC2732aArrM9676a;
        f7142u = AbstractC7198b.m28437a(enumC2732aArrM9676a);
    }

    public EnumC2732a(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2732a[] m9676a() {
        return new EnumC2732a[]{f7138q, f7139r, f7140s};
    }

    public static EnumC2732a valueOf(String str) {
        return (EnumC2732a) Enum.valueOf(EnumC2732a.class, str);
    }

    public static EnumC2732a[] values() {
        return (EnumC2732a[]) f7141t.clone();
    }
}

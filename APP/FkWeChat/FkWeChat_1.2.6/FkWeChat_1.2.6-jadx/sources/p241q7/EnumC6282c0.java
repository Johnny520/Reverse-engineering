package p241q7;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q7.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6282c0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6282c0 f19688q = new EnumC6282c0("Constant", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6282c0 f19689r = new EnumC6282c0("Parameter", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC6282c0[] f19690s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f19691t;

    static {
        EnumC6282c0[] enumC6282c0ArrM24881a = m24881a();
        f19690s = enumC6282c0ArrM24881a;
        f19691t = AbstractC7198b.m28437a(enumC6282c0ArrM24881a);
    }

    public EnumC6282c0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6282c0[] m24881a() {
        return new EnumC6282c0[]{f19688q, f19689r};
    }

    public static EnumC6282c0 valueOf(String str) {
        return (EnumC6282c0) Enum.valueOf(EnumC6282c0.class, str);
    }

    public static EnumC6282c0[] values() {
        return (EnumC6282c0[]) f19690s.clone();
    }
}

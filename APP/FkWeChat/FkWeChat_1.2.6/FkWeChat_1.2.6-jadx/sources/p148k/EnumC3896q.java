package p148k;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3896q {

    /* JADX INFO: renamed from: q */
    public static final EnumC3896q f11276q = new EnumC3896q("PreEnter", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC3896q f11277r = new EnumC3896q("Visible", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC3896q f11278s = new EnumC3896q("PostExit", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC3896q[] f11279t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f11280u;

    static {
        EnumC3896q[] enumC3896qArrM15474a = m15474a();
        f11279t = enumC3896qArrM15474a;
        f11280u = AbstractC7198b.m28437a(enumC3896qArrM15474a);
    }

    public EnumC3896q(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3896q[] m15474a() {
        return new EnumC3896q[]{f11276q, f11277r, f11278s};
    }

    public static EnumC3896q valueOf(String str) {
        return (EnumC3896q) Enum.valueOf(EnumC3896q.class, str);
    }

    public static EnumC3896q[] values() {
        return (EnumC3896q[]) f11279t.clone();
    }
}

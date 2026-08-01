package p166l2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l2.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4552i2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC4552i2 f13329q = new EnumC4552i2("ContinueTraversal", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4552i2 f13330r = new EnumC4552i2("SkipSubtreeAndContinueTraversal", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4552i2 f13331s = new EnumC4552i2("CancelTraversal", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC4552i2[] f13332t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f13333u;

    static {
        EnumC4552i2[] enumC4552i2ArrM17827a = m17827a();
        f13332t = enumC4552i2ArrM17827a;
        f13333u = AbstractC7198b.m28437a(enumC4552i2ArrM17827a);
    }

    public EnumC4552i2(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4552i2[] m17827a() {
        return new EnumC4552i2[]{f13329q, f13330r, f13331s};
    }

    public static EnumC4552i2 valueOf(String str) {
        return (EnumC4552i2) Enum.valueOf(EnumC4552i2.class, str);
    }

    public static EnumC4552i2[] values() {
        return (EnumC4552i2[]) f13332t.clone();
    }
}

package p166l2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l2.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4522b0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC4522b0 f13184q = new EnumC4522b0("LookaheadMeasurement", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4522b0 f13185r = new EnumC4522b0("LookaheadPlacement", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4522b0 f13186s = new EnumC4522b0("Measurement", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC4522b0 f13187t = new EnumC4522b0("Placement", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC4522b0[] f13188u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f13189v;

    static {
        EnumC4522b0[] enumC4522b0ArrM17537a = m17537a();
        f13188u = enumC4522b0ArrM17537a;
        f13189v = AbstractC7198b.m28437a(enumC4522b0ArrM17537a);
    }

    public EnumC4522b0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4522b0[] m17537a() {
        return new EnumC4522b0[]{f13184q, f13185r, f13186s, f13187t};
    }

    public static EnumC4522b0 valueOf(String str) {
        return (EnumC4522b0) Enum.valueOf(EnumC4522b0.class, str);
    }

    public static EnumC4522b0[] values() {
        return (EnumC4522b0[]) f13188u.clone();
    }
}

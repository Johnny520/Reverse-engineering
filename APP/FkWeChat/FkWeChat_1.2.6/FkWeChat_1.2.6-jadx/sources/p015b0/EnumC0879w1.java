package p015b0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.w1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0879w1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC0879w1 f2766q = new EnumC0879w1("None", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC0879w1 f2767r = new EnumC0879w1("Selection", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC0879w1 f2768s = new EnumC0879w1("Cursor", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC0879w1[] f2769t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f2770u;

    static {
        EnumC0879w1[] enumC0879w1ArrM3237a = m3237a();
        f2769t = enumC0879w1ArrM3237a;
        f2770u = AbstractC7198b.m28437a(enumC0879w1ArrM3237a);
    }

    public EnumC0879w1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0879w1[] m3237a() {
        return new EnumC0879w1[]{f2766q, f2767r, f2768s};
    }

    public static EnumC0879w1 valueOf(String str) {
        return (EnumC0879w1) Enum.valueOf(EnumC0879w1.class, str);
    }

    public static EnumC0879w1[] values() {
        return (EnumC0879w1[]) f2769t.clone();
    }
}

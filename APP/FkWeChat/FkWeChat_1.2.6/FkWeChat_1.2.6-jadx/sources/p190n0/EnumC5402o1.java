package p190n0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n0.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5402o1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC5402o1 f16633q = new EnumC5402o1("Left", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5402o1 f16634r = new EnumC5402o1("Middle", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC5402o1 f16635s = new EnumC5402o1("Right", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC5402o1[] f16636t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f16637u;

    static {
        EnumC5402o1[] enumC5402o1ArrM21988a = m21988a();
        f16636t = enumC5402o1ArrM21988a;
        f16637u = AbstractC7198b.m28437a(enumC5402o1ArrM21988a);
    }

    public EnumC5402o1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5402o1[] m21988a() {
        return new EnumC5402o1[]{f16633q, f16634r, f16635s};
    }

    public static EnumC5402o1 valueOf(String str) {
        return (EnumC5402o1) Enum.valueOf(EnumC5402o1.class, str);
    }

    public static EnumC5402o1[] values() {
        return (EnumC5402o1[]) f16636t.clone();
    }
}

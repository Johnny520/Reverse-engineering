package p163l;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4273b1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC4273b1 f12514q = new EnumC4273b1("Default", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4273b1 f12515r = new EnumC4273b1("UserInput", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4273b1 f12516s = new EnumC4273b1("PreventUserInput", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC4273b1[] f12517t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f12518u;

    static {
        EnumC4273b1[] enumC4273b1ArrM16806a = m16806a();
        f12517t = enumC4273b1ArrM16806a;
        f12518u = AbstractC7198b.m28437a(enumC4273b1ArrM16806a);
    }

    public EnumC4273b1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4273b1[] m16806a() {
        return new EnumC4273b1[]{f12514q, f12515r, f12516s};
    }

    public static EnumC4273b1 valueOf(String str) {
        return (EnumC4273b1) Enum.valueOf(EnumC4273b1.class, str);
    }

    public static EnumC4273b1[] values() {
        return (EnumC4273b1[]) f12517t.clone();
    }
}

package p189n;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5190a2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC5190a2 f15823q = new EnumC5190a2("Default", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5190a2 f15824r = new EnumC5190a2("UserInput", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC5190a2 f15825s = new EnumC5190a2("PreventUserInput", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC5190a2[] f15826t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f15827u;

    static {
        EnumC5190a2[] enumC5190a2ArrM21280a = m21280a();
        f15826t = enumC5190a2ArrM21280a;
        f15827u = AbstractC7198b.m28437a(enumC5190a2ArrM21280a);
    }

    public EnumC5190a2(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5190a2[] m21280a() {
        return new EnumC5190a2[]{f15823q, f15824r, f15825s};
    }

    public static EnumC5190a2 valueOf(String str) {
        return (EnumC5190a2) Enum.valueOf(EnumC5190a2.class, str);
    }

    public static EnumC5190a2[] values() {
        return (EnumC5190a2[]) f15826t.clone();
    }
}

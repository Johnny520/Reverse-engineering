package td;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: td.a7 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8228a7 {

    /* JADX INFO: renamed from: q */
    public static final EnumC8228a7 f27542q = new EnumC8228a7("NOT_INSTALLED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC8228a7 f27543r = new EnumC8228a7("INSTALLED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC8228a7 f27544s = new EnumC8228a7("UPDATE", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC8228a7 f27545t = new EnumC8228a7("DOWNGRADE", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC8228a7[] f27546u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f27547v;

    static {
        EnumC8228a7[] enumC8228a7ArrM31923a = m31923a();
        f27546u = enumC8228a7ArrM31923a;
        f27547v = AbstractC7198b.m28437a(enumC8228a7ArrM31923a);
    }

    public EnumC8228a7(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8228a7[] m31923a() {
        return new EnumC8228a7[]{f27542q, f27543r, f27544s, f27545t};
    }

    public static EnumC8228a7 valueOf(String str) {
        return (EnumC8228a7) Enum.valueOf(EnumC8228a7.class, str);
    }

    public static EnumC8228a7[] values() {
        return (EnumC8228a7[]) f27546u.clone();
    }
}

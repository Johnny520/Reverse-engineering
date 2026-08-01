package p190n0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n0.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5413q0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC5413q0 f16661q = new EnumC5413q0("EditableText", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5413q0 f16662r = new EnumC5413q0("StaticText", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC5413q0[] f16663s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f16664t;

    static {
        EnumC5413q0[] enumC5413q0ArrM22003a = m22003a();
        f16663s = enumC5413q0ArrM22003a;
        f16664t = AbstractC7198b.m28437a(enumC5413q0ArrM22003a);
    }

    public EnumC5413q0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5413q0[] m22003a() {
        return new EnumC5413q0[]{f16661q, f16662r};
    }

    public static EnumC5413q0 valueOf(String str) {
        return (EnumC5413q0) Enum.valueOf(EnumC5413q0.class, str);
    }

    public static EnumC5413q0[] values() {
        return (EnumC5413q0[]) f16663s.clone();
    }
}

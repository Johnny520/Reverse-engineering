package p219p;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5898w0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC5898w0 f18786q = new EnumC5898w0("Vertical", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5898w0 f18787r = new EnumC5898w0("Horizontal", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC5898w0[] f18788s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f18789t;

    static {
        EnumC5898w0[] enumC5898w0ArrM23797a = m23797a();
        f18788s = enumC5898w0ArrM23797a;
        f18789t = AbstractC7198b.m28437a(enumC5898w0ArrM23797a);
    }

    public EnumC5898w0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5898w0[] m23797a() {
        return new EnumC5898w0[]{f18786q, f18787r};
    }

    public static EnumC5898w0 valueOf(String str) {
        return (EnumC5898w0) Enum.valueOf(EnumC5898w0.class, str);
    }

    public static EnumC5898w0[] values() {
        return (EnumC5898w0[]) f18788s.clone();
    }
}

package p229p9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5998f {

    /* JADX INFO: renamed from: r */
    public static final EnumC5998f f18948r = new EnumC5998f("CLASS", 0, "class");

    /* JADX INFO: renamed from: s */
    public static final EnumC5998f f18949s = new EnumC5998f("INTERFACE", 1, "interface");

    /* JADX INFO: renamed from: t */
    public static final EnumC5998f f18950t = new EnumC5998f("ENUM_CLASS", 2, "enum class");

    /* JADX INFO: renamed from: u */
    public static final EnumC5998f f18951u = new EnumC5998f("ENUM_ENTRY", 3, null);

    /* JADX INFO: renamed from: v */
    public static final EnumC5998f f18952v = new EnumC5998f("ANNOTATION_CLASS", 4, "annotation class");

    /* JADX INFO: renamed from: w */
    public static final EnumC5998f f18953w = new EnumC5998f("OBJECT", 5, "object");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5998f[] f18954x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f18955y;

    /* JADX INFO: renamed from: q */
    public final String f18956q;

    static {
        EnumC5998f[] enumC5998fArrM24009a = m24009a();
        f18954x = enumC5998fArrM24009a;
        f18955y = AbstractC7198b.m28437a(enumC5998fArrM24009a);
    }

    public EnumC5998f(String str, int i10, String str2) {
        this.f18956q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5998f[] m24009a() {
        return new EnumC5998f[]{f18948r, f18949s, f18950t, f18951u, f18952v, f18953w};
    }

    public static EnumC5998f valueOf(String str) {
        return (EnumC5998f) Enum.valueOf(EnumC5998f.class, str);
    }

    public static EnumC5998f[] values() {
        return (EnumC5998f[]) f18954x.clone();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24010c() {
        return this == f18953w || this == f18951u;
    }
}

package p358y9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC9613c {

    /* JADX INFO: renamed from: r */
    public static final EnumC9613c f32725r = new EnumC9613c("METHOD_RETURN_TYPE", 0, "METHOD");

    /* JADX INFO: renamed from: s */
    public static final EnumC9613c f32726s = new EnumC9613c("VALUE_PARAMETER", 1, "PARAMETER");

    /* JADX INFO: renamed from: t */
    public static final EnumC9613c f32727t = new EnumC9613c("FIELD", 2, "FIELD");

    /* JADX INFO: renamed from: u */
    public static final EnumC9613c f32728u = new EnumC9613c("TYPE_USE", 3, "TYPE_USE");

    /* JADX INFO: renamed from: v */
    public static final EnumC9613c f32729v = new EnumC9613c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* JADX INFO: renamed from: w */
    public static final EnumC9613c f32730w = new EnumC9613c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC9613c[] f32731x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f32732y;

    /* JADX INFO: renamed from: q */
    public final String f32733q;

    static {
        EnumC9613c[] enumC9613cArrM37609a = m37609a();
        f32731x = enumC9613cArrM37609a;
        f32732y = AbstractC7198b.m28437a(enumC9613cArrM37609a);
    }

    public EnumC9613c(String str, int i10, String str2) {
        this.f32733q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9613c[] m37609a() {
        return new EnumC9613c[]{f32725r, f32726s, f32727t, f32728u, f32729v, f32730w};
    }

    public static EnumC9613c valueOf(String str) {
        return (EnumC9613c) Enum.valueOf(EnumC9613c.class, str);
    }

    public static EnumC9613c[] values() {
        return (EnumC9613c[]) f32731x.clone();
    }

    /* JADX INFO: renamed from: c */
    public final String m37610c() {
        return this.f32733q;
    }
}

package p129ib;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ib.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3371b {

    /* JADX INFO: renamed from: r */
    public static final EnumC3371b f9197r = new EnumC3371b("ERROR_CLASS", 0, "<Error class: %s>");

    /* JADX INFO: renamed from: s */
    public static final EnumC3371b f9198s = new EnumC3371b("ERROR_FUNCTION", 1, "<Error function>");

    /* JADX INFO: renamed from: t */
    public static final EnumC3371b f9199t = new EnumC3371b("ERROR_SCOPE", 2, "<Error scope>");

    /* JADX INFO: renamed from: u */
    public static final EnumC3371b f9200u = new EnumC3371b("ERROR_MODULE", 3, "<Error module>");

    /* JADX INFO: renamed from: v */
    public static final EnumC3371b f9201v = new EnumC3371b("ERROR_PROPERTY", 4, "<Error property>");

    /* JADX INFO: renamed from: w */
    public static final EnumC3371b f9202w = new EnumC3371b("ERROR_TYPE", 5, "[Error type: %s]");

    /* JADX INFO: renamed from: x */
    public static final EnumC3371b f9203x = new EnumC3371b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC3371b[] f9204y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ InterfaceC7197a f9205z;

    /* JADX INFO: renamed from: q */
    public final String f9206q;

    static {
        EnumC3371b[] enumC3371bArrM12633a = m12633a();
        f9204y = enumC3371bArrM12633a;
        f9205z = AbstractC7198b.m28437a(enumC3371bArrM12633a);
    }

    public EnumC3371b(String str, int i10, String str2) {
        this.f9206q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3371b[] m12633a() {
        return new EnumC3371b[]{f9197r, f9198s, f9199t, f9200u, f9201v, f9202w, f9203x};
    }

    public static EnumC3371b valueOf(String str) {
        return (EnumC3371b) Enum.valueOf(EnumC3371b.class, str);
    }

    public static EnumC3371b[] values() {
        return (EnumC3371b[]) f9204y.clone();
    }

    /* JADX INFO: renamed from: c */
    public final String m12634c() {
        return this.f9206q;
    }
}

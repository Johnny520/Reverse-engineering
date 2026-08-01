package p375zc;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC9937b {

    /* JADX INFO: renamed from: q */
    public static final EnumC9937b f33480q = new EnumC9937b("WHITESPACE_SEPARATED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC9937b f33481r = new EnumC9937b("ARRAY_WRAPPED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC9937b f33482s = new EnumC9937b("AUTO_DETECT", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC9937b[] f33483t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f33484u;

    static {
        EnumC9937b[] enumC9937bArrM38509a = m38509a();
        f33483t = enumC9937bArrM38509a;
        f33484u = AbstractC7198b.m28437a(enumC9937bArrM38509a);
    }

    public EnumC9937b(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9937b[] m38509a() {
        return new EnumC9937b[]{f33480q, f33481r, f33482s};
    }

    public static EnumC9937b valueOf(String str) {
        return (EnumC9937b) Enum.valueOf(EnumC9937b.class, str);
    }

    public static EnumC9937b[] values() {
        return (EnumC9937b[]) f33483t.clone();
    }
}

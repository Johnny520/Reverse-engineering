package p274t;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7901t1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7901t1 f26339q = new EnumC7901t1("Min", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7901t1 f26340r = new EnumC7901t1("Max", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC7901t1[] f26341s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f26342t;

    static {
        EnumC7901t1[] enumC7901t1ArrM30516a = m30516a();
        f26341s = enumC7901t1ArrM30516a;
        f26342t = AbstractC7198b.m28437a(enumC7901t1ArrM30516a);
    }

    public EnumC7901t1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7901t1[] m30516a() {
        return new EnumC7901t1[]{f26339q, f26340r};
    }

    public static EnumC7901t1 valueOf(String str) {
        return (EnumC7901t1) Enum.valueOf(EnumC7901t1.class, str);
    }

    public static EnumC7901t1[] values() {
        return (EnumC7901t1[]) f26341s.clone();
    }
}

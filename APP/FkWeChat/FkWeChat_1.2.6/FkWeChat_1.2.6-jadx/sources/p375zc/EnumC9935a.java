package p375zc;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC9935a {

    /* JADX INFO: renamed from: q */
    public static final EnumC9935a f33472q = new EnumC9935a("NONE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC9935a f33473r = new EnumC9935a("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC9935a f33474s = new EnumC9935a("POLYMORPHIC", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC9935a[] f33475t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f33476u;

    static {
        EnumC9935a[] enumC9935aArrM38505a = m38505a();
        f33475t = enumC9935aArrM38505a;
        f33476u = AbstractC7198b.m28437a(enumC9935aArrM38505a);
    }

    public EnumC9935a(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9935a[] m38505a() {
        return new EnumC9935a[]{f33472q, f33473r, f33474s};
    }

    public static EnumC9935a valueOf(String str) {
        return (EnumC9935a) Enum.valueOf(EnumC9935a.class, str);
    }

    public static EnumC9935a[] values() {
        return (EnumC9935a[]) f33475t.clone();
    }
}

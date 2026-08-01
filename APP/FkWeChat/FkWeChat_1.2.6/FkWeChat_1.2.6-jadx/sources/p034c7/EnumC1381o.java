package p034c7;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c7.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1381o {

    /* JADX INFO: renamed from: q */
    public static final EnumC1381o f4120q = new EnumC1381o("SEQUENTIAL", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC1381o f4121r = new EnumC1381o("CONCURRENT", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC1381o[] f4122s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f4123t;

    static {
        EnumC1381o[] enumC1381oArrM5446a = m5446a();
        f4122s = enumC1381oArrM5446a;
        f4123t = AbstractC7198b.m28437a(enumC1381oArrM5446a);
    }

    public EnumC1381o(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1381o[] m5446a() {
        return new EnumC1381o[]{f4120q, f4121r};
    }

    public static EnumC1381o valueOf(String str) {
        return (EnumC1381o) Enum.valueOf(EnumC1381o.class, str);
    }

    public static EnumC1381o[] values() {
        return (EnumC1381o[]) f4122s.clone();
    }
}

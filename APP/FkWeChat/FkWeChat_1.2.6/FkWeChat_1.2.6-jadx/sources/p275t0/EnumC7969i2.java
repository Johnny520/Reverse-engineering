package p275t0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t0.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7969i2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7969i2 f26543q = new EnumC7969i2("Filled", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7969i2 f26544r = new EnumC7969i2("Outlined", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC7969i2[] f26545s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f26546t;

    static {
        EnumC7969i2[] enumC7969i2ArrM30740a = m30740a();
        f26545s = enumC7969i2ArrM30740a;
        f26546t = AbstractC7198b.m28437a(enumC7969i2ArrM30740a);
    }

    public EnumC7969i2(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7969i2[] m30740a() {
        return new EnumC7969i2[]{f26543q, f26544r};
    }

    public static EnumC7969i2 valueOf(String str) {
        return (EnumC7969i2) Enum.valueOf(EnumC7969i2.class, str);
    }

    public static EnumC7969i2[] values() {
        return (EnumC7969i2[]) f26545s.clone();
    }
}

package p242q8;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6323a {

    /* JADX INFO: renamed from: q */
    public static final EnumC6323a f19835q = new EnumC6323a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6323a f19836r = new EnumC6323a("UNDECIDED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6323a f19837s = new EnumC6323a("RESUMED", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6323a[] f19838t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f19839u;

    static {
        EnumC6323a[] enumC6323aArrM24985a = m24985a();
        f19838t = enumC6323aArrM24985a;
        f19839u = AbstractC7198b.m28437a(enumC6323aArrM24985a);
    }

    public EnumC6323a(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6323a[] m24985a() {
        return new EnumC6323a[]{f19835q, f19836r, f19837s};
    }

    public static EnumC6323a valueOf(String str) {
        return (EnumC6323a) Enum.valueOf(EnumC6323a.class, str);
    }

    public static EnumC6323a[] values() {
        return (EnumC6323a[]) f19838t.clone();
    }
}

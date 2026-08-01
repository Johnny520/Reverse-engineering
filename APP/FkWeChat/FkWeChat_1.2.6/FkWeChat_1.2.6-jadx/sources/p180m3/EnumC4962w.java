package p180m3;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m3.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4962w {

    /* JADX INFO: renamed from: q */
    public static final EnumC4962w f15096q = new EnumC4962w("Inherit", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4962w f15097r = new EnumC4962w("SecureOn", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4962w f15098s = new EnumC4962w("SecureOff", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC4962w[] f15099t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f15100u;

    static {
        EnumC4962w[] enumC4962wArrM20053a = m20053a();
        f15099t = enumC4962wArrM20053a;
        f15100u = AbstractC7198b.m28437a(enumC4962wArrM20053a);
    }

    public EnumC4962w(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4962w[] m20053a() {
        return new EnumC4962w[]{f15096q, f15097r, f15098s};
    }

    public static EnumC4962w valueOf(String str) {
        return (EnumC4962w) Enum.valueOf(EnumC4962w.class, str);
    }

    public static EnumC4962w[] values() {
        return (EnumC4962w[]) f15099t.clone();
    }
}

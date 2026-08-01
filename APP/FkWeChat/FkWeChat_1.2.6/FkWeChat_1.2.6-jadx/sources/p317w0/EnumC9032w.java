package p317w0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w0.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9032w {

    /* JADX INFO: renamed from: q */
    public static final EnumC9032w f30864q = new EnumC9032w("DefaultSpatial", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC9032w f30865r = new EnumC9032w("FastSpatial", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC9032w f30866s = new EnumC9032w("SlowSpatial", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC9032w f30867t = new EnumC9032w("DefaultEffects", 3);

    /* JADX INFO: renamed from: u */
    public static final EnumC9032w f30868u = new EnumC9032w("FastEffects", 4);

    /* JADX INFO: renamed from: v */
    public static final EnumC9032w f30869v = new EnumC9032w("SlowEffects", 5);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC9032w[] f30870w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC7197a f30871x;

    static {
        EnumC9032w[] enumC9032wArrM34978a = m34978a();
        f30870w = enumC9032wArrM34978a;
        f30871x = AbstractC7198b.m28437a(enumC9032wArrM34978a);
    }

    public EnumC9032w(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9032w[] m34978a() {
        return new EnumC9032w[]{f30864q, f30865r, f30866s, f30867t, f30868u, f30869v};
    }

    public static EnumC9032w valueOf(String str) {
        return (EnumC9032w) Enum.valueOf(EnumC9032w.class, str);
    }

    public static EnumC9032w[] values() {
        return (EnumC9032w[]) f30870w.clone();
    }
}

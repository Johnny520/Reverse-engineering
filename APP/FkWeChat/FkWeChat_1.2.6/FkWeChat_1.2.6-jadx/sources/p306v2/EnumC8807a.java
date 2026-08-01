package p306v2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8807a {

    /* JADX INFO: renamed from: q */
    public static final EnumC8807a f29314q = new EnumC8807a("On", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC8807a f29315r = new EnumC8807a("Off", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC8807a f29316s = new EnumC8807a("Indeterminate", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC8807a[] f29317t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f29318u;

    static {
        EnumC8807a[] enumC8807aArrM33787a = m33787a();
        f29317t = enumC8807aArrM33787a;
        f29318u = AbstractC7198b.m28437a(enumC8807aArrM33787a);
    }

    public EnumC8807a(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8807a[] m33787a() {
        return new EnumC8807a[]{f29314q, f29315r, f29316s};
    }

    public static EnumC8807a valueOf(String str) {
        return (EnumC8807a) Enum.valueOf(EnumC8807a.class, str);
    }

    public static EnumC8807a[] values() {
        return (EnumC8807a[]) f29317t.clone();
    }
}

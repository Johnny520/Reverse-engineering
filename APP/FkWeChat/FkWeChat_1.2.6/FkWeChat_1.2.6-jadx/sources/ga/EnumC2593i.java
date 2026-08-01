package ga;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ga.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2593i {

    /* JADX INFO: renamed from: q */
    public static final EnumC2593i f6888q = new EnumC2593i("READ_ONLY", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2593i f6889r = new EnumC2593i("MUTABLE", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2593i[] f6890s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f6891t;

    static {
        EnumC2593i[] enumC2593iArrM9255a = m9255a();
        f6890s = enumC2593iArrM9255a;
        f6891t = AbstractC7198b.m28437a(enumC2593iArrM9255a);
    }

    public EnumC2593i(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2593i[] m9255a() {
        return new EnumC2593i[]{f6888q, f6889r};
    }

    public static EnumC2593i valueOf(String str) {
        return (EnumC2593i) Enum.valueOf(EnumC2593i.class, str);
    }

    public static EnumC2593i[] values() {
        return (EnumC2593i[]) f6890s.clone();
    }
}

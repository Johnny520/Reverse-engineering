package p172l8;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l8.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4708o {

    /* JADX INFO: renamed from: q */
    public static final EnumC4708o f13921q = new EnumC4708o("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4708o f13922r = new EnumC4708o("PUBLICATION", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4708o f13923s = new EnumC4708o("NONE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC4708o[] f13924t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f13925u;

    static {
        EnumC4708o[] enumC4708oArrM18790a = m18790a();
        f13924t = enumC4708oArrM18790a;
        f13925u = AbstractC7198b.m28437a(enumC4708oArrM18790a);
    }

    public EnumC4708o(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4708o[] m18790a() {
        return new EnumC4708o[]{f13921q, f13922r, f13923s};
    }

    public static EnumC4708o valueOf(String str) {
        return (EnumC4708o) Enum.valueOf(EnumC4708o.class, str);
    }

    public static EnumC4708o[] values() {
        return (EnumC4708o[]) f13924t.clone();
    }
}

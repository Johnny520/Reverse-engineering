package p243q9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q9.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6342q {

    /* JADX INFO: renamed from: q */
    public static final EnumC6342q f19889q = new EnumC6342q("RUNTIME", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6342q f19890r = new EnumC6342q("BINARY", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6342q f19891s = new EnumC6342q("SOURCE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6342q[] f19892t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f19893u;

    static {
        EnumC6342q[] enumC6342qArrM25015a = m25015a();
        f19892t = enumC6342qArrM25015a;
        f19893u = AbstractC7198b.m28437a(enumC6342qArrM25015a);
    }

    public EnumC6342q(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6342q[] m25015a() {
        return new EnumC6342q[]{f19889q, f19890r, f19891s};
    }

    public static EnumC6342q valueOf(String str) {
        return (EnumC6342q) Enum.valueOf(EnumC6342q.class, str);
    }

    public static EnumC6342q[] values() {
        return (EnumC6342q[]) f19892t.clone();
    }
}

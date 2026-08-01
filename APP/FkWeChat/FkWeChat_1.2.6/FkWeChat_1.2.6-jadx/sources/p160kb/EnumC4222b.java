package p160kb;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4222b {

    /* JADX INFO: renamed from: q */
    public static final EnumC4222b f12410q = new EnumC4222b("FOR_SUBTYPING", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4222b f12411r = new EnumC4222b("FOR_INCORPORATION", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC4222b f12412s = new EnumC4222b("FROM_EXPRESSION", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC4222b[] f12413t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f12414u;

    static {
        EnumC4222b[] enumC4222bArrM16716a = m16716a();
        f12413t = enumC4222bArrM16716a;
        f12414u = AbstractC7198b.m28437a(enumC4222bArrM16716a);
    }

    public EnumC4222b(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4222b[] m16716a() {
        return new EnumC4222b[]{f12410q, f12411r, f12412s};
    }

    public static EnumC4222b valueOf(String str) {
        return (EnumC4222b) Enum.valueOf(EnumC4222b.class, str);
    }

    public static EnumC4222b[] values() {
        return (EnumC4222b[]) f12413t.clone();
    }
}

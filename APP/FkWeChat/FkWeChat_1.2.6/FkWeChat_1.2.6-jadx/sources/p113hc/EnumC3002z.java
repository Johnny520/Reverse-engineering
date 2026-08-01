package p113hc;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3002z {

    /* JADX INFO: renamed from: q */
    public static final EnumC3002z f7968q = new EnumC3002z("START", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC3002z f7969r = new EnumC3002z("STOP", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC3002z f7970s = new EnumC3002z("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC3002z[] f7971t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f7972u;

    static {
        EnumC3002z[] enumC3002zArrM11096a = m11096a();
        f7971t = enumC3002zArrM11096a;
        f7972u = AbstractC7198b.m28437a(enumC3002zArrM11096a);
    }

    public EnumC3002z(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3002z[] m11096a() {
        return new EnumC3002z[]{f7968q, f7969r, f7970s};
    }

    public static EnumC3002z valueOf(String str) {
        return (EnumC3002z) Enum.valueOf(EnumC3002z.class, str);
    }

    public static EnumC3002z[] values() {
        return (EnumC3002z[]) f7971t.clone();
    }
}

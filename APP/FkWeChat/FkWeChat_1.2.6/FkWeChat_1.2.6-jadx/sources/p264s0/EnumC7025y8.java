package p264s0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s0.y8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7025y8 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7025y8 f23331q = new EnumC7025y8("THUMB", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7025y8 f23332r = new EnumC7025y8("TRACK", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC7025y8[] f23333s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f23334t;

    static {
        EnumC7025y8[] enumC7025y8ArrM27699a = m27699a();
        f23333s = enumC7025y8ArrM27699a;
        f23334t = AbstractC7198b.m28437a(enumC7025y8ArrM27699a);
    }

    public EnumC7025y8(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7025y8[] m27699a() {
        return new EnumC7025y8[]{f23331q, f23332r};
    }

    public static EnumC7025y8 valueOf(String str) {
        return (EnumC7025y8) Enum.valueOf(EnumC7025y8.class, str);
    }

    public static EnumC7025y8[] values() {
        return (EnumC7025y8[]) f23333s.clone();
    }
}

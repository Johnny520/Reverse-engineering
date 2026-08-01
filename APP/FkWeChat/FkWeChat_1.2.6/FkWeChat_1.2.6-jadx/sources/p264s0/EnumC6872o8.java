package p264s0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s0.o8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6872o8 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6872o8 f22337q = new EnumC6872o8("TopBar", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6872o8 f22338r = new EnumC6872o8("MainContent", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6872o8 f22339s = new EnumC6872o8("Snackbar", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC6872o8 f22340t = new EnumC6872o8("Fab", 3);

    /* JADX INFO: renamed from: u */
    public static final EnumC6872o8 f22341u = new EnumC6872o8("BottomBar", 4);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC6872o8[] f22342v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ InterfaceC7197a f22343w;

    static {
        EnumC6872o8[] enumC6872o8ArrM27290a = m27290a();
        f22342v = enumC6872o8ArrM27290a;
        f22343w = AbstractC7198b.m28437a(enumC6872o8ArrM27290a);
    }

    public EnumC6872o8(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6872o8[] m27290a() {
        return new EnumC6872o8[]{f22337q, f22338r, f22339s, f22340t, f22341u};
    }

    public static EnumC6872o8 valueOf(String str) {
        return (EnumC6872o8) Enum.valueOf(EnumC6872o8.class, str);
    }

    public static EnumC6872o8[] values() {
        return (EnumC6872o8[]) f22342v.clone();
    }
}

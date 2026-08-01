package ad;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ad.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0268j1 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0268j1 f652s = new EnumC0268j1("OBJ", 0, '{', '}');

    /* JADX INFO: renamed from: t */
    public static final EnumC0268j1 f653t = new EnumC0268j1("LIST", 1, '[', ']');

    /* JADX INFO: renamed from: u */
    public static final EnumC0268j1 f654u = new EnumC0268j1("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: v */
    public static final EnumC0268j1 f655v = new EnumC0268j1("POLY_OBJ", 3, '[', ']');

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0268j1[] f656w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC7197a f657x;

    /* JADX INFO: renamed from: q */
    public final char f658q;

    /* JADX INFO: renamed from: r */
    public final char f659r;

    static {
        EnumC0268j1[] enumC0268j1ArrM789a = m789a();
        f656w = enumC0268j1ArrM789a;
        f657x = AbstractC7198b.m28437a(enumC0268j1ArrM789a);
    }

    public EnumC0268j1(String str, int i10, char c10, char c11) {
        this.f658q = c10;
        this.f659r = c11;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0268j1[] m789a() {
        return new EnumC0268j1[]{f652s, f653t, f654u, f655v};
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC7197a m790c() {
        return f657x;
    }

    public static EnumC0268j1 valueOf(String str) {
        return (EnumC0268j1) Enum.valueOf(EnumC0268j1.class, str);
    }

    public static EnumC0268j1[] values() {
        return (EnumC0268j1[]) f656w.clone();
    }
}

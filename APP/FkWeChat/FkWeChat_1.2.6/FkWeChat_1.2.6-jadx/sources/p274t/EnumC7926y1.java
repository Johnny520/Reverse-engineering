package p274t;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7926y1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7926y1 f26418q = new EnumC7926y1("Horizontal", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7926y1 f26419r = new EnumC7926y1("Vertical", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC7926y1[] f26420s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f26421t;

    static {
        EnumC7926y1[] enumC7926y1ArrM30611a = m30611a();
        f26420s = enumC7926y1ArrM30611a;
        f26421t = AbstractC7198b.m28437a(enumC7926y1ArrM30611a);
    }

    public EnumC7926y1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7926y1[] m30611a() {
        return new EnumC7926y1[]{f26418q, f26419r};
    }

    public static EnumC7926y1 valueOf(String str) {
        return (EnumC7926y1) Enum.valueOf(EnumC7926y1.class, str);
    }

    public static EnumC7926y1[] values() {
        return (EnumC7926y1[]) f26420s.clone();
    }
}

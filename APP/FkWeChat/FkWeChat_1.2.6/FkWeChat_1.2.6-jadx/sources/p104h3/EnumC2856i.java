package p104h3;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h3.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2856i {

    /* JADX INFO: renamed from: q */
    public static final EnumC2856i f7467q = new EnumC2856i("Ltr", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2856i f7468r = new EnumC2856i("Rtl", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2856i[] f7469s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f7470t;

    static {
        EnumC2856i[] enumC2856iArrM10210a = m10210a();
        f7469s = enumC2856iArrM10210a;
        f7470t = AbstractC7198b.m28437a(enumC2856iArrM10210a);
    }

    public EnumC2856i(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2856i[] m10210a() {
        return new EnumC2856i[]{f7467q, f7468r};
    }

    public static EnumC2856i valueOf(String str) {
        return (EnumC2856i) Enum.valueOf(EnumC2856i.class, str);
    }

    public static EnumC2856i[] values() {
        return (EnumC2856i[]) f7469s.clone();
    }
}

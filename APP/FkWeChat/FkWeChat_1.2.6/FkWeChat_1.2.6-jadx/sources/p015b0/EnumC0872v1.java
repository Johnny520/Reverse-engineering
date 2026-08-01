package p015b0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0872v1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC0872v1 f2746q = new EnumC0872v1("Cursor", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC0872v1 f2747r = new EnumC0872v1("SelectionStart", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC0872v1 f2748s = new EnumC0872v1("SelectionEnd", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC0872v1[] f2749t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f2750u;

    static {
        EnumC0872v1[] enumC0872v1ArrM3232a = m3232a();
        f2749t = enumC0872v1ArrM3232a;
        f2750u = AbstractC7198b.m28437a(enumC0872v1ArrM3232a);
    }

    public EnumC0872v1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0872v1[] m3232a() {
        return new EnumC0872v1[]{f2746q, f2747r, f2748s};
    }

    public static EnumC0872v1 valueOf(String str) {
        return (EnumC0872v1) Enum.valueOf(EnumC0872v1.class, str);
    }

    public static EnumC0872v1[] values() {
        return (EnumC0872v1[]) f2749t.clone();
    }
}

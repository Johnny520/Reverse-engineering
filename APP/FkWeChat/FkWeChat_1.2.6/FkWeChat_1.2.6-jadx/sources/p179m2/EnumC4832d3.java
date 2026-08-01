package p179m2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m2.d3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4832d3 {

    /* JADX INFO: renamed from: q */
    public static final EnumC4832d3 f14370q = new EnumC4832d3("Shown", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4832d3 f14371r = new EnumC4832d3("Hidden", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC4832d3[] f14372s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f14373t;

    static {
        EnumC4832d3[] enumC4832d3ArrM19325a = m19325a();
        f14372s = enumC4832d3ArrM19325a;
        f14373t = AbstractC7198b.m28437a(enumC4832d3ArrM19325a);
    }

    public EnumC4832d3(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4832d3[] m19325a() {
        return new EnumC4832d3[]{f14370q, f14371r};
    }

    public static EnumC4832d3 valueOf(String str) {
        return (EnumC4832d3) Enum.valueOf(EnumC4832d3.class, str);
    }

    public static EnumC4832d3[] values() {
        return (EnumC4832d3[]) f14372s.clone();
    }
}

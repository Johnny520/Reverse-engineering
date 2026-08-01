package androidx.compose.runtime;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.compose.runtime.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0567q1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC0567q1 f1563q = new EnumC0567q1("IGNORED", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC0567q1 f1564r = new EnumC0567q1("SCHEDULED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC0567q1 f1565s = new EnumC0567q1("DEFERRED", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC0567q1 f1566t = new EnumC0567q1("IMMINENT", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC0567q1[] f1567u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f1568v;

    static {
        EnumC0567q1[] enumC0567q1ArrM2140a = m2140a();
        f1567u = enumC0567q1ArrM2140a;
        f1568v = AbstractC7198b.m28437a(enumC0567q1ArrM2140a);
    }

    public EnumC0567q1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0567q1[] m2140a() {
        return new EnumC0567q1[]{f1563q, f1564r, f1565s, f1566t};
    }

    public static EnumC0567q1 valueOf(String str) {
        return (EnumC0567q1) Enum.valueOf(EnumC0567q1.class, str);
    }

    public static EnumC0567q1[] values() {
        return (EnumC0567q1[]) f1567u.clone();
    }
}

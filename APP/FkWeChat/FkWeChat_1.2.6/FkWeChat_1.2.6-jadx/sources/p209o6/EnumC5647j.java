package p209o6;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o6.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5647j {

    /* JADX INFO: renamed from: s */
    public static final EnumC5647j f17767s = new EnumC5647j("TRACE", 0, 0, "TRACE");

    /* JADX INFO: renamed from: t */
    public static final EnumC5647j f17768t = new EnumC5647j("DEBUG", 1, 10, "DEBUG");

    /* JADX INFO: renamed from: u */
    public static final EnumC5647j f17769u = new EnumC5647j("INFO", 2, 20, "INFO");

    /* JADX INFO: renamed from: v */
    public static final EnumC5647j f17770v = new EnumC5647j("WARN", 3, 30, "WARN");

    /* JADX INFO: renamed from: w */
    public static final EnumC5647j f17771w = new EnumC5647j("ERROR", 4, 40, "ERROR");

    /* JADX INFO: renamed from: x */
    public static final EnumC5647j f17772x = new EnumC5647j("OFF", 5, 50, "OFF");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC5647j[] f17773y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ InterfaceC7197a f17774z;

    /* JADX INFO: renamed from: q */
    public final int f17775q;

    /* JADX INFO: renamed from: r */
    public final String f17776r;

    static {
        EnumC5647j[] enumC5647jArrM22848a = m22848a();
        f17773y = enumC5647jArrM22848a;
        f17774z = AbstractC7198b.m28437a(enumC5647jArrM22848a);
    }

    public EnumC5647j(String str, int i10, int i11, String str2) {
        this.f17775q = i11;
        this.f17776r = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5647j[] m22848a() {
        return new EnumC5647j[]{f17767s, f17768t, f17769u, f17770v, f17771w, f17772x};
    }

    public static EnumC5647j valueOf(String str) {
        return (EnumC5647j) Enum.valueOf(EnumC5647j.class, str);
    }

    public static EnumC5647j[] values() {
        return (EnumC5647j[]) f17773y.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17776r;
    }
}

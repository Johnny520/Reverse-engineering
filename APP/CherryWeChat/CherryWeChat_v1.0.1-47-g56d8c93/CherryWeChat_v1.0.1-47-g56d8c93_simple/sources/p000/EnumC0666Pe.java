package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Pe */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0666Pe extends Enum {

    /* JADX INFO: renamed from: b */
    public static final EnumC0666Pe f2124b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0666Pe f2125c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0666Pe f2126d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0666Pe f2127e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC0666Pe f2128f = null;

    /* JADX INFO: renamed from: g */
    public static final EnumC0666Pe f2129g = null;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC0666Pe[] f2130h = null;

    /* JADX INFO: renamed from: a */
    public final TimeUnit f2131a;

    static {
        EnumC0666Pe r0 = new EnumC0666Pe("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f2124b = r0;
        EnumC0666Pe r1 = new EnumC0666Pe("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC0666Pe r2 = new EnumC0666Pe("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f2125c = r2;
        EnumC0666Pe r3 = new EnumC0666Pe("SECONDS", 3, TimeUnit.SECONDS);
        f2126d = r3;
        EnumC0666Pe r4 = new EnumC0666Pe("MINUTES", 4, TimeUnit.MINUTES);
        f2127e = r4;
        EnumC0666Pe r5 = new EnumC0666Pe("HOURS", 5, TimeUnit.HOURS);
        f2128f = r5;
        EnumC0666Pe r6 = new EnumC0666Pe("DAYS", 6, TimeUnit.DAYS);
        f2129g = r6;
        f2130h = new EnumC0666Pe[]{r0, r1, r2, r3, r4, r5, r6};
    }

    EnumC0666Pe(String r1, int r2, TimeUnit r3) {
        this.f2131a = r3;
    }

    public static EnumC0666Pe valueOf(String r1) {
        return (EnumC0666Pe) Enum.valueOf(EnumC0666Pe.class, r1);
    }

    public static EnumC0666Pe[] values() {
        return (EnumC0666Pe[]) f2130h.clone();
    }
}

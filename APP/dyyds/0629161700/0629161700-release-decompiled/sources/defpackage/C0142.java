package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0142 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f1091 = 0;
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Throwable f1092;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛱᛸᛳᛱ> r1 = defpackage.C0142.class
            java.lang.String r2 = "_handled$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C0142.f1091 = r0
            return
    }

    public C0142(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f1092 = r1
            r0._handled$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r2 = r2.f1092
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

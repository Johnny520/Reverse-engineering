package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲁᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0711 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f2384 = 0;
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Throwable f2385;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛷᲁᲇᛷ> r1 = xhss.C0711.class
            java.lang.String r2 = "_handled$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0711.f2384 = r0
            return
    }

    public C0711(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f2385 = r1
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
            java.lang.Throwable r2 = r2.f2385
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

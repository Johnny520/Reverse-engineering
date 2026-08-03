package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class C7002 {
    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final AbstractC7000 m3303(int i) {
        return new C8572(i, i >> 31);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC7000 m3304(long j) {
        return new C8572((int) j, (int) (j >> 32));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m21621(@InterfaceC6399 Object obj, @InterfaceC6399 Object obj2) {
        C5499.m17103(obj, "from");
        C5499.m17103(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m21622(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(m21621(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m21623(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(m21621(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m21624(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(m21621(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m21625(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m21626(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(abstractC7000, "<this>");
        C5499.m17103(c5458, "range");
        if (!c5458.isEmpty()) {
            return c5458.m16965() < Integer.MAX_VALUE ? abstractC7000.mo21330(c5458.m16964(), c5458.m16965() + 1) : c5458.m16964() > Integer.MIN_VALUE ? abstractC7000.mo21330(c5458.m16964() - 1, c5458.m16965()) + 1 : abstractC7000.mo5816();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c5458);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m21627(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 C5883 c5883) {
        C5499.m17103(abstractC7000, "<this>");
        C5499.m17103(c5883, "range");
        if (!c5883.isEmpty()) {
            return c5883.m18193() < Long.MAX_VALUE ? abstractC7000.mo21332(c5883.m18192(), c5883.m18193() + 1) : c5883.m18192() > Long.MIN_VALUE ? abstractC7000.mo21332(c5883.m18192() - 1, c5883.m18193()) + 1 : abstractC7000.mo5818();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c5883);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m21628(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}

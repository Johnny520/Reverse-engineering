package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class C8075 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m4109(int i, int i2) {
        if (Integer.compareUnsigned(i2, i) <= 0) {
            throw new IllegalArgumentException(C7002.m21621(C8057.m26313(i), C8057.m26313(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4110(long j, long j2) {
        if (Long.compareUnsigned(j2, j) <= 0) {
            throw new IllegalArgumentException(C7002.m21621(C8064.m26403(j), C8064.m26403(j2)).toString());
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte[] m26523(@InterfaceC6399 AbstractC7000 abstractC7000, int i) {
        C5499.m17103(abstractC7000, "<this>");
        return C8049.m26247(abstractC7000.mo21617(i));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final byte[] m26524(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(abstractC7000, "$this$nextUBytes");
        C5499.m17103(bArr, "array");
        abstractC7000.mo5813(bArr);
        return bArr;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final byte[] m26525(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(abstractC7000, "$this$nextUBytes");
        C5499.m17103(bArr, "array");
        abstractC7000.mo21618(bArr, i, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ byte[] m26526(AbstractC7000 abstractC7000, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C8049.m26253(bArr);
        }
        return m26525(abstractC7000, bArr, i, i2);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26527(@InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(abstractC7000, "<this>");
        return C8057.m26318(abstractC7000.mo5816());
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m26528(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 C8063 c8063) {
        C5499.m17103(abstractC7000, "<this>");
        C5499.m17103(c8063, "range");
        if (!c8063.isEmpty()) {
            return Integer.compareUnsigned(c8063.m26395(), -1) < 0 ? m26529(abstractC7000, c8063.m26394(), C8057.m26318(c8063.m26395() + 1)) : Integer.compareUnsigned(c8063.m26394(), 0) > 0 ? C8057.m26318(m26529(abstractC7000, C8057.m26318(c8063.m26394() - 1), c8063.m26395()) + 1) : m26527(abstractC7000);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c8063);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26529(@InterfaceC6399 AbstractC7000 abstractC7000, int i, int i2) {
        C5499.m17103(abstractC7000, "$this$nextUInt");
        m4109(i, i2);
        return C8057.m26318(abstractC7000.mo21330(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26530(@InterfaceC6399 AbstractC7000 abstractC7000, int i) {
        C5499.m17103(abstractC7000, "$this$nextUInt");
        return m26529(abstractC7000, 0, i);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m26531(@InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(abstractC7000, "<this>");
        return C8064.m26408(abstractC7000.mo5818());
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m26532(@InterfaceC6399 AbstractC7000 abstractC7000, @InterfaceC6399 C8070 c8070) {
        C5499.m17103(abstractC7000, "<this>");
        C5499.m17103(c8070, "range");
        if (c8070.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c8070);
        }
        if (Long.compareUnsigned(c8070.m26485(), -1L) < 0) {
            return m26534(abstractC7000, c8070.m26484(), C8064.m26408(c8070.m26485() + C8064.m26408(((long) 1) & C8578.f25466)));
        }
        if (Long.compareUnsigned(c8070.m26484(), 0L) <= 0) {
            return m26531(abstractC7000);
        }
        long jM26484 = c8070.m26484();
        long j = ((long) 1) & C8578.f25466;
        return C8064.m26408(m26534(abstractC7000, C8064.m26408(jM26484 - C8064.m26408(j)), c8070.m26485()) + C8064.m26408(j));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m26533(@InterfaceC6399 AbstractC7000 abstractC7000, long j) {
        C5499.m17103(abstractC7000, "$this$nextULong");
        return m26534(abstractC7000, 0L, j);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long m26534(@InterfaceC6399 AbstractC7000 abstractC7000, long j, long j2) {
        C5499.m17103(abstractC7000, "$this$nextULong");
        m4110(j, j2);
        return C8064.m26408(abstractC7000.mo21332(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}

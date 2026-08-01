package p000;

/* JADX INFO: renamed from: β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1079 {

    /* JADX INFO: renamed from: α */
    public static final byte[] f13387 = null;

    /* JADX INFO: renamed from: β */
    public static final long[] f13388 = null;

    static {
            java.lang.String r0 = "0123456789abcdef"
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7105
            byte[] r0 = r0.getBytes(r1)
            r0.getClass()
            p000.AbstractC1079.f13387 = r0
            r0 = 20
            long[] r0 = new long[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999, 99999999999, 999999999999, 9999999999999, 99999999999999, 999999999999999, 9999999999999999, 99999999999999999, 999999999999999999, 9223372036854775807} // fill-array
            p000.AbstractC1079.f13388 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.String m7263(long r6, p000.C0793sc r8) {
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1e
            long r3 = r6 - r1
            byte r0 = r8.m5455(r3)
            r5 = 13
            if (r0 != r5) goto L1e
            java.nio.charset.Charset r6 = p000.AbstractC0547mf.f7105
            java.lang.String r6 = r8.m5459(r3, r6)
            r0 = 2
            r8.skip(r0)
            return r6
        L1e:
            java.nio.charset.Charset r0 = p000.AbstractC0547mf.f7105
            java.lang.String r6 = r8.m5459(r6, r0)
            r8.skip(r1)
            return r6
    }
}

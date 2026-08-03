package p100h0;

import p057e1.C0807b;
import p088g0.C1271o;
import p116i.C1771m1;
import p116i.C1772n;
import p116i.C1785r0;

/* JADX INFO: renamed from: h0.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1537m0 {

    /* JADX INFO: renamed from: a */
    public static final C1772n f5124a = new C1772n(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final C1771m1 f5125b = new C1771m1(new C1271o(2), new C1271o(3));

    /* JADX INFO: renamed from: c */
    public static final long f5126c;

    /* JADX INFO: renamed from: d */
    public static final C1785r0 f5127d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f5126c = jFloatToRawIntBits;
        f5127d = new C1785r0(new C0807b(jFloatToRawIntBits));
    }
}

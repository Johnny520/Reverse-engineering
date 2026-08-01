package p058L;

import p000A.C0071l;
import p203n.C2626I;
import p203n.C2652e0;
import p203n.C2665l;
import p204n0.C2683b;

/* JADX INFO: renamed from: L.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0907I {

    /* JADX INFO: renamed from: a */
    public static final C2665l f2820a = new C2665l(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final C2652e0 f2821b = new C2652e0(new C0071l(20), new C0071l(21));

    /* JADX INFO: renamed from: c */
    public static final long f2822c;

    /* JADX INFO: renamed from: d */
    public static final C2626I f2823d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f2822c = jFloatToRawIntBits;
        f2823d = new C2626I(new C2683b(jFloatToRawIntBits));
    }
}

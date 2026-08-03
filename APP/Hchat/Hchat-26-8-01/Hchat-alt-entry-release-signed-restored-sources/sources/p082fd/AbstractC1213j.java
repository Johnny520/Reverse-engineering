package p082fd;

import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p246qd.AbstractC3506j;
import p246qd.EnumC3513q;
import p332wb.AbstractC4855en;
import p351xe.C5796q;

/* JADX INFO: renamed from: fd.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1213j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f4074a = AbstractC2846d.m6274b(AbstractC1213j.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3332a(long j3, AbstractC3506j abstractC3506j, C5796q c5796q, boolean z9, boolean z10) {
        if (abstractC3506j == null || !abstractC3506j.mo7345w()) {
            String string = Long.toString(j3);
            if (!z9 || Math.abs(j3) <= 100) {
                return string;
            }
            StringBuilder sbM1025n = AbstractC0255e.m1025n(string, "(0x");
            sbM1025n.append(Long.toHexString(j3));
            if (abstractC3506j == null || abstractC3506j.mo7349a(EnumC3513q.FLOAT)) {
                sbM1025n.append(", float:");
                sbM1025n.append(Float.intBitsToFloat((int) j3));
            }
            if (abstractC3506j == null || abstractC3506j.mo7349a(EnumC3513q.DOUBLE)) {
                sbM1025n.append(", double:");
                sbM1025n.append(Double.longBitsToDouble(j3));
            }
            sbM1025n.append(')');
            return sbM1025n.toString();
        }
        switch (abstractC3506j.mo7343o()) {
            case BOOLEAN:
                return j3 == 0 ? "false" : "true";
            case CHAR:
                c5796q.getClass();
                return C5796q.m10502h((char) j3, z10);
            case BYTE:
                return c5796q.m10505e(1, j3, z10);
            case SHORT:
                if (c5796q.f23543a == 1) {
                    short s10 = (short) j3;
                    if (s10 == Short.MIN_VALUE) {
                        return "Short.MIN_VALUE";
                    }
                    if (s10 == Short.MAX_VALUE) {
                        return "Short.MAX_VALUE";
                    }
                }
                return c5796q.m10505e(2, j3, z10);
            case INT:
                if (c5796q.f23543a == 1) {
                    int i9 = (int) j3;
                    if (i9 == Integer.MIN_VALUE) {
                        return "Integer.MIN_VALUE";
                    }
                    if (i9 == Integer.MAX_VALUE) {
                        return "Integer.MAX_VALUE";
                    }
                }
                return c5796q.m10505e(4, j3, z10);
            case FLOAT:
                return C5796q.m10499c(Float.intBitsToFloat((int) j3));
            case LONG:
                return c5796q.m10504d(j3, z10);
            case DOUBLE:
                return C5796q.m10498b(Double.longBitsToDouble(j3));
            case OBJECT:
            case ARRAY:
                if (j3 == 0) {
                    return "null";
                }
                f4074a.mo6265s(Long.valueOf(j3), "Wrong object literal: {} for type: {}", abstractC3506j);
                return Long.toString(j3);
            default:
                C0086a.m452k("Unknown type in literalToString: ".concat(String.valueOf(abstractC3506j)));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m3333b(AbstractC3506j abstractC3506j) {
        EnumC3513q enumC3513qMo7343o = abstractC3506j.mo7343o();
        return enumC3513qMo7343o == EnumC3513q.OBJECT ? AbstractC0921a.m2251n("L", abstractC3506j.mo7350l().replace('.', '/'), ";") : enumC3513qMo7343o == EnumC3513q.ARRAY ? AbstractC4855en.m9263g("[", m3333b(abstractC3506j.mo7340g())) : enumC3513qMo7343o.f11436g;
    }
}

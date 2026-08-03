package sh;

import bi.AbstractC0316d;
import bi.C0314b;
import p071f1.C1034w;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p222p.C3272z0;

/* JADX INFO: renamed from: sh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3994c {

    /* JADX INFO: renamed from: a */
    public static final float f13073a = 58;

    /* JADX INFO: renamed from: b */
    public static final float f13074b = 40;

    /* JADX INFO: renamed from: c */
    public static final float f13075c;

    /* JADX INFO: renamed from: d */
    public static final C3272z0 f13076d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f3 = 16;
        f13075c = f3;
        float f10 = 13;
        f13076d = new C3272z0(f3, f10, f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4041q1 m8227a(C1836h0 c1836h0) {
        C1858m2 c1858m2 = AbstractC0316d.f944a;
        long jM1240j = ((C0314b) c1836h0.m4542j(c1858m2)).m1240j();
        long j3 = ((C1034w) ((C0314b) c1836h0.m4542j(c1858m2)).f927k.getValue()).f3265a;
        long jM1235e = ((C0314b) c1836h0.m4542j(c1858m2)).m1235e();
        long j4 = ((C1034w) ((C0314b) c1836h0.m4542j(c1858m2)).f928l.getValue()).f3265a;
        boolean zM4532e = c1836h0.m4532e(jM1240j) | c1836h0.m4532e(j3) | c1836h0.m4532e(jM1235e) | c1836h0.m4532e(j4);
        Object objM4514P = c1836h0.m4514P();
        if (zM4532e || objM4514P == C1851l.f6155a) {
            C4041q1 c4041q1 = new C4041q1(jM1240j, j3, jM1235e, j4);
            c1836h0.m4545k0(c4041q1);
            objM4514P = c4041q1;
        }
        return (C4041q1) objM4514P;
    }
}

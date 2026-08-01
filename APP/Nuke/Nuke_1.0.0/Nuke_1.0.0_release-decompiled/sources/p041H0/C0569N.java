package p041H0;

import java.util.Arrays;
import p029F0.C0414n;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: H0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0569N implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public boolean f1762d;

    /* JADX INFO: renamed from: e */
    public long f1763e = 9223372034707292159L;

    /* JADX INFO: renamed from: f */
    public long f1764f = 0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0572Q f1765g;

    public C0569N(AbstractC0572Q abstractC0572Q) {
        this.f1765g = abstractC0572Q;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m877a(C0414n c0414n, float f2) {
        AbstractC0572Q abstractC0572Q = this.f1765g;
        C0630y0 c0630y0 = abstractC0572Q.f1783p;
        if (c0630y0 == null) {
            c0630y0 = new C0630y0();
            abstractC0572Q.f1783p = c0630y0;
        }
        int iM2004b0 = AbstractC0972l.m2004b0((C0414n[]) c0630y0.f2000c, c0414n);
        if (iM2004b0 >= 0) {
            float[] fArr = (float[]) c0630y0.f2001d;
            if (fArr[iM2004b0] != f2) {
                fArr[iM2004b0] = f2;
                ((byte[]) c0630y0.f2002e)[iM2004b0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c0630y0.f2002e;
                if (bArr[iM2004b0] == 2) {
                    bArr[iM2004b0] = 0;
                    return;
                }
                return;
            }
        }
        int i5 = c0630y0.f1999b;
        C0414n[] c0414nArr = (C0414n[]) c0630y0.f2000c;
        if (i5 == c0414nArr.length) {
            int i6 = i5 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(c0414nArr, i6);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            c0630y0.f2000c = (C0414n[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) c0630y0.f2001d, i6);
            AbstractC1665j.m2984d(fArrCopyOf, "copyOf(...)");
            c0630y0.f2001d = fArrCopyOf;
            ?? CopyOf = Arrays.copyOf((byte[]) c0630y0.f2002e, i6);
            AbstractC1665j.m2984d(CopyOf, "copyOf(...)");
            c0630y0.f2002e = CopyOf;
        }
        ((C0414n[]) c0630y0.f2000c)[i5] = c0414n;
        ((byte[]) c0630y0.f2002e)[i5] = 3;
        ((float[]) c0630y0.f2001d)[i5] = f2;
        c0630y0.f1999b++;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1765g.mo272b();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1765g.mo282p();
    }
}

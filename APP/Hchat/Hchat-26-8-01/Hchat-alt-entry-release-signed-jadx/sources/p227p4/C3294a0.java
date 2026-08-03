package p227p4;

import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p295u4.C4266p;
import p295u4.C4270t;
import p376z4.C6090d;
import p376z4.C6093g;

/* JADX INFO: renamed from: p4.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3294a0 extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public final C3301f f10471f;

    /* JADX INFO: renamed from: g */
    public final C6093g f10472g;

    /* JADX INFO: renamed from: h */
    public final C3301f[] f10473h;

    /* JADX INFO: renamed from: i */
    public final boolean f10474i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3294a0(C4270t c4270t, C3301f c3301f, C6093g c6093g, C3301f[] c3301fArr) {
        super(c4270t, C4266p.f13968i);
        if (c3301f == null) {
            C0353j.m1305c("user == null");
            throw null;
        }
        if (c6093g == null) {
            C0353j.m1305c("cases == null");
            throw null;
        }
        if (c3301fArr == null) {
            C0353j.m1305c("targets == null");
            throw null;
        }
        int i9 = c6093g.f24610i;
        if (i9 != c3301fArr.length) {
            C2104o.m5294t("cases / targets mismatch");
            throw null;
        }
        if (i9 > 65535) {
            C2104o.m5294t("too many cases");
            throw null;
        }
        this.f10471f = c3301f;
        this.f10472g = c6093g;
        this.f10473h = c3301fArr;
        boolean z9 = true;
        if (i9 >= 2) {
            long jM6973m = m6973m(c6093g);
            long j3 = (((long) c6093g.f24610i) * 4) + 2;
            if (jM6973m < 0 || jM6973m > (j3 * 5) / 4) {
                z9 = false;
            }
        }
        this.f10474i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static long m6973m(C6093g c6093g) {
        long jM10846n = (((((long) c6093g.m10846n(c6093g.f24610i - 1)) - ((long) c6093g.m10846n(0))) + 1) * 2) + 4;
        if (jM10846n <= 2147483647L) {
            return jM10846n;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        StringBuilder sb2 = new StringBuilder(100);
        C3301f[] c3301fArr = this.f10473h;
        int length = c3301fArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            sb2.append("\n    ");
            sb2.append(this.f10472g.m10846n(i9));
            sb2.append(": ");
            sb2.append(c3301fArr[i9]);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: b */
    public final int mo6969b() {
        boolean z9 = this.f10474i;
        C6093g c6093g = this.f10472g;
        return (int) (z9 ? m6973m(c6093g) : (((long) c6093g.f24610i) * 4) + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: g */
    public final String mo6970g() {
        int iM6989e = this.f10471f.m6989e();
        StringBuilder sb2 = new StringBuilder(100);
        C3301f[] c3301fArr = this.f10473h;
        int length = c3301fArr.length;
        sb2.append(this.f10474i ? "packed" : "sparse");
        sb2.append("-switch-payload // for switch @ ");
        sb2.append(AbstractC0000a.m46X0(iM6989e));
        for (int i9 = 0; i9 < length; i9++) {
            int iM6989e2 = c3301fArr[i9].m6989e();
            sb2.append("\n  ");
            sb2.append(this.f10472g.m10846n(i9));
            sb2.append(": ");
            sb2.append(AbstractC0000a.m48Y0(iM6989e2));
            sb2.append(" // ");
            sb2.append(AbstractC0000a.m22L0(iM6989e2 - iM6989e));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        return new C3294a0(this.f10489c, this.f10471f, this.f10472g, this.f10473h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: l */
    public final void mo6972l(C6090d c6090d) {
        int iM6989e;
        int iM6989e2 = this.f10471f.m6989e();
        int iMo2812j = AbstractC3306k.f10524J.f10495d.mo2812j();
        C3301f[] c3301fArr = this.f10473h;
        int length = c3301fArr.length;
        boolean z9 = this.f10474i;
        C6093g c6093g = this.f10472g;
        int i9 = 0;
        if (!z9) {
            c6090d.m10836l(Opcodes.ACC_INTERFACE);
            c6090d.m10836l(length);
            for (int i10 = 0; i10 < length; i10++) {
                c6090d.m10835k(c6093g.m10846n(i10));
            }
            while (i9 < length) {
                c6090d.m10835k(c3301fArr[i9].m6989e() - iM6989e2);
                i9++;
            }
            return;
        }
        int iM10846n = length == 0 ? 0 : c6093g.m10846n(0);
        int iM10846n2 = ((length == 0 ? 0 : c6093g.m10846n(length - 1)) - iM10846n) + 1;
        c6090d.m10836l(Opcodes.ACC_NATIVE);
        c6090d.m10836l(iM10846n2);
        c6090d.m10835k(iM10846n);
        int i11 = 0;
        while (i9 < iM10846n2) {
            if (c6093g.m10846n(i11) > iM10846n + i9) {
                iM6989e = iMo2812j;
            } else {
                iM6989e = c3301fArr[i11].m6989e() - iM6989e2;
                i11++;
            }
            c6090d.m10835k(iM6989e);
            i9++;
        }
    }
}

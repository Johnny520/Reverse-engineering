package p257r7;

import java.io.IOException;
import p152k7.AbstractC2331a;
import p241q7.C3445b;

/* JADX INFO: renamed from: r7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3711a extends AbstractC3712b implements InterfaceC3717g {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f12072m;

    /* JADX INFO: renamed from: n */
    public final boolean f12073n;

    /* JADX INFO: renamed from: o */
    public int f12074o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3711a(int i9, boolean z9) {
        super(0);
        this.f12072m = i9;
        switch (i9) {
            case 1:
                super(2);
                this.f12073n = z9;
                break;
            default:
                this.f12074o = 4;
                this.f12073n = z9;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) throws IOException {
        switch (this.f12072m) {
            case 0:
                if (!this.f12073n) {
                    super.mo1893B(c3445b);
                    break;
                } else {
                    m7713N(c3445b.f11162k);
                    int iMo5551p = mo5551p();
                    int iAvailable = c3445b.available();
                    if (iMo5551p != 0 && iAvailable >= iMo5551p) {
                        c3445b.m7229e(this.f12076k, iMo5551p);
                        break;
                    }
                }
                break;
            default:
                super.mo1893B(c3445b);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public void mo7712L() {
        switch (this.f12072m) {
            case 1:
                byte[] bArr = this.f12076k;
                int iM5542x = 0;
                if (!this.f12073n) {
                    iM5542x = AbstractC2331a.m5542x(bArr, 0);
                } else if (2 <= bArr.length) {
                    iM5542x = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                }
                this.f12074o = iM5542x;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public int m7713N(int i9) {
        int i10 = this.f12074o;
        int i11 = i10 <= 1 ? 0 : (i10 - (i9 % i10)) % i10;
        m7714O(i11);
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public void m7714O(int i9) {
        m7715M(i9, false);
        byte[] bArr = this.f12076k;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public int get() {
        return this.f12074o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public void mo633k(int i9) {
        if (i9 == this.f12074o) {
            return;
        }
        this.f12074o = i9;
        byte[] bArr = this.f12076k;
        if (!this.f12073n) {
            AbstractC2331a.m5535E(bArr, 0, i9);
        } else {
            bArr[0] = (byte) ((i9 >>> 8) & 255);
            bArr[1] = (byte) (i9 & 255);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f12072m) {
            case 0:
                int i9 = this.f12074o;
                if (i9 <= 0) {
                    return "OFF";
                }
                int iMo5551p = mo5551p();
                StringBuilder sb2 = new StringBuilder();
                if (i9 != 4) {
                    sb2.append("alignment=");
                    sb2.append(i9);
                    sb2.append(", ");
                }
                sb2.append("align=");
                sb2.append(iMo5551p);
                return sb2.toString();
            default:
                return String.valueOf(this.f12074o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3711a(short s10) {
        this(1, false);
        this.f12072m = 1;
        mo633k(s10 & 65535);
    }
}

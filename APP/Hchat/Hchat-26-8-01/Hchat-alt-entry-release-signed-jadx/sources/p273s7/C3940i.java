package p273s7;

import java.io.IOException;
import p152k7.InterfaceC2335e;
import p241q7.C3445b;
import p257r7.AbstractC3712b;
import p257r7.C3716f;
import p257r7.InterfaceC3717g;

/* JADX INFO: renamed from: s7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3940i extends AbstractC3712b implements InterfaceC2335e {

    /* JADX INFO: renamed from: m */
    public final InterfaceC3717g f12920m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3940i(C3716f c3716f) {
        super(0);
        this.f12920m = c3716f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        if (m8134N()) {
            super.mo1893B(c3445b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final boolean m8134N() {
        int i9 = this.f12920m.get() != 0 ? 8 : 0;
        m7715M(i9, false);
        if (i9 == 0) {
            return false;
        }
        byte[] bArr = this.f12076k;
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = -1;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2335e
    /* JADX INFO: renamed from: c */
    public final void mo5562c() {
        m8134N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        char c10;
        char c11;
        int i9;
        int i10;
        byte[] bArr = this.f12076k;
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i11 = (b10 >> 4) & 15;
            if (i11 < 0) {
                c10 = 0;
            } else {
                if (i11 < 10) {
                    i10 = i11 + 48;
                } else {
                    if (i11 <= 16) {
                        i10 = i11 + 87;
                    }
                    c10 = 0;
                }
                c10 = (char) i10;
            }
            sb2.append(c10);
            int i12 = b10 & 15;
            if (i12 < 0) {
                c11 = 0;
            } else {
                if (i12 < 10) {
                    i9 = i12 + 48;
                } else {
                    if (i12 <= 16) {
                        i9 = i12 + 87;
                    }
                    c11 = 0;
                }
                c11 = (char) i9;
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }
}

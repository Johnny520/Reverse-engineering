package p257r7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p241q7.C3445b;

/* JADX INFO: renamed from: r7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3712b extends AbstractC2331a {

    /* JADX INFO: renamed from: l */
    public static final byte[] f12075l = new byte[0];

    /* JADX INFO: renamed from: k */
    public byte[] f12076k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3712b(int i9) {
        if (i9 == 0) {
            this.f12076k = f12075l;
        } else {
            this.f12076k = new byte[i9];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) throws IOException {
        byte[] bArr = this.f12076k;
        if (bArr.length == 0) {
            return;
        }
        c3445b.getClass();
        c3445b.m7229e(bArr, bArr.length);
        mo7712L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr;
        int length;
        if (this.f7659i || (length = (bArr = this.f12076k).length) == 0) {
            return 0;
        }
        byteArrayOutputStream.write(bArr, 0, length);
        return length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m7715M(int i9, boolean z9) {
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 == 0) {
            this.f12076k = f12075l;
            if (z9) {
                mo7712L();
                return;
            }
            return;
        }
        byte[] bArr = this.f12076k;
        int length = bArr.length;
        if (i9 == length) {
            return;
        }
        byte[] bArr2 = new byte[i9];
        if (i9 >= length) {
            i9 = length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i9);
        this.f12076k = bArr2;
        if (z9) {
            mo7712L();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        if (this.f7659i) {
            return 0;
        }
        return this.f12076k.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public byte[] mo5552r() {
        if (this.f7659i) {
            return null;
        }
        return this.f12076k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        if (((AbstractC2331a) c1075b.f3461d) == this) {
            c1075b.f3459b = true;
            return;
        }
        int iMo5551p = mo5551p();
        if (c1075b.f3459b || iMo5551p == 0) {
            return;
        }
        c1075b.f3460c += iMo5551p;
    }

    /* JADX INFO: renamed from: L */
    public void mo7712L() {
    }
}

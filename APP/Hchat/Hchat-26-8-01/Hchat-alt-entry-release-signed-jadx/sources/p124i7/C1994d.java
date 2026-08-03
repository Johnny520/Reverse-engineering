package p124i7;

import java.io.InputStream;
import p344x7.C5704a;

/* JADX INFO: renamed from: i7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1994d extends AbstractC1996f {

    /* JADX INFO: renamed from: g */
    public final byte[] f6736g;

    /* JADX INFO: renamed from: h */
    public final int f6737h;

    /* JADX INFO: renamed from: i */
    public final int f6738i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1994d(byte[] bArr) {
        int length = bArr.length;
        int length2 = bArr.length <= 0 ? bArr.length - 1 : 0;
        int i9 = length2 >= 0 ? length2 : 0;
        int length3 = bArr.length - i9;
        length = length > length3 ? length3 : length;
        this.f6736g = bArr;
        this.f6737h = i9;
        this.f6738i = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: a */
    public final byte[] mo4932a() {
        int i9 = 65581;
        byte[] bArr = this.f6736g;
        int i10 = this.f6737h;
        int i11 = this.f6738i;
        if (65581 > i11) {
            if (i10 == 0) {
                return (byte[]) bArr.clone();
            }
            i9 = i11;
        }
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, (bArr.length - i10) - i9, bArr2, 0, i9);
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: b */
    public final InputStream mo4933b(long j3, long j4) {
        return new C5704a(this.f6736g, (int) (j3 + ((long) this.f6737h)), (int) j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: c */
    public final long mo4934c() {
        return this.f6738i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

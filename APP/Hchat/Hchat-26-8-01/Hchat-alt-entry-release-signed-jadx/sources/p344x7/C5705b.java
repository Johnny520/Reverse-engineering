package p344x7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Settings;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: x7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5705b extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: g */
    public int f23181g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5705b(int i9) {
        super(i9);
        if (i9 >= 0) {
        } else {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Negative: "));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.ByteArrayOutputStream
    public final synchronized byte[] toByteArray() {
        int i9 = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (i9 == bArr.length) {
            return bArr;
        }
        if (i9 == 0) {
            byte[] bArr2 = new byte[0];
            ((ByteArrayOutputStream) this).buf = bArr2;
            return bArr2;
        }
        byte[] bArr3 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr3[i10] = bArr[i10];
        }
        ((ByteArrayOutputStream) this).buf = bArr3;
        return bArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        return "pos = " + size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = ((ByteArrayOutputStream) this).count + i10;
        byte[] bArr2 = ((ByteArrayOutputStream) this).buf;
        if (i11 - bArr2.length > 0) {
            if (this.f23181g == 0) {
                this.f23181g = 2;
            }
            int i12 = this.f23181g << 1;
            this.f23181g = i12;
            if (i12 > 65535) {
                this.f23181g = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            }
            int length = bArr2.length;
            int i13 = this.f23181g + i11;
            if (i13 - i11 >= 0) {
                i11 = i13;
            }
            byte[] bArr3 = new byte[i11];
            for (int i14 = 0; i14 < length; i14++) {
                bArr3[i14] = bArr2[i14];
            }
            ((ByteArrayOutputStream) this).buf = bArr3;
        }
        System.arraycopy(bArr, i9, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, i10);
        ((ByteArrayOutputStream) this).count += i10;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}

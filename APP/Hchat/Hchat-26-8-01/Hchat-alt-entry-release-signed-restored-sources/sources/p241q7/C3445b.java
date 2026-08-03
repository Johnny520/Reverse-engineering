package p241q7;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: q7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3445b extends InputStream {

    /* JADX INFO: renamed from: g */
    public final Object f11158g;

    /* JADX INFO: renamed from: h */
    public byte[] f11159h;

    /* JADX INFO: renamed from: i */
    public final int f11160i;

    /* JADX INFO: renamed from: j */
    public final int f11161j;

    /* JADX INFO: renamed from: k */
    public int f11162k;

    /* JADX INFO: renamed from: l */
    public boolean f11163l;

    /* JADX INFO: renamed from: m */
    public int f11164m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3445b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[40960];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 <= 0) {
                break;
            } else {
                byteArrayOutputStream.write(bArr, 0, i9);
            }
        }
        if (inputStream instanceof FileInputStream) {
            inputStream.close();
        }
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this(byteArray, 0, byteArray.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3445b m7226a(int i9) {
        int i10 = this.f11162k;
        int i11 = i10 + i9;
        int i12 = this.f11161j;
        if (i9 < 0 || i11 > i12) {
            i9 = i12 - i10;
        }
        return new C3445b(this.f11159h, i10 + this.f11160i, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f11161j - this.f11162k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m7227b() {
        return !this.f11163l && available() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m7228c(int i9) {
        m7230g(this.f11162k + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11163l = true;
        this.f11159h = null;
        this.f11164m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m7229e(byte[] bArr, int i9) throws IOException {
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        if (this.f11163l) {
            C2104o.m5299y("Stream is closed");
            return 0;
        }
        if (this.f11162k >= this.f11161j) {
            throw new EOFException("Finished reading: " + this.f11162k);
        }
        if (i9 > bArr.length) {
            i9 = bArr.length;
        }
        synchronized (this.f11158g) {
            try {
                int i11 = this.f11160i + this.f11162k;
                while (true) {
                    if (i10 >= i9) {
                        break;
                    }
                    bArr[i10] = this.f11159h[i11 + i10];
                    int i12 = this.f11162k + 1;
                    this.f11162k = i12;
                    if (i12 >= this.f11161j) {
                        i10++;
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m7230g(int i9) {
        if (i9 < 0) {
            i9 = 0;
        } else {
            int i10 = this.f11161j;
            if (i9 > i10) {
                i9 = i10;
            }
        }
        synchronized (this.f11158g) {
            this.f11162k = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i9) {
        this.f11164m = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i9;
        if (this.f11163l) {
            C2104o.m5299y("Stream is closed");
            return 0;
        }
        int i10 = this.f11162k;
        if (i10 >= this.f11161j) {
            throw new EOFException(AbstractC0921a.m2249l(i10, "Finished reading: "));
        }
        synchronized (this.f11158g) {
            i9 = this.f11159h[this.f11160i + i10] & 255;
            this.f11162k++;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final short readShort() throws IOException {
        int i9 = this.f11162k;
        byte[] bArr = new byte[2];
        m7229e(bArr, 2);
        m7230g(i9);
        return (short) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.f11163l) {
            C2104o.m5299y("Can not reset stream is closed");
        } else {
            this.f11162k = this.f11164m;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3445b.class.getSimpleName());
        sb2.append(": ");
        if (this.f11163l) {
            sb2.append("Closed");
        } else {
            int iAvailable = available();
            if (iAvailable == 0) {
                sb2.append("Finished: ");
                sb2.append(this.f11162k);
            } else {
                int i9 = this.f11160i;
                if (i9 > 0) {
                    sb2.append("START=");
                    sb2.append(i9);
                    sb2.append(", ACTUAL=");
                    sb2.append(i9 + this.f11162k);
                    sb2.append(", ");
                }
                sb2.append("POS=");
                sb2.append(this.f11162k);
                sb2.append(", available=");
                sb2.append(iAvailable);
            }
        }
        return sb2.toString();
    }

    public C3445b(byte[] bArr, int i9, int i10) {
        this.f11158g = new Object();
        this.f11159h = bArr;
        this.f11160i = i9;
        this.f11161j = i10;
        this.f11162k = 0;
    }
}

package p376z4;

import java.io.InputStream;
import p096g8.C1361b;

/* JADX INFO: renamed from: z4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6088b extends InputStream {

    /* JADX INFO: renamed from: g */
    public int f24589g = 0;

    /* JADX INFO: renamed from: h */
    public int f24590h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1361b f24591i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6088b(C1361b c1361b) {
        this.f24591i = c1361b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f24591i.f4512c - this.f24589g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i9) {
        this.f24590h = this.f24589g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (i9 + i10 > bArr.length) {
            i10 = bArr.length - i9;
        }
        C1361b c1361b = this.f24591i;
        int i11 = c1361b.f4512c;
        int i12 = this.f24589g;
        int i13 = i11 - i12;
        if (i10 > i13) {
            i10 = i13;
        }
        System.arraycopy(c1361b.f4511b, i12, bArr, i9, i10);
        this.f24589g += i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() {
        this.f24589g = this.f24590h;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i9 = this.f24589g;
        C1361b c1361b = this.f24591i;
        if (i9 >= c1361b.f4512c) {
            return -1;
        }
        int iM3658f = c1361b.m3658f(i9);
        this.f24589g++;
        return iM3658f;
    }
}

package p084ff;

import ac.C0058k;
import java.nio.ByteBuffer;
import p141jf.C2129e;

/* JADX INFO: renamed from: ff.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1219e {

    /* JADX INFO: renamed from: a */
    public final int f4084a;

    /* JADX INFO: renamed from: b */
    public final String f4085b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f4086c;

    /* JADX INFO: renamed from: d */
    public final C2129e f4087d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1219e(int i9, String str, byte[] bArr, int i10) {
        this.f4084a = i9;
        this.f4085b = str;
        this.f4086c = ByteBuffer.wrap(bArr);
        this.f4087d = new C2129e(new C0058k(this, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4085b;
    }
}

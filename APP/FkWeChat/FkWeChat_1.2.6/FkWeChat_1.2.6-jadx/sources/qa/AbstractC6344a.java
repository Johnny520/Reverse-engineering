package qa;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: qa.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6344a implements InterfaceC6360q {

    /* JADX INFO: renamed from: q */
    public int f19958q = 0;

    /* JADX INFO: renamed from: h */
    public C6366w m25018h() {
        return new C6366w(this);
    }

    /* JADX INFO: renamed from: i */
    public void m25019i(OutputStream outputStream) throws IOException {
        int iMo13994f = mo13994f();
        C6350g c6350gM25111I = C6350g.m25111I(outputStream, C6350g.m25131t(C6350g.m25132u(iMo13994f) + iMo13994f));
        c6350gM25111I.m25169n0(iMo13994f);
        mo13993d(c6350gM25111I);
        c6350gM25111I.m25138H();
    }

    /* JADX INFO: renamed from: qa.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a implements InterfaceC6360q.a {
        /* JADX INFO: renamed from: h */
        public static C6366w m25020h(InterfaceC6360q interfaceC6360q) {
            return new C6366w(interfaceC6360q);
        }

        /* JADX INFO: renamed from: qa.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10183a extends FilterInputStream {

            /* JADX INFO: renamed from: q */
            public int f19959q;

            public C10183a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f19959q = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f19959q);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f19959q;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f19959q -= i13;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f19959q));
                if (jSkip >= 0) {
                    this.f19959q = (int) (((long) this.f19959q) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f19959q <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f19959q--;
                }
                return i10;
            }
        }
    }
}

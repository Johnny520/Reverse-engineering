package p376zd;

import ae.AbstractC0302a;
import ae.AbstractC0309h;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: zd.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10008o0 implements InterfaceC9999k {

    /* JADX INFO: renamed from: q */
    public final InterfaceC10024w0 f33602q;

    /* JADX INFO: renamed from: r */
    public final C9995i f33603r;

    /* JADX INFO: renamed from: s */
    public boolean f33604s;

    public C10008o0(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        this.f33602q = interfaceC10024w0;
        this.f33603r = new C9995i();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: B0 */
    public long mo38671B0() throws EOFException {
        mo38721o(8L);
        return this.f33603r.mo38671B0();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: C */
    public byte[] mo38672C() {
        this.f33603r.mo38670A0(this.f33602q);
        return this.f33603r.mo38672C();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: I0 */
    public long mo38679I0() throws EOFException {
        byte bM38716l;
        mo38721o(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!mo38710i(i11)) {
                break;
            }
            bM38716l = this.f33603r.m38716l(i10);
            if ((bM38716l < 48 || bM38716l > 57) && ((bM38716l < 97 || bM38716l > 102) && (bM38716l < 65 || bM38716l > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            String string = Integer.toString(bM38716l, AbstractC8610a.m33053a(16));
            string.getClass();
            C9989f.m38655a("Expected leading [0-9a-fA-F] character but was 0x", string);
            return 0L;
        }
        return this.f33603r.mo38679I0();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: J */
    public long mo38680J(C10003m c10003m, long j10, long j11) {
        c10003m.getClass();
        return AbstractC0309h.m944b(this, c10003m, 0, 0, j10, j11, 6, null);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: K0 */
    public InputStream mo38683K0() {
        return new a();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: O */
    public int mo38687O(C9996i0 c9996i0) throws EOFException {
        c9996i0.getClass();
        if (this.f33604s) {
            C10010p0.m38820a("closed");
            return 0;
        }
        do {
            int iM904i = AbstractC0302a.m904i(this.f33603r, c9996i0, true);
            if (iM904i != -2) {
                if (iM904i == -1) {
                    return -1;
                }
                this.f33603r.skip(c9996i0.m38746o()[iM904i].m38765G());
                return iM904i;
            }
        } while (this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1);
        return -1;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: S */
    public long mo38692S() throws EOFException {
        byte bM38716l;
        mo38721o(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!mo38710i(j11)) {
                break;
            }
            bM38716l = this.f33603r.m38716l(j10);
            if ((bM38716l < 48 || bM38716l > 57) && !(j10 == 0 && bM38716l == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            String string = Integer.toString(bM38716l, AbstractC8610a.m33053a(16));
            string.getClass();
            C9989f.m38655a("Expected a digit or '-' but was 0x", string);
            return 0L;
        }
        return this.f33603r.mo38692S();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: U */
    public String mo38694U(long j10) throws EOFException {
        if (j10 < 0) {
            C9991g.m38662a("limit < 0: ", j10);
            return null;
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jM38813d = m38813d((byte) 10, 0L, j11);
        if (jM38813d != -1) {
            return AbstractC0302a.m903h(this.f33603r, jM38813d);
        }
        if (j11 < Long.MAX_VALUE && mo38710i(j11) && this.f33603r.m38716l(j11 - 1) == 13 && mo38710i(j11 + 1) && this.f33603r.m38716l(j11) == 10) {
            return AbstractC0302a.m903h(this.f33603r, j11);
        }
        C9995i c9995i = new C9995i();
        C9995i c9995i2 = this.f33603r;
        c9995i2.m38712j(c9995i, 0L, Math.min(32, c9995i2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f33603r.size(), j10) + " content=" + c9995i.mo38717l0().mo38782p() + (char) 8230);
    }

    @Override // p376zd.InterfaceC9999k, p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: b */
    public C9995i mo38699b() {
        return this.f33603r;
    }

    /* JADX INFO: renamed from: c */
    public long m38812c(byte b10) {
        return m38813d(b10, 0L, Long.MAX_VALUE);
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f33604s) {
            return;
        }
        this.f33604s = true;
        this.f33602q.close();
        this.f33603r.m38701c();
    }

    /* JADX INFO: renamed from: d */
    public long m38813d(byte b10, long j10, long j11) {
        if (this.f33604s) {
            C10010p0.m38820a("closed");
            return 0L;
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jM38718m = this.f33603r.m38718m(b11, jMax, j12);
            if (jM38718m != -1) {
                return jM38718m;
            }
            long size = this.f33603r.size();
            if (size >= j12 || this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m38814e(long j10, C10003m c10003m, int i10, int i11) {
        c10003m.getClass();
        if (!this.f33604s) {
            return i11 >= 0 && j10 >= 0 && i10 >= 0 && i10 + i11 <= c10003m.m38765G() && (i11 == 0 || AbstractC0309h.m943a(this, c10003m, i10, i11, j10, j10 + 1) != -1);
        }
        C10010p0.m38820a("closed");
        return false;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: f0 */
    public boolean mo38706f0(long j10, C10003m c10003m) {
        c10003m.getClass();
        return m38814e(j10, c10003m, 0, c10003m.m38765G());
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: g */
    public boolean mo38707g() {
        if (!this.f33604s) {
            return this.f33603r.mo38707g() && this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1;
        }
        C10010p0.m38820a("closed");
        return false;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: h0 */
    public int mo38709h0() throws EOFException {
        mo38721o(1L);
        byte bM38716l = this.f33603r.m38716l(0L);
        if ((bM38716l & 224) == 192) {
            mo38721o(2L);
        } else if ((bM38716l & JSONB.Constants.BC_INT32_NUM_MIN) == 224) {
            mo38721o(3L);
        } else if ((bM38716l & 248) == 240) {
            mo38721o(4L);
        }
        return this.f33603r.mo38709h0();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: i */
    public boolean mo38710i(long j10) {
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return false;
        }
        if (this.f33604s) {
            C10010p0.m38820a("closed");
            return false;
        }
        while (this.f33603r.size() < j10) {
            if (this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33604s;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: l0 */
    public C10003m mo38717l0() {
        this.f33603r.mo38670A0(this.f33602q);
        return this.f33603r.mo38717l0();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: o */
    public void mo38721o(long j10) throws EOFException {
        if (!mo38710i(j10)) {
            throw new EOFException();
        }
    }

    @Override // p376zd.InterfaceC9999k
    public InterfaceC9999k peek() {
        return AbstractC9988e0.m38648c(new C10002l0(this));
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: r */
    public void mo38724r(C9995i c9995i, long j10) throws EOFException {
        c9995i.getClass();
        try {
            mo38721o(j10);
            this.f33603r.mo38724r(c9995i, j10);
        } catch (EOFException e10) {
            c9995i.mo38670A0(this.f33603r);
            throw e10;
        }
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) {
        c9995i.getClass();
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return 0L;
        }
        if (this.f33604s) {
            C10010p0.m38820a("closed");
            return 0L;
        }
        if (this.f33603r.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                return -1L;
            }
        }
        return this.f33603r.read(c9995i, Math.min(j10, this.f33603r.size()));
    }

    @Override // p376zd.InterfaceC9999k
    public byte readByte() throws EOFException {
        mo38721o(1L);
        return this.f33603r.readByte();
    }

    @Override // p376zd.InterfaceC9999k
    public void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        try {
            mo38721o(bArr.length);
            this.f33603r.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f33603r.size() > 0) {
                C9995i c9995i = this.f33603r;
                int i11 = c9995i.read(bArr, i10, (int) c9995i.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // p376zd.InterfaceC9999k
    public int readInt() throws EOFException {
        mo38721o(4L);
        return this.f33603r.readInt();
    }

    @Override // p376zd.InterfaceC9999k
    public long readLong() throws EOFException {
        mo38721o(8L);
        return this.f33603r.readLong();
    }

    @Override // p376zd.InterfaceC9999k
    public short readShort() throws EOFException {
        mo38721o(2L);
        return this.f33603r.readShort();
    }

    @Override // p376zd.InterfaceC9999k
    public String readString(Charset charset) {
        charset.getClass();
        this.f33603r.mo38670A0(this.f33602q);
        return this.f33603r.readString(charset);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: s */
    public String mo38726s(long j10) throws EOFException {
        mo38721o(j10);
        return this.f33603r.mo38726s(j10);
    }

    @Override // p376zd.InterfaceC9999k
    public void skip(long j10) throws EOFException {
        if (this.f33604s) {
            C10010p0.m38820a("closed");
            return;
        }
        while (j10 > 0) {
            if (this.f33603r.size() == 0 && this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f33603r.size());
            this.f33603r.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: t0 */
    public String mo38728t0() {
        return mo38694U(Long.MAX_VALUE);
    }

    @Override // p376zd.InterfaceC10024w0
    /* JADX INFO: renamed from: timeout */
    public C10026x0 getTimeout() {
        return this.f33602q.getTimeout();
    }

    public String toString() {
        return "buffer(" + this.f33602q + ')';
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: u */
    public C10003m mo38729u(long j10) throws EOFException {
        mo38721o(j10);
        return this.f33603r.mo38729u(j10);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: u0 */
    public int mo38730u0() throws EOFException {
        mo38721o(4L);
        return this.f33603r.mo38730u0();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: x0 */
    public short mo38735x0() throws EOFException {
        mo38721o(2L);
        return this.f33603r.mo38735x0();
    }

    /* JADX INFO: renamed from: zd.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C10008o0 c10008o0 = C10008o0.this;
            if (!c10008o0.f33604s) {
                return (int) Math.min(c10008o0.f33603r.size(), Integer.MAX_VALUE);
            }
            C10023w.m38841a("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            C10008o0.this.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            bArr.getClass();
            if (C10008o0.this.f33604s) {
                C10023w.m38841a("closed");
                return 0;
            }
            AbstractC9978b.m38615b(bArr.length, i10, i11);
            if (C10008o0.this.f33603r.size() == 0) {
                C10008o0 c10008o0 = C10008o0.this;
                if (c10008o0.f33602q.read(c10008o0.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                    return -1;
                }
            }
            return C10008o0.this.f33603r.read(bArr, i10, i11);
        }

        public String toString() {
            return C10008o0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream outputStream) throws IOException {
            outputStream.getClass();
            if (C10008o0.this.f33604s) {
                C10023w.m38841a("closed");
                return 0L;
            }
            long size = 0;
            while (true) {
                if (C10008o0.this.f33603r.size() == 0) {
                    C10008o0 c10008o0 = C10008o0.this;
                    if (c10008o0.f33602q.read(c10008o0.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                        return size;
                    }
                }
                size += C10008o0.this.f33603r.size();
                C9995i.m38669L0(C10008o0.this.f33603r, outputStream, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C10008o0 c10008o0 = C10008o0.this;
            if (!c10008o0.f33604s) {
                if (c10008o0.f33603r.size() == 0) {
                    C10008o0 c10008o02 = C10008o0.this;
                    if (c10008o02.f33602q.read(c10008o02.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                        return -1;
                    }
                }
                return C10008o0.this.f33603r.readByte() & 255;
            }
            C10023w.m38841a("closed");
            return 0;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.f33603r.size() == 0 && this.f33602q.read(this.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
            return -1;
        }
        return this.f33603r.read(byteBuffer);
    }
}

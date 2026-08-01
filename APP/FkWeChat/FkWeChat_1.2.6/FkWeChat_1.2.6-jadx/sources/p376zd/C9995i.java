package p376zd;

import ae.AbstractC0302a;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;
import p299ub.C8614c;

/* JADX INFO: renamed from: zd.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9995i implements InterfaceC9999k, InterfaceC9997j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: q */
    public C10012q0 f33561q;

    /* JADX INFO: renamed from: r */
    public long f33562r;

    /* JADX INFO: renamed from: zd.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: q */
        public C9995i f33563q;

        /* JADX INFO: renamed from: r */
        public boolean f33564r;

        /* JADX INFO: renamed from: s */
        public C10012q0 f33565s;

        /* JADX INFO: renamed from: u */
        public byte[] f33567u;

        /* JADX INFO: renamed from: t */
        public long f33566t = -1;

        /* JADX INFO: renamed from: v */
        public int f33568v = -1;

        /* JADX INFO: renamed from: w */
        public int f33569w = -1;

        /* JADX INFO: renamed from: c */
        public final long m38738c(int i10) {
            if (i10 <= 0) {
                C10030z0.m38853a("minByteCount <= 0: ", i10);
                return 0L;
            }
            if (i10 > 8192) {
                C10030z0.m38853a("minByteCount > Segment.SIZE: ", i10);
                return 0L;
            }
            C9995i c9995i = this.f33563q;
            if (c9995i == null) {
                C10010p0.m38820a("not attached to a buffer");
                return 0L;
            }
            if (!this.f33564r) {
                C10010p0.m38820a("expandBuffer() only permitted for read/write buffers");
                return 0L;
            }
            long size = c9995i.size();
            C10012q0 c10012q0M38695V = c9995i.m38695V(i10);
            int i11 = 8192 - c10012q0M38695V.f33618c;
            c10012q0M38695V.f33618c = 8192;
            long j10 = i11;
            c9995i.m38689P(size + j10);
            m38743j(c10012q0M38695V);
            this.f33566t = size;
            this.f33567u = c10012q0M38695V.f33616a;
            this.f33568v = 8192 - i11;
            this.f33569w = 8192;
            return j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33563q == null) {
                C10010p0.m38820a("not attached to a buffer");
                return;
            }
            this.f33563q = null;
            m38743j(null);
            this.f33566t = -1L;
            this.f33567u = null;
            this.f33568v = -1;
            this.f33569w = -1;
        }

        /* JADX INFO: renamed from: d */
        public final C10012q0 m38739d() {
            return this.f33565s;
        }

        /* JADX INFO: renamed from: e */
        public final int m38740e() {
            long j10 = this.f33566t;
            C9995i c9995i = this.f33563q;
            c9995i.getClass();
            if (j10 != c9995i.size()) {
                long j11 = this.f33566t;
                return j11 == -1 ? m38742h(0L) : m38742h(j11 + ((long) (this.f33569w - this.f33568v)));
            }
            C10010p0.m38820a("no more bytes");
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public final long m38741f(long j10) {
            C9995i c9995i = this.f33563q;
            if (c9995i == null) {
                C10010p0.m38820a("not attached to a buffer");
                return 0L;
            }
            if (!this.f33564r) {
                C10010p0.m38820a("resizeBuffer() only permitted for read/write buffers");
                return 0L;
            }
            long size = c9995i.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    C9991g.m38662a("newSize < 0: ", j10);
                    return 0L;
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    C10012q0 c10012q0 = c9995i.f33561q;
                    c10012q0.getClass();
                    C10012q0 c10012q02 = c10012q0.f33622g;
                    c10012q02.getClass();
                    int i10 = c10012q02.f33618c;
                    long j12 = i10 - c10012q02.f33617b;
                    if (j12 > j11) {
                        c10012q02.f33618c = i10 - ((int) j11);
                        break;
                    }
                    c9995i.f33561q = c10012q02.m38822b();
                    C10014r0.m38829b(c10012q02);
                    j11 -= j12;
                }
                m38743j(null);
                this.f33566t = j10;
                this.f33567u = null;
                this.f33568v = -1;
                this.f33569w = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    C10012q0 c10012q0M38695V = c9995i.m38695V(1);
                    int iMin = (int) Math.min(j13, 8192 - c10012q0M38695V.f33618c);
                    c10012q0M38695V.f33618c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        m38743j(c10012q0M38695V);
                        this.f33566t = size;
                        this.f33567u = c10012q0M38695V.f33616a;
                        int i11 = c10012q0M38695V.f33618c;
                        this.f33568v = i11 - iMin;
                        this.f33569w = i11;
                        z10 = false;
                    }
                }
            }
            c9995i.m38689P(j10);
            return size;
        }

        /* JADX INFO: renamed from: h */
        public final int m38742h(long j10) {
            C10012q0 c10012q0M38823c;
            C9995i c9995i = this.f33563q;
            if (c9995i == null) {
                C10010p0.m38820a("not attached to a buffer");
                return 0;
            }
            if (j10 < -1 || j10 > c9995i.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c9995i.size());
            }
            if (j10 == -1 || j10 == c9995i.size()) {
                m38743j(null);
                this.f33566t = j10;
                this.f33567u = null;
                this.f33568v = -1;
                this.f33569w = -1;
                return -1;
            }
            long size = c9995i.size();
            C10012q0 c10012q0M38739d = c9995i.f33561q;
            long j11 = 0;
            if (m38739d() != null) {
                long j12 = this.f33566t;
                int i10 = this.f33568v;
                C10012q0 c10012q0M38739d2 = m38739d();
                c10012q0M38739d2.getClass();
                long j13 = j12 - ((long) (i10 - c10012q0M38739d2.f33617b));
                if (j13 > j10) {
                    c10012q0M38823c = c10012q0M38739d;
                    c10012q0M38739d = m38739d();
                    size = j13;
                } else {
                    c10012q0M38823c = m38739d();
                    j11 = j13;
                }
            } else {
                c10012q0M38823c = c10012q0M38739d;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    c10012q0M38823c.getClass();
                    int i11 = c10012q0M38823c.f33618c;
                    int i12 = c10012q0M38823c.f33617b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    c10012q0M38823c = c10012q0M38823c.f33621f;
                }
            } else {
                while (size > j10) {
                    c10012q0M38739d.getClass();
                    c10012q0M38739d = c10012q0M38739d.f33622g;
                    c10012q0M38739d.getClass();
                    size -= (long) (c10012q0M38739d.f33618c - c10012q0M38739d.f33617b);
                }
                j11 = size;
                c10012q0M38823c = c10012q0M38739d;
            }
            if (this.f33564r) {
                c10012q0M38823c.getClass();
                if (c10012q0M38823c.f33619d) {
                    C10012q0 c10012q0M38826f = c10012q0M38823c.m38826f();
                    if (c9995i.f33561q == c10012q0M38823c) {
                        c9995i.f33561q = c10012q0M38826f;
                    }
                    c10012q0M38823c = c10012q0M38823c.m38823c(c10012q0M38826f);
                    C10012q0 c10012q0 = c10012q0M38823c.f33622g;
                    c10012q0.getClass();
                    c10012q0.m38822b();
                }
            }
            m38743j(c10012q0M38823c);
            this.f33566t = j10;
            c10012q0M38823c.getClass();
            this.f33567u = c10012q0M38823c.f33616a;
            int i13 = c10012q0M38823c.f33617b + ((int) (j10 - j11));
            this.f33568v = i13;
            int i14 = c10012q0M38823c.f33618c;
            this.f33569w = i14;
            return i14 - i13;
        }

        /* JADX INFO: renamed from: j */
        public final void m38743j(C10012q0 c10012q0) {
            this.f33565s = c10012q0;
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ a m38668F(C9995i c9995i, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC9978b.m38617d();
        }
        return c9995i.m38734x(aVar);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ C9995i m38669L0(C9995i c9995i, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c9995i.f33562r;
        }
        return c9995i.m38681J0(outputStream, j10);
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: A0 */
    public long mo38670A0(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        long j10 = 0;
        while (true) {
            long j11 = interfaceC10024w0.read(this, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: B0 */
    public long mo38671B0() {
        return AbstractC9978b.m38622i(readLong());
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: C */
    public byte[] mo38672C() {
        return m38677G(size());
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C9995i writeShort(int i10) {
        C10012q0 c10012q0M38695V = m38695V(2);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i11 = c10012q0M38695V.f33618c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        c10012q0M38695V.f33618c = i11 + 2;
        m38689P(size() + 2);
        return this;
    }

    /* JADX INFO: renamed from: E0 */
    public C9995i m38675E0(String str, int i10, int i11, Charset charset) {
        str.getClass();
        charset.getClass();
        if (i10 < 0) {
            C10030z0.m38853a("beginIndex < 0: ", i10);
            return null;
        }
        if (i11 < i10) {
            C10028y0.m38849a("endIndex < beginIndex: ", i11, " < ", i10);
            return null;
        }
        if (i11 > str.length()) {
            C10028y0.m38849a("endIndex > string.length: ", i11, " > ", str.length());
            return null;
        }
        if (AbstractC1061t.m3842c(charset, C8614c.f28652b)) {
            return mo38711i0(str, i10, i11);
        }
        byte[] bytes = str.substring(i10, i11).getBytes(charset);
        bytes.getClass();
        return write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: F0 */
    public C9995i m38676F0(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        return m38675E0(str, 0, str.length(), charset);
    }

    /* JADX INFO: renamed from: G */
    public byte[] m38677G(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            C9991g.m38662a("byteCount: ", j10);
            return null;
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[EDGE_INSN: B:43:0x0087->B:37:0x0087 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo38679I0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L91
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            zd.q0 r6 = r14.f33561q
            r6.getClass()
            byte[] r7 = r6.f33616a
            int r8 = r6.f33617b
            int r9 = r6.f33618c
        L18:
            if (r8 >= r9) goto L73
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            zd.i r0 = new zd.i
            r0.<init>()
            zd.i r0 = r0.mo38715k0(r4)
            zd.i r0 = r0.writeByte(r10)
            java.lang.String r1 = "Number too large: "
            java.lang.String r0 = r0.m38684L()
            p376zd.C9989f.m38655a(r1, r0)
        L62:
            r0 = 0
            return r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L73
        L69:
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = p376zd.AbstractC9978b.m38624k(r10)
            p376zd.C9989f.m38655a(r0, r1)
            goto L62
        L73:
            if (r8 != r9) goto L7f
            zd.q0 r7 = r6.m38822b()
            r14.f33561q = r7
            p376zd.C10014r0.m38829b(r6)
            goto L81
        L7f:
            r6.f33617b = r8
        L81:
            if (r1 != 0) goto L87
            zd.q0 r6 = r14.f33561q
            if (r6 != 0) goto Ld
        L87:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m38689P(r1)
            return r4
        L91:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p376zd.C9995i.mo38679I0():long");
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: J */
    public long mo38680J(C10003m c10003m, long j10, long j11) {
        c10003m.getClass();
        return AbstractC0302a.m898c(this, c10003m, j10, j11, 0, 0, 24, null);
    }

    /* JADX INFO: renamed from: J0 */
    public final C9995i m38681J0(OutputStream outputStream, long j10) throws IOException {
        outputStream.getClass();
        AbstractC9978b.m38615b(this.f33562r, 0L, j10);
        C10012q0 c10012q0 = this.f33561q;
        long j11 = j10;
        while (j11 > 0) {
            c10012q0.getClass();
            int iMin = (int) Math.min(j11, c10012q0.f33618c - c10012q0.f33617b);
            outputStream.write(c10012q0.f33616a, c10012q0.f33617b, iMin);
            int i10 = c10012q0.f33617b + iMin;
            c10012q0.f33617b = i10;
            long j12 = iMin;
            this.f33562r -= j12;
            j11 -= j12;
            if (i10 == c10012q0.f33618c) {
                C10012q0 c10012q0M38822b = c10012q0.m38822b();
                this.f33561q = c10012q0M38822b;
                C10014r0.m38829b(c10012q0);
                c10012q0 = c10012q0M38822b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: K */
    public String m38682K(long j10, Charset charset) throws EOFException {
        charset.getClass();
        if (j10 < 0 || j10 > 2147483647L) {
            C9991g.m38662a("byteCount: ", j10);
            return null;
        }
        if (this.f33562r < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33617b;
        if (((long) i10) + j10 > c10012q0.f33618c) {
            return new String(m38677G(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c10012q0.f33616a, i10, i11, charset);
        int i12 = c10012q0.f33617b + i11;
        c10012q0.f33617b = i12;
        this.f33562r -= j10;
        if (i12 == c10012q0.f33618c) {
            this.f33561q = c10012q0.m38822b();
            C10014r0.m38829b(c10012q0);
        }
        return str;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: K0 */
    public InputStream mo38683K0() {
        return new b();
    }

    /* JADX INFO: renamed from: L */
    public String m38684L() {
        return m38682K(this.f33562r, C8614c.f28652b);
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38698a0(String str) {
        str.getClass();
        return mo38711i0(str, 0, str.length());
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38711i0(String str, int i10, int i11) {
        char cCharAt;
        str.getClass();
        if (i10 < 0) {
            C10030z0.m38853a("beginIndex < 0: ", i10);
            return null;
        }
        if (i11 < i10) {
            C10028y0.m38849a("endIndex < beginIndex: ", i11, " < ", i10);
            return null;
        }
        if (i11 > str.length()) {
            C10028y0.m38849a("endIndex > string.length: ", i11, " > ", str.length());
            return null;
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                C10012q0 c10012q0M38695V = m38695V(1);
                byte[] bArr = c10012q0M38695V.f33616a;
                int i12 = c10012q0M38695V.f33618c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = c10012q0M38695V.f33618c;
                int i15 = (i12 + i10) - i14;
                c10012q0M38695V.f33618c = i14 + i15;
                m38689P(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    C10012q0 c10012q0M38695V2 = m38695V(2);
                    byte[] bArr2 = c10012q0M38695V2.f33616a;
                    int i16 = c10012q0M38695V2.f33618c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c10012q0M38695V2.f33618c = i16 + 2;
                    m38689P(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C10012q0 c10012q0M38695V3 = m38695V(3);
                    byte[] bArr3 = c10012q0M38695V3.f33616a;
                    int i17 = c10012q0M38695V3.f33618c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c10012q0M38695V3.f33618c = i17 + 3;
                    m38689P(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C10012q0 c10012q0M38695V4 = m38695V(4);
                        byte[] bArr4 = c10012q0M38695V4.f33616a;
                        int i20 = c10012q0M38695V4.f33618c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        c10012q0M38695V4.f33618c = i20 + 4;
                        m38689P(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: O */
    public int mo38687O(C9996i0 c9996i0) throws EOFException {
        c9996i0.getClass();
        int iM905j = AbstractC0302a.m905j(this, c9996i0, false, 2, null);
        if (iM905j == -1) {
            return -1;
        }
        skip(c9996i0.m38746o()[iM905j].m38765G());
        return iM905j;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38732w(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            C10012q0 c10012q0M38695V = m38695V(2);
            byte[] bArr = c10012q0M38695V.f33616a;
            int i11 = c10012q0M38695V.f33618c;
            bArr[i11] = (byte) ((i10 >> 6) | Opcodes.CHECKCAST);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            c10012q0M38695V.f33618c = i11 + 2;
            m38689P(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            C10012q0 c10012q0M38695V2 = m38695V(3);
            byte[] bArr2 = c10012q0M38695V2.f33616a;
            int i12 = c10012q0M38695V2.f33618c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            c10012q0M38695V2.f33618c = i12 + 3;
            m38689P(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            C9993h.m38666a("Unexpected code point: 0x", AbstractC9978b.m38625l(i10));
            return null;
        }
        C10012q0 c10012q0M38695V3 = m38695V(4);
        byte[] bArr3 = c10012q0M38695V3.f33616a;
        int i13 = c10012q0M38695V3.f33618c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        c10012q0M38695V3.f33618c = i13 + 4;
        m38689P(size() + 4);
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m38689P(long j10) {
        this.f33562r = j10;
    }

    /* JADX INFO: renamed from: R */
    public final C10003m m38691R() {
        if (size() <= 2147483647L) {
            return m38693T((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new p376zd.C9995i().m38713j0(r8).m38704d0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        p376zd.C9989f.m38655a("Number too large: ", r1.m38684L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return 0;
     */
    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo38692S() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p376zd.C9995i.mo38692S():long");
    }

    /* JADX INFO: renamed from: T */
    public final C10003m m38693T(int i10) {
        if (i10 == 0) {
            return C10003m.f33583u;
        }
        AbstractC9978b.m38615b(size(), 0L, i10);
        C10012q0 c10012q0 = this.f33561q;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            c10012q0.getClass();
            int i14 = c10012q0.f33618c;
            int i15 = c10012q0.f33617b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c10012q0 = c10012q0.f33621f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        C10012q0 c10012q02 = this.f33561q;
        int i16 = 0;
        while (i11 < i10) {
            c10012q02.getClass();
            bArr[i16] = c10012q02.f33616a;
            i11 += c10012q02.f33618c - c10012q02.f33617b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c10012q02.f33617b;
            c10012q02.f33619d = true;
            i16++;
            c10012q02 = c10012q02.f33621f;
        }
        return new C10018t0(bArr, iArr);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: U */
    public String mo38694U(long j10) throws EOFException {
        if (j10 < 0) {
            C9991g.m38662a("limit < 0: ", j10);
            return null;
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jM38718m = m38718m((byte) 10, 0L, j11);
        if (jM38718m != -1) {
            return AbstractC0302a.m903h(this, jM38718m);
        }
        if (j11 < size() && m38716l(j11 - 1) == 13 && m38716l(j11) == 10) {
            return AbstractC0302a.m903h(this, j11);
        }
        C9995i c9995i = new C9995i();
        m38712j(c9995i, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c9995i.mo38717l0().mo38782p() + (char) 8230);
    }

    /* JADX INFO: renamed from: V */
    public final C10012q0 m38695V(int i10) {
        if (i10 < 1 || i10 > 8192) {
            C9987e.m38645a("unexpected capacity");
            return null;
        }
        C10012q0 c10012q0 = this.f33561q;
        if (c10012q0 != null) {
            c10012q0.getClass();
            C10012q0 c10012q02 = c10012q0.f33622g;
            c10012q02.getClass();
            return (c10012q02.f33618c + i10 > 8192 || !c10012q02.f33620e) ? c10012q02.m38823c(C10014r0.m38830c()) : c10012q02;
        }
        C10012q0 c10012q0M38830c = C10014r0.m38830c();
        this.f33561q = c10012q0M38830c;
        c10012q0M38830c.f33622g = c10012q0M38830c;
        c10012q0M38830c.f33621f = c10012q0M38830c;
        return c10012q0M38830c;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C9995i mo38736y0(C10003m c10003m) {
        c10003m.getClass();
        c10003m.mo38771N(this, 0, c10003m.m38765G());
        return this;
    }

    /* JADX INFO: renamed from: X */
    public C9995i m38697X(InterfaceC10024w0 interfaceC10024w0, long j10) throws EOFException {
        interfaceC10024w0.getClass();
        while (j10 > 0) {
            long j11 = interfaceC10024w0.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C9995i write(byte[] bArr) {
        bArr.getClass();
        return write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public final void m38701c() throws EOFException {
        skip(size());
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C9995i write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        long j10 = i11;
        AbstractC9978b.m38615b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C10012q0 c10012q0M38695V = m38695V(1);
            int iMin = Math.min(i12 - i10, 8192 - c10012q0M38695V.f33618c);
            int i13 = i10 + iMin;
            AbstractC5102r.m20655g(bArr, c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, i10, i13);
            c10012q0M38695V.f33618c += iMin;
            i10 = i13;
        }
        m38689P(size() + j10);
        return this;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9995i clone() {
        return m38708h();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C9995i writeByte(int i10) {
        C10012q0 c10012q0M38695V = m38695V(1);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i11 = c10012q0M38695V.f33618c;
        c10012q0M38695V.f33618c = i11 + 1;
        bArr[i11] = (byte) i10;
        m38689P(size() + 1);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9995i)) {
            return false;
        }
        C9995i c9995i = (C9995i) obj;
        if (size() != c9995i.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        C10012q0 c10012q02 = c9995i.f33561q;
        c10012q02.getClass();
        int i10 = c10012q0.f33617b;
        int i11 = c10012q02.f33617b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(c10012q0.f33618c - i10, c10012q02.f33618c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (c10012q0.f33616a[i10] != c10012q02.f33616a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == c10012q0.f33618c) {
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                i10 = c10012q0.f33617b;
            }
            if (i11 == c10012q02.f33618c) {
                c10012q02 = c10012q02.f33621f;
                c10012q02.getClass();
                i11 = c10012q02.f33617b;
            }
            j10 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final long m38705f() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        C10012q0 c10012q02 = c10012q0.f33622g;
        c10012q02.getClass();
        int i10 = c10012q02.f33618c;
        return (i10 >= 8192 || !c10012q02.f33620e) ? size : size - ((long) (i10 - c10012q02.f33617b));
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: f0 */
    public boolean mo38706f0(long j10, C10003m c10003m) {
        c10003m.getClass();
        return m38727t(j10, c10003m, 0, c10003m.m38765G());
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: g */
    public boolean mo38707g() {
        return this.f33562r == 0;
    }

    /* JADX INFO: renamed from: h */
    public final C9995i m38708h() {
        C9995i c9995i = new C9995i();
        if (size() == 0) {
            return c9995i;
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        C10012q0 c10012q0M38824d = c10012q0.m38824d();
        c9995i.f33561q = c10012q0M38824d;
        c10012q0M38824d.f33622g = c10012q0M38824d;
        c10012q0M38824d.f33621f = c10012q0M38824d;
        for (C10012q0 c10012q02 = c10012q0.f33621f; c10012q02 != c10012q0; c10012q02 = c10012q02.f33621f) {
            C10012q0 c10012q03 = c10012q0M38824d.f33622g;
            c10012q03.getClass();
            c10012q02.getClass();
            c10012q03.m38823c(c10012q02.m38824d());
        }
        c9995i.m38689P(size());
        return c9995i;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: h0 */
    public int mo38709h0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bM38716l = m38716l(0L);
        if ((bM38716l & 128) == 0) {
            i10 = bM38716l & JSONB.Constants.BC_SYMBOL;
            i12 = 0;
            i11 = 1;
        } else if ((bM38716l & 224) == 192) {
            i10 = bM38716l & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bM38716l & JSONB.Constants.BC_INT32_NUM_MIN) == 224) {
            i10 = bM38716l & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bM38716l & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bM38716l & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + AbstractC9978b.m38624k(bM38716l) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bM38716l2 = m38716l(j11);
            if ((bM38716l2 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bM38716l2 & JSONB.Constants.BC_INT32_BYTE_MAX);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    public int hashCode() {
        C10012q0 c10012q0 = this.f33561q;
        if (c10012q0 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c10012q0.f33618c;
            for (int i12 = c10012q0.f33617b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c10012q0.f33616a[i12];
            }
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
        } while (c10012q0 != this.f33561q);
        return i10;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: i */
    public boolean mo38710i(long j10) {
        return this.f33562r >= j10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final C9995i m38712j(C9995i c9995i, long j10, long j11) {
        c9995i.getClass();
        long j12 = j10;
        AbstractC9978b.m38615b(size(), j12, j11);
        if (j11 != 0) {
            c9995i.m38689P(c9995i.size() + j11);
            C10012q0 c10012q0 = this.f33561q;
            while (true) {
                c10012q0.getClass();
                int i10 = c10012q0.f33618c;
                int i11 = c10012q0.f33617b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                c10012q0 = c10012q0.f33621f;
            }
            C10012q0 c10012q02 = c10012q0;
            long j13 = j11;
            while (j13 > 0) {
                c10012q02.getClass();
                C10012q0 c10012q0M38824d = c10012q02.m38824d();
                int i12 = c10012q0M38824d.f33617b + ((int) j12);
                c10012q0M38824d.f33617b = i12;
                c10012q0M38824d.f33618c = Math.min(i12 + ((int) j13), c10012q0M38824d.f33618c);
                C10012q0 c10012q03 = c9995i.f33561q;
                if (c10012q03 == null) {
                    c10012q0M38824d.f33622g = c10012q0M38824d;
                    c10012q0M38824d.f33621f = c10012q0M38824d;
                    c9995i.f33561q = c10012q0M38824d;
                } else {
                    c10012q03.getClass();
                    C10012q0 c10012q04 = c10012q03.f33622g;
                    c10012q04.getClass();
                    c10012q04.m38823c(c10012q0M38824d);
                }
                j13 -= (long) (c10012q0M38824d.f33618c - c10012q0M38824d.f33617b);
                c10012q02 = c10012q02.f33621f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38678H0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return mo38698a0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iM900e = AbstractC0302a.m900e(j10);
        if (z10) {
            iM900e++;
        }
        C10012q0 c10012q0M38695V = m38695V(iM900e);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i10 = c10012q0M38695V.f33618c + iM900e;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = AbstractC0302a.m901f()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        c10012q0M38695V.f33618c += iM900e;
        m38689P(size() + ((long) iM900e));
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final byte m38716l(long j10) {
        AbstractC9978b.m38615b(size(), j10, 1L);
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                c10012q0 = c10012q0.f33622g;
                c10012q0.getClass();
                size -= (long) (c10012q0.f33618c - c10012q0.f33617b);
            }
            return c10012q0.f33616a[(int) ((((long) c10012q0.f33617b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            int i10 = c10012q0.f33618c;
            int i11 = c10012q0.f33617b;
            long j12 = ((long) (i10 - i11)) + j11;
            if (j12 > j10) {
                return c10012q0.f33616a[(int) ((((long) i11) + j10) - j11)];
            }
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            j11 = j12;
        }
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: l0 */
    public C10003m mo38717l0() {
        return mo38729u(size());
    }

    /* JADX INFO: renamed from: m */
    public long m38718m(byte b10, long j10, long j11) {
        C10012q0 c10012q0;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (c10012q0 = this.f33561q) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                c10012q0 = c10012q0.f33622g;
                c10012q0.getClass();
                size -= (long) (c10012q0.f33618c - c10012q0.f33617b);
            }
            while (size < j11) {
                byte[] bArr = c10012q0.f33616a;
                int iMin = (int) Math.min(c10012q0.f33618c, (((long) c10012q0.f33617b) + j11) - size);
                i10 = (int) ((((long) c10012q0.f33617b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (c10012q0.f33618c - c10012q0.f33617b);
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (c10012q0.f33618c - c10012q0.f33617b)) + size;
            if (j12 > j10) {
                break;
            }
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = c10012q0.f33616a;
            int iMin2 = (int) Math.min(c10012q0.f33618c, (((long) c10012q0.f33617b) + j11) - size);
            i10 = (int) ((((long) c10012q0.f33617b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (c10012q0.f33618c - c10012q0.f33617b);
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - c10012q0.f33617b)) + size;
    }

    /* JADX INFO: renamed from: n */
    public long m38719n(C10003m c10003m) {
        c10003m.getClass();
        return m38722q(c10003m, 0L);
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38715k0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C10012q0 c10012q0M38695V = m38695V(i10);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i11 = c10012q0M38695V.f33618c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = AbstractC0302a.m901f()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        c10012q0M38695V.f33618c += i10;
        m38689P(size() + ((long) i10));
        return this;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: o */
    public void mo38721o(long j10) throws EOFException {
        if (this.f33562r < j10) {
            throw new EOFException();
        }
    }

    @Override // p376zd.InterfaceC9999k
    public InterfaceC9999k peek() {
        return AbstractC9988e0.m38648c(new C10002l0(this));
    }

    /* JADX INFO: renamed from: q */
    public long m38722q(C10003m c10003m, long j10) {
        c10003m.getClass();
        long j11 = 0;
        if (j10 < 0) {
            C9991g.m38662a("fromIndex < 0: ", j10);
            return 0L;
        }
        C10012q0 c10012q0 = this.f33561q;
        if (c10012q0 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                c10012q0 = c10012q0.f33622g;
                c10012q0.getClass();
                size -= (long) (c10012q0.f33618c - c10012q0.f33617b);
            }
            if (c10003m.m38765G() == 2) {
                byte bM38777j = c10003m.m38777j(0);
                byte bM38777j2 = c10003m.m38777j(1);
                while (size < size()) {
                    byte[] bArr = c10012q0.f33616a;
                    int i10 = c10012q0.f33618c;
                    for (int i11 = (int) ((((long) c10012q0.f33617b) + j10) - size); i11 < i10; i11++) {
                        byte b10 = bArr[i11];
                        if (b10 == bM38777j || b10 == bM38777j2) {
                            return ((long) (i11 - c10012q0.f33617b)) + size;
                        }
                    }
                    size += (long) (c10012q0.f33618c - c10012q0.f33617b);
                    c10012q0 = c10012q0.f33621f;
                    c10012q0.getClass();
                    j10 = size;
                }
            } else {
                byte[] bArrMo38785u = c10003m.mo38785u();
                while (size < size()) {
                    byte[] bArr2 = c10012q0.f33616a;
                    int i12 = c10012q0.f33618c;
                    for (int i13 = (int) ((((long) c10012q0.f33617b) + j10) - size); i13 < i12; i13++) {
                        byte b11 = bArr2[i13];
                        for (byte b12 : bArrMo38785u) {
                            if (b11 == b12) {
                                return ((long) (i13 - c10012q0.f33617b)) + size;
                            }
                        }
                    }
                    size += (long) (c10012q0.f33618c - c10012q0.f33617b);
                    c10012q0 = c10012q0.f33621f;
                    c10012q0.getClass();
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (c10012q0.f33618c - c10012q0.f33617b)) + j11;
            if (j12 > j10) {
                break;
            }
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            j11 = j12;
        }
        if (c10003m.m38765G() == 2) {
            byte bM38777j3 = c10003m.m38777j(0);
            byte bM38777j4 = c10003m.m38777j(1);
            while (j11 < size()) {
                byte[] bArr3 = c10012q0.f33616a;
                int i14 = c10012q0.f33618c;
                for (int i15 = (int) ((((long) c10012q0.f33617b) + j10) - j11); i15 < i14; i15++) {
                    byte b13 = bArr3[i15];
                    if (b13 == bM38777j3 || b13 == bM38777j4) {
                        return ((long) (i15 - c10012q0.f33617b)) + j11;
                    }
                }
                j11 += (long) (c10012q0.f33618c - c10012q0.f33617b);
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                j10 = j11;
            }
        } else {
            byte[] bArrMo38785u2 = c10003m.mo38785u();
            while (j11 < size()) {
                byte[] bArr4 = c10012q0.f33616a;
                int i16 = c10012q0.f33618c;
                for (int i17 = (int) ((((long) c10012q0.f33617b) + j10) - j11); i17 < i16; i17++) {
                    byte b14 = bArr4[i17];
                    for (byte b15 : bArrMo38785u2) {
                        if (b14 == b15) {
                            return ((long) (i17 - c10012q0.f33617b)) + j11;
                        }
                    }
                }
                j11 += (long) (c10012q0.f33618c - c10012q0.f33617b);
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                j10 = j11;
            }
        }
        return -1L;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C9995i writeInt(int i10) {
        C10012q0 c10012q0M38695V = m38695V(4);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i11 = c10012q0M38695V.f33618c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        c10012q0M38695V.f33618c = i11 + 4;
        m38689P(size() + 4);
        return this;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: r */
    public void mo38724r(C9995i c9995i, long j10) throws EOFException {
        c9995i.getClass();
        if (size() >= j10) {
            c9995i.write(this, j10);
        } else {
            c9995i.write(this, size());
            throw new EOFException();
        }
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38674E(int i10) {
        return writeInt(AbstractC9978b.m38621h(i10));
    }

    public int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC9978b.m38615b(bArr.length, i10, i11);
        C10012q0 c10012q0 = this.f33561q;
        if (c10012q0 == null) {
            return -1;
        }
        int iMin = Math.min(i11, c10012q0.f33618c - c10012q0.f33617b);
        byte[] bArr2 = c10012q0.f33616a;
        int i12 = c10012q0.f33617b;
        AbstractC5102r.m20655g(bArr2, bArr, i10, i12, i12 + iMin);
        c10012q0.f33617b += iMin;
        m38689P(size() - ((long) iMin));
        if (c10012q0.f33617b == c10012q0.f33618c) {
            this.f33561q = c10012q0.m38822b();
            C10014r0.m38829b(c10012q0);
        }
        return iMin;
    }

    @Override // p376zd.InterfaceC9999k
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33617b;
        int i11 = c10012q0.f33618c;
        int i12 = i10 + 1;
        byte b10 = c10012q0.f33616a[i10];
        m38689P(size() - 1);
        if (i12 != i11) {
            c10012q0.f33617b = i12;
            return b10;
        }
        this.f33561q = c10012q0.m38822b();
        C10014r0.m38829b(c10012q0);
        return b10;
    }

    @Override // p376zd.InterfaceC9999k
    public void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // p376zd.InterfaceC9999k
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33617b;
        int i11 = c10012q0.f33618c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c10012q0.f33616a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        m38689P(size() - 4);
        if (i14 != i11) {
            c10012q0.f33617b = i14;
            return i15;
        }
        this.f33561q = c10012q0.m38822b();
        C10014r0.m38829b(c10012q0);
        return i15;
    }

    @Override // p376zd.InterfaceC9999k
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33617b;
        int i11 = c10012q0.f33618c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c10012q0.f33616a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        m38689P(size() - 8);
        if (i13 != i11) {
            c10012q0.f33617b = i13;
            return j11;
        }
        this.f33561q = c10012q0.m38822b();
        C10014r0.m38829b(c10012q0);
        return j11;
    }

    @Override // p376zd.InterfaceC9999k
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        C10012q0 c10012q0 = this.f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33617b;
        int i11 = c10012q0.f33618c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c10012q0.f33616a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        m38689P(size() - 2);
        if (i14 == i11) {
            this.f33561q = c10012q0.m38822b();
            C10014r0.m38829b(c10012q0);
        } else {
            c10012q0.f33617b = i14;
        }
        return (short) i15;
    }

    @Override // p376zd.InterfaceC9999k
    public String readString(Charset charset) {
        charset.getClass();
        return m38682K(this.f33562r, charset);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: s */
    public String mo38726s(long j10) throws EOFException {
        return m38682K(j10, C8614c.f28652b);
    }

    public final long size() {
        return this.f33562r;
    }

    @Override // p376zd.InterfaceC9999k
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            C10012q0 c10012q0 = this.f33561q;
            if (c10012q0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, c10012q0.f33618c - c10012q0.f33617b);
            long j11 = iMin;
            m38689P(size() - j11);
            j10 -= j11;
            int i10 = c10012q0.f33617b + iMin;
            c10012q0.f33617b = i10;
            if (i10 == c10012q0.f33618c) {
                this.f33561q = c10012q0.m38822b();
                C10014r0.m38829b(c10012q0);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m38727t(long j10, C10003m c10003m, int i10, int i11) {
        c10003m.getClass();
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= size() && i10 >= 0 && i10 + i11 <= c10003m.m38765G() && (i11 == 0 || AbstractC0302a.m897b(this, c10003m, j10, j10 + 1, i10, i11) != -1);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: t0 */
    public String mo38728t0() {
        return mo38694U(Long.MAX_VALUE);
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return C10026x0.NONE;
    }

    public String toString() {
        return m38691R().toString();
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: u */
    public C10003m mo38729u(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            C9991g.m38662a("byteCount: ", j10);
            return null;
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) {
            return new C10003m(m38677G(j10));
        }
        C10003m c10003mM38693T = m38693T((int) j10);
        skip(j10);
        return c10003mM38693T;
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: u0 */
    public int mo38730u0() {
        return AbstractC9978b.m38621h(readInt());
    }

    /* JADX INFO: renamed from: v0 */
    public C9995i m38731v0(long j10) {
        C10012q0 c10012q0M38695V = m38695V(8);
        byte[] bArr = c10012q0M38695V.f33616a;
        int i10 = c10012q0M38695V.f33618c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        c10012q0M38695V.f33618c = i10 + 8;
        m38689P(size() + 8);
        return this;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C9995i mo38737z(long j10) {
        return m38731v0(AbstractC9978b.m38622i(j10));
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) {
        C10012q0 c10012q0;
        c9995i.getClass();
        if (c9995i == this) {
            C9987e.m38645a("source == this");
            return;
        }
        AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
        while (j10 > 0) {
            C10012q0 c10012q02 = c9995i.f33561q;
            c10012q02.getClass();
            int i10 = c10012q02.f33618c;
            c9995i.f33561q.getClass();
            if (j10 < i10 - r1.f33617b) {
                C10012q0 c10012q03 = this.f33561q;
                if (c10012q03 != null) {
                    c10012q03.getClass();
                    c10012q0 = c10012q03.f33622g;
                } else {
                    c10012q0 = null;
                }
                if (c10012q0 != null && c10012q0.f33620e) {
                    if ((((long) c10012q0.f33618c) + j10) - ((long) (c10012q0.f33619d ? 0 : c10012q0.f33617b)) <= JSONWriter.MASK_WRITE_ENUMS_USING_NAME) {
                        C10012q0 c10012q04 = c9995i.f33561q;
                        c10012q04.getClass();
                        c10012q04.m38827g(c10012q0, (int) j10);
                        c9995i.m38689P(c9995i.size() - j10);
                        m38689P(size() + j10);
                        return;
                    }
                }
                C10012q0 c10012q05 = c9995i.f33561q;
                c10012q05.getClass();
                c9995i.f33561q = c10012q05.m38825e((int) j10);
            }
            C10012q0 c10012q06 = c9995i.f33561q;
            c10012q06.getClass();
            long j11 = c10012q06.f33618c - c10012q06.f33617b;
            c9995i.f33561q = c10012q06.m38822b();
            C10012q0 c10012q07 = this.f33561q;
            if (c10012q07 == null) {
                this.f33561q = c10012q06;
                c10012q06.f33622g = c10012q06;
                c10012q06.f33621f = c10012q06;
            } else {
                c10012q07.getClass();
                C10012q0 c10012q08 = c10012q07.f33622g;
                c10012q08.getClass();
                c10012q08.m38823c(c10012q06).m38821a();
            }
            c9995i.m38689P(c9995i.size() - j11);
            m38689P(size() + j11);
            j10 -= j11;
        }
    }

    /* JADX INFO: renamed from: x */
    public final a m38734x(a aVar) {
        aVar.getClass();
        return AbstractC0302a.m899d(this, aVar);
    }

    @Override // p376zd.InterfaceC9999k
    /* JADX INFO: renamed from: x0 */
    public short mo38735x0() {
        return AbstractC9978b.m38623j(readShort());
    }

    /* JADX INFO: renamed from: zd.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C9995i.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C9995i.this.size() > 0) {
                return C9995i.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C9995i.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            return C9995i.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // p376zd.InterfaceC9999k, p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: b */
    public C9995i mo38699b() {
        return this;
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p376zd.InterfaceC9997j, p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() {
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C9995i mo38690Q() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C10012q0 c10012q0 = this.f33561q;
        if (c10012q0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c10012q0.f33618c - c10012q0.f33617b);
        byteBuffer.put(c10012q0.f33616a, c10012q0.f33617b, iMin);
        int i10 = c10012q0.f33617b + iMin;
        c10012q0.f33617b = i10;
        this.f33562r -= (long) iMin;
        if (i10 == c10012q0.f33618c) {
            this.f33561q = c10012q0.m38822b();
            C10014r0.m38829b(c10012q0);
        }
        return iMin;
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) {
        c9995i.getClass();
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return 0L;
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        c9995i.write(this, j10);
        return j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            C10012q0 c10012q0M38695V = m38695V(1);
            int iMin = Math.min(i10, 8192 - c10012q0M38695V.f33618c);
            byteBuffer.get(c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, iMin);
            i10 -= iMin;
            c10012q0M38695V.f33618c += iMin;
        }
        this.f33562r += (long) iRemaining;
        return iRemaining;
    }
}

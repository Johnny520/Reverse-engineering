package p376zd;

import com.alibaba.fastjson2.JSONWriter;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: zd.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10006n0 implements InterfaceC9997j {

    /* JADX INFO: renamed from: q */
    public final InterfaceC10020u0 f33592q;

    /* JADX INFO: renamed from: r */
    public final C9995i f33593r;

    /* JADX INFO: renamed from: s */
    public boolean f33594s;

    public C10006n0(InterfaceC10020u0 interfaceC10020u0) {
        interfaceC10020u0.getClass();
        this.f33592q = interfaceC10020u0;
        this.f33593r = new C9995i();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: A0 */
    public long mo38670A0(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        long j10 = 0;
        while (true) {
            long j11 = interfaceC10024w0.read(this.f33593r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            mo38690Q();
        }
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: E */
    public InterfaceC9997j mo38674E(int i10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38674E(i10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: H0 */
    public InterfaceC9997j mo38678H0(long j10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38678H0(j10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: Q */
    public InterfaceC9997j mo38690Q() {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        long jM38705f = this.f33593r.m38705f();
        if (jM38705f > 0) {
            this.f33592q.write(this.f33593r, jM38705f);
        }
        return this;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: a0 */
    public InterfaceC9997j mo38698a0(String str) {
        str.getClass();
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38698a0(str);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: b */
    public C9995i mo38699b() {
        return this.f33593r;
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f33594s) {
            return;
        }
        try {
            if (this.f33593r.size() > 0) {
                InterfaceC10020u0 interfaceC10020u0 = this.f33592q;
                C9995i c9995i = this.f33593r;
                interfaceC10020u0.write(c9995i, c9995i.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f33592q.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f33594s = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p376zd.InterfaceC9997j, p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return;
        }
        if (this.f33593r.size() > 0) {
            InterfaceC10020u0 interfaceC10020u0 = this.f33592q;
            C9995i c9995i = this.f33593r;
            interfaceC10020u0.write(c9995i, c9995i.size());
        }
        this.f33592q.flush();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: i0 */
    public InterfaceC9997j mo38711i0(String str, int i10, int i11) {
        str.getClass();
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38711i0(str, i10, i11);
        return mo38690Q();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33594s;
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: k0 */
    public InterfaceC9997j mo38715k0(long j10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38715k0(j10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return this.f33592q.timeout();
    }

    public String toString() {
        return "buffer(" + this.f33592q + ')';
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: w */
    public InterfaceC9997j mo38732w(int i10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38732w(i10);
        return mo38690Q();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return 0;
        }
        int iWrite = this.f33593r.write(byteBuffer);
        mo38690Q();
        return iWrite;
    }

    @Override // p376zd.InterfaceC9997j
    public InterfaceC9997j writeByte(int i10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.writeByte(i10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    public InterfaceC9997j writeInt(int i10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.writeInt(i10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    public InterfaceC9997j writeShort(int i10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.writeShort(i10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: y0 */
    public InterfaceC9997j mo38736y0(C10003m c10003m) {
        c10003m.getClass();
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38736y0(c10003m);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC9997j
    /* JADX INFO: renamed from: z */
    public InterfaceC9997j mo38737z(long j10) {
        if (this.f33594s) {
            C10010p0.m38820a("closed");
            return null;
        }
        this.f33593r.mo38737z(j10);
        return mo38690Q();
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) {
        c9995i.getClass();
        if (!this.f33594s) {
            this.f33593r.write(c9995i, j10);
            mo38690Q();
        } else {
            C10010p0.m38820a("closed");
        }
    }

    @Override // p376zd.InterfaceC9997j
    public InterfaceC9997j write(byte[] bArr) {
        bArr.getClass();
        if (!this.f33594s) {
            this.f33593r.write(bArr);
            return mo38690Q();
        }
        C10010p0.m38820a("closed");
        return null;
    }

    @Override // p376zd.InterfaceC9997j
    public InterfaceC9997j write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (!this.f33594s) {
            this.f33593r.write(bArr, i10, i11);
            return mo38690Q();
        }
        C10010p0.m38820a("closed");
        return null;
    }
}

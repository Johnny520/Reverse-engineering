package p215oc;

import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import p376zd.C10010p0;
import p376zd.C9991g;

/* JADX INFO: renamed from: oc.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5719n implements InterfaceC5728w {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5718m f18045q;

    /* JADX INFO: renamed from: r */
    public boolean f18046r;

    /* JADX INFO: renamed from: s */
    public final C5708d f18047s;

    public C5719n(InterfaceC5718m interfaceC5718m) {
        interfaceC5718m.getClass();
        this.f18045q = interfaceC5718m;
        this.f18047s = new C5708d();
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: D */
    public long mo23095D(InterfaceC5717l interfaceC5717l) {
        C5708d c5708d;
        interfaceC5717l.getClass();
        long j10 = 0;
        while (true) {
            long jMo23100N = this.f18045q.mo23100N(this.f18047s, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            c5708d = this.f18047s;
            if (jMo23100N == -1) {
                break;
            }
            long jM23104d = c5708d.m23104d();
            if (jM23104d > 0) {
                j10 += jM23104d;
                interfaceC5717l.mo23106e0(this.f18047s, jM23104d);
            }
        }
        if (c5708d.m23111j() <= 0) {
            return j10;
        }
        long jM23111j = j10 + this.f18047s.m23111j();
        C5708d c5708d2 = this.f18047s;
        interfaceC5717l.mo23106e0(c5708d2, c5708d2.m23111j());
        return jM23111j;
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: H */
    public int mo23098H(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC5709d0.m23124a(bArr.length, i10, i11);
        if (this.f18047s.m23111j() == 0 && this.f18045q.mo23100N(this.f18047s, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
            return -1;
        }
        return this.f18047s.mo23098H(bArr, i10, ((int) Math.min(i11 - i10, this.f18047s.m23111j())) + i10);
    }

    @Override // p215oc.InterfaceC5718m
    /* JADX INFO: renamed from: N */
    public long mo23100N(C5708d c5708d, long j10) {
        c5708d.getClass();
        if (this.f18046r) {
            C10010p0.m38820a("Source is closed.");
            return 0L;
        }
        if (j10 < 0) {
            C9991g.m38662a("byteCount: ", j10);
            return 0L;
        }
        if (this.f18047s.m23111j() == 0 && this.f18045q.mo23100N(this.f18047s, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
            return -1L;
        }
        return this.f18047s.mo23100N(c5708d, Math.min(j10, this.f18047s.m23111j()));
    }

    @Override // p215oc.InterfaceC5728w, p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: b */
    public C5708d mo23102b() {
        return this.f18047s;
    }

    @Override // p215oc.InterfaceC5718m, java.lang.AutoCloseable, p215oc.InterfaceC5717l
    public void close() throws EOFException {
        if (this.f18046r) {
            return;
        }
        this.f18046r = true;
        this.f18045q.close();
        this.f18047s.m23103c();
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: g */
    public boolean mo23108g() {
        if (!this.f18046r) {
            return this.f18047s.mo23108g() && this.f18045q.mo23100N(this.f18047s, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1;
        }
        C10010p0.m38820a("Source is closed.");
        return false;
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: i */
    public boolean mo23110i(long j10) {
        if (this.f18046r) {
            C10010p0.m38820a("Source is closed.");
            return false;
        }
        if (j10 < 0) {
            C9991g.m38662a("byteCount: ", j10);
            return false;
        }
        while (this.f18047s.m23111j() < j10) {
            if (this.f18045q.mo23100N(this.f18047s, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: o */
    public void mo23116o(long j10) throws EOFException {
        if (mo23110i(j10)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j10 + ").");
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: o0 */
    public void mo23117o0(InterfaceC5717l interfaceC5717l, long j10) throws EOFException {
        interfaceC5717l.getClass();
        try {
            mo23116o(j10);
            this.f18047s.mo23117o0(interfaceC5717l, j10);
        } catch (EOFException e10) {
            interfaceC5717l.mo23106e0(this.f18047s, this.f18047s.m23111j());
            throw e10;
        }
    }

    @Override // p215oc.InterfaceC5728w
    public InterfaceC5728w peek() {
        if (!this.f18046r) {
            return AbstractC5713h.m23131a(new C5716k(this));
        }
        C10010p0.m38820a("Source is closed.");
        return null;
    }

    @Override // p215oc.InterfaceC5728w
    public byte readByte() throws EOFException {
        mo23116o(1L);
        return this.f18047s.readByte();
    }

    public String toString() {
        return "buffered(" + this.f18045q + ')';
    }
}

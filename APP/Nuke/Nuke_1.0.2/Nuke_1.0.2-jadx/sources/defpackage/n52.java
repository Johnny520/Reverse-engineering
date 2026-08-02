package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n52 implements nn {
    public final fr2 h;
    public final fn i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n52(fr2 fr2Var) {
        fr2Var.getClass();
        this.h = fr2Var;
        this.i = new fn();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final o23 a() {
        return this.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nn b() {
        if (this.j) {
            s.l("closed");
            return null;
        }
        fn fnVar = this.i;
        long jH = fnVar.h();
        if (jH > 0) {
            this.h.d(fnVar, jH);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fr2 fr2Var = this.h;
        if (this.j) {
            return;
        }
        try {
            fn fnVar = this.i;
            long j = fnVar.i;
            if (j > 0) {
                fr2Var.d(fnVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            fr2Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.j = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) {
        fnVar.getClass();
        if (this.j) {
            s.l("closed");
        } else {
            this.i.d(fnVar, j);
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn, defpackage.fr2, java.io.Flushable
    public final void flush() {
        if (this.j) {
            s.l("closed");
            return;
        }
        fn fnVar = this.i;
        long j = fnVar.i;
        fr2 fr2Var = this.h;
        if (j > 0) {
            fr2Var.d(fnVar, j);
        }
        fr2Var.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final fn l() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "buffer(" + this.h + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn w(int i, byte[] bArr) {
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.write(bArr, 0, i);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn write(byte[] bArr) {
        bArr.getClass();
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.write(bArr, 0, bArr.length);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn writeByte(int i) {
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.E(i);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn writeInt(int i) {
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.H(i);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn writeShort(int i) {
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.I(i);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn y(String str) {
        str.getClass();
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.J(str);
        b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final nn z(no noVar) {
        noVar.getClass();
        if (this.j) {
            s.l("closed");
            return null;
        }
        this.i.B(noVar);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.j) {
            int iWrite = this.i.write(byteBuffer);
            b();
            return iWrite;
        }
        s.l("closed");
        return 0;
    }
}

package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 implements fr2 {

    /* JADX INFO: renamed from: h */
    public final fr2 f11282h;

    /* JADX INFO: renamed from: i */
    public final long f11283i;

    /* JADX INFO: renamed from: j */
    public final boolean f11284j;

    /* JADX INFO: renamed from: k */
    public boolean f11285k;

    /* JADX INFO: renamed from: l */
    public long f11286l;

    /* JADX INFO: renamed from: m */
    public boolean f11287m;

    /* JADX INFO: renamed from: n */
    public boolean f11288n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ f90 f11289o;

    public ug0(f90 f90Var, fr2 fr2Var, long j, boolean z) {
        fr2Var.getClass();
        this.f11289o = f90Var;
        this.f11282h = fr2Var;
        this.f11283i = j;
        this.f11284j = z;
        this.f11287m = z;
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f11282h.mo1174a();
    }

    /* JADX INFO: renamed from: b */
    public final void m5489b() {
        this.f11282h.close();
    }

    /* JADX INFO: renamed from: c */
    public final IOException m5490c(IOException iOException) {
        if (this.f11285k) {
            return iOException;
        }
        this.f11285k = true;
        return f90.m1587b(this.f11289o, this.f11284j, iOException, 4);
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f11288n) {
            return;
        }
        this.f11288n = true;
        long j = this.f11283i;
        if (j != -1 && this.f11286l != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m5489b();
            m5490c(null);
        } catch (IOException e) {
            IOException iOExceptionM5490c = m5490c(e);
            iOExceptionM5490c.getClass();
            throw iOExceptionM5490c;
        }
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) throws IOException {
        if (this.f11288n) {
            C0676s.m4653l("closed");
            return;
        }
        long j2 = this.f11283i;
        if (j2 != -1 && this.f11286l + j > j2) {
            throw new ProtocolException("expected " + this.f11283i + " bytes but received " + (this.f11286l + j));
        }
        try {
            if (this.f11287m) {
                this.f11287m = false;
                ((s52) this.f11289o.f2863b).f9916k.getClass();
            }
            this.f11282h.mo1175d(c0209fn, j);
            this.f11286l += j;
        } catch (IOException e) {
            IOException iOExceptionM5490c = m5490c(e);
            iOExceptionM5490c.getClass();
            throw iOExceptionM5490c;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5491e() {
        this.f11282h.flush();
    }

    @Override // p000.fr2, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m5491e();
        } catch (IOException e) {
            IOException iOExceptionM5490c = m5490c(e);
            iOExceptionM5490c.getClass();
            throw iOExceptionM5490c;
        }
    }

    public final String toString() {
        return ug0.class.getSimpleName() + '(' + this.f11282h + ')';
    }
}

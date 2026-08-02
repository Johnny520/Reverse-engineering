package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vg0 extends sm0 {

    /* JADX INFO: renamed from: i */
    public final long f11938i;

    /* JADX INFO: renamed from: j */
    public final boolean f11939j;

    /* JADX INFO: renamed from: k */
    public long f11940k;

    /* JADX INFO: renamed from: l */
    public boolean f11941l;

    /* JADX INFO: renamed from: m */
    public boolean f11942m;

    /* JADX INFO: renamed from: n */
    public boolean f11943n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ f90 f11944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(f90 f90Var, ht2 ht2Var, long j, boolean z) {
        super(ht2Var);
        ht2Var.getClass();
        this.f11944o = f90Var;
        this.f11938i = j;
        this.f11939j = z;
        this.f11941l = true;
        if (j == 0) {
            m5672b(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final IOException m5672b(IOException iOException) {
        if (this.f11942m) {
            return iOException;
        }
        this.f11942m = true;
        if (iOException == null && this.f11941l) {
            this.f11941l = false;
            ((s52) this.f11944o.f2863b).f9916k.getClass();
        }
        return f90.m1587b(this.f11944o, this.f11939j, iOException, 8);
    }

    @Override // p000.sm0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f11943n) {
            return;
        }
        this.f11943n = true;
        try {
            super.close();
            m5672b(null);
        } catch (IOException e) {
            IOException iOExceptionM5672b = m5672b(e);
            iOExceptionM5672b.getClass();
            throw iOExceptionM5672b;
        }
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        c0209fn.getClass();
        if (this.f11943n) {
            C0676s.m4653l("closed");
            return 0L;
        }
        try {
            long jMo891n = this.f10190h.mo891n(c0209fn, 8192L);
            if (this.f11941l) {
                this.f11941l = false;
                ((s52) this.f11944o.f2863b).f9916k.getClass();
            }
            if (jMo891n == -1) {
                m5672b(null);
                return -1L;
            }
            long j2 = this.f11940k + jMo891n;
            long j3 = this.f11938i;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.f11938i + " bytes but received " + j2);
            }
            this.f11940k = j2;
            if (((xg0) this.f11944o.f2865d).mo2399d()) {
                m5672b(null);
            }
            return jMo891n;
        } catch (IOException e) {
            IOException iOExceptionM5672b = m5672b(e);
            iOExceptionM5672b.getClass();
            throw iOExceptionM5672b;
        }
    }
}

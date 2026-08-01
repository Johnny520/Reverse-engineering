package ae;

import java.io.EOFException;
import java.io.IOException;
import p107h6.C2884l;
import p376zd.AbstractC10017t;
import p376zd.C9995i;
import p376zd.InterfaceC10024w0;

/* JADX INFO: renamed from: ae.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0313l extends AbstractC10017t {

    /* JADX INFO: renamed from: q */
    public final long f783q;

    /* JADX INFO: renamed from: r */
    public final boolean f784r;

    /* JADX INFO: renamed from: s */
    public long f785s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313l(InterfaceC10024w0 interfaceC10024w0, long j10, boolean z10) {
        super(interfaceC10024w0);
        interfaceC10024w0.getClass();
        this.f783q = j10;
        this.f784r = z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m955c(C9995i c9995i, long j10) throws EOFException {
        C9995i c9995i2 = new C9995i();
        c9995i2.mo38670A0(c9995i);
        c9995i.write(c9995i2, j10);
        c9995i2.m38701c();
    }

    @Override // p376zd.AbstractC10017t, p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        long j11 = this.f785s;
        long j12 = this.f783q;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f784r) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(c9995i, j10);
        if (j14 != -1) {
            this.f785s += j14;
        }
        long j15 = this.f785s;
        long j16 = this.f783q;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            m955c(c9995i, c9995i.size() - (this.f785s - this.f783q));
        }
        C2884l.m10477a("expected ", this.f783q, " bytes but got ", this.f785s);
        return 0L;
    }
}

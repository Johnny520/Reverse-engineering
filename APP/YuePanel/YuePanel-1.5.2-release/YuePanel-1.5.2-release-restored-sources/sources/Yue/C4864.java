package Yue;

import java.io.IOException;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4864 extends AbstractC5068 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f11144;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f11145;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f11146;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4864(@InterfaceC6399 InterfaceC7506 interfaceC7506, long j, boolean z) {
        super(interfaceC7506);
        C5499.m17103(interfaceC7506, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f11144 = j;
        this.f11145 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m14888(C3600 c3600, long j) throws IOException {
        C3600 c36002 = new C3600();
        c36002.mo9610(c3600);
        c3600.mo9102(c36002, j);
        c36002.m9603();
    }

    @Override // Yue.AbstractC5068, Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        long j2 = this.f11146;
        long j3 = this.f11144;
        if (j2 > j3) {
            j = 0;
        } else if (this.f11145) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jMo9103 = super.mo9103(c3600, j);
        if (jMo9103 != -1) {
            this.f11146 += jMo9103;
        }
        long j5 = this.f11146;
        long j6 = this.f11144;
        if ((j5 >= j6 || jMo9103 != -1) && j5 <= j6) {
            return jMo9103;
        }
        if (jMo9103 > 0 && j5 > j6) {
            m14888(c3600, c3600.m9684() - (this.f11146 - this.f11144));
        }
        throw new IOException("expected " + this.f11144 + " bytes but got " + this.f11146);
    }
}

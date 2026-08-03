package p053df;

import bsh.org.objectweb.asm.Opcodes;
import java.io.IOException;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774b extends AbstractC0776d {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2844b f2329c = AbstractC2846d.m6274b(AbstractC0774b.class);

    /* JADX INFO: renamed from: b */
    public C0777e f2330b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0773a m1996b() {
        this.f2330b.m2003a(1, "String pool expected");
        C0777e c0777e = this.f2330b;
        long j3 = c0777e.f2340h - 2;
        int iM2005c = c0777e.m2005c();
        if (iM2005c != 28) {
            f2329c.mo6254h(Integer.toHexString(iM2005c), "Unexpected string pool header size: 0x{}, expected: 0x1C");
        }
        return m1997c(j3, (((long) this.f2330b.m2006e()) & 4294967295L) + j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0773a m1997c(long j3, long j4) throws IOException {
        this.f2330b.m2006e();
        this.f2330b.m2006e();
        int iM2006e = this.f2330b.m2006e();
        long jM2006e = this.f2330b.m2006e();
        this.f2330b.m2006e();
        C0777e c0777e = this.f2330b;
        long j5 = c0777e.f2340h;
        long j10 = jM2006e - (j5 - j3);
        byte[] bArrM2008h = c0777e.m2008h((int) (j4 - j5));
        this.f2330b.m2004b(j4, "Expected strings pool end");
        return new C0773a(j10, bArrM2008h, (iM2006e & Opcodes.ACC_NATIVE) != 0);
    }
}

package p124i7;

import bsh.org.objectweb.asm.Opcodes;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import p007a7.AbstractC0018a;
import p034c7.AbstractC0409e;
import p034c7.C0406b;
import p047d7.C0721d;
import p047d7.C0730m;

/* JADX INFO: renamed from: i7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1992b extends AbstractC0409e {

    /* JADX INFO: renamed from: e */
    public final AbstractC1996f f6734e;

    /* JADX INFO: renamed from: f */
    public final C0406b f6735f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1992b(AbstractC1996f abstractC1996f, C0406b c0406b) {
        C0730m c0730m = c0406b.f1106a;
        String strM230R = AbstractC0018a.m230R(c0730m.m1908a0());
        if (strM230R == null) {
            strM230R = ".error_file_path_" + c0730m.f7657g;
        }
        super(strM230R);
        this.f6734e = abstractC1996f;
        this.f6735f = c0406b;
        this.f1110c = c0406b.f1106a.m1910c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p034c7.AbstractC0409e
    /* JADX INFO: renamed from: b */
    public final InputStream mo1367b() {
        C0406b c0406b = this.f6735f;
        C0730m c0730m = c0406b.f1106a;
        C0730m c0730m2 = c0406b.f1106a;
        int iM1910c0 = c0730m.m1910c0();
        AbstractC1996f abstractC1996f = this.f6734e;
        if (iM1910c0 != 0) {
            if (iM1910c0 != 8) {
                try {
                    new InflaterInputStream(abstractC1996f.mo4933b(c0406b.f1106a.f2163s, c0406b.m1366b()), new Inflater(true), Opcodes.ACC_INTERFACE).read(new byte[1024], 0, 1024);
                    c0730m2.m1931R(c0730m2.f2160p + 2, 8);
                    C0721d c0721dM1365a = c0406b.m1365a();
                    c0721dM1365a.m1931R(c0721dM1365a.f2160p + 2, 8);
                    this.f1110c = 8;
                } catch (Throwable unused) {
                    c0730m2.m1931R(c0730m2.f2160p + 2, 0);
                    C0721d c0721dM1365a2 = c0406b.m1365a();
                    c0721dM1365a2.m1931R(c0721dM1365a2.f2160p + 2, 0);
                    this.f1110c = 0;
                    long jMo1912e0 = c0730m.mo1912e0();
                    long jMo1905X = c0730m.mo1905X();
                    if (jMo1912e0 > jMo1905X) {
                        c0730m.m1919o0(jMo1912e0);
                        C0721d c0721dM1365a3 = c0406b.m1365a();
                        c0721dM1365a3.m1930Q(c0721dM1365a3.m1911d0(), jMo1912e0);
                    } else if (jMo1905X > jMo1912e0) {
                        c0730m.m1921q0(jMo1905X);
                        C0721d c0721dM1365a4 = c0406b.m1365a();
                        c0721dM1365a4.m1930Q(c0721dM1365a4.f2160p + 16, jMo1905X);
                    }
                }
            }
            return new InflaterInputStream(abstractC1996f.mo4933b(c0406b.f1106a.f2163s, c0406b.m1366b()), new Inflater(true), Opcodes.ACC_INTERFACE);
        }
        return abstractC1996f.mo4933b(c0730m2.f2163s, c0406b.m1366b());
    }
}

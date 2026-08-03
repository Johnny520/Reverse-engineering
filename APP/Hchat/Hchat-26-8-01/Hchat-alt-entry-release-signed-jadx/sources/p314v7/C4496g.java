package p314v7;

import bsh.org.objectweb.asm.Opcodes;
import java.io.ByteArrayOutputStream;
import p068eh.AbstractC0921a;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p241q7.C3445b;
import p257r7.C3714d;
import p257r7.C3716f;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4496g extends AbstractC2331a {

    /* JADX INFO: renamed from: k */
    public final C3716f f14847k;

    /* JADX INFO: renamed from: l */
    public final C3714d f14848l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4496g() {
        C3716f c3716f = new C3716f(false);
        this.f14847k = c3716f;
        C3714d c3714d = new C3714d(Opcodes.ACC_NATIVE);
        this.f14848l = c3714d;
        c3716f.m5546H(0);
        c3716f.m5548J(this);
        c3714d.m5546H(1);
        c3714d.m5548J(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        this.f14847k.m5545G(c3445b);
        this.f14848l.m5545G(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        return this.f14848l.m5549K(byteArrayOutputStream) + this.f14847k.m5549K(byteArrayOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        if (this.f7659i) {
            return 0;
        }
        return this.f14848l.mo5551p() + this.f14847k.mo5551p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        if (this.f7659i) {
            return null;
        }
        return AbstractC2331a.m5537o(this.f14847k.mo5552r(), this.f14848l.mo5552r());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LIBRARY{");
        sb2.append(AbstractC5999a.m10751n((byte) this.f14847k.f12083n));
        sb2.append(':');
        String str = this.f14848l.f12101m;
        if (str == null) {
            str = "NULL";
        }
        return AbstractC0921a.m2254q(sb2, str, '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        if (((AbstractC2331a) c1075b.f3461d) == this) {
            c1075b.f3459b = true;
        } else {
            this.f14847k.mo5556z(c1075b);
            this.f14848l.mo5556z(c1075b);
        }
    }
}

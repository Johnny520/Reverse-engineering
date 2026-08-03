package p229p7;

import bsh.org.objectweb.asm.Opcodes;
import p257r7.C3714d;

/* JADX INFO: renamed from: p7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3334d extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3714d f10727r;

    /* JADX INFO: renamed from: s */
    public final C3714d f10728s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3334d() {
        super((short) 516);
        C3714d c3714d = new C3714d(Opcodes.ACC_INTERFACE);
        this.f10727r = c3714d;
        C3714d c3714d2 = new C3714d(Opcodes.ACC_INTERFACE);
        this.f10728s = c3714d2;
        m6539P(c3714d);
        m6539P(c3714d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != 16) {
            return super.toString();
        }
        return C3334d.class.getSimpleName() + " {count=" + this.f10727r + ", actor=" + this.f10728s + '}';
    }
}

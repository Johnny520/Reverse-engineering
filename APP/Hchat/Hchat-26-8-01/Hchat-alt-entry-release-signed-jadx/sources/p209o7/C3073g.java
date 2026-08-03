package p209o7;

import java.io.ByteArrayOutputStream;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2333c;
import p152k7.InterfaceC2335e;
import p241q7.C3445b;

/* JADX INFO: renamed from: o7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3073g extends AbstractC2333c {

    /* JADX INFO: renamed from: k */
    public AbstractC2331a f9940k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        AbstractC2331a abstractC2331a = this.f9940k;
        if (abstractC2331a != null) {
            abstractC2331a.m5545G(c3445b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        AbstractC2331a abstractC2331a = this.f9940k;
        if (abstractC2331a != null) {
            return abstractC2331a.m5549K(byteArrayOutputStream);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: L */
    public final AbstractC2331a[] mo5559L() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: O */
    public final void mo5561O() {
        Object obj = this.f9940k;
        if (obj instanceof InterfaceC2335e) {
            ((InterfaceC2335e) obj).mo5562c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m6541P(AbstractC2331a abstractC2331a) {
        if (abstractC2331a != null) {
            this.f9940k = abstractC2331a;
            abstractC2331a.m5546H(this.f7657g);
            abstractC2331a.m5548J(this);
        } else {
            AbstractC2331a abstractC2331a2 = this.f9940k;
            if (abstractC2331a2 != null) {
                abstractC2331a2.m5546H(-1);
                abstractC2331a2.m5548J(null);
            }
            this.f9940k = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        AbstractC2331a abstractC2331a = this.f9940k;
        if (abstractC2331a != null) {
            return abstractC2331a.mo5551p();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        AbstractC2331a abstractC2331a = this.f9940k;
        if (abstractC2331a != null) {
            return abstractC2331a.mo5552r();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        AbstractC2331a abstractC2331a = this.f9940k;
        return abstractC2331a != null ? abstractC2331a.toString() : C3073g.class.getSimpleName().concat(": EMPTY");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        if (((AbstractC2331a) c1075b.f3461d) == this) {
            c1075b.f3459b = true;
            return;
        }
        AbstractC2331a abstractC2331a = this.f9940k;
        if (abstractC2331a != null) {
            abstractC2331a.mo5556z(c1075b);
        }
    }

    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
    }
}

package p314v7;

import java.io.ByteArrayOutputStream;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p241q7.C3445b;
import p298u7.C4279b;

/* JADX INFO: renamed from: v7.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4497g0 extends AbstractC2331a {

    /* JADX INFO: renamed from: k */
    public final AbstractC4501i0 f14849k;

    /* JADX INFO: renamed from: l */
    public final AbstractC2331a f14850l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4497g0(AbstractC2331a abstractC2331a, AbstractC4501i0 abstractC4501i0) {
        this.f14849k = abstractC4501i0;
        this.f14850l = abstractC2331a;
        abstractC4501i0.m5548J(this);
        abstractC4501i0.m5546H(0);
        abstractC2331a.m5548J(this);
        abstractC2331a.m5546H(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        AbstractC4501i0 abstractC4501i0 = this.f14849k;
        abstractC4501i0.m5545G(c3445b);
        AbstractC2331a abstractC2331a = this.f14850l;
        mo8924M(abstractC2331a, abstractC4501i0);
        abstractC2331a.m5545G(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        return this.f14850l.m5549K(byteArrayOutputStream) + this.f14849k.m5549K(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo8920L(C4279b c4279b);

    /* JADX INFO: renamed from: N */
    public abstract void mo8921N();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        return this.f14850l.mo5551p() + this.f14849k.mo5551p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        return AbstractC2331a.m5537o(this.f14849k.mo5552r(), this.f14850l.mo5552r());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.f14849k + ", value={" + this.f14850l + "}";
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
            this.f14849k.mo5556z(c1075b);
            this.f14850l.mo5556z(c1075b);
        }
    }

    /* JADX INFO: renamed from: M */
    public void mo8924M(AbstractC2331a abstractC2331a, AbstractC4501i0 abstractC4501i0) {
    }
}

package p182m7;

import java.io.ByteArrayOutputStream;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2333c;
import p152k7.InterfaceC2335e;
import p241q7.C3445b;

/* JADX INFO: renamed from: m7.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2804q extends AbstractC2331a implements InterfaceC2335e {

    /* JADX INFO: renamed from: k */
    public final AbstractC2333c f9062k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2804q(AbstractC2333c abstractC2333c) {
        this.f9062k = abstractC2333c;
        abstractC2333c.m5548J(this);
        abstractC2333c.m5546H(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        this.f9062k.m5545G(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        return this.f9062k.m5549K(byteArrayOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: I */
    public final void mo5547I(boolean z9) {
        this.f9062k.mo5547I(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public AbstractC2804q mo6188L() {
        return (AbstractC2804q) m5554v(AbstractC2804q.class);
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo6189M();

    /* JADX INFO: renamed from: N */
    public abstract void mo6190N();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2335e
    /* JADX INFO: renamed from: c */
    public final void mo5562c() {
        this.f9062k.mo5562c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z9 = obj instanceof AbstractC2804q;
        AbstractC2333c abstractC2333c = this.f9062k;
        return z9 ? abstractC2333c.equals(((AbstractC2804q) obj).f9062k) : abstractC2333c.equals(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9062k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        return this.f9062k.mo5551p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        return this.f9062k.mo5552r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.f9062k.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public boolean mo5555y() {
        return this.f9062k.mo5555y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        this.f9062k.mo5556z(c1075b);
    }
}

package p182m7;

import p068eh.AbstractC0921a;
import p152k7.AbstractC2333c;
import p229p7.C3343m;
import p257r7.C3725o;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: m7.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2811x extends AbstractC2804q {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9078l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2811x(AbstractC2333c abstractC2333c, int i9) {
        super(abstractC2333c);
        this.f9078l = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: L */
    public AbstractC2804q mo6188L() {
        switch (this.f9078l) {
            case 0:
                return (AbstractC2796i) super.mo6188L();
            default:
                return super.mo6188L();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: M */
    public void mo6189M() {
        switch (this.f9078l) {
            case 0:
                ((C2810w) this.f9062k).mo6168Y();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: N */
    public void mo6190N() {
        switch (this.f9078l) {
            case 0:
                ((C2810w) this.f9062k).mo6169Z();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    public String toString() {
        switch (this.f9078l) {
            case 0:
                AbstractC2333c abstractC2333c = this.f9062k;
                C2810w c2810w = (C2810w) abstractC2333c;
                C3725o c3725oM6165V = c2810w.m6165V(((C3343m) c2810w.f8138m).f10759s.f12083n);
                if (AbstractC5999a.m10743f(c3725oM6165V != null ? c3725oM6165V.f12101m : null) || !AbstractC5999a.m10743f(((C2810w) abstractC2333c).m6202c0())) {
                    String strM6202c0 = ((C2810w) abstractC2333c).m6202c0();
                    return strM6202c0 == null ? "null" : strM6202c0;
                }
                StringBuilder sb2 = new StringBuilder("<!--");
                C2810w c2810w2 = (C2810w) abstractC2333c;
                C3725o c3725oM6165V2 = c2810w2.m6165V(((C3343m) c2810w2.f8138m).f10759s.f12083n);
                return AbstractC0921a.m2255r(sb2, c3725oM6165V2 != null ? c3725oM6165V2.f12101m : null, "-->");
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public boolean mo5555y() {
        switch (this.f9078l) {
            case 0:
                return ((C2810w) this.f9062k).mo5555y();
            default:
                return super.mo5555y();
        }
    }

    /* JADX INFO: renamed from: O */
    private void m6203O() {
    }

    /* JADX INFO: renamed from: P */
    private void m6204P() {
    }
}

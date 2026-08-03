package td;

import ae.C0076g;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import p136j8.AbstractC2091b;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5792m;
import p369yd.C6028b;

/* JADX INFO: renamed from: td.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4146b extends C4320p {

    /* JADX INFO: renamed from: o */
    public C6028b f13664o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4146b(C6028b c6028b, C3514r c3514r, AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        this();
        m8688d0(c3514r);
        if (abstractC3508l.m7378L() && abstractC3508l2.m7381O()) {
            this.f13664o = C6028b.m10790K(c6028b);
            mo7178I(abstractC3508l2);
            mo7178I(abstractC3508l);
        } else {
            this.f13664o = c6028b;
            mo7178I(abstractC3508l);
            mo7178I(abstractC3508l2);
        }
        C0076g c0076g = new C0076g(this, 19);
        super.mo8342h0(c0076g);
        this.f13664o.m10798P(c0076g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C4146b c4146b = new C4146b();
        c4146b.f13664o = this.f13664o;
        m8681P(c4146b);
        return c4146b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: U */
    public final void mo8340U(Collection collection) {
        super.mo8340U(collection);
        collection.addAll(this.f13664o.m10795J());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C4146b) && super.mo7168Y(c4320p)) {
            return this.f13664o.equals(((C4146b) c4320p).f13664o);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Z */
    public final void mo8341Z() {
        super.mo8341Z();
        Iterator it = this.f13664o.m10795J().iterator();
        while (it.hasNext()) {
            C4320p c4320p = ((C3514r) it.next()).f11420j;
            if (c4320p != null) {
                c4320p.mo8341Z();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: b0 */
    public final boolean mo7181b0(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        if (super.mo7181b0(abstractC3508l, abstractC3508l2)) {
            return true;
        }
        return this.f13664o.m10797N(abstractC3508l, abstractC3508l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: h0 */
    public final void mo8342h0(Consumer consumer) {
        super.mo8342h0(consumer);
        this.f13664o.m10798P(consumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final void m8343i0() {
        C6028b c6028bM10792O = C6028b.m10792O(this.f13664o);
        this.f13664o = c6028bM10792O;
        if (c6028bM10792O.f24477i == 3) {
            this.f13664o = C6028b.m10790K(c6028bM10792O);
            AbstractC3508l abstractC3508lMo7179S = mo7179S(0);
            mo7182c0(0, mo7179S(1));
            mo7182c0(1, abstractC3508lMo7179S);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        String strM10487d = AbstractC5792m.m10487d(this.f14399n);
        String strValueOf = String.valueOf(this.f14397l);
        String strValueOf2 = String.valueOf(this.f13664o);
        String strValueOf3 = String.valueOf(mo7179S(0));
        String strValueOf4 = String.valueOf(mo7179S(1));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM10487d);
        sb2.append(": TERNARY ");
        sb2.append(strValueOf);
        sb2.append(" = (");
        sb2.append(strValueOf2);
        return AbstractC2091b.m5164k(sb2, ") ? ", strValueOf3, " : ", strValueOf4);
    }

    public C4146b() {
        super(EnumC3400k.f10966R, 2);
    }
}

package p227p4;

import p077f8.AbstractC1089i;
import p295u4.C4266p;
import p295u4.C4270t;
import p376z4.C6090d;

/* JADX INFO: renamed from: p4.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3307l extends AbstractC3303h {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10666e = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3307l(C4270t c4270t, C4266p c4266p) {
        super(AbstractC3306k.f10579b, c4270t, c4266p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: b */
    public int mo6969b() {
        return this.f10488b.f10495d.mo2812j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: g */
    public String mo6970g() {
        C3305j c3305j = this.f10488b;
        AbstractC1089i abstractC1089i = c3305j.f10495d;
        abstractC1089i.getClass();
        String strM6993a = c3305j.m6993a();
        String strMo2806P = abstractC1089i.mo2806P(this);
        String strMo2807Q = abstractC1089i.mo2807Q(this);
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(strM6993a);
        if (strMo2806P.length() != 0) {
            sb2.append(' ');
            sb2.append(strMo2806P);
        }
        if (strMo2807Q.length() != 0) {
            sb2.append(" // ");
            sb2.append(strMo2807Q);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: i */
    public AbstractC3303h mo6975i(C3305j c3305j) {
        throw new RuntimeException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: j */
    public final AbstractC3303h mo6981j(int i9) {
        switch (this.f10666e) {
        }
        return mo6971k(this.f10490d.m8571s(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: l */
    public void mo6972l(C6090d c6090d) {
        this.f10488b.f10495d.mo2808R0(c6090d, this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 p4.j), (r3v0 u4.t), (r4v0 u4.p) A[MD:(p4.j, u4.t, u4.p):void (m)] call: p4.h.<init>(p4.j, u4.t, u4.p):void type: SUPER */
    public /* synthetic */ AbstractC3307l(C3305j c3305j, C4270t c4270t, C4266p c4266p) {
        super(c3305j, c4270t, c4266p);
    }
}

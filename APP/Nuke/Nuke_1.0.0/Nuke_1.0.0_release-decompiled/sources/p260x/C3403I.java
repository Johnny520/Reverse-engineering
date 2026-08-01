package p260x;

import p011B4.AbstractC0231b;
import p112W2.InterfaceC1601c;
import p160f3.AbstractC2162v;
import p238t.AbstractC3204b;
import p255w.C3377h;

/* JADX INFO: renamed from: x.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3403I implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10639d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3406L f10640e;

    public /* synthetic */ C3403I(C3406L c3406l, int i5) {
        this.f10639d = i5;
        this.f10640e = c3406l;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f10639d) {
            case 0:
                C3377h c3377h = (C3377h) this.f10640e.f10646r.mo6a();
                int iM5611c = c3377h.m5611c();
                int i5 = 0;
                while (true) {
                    if (i5 >= iM5611c) {
                        i5 = -1;
                    } else if (!c3377h.m5612d(i5).equals(obj)) {
                        i5++;
                    }
                }
                return Integer.valueOf(i5);
            default:
                int iIntValue = ((Integer) obj).intValue();
                C3406L c3406l = this.f10640e;
                C3377h c3377h2 = (C3377h) c3406l.f10646r.mo6a();
                if (iIntValue < 0 || iIntValue >= c3377h2.m5611c()) {
                    StringBuilder sbM404o = AbstractC0231b.m404o(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM404o.append(c3377h2.m5611c());
                    sbM404o.append(')');
                    AbstractC3204b.m5475a(sbM404o.toString());
                }
                AbstractC2162v.m3994p(c3406l.m4023x0(), null, new C3405K(c3406l, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}

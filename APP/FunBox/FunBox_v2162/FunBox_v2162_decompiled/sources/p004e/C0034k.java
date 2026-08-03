package p004e;

import java.util.ArrayList;
import p001b.C0003a;
import p010k.AbstractC0171a;
import p010k.AbstractC0174d;
import p013n.AbstractC0203e;
import p013n.C0202d;
import p013n.C0210l;

/* JADX INFO: renamed from: e.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0034k extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    private final int f107c;

    public C0034k(int i2, int i3) {
        super(i2);
        this.f107c = i3;
    }

    /* JADX INFO: renamed from: I */
    public static C0034k m146I(int i2, ArrayList arrayList) {
        int size = arrayList.size();
        C0034k c0034k = new C0034k(size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            c0034k.m503A(i3, (AbstractC0033j) arrayList.get(i3));
        }
        c0034k.m536g();
        return c0034k;
    }

    /* JADX INFO: renamed from: F */
    public final int m147F() {
        int iM504B = m504B();
        if (iM504B == 0) {
            return 0;
        }
        AbstractC0033j abstractC0033jL = m509l(iM504B - 1);
        return abstractC0033jL.mo91b() + abstractC0033jL.m135h();
    }

    /* JADX INFO: renamed from: G */
    public final int m148G() {
        int iM504B = m504B();
        int i2 = 0;
        for (int i3 = 0; i3 < iM504B; i3++) {
            AbstractC0033j abstractC0033j = (AbstractC0033j) m516s(i3);
            if (abstractC0033j instanceof C0030g) {
                AbstractC0171a abstractC0171aM117y = ((C0030g) abstractC0033j).m117y();
                int iM430i = abstractC0171aM117y instanceof AbstractC0174d ? ((AbstractC0174d) abstractC0171aM117y).m430i(abstractC0033j.m138k().m151a() == 113) : 0;
                if (iM430i > i2) {
                    i2 = iM430i;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public final int m149H() {
        return this.f107c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m150J(C0202d c0202d) {
        String strM541d;
        int iM491j = c0202d.m491j();
        int iM504B = m504B();
        if (c0202d.m486d()) {
            boolean zM492k = c0202d.m492k();
            for (int i2 = 0; i2 < iM504B; i2++) {
                AbstractC0033j abstractC0033j = (AbstractC0033j) m516s(i2);
                int iMo91b = abstractC0033j.mo91b() * 2;
                if (iMo91b != 0 || zM492k) {
                    int iM489h = c0202d.m489h();
                    String strMo112q = abstractC0033j.mo112q();
                    if (strMo112q == null) {
                        strM541d = null;
                    } else {
                        String str = "  " + abstractC0033j.m143p() + ": ";
                        int length = str.length();
                        strM541d = C0210l.m541d(str, length, strMo112q, iM489h == 0 ? strMo112q.length() : iM489h - length);
                    }
                }
                if (strM541d != null) {
                    c0202d.m484b(iMo91b, strM541d);
                } else if (iMo91b != 0) {
                    strM541d = "";
                    c0202d.m484b(iMo91b, strM541d);
                }
            }
        }
        for (int i3 = 0; i3 < iM504B; i3++) {
            AbstractC0033j abstractC0033j2 = (AbstractC0033j) m516s(i3);
            try {
                abstractC0033j2.mo93x(c0202d);
            } catch (RuntimeException e2) {
                throw C0003a.m22b("...while writing " + abstractC0033j2, e2);
            }
        }
        int iM491j2 = (c0202d.m491j() - iM491j) / 2;
        if (iM491j2 == m147F()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m147F() + " but actually wrote " + iM491j2);
    }
}

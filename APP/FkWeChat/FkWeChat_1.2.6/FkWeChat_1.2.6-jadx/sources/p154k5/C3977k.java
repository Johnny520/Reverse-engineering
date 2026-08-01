package p154k5;

import bsh.C1193i2;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;
import p020b5.C0996b;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6495e;
import p254r5.C6488a0;
import p254r5.C6503i;
import p309v5.AbstractC8824f;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: k5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3977k extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public final int f11485s;

    public C3977k(int i10, int i11) {
        super(i10);
        this.f11485s = i11;
    }

    /* JADX INFO: renamed from: I */
    public static C3977k m15785I(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        C3977k c3977k = new C3977k(size, i10);
        for (int i11 = 0; i11 < size; i11++) {
            c3977k.m15790J(i11, (AbstractC3976j) arrayList.get(i11));
        }
        c3977k.mo6829t();
        return c3977k;
    }

    /* JADX INFO: renamed from: E */
    public int m15786E() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        return m15787F(size - 1).m15775k();
    }

    /* JADX INFO: renamed from: F */
    public AbstractC3976j m15787F(int i10) {
        return (AbstractC3976j) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public int m15788G() {
        int iM28399H;
        int size = size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) m33887w(i11);
            if (abstractC3976j instanceof C3974h) {
                AbstractC6487a abstractC6487aM15750A = ((C3974h) abstractC3976j).m15750A();
                iM28399H = abstractC6487aM15750A instanceof AbstractC6495e ? ((AbstractC6495e) abstractC6487aM15750A).m25750p(abstractC3976j.m15776l().m15792a() == 113) : abstractC6487aM15750A instanceof C6503i ? ((C6503i) abstractC6487aM15750A).m25772n().m28387i().m28399H() : 0;
            } else if (!(abstractC3976j instanceof C3986t)) {
                continue;
            } else {
                if (abstractC3976j.m15776l().m15792a() != 250) {
                    C1193i2.m4438a("Expecting invoke-polymorphic");
                    return 0;
                }
                iM28399H = ((C6488a0) ((C3986t) abstractC3976j).m15864A(1)).m25731k().m28387i().m28399H() + 1;
            }
            if (iM28399H > i10) {
                i10 = iM28399H;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: H */
    public int m15789H() {
        return this.f11485s;
    }

    /* JADX INFO: renamed from: J */
    public void m15790J(int i10, AbstractC3976j abstractC3976j) {
        m33889y(i10, abstractC3976j);
    }

    /* JADX INFO: renamed from: K */
    public void m15791K(InterfaceC8819a interfaceC8819a) {
        int iMo33864c = interfaceC8819a.mo33864c();
        int size = size();
        if (interfaceC8819a.mo33828k()) {
            boolean zMo33826h = interfaceC8819a.mo33826h();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3976j abstractC3976j = (AbstractC3976j) m33887w(i10);
                int iMo15679b = abstractC3976j.mo15679b() * 2;
                String strM15782r = (iMo15679b != 0 || zMo33826h) ? abstractC3976j.m15782r("  ", interfaceC8819a.mo33824b(), true) : null;
                if (strM15782r != null) {
                    interfaceC8819a.mo33825d(iMo15679b, strM15782r);
                } else if (iMo15679b != 0) {
                    interfaceC8819a.mo33825d(iMo15679b, _UrlKt.FRAGMENT_ENCODE_SET);
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC3976j abstractC3976j2 = (AbstractC3976j) m33887w(i11);
            try {
                abstractC3976j2.mo15682z(interfaceC8819a);
            } catch (RuntimeException e10) {
                throw C0996b.m3684b(e10, "...while writing " + abstractC3976j2);
            }
        }
        int iMo33864c2 = (interfaceC8819a.mo33864c() - iMo33864c) / 2;
        if (iMo33864c2 == m15786E()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m15786E() + " but actually wrote " + iMo33864c2);
    }
}

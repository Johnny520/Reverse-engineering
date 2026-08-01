package ac;

import java.util.Iterator;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p036c9.InterfaceC1400a;
import p117i.C3039b;
import p215oc.C5725t;

/* JADX INFO: renamed from: ac.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0219g extends AbstractC0217e implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public final C0218f f569t;

    /* JADX INFO: renamed from: u */
    public Object f570u;

    /* JADX INFO: renamed from: v */
    public boolean f571v;

    /* JADX INFO: renamed from: w */
    public int f572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219g(C0218f c0218f, AbstractC0233u[] abstractC0233uArr) {
        super(c0218f.m485n(), abstractC0233uArr);
        c0218f.getClass();
        abstractC0233uArr.getClass();
        this.f569t = c0218f;
        this.f572w = c0218f.m484m();
    }

    /* JADX INFO: renamed from: A */
    private final void m495A() {
        if (this.f569t.m484m() == this.f572w) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: B */
    private final void m496B() {
        if (!this.f571v) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m497D(C0219g c0219g, int i10, C0232t c0232t, Object obj, int i11, int i12, boolean z10, int i13, Object obj2) {
        if (obj2 != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: resetPath");
            return;
        }
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        if ((i13 & 32) != 0) {
            z10 = false;
        }
        c0219g.m498C(i10, c0232t, obj, i11, i12, z10);
    }

    /* JADX INFO: renamed from: C */
    public final void m498C(int i10, C0232t c0232t, Object obj, int i11, int i12, boolean z10) {
        int i13 = i11 * 5;
        if (i13 > 30) {
            m475v()[i11].m563C(c0232t.m548r(), c0232t.m548r().length, 0);
            while (!AbstractC1061t.m3842c(m475v()[i11].m565g(), obj)) {
                m475v()[i11].m571z();
            }
            m477z(i11);
            return;
        }
        int iM578f = 1 << AbstractC0236x.m578f(i10, i13);
        if (!c0232t.m549s(iM578f)) {
            int iM523P = c0232t.m523P(iM578f);
            C0232t c0232tM522O = c0232t.m522O(iM523P);
            m475v()[i11].m563C(c0232t.m548r(), c0232t.m544n() * 2, iM523P);
            m498C(i10, c0232tM522O, obj, i11 + 1, i12, z10);
            return;
        }
        int iM545o = c0232t.m545o(iM578f);
        if (iM578f == (z10 ? 1 << AbstractC0236x.m578f(i12, i13) : 0) && i11 < m476x()) {
            m475v()[m476x()].m562B(new Object[]{c0232t.m548r()[iM545o], c0232t.m548r()[iM545o + 1]}, 2);
        } else {
            m475v()[i11].m563C(c0232t.m548r(), c0232t.m544n() * 2, iM545o);
            m477z(i11);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m499E(Object obj, Object obj2) {
        C0219g c0219g;
        if (this.f569t.containsKey(obj)) {
            if (hasNext()) {
                Object objM474l = m474l();
                this.f569t.put(obj, obj2);
                c0219g = this;
                m497D(c0219g, objM474l != null ? objM474l.hashCode() : 0, this.f569t.m485n(), objM474l, 0, 0, false, 48, null);
            } else {
                c0219g = this;
                c0219g.f569t.put(obj, obj2);
            }
            c0219g.f572w = c0219g.f569t.m484m();
        }
    }

    @Override // ac.AbstractC0217e, java.util.Iterator
    public Object next() {
        m495A();
        this.f570u = m474l();
        this.f571v = true;
        return super.next();
    }

    @Override // ac.AbstractC0217e, java.util.Iterator
    public void remove() {
        C0219g c0219g;
        m496B();
        if (hasNext()) {
            Object objM474l = m474l();
            AbstractC1064u0.m3856d(this.f569t).remove(this.f570u);
            int iHashCode = objM474l != null ? objM474l.hashCode() : 0;
            C0232t c0232tM485n = this.f569t.m485n();
            Object obj = this.f570u;
            c0219g = this;
            c0219g.m498C(iHashCode, c0232tM485n, objM474l, 0, obj != null ? obj.hashCode() : 0, true);
        } else {
            c0219g = this;
            AbstractC1064u0.m3856d(c0219g.f569t).remove(c0219g.f570u);
        }
        c0219g.f570u = null;
        c0219g.f571v = false;
        c0219g.f572w = c0219g.f569t.m484m();
    }
}

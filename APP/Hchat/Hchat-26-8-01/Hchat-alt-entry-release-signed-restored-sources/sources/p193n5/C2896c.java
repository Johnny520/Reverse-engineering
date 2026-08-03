package p193n5;

import java.io.IOException;
import java.io.StringWriter;
import p000a.AbstractC0000a;
import p046d6.C0709f;
import p068eh.AbstractC0921a;
import p122i5.AbstractC1986a;
import p122i5.AbstractC1987b;
import p136j8.C2104o;
import p150k5.C2270u;
import p239q5.C3440a;
import p312v5.C4478a;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: n5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896c extends AbstractC0000a implements Comparable {

    /* JADX INFO: renamed from: j */
    public final C2270u f9356j;

    /* JADX INFO: renamed from: k */
    public final int f9357k;

    /* JADX INFO: renamed from: l */
    public final int f9358l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2896c(C2270u c2270u, int i9) {
        this.f9356j = c2270u;
        this.f9357k = i9;
        this.f9358l = c2270u.f7555y.m5519b(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9357k;
        if (i9 < 0 || i9 >= this.f9356j.f7555y.size()) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "methodhandle@"));
        }
        try {
            m6300f1();
        } catch (C0709f e6) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "methodhandle@"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2896c c2896c) {
        int iCompare = Integer.compare(m6301g1(), c2896c.m6301g1());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC4479b interfaceC4479bM6300f1 = m6300f1();
        if (interfaceC4479bM6300f1 instanceof AbstractC1986a) {
            if (c2896c.m6300f1() instanceof AbstractC1986a) {
                return ((AbstractC1986a) interfaceC4479bM6300f1).compareTo((AbstractC1986a) c2896c.m6300f1());
            }
            return -1;
        }
        if (c2896c.m6300f1() instanceof AbstractC1987b) {
            return ((AbstractC1987b) interfaceC4479bM6300f1).compareTo((AbstractC1987b) c2896c.m6300f1());
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2896c)) {
            return false;
        }
        C2896c c2896c = (C2896c) obj;
        return m6301g1() == c2896c.m6301g1() && m6300f1().equals(c2896c.m6300f1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public final InterfaceC4479b m6300f1() {
        C2270u c2270u = this.f9356j;
        int iM585P = c2270u.f7531a.m585P(this.f9358l + 4);
        switch (m6301g1()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C2895b(c2270u, iM585P);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C2898e(c2270u, iM585P);
            default:
                throw new C0709f(null, "Invalid method handle type: %d", Integer.valueOf(m6301g1()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public final int m6301g1() {
        return this.f9356j.f7531a.m585P(this.f9358l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m6300f1().hashCode() + (m6301g1() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).m7216k(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}

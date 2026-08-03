package p193n5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import p000a.AbstractC0000a;
import p046d6.AbstractC0707d;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p150k5.C2270u;
import p150k5.C2274y;
import p239q5.C3440a;
import p312v5.C4478a;

/* JADX INFO: renamed from: n5.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2897d extends AbstractC0000a implements Comparable {

    /* JADX INFO: renamed from: j */
    public final C2270u f9359j;

    /* JADX INFO: renamed from: k */
    public final int f9360k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2897d(C2270u c2270u, int i9) {
        this.f9359j = c2270u;
        this.f9360k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9360k;
        if (i9 < 0 || i9 >= this.f9359j.f7552v.f7524h.f7538h) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "proto@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2897d c2897d = (C2897d) obj;
        int iCompareTo = m6303f1().compareTo(c2897d.m6303f1());
        return iCompareTo != 0 ? iCompareTo : AbstractC0707d.m1875b(m6302e1(), c2897d.m6302e1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public final List m6302e1() {
        C2270u c2270u = this.f9359j;
        int iM583N = c2270u.f7531a.m583N(c2270u.f7552v.m5519b(this.f9360k) + 8);
        if (iM583N <= 0) {
            return Collections.EMPTY_LIST;
        }
        return new C2274y(this, iM583N + 4, c2270u.f7532b.m583N(iM583N), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2897d)) {
            return false;
        }
        C2897d c2897d = (C2897d) obj;
        return m6303f1().equals(c2897d.m6303f1()) && AbstractC0707d.m1878e(m6302e1(), c2897d.m6302e1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public final String m6303f1() {
        C2270u c2270u = this.f9359j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m583N(c2270u.f7552v.m5519b(this.f9360k) + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m6302e1().hashCode() + (m6303f1().hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).m7217l(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}

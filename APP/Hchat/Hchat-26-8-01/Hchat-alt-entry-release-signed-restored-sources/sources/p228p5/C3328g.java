package p228p5;

import java.io.IOException;
import java.io.StringWriter;
import p005a5.C0016a;
import p046d6.AbstractC0707d;
import p136j8.C2104o;
import p150k5.C2270u;
import p193n5.C2897d;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: p5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3328g implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final C2270u f10715g;

    /* JADX INFO: renamed from: h */
    public final int f10716h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3328g(C2270u c2270u, C0016a c0016a, int i9) {
        this.f10715g = c2270u;
        this.f10716h = c0016a.m208l(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2897d m7048a() {
        return new C2897d(this.f10715g, this.f10716h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(21, interfaceC4686a.mo863h());
        if (iCompare != 0) {
            return iCompare;
        }
        C2897d c2897dM7048a = m7048a();
        C2897d c2897dM7048a2 = ((C3328g) interfaceC4686a).m7048a();
        int iCompareTo = c2897dM7048a.m6303f1().compareTo(c2897dM7048a2.m6303f1());
        return iCompareTo != 0 ? iCompareTo : AbstractC0707d.m1875b(c2897dM7048a.m6302e1(), c2897dM7048a2.m6302e1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3328g) {
            return m7048a().equals(((C3328g) obj).m7048a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m7048a().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).mo2076g(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}

package p228p5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Set;
import p005a5.C0016a;
import p046d6.AbstractC0707d;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p150k5.C2243a;
import p150k5.C2270u;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3322a implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final C2270u f10700g;

    /* JADX INFO: renamed from: h */
    public final String f10701h;

    /* JADX INFO: renamed from: i */
    public final int f10702i;

    /* JADX INFO: renamed from: j */
    public final int f10703j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3322a(C2270u c2270u, C0016a c0016a) {
        this.f10700g = c2270u;
        this.f10701h = c2270u.f7549s.m5521b(c0016a.m211o(false));
        int iM211o = c0016a.m211o(false);
        this.f10702i = iM211o;
        this.f10703j = c0016a.f55h;
        m7041b(c0016a, iM211o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m7041b(C0016a c0016a, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            c0016a.m213q();
            AbstractC1184v0.m3184K(c0016a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Set m7042a() {
        return new C2243a(this, this.f10700g.f7532b, this.f10703j, this.f10702i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(29, interfaceC4686a.mo863h());
        if (iCompare != 0) {
            return iCompare;
        }
        C3322a c3322a = (C3322a) interfaceC4686a;
        int iCompareTo = getType().compareTo(c3322a.getType());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return AbstractC0707d.m1876c(m7042a(), c3322a.m7042a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3322a)) {
            return false;
        }
        C3322a c3322a = (C3322a) obj;
        return getType().equals(c3322a.getType()) && m7042a().equals(c3322a.m7042a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getType() {
        return this.f10701h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 29;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m7042a().hashCode() + (getType().hashCode() * 31);
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

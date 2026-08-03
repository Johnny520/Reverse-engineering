package p228p5;

import java.io.IOException;
import java.io.StringWriter;
import p005a5.C0016a;
import p136j8.C2104o;
import p150k5.C2270u;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: p5.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3329h implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final C2270u f10717g;

    /* JADX INFO: renamed from: h */
    public final int f10718h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3329h(C2270u c2270u, C0016a c0016a, int i9) {
        this.f10717g = c2270u;
        this.f10718h = c0016a.m208l(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m7049a() {
        return this.f10717g.f7548r.m5521b(this.f10718h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(23, interfaceC4686a.mo863h());
        return iCompare != 0 ? iCompare : m7049a().compareTo(((C3329h) interfaceC4686a).m7049a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3329h) {
            return m7049a().equals(((C3329h) obj).m7049a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 23;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m7049a().hashCode();
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

package p228p5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import p005a5.C0016a;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p150k5.C2250d0;
import p150k5.C2270u;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3323b implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final C2270u f10704g;

    /* JADX INFO: renamed from: h */
    public final int f10705h;

    /* JADX INFO: renamed from: i */
    public final int f10706i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3323b(C2270u c2270u, C0016a c0016a) {
        this.f10704g = c2270u;
        int iM211o = c0016a.m211o(false);
        this.f10705h = iM211o;
        this.f10706i = c0016a.f55h;
        for (int i9 = 0; i9 < iM211o; i9++) {
            AbstractC1184v0.m3184K(c0016a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m7043a() {
        return new C2250d0(this, this.f10704g.f7532b, this.f10706i, this.f10705h, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(28, interfaceC4686a.mo863h());
        if (iCompare != 0) {
            return iCompare;
        }
        List listM7043a = m7043a();
        List listM7043a2 = ((C3323b) interfaceC4686a).m7043a();
        int iCompare2 = Integer.compare(listM7043a.size(), listM7043a2.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        Iterator it = listM7043a2.iterator();
        Iterator it2 = listM7043a.iterator();
        while (it2.hasNext()) {
            int iCompareTo = ((Comparable) it2.next()).compareTo(it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3323b) {
            return m7043a().equals(((C3323b) obj).m7043a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 28;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m7043a().hashCode();
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

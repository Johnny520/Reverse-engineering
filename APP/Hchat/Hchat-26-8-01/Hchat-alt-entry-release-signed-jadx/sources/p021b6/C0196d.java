package p021b6;

import java.io.IOException;
import java.io.StringWriter;
import p136j8.C2104o;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: b6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0196d implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final double f495g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0196d(double d10) {
        this.f495g = d10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(17, interfaceC4686a.mo863h());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(this.f495g, ((C0196d) interfaceC4686a).f495g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0196d) && Double.doubleToRawLongBits(this.f495g) == Double.doubleToRawLongBits(((C0196d) obj).f495g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.f495g);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
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

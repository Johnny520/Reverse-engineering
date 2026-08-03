package p021b6;

import java.io.IOException;
import java.io.StringWriter;
import p136j8.C2104o;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: b6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0195c implements InterfaceC4686a {

    /* JADX INFO: renamed from: g */
    public final char f494g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0195c(char c10) {
        this.f494g = c10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4686a interfaceC4686a = (InterfaceC4686a) obj;
        int iCompare = Integer.compare(3, interfaceC4686a.mo863h());
        if (iCompare != 0) {
            return iCompare;
        }
        return Character.compare(this.f494g, ((C0195c) interfaceC4686a).f494g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0195c) {
            if (this.f494g == ((C0195c) obj).f494g) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p327w5.InterfaceC4686a
    /* JADX INFO: renamed from: h */
    public final int mo863h() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f494g;
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

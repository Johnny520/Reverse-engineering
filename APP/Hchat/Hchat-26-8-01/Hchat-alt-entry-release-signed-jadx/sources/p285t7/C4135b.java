package p285t7;

import java.util.Iterator;
import java.util.function.Function;
import okhttp3.internal.http2.Settings;
import p166l7.C2518f;
import p166l7.C2525m;
import p209o7.C3076j;
import p257r7.C3727q;
import p257r7.C3735y;
import p314v7.AbstractC4497g0;
import p314v7.C4490d;
import p314v7.EnumC4505k0;
import p363y7.AbstractC5999a;
import p379z7.C6111g;
import p379z7.C6112h;

/* JADX INFO: renamed from: t7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4135b implements Iterable {

    /* JADX INFO: renamed from: g */
    public final int f13628g;

    /* JADX INFO: renamed from: h */
    public final C2518f f13629h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4135b(C2518f c2518f, int i9) {
        this.f13628g = i9;
        this.f13629h = c2518f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m8321a(C2518f c2518f, EnumC4505k0 enumC4505k0) {
        String strMo5914V;
        StringBuilder sb2 = new StringBuilder();
        if (enumC4505k0 != null) {
            if (enumC4505k0 == EnumC4505k0.f14862i) {
                sb2.append('@');
            } else {
                sb2.append('?');
            }
        }
        C2518f c2518f2 = this.f13629h;
        if (c2518f != c2518f2 && !c2518f2.isEmpty() && (strMo5914V = c2518f2.mo5914V()) != null) {
            sb2.append(strMo5914V);
            sb2.append(':');
        }
        sb2.append(m8323c());
        sb2.append('/');
        sb2.append(m8322b());
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m8322b() {
        String str;
        C2518f c2518f;
        Iterator itM8324d = m8324d(false);
        do {
            str = null;
            if (!itM8324d.hasNext()) {
                break;
            }
            C4490d c4490d = (C4490d) itM8324d.next();
            AbstractC4497g0 abstractC4497g0 = c4490d.f14846k;
            int iM8934N = abstractC4497g0 != null ? abstractC4497g0.f14849k.m8934N() : -1;
            C3727q c3727q = (iM8934N >= 0 && (c2518f = (C2518f) c4490d.m5553u(C2518f.class)) != null) ? (C3727q) c2518f.f8146p.m8600V(iM8934N) : null;
            if (c3727q != null) {
                str = c3727q.f12101m;
            }
        } while (str == null);
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m8323c() {
        C3735y c3735yM8604c0 = this.f13629h.f8145o.m8604c0((this.f13628g >> 16) & 255);
        if (c3735yM8604c0 != null) {
            return c3735yM8604c0.f12101m;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Iterator m8324d(final boolean z9) {
        int i9 = this.f13628g;
        int i10 = (i9 >> 24) & 255;
        C2518f c2518f = this.f13629h;
        if (i10 == c2518f.mo5913U()) {
            int i11 = (i9 >> 16) & 255;
            final int i12 = i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            C3076j c3076jM5144k0 = c2518f.f8147q.f9934m.m5144k0((byte) i11);
            if (c3076jM5144k0 != null) {
                return new C6111g(c3076jM5144k0.f9949m.f9926k.iterator(), new Function() { // from class: o7.h
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        C4490d c4490dM8124m0 = ((C2525m) obj).f8159o.m8124m0(i12);
                        if (c4490dM8124m0 == null) {
                            return null;
                        }
                        if (z9 && c4490dM8124m0.mo5555y()) {
                            return null;
                        }
                        return c4490dM8124m0;
                    }
                });
            }
        }
        return C6112h.f24664g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4135b) && this.f13628g == ((C4135b) obj).f13628g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13628g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return m8324d(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strMo5914V = this.f13629h.mo5914V();
        int i9 = this.f13628g;
        if (strMo5914V == null) {
            return AbstractC5999a.m10748k(i9, 8) + " @" + m8323c() + "/" + m8322b();
        }
        return AbstractC5999a.m10748k(i9, 8) + " @" + strMo5914V + ":" + m8323c() + "/" + m8322b();
    }
}

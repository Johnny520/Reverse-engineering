package p007a7;

import android.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p034c7.AbstractC0409e;
import p034c7.C0408d;
import p034c7.C0410f;
import p136j8.C2104o;
import p166l7.C2518f;
import p166l7.C2524l;
import p182m7.C2788a;
import p241q7.C3445b;
import p285t7.C4134a;

/* JADX INFO: renamed from: a7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0021d extends C0020c {

    /* JADX INFO: renamed from: r */
    public final Object f71r;

    /* JADX INFO: renamed from: s */
    public int f72s;

    /* JADX INFO: renamed from: t */
    public String f73t;

    /* JADX INFO: renamed from: u */
    public String f74u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0021d(String str, C0410f c0410f) {
        super(str, c0410f);
        this.f71r = new Object();
        this.f62i = false;
        this.f63j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.C0020c
    /* JADX INFO: renamed from: e */
    public final C2524l mo269e() {
        return (C4134a) this.f64k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (C0021d.class != obj.getClass()) {
            return false;
        }
        return m277s().equals(((C0021d) obj).m277s());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.C0020c
    /* JADX INFO: renamed from: g */
    public final C2524l mo270g() {
        return (C4134a) super.mo270g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(C0021d.class, m277s());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.C0020c
    /* JADX INFO: renamed from: o */
    public final C2524l mo275o() throws IOException {
        C0410f c0410f = this.f61h;
        AbstractC0409e abstractC0409eM1370b = c0410f.m1370b("resources.arsc");
        if (abstractC0409eM1370b == null) {
            C2104o.m5299y("Entry not found: resources.arsc");
            return null;
        }
        InputStream inputStreamMo1367b = abstractC0409eM1370b.mo1367b();
        C4134a c4134a = new C4134a();
        c4134a.m5545G(new C3445b(inputStreamMo1367b));
        c4134a.f8157r = this;
        C0408d c0408d = new C0408d(abstractC0409eM1370b.f1108a, c4134a);
        c0408d.f1110c = abstractC0409eM1370b.f1110c;
        c0408d.f1111d = abstractC0409eM1370b.f1111d;
        c0410f.m1369a(c0408d);
        return c4134a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final String m277s() {
        m281x();
        if (this.f74u == null) {
            m280w();
        }
        String str = this.f74u;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, "-");
        sbM1025n.append(m279u());
        return sbM1025n.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final C4134a m278t() {
        return (C4134a) super.mo270g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.C0020c
    public final String toString() {
        return m277s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final int m279u() {
        if (this.f72s == 0) {
            m280w();
        }
        return this.f72s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m280w() {
        C2518f c2518fM5930Z;
        int iM8318c0;
        if (this.f66m != null || this.f61h.m1370b("AndroidManifest.xml") != null) {
            C2788a c2788aM268c = m268c();
            Integer numM6159V = c2788aM268c.m6159V(R.attr.versionCode);
            if (numM6159V != null) {
                this.f72s = numM6159V.intValue();
            }
            if (this.f73t == null) {
                this.f73t = c2788aM268c.m6160W(R.attr.versionName);
            }
            if (this.f74u == null) {
                this.f74u = c2788aM268c.m6161X();
            }
        }
        if (m272i()) {
            C4134a c4134a = (C4134a) super.mo270g();
            if (c4134a.m8319d0() && this.f72s == 0 && (iM8318c0 = c4134a.m8318c0()) != 0) {
                this.f72s = iM8318c0;
                if (this.f73t == null) {
                    this.f73t = String.valueOf(iM8318c0);
                }
            }
            if (this.f74u != null || (c2518fM5930Z = c4134a.m5930Z()) == null) {
                return;
            }
            this.f74u = c2518fM5930Z.mo5914V();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m281x() {
        synchronized (this.f71r) {
        }
        return false;
    }
}

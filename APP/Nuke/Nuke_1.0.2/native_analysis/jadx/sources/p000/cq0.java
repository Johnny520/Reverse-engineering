package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 implements a51 {

    /* JADX INFO: renamed from: b */
    public final ls0 f1668b;

    /* JADX INFO: renamed from: c */
    public final URL f1669c;

    /* JADX INFO: renamed from: d */
    public final String f1670d;

    /* JADX INFO: renamed from: e */
    public String f1671e;

    /* JADX INFO: renamed from: f */
    public URL f1672f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f1673g;

    /* JADX INFO: renamed from: h */
    public int f1674h;

    public cq0(String str) {
        n71 n71Var = ls0.f6291a;
        this.f1669c = null;
        if (TextUtils.isEmpty(str)) {
            C0676s.m4651j("Must not be null or empty");
            throw null;
        }
        this.f1670d = str;
        fg1.m1642q("Argument must not be null", n71Var);
        this.f1668b = n71Var;
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        if (this.f1673g == null) {
            this.f1673g = m882c().getBytes(a51.f64a);
        }
        messageDigest.update(this.f1673g);
    }

    /* JADX INFO: renamed from: c */
    public final String m882c() {
        String str = this.f1670d;
        if (str != null) {
            return str;
        }
        URL url = this.f1669c;
        fg1.m1642q("Argument must not be null", url);
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public final URL m883d() {
        if (this.f1672f == null) {
            if (TextUtils.isEmpty(this.f1671e)) {
                String string = this.f1670d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f1669c;
                    fg1.m1642q("Argument must not be null", url);
                    string = url.toString();
                }
                this.f1671e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f1672f = new URL(this.f1671e);
        }
        return this.f1672f;
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof cq0) {
            cq0 cq0Var = (cq0) obj;
            if (m882c().equals(cq0Var.m882c()) && this.f1668b.equals(cq0Var.f1668b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        if (this.f1674h == 0) {
            int iHashCode = m882c().hashCode();
            this.f1674h = iHashCode;
            this.f1674h = this.f1668b.hashCode() + (iHashCode * 31);
        }
        return this.f1674h;
    }

    public final String toString() {
        return m882c();
    }

    public cq0(URL url) {
        n71 n71Var = ls0.f6291a;
        fg1.m1642q("Argument must not be null", url);
        this.f1669c = url;
        this.f1670d = null;
        fg1.m1642q("Argument must not be null", n71Var);
        this.f1668b = n71Var;
    }
}

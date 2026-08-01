package p107V1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p078P1.InterfaceC1144f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: V1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1508g implements InterfaceC1144f {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1509h f5249b;

    /* JADX INFO: renamed from: c */
    public final URL f5250c;

    /* JADX INFO: renamed from: d */
    public final String f5251d;

    /* JADX INFO: renamed from: e */
    public String f5252e;

    /* JADX INFO: renamed from: f */
    public URL f5253f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f5254g;

    /* JADX INFO: renamed from: h */
    public int f5255h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1508g(URL url) {
        C1512k c1512k = InterfaceC1509h.f5256a;
        AbstractC2503g.m4445c(url, "Argument must not be null");
        this.f5250c = url;
        this.f5251d = null;
        AbstractC2503g.m4445c(c1512k, "Argument must not be null");
        this.f5249b = c1512k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        if (this.f5254g == null) {
            this.f5254g = m2779c().getBytes(InterfaceC1144f.f3779a);
        }
        messageDigest.update(this.f5254g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m2779c() {
        String str = this.f5251d;
        if (str != null) {
            return str;
        }
        URL url = this.f5250c;
        AbstractC2503g.m4445c(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final URL m2780d() {
        if (this.f5253f == null) {
            if (TextUtils.isEmpty(this.f5252e)) {
                String string = this.f5251d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f5250c;
                    AbstractC2503g.m4445c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f5252e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f5253f = new URL(this.f5252e);
        }
        return this.f5253f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1508g) {
            C1508g c1508g = (C1508g) obj;
            if (m2779c().equals(c1508g.m2779c()) && this.f5249b.equals(c1508g.f5249b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        if (this.f5255h == 0) {
            int iHashCode = m2779c().hashCode();
            this.f5255h = iHashCode;
            this.f5255h = this.f5249b.hashCode() + (iHashCode * 31);
        }
        return this.f5255h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2779c();
    }

    public C1508g(String str) {
        C1512k c1512k = InterfaceC1509h.f5256a;
        this.f5250c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f5251d = str;
            AbstractC2503g.m4445c(c1512k, "Argument must not be null");
            this.f5249b = c1512k;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

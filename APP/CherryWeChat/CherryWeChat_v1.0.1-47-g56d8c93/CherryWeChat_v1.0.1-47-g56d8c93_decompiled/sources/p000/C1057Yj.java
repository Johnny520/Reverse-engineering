package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Yj */
/* JADX INFO: loaded from: classes.dex */
public final class C1057Yj implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2506sk f3359b;

    /* JADX INFO: renamed from: c */
    public final URL f3360c;

    /* JADX INFO: renamed from: d */
    public final String f3361d;

    /* JADX INFO: renamed from: e */
    public String f3362e;

    /* JADX INFO: renamed from: f */
    public URL f3363f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f3364g;

    /* JADX INFO: renamed from: h */
    public int f3365h;

    public C1057Yj(URL url) {
        C0288Gn c0288Gn = InterfaceC2506sk.f8794a;
        AbstractC0714Qj.m1488j("Argument must not be null", url);
        this.f3360c = url;
        this.f3361d = null;
        AbstractC0714Qj.m1488j("Argument must not be null", c0288Gn);
        this.f3359b = c0288Gn;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        if (this.f3364g == null) {
            this.f3364g = m2000c().getBytes(InterfaceC0802Sm.f2524a);
        }
        messageDigest.update(this.f3364g);
    }

    /* JADX INFO: renamed from: c */
    public final String m2000c() {
        String str = this.f3361d;
        if (str != null) {
            return str;
        }
        URL url = this.f3360c;
        AbstractC0714Qj.m1488j("Argument must not be null", url);
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public final URL m2001d() {
        if (this.f3363f == null) {
            if (TextUtils.isEmpty(this.f3362e)) {
                String string = this.f3361d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f3360c;
                    AbstractC0714Qj.m1488j("Argument must not be null", url);
                    string = url.toString();
                }
                this.f3362e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f3363f = new URL(this.f3362e);
        }
        return this.f3363f;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C1057Yj) {
            C1057Yj c1057Yj = (C1057Yj) obj;
            if (m2000c().equals(c1057Yj.m2000c()) && this.f3359b.equals(c1057Yj.f3359b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        if (this.f3365h == 0) {
            int iHashCode = m2000c().hashCode();
            this.f3365h = iHashCode;
            this.f3365h = this.f3359b.hashCode() + (iHashCode * 31);
        }
        return this.f3365h;
    }

    public final String toString() {
        return m2000c();
    }

    public C1057Yj(String str) {
        C0288Gn c0288Gn = InterfaceC2506sk.f8794a;
        this.f3360c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f3361d = str;
            AbstractC0714Qj.m1488j("Argument must not be null", c0288Gn);
            this.f3359b = c0288Gn;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

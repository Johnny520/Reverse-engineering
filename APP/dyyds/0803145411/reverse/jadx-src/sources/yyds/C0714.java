package yyds;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛳᲁᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0714 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f3358;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public String f3359;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2195 f3360;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public volatile byte[] f3361;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final URL f3362;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public URL f3363;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3364;

    public C0714(String str) {
        C2459 c2459 = InterfaceC2195.f10774;
        this.f3362 = null;
        if (TextUtils.isEmpty(str)) {
            C0188.m798("Must not be null or empty");
            throw null;
        }
        this.f3364 = str;
        AbstractC0319.m992(c2459, "Argument must not be null");
        this.f3360 = c2459;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0714)) {
            return false;
        }
        C0714 c0714 = (C0714) obj;
        return m1633().equals(c0714.m1633()) && this.f3360.equals(c0714.f3360);
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        int i = this.f3358;
        if (i != 0) {
            return i;
        }
        int iHashCode = m1633().hashCode();
        this.f3358 = iHashCode;
        int iHashCode2 = this.f3360.hashCode() + (iHashCode * 31);
        this.f3358 = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return m1633();
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        if (this.f3361 == null) {
            this.f3361 = m1633().getBytes(InterfaceC1410.f6680);
        }
        messageDigest.update(this.f3361);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m1633() {
        String str = this.f3364;
        if (str != null) {
            return str;
        }
        URL url = this.f3362;
        AbstractC0319.m992(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final URL m1634() {
        URL url = this.f3363;
        if (url == null) {
            if (TextUtils.isEmpty(this.f3359)) {
                String string = this.f3364;
                if (TextUtils.isEmpty(string)) {
                    URL url2 = this.f3362;
                    AbstractC0319.m992(url2, "Argument must not be null");
                    string = url2.toString();
                }
                this.f3359 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            url = new URL(this.f3359);
            this.f3363 = url;
        }
        return url;
    }

    public C0714(URL url) {
        C2459 c2459 = InterfaceC2195.f10774;
        AbstractC0319.m992(url, "Argument must not be null");
        this.f3362 = url;
        this.f3364 = null;
        AbstractC0319.m992(c2459, "Argument must not be null");
        this.f3360 = c2459;
    }
}

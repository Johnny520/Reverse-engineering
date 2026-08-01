package p228;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p222.AbstractC7988;
import p286.InterfaceC8392;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8036 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public URL f22192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final URL f22195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8040 f22196;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22197;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile byte[] f22198;

    public C8036(String str) {
        C8039 c8039 = InterfaceC8040.f22206;
        this.f22195 = null;
        if (TextUtils.isEmpty(str)) {
            C5919.m11249("Must not be null or empty");
            throw null;
        }
        this.f22194 = str;
        AbstractC7988.m13441(c8039, "Argument must not be null");
        this.f22196 = c8039;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C8036) {
            C8036 c8036 = (C8036) obj;
            if (m13493().equals(c8036.m13493()) && this.f22196.equals(c8036.f22196)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        if (this.f22197 == 0) {
            int iHashCode = m13493().hashCode();
            this.f22197 = iHashCode;
            this.f22197 = this.f22196.hashCode() + (iHashCode * 31);
        }
        return this.f22197;
    }

    public final String toString() {
        return m13493();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final URL m13492() {
        if (this.f22192 == null) {
            if (TextUtils.isEmpty(this.f22193)) {
                String string = this.f22194;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f22195;
                    AbstractC7988.m13441(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f22193 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f22192 = new URL(this.f22193);
        }
        return this.f22192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m13493() {
        String str = this.f22194;
        if (str != null) {
            return str;
        }
        URL url = this.f22195;
        AbstractC7988.m13441(url, "Argument must not be null");
        return url.toString();
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        if (this.f22198 == null) {
            this.f22198 = m13493().getBytes(InterfaceC8392.f23271);
        }
        messageDigest.update(this.f22198);
    }

    public C8036(URL url) {
        C8039 c8039 = InterfaceC8040.f22206;
        AbstractC7988.m13441(url, "Argument must not be null");
        this.f22195 = url;
        this.f22194 = null;
        AbstractC7988.m13441(c8039, "Argument must not be null");
        this.f22196 = c8039;
    }
}

package p228;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p222.AbstractC7989;
import p286.InterfaceC8393;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8037 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public URL f22189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final URL f22192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8041 f22193;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile byte[] f22195;

    public C8037(String str) {
        C8040 c8040 = InterfaceC8041.f22203;
        this.f22192 = null;
        if (TextUtils.isEmpty(str)) {
            C5925.m11310("Must not be null or empty");
            throw null;
        }
        this.f22191 = str;
        AbstractC7989.m13469(c8040, "Argument must not be null");
        this.f22193 = c8040;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C8037) {
            C8037 c8037 = (C8037) obj;
            if (m13521().equals(c8037.m13521()) && this.f22193.equals(c8037.f22193)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        if (this.f22194 == 0) {
            int iHashCode = m13521().hashCode();
            this.f22194 = iHashCode;
            this.f22194 = this.f22193.hashCode() + (iHashCode * 31);
        }
        return this.f22194;
    }

    public final String toString() {
        return m13521();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final URL m13520() {
        if (this.f22189 == null) {
            if (TextUtils.isEmpty(this.f22190)) {
                String string = this.f22191;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f22192;
                    AbstractC7989.m13469(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f22190 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f22189 = new URL(this.f22190);
        }
        return this.f22189;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m13521() {
        String str = this.f22191;
        if (str != null) {
            return str;
        }
        URL url = this.f22192;
        AbstractC7989.m13469(url, "Argument must not be null");
        return url.toString();
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        if (this.f22195 == null) {
            this.f22195 = m13521().getBytes(InterfaceC8393.f23270);
        }
        messageDigest.update(this.f22195);
    }

    public C8037(URL url) {
        C8040 c8040 = InterfaceC8041.f22203;
        AbstractC7989.m13469(url, "Argument must not be null");
        this.f22192 = url;
        this.f22191 = null;
        AbstractC7989.m13469(c8040, "Argument must not be null");
        this.f22193 = c8040;
    }
}

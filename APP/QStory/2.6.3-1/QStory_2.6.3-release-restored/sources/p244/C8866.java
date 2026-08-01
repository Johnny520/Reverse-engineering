package p244;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p238.AbstractC8818;
import p302.InterfaceC9222;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8866 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public URL f22534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final URL f22537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8870 f22538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile byte[] f22540;

    public C8866(String str) {
        C8869 c8869 = InterfaceC8870.f22548;
        this.f22537 = null;
        if (TextUtils.isEmpty(str)) {
            C6755.m11869("Must not be null or empty");
            throw null;
        }
        this.f22536 = str;
        AbstractC8818.m14028(c8869, "Argument must not be null");
        this.f22538 = c8869;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C8866) {
            C8866 c8866 = (C8866) obj;
            if (m14080().equals(c8866.m14080()) && this.f22538.equals(c8866.f22538)) {
                return true;
            }
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        if (this.f22539 == 0) {
            int iHashCode = m14080().hashCode();
            this.f22539 = iHashCode;
            this.f22539 = this.f22538.hashCode() + (iHashCode * 31);
        }
        return this.f22539;
    }

    public final String toString() {
        return m14080();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final URL m14079() {
        if (this.f22534 == null) {
            if (TextUtils.isEmpty(this.f22535)) {
                String string = this.f22536;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f22537;
                    AbstractC8818.m14028(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f22535 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f22534 = new URL(this.f22535);
        }
        return this.f22534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m14080() {
        String str = this.f22536;
        if (str != null) {
            return str;
        }
        URL url = this.f22537;
        AbstractC8818.m14028(url, "Argument must not be null");
        return url.toString();
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        if (this.f22540 == null) {
            this.f22540 = m14080().getBytes(InterfaceC9222.f23615);
        }
        messageDigest.update(this.f22540);
    }

    public C8866(URL url) {
        C8869 c8869 = InterfaceC8870.f22548;
        AbstractC8818.m14028(url, "Argument must not be null");
        this.f22537 = url;
        this.f22536 = null;
        AbstractC8818.m14028(c8869, "Argument must not be null");
        this.f22538 = c8869;
    }
}

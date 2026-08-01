package p021;

import kotlin.text.Regex;
import p005.C6108;
import p005.InterfaceC6119;
import p015.AbstractC6201;
import p015.C6217;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6261 extends AbstractC6201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6108 f17238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17240;

    public C6261(String str, long j, C6108 c6108) {
        this.f17240 = str;
        this.f17239 = j;
        this.f17238 = c6108;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6217 mo11108() {
        String str = this.f17240;
        if (str != null) {
            Regex regex = C6217.f17098;
            try {
                return AbstractC8189.m13679(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11109() {
        return this.f17239;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6119 mo11110() {
        return this.f17238;
    }
}

package p056;

import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6583 implements InterfaceC6581 {
    public static final C6584 Companion = new C6584();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17963;

    public /* synthetic */ C6583(String str) {
        this.f17963 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6583) {
            return this.f17963.equals(((C6583) obj).f17963);
        }
        return false;
    }

    @Override // p056.InterfaceC6581
    public final String getValue() {
        return this.f17963;
    }

    public final int hashCode() {
        return this.f17963.hashCode();
    }

    public final String toString() {
        return AbstractC6136.m11558(')', "Other(value=", this.f17963);
    }
}

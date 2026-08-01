package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.AbstractC4394;
import p033.AbstractC6325;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4515 extends AbstractC6325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13157;

    public C4515(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13157 = str;
        this.f13156 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4515)) {
            return false;
        }
        C4515 c4515 = (C4515) obj;
        return AbstractC4394.m8917(this.f13157, c4515.f13157) && AbstractC4394.m8917(this.f13156, c4515.f13156);
    }

    public final int hashCode() {
        return this.f13156.hashCode() + (this.f13157.hashCode() * 31);
    }

    public final String toString() {
        return this.f13157 + this.f13156;
    }
}

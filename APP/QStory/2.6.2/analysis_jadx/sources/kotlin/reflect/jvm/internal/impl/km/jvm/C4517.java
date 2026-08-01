package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.AbstractC4394;
import p033.AbstractC6325;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4517 extends AbstractC6325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13162;

    public C4517(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13162 = str;
        this.f13161 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4517)) {
            return false;
        }
        C4517 c4517 = (C4517) obj;
        return AbstractC4394.m8917(this.f13162, c4517.f13162) && AbstractC4394.m8917(this.f13161, c4517.f13161);
    }

    public final int hashCode() {
        return this.f13161.hashCode() + (this.f13162.hashCode() * 31);
    }

    public final String toString() {
        return this.f13162 + ':' + this.f13161;
    }
}

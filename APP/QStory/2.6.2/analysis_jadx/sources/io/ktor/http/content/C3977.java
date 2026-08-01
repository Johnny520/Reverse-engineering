package io.ktor.http.content;

import p243.AbstractC8149;
import p243.C8146;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8146 f12222;

    public C3977(C8146 c8146) {
        this.f12222 = c8146;
        AbstractC8149.m13572(c8146.f22474, c8146.f22472, c8146.f22473, c8146.f22466, c8146.f22471, c8146.f22468);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3977) && this.f12222.equals(((C3977) obj).f12222);
    }

    public final int hashCode() {
        return this.f12222.hashCode();
    }

    public final String toString() {
        return "LastModifiedVersion(lastModified=" + this.f12222 + ')';
    }
}

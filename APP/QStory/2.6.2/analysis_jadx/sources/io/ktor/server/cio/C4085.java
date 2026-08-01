package io.ktor.server.cio;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12416;

    public C4085(String str, int i, long j) {
        str.getClass();
        this.f12416 = str;
        this.f12415 = i;
        this.f12414 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4085)) {
            return false;
        }
        C4085 c4085 = (C4085) obj;
        return AbstractC4394.m8917(this.f12416, c4085.f12416) && this.f12415 == c4085.f12415 && this.f12414 == c4085.f12414;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0053.m141(AbstractC0053.m143(this.f12415, this.f12416.hashCode() * 31, 31), 31, this.f12414);
    }

    public final String toString() {
        return "HttpServerSettings(host=" + this.f12416 + ", port=" + this.f12415 + ", connectionIdleTimeoutSeconds=" + this.f12414 + ", reuseAddress=false)";
    }
}

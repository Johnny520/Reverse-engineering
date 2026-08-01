package io.ktor.server.cio;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4086 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12420;

    public C4086(String str, int i, long j) {
        str.getClass();
        this.f12420 = str;
        this.f12419 = i;
        this.f12418 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4086)) {
            return false;
        }
        C4086 c4086 = (C4086) obj;
        return AbstractC4395.m8907(this.f12420, c4086.f12420) && this.f12419 == c4086.f12419 && this.f12418 == c4086.f12418;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0053.m142(AbstractC0053.m144(this.f12419, this.f12420.hashCode() * 31, 31), 31, this.f12418);
    }

    public final String toString() {
        return "HttpServerSettings(host=" + this.f12420 + ", port=" + this.f12419 + ", connectionIdleTimeoutSeconds=" + this.f12418 + ", reuseAddress=false)";
    }
}

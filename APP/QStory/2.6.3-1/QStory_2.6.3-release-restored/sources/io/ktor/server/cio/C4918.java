package io.ktor.server.cio;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12765;

    public C4918(String str, int i, long j) {
        str.getClass();
        this.f12765 = str;
        this.f12764 = i;
        this.f12763 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4918)) {
            return false;
        }
        C4918 c4918 = (C4918) obj;
        return AbstractC5227.m9466(this.f12765, c4918.f12765) && this.f12764 == c4918.f12764 && this.f12763 == c4918.f12763;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0900.m702(AbstractC0900.m704(this.f12764, this.f12765.hashCode() * 31, 31), 31, this.f12763);
    }

    public final String toString() {
        return "HttpServerSettings(host=" + this.f12765 + ", port=" + this.f12764 + ", connectionIdleTimeoutSeconds=" + this.f12763 + ", reuseAddress=false)";
    }
}

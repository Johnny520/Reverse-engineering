package io.ktor.utils.io;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4235 implements InterfaceC4249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f12738;

    public C4235(Throwable th) {
        this.f12738 = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4235) && AbstractC4394.m8917(this.f12738, ((C4235) obj).f12738);
    }

    public final int hashCode() {
        Throwable th = this.f12738;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f12738 + ')';
    }
}

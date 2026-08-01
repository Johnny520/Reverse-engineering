package io.ktor.utils.io;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4236 implements InterfaceC4250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f12742;

    public C4236(Throwable th) {
        this.f12742 = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4236) && AbstractC4395.m8907(this.f12742, ((C4236) obj).f12742);
    }

    public final int hashCode() {
        Throwable th = this.f12742;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f12742 + ')';
    }
}

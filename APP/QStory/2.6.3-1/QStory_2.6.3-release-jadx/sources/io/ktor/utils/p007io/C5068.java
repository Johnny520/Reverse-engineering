package io.ktor.utils.p007io;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5068 implements InterfaceC5082 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f13087;

    public C5068(Throwable th) {
        this.f13087 = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5068) && AbstractC5227.m9466(this.f13087, ((C5068) obj).f13087);
    }

    public final int hashCode() {
        Throwable th = this.f13087;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f13087 + ')';
    }
}

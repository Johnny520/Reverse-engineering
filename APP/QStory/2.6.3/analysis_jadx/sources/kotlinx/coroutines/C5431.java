package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Throwable f15076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f15077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6551 f15078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5446 f15079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15080;

    public /* synthetic */ C5431(Object obj, InterfaceC5446 interfaceC5446, InterfaceC6551 interfaceC6551, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC5446, (i & 4) != 0 ? null : interfaceC6551, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5431 m10526(C5431 c5431, InterfaceC5446 interfaceC5446, Throwable th, int i) {
        Object obj = c5431.f15080;
        if ((i & 2) != 0) {
            interfaceC5446 = c5431.f15079;
        }
        InterfaceC5446 interfaceC54462 = interfaceC5446;
        InterfaceC6551 interfaceC6551 = c5431.f15078;
        Object obj2 = c5431.f15077;
        if ((i & 16) != 0) {
            th = c5431.f15076;
        }
        return new C5431(obj, interfaceC54462, interfaceC6551, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5431)) {
            return false;
        }
        C5431 c5431 = (C5431) obj;
        return AbstractC4395.m8907(this.f15080, c5431.f15080) && AbstractC4395.m8907(this.f15079, c5431.f15079) && AbstractC4395.m8907(this.f15078, c5431.f15078) && AbstractC4395.m8907(this.f15077, c5431.f15077) && AbstractC4395.m8907(this.f15076, c5431.f15076);
    }

    public final int hashCode() {
        Object obj = this.f15080;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC5446 interfaceC5446 = this.f15079;
        int iHashCode2 = (iHashCode + (interfaceC5446 == null ? 0 : interfaceC5446.hashCode())) * 31;
        InterfaceC6551 interfaceC6551 = this.f15078;
        int iHashCode3 = (iHashCode2 + (interfaceC6551 == null ? 0 : interfaceC6551.hashCode())) * 31;
        Object obj2 = this.f15077;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15076;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f15080 + ", cancelHandler=" + this.f15079 + ", onCancellation=" + this.f15078 + ", idempotentResume=" + this.f15077 + ", cancelCause=" + this.f15076 + ')';
    }

    public C5431(Object obj, InterfaceC5446 interfaceC5446, InterfaceC6551 interfaceC6551, Object obj2, Throwable th) {
        this.f15080 = obj;
        this.f15079 = interfaceC5446;
        this.f15078 = interfaceC6551;
        this.f15077 = obj2;
        this.f15076 = th;
    }
}

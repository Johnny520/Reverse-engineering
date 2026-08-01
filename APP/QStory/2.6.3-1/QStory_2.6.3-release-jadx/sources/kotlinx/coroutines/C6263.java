package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6263 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Throwable f15421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f15422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7380 f15423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6278 f15424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15425;

    public /* synthetic */ C6263(Object obj, InterfaceC6278 interfaceC6278, InterfaceC7380 interfaceC7380, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC6278, (i & 4) != 0 ? null : interfaceC7380, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6263 m11085(C6263 c6263, InterfaceC6278 interfaceC6278, Throwable th, int i) {
        Object obj = c6263.f15425;
        if ((i & 2) != 0) {
            interfaceC6278 = c6263.f15424;
        }
        InterfaceC6278 interfaceC62782 = interfaceC6278;
        InterfaceC7380 interfaceC7380 = c6263.f15423;
        Object obj2 = c6263.f15422;
        if ((i & 16) != 0) {
            th = c6263.f15421;
        }
        return new C6263(obj, interfaceC62782, interfaceC7380, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6263)) {
            return false;
        }
        C6263 c6263 = (C6263) obj;
        return AbstractC5227.m9466(this.f15425, c6263.f15425) && AbstractC5227.m9466(this.f15424, c6263.f15424) && AbstractC5227.m9466(this.f15423, c6263.f15423) && AbstractC5227.m9466(this.f15422, c6263.f15422) && AbstractC5227.m9466(this.f15421, c6263.f15421);
    }

    public final int hashCode() {
        Object obj = this.f15425;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC6278 interfaceC6278 = this.f15424;
        int iHashCode2 = (iHashCode + (interfaceC6278 == null ? 0 : interfaceC6278.hashCode())) * 31;
        InterfaceC7380 interfaceC7380 = this.f15423;
        int iHashCode3 = (iHashCode2 + (interfaceC7380 == null ? 0 : interfaceC7380.hashCode())) * 31;
        Object obj2 = this.f15422;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15421;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f15425 + ", cancelHandler=" + this.f15424 + ", onCancellation=" + this.f15423 + ", idempotentResume=" + this.f15422 + ", cancelCause=" + this.f15421 + ')';
    }

    public C6263(Object obj, InterfaceC6278 interfaceC6278, InterfaceC7380 interfaceC7380, Object obj2, Throwable th) {
        this.f15425 = obj;
        this.f15424 = interfaceC6278;
        this.f15423 = interfaceC7380;
        this.f15422 = obj2;
        this.f15421 = th;
    }
}

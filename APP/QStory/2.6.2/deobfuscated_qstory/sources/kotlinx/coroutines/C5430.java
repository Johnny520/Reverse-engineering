package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5430 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Throwable f15076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f15077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6550 f15078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5445 f15079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15080;

    public /* synthetic */ C5430(Object obj, InterfaceC5445 interfaceC5445, InterfaceC6550 interfaceC6550, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC5445, (i & 4) != 0 ? null : interfaceC6550, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5430 m10522(C5430 c5430, InterfaceC5445 interfaceC5445, Throwable th, int i) {
        Object obj = c5430.f15080;
        if ((i & 2) != 0) {
            interfaceC5445 = c5430.f15079;
        }
        InterfaceC5445 interfaceC54452 = interfaceC5445;
        InterfaceC6550 interfaceC6550 = c5430.f15078;
        Object obj2 = c5430.f15077;
        if ((i & 16) != 0) {
            th = c5430.f15076;
        }
        return new C5430(obj, interfaceC54452, interfaceC6550, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5430)) {
            return false;
        }
        C5430 c5430 = (C5430) obj;
        return AbstractC4394.m8917(this.f15080, c5430.f15080) && AbstractC4394.m8917(this.f15079, c5430.f15079) && AbstractC4394.m8917(this.f15078, c5430.f15078) && AbstractC4394.m8917(this.f15077, c5430.f15077) && AbstractC4394.m8917(this.f15076, c5430.f15076);
    }

    public final int hashCode() {
        Object obj = this.f15080;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC5445 interfaceC5445 = this.f15079;
        int iHashCode2 = (iHashCode + (interfaceC5445 == null ? 0 : interfaceC5445.hashCode())) * 31;
        InterfaceC6550 interfaceC6550 = this.f15078;
        int iHashCode3 = (iHashCode2 + (interfaceC6550 == null ? 0 : interfaceC6550.hashCode())) * 31;
        Object obj2 = this.f15077;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15076;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f15080 + ", cancelHandler=" + this.f15079 + ", onCancellation=" + this.f15078 + ", idempotentResume=" + this.f15077 + ", cancelCause=" + this.f15076 + ')';
    }

    public C5430(Object obj, InterfaceC5445 interfaceC5445, InterfaceC6550 interfaceC6550, Object obj2, Throwable th) {
        this.f15080 = obj;
        this.f15079 = interfaceC5445;
        this.f15078 = interfaceC6550;
        this.f15077 = obj2;
        this.f15076 = th;
    }
}

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.C5286;
import kotlinx.coroutines.flow.InterfaceC5263;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5224 extends C5286 implements InterfaceC5263 {
    @Override // kotlinx.coroutines.flow.InterfaceC5263
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f14874;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f14875 + ((long) ((int) ((m10318() + ((long) this.f14871)) - this.f14875)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m10301(int i) {
        synchronized (this) {
            Object[] objArr = this.f14874;
            objArr.getClass();
            mo10305(Integer.valueOf(((Number) objArr[((int) ((this.f14875 + ((long) ((int) ((m10318() + ((long) this.f14871)) - this.f14875)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}

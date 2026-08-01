package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.C5287;
import kotlinx.coroutines.flow.InterfaceC5264;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225 extends C5287 implements InterfaceC5264 {
    @Override // kotlinx.coroutines.flow.InterfaceC5264
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f14874;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f14875 + ((long) ((int) ((m10322() + ((long) this.f14871)) - this.f14875)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m10305(int i) {
        synchronized (this) {
            Object[] objArr = this.f14874;
            objArr.getClass();
            mo10309(Integer.valueOf(((Number) objArr[((int) ((this.f14875 + ((long) ((int) ((m10322() + ((long) this.f14871)) - this.f14875)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}

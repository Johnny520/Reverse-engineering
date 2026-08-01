package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.C6119;
import kotlinx.coroutines.flow.InterfaceC6096;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6057 extends C6119 implements InterfaceC6096 {
    @Override // kotlinx.coroutines.flow.InterfaceC6096
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f15219;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f15220 + ((long) ((int) ((m10881() + ((long) this.f15216)) - this.f15220)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m10864(int i) {
        synchronized (this) {
            Object[] objArr = this.f15219;
            objArr.getClass();
            mo10868(Integer.valueOf(((Number) objArr[((int) ((this.f15220 + ((long) ((int) ((m10881() + ((long) this.f15216)) - this.f15220)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}

package kotlin.coroutines;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5191 implements InterfaceC5186 {
    private final InterfaceC5193 key;

    public AbstractC5191(InterfaceC5193 interfaceC5193) {
        interfaceC5193.getClass();
        this.key = interfaceC5193;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public /* bridge */ <R> R fold(R r, InterfaceC7383 interfaceC7383) {
        return (R) AbstractC1298.m1727(this, r, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public /* bridge */ <E extends InterfaceC5186> E get(InterfaceC5193 interfaceC5193) {
        return (E) AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public InterfaceC5193 getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public /* bridge */ InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public /* bridge */ InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }
}

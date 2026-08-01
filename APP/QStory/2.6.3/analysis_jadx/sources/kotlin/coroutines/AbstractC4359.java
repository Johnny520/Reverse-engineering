package kotlin.coroutines;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4359 implements InterfaceC4354 {
    private final InterfaceC4361 key;

    public AbstractC4359(InterfaceC4361 interfaceC4361) {
        interfaceC4361.getClass();
        this.key = interfaceC4361;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public /* bridge */ <R> R fold(R r, InterfaceC6554 interfaceC6554) {
        return (R) AbstractC0455.m1167(this, r, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public /* bridge */ <E extends InterfaceC4354> E get(InterfaceC4361 interfaceC4361) {
        return (E) AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public InterfaceC4361 getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public /* bridge */ InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public /* bridge */ InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }
}

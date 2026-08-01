package kotlin.coroutines;

import com.bumptech.glide.AbstractC3055;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4358 implements InterfaceC4353 {
    private final InterfaceC4360 key;

    public AbstractC4358(InterfaceC4360 interfaceC4360) {
        interfaceC4360.getClass();
        this.key = interfaceC4360;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public /* bridge */ <R> R fold(R r, InterfaceC6553 interfaceC6553) {
        return (R) AbstractC3055.m6648(this, r, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public /* bridge */ <E extends InterfaceC4353> E get(InterfaceC4360 interfaceC4360) {
        return (E) AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public InterfaceC4360 getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public /* bridge */ InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public /* bridge */ InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }
}

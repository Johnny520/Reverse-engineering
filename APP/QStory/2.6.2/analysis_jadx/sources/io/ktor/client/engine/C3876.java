package io.ktor.client.engine;

import com.bumptech.glide.AbstractC3055;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.client.engine.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3876 implements InterfaceC4353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C3877 f12087 = new C3877();

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return f12087;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }
}

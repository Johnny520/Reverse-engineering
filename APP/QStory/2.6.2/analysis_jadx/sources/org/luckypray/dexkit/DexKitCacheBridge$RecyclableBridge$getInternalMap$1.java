package org.luckypray.dexkit;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
public final /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getInternalMap$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public DexKitCacheBridge$RecyclableBridge$getInternalMap$1(Object obj) {
        super(0, obj, C5742.class, "ensureUsable", "ensureUsable()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11056invoke() {
        if (((C5742) this.receiver).m11078().f25169.get()) {
            C5919.m11250("RecyclableBridge is destroyed");
        }
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m11056invoke();
        return C5175.f14739;
    }
}

package org.luckypray.dexkit;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
public final /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(Object obj) {
        super(0, obj, C5743.class, "ensureUsable", "ensureUsable()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11110invoke() {
        if (((C5743) this.receiver).m11135().f25170.get()) {
            C5925.m11311("RecyclableBridge is destroyed");
        }
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m11110invoke();
        return C5176.f14739;
    }
}

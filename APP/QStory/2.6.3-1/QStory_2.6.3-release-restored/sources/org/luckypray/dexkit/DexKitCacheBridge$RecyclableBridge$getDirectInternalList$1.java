package org.luckypray.dexkit;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
public final /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(Object obj) {
        super(0, obj, C6573.class, "ensureUsable", "ensureUsable()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m11669invoke() {
        if (((C6573) this.receiver).m11694().f25515.get()) {
            C6755.m11870("RecyclableBridge is destroyed");
        }
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m11669invoke();
        return C6008.f15084;
    }
}

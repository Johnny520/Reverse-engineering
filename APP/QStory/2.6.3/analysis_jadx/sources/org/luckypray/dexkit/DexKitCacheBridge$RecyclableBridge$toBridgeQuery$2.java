package org.luckypray.dexkit;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.luckypray.dexkit.result.C5724;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
final /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2 extends FunctionReferenceImpl implements InterfaceC6558 {
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(Object obj) {
        super(1, obj, InterfaceC5741.class, "build", "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;", 0);
    }

    @Override // p052.InterfaceC6558
    public final C5724 invoke(DexKitBridge dexKitBridge) {
        dexKitBridge.getClass();
        throw AbstractC0053.m159(this.receiver);
    }
}

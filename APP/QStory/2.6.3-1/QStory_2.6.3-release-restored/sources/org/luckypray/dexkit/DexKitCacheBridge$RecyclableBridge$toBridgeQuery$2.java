package org.luckypray.dexkit;

import androidx.activity.AbstractC0900;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.luckypray.dexkit.result.C6554;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
final /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(Object obj) {
        super(1, obj, InterfaceC6571.class, "build", "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;", 0);
    }

    @Override // p068.InterfaceC7387
    public final C6554 invoke(DexKitBridge dexKitBridge) {
        dexKitBridge.getClass();
        throw AbstractC0900.m719(this.receiver);
    }
}

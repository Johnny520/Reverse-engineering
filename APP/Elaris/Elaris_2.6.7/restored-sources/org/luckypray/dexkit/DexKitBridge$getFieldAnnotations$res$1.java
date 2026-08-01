package org.luckypray.dexkit;

import p000.AbstractC0184d9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$getFieldAnnotations$res$1 extends AbstractC0184d9 implements InterfaceC0482u5 {
    final /* synthetic */ long $fieldId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$getFieldAnnotations$res$1(long j) {
        super(1);
        this.$fieldId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0482u5
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final byte[] invoke(long j) {
        return DexKitBridge.Companion.nativeGetFieldAnnotations(j, this.$fieldId);
    }
}

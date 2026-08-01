package org.luckypray.dexkit;

import p000.AbstractC0184d9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$findClass$res$1 extends AbstractC0184d9 implements InterfaceC0482u5 {
    final /* synthetic */ byte[] $encodeBytes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$findClass$res$1(byte[] bArr) {
        super(1);
        this.$encodeBytes = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0482u5
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final byte[] invoke(long j) {
        return DexKitBridge.Companion.nativeFindClass(j, this.$encodeBytes);
    }
}

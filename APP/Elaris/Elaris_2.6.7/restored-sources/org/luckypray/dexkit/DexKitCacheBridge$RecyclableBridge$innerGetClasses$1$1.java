package org.luckypray.dexkit;

import org.luckypray.dexkit.query.FindClass;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ FindClass $query;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1(FindClass findClass) {
        super(0);
        this.$query = findClass;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final FindClass invoke() {
        return this.$query;
    }
}

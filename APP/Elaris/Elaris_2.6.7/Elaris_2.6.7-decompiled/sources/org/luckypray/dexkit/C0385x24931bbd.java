package org.luckypray.dexkit;

import org.luckypray.dexkit.query.FindMethod;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0385x24931bbd extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ FindMethod $query;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385x24931bbd(FindMethod findMethod) {
        super(0);
        this.$query = findMethod;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final FindMethod invoke() {
        return this.$query;
    }
}

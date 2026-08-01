package org.luckypray.dexkit;

import org.luckypray.dexkit.query.FindMethod;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0578x24931bbd extends c50 implements InterfaceC0298hw {
    final /* synthetic */ FindMethod $query;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578x24931bbd(FindMethod findMethod) {
        super(0);
        this.$query = findMethod;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final FindMethod invoke() {
        return this.$query;
    }
}

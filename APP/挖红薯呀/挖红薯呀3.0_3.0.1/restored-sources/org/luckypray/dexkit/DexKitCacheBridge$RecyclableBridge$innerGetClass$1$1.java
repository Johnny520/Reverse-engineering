package org.luckypray.dexkit;

import org.luckypray.dexkit.query.FindClass;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ FindClass $query;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1(FindClass findClass) {
        super(0);
        this.$query = findClass;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final FindClass invoke() {
        return this.$query;
    }
}

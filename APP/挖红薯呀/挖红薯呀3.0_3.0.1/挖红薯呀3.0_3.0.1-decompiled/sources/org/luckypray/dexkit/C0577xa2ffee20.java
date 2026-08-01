package org.luckypray.dexkit;

import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.wrap.DexMethod;
import p000.InterfaceC0742sw;
import p000.c50;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577xa2ffee20 extends c50 implements InterfaceC0742sw {
    public static final C0577xa2ffee20 INSTANCE = new C0577xa2ffee20();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0577xa2ffee20() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0742sw
    public final DexMethod invoke(MethodData methodData) {
        methodData.getClass();
        return methodData.toDexMethod();
    }
}

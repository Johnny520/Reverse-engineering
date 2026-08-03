package org.luckypray.dexkit;

import Yue.C5153;
import Yue.C8107;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC7507;
import org.luckypray.dexkit.DexKitCacheBridge;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1\n*L\n1#1,1819:1\n*E\n"})
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 extends C5153 implements InterfaceC5122<C8107> {
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(Object obj) {
        super(0, obj, DexKitCacheBridge.RecyclableBridge.class, "ensureUsable", "ensureUsable()V", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5122
    public /* bridge */ /* synthetic */ C8107 invoke() {
        invoke2();
        return C8107.f3222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DexKitCacheBridge.RecyclableBridge) this.receiver).ensureUsable();
    }
}

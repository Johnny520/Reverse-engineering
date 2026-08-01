package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;", "invoke", "()Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class DexKitCacheBridge$create$2 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ String $appTag;
    final /* synthetic */ byte[][] $dexArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$create$2(String str, byte[][] bArr) {
        super(0);
        this.$appTag = str;
        this.$dexArray = bArr;
    }

    @Override // p052.InterfaceC6543
    public final C5743 invoke() {
        String str = this.$appTag;
        byte[][] bArr = this.$dexArray;
        str.getClass();
        bArr.getClass();
        return new C5743(str, null, bArr, null);
    }
}

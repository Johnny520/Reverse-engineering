package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;", "invoke", "()Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
final class DexKitCacheBridge$create$2 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ String $appTag;
    final /* synthetic */ byte[][] $dexArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$create$2(String str, byte[][] bArr) {
        super(0);
        this.$appTag = str;
        this.$dexArray = bArr;
    }

    @Override // p068.InterfaceC7372
    public final C6573 invoke() {
        String str = this.$appTag;
        byte[][] bArr = this.$dexArray;
        str.getClass();
        bArr.getClass();
        return new C6573(str, null, bArr, null);
    }
}

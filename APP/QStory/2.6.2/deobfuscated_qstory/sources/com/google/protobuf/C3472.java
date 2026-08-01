package com.google.protobuf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3472 implements InterfaceC3471, InterfaceC3397, InterfaceC3369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11146;

    public C3472() {
        this.f11146 = 2;
        new ConcurrentHashMap();
        new Stack();
        new HashMap();
    }

    @Override // com.google.protobuf.InterfaceC3397
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC3398 mo7359(int i) {
        switch (this.f11146) {
            case 3:
                return DescriptorProtos$Edition.forNumber(i);
            case 4:
                return DescriptorProtos$SymbolVisibility.forNumber(i);
            case 5:
            default:
                return Syntax.forNumber(i);
            case 6:
                return NullValue.forNumber(i);
        }
    }

    @Override // com.google.protobuf.InterfaceC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo7492() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3471
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public byte[] mo7702(int i, byte[] bArr, int i2) {
        switch (this.f11146) {
            case 0:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    public /* synthetic */ C3472(int i) {
        this.f11146 = i;
    }
}

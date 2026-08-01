package com.google.protobuf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3473 implements InterfaceC3472, InterfaceC3398, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11151;

    public C3473() {
        this.f11151 = 2;
        new ConcurrentHashMap();
        new Stack();
        new HashMap();
    }

    @Override // com.google.protobuf.InterfaceC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo7479() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3398
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC3399 mo7346(int i) {
        switch (this.f11151) {
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

    @Override // com.google.protobuf.InterfaceC3472
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public byte[] mo7689(int i, byte[] bArr, int i2) {
        switch (this.f11151) {
            case 0:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    public /* synthetic */ C3473(int i) {
        this.f11151 = i;
    }
}

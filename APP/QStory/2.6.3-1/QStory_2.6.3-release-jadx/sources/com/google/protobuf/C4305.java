package com.google.protobuf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4305 implements InterfaceC4304, InterfaceC4230, InterfaceC4202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11496;

    public C4305() {
        this.f11496 = 2;
        new ConcurrentHashMap();
        new Stack();
        new HashMap();
    }

    @Override // com.google.protobuf.InterfaceC4202
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8038() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC4230
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4231 mo7905(int i) {
        switch (this.f11496) {
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

    @Override // com.google.protobuf.InterfaceC4304
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public byte[] mo8248(int i, byte[] bArr, int i2) {
        switch (this.f11496) {
            case 0:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    public /* synthetic */ C4305(int i) {
        this.f11496 = i;
    }
}

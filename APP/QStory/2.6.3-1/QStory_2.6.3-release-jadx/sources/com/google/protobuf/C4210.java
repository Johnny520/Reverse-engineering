package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲苏兰楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4210 implements InterfaceC4284 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object[] f11369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f11370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4273 f11371;

    public C4210(InterfaceC4273 interfaceC4273, String str, Object[] objArr) {
        this.f11371 = interfaceC4273;
        this.f11370 = str;
        this.f11369 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11368 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f11368 = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4284
    public final ProtoSyntax getSyntax() {
        int i = this.f11368;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.InterfaceC4284
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4273 mo8040() {
        return this.f11371;
    }

    @Override // com.google.protobuf.InterfaceC4284
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8041() {
        return (this.f11368 & 2) == 2;
    }
}

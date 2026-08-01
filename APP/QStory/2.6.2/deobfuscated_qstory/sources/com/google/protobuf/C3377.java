package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲苏兰楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3377 implements InterfaceC3451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f11018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object[] f11019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f11020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3440 f11021;

    public C3377(InterfaceC3440 interfaceC3440, String str, Object[] objArr) {
        this.f11021 = interfaceC3440;
        this.f11020 = str;
        this.f11019 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11018 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f11018 = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3451
    public final ProtoSyntax getSyntax() {
        int i = this.f11018;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.InterfaceC3451
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3440 mo7494() {
        return this.f11021;
    }

    @Override // com.google.protobuf.InterfaceC3451
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo7495() {
        return (this.f11018 & 2) == 2;
    }
}

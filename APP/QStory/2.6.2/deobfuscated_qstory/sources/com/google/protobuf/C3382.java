package com.google.protobuf;

import bsh.C2632;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3382 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3440 f11027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile ByteString f11028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC3440 f11029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3696 f11030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteString f11031;

    public C3382(InterfaceC3452 interfaceC3452, C3696 c3696, ByteString byteString) {
        if (c3696 == null) {
            C2632.m5298("found null ExtensionRegistry");
            throw null;
        }
        if (byteString == null) {
            C2632.m5298("found null ByteString");
            throw null;
        }
        this.f11027 = interfaceC3452;
        this.f11030 = c3696;
        this.f11031 = byteString;
    }

    public final boolean equals(Object obj) {
        return m7501().equals(obj);
    }

    public final int hashCode() {
        return m7501().hashCode();
    }

    public final String toString() {
        return m7501().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ByteString m7500() {
        ByteString byteString = this.f11031;
        if (byteString != null) {
            return byteString;
        }
        if (this.f11028 != null) {
            return this.f11028;
        }
        synchronized (this) {
            try {
                if (this.f11028 != null) {
                    return this.f11028;
                }
                if (this.f11029 == null) {
                    this.f11028 = ByteString.EMPTY;
                } else {
                    this.f11028 = this.f11029.toByteString();
                }
                return this.f11028;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3440 m7501() {
        InterfaceC3440 interfaceC3440 = this.f11027;
        if (this.f11029 == null) {
            synchronized (this) {
                if (this.f11029 == null) {
                    try {
                        if (this.f11031 != null) {
                            this.f11029 = ((AbstractC3527) interfaceC3440.getParserForType()).m7767(this.f11031, this.f11030);
                            this.f11028 = this.f11031;
                        } else {
                            this.f11029 = interfaceC3440;
                            this.f11028 = ByteString.EMPTY;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f11029 = interfaceC3440;
                        this.f11028 = ByteString.EMPTY;
                    }
                }
            }
        }
        return this.f11029;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7502() {
        ByteString byteString = this.f11031;
        int size = byteString != null ? byteString.size() : this.f11028 != null ? this.f11028.size() : this.f11029 != null ? this.f11029.getSerializedSize() : 0;
        return AbstractC3461.m7648(size) + size;
    }
}

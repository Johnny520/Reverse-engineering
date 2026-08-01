package com.google.protobuf;

import bsh.C3466;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC4273 f11377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile ByteString f11378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC4273 f11379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4529 f11380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteString f11381;

    public C4215(InterfaceC4285 interfaceC4285, C4529 c4529, ByteString byteString) {
        if (c4529 == null) {
            C3466.m5903("found null ExtensionRegistry");
            throw null;
        }
        if (byteString == null) {
            C3466.m5903("found null ByteString");
            throw null;
        }
        this.f11377 = interfaceC4285;
        this.f11380 = c4529;
        this.f11381 = byteString;
    }

    public final boolean equals(Object obj) {
        return m8047().equals(obj);
    }

    public final int hashCode() {
        return m8047().hashCode();
    }

    public final String toString() {
        return m8047().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ByteString m8046() {
        ByteString byteString = this.f11381;
        if (byteString != null) {
            return byteString;
        }
        if (this.f11378 != null) {
            return this.f11378;
        }
        synchronized (this) {
            try {
                if (this.f11378 != null) {
                    return this.f11378;
                }
                if (this.f11379 == null) {
                    this.f11378 = ByteString.EMPTY;
                } else {
                    this.f11378 = this.f11379.toByteString();
                }
                return this.f11378;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4273 m8047() {
        InterfaceC4273 interfaceC4273 = this.f11377;
        if (this.f11379 == null) {
            synchronized (this) {
                if (this.f11379 == null) {
                    try {
                        if (this.f11381 != null) {
                            this.f11379 = ((AbstractC4360) interfaceC4273.getParserForType()).m8313(this.f11381, this.f11380);
                            this.f11378 = this.f11381;
                        } else {
                            this.f11379 = interfaceC4273;
                            this.f11378 = ByteString.EMPTY;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f11379 = interfaceC4273;
                        this.f11378 = ByteString.EMPTY;
                    }
                }
            }
        }
        return this.f11379;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8048() {
        ByteString byteString = this.f11381;
        int size = byteString != null ? byteString.size() : this.f11378 != null ? this.f11378.size() : this.f11379 != null ? this.f11379.getSerializedSize() : 0;
        return AbstractC4294.m8194(size) + size;
    }
}

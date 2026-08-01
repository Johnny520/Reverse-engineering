package com.google.protobuf;

import bsh.C2633;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3441 f11032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile ByteString f11033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC3441 f11034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3697 f11035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteString f11036;

    public C3383(InterfaceC3453 interfaceC3453, C3697 c3697, ByteString byteString) {
        if (c3697 == null) {
            C2633.m5343("found null ExtensionRegistry");
            throw null;
        }
        if (byteString == null) {
            C2633.m5343("found null ByteString");
            throw null;
        }
        this.f11032 = interfaceC3453;
        this.f11035 = c3697;
        this.f11036 = byteString;
    }

    public final boolean equals(Object obj) {
        return m7488().equals(obj);
    }

    public final int hashCode() {
        return m7488().hashCode();
    }

    public final String toString() {
        return m7488().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ByteString m7487() {
        ByteString byteString = this.f11036;
        if (byteString != null) {
            return byteString;
        }
        if (this.f11033 != null) {
            return this.f11033;
        }
        synchronized (this) {
            try {
                if (this.f11033 != null) {
                    return this.f11033;
                }
                if (this.f11034 == null) {
                    this.f11033 = ByteString.EMPTY;
                } else {
                    this.f11033 = this.f11034.toByteString();
                }
                return this.f11033;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3441 m7488() {
        InterfaceC3441 interfaceC3441 = this.f11032;
        if (this.f11034 == null) {
            synchronized (this) {
                if (this.f11034 == null) {
                    try {
                        if (this.f11036 != null) {
                            this.f11034 = ((AbstractC3528) interfaceC3441.getParserForType()).m7754(this.f11036, this.f11035);
                            this.f11033 = this.f11036;
                        } else {
                            this.f11034 = interfaceC3441;
                            this.f11033 = ByteString.EMPTY;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f11034 = interfaceC3441;
                        this.f11033 = ByteString.EMPTY;
                    }
                }
            }
        }
        return this.f11034;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7489() {
        ByteString byteString = this.f11036;
        int size = byteString != null ? byteString.size() : this.f11033 != null ? this.f11033.size() : this.f11034 != null ? this.f11034.getSerializedSize() : 0;
        return AbstractC3462.m7635(size) + size;
    }
}

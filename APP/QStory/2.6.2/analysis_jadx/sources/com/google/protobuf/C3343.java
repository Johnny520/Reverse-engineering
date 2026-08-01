package com.google.protobuf;

import bsh.C2632;
import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3343 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteString.LeafByteString f10974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayDeque f10975;

    public C3343(ByteString byteString) {
        if (!(byteString instanceof RopeByteString)) {
            this.f10975 = null;
            this.f10974 = (ByteString.LeafByteString) byteString;
            return;
        }
        RopeByteString ropeByteString = (RopeByteString) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.getTreeDepth());
        this.f10975 = arrayDeque;
        arrayDeque.push(ropeByteString);
        ByteString byteString2 = ropeByteString.left;
        while (byteString2 instanceof RopeByteString) {
            RopeByteString ropeByteString2 = (RopeByteString) byteString2;
            this.f10975.push(ropeByteString2);
            byteString2 = ropeByteString2.left;
        }
        this.f10974 = (ByteString.LeafByteString) byteString2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10974 != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString = this.f10974;
        ByteString.LeafByteString leafByteString2 = null;
        if (leafByteString == null) {
            C2632.m5291();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.f10975;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            ByteString byteString = ((RopeByteString) arrayDeque.pop()).right;
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                arrayDeque.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            ByteString.LeafByteString leafByteString3 = (ByteString.LeafByteString) byteString;
            if (!leafByteString3.isEmpty()) {
                leafByteString2 = leafByteString3;
                break;
            }
        }
        this.f10974 = leafByteString2;
        return leafByteString;
    }
}

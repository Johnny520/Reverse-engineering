package com.google.protobuf;

import bsh.C3466;
import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4176 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteString.LeafByteString f11324;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayDeque f11325;

    public C4176(ByteString byteString) {
        if (!(byteString instanceof RopeByteString)) {
            this.f11325 = null;
            this.f11324 = (ByteString.LeafByteString) byteString;
            return;
        }
        RopeByteString ropeByteString = (RopeByteString) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.getTreeDepth());
        this.f11325 = arrayDeque;
        arrayDeque.push(ropeByteString);
        ByteString byteString2 = ropeByteString.left;
        while (byteString2 instanceof RopeByteString) {
            RopeByteString ropeByteString2 = (RopeByteString) byteString2;
            this.f11325.push(ropeByteString2);
            byteString2 = ropeByteString2.left;
        }
        this.f11324 = (ByteString.LeafByteString) byteString2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11324 != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString = this.f11324;
        ByteString.LeafByteString leafByteString2 = null;
        if (leafByteString == null) {
            C3466.m5896();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.f11325;
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
        this.f11324 = leafByteString2;
        return leafByteString;
    }
}

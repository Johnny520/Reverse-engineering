package com.google.protobuf;

import bsh.C2632;
import com.google.protobuf.ByteString;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    private boolean allPiecesValidUtf8() {
        ByteString.LeafByteString leafByteString;
        ArrayDeque arrayDeque = new ArrayDeque(getTreeDepth());
        arrayDeque.push(this);
        ByteString byteString = this.left;
        while (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            arrayDeque.push(ropeByteString);
            byteString = ropeByteString.left;
        }
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) byteString;
        while (true) {
            if (!(leafByteString2 != null)) {
                return true;
            }
            if (leafByteString2 == null) {
                C2632.m5291();
                return false;
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString2 = ((RopeByteString) arrayDeque.pop()).right;
                while (byteString2 instanceof RopeByteString) {
                    RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                    arrayDeque.push(ropeByteString2);
                    byteString2 = ropeByteString2.left;
                }
                leafByteString = (ByteString.LeafByteString) byteString2;
                if (!leafByteString.isEmpty()) {
                    break;
                }
            }
            if (!leafByteString2.isValidUtf8()) {
                return false;
            }
            leafByteString2 = leafByteString;
        }
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (byteString2.size() + ropeByteString.right.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        C3426 c3426 = new C3426(2);
        c3426.m7571(byteString);
        c3426.m7571(byteString2);
        ArrayDeque arrayDeque = (ArrayDeque) c3426.f11084;
        ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2, null);
        }
        return ropeByteString2;
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(getTreeDepth());
        arrayDeque.push(this);
        ByteString byteString = this.left;
        while (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            arrayDeque.push(ropeByteString);
            byteString = ropeByteString.left;
        }
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) byteString;
        while (true) {
            if (!(leafByteString != null)) {
                return arrayList;
            }
            ByteString.LeafByteString leafByteString2 = null;
            if (leafByteString == null) {
                C2632.m5291();
                return null;
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    break;
                }
                ByteString byteString2 = ((RopeByteString) arrayDeque.pop()).right;
                while (byteString2 instanceof RopeByteString) {
                    RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                    arrayDeque.push(ropeByteString2);
                    byteString2 = ropeByteString2.left;
                }
                ByteString.LeafByteString leafByteString3 = (ByteString.LeafByteString) byteString2;
                if (!leafByteString3.isEmpty()) {
                    leafByteString2 = leafByteString3;
                    break;
                }
            }
            arrayList.add(leafByteString.asReadOnlyByteBuffer());
            leafByteString = leafByteString2;
        }
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.protobuf.ByteString
    public boolean equalsInternal(ByteString byteString) {
        C3343 c3343 = new C3343(this);
        ByteString.LeafByteString leafByteStringM7403 = c3343.m7403();
        C3343 c33432 = new C3343(byteString);
        ByteString.LeafByteString leafByteStringM74032 = c33432.m7403();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteStringM7403.size() - i;
            int size2 = leafByteStringM74032.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? leafByteStringM7403.equalsRange(leafByteStringM74032, i2, iMin) : leafByteStringM74032.equalsRange(leafByteStringM7403, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                C2632.m5296();
                return false;
            }
            if (iMin == size) {
                i = 0;
                leafByteStringM7403 = c3343.m7403();
            } else {
                i += iMin;
                leafByteStringM7403 = leafByteStringM7403;
            }
            if (iMin == size2) {
                leafByteStringM74032 = c33432.m7403();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        if (allPiecesValidUtf8()) {
            return true;
        }
        byte[] byteArray = toByteArray();
        return AbstractC3723.f11538.mo7545(0, byteArray, byteArray.length);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new C3363(this);
    }

    @Override // com.google.protobuf.ByteString
    public AbstractC3473 newCodedInput() {
        List<ByteBuffer> listAsReadOnlyByteBufferList = asReadOnlyByteBufferList();
        CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC3473.f11147;
        C3400 c3400 = new C3400();
        c3400.f11050 = listAsReadOnlyByteBufferList.iterator();
        c3400.f11049 = 0;
        for (ByteBuffer byteBuffer : listAsReadOnlyByteBufferList) {
            c3400.f11049++;
        }
        c3400.f11043 = -1;
        if (!c3400.m7513()) {
            c3400.f11048 = AbstractC3401.f11051;
            c3400.f11042 = 0;
            c3400.f11045 = 0L;
        }
        return AbstractC3473.m7708(c3400);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new C3342(this);
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.totalLength);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        return i2 <= i3 ? this.left.substring(i, i2) : i >= i3 ? this.right.substring(i - i3, i2 - i3) : new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(AbstractC3538 abstractC3538) {
        this.right.writeToReverse(abstractC3538);
        this.left.writeToReverse(abstractC3538);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(AbstractC3538 abstractC3538) {
        this.left.writeTo(abstractC3538);
        this.right.writeTo(abstractC3538);
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C3363 c3363) {
        this(byteString, byteString2);
    }
}

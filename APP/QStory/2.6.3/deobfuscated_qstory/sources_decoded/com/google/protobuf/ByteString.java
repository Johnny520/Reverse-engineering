package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.slf4j.Marker;
import p009.AbstractC6183;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(AbstractC3402.f11057);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final InterfaceC3472 byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    static {
        byteArrayCopier = AbstractC3547.m7786() ? new C3473(1) : new C3473(0);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C3537(0);
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i < 1) {
            Locale locale = Locale.ROOT;
            C5925.m11310(AbstractC0053.m162(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC6183.m11591(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC6183.m11588(i, "Index < 0: "));
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            C7547.m12772(AbstractC0053.m162(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        C7547.m12772(AbstractC6183.m11591(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? EMPTY : balancedConcat(iterable.iterator(), size);
    }

    public static ByteString copyFromUtf8(String str) {
        return str.isEmpty() ? EMPTY : new LiteralByteString(str.getBytes(AbstractC3402.f11059));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i) {
        int iHexDigit = hexDigit(str.charAt(i));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbM11585 = AbstractC6183.m11585("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbM11585.append(str.charAt(i));
        sbM11585.append(" at index ");
        sbM11585.append(i);
        throw new NumberFormatException(sbM11585.toString());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Invalid hexString ", str, " of length ");
            sbM11585.append(str.length());
            sbM11585.append(" must be even.");
            throw new NumberFormatException(sbM11585.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(str, i2 + 1) | (extractHexDigit(str, i2) << 4));
        }
        return new LiteralByteString(bArr);
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    public static C3470 newCodedBuilder(int i) {
        return new C3470(i);
    }

    public static C3469 newOutput() {
        return new C3469(128);
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i = Math.min(i * 2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean subArrayEquals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        checkRange(i, i4, bArr.length);
        checkRange(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b) {
        return b & DefaultClassResolver.NAME;
    }

    private String truncateAndEscapeForDisplay() {
        return size() <= 50 ? AbstractC3413.m7514(toByteArray()) : AbstractC3413.m7514(substring(0, 47).toByteArray()).concat("...");
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer, boolean z) throws InvalidProtocolBufferException {
        boolean zM7526;
        if (byteBuffer.remaining() == 0) {
            return EMPTY;
        }
        if (z) {
            AbstractC3413 abstractC3413 = AbstractC3724.f11543;
            int iPosition = byteBuffer.position();
            int iRemaining = byteBuffer.remaining() + iPosition;
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                zM7526 = abstractC3413.mo7532(iPosition + iArrayOffset, byteBuffer.array(), iArrayOffset + iRemaining);
            } else if (byteBuffer.isDirect()) {
                zM7526 = abstractC3413.mo7531(byteBuffer, iPosition, iRemaining);
            } else {
                abstractC3413.getClass();
                zM7526 = AbstractC3413.m7526(byteBuffer, iPosition, iRemaining);
            }
            if (!zM7526) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
        }
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byte[] bArr = new byte[byteBufferSlice.remaining()];
        byteBufferSlice.get(bArr);
        return new LiteralByteString(bArr);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + Marker.ANY_NON_NULL_MARKER + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = size();
        if (size != byteString.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsInternal(byteString);
        }
        return false;
    }

    public abstract boolean equalsInternal(ByteString byteString);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new C3540(this);
    }

    public abstract AbstractC3474 newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return AbstractC3402.f11057;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strTruncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0053.m151(sb, strTruncateAndEscapeForDisplay, "\">");
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(AbstractC3402.f11059);
    }

    public abstract void writeTo(AbstractC3539 abstractC3539);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i, int i2) {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    public abstract void writeToReverse(AbstractC3539 abstractC3539);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public /* synthetic */ LeafByteString(C3540 c3540) {
            this();
        }

        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // com.google.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.ByteString
        public void writeToReverse(AbstractC3539 abstractC3539) {
            writeTo(abstractC3539);
        }

        private LeafByteString() {
        }
    }

    public static C3469 newOutput(int i) {
        return new C3469(i);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class BoundedByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;
        private final int length;
        private final int offset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(null);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytes = bArr;
            this.offset = i;
            this.length = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString
        public ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, this.offset, this.length).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.offset + i];
        }

        @Override // com.google.protobuf.ByteString
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, this.offset, this.length);
        }

        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, this.offset + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public boolean equalsInternal(ByteString byteString) {
            return ((byteString instanceof LiteralByteString) || (byteString instanceof BoundedByteString)) ? equalsRange(byteString, 0, size()) : byteString.equalsInternal(this);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                C7547.m12776(AbstractC0053.m149(i, i2, "Ran off end of other: ", ", ", ", "), byteString.size());
                return false;
            }
            if (byteString instanceof LiteralByteString) {
                return ByteString.subArrayEquals(this.bytes, this.offset, ((LiteralByteString) byteString).bytes, i, i2);
            }
            if (byteString instanceof BoundedByteString) {
                BoundedByteString boundedByteString = (BoundedByteString) byteString;
                return ByteString.subArrayEquals(this.bytes, this.offset, boundedByteString.bytes, boundedByteString.offset + i, i2);
            }
            ByteString byteStringSubstring = byteString.substring(i, i3);
            int i4 = this.offset;
            return byteStringSubstring.equals(substring(i4, i2 + i4));
        }

        @Override // com.google.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[this.offset + i];
        }

        @Override // com.google.protobuf.ByteString
        public boolean isValidUtf8() {
            byte[] bArr = this.bytes;
            int i = this.offset;
            return AbstractC3724.f11543.mo7532(i, bArr, this.length + i);
        }

        @Override // com.google.protobuf.ByteString
        public AbstractC3474 newCodedInput() {
            return AbstractC3474.m7694(this.bytes, this.offset, this.length, true);
        }

        @Override // com.google.protobuf.ByteString
        public InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // com.google.protobuf.ByteString
        public int partialHash(int i, int i2, int i3) {
            return AbstractC3402.m7501(i, this.bytes, this.offset + i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.length;
        }

        @Override // com.google.protobuf.ByteString
        public ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, this.length);
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, this.offset + i, iCheckRange);
        }

        @Override // com.google.protobuf.ByteString
        public String toStringInternal(Charset charset) {
            return new String(this.bytes, this.offset, this.length, charset);
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        public void writeTo(AbstractC3539 abstractC3539) {
            abstractC3539.mo7686(this.offset, this.bytes, this.length);
        }

        @Override // com.google.protobuf.ByteString
        public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, this.offset + i, i2);
        }

        @Override // com.google.protobuf.ByteString
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes);
        }

        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equalsInternal(ByteString byteString) {
            return byteString instanceof LiteralByteString ? Arrays.equals(this.bytes, ((LiteralByteString) byteString).bytes) : byteString instanceof BoundedByteString ? equalsRange(byteString, 0, size()) : byteString.equalsInternal(this);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                C7547.m12776(AbstractC0053.m149(i, i2, "Ran off end of other: ", ", ", ", "), byteString.size());
                return false;
            }
            if (byteString instanceof LiteralByteString) {
                return ByteString.subArrayEquals(this.bytes, 0, ((LiteralByteString) byteString).bytes, i, i2);
            }
            if (!(byteString instanceof BoundedByteString)) {
                return byteString.substring(i, i3).equals(substring(0, i2));
            }
            BoundedByteString boundedByteString = (BoundedByteString) byteString;
            return ByteString.subArrayEquals(this.bytes, 0, boundedByteString.bytes, boundedByteString.offset + i, i2);
        }

        @Override // com.google.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public boolean isValidUtf8() {
            byte[] bArr = this.bytes;
            return AbstractC3724.f11543.mo7532(0, bArr, bArr.length);
        }

        @Override // com.google.protobuf.ByteString
        public AbstractC3474 newCodedInput() {
            return AbstractC3474.m7694(this.bytes, 0, size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, 0, size());
        }

        @Override // com.google.protobuf.ByteString
        public int partialHash(int i, int i2, int i3) {
            return AbstractC3402.m7501(i, this.bytes, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, i, iCheckRange);
        }

        @Override // com.google.protobuf.ByteString
        public String toStringInternal(Charset charset) {
            return new String(this.bytes, charset);
        }

        @Override // com.google.protobuf.ByteString
        public void writeTo(AbstractC3539 abstractC3539) {
            abstractC3539.mo7686(0, this.bytes, size());
        }

        @Override // com.google.protobuf.ByteString
        public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, i, i2);
        }

        @Override // com.google.protobuf.ByteString
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public static ByteString readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, 8192);
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2, boolean z) throws InvalidProtocolBufferException {
        if (i2 == 0) {
            return EMPTY;
        }
        int i3 = i + i2;
        checkRange(i, i3, bArr.length);
        if (z && !AbstractC3724.f11543.mo7532(i, bArr, i3)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        return new LiteralByteString(byteArrayCopier.mo7689(i, bArr, i2));
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        if (i == 0) {
            return EMPTY;
        }
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return isEmpty() ? "" : toStringInternal(charset);
    }

    @Deprecated
    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    @Deprecated
    public static ByteString copyFrom(String str, String str2) {
        return str.isEmpty() ? EMPTY : new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return str.isEmpty() ? EMPTY : new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        try {
            return copyFrom(bArr, i, i2, false);
        } catch (InvalidProtocolBufferException e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        try {
            return wrap(byteBuffer, false);
        } catch (InvalidProtocolBufferException e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(byte[] bArr, int i, int i2, boolean z) throws InvalidProtocolBufferException {
        if (z) {
            if (!AbstractC3724.f11543.mo7532(i, bArr, i + i2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
        }
        return new BoundedByteString(bArr, i, i2);
    }

    public static ByteString wrap(byte[] bArr) {
        try {
            return wrap(bArr, false);
        } catch (InvalidProtocolBufferException e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(byte[] bArr, boolean z) throws InvalidProtocolBufferException {
        if (bArr.length == 0) {
            return EMPTY;
        }
        if (z && !AbstractC3724.f11543.mo7532(0, bArr, bArr.length)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        try {
            return wrap(bArr, i, i2, false);
        } catch (InvalidProtocolBufferException e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }
}

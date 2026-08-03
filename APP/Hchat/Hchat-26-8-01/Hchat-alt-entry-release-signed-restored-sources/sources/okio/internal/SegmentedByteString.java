package okio.internal;

import okio.Buffer;
import okio.ByteString;
import okio.C6147SegmentedByteString;
import okio.Segment;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentedByteString {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int binarySearch(int[] iArr, int i9, int i10, int i11) {
        iArr.getClass();
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i9) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i9) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonCopyInto(C6147SegmentedByteString c6147SegmentedByteString, int i9, byte[] bArr, int i10, int i11) {
        c6147SegmentedByteString.getClass();
        bArr.getClass();
        long j3 = i11;
        okio.SegmentedByteString.checkOffsetAndCount(c6147SegmentedByteString.size(), i9, j3);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j3);
        int i12 = i11 + i9;
        int iSegment = segment(c6147SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c6147SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            int i16 = (i9 - i13) + i15;
            AbstractC4165l.m8380o0(c6147SegmentedByteString.getSegments$okio()[iSegment], i10, i16, bArr, i16 + iMin);
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonEquals(C6147SegmentedByteString c6147SegmentedByteString, Object obj) {
        c6147SegmentedByteString.getClass();
        if (obj == c6147SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c6147SegmentedByteString.size() && c6147SegmentedByteString.rangeEquals(0, byteString, 0, c6147SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonGetSize(C6147SegmentedByteString c6147SegmentedByteString) {
        c6147SegmentedByteString.getClass();
        return c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonHashCode(C6147SegmentedByteString c6147SegmentedByteString) {
        c6147SegmentedByteString.getClass();
        int hashCode$okio = c6147SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c6147SegmentedByteString.getSegments$okio().length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int i12 = c6147SegmentedByteString.getDirectory$okio()[length + i9];
            int i13 = c6147SegmentedByteString.getDirectory$okio()[i9];
            byte[] bArr = c6147SegmentedByteString.getSegments$okio()[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        c6147SegmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte commonInternalGet(C6147SegmentedByteString c6147SegmentedByteString, int i9) {
        c6147SegmentedByteString.getClass();
        okio.SegmentedByteString.checkOffsetAndCount(c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length - 1], i9, 1L);
        int iSegment = segment(c6147SegmentedByteString, i9);
        return c6147SegmentedByteString.getSegments$okio()[iSegment][(i9 - (iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonRangeEquals(C6147SegmentedByteString c6147SegmentedByteString, int i9, byte[] bArr, int i10, int i11) {
        c6147SegmentedByteString.getClass();
        bArr.getClass();
        if (i9 < 0 || i9 > c6147SegmentedByteString.size() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(c6147SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c6147SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!okio.SegmentedByteString.arrayRangeEquals(c6147SegmentedByteString.getSegments$okio()[iSegment], (i9 - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString commonSubstring(C6147SegmentedByteString c6147SegmentedByteString, int i9, int i10) {
        c6147SegmentedByteString.getClass();
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c6147SegmentedByteString, i10);
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "beginIndex=", " < 0"));
            return null;
        }
        if (iResolveDefaultParameter > c6147SegmentedByteString.size()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbM2257t.append(c6147SegmentedByteString.size());
            sbM2257t.append(')');
            throw new IllegalArgumentException(sbM2257t.toString().toString());
        }
        int i11 = iResolveDefaultParameter - i9;
        if (i11 < 0) {
            C2104o.m5291q(AbstractC3199a.m6837j(iResolveDefaultParameter, "endIndex=", " < beginIndex=", i9));
            return null;
        }
        if (i9 == 0 && iResolveDefaultParameter == c6147SegmentedByteString.size()) {
            return c6147SegmentedByteString;
        }
        if (i9 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c6147SegmentedByteString, i9);
        int iSegment2 = segment(c6147SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) AbstractC4165l.m8386u0(c6147SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(c6147SegmentedByteString.getDirectory$okio()[i12] - i9, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? c6147SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i9 - i15) + iArr[length];
        return new C6147SegmentedByteString(bArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonToByteArray(C6147SegmentedByteString c6147SegmentedByteString) {
        c6147SegmentedByteString.getClass();
        byte[] bArr = new byte[c6147SegmentedByteString.size()];
        int length = c6147SegmentedByteString.getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int i12 = c6147SegmentedByteString.getDirectory$okio()[length + i9];
            int i13 = c6147SegmentedByteString.getDirectory$okio()[i9];
            int i14 = i13 - i10;
            AbstractC4165l.m8380o0(c6147SegmentedByteString.getSegments$okio()[i9], i11, i12, bArr, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonWrite(C6147SegmentedByteString c6147SegmentedByteString, Buffer buffer, int i9, int i10) {
        c6147SegmentedByteString.getClass();
        buffer.getClass();
        int i11 = i9 + i10;
        int iSegment = segment(c6147SegmentedByteString, i9);
        while (i9 < i11) {
            int i12 = iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c6147SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i9;
            int i15 = (i9 - i12) + i14;
            Segment segment = new Segment(c6147SegmentedByteString.getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                segment2.getClass();
                Segment segment3 = segment2.prev;
                segment3.getClass();
                segment3.push(segment);
            }
            i9 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void forEachSegment(C6147SegmentedByteString c6147SegmentedByteString, int i9, int i10, InterfaceC1236q interfaceC1236q) {
        int iSegment = segment(c6147SegmentedByteString, i9);
        while (i9 < i10) {
            int i11 = iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = c6147SegmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i9;
            interfaceC1236q.mo734b(c6147SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf((i9 - i11) + i13), Integer.valueOf(iMin));
            i9 += iMin;
            iSegment++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int segment(C6147SegmentedByteString c6147SegmentedByteString, int i9) {
        c6147SegmentedByteString.getClass();
        int iBinarySearch = binarySearch(c6147SegmentedByteString.getDirectory$okio(), i9 + 1, 0, c6147SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public static final void forEachSegment(C6147SegmentedByteString c6147SegmentedByteString, InterfaceC1236q interfaceC1236q) {
        c6147SegmentedByteString.getClass();
        interfaceC1236q.getClass();
        int length = c6147SegmentedByteString.getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = c6147SegmentedByteString.getDirectory$okio()[length + i9];
            int i12 = c6147SegmentedByteString.getDirectory$okio()[i9];
            interfaceC1236q.mo734b(c6147SegmentedByteString.getSegments$okio()[i9], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i9++;
            i10 = i12;
        }
    }

    public static final boolean commonRangeEquals(C6147SegmentedByteString c6147SegmentedByteString, int i9, ByteString byteString, int i10, int i11) {
        c6147SegmentedByteString.getClass();
        byteString.getClass();
        if (i9 < 0 || i9 > c6147SegmentedByteString.size() - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(c6147SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c6147SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c6147SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c6147SegmentedByteString.getDirectory$okio()[c6147SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!byteString.rangeEquals(i10, c6147SegmentedByteString.getSegments$okio()[iSegment], (i9 - i13) + i15, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }
}

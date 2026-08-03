package okio;

import gg.AbstractC1411g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import tf.AbstractC4159f;
import tf.AbstractC4170q;
import tf.C4163j;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Options extends AbstractC4159f implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static final Options m6812of(ByteString... byteStringArr) {
        return Companion.m6813of(byteStringArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public int getSize() {
        return this.byteStrings.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] getTrie$okio() {
        return this.trie;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.Options.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void buildTrieRecursive(long j3, Buffer buffer, int i9, List<? extends ByteString> list, int i10, int i11, List<Integer> list2) {
            int i12;
            int i13;
            int i14;
            long j4;
            int i15 = i9;
            if (i10 >= i11) {
                C2104o.m5294t("Failed requirement.");
                return;
            }
            for (int i16 = i10; i16 < i11; i16++) {
                if (list.get(i16).size() < i15) {
                    C2104o.m5294t("Failed requirement.");
                    return;
                }
            }
            ByteString byteString = list.get(i10);
            ByteString byteString2 = list.get(i11 - 1);
            if (i15 == byteString.size()) {
                int iIntValue = list2.get(i10).intValue();
                int i17 = i10 + 1;
                ByteString byteString3 = list.get(i17);
                i12 = i17;
                i13 = iIntValue;
                byteString = byteString3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (byteString.getByte(i15) == byteString2.getByte(i15)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i18 = 0;
                for (int i19 = i15; i19 < iMin && byteString.getByte(i19) == byteString2.getByte(i19); i19++) {
                    i18++;
                }
                long intCount = j3 + getIntCount(buffer) + ((long) 2) + ((long) i18) + 1;
                buffer.writeInt(-i18);
                buffer.writeInt(i13);
                int i20 = i15 + i18;
                while (i15 < i20) {
                    buffer.writeInt(byteString.getByte(i15) & 255);
                    i15++;
                }
                if (i12 + 1 == i11) {
                    if (i20 == list.get(i12).size()) {
                        buffer.writeInt(list2.get(i12).intValue());
                        return;
                    } else {
                        C2104o.m5276A("Check failed.");
                        return;
                    }
                }
                Buffer buffer2 = new Buffer();
                buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                buildTrieRecursive(intCount, buffer2, i20, list, i12, i11, list2);
                buffer.writeAll(buffer2);
                return;
            }
            int i21 = 1;
            for (int i22 = i12 + 1; i22 < i11; i22++) {
                if (list.get(i22 - 1).getByte(i15) != list.get(i22).getByte(i15)) {
                    i21++;
                }
            }
            long intCount2 = j3 + getIntCount(buffer) + ((long) 2) + ((long) (i21 * 2));
            buffer.writeInt(i21);
            buffer.writeInt(i13);
            for (int i23 = i12; i23 < i11; i23++) {
                byte b10 = list.get(i23).getByte(i15);
                if (i23 == i12 || b10 != list.get(i23 - 1).getByte(i15)) {
                    buffer.writeInt(b10 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i12 < i11) {
                byte b11 = list.get(i12).getByte(i15);
                int i24 = i12 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= i11) {
                        i14 = i11;
                        break;
                    } else {
                        if (b11 != list.get(i25).getByte(i15)) {
                            i14 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i14 && i15 + 1 == list.get(i12).size()) {
                    buffer.writeInt(list2.get(i12).intValue());
                    j4 = intCount2;
                } else {
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                    j4 = intCount2;
                    buildTrieRecursive(j4, buffer3, i15 + 1, list, i12, i14, list2);
                }
                intCount2 = j4;
                i12 = i14;
            }
            buffer.writeAll(buffer3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j3, Buffer buffer, int i9, List list, int i10, int i11, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j3 = 0;
            }
            companion.buildTrieRecursive(j3, buffer, (i12 & 4) != 0 ? 0 : i9, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        
            continue;
         */
        /* JADX INFO: renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Options m6813of(ByteString... byteStringArr) {
            byteStringArr.getClass();
            AbstractC1411g abstractC1411g = null;
            int i9 = 0;
            if (byteStringArr.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, abstractC1411g);
            }
            ArrayList arrayList = new ArrayList(new C4163j(byteStringArr, false));
            AbstractC4170q.m8430f1(arrayList);
            ArrayList arrayList2 = new ArrayList(byteStringArr.length);
            for (ByteString byteString : byteStringArr) {
                arrayList2.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
            ArrayList arrayListM5C0 = AbstractC0000a.m5C0(Arrays.copyOf(numArr, numArr.length));
            int length = byteStringArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                arrayListM5C0.set(AbstractC0000a.m82p(arrayList, byteStringArr[i10]), Integer.valueOf(i11));
                i10++;
                i11++;
            }
            if (((ByteString) arrayList.get(0)).size() <= 0) {
                C2104o.m5294t("the empty byte string is not a supported option");
                return null;
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                ByteString byteString2 = (ByteString) arrayList.get(i12);
                int i13 = i12 + 1;
                int i14 = i13;
                while (i14 < arrayList.size()) {
                    ByteString byteString3 = (ByteString) arrayList.get(i14);
                    if (byteString3.startsWith(byteString2)) {
                        if (byteString3.size() == byteString2.size()) {
                            C2104o.m5300z(byteString3, "duplicate option: ");
                            return null;
                        }
                        if (((Number) arrayListM5C0.get(i14)).intValue() > ((Number) arrayListM5C0.get(i12)).intValue()) {
                            arrayList.remove(i14);
                            arrayListM5C0.remove(i14);
                        } else {
                            i14++;
                        }
                    }
                }
                i12 = i13;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, arrayList, 0, 0, arrayListM5C0, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i9] = buffer.readInt();
                i9++;
            }
            return new Options((ByteString[]) Arrays.copyOf(byteStringArr, byteStringArr.length), iArr, abstractC1411g);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.List
    public ByteString get(int i9) {
        return this.byteStrings[i9];
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 okio.ByteString[]), (r2v0 int[]) A[MD:(okio.ByteString[], int[]):void (m)] (LINE:9) call: okio.Options.<init>(okio.ByteString[], int[]):void type: THIS */
    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, AbstractC1411g abstractC1411g) {
        this(byteStringArr, iArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}

package com.android.dx.merge;

import com.android.dex.DexException;
import com.android.dex.DexIndexOverflowException;
import com.android.dex.MethodHandle$MethodHandleType;
import com.android.dx.command.dexer.DxContext;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.AbstractC3066;
import com.google.protobuf.C3349;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Adler32;
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import p292.C8540;
import p292.C8541;
import p292.C8542;
import p292.C8543;
import p292.C8544;
import p292.C8545;
import p292.C8546;
import p292.C8547;
import p292.C8548;
import p292.C8549;
import p292.C8550;
import p292.C8551;
import p292.C8552;
import p292.C8553;
import p292.C8554;
import p292.C8555;
import p292.C8556;
import p292.C8557;
import p292.C8558;
import p292.C8559;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DexMerger {
    private static final byte DBG_ADVANCE_LINE = 2;
    private static final byte DBG_ADVANCE_PC = 1;
    private static final byte DBG_END_LOCAL = 5;
    private static final byte DBG_END_SEQUENCE = 0;
    private static final byte DBG_RESTART_LOCAL = 6;
    private static final byte DBG_SET_EPILOGUE_BEGIN = 8;
    private static final byte DBG_SET_FILE = 9;
    private static final byte DBG_SET_PROLOGUE_END = 7;
    private static final byte DBG_START_LOCAL = 3;
    private static final byte DBG_START_LOCAL_EXTENDED = 4;
    private final C8557 annotationOut;
    private final C8557 annotationSetOut;
    private final C8557 annotationSetRefListOut;
    private final C8557 annotationsDirectoryOut;
    private final C8557 classDataOut;
    private final C8557 codeOut;
    private final CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final C8546 contentsOut;
    private final DxContext context;
    private final C8557 debugInfoOut;
    private final C8558 dexOut;
    private final C8558[] dexes;
    private final C8557 encodedArrayOut;
    private final C8557 headerOut;
    private final C8557 idsDefsOut;
    private final IndexMap[] indexMaps;
    private final InstructionTransformer instructionTransformer;
    private final C8557 mapListOut;
    private final C8557 stringDataOut;
    private final C8557 typeListOut;
    private final WriterSizes writerSizes;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public abstract class IdMerger<T extends Comparable<T>> {
        private final C8557 out;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public class UnsortedValue implements Comparable<IdMerger<T>.UnsortedValue> {
            final int index;
            final IndexMap indexMap;
            final int offset;
            final C8558 source;
            final T value;

            public UnsortedValue(C8558 c8558, IndexMap indexMap, T t, int i, int i2) {
                this.source = c8558;
                this.indexMap = indexMap;
                this.value = t;
                this.index = i;
                this.offset = i2;
            }

            @Override // java.lang.Comparable
            public int compareTo(IdMerger<T>.UnsortedValue unsortedValue) {
                return this.value.compareTo(unsortedValue.value);
            }
        }

        public IdMerger(C8557 c8557) {
            this.out = c8557;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int readIntoMap(C8557 c8557, C8547 c8547, IndexMap indexMap, int i, TreeMap<T, List<Integer>> treeMap, int i2) {
            int iPosition = c8557 != null ? c8557.f23882.position() : -1;
            if (i < c8547.f23845) {
                Comparable comparable = read(c8557, indexMap, i);
                List arrayList = (List) treeMap.get(comparable);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(comparable, arrayList);
                }
                arrayList.add(Integer.valueOf(i2));
            }
            return iPosition;
        }

        private List<IdMerger<T>.UnsortedValue> readUnsortedValues(C8558 c8558, IndexMap indexMap) {
            C8547 section = getSection(c8558.f23889);
            if (!section.m14111()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            C8557 c8557M14133 = c8558.m14133(section.f23846);
            for (int i = 0; i < section.f23845; i++) {
                arrayList.add(new UnsortedValue(c8558, indexMap, read(c8557M14133, indexMap, 0), i, c8557M14133.f23882.position()));
            }
            return arrayList;
        }

        public abstract C8547 getSection(C8546 c8546);

        public final void mergeSorted() {
            C8547[] c8547Arr = new C8547[DexMerger.this.dexes.length];
            C8557[] c8557Arr = new C8557[DexMerger.this.dexes.length];
            int[] iArr = new int[DexMerger.this.dexes.length];
            int[] iArr2 = new int[DexMerger.this.dexes.length];
            TreeMap<T, List<Integer>> treeMap = new TreeMap<>();
            int i = 0;
            int i2 = 0;
            while (i2 < DexMerger.this.dexes.length) {
                C8547 section = this.getSection(DexMerger.this.dexes[i2].f23889);
                c8547Arr[i2] = section;
                C8557 c8557M14133 = section.m14111() ? DexMerger.this.dexes[i2].m14133(c8547Arr[i2].f23846) : null;
                c8557Arr[i2] = c8557M14133;
                IdMerger<T> idMerger = this;
                iArr[i2] = idMerger.readIntoMap(c8557M14133, c8547Arr[i2], DexMerger.this.indexMaps[i2], iArr2[i2], treeMap, i2);
                i2++;
                this = idMerger;
            }
            IdMerger<T> idMerger2 = this;
            boolean zIsEmpty = treeMap.isEmpty();
            DexMerger dexMerger = DexMerger.this;
            if (zIsEmpty) {
                idMerger2.getSection(dexMerger.contentsOut).f23846 = 0;
                idMerger2.getSection(DexMerger.this.contentsOut).f23845 = 0;
                return;
            }
            idMerger2.getSection(dexMerger.contentsOut).f23846 = idMerger2.out.f23882.position();
            while (!treeMap.isEmpty()) {
                Map.Entry<T, List<Integer>> entryPollFirstEntry = treeMap.pollFirstEntry();
                for (Integer num : entryPollFirstEntry.getValue()) {
                    int i3 = iArr[num.intValue()];
                    IndexMap indexMap = DexMerger.this.indexMaps[num.intValue()];
                    int iIntValue = num.intValue();
                    int i4 = iArr2[iIntValue];
                    iArr2[iIntValue] = i4 + 1;
                    idMerger2.updateIndex(i3, indexMap, i4, i);
                    iArr[num.intValue()] = idMerger2.readIntoMap(c8557Arr[num.intValue()], c8547Arr[num.intValue()], DexMerger.this.indexMaps[num.intValue()], iArr2[num.intValue()], treeMap, num.intValue());
                }
                idMerger2.write(entryPollFirstEntry.getKey());
                i++;
            }
            idMerger2.getSection(DexMerger.this.contentsOut).f23845 = i;
        }

        public final void mergeUnsorted() {
            int i;
            getSection(DexMerger.this.contentsOut).f23846 = this.out.f23882.position();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < DexMerger.this.dexes.length; i2++) {
                arrayList.addAll(readUnsortedValues(DexMerger.this.dexes[i2], DexMerger.this.indexMaps[i2]));
            }
            if (arrayList.isEmpty()) {
                getSection(DexMerger.this.contentsOut).f23846 = 0;
                getSection(DexMerger.this.contentsOut).f23845 = 0;
                return;
            }
            Collections.sort(arrayList);
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4 = i) {
                i = i4 + 1;
                UnsortedValue unsortedValue = (UnsortedValue) arrayList.get(i4);
                int i5 = i3 - 1;
                updateIndex(unsortedValue.offset, unsortedValue.indexMap, unsortedValue.index, i5);
                while (i < arrayList.size() && unsortedValue.compareTo((UnsortedValue) arrayList.get(i)) == 0) {
                    int i6 = i + 1;
                    UnsortedValue unsortedValue2 = (UnsortedValue) arrayList.get(i);
                    updateIndex(unsortedValue2.offset, unsortedValue2.indexMap, unsortedValue2.index, i5);
                    i = i6;
                }
                write(unsortedValue.value);
                i3++;
            }
            getSection(DexMerger.this.contentsOut).f23845 = i3;
        }

        public abstract T read(C8557 c8557, IndexMap indexMap, int i);

        public abstract void updateIndex(int i, IndexMap indexMap, int i2, int i3);

        public abstract void write(T t);
    }

    private DexMerger(C8558[] c8558Arr, CollisionPolicy collisionPolicy, DxContext dxContext, WriterSizes writerSizes) {
        this.compactWasteThreshold = 1048576;
        this.dexes = c8558Arr;
        this.collisionPolicy = collisionPolicy;
        this.context = dxContext;
        this.writerSizes = writerSizes;
        this.dexOut = new C8558(writerSizes.size());
        this.indexMaps = new IndexMap[c8558Arr.length];
        for (int i = 0; i < c8558Arr.length; i++) {
            this.indexMaps[i] = new IndexMap(this.dexOut, c8558Arr[i].f23889);
        }
        this.instructionTransformer = new InstructionTransformer();
        this.headerOut = this.dexOut.m14135(writerSizes.header, "header");
        this.idsDefsOut = this.dexOut.m14135(writerSizes.idsDefs, "ids defs");
        C8558 c8558 = this.dexOut;
        C8546 c8546 = c8558.f23889;
        this.contentsOut = c8546;
        int i2 = c8558.f23888;
        c8546.f23815 = i2;
        C8547 c8547 = c8546.f23843;
        c8547.f23846 = i2;
        c8547.f23845 = 1;
        this.mapListOut = c8558.m14135(writerSizes.mapList, "map list");
        C8547 c85472 = c8546.f23840;
        C8558 c85582 = this.dexOut;
        c85472.f23846 = c85582.f23888;
        this.typeListOut = c85582.m14135(writerSizes.typeList, "type list");
        C8547 c85473 = c8546.f23841;
        C8558 c85583 = this.dexOut;
        c85473.f23846 = c85583.f23888;
        this.annotationSetRefListOut = c85583.m14135(writerSizes.annotationsSetRefList, "annotation set ref list");
        C8547 c85474 = c8546.f23833;
        C8558 c85584 = this.dexOut;
        c85474.f23846 = c85584.f23888;
        this.annotationSetOut = c85584.m14135(writerSizes.annotationsSet, "annotation sets");
        C8547 c85475 = c8546.f23832;
        C8558 c85585 = this.dexOut;
        c85475.f23846 = c85585.f23888;
        this.classDataOut = c85585.m14135(writerSizes.classData, "class data");
        C8547 c85476 = c8546.f23836;
        C8558 c85586 = this.dexOut;
        c85476.f23846 = c85586.f23888;
        this.codeOut = c85586.m14135(writerSizes.code, "code");
        C8547 c85477 = c8546.f23837;
        C8558 c85587 = this.dexOut;
        c85477.f23846 = c85587.f23888;
        this.stringDataOut = c85587.m14135(writerSizes.stringData, "string data");
        C8547 c85478 = c8546.f23834;
        C8558 c85588 = this.dexOut;
        c85478.f23846 = c85588.f23888;
        this.debugInfoOut = c85588.m14135(writerSizes.debugInfo, "debug info");
        C8547 c85479 = c8546.f23835;
        C8558 c85589 = this.dexOut;
        c85479.f23846 = c85589.f23888;
        this.annotationOut = c85589.m14135(writerSizes.annotation, "annotation");
        C8547 c854710 = c8546.f23827;
        C8558 c855810 = this.dexOut;
        c854710.f23846 = c855810.f23888;
        this.encodedArrayOut = c855810.m14135(writerSizes.encodedArray, "encoded array");
        C8547 c854711 = c8546.f23826;
        C8558 c855811 = this.dexOut;
        c854711.f23846 = c855811.f23888;
        this.annotationsDirectoryOut = c855811.m14135(writerSizes.annotationsDirectory, "annotations directory");
        c8546.f23816 = this.dexOut.f23888 - c8546.f23815;
    }

    private SortableType[] getSortedTypes() {
        boolean zTryAssignDepth;
        int i = this.contentsOut.f23823.f23845;
        SortableType[] sortableTypeArr = new SortableType[i];
        int i2 = 0;
        while (true) {
            C8558[] c8558Arr = this.dexes;
            if (i2 >= c8558Arr.length) {
                break;
            }
            readSortableTypes(sortableTypeArr, c8558Arr[i2], this.indexMaps[i2]);
            i2++;
        }
        do {
            zTryAssignDepth = true;
            for (int i3 = 0; i3 < i; i3++) {
                SortableType sortableType = sortableTypeArr[i3];
                if (sortableType != null && !sortableType.isDepthAssigned()) {
                    zTryAssignDepth &= sortableType.tryAssignDepth(sortableTypeArr);
                }
            }
        } while (!zTryAssignDepth);
        Arrays.sort(sortableTypeArr, SortableType.NULLS_LAST_ORDER);
        int iIndexOf = Arrays.asList(sortableTypeArr).indexOf(null);
        return iIndexOf != -1 ? (SortableType[]) Arrays.copyOfRange(sortableTypeArr, 0, iIndexOf) : sortableTypeArr;
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 2) {
            printUsage();
            return;
        }
        C8558[] c8558Arr = new C8558[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            c8558Arr[i - 1] = new C8558(new File(strArr[i]));
        }
        C8558 c8558Merge = new DexMerger(c8558Arr, CollisionPolicy.KEEP_FIRST, new DxContext()).merge();
        File file = new File(strArr[0]);
        c8558Merge.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c8558Merge.m14136(fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void mergeAnnotations() {
        new IdMerger<C8545>(this.annotationOut) { // from class: com.android.dx.merge.DexMerger.9
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23835;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8545 read(C8557 c8557, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c8557.f23882;
                byte b = byteBuffer.get();
                int iPosition = byteBuffer.position();
                new C8549(c8557, 29).m14118();
                C8558 c8558 = c8557.f23880;
                ByteBuffer byteBuffer2 = c8557.f23882;
                byte[] bArr = new byte[byteBuffer2.position() - iPosition];
                byteBuffer2.get(bArr);
                return indexMap.adjust(new C8545(c8558, b, new C8550(bArr)));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putAnnotationOffset(i, DexMerger.this.annotationOut.f23882.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8545 c8545) {
                C8557 c8557 = DexMerger.this.annotationOut;
                c8557.writeByte(c8545.f23812);
                c8557.write(c8545.f23813.f23855);
            }
        }.mergeUnsorted();
    }

    private int mergeApiLevels() {
        int i = -1;
        int i2 = 0;
        while (true) {
            C8558[] c8558Arr = this.dexes;
            if (i2 >= c8558Arr.length) {
                return i;
            }
            int i3 = c8558Arr[i2].f23889.f23831;
            if (i < i3) {
                i = i3;
            }
            i2++;
        }
    }

    private void mergeCallSiteIds() {
        new IdMerger<C8544>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.5
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23838;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8544 read(C8557 c8557, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8544(c8557.f23880, c8557.f23882.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.callSiteIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8544 c8544) {
                DexMerger.this.idsDefsOut.writeInt(c8544.f23810);
            }
        }.mergeSorted();
    }

    private void mergeClassDefs() {
        SortableType[] sortedTypes = getSortedTypes();
        this.contentsOut.f23839.f23846 = this.idsDefsOut.f23882.position();
        this.contentsOut.f23839.f23845 = sortedTypes.length;
        for (SortableType sortableType : sortedTypes) {
            transformClassDef(sortableType.getDex(), sortableType.getClassDef(), sortableType.getIndexMap());
        }
    }

    private C8558 mergeDexes() {
        mergeStringIds();
        mergeTypeIds();
        mergeTypeLists();
        mergeProtoIds();
        mergeFieldIds();
        mergeMethodIds();
        mergeMethodHandles();
        mergeAnnotations();
        unionAnnotationSetsAndDirectories();
        mergeCallSiteIds();
        mergeClassDefs();
        Arrays.sort(this.contentsOut.f23830);
        C8546 c8546 = this.contentsOut;
        C8547 c8547 = c8546.f23825;
        c8547.f23846 = 0;
        c8547.f23845 = 1;
        c8546.f23819 = this.dexOut.f23890.capacity();
        this.contentsOut.m14110();
        C8546 c85462 = this.contentsOut;
        C8557 c8557 = this.headerOut;
        int iMergeApiLevels = mergeApiLevels();
        c85462.getClass();
        c8557.write(AbstractC3057.m6743(iMergeApiLevels).getBytes("UTF-8"));
        c8557.writeInt(c85462.f23828);
        c8557.write(c85462.f23829);
        c8557.writeInt(c85462.f23819);
        c8557.writeInt(112);
        c8557.writeInt(305419896);
        c8557.writeInt(c85462.f23818);
        c8557.writeInt(c85462.f23817);
        c8557.writeInt(c85462.f23843.f23846);
        C8547 c85472 = c85462.f23824;
        c8557.writeInt(c85472.f23845);
        c8557.writeInt(c85472.f23846);
        C8547 c85473 = c85462.f23823;
        c8557.writeInt(c85473.f23845);
        c8557.writeInt(c85473.f23846);
        C8547 c85474 = c85462.f23822;
        c8557.writeInt(c85474.f23845);
        c8557.writeInt(c85474.f23846);
        C8547 c85475 = c85462.f23821;
        c8557.writeInt(c85475.f23845);
        c8557.writeInt(c85475.f23846);
        C8547 c85476 = c85462.f23820;
        c8557.writeInt(c85476.f23845);
        c8557.writeInt(c85476.f23846);
        C8547 c85477 = c85462.f23839;
        c8557.writeInt(c85477.f23845);
        c8557.writeInt(c85477.f23846);
        c8557.writeInt(c85462.f23816);
        c8557.writeInt(c85462.f23815);
        C8546 c85463 = this.contentsOut;
        C8557 c85572 = this.mapListOut;
        C8547[] c8547Arr = c85463.f23830;
        int i = 0;
        for (C8547 c85478 : c8547Arr) {
            if (c85478.m14111()) {
                i++;
            }
        }
        c85572.writeInt(i);
        for (C8547 c85479 : c8547Arr) {
            if (c85479.m14111()) {
                c85572.m14127(c85479.f23847);
                c85572.m14127((short) 0);
                c85572.writeInt(c85479.f23845);
                c85572.writeInt(c85479.f23846);
            }
        }
        C8558 c8558 = this.dexOut;
        C8557 c8557M14133 = c8558.m14133(12);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferDuplicate = c8558.f23890.duplicate();
            while (byteBufferDuplicate.hasRemaining()) {
                int iMin = Math.min(8192, byteBufferDuplicate.remaining());
                byteBufferDuplicate.get(bArr, 0, iMin);
                messageDigest.update(bArr, 0, iMin);
            }
            c8557M14133.write(messageDigest.digest());
            C8557 c8557M141332 = c8558.m14133(8);
            Adler32 adler32 = new Adler32();
            byte[] bArr2 = new byte[8192];
            ByteBuffer byteBufferDuplicate2 = c8558.f23890.duplicate();
            while (byteBufferDuplicate2.hasRemaining()) {
                int iMin2 = Math.min(8192, byteBufferDuplicate2.remaining());
                byteBufferDuplicate2.get(bArr2, 0, iMin2);
                adler32.update(bArr2, 0, iMin2);
            }
            c8557M141332.writeInt((int) adler32.getValue());
            return this.dexOut;
        } catch (NoSuchAlgorithmException unused) {
            C5554.m10870();
            return null;
        }
    }

    private void mergeFieldIds() {
        new IdMerger<C8553>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.7
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23821;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8553 read(C8557 c8557, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8553(c8557.f23880, c8557.m14121(), c8557.m14121(), c8557.f23882.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6183.m11588(i3, "field ID not in [0, 0xffff]: "));
                }
                indexMap.fieldIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8553 c8553) {
                C8557 c8557 = DexMerger.this.idsDefsOut;
                c8557.m14129(c8553.f23865);
                c8557.m14129(c8553.f23866);
                c8557.writeInt(c8553.f23864);
            }
        }.mergeSorted();
    }

    private void mergeMethodHandles() {
        new IdMerger<C8554>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.6
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23842;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8554 read(C8557 c8557, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8554(c8557.f23880, MethodHandle$MethodHandleType.fromValue(c8557.m14121()), c8557.m14121(), c8557.m14121(), c8557.m14121()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.methodHandleIds.put(Integer.valueOf(i2), Integer.valueOf(indexMap.methodHandleIds.size()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8554 c8554) {
                C8557 c8557 = DexMerger.this.idsDefsOut;
                c8557.m14129(c8554.f23870.value);
                c8557.m14129(c8554.f23871);
                c8557.m14129(c8554.f23869);
                c8557.m14129(c8554.f23868);
            }
        }.mergeUnsorted();
    }

    private void mergeMethodIds() {
        new IdMerger<C8551>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.8
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23820;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8551 read(C8557 c8557, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8551(c8557.f23880, c8557.m14121(), c8557.m14121(), c8557.f23882.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6183.m11588(i3, "method ID not in [0, 0xffff]: "));
                }
                indexMap.methodIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8551 c8551) {
                C8557 c8557 = DexMerger.this.idsDefsOut;
                c8557.m14129(c8551.f23857);
                c8557.m14129(c8551.f23858);
                c8557.writeInt(c8551.f23856);
            }
        }.mergeSorted();
    }

    private void mergeProtoIds() {
        new IdMerger<C8552>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.4
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23822;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8552 read(C8557 c8557, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c8557.f23882;
                return indexMap.adjust(new C8552(c8557.f23880, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6183.m11588(i3, "proto ID not in [0, 0xffff]: "));
                }
                indexMap.protoIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8552 c8552) {
                C8557 c8557 = DexMerger.this.idsDefsOut;
                c8557.writeInt(c8552.f23861);
                c8557.writeInt(c8552.f23862);
                c8557.writeInt(c8552.f23860);
            }
        }.mergeSorted();
    }

    private void mergeStringIds() {
        new IdMerger<String>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.1
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23824;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.stringIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(String str) {
                DexMerger.this.contentsOut.f23837.f23845++;
                DexMerger.this.idsDefsOut.writeInt(DexMerger.this.stringDataOut.f23882.position());
                C8557 c8557 = DexMerger.this.stringDataOut;
                c8557.getClass();
                try {
                    c8557.m14128(str.length());
                    c8557.write(AbstractC3066.m6868(str));
                    c8557.writeByte(0);
                } catch (UTFDataFormatException unused) {
                    C5554.m10870();
                }
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public String read(C8557 c8557, IndexMap indexMap, int i) {
                return c8557.m14123();
            }
        }.mergeSorted();
    }

    private void mergeTypeIds() {
        new IdMerger<Integer>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.2
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23823;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public Integer read(C8557 c8557, IndexMap indexMap, int i) {
                return Integer.valueOf(indexMap.adjustString(c8557.f23882.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6183.m11588(i3, "type ID not in [0, 0xffff]: "));
                }
                indexMap.typeIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(Integer num) {
                DexMerger.this.idsDefsOut.writeInt(num.intValue());
            }
        }.mergeSorted();
    }

    private void mergeTypeLists() {
        new IdMerger<C8548>(this.typeListOut) { // from class: com.android.dx.merge.DexMerger.3
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8547 getSection(C8546 c8546) {
                return c8546.f23840;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8548 read(C8557 c8557, IndexMap indexMap, int i) {
                return indexMap.adjustTypeList(c8557.m14122());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putTypeListOffset(i, DexMerger.this.typeListOut.f23882.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8548 c8548) {
                C8557 c8557 = DexMerger.this.typeListOut;
                c8557.getClass();
                short[] sArr = c8548.f23849;
                c8557.writeInt(sArr.length);
                for (short s : sArr) {
                    c8557.m14127(s);
                }
                ByteBuffer byteBuffer = c8557.f23882;
                while ((byteBuffer.position() & 3) != 0) {
                    byteBuffer.put((byte) 0);
                }
            }
        }.mergeUnsorted();
    }

    private static void printUsage() {
        System.out.println("Usage: DexMerger <out.dex> <a.dex> <b.dex> ...");
        System.out.println();
        System.out.println("If a class is defined in several dex, the class found in the first dex will be used.");
    }

    private void readSortableTypes(SortableType[] sortableTypeArr, C8558 c8558, IndexMap indexMap) {
        c8558.getClass();
        Iterator it = !c8558.f23889.f23839.m14111() ? Collections.EMPTY_SET.iterator() : new C3349(c8558);
        while (it.hasNext()) {
            C8540 c8540 = (C8540) it.next();
            SortableType sortableTypeAdjust = indexMap.adjust(new SortableType(c8558, indexMap, c8540));
            int typeIndex = sortableTypeAdjust.getTypeIndex();
            if (sortableTypeArr[typeIndex] == null) {
                sortableTypeArr[typeIndex] = sortableTypeAdjust;
            } else if (this.collisionPolicy != CollisionPolicy.KEEP_FIRST) {
                throw new DexException("Multiple dex files define ".concat((String) c8558.f23885.get(c8540.f23794)));
            }
        }
    }

    private void transformAnnotationDirectories(C8558 c8558, IndexMap indexMap) {
        C8547 c8547 = c8558.f23889.f23826;
        if (c8547.m14111()) {
            C8557 c8557M14133 = c8558.m14133(c8547.f23846);
            for (int i = 0; i < c8547.f23845; i++) {
                transformAnnotationDirectory(c8557M14133, indexMap);
            }
        }
    }

    private void transformAnnotationDirectory(C8557 c8557, IndexMap indexMap) {
        this.contentsOut.f23826.f23845++;
        this.annotationsDirectoryOut.m14125();
        indexMap.putAnnotationDirectoryOffset(c8557.f23882.position(), this.annotationsDirectoryOut.f23882.position());
        ByteBuffer byteBuffer = c8557.f23882;
        this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        int i = byteBuffer.getInt();
        this.annotationsDirectoryOut.writeInt(i);
        int i2 = byteBuffer.getInt();
        this.annotationsDirectoryOut.writeInt(i2);
        int i3 = byteBuffer.getInt();
        this.annotationsDirectoryOut.writeInt(i3);
        for (int i4 = 0; i4 < i; i4++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustField(byteBuffer.getInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        }
        for (int i5 = 0; i5 < i2; i5++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(byteBuffer.getInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        }
        for (int i6 = 0; i6 < i3; i6++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(byteBuffer.getInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSetRefList(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSet(IndexMap indexMap, C8557 c8557) {
        this.contentsOut.f23833.f23845++;
        this.annotationSetOut.m14125();
        indexMap.putAnnotationSetOffset(c8557.f23882.position(), this.annotationSetOut.f23882.position());
        ByteBuffer byteBuffer = c8557.f23882;
        int i = byteBuffer.getInt();
        this.annotationSetOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetOut.writeInt(indexMap.adjustAnnotation(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefList(IndexMap indexMap, C8557 c8557) {
        this.contentsOut.f23841.f23845++;
        this.annotationSetRefListOut.m14125();
        indexMap.putAnnotationSetRefListOffset(c8557.f23882.position(), this.annotationSetRefListOut.f23882.position());
        ByteBuffer byteBuffer = c8557.f23882;
        int i = byteBuffer.getInt();
        this.annotationSetRefListOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetRefListOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefLists(C8558 c8558, IndexMap indexMap) {
        C8547 c8547 = c8558.f23889.f23841;
        if (c8547.m14111()) {
            C8557 c8557M14133 = c8558.m14133(c8547.f23846);
            for (int i = 0; i < c8547.f23845; i++) {
                transformAnnotationSetRefList(indexMap, c8557M14133);
            }
        }
    }

    private void transformAnnotationSets(C8558 c8558, IndexMap indexMap) {
        C8547 c8547 = c8558.f23889.f23833;
        if (c8547.m14111()) {
            C8557 c8557M14133 = c8558.m14133(c8547.f23846);
            for (int i = 0; i < c8547.f23845; i++) {
                transformAnnotationSet(indexMap, c8557M14133);
            }
        }
    }

    private int[] transformCatchHandlers(IndexMap indexMap, C8556[] c8556Arr) {
        int iPosition = this.codeOut.f23882.position();
        this.codeOut.m14128(c8556Arr.length);
        int[] iArr = new int[c8556Arr.length];
        for (int i = 0; i < c8556Arr.length; i++) {
            iArr[i] = this.codeOut.f23882.position() - iPosition;
            transformEncodedCatchHandler(c8556Arr[i], indexMap);
        }
        return iArr;
    }

    private void transformClassData(C8558 c8558, C8541 c8541, IndexMap indexMap) {
        this.contentsOut.f23832.f23845++;
        C8543[] c8543Arr = c8541.f23804;
        C8543[] c8543Arr2 = c8541.f23803;
        C8542[] c8542Arr = c8541.f23802;
        C8542[] c8542Arr2 = c8541.f23801;
        this.classDataOut.m14128(c8543Arr.length);
        this.classDataOut.m14128(c8543Arr2.length);
        this.classDataOut.m14128(c8542Arr.length);
        this.classDataOut.m14128(c8542Arr2.length);
        transformFields(indexMap, c8543Arr);
        transformFields(indexMap, c8543Arr2);
        transformMethods(c8558, indexMap, c8542Arr);
        transformMethods(c8558, indexMap, c8542Arr2);
    }

    private void transformClassDef(C8558 c8558, C8540 c8540, IndexMap indexMap) {
        this.idsDefsOut.m14125();
        this.idsDefsOut.writeInt(c8540.f23794);
        this.idsDefsOut.writeInt(c8540.f23793);
        this.idsDefsOut.writeInt(c8540.f23792);
        this.idsDefsOut.writeInt(c8540.f23791);
        this.idsDefsOut.writeInt(indexMap.adjustString(c8540.f23798));
        this.idsDefsOut.writeInt(indexMap.adjustAnnotationDirectory(c8540.f23797));
        int i = c8540.f23799;
        C8557 c8557 = this.idsDefsOut;
        if (i == 0) {
            c8557.writeInt(0);
        } else {
            c8557.writeInt(this.classDataOut.f23882.position());
            transformClassData(c8558, c8558.m14132(c8540), indexMap);
        }
        this.idsDefsOut.writeInt(indexMap.adjustEncodedArray(c8540.f23800));
    }

    private void transformCode(C8558 c8558, C8559 c8559, IndexMap indexMap) {
        this.contentsOut.f23836.f23845++;
        this.codeOut.m14125();
        this.codeOut.m14129(c8559.f23899);
        this.codeOut.m14129(c8559.f23898);
        this.codeOut.m14129(c8559.f23897);
        C8555[] c8555Arr = c8559.f23894;
        C8556[] c8556Arr = c8559.f23900;
        this.codeOut.m14129(c8555Arr.length);
        int i = c8559.f23896;
        C8557 c8557 = this.codeOut;
        if (i != 0) {
            c8557.writeInt(this.debugInfoOut.f23882.position());
            transformDebugInfoItem(c8558.m14133(i), indexMap);
        } else {
            c8557.writeInt(0);
        }
        short[] sArrTransform = this.instructionTransformer.transform(indexMap, c8559.f23895);
        this.codeOut.writeInt(sArrTransform.length);
        C8557 c85572 = this.codeOut;
        c85572.getClass();
        for (short s : sArrTransform) {
            c85572.m14127(s);
        }
        if (c8555Arr.length > 0) {
            if (sArrTransform.length % 2 == 1) {
                this.codeOut.m14127((short) 0);
            }
            C8557 c8557M14133 = this.dexOut.m14133(this.codeOut.f23882.position());
            C8557 c85573 = this.codeOut;
            int length = c8555Arr.length * 8;
            if (length < 0) {
                c85573.getClass();
                C5925.m11306();
            } else {
                ByteBuffer byteBuffer = c85573.f23882;
                transformTries(c8557M14133, c8555Arr, transformCatchHandlers(indexMap, c8556Arr));
            }
        }
    }

    private void transformDebugInfoItem(C8557 c8557, IndexMap indexMap) {
        this.contentsOut.f23834.f23845++;
        c8557.getClass();
        this.debugInfoOut.m14128(AbstractC3055.m6644(c8557));
        int iM6644 = AbstractC3055.m6644(c8557);
        this.debugInfoOut.m14128(iM6644);
        for (int i = 0; i < iM6644; i++) {
            this.debugInfoOut.m14128(indexMap.adjustString(AbstractC3055.m6644(c8557) - 1) + 1);
        }
        while (true) {
            byte b = c8557.f23882.get();
            this.debugInfoOut.writeByte(b);
            if (b != 9) {
                switch (b) {
                    case 0:
                        return;
                    case 1:
                        this.debugInfoOut.m14128(AbstractC3055.m6644(c8557));
                        break;
                    case 2:
                        this.debugInfoOut.m14126(AbstractC3055.m6645(c8557));
                        break;
                    case 3:
                    case 4:
                        this.debugInfoOut.m14128(AbstractC3055.m6644(c8557));
                        this.debugInfoOut.m14128(indexMap.adjustString(AbstractC3055.m6644(c8557) - 1) + 1);
                        this.debugInfoOut.m14128(indexMap.adjustType(AbstractC3055.m6644(c8557) - 1) + 1);
                        if (b == 4) {
                            this.debugInfoOut.m14128(indexMap.adjustString(AbstractC3055.m6644(c8557) - 1) + 1);
                        }
                        break;
                    case 5:
                    case 6:
                        this.debugInfoOut.m14128(AbstractC3055.m6644(c8557));
                        break;
                }
            } else {
                this.debugInfoOut.m14128(indexMap.adjustString(AbstractC3055.m6644(c8557) - 1) + 1);
            }
        }
    }

    private void transformEncodedCatchHandler(C8556 c8556, IndexMap indexMap) {
        int i = c8556.f23877;
        int[] iArr = c8556.f23879;
        int[] iArr2 = c8556.f23878;
        C8557 c8557 = this.codeOut;
        if (i != -1) {
            c8557.m14126(-iArr.length);
        } else {
            c8557.m14126(iArr.length);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.codeOut.m14128(indexMap.adjustType(iArr[i2]));
            this.codeOut.m14128(iArr2[i2]);
        }
        if (i != -1) {
            this.codeOut.m14128(i);
        }
    }

    private void transformFields(IndexMap indexMap, C8543[] c8543Arr) {
        int length = c8543Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C8543 c8543 = c8543Arr[i];
            int iAdjustField = indexMap.adjustField(c8543.f23809);
            this.classDataOut.m14128(iAdjustField - i2);
            this.classDataOut.m14128(c8543.f23808);
            i++;
            i2 = iAdjustField;
        }
    }

    private void transformMethods(C8558 c8558, IndexMap indexMap, C8542[] c8542Arr) {
        int length = c8542Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C8542 c8542 = c8542Arr[i];
            int iAdjustMethod = indexMap.adjustMethod(c8542.f23807);
            this.classDataOut.m14128(iAdjustMethod - i2);
            this.classDataOut.m14128(c8542.f23806);
            if (c8542.f23805 == 0) {
                this.classDataOut.m14128(0);
            } else {
                ByteBuffer byteBuffer = this.codeOut.f23882;
                while ((byteBuffer.position() & 3) != 0) {
                    byteBuffer.put((byte) 0);
                }
                this.classDataOut.m14128(this.codeOut.f23882.position());
                transformCode(c8558, c8558.m14131(c8542), indexMap);
            }
            i++;
            i2 = iAdjustMethod;
        }
    }

    private void transformStaticValues(C8557 c8557, IndexMap indexMap) {
        this.contentsOut.f23827.f23845++;
        indexMap.putEncodedArrayValueOffset(c8557.f23882.position(), this.encodedArrayOut.f23882.position());
        ByteBuffer byteBuffer = c8557.f23882;
        int iPosition = byteBuffer.position();
        new C8549(c8557, 28).m14118();
        byte[] bArr = new byte[byteBuffer.position() - iPosition];
        byteBuffer.get(bArr);
        this.encodedArrayOut.write(indexMap.adjustEncodedArray(new C8550(bArr)).f23855);
    }

    private void transformTries(C8557 c8557, C8555[] c8555Arr, int[] iArr) {
        for (C8555 c8555 : c8555Arr) {
            c8557.writeInt(c8555.f23875);
            c8557.m14129(c8555.f23874);
            c8557.m14129(iArr[c8555.f23873]);
        }
    }

    private void unionAnnotationSetsAndDirectories() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C8558[] c8558Arr = this.dexes;
            if (i2 >= c8558Arr.length) {
                break;
            }
            transformAnnotationSets(c8558Arr[i2], this.indexMaps[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            C8558[] c8558Arr2 = this.dexes;
            if (i3 >= c8558Arr2.length) {
                break;
            }
            transformAnnotationSetRefLists(c8558Arr2[i3], this.indexMaps[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            C8558[] c8558Arr3 = this.dexes;
            if (i4 >= c8558Arr3.length) {
                break;
            }
            transformAnnotationDirectories(c8558Arr3[i4], this.indexMaps[i4]);
            i4++;
        }
        while (true) {
            C8558[] c8558Arr4 = this.dexes;
            if (i >= c8558Arr4.length) {
                return;
            }
            transformStaticValues(c8558Arr4[i], this.indexMaps[i]);
            i++;
        }
    }

    public C8558 merge() {
        C8558[] c8558Arr = this.dexes;
        int i = 0;
        if (c8558Arr.length == 1) {
            return c8558Arr[0];
        }
        if (c8558Arr.length == 0) {
            return null;
        }
        long jNanoTime = System.nanoTime();
        C8558 c8558MergeDexes = mergeDexes();
        WriterSizes writerSizes = new WriterSizes(this);
        int size = this.writerSizes.size() - writerSizes.size();
        if (size > this.compactWasteThreshold) {
            c8558MergeDexes = new DexMerger(new C8558[]{this.dexOut, new C8558(0)}, CollisionPolicy.FAIL, this.context, writerSizes).mergeDexes();
            this.context.out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", Float.valueOf(this.dexOut.f23890.capacity() / 1024.0f), Float.valueOf(c8558MergeDexes.f23890.capacity() / 1024.0f), Float.valueOf(size / 1024.0f));
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        while (true) {
            int length = this.dexes.length;
            DxContext dxContext = this.context;
            if (i >= length) {
                dxContext.out.printf("Result is %d defs/%.1fKiB. Took %.1fs%n", Integer.valueOf(c8558MergeDexes.f23889.f23839.f23845), Float.valueOf(c8558MergeDexes.f23890.capacity() / 1024.0f), Float.valueOf(jNanoTime2 / 1.0E9f));
                return c8558MergeDexes;
            }
            PrintStream printStream = dxContext.out;
            int i2 = i + 1;
            printStream.printf("Merged dex #%d (%d defs/%.1fKiB)%n", Integer.valueOf(i2), Integer.valueOf(this.dexes[i].f23889.f23839.f23845), Float.valueOf(this.dexes[i].f23890.capacity() / 1024.0f));
            i = i2;
        }
    }

    public void setCompactWasteThreshold(int i) {
        this.compactWasteThreshold = i;
    }

    private void transformStaticValues(C8558 c8558, IndexMap indexMap) {
        C8547 c8547 = c8558.f23889.f23827;
        if (c8547.m14111()) {
            C8557 c8557M14133 = c8558.m14133(c8547.f23846);
            for (int i = 0; i < c8547.f23845; i++) {
                transformStaticValues(c8557M14133, indexMap);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class WriterSizes {
        private int annotation;
        private int annotationsDirectory;
        private int annotationsSet;
        private int annotationsSetRefList;
        private int classData;
        private int code;
        private int debugInfo;
        private int encodedArray;
        private int header;
        private int idsDefs;
        private int mapList;
        private int stringData;
        private int typeList;

        public WriterSizes(DexMerger dexMerger) {
            this.header = 112;
            this.header = dexMerger.headerOut.m14120();
            this.idsDefs = dexMerger.idsDefsOut.m14120();
            this.mapList = dexMerger.mapListOut.m14120();
            this.typeList = dexMerger.typeListOut.m14120();
            this.classData = dexMerger.classDataOut.m14120();
            this.code = dexMerger.codeOut.m14120();
            this.stringData = dexMerger.stringDataOut.m14120();
            this.debugInfo = dexMerger.debugInfoOut.m14120();
            this.encodedArray = dexMerger.encodedArrayOut.m14120();
            this.annotationsDirectory = dexMerger.annotationsDirectoryOut.m14120();
            this.annotationsSet = dexMerger.annotationSetOut.m14120();
            this.annotationsSetRefList = dexMerger.annotationSetRefListOut.m14120();
            this.annotation = dexMerger.annotationOut.m14120();
            fourByteAlign();
        }

        private void fourByteAlign() {
            this.header = fourByteAlign(this.header);
            this.idsDefs = fourByteAlign(this.idsDefs);
            this.mapList = fourByteAlign(this.mapList);
            this.typeList = fourByteAlign(this.typeList);
            this.classData = fourByteAlign(this.classData);
            this.code = fourByteAlign(this.code);
            this.stringData = fourByteAlign(this.stringData);
            this.debugInfo = fourByteAlign(this.debugInfo);
            this.encodedArray = fourByteAlign(this.encodedArray);
            this.annotationsDirectory = fourByteAlign(this.annotationsDirectory);
            this.annotationsSet = fourByteAlign(this.annotationsSet);
            this.annotationsSetRefList = fourByteAlign(this.annotationsSetRefList);
            this.annotation = fourByteAlign(this.annotation);
        }

        private void plus(C8546 c8546, boolean z) {
            int i = this.idsDefs;
            C8547 c8547 = c8546.f23824;
            C8547 c85472 = c8546.f23834;
            C8547 c85473 = c8546.f23835;
            C8547 c85474 = c8546.f23827;
            C8547 c85475 = c8546.f23832;
            C8547 c85476 = c8546.f23836;
            this.idsDefs = AbstractC6183.m11574(c8546.f23839.f23845, 32, (c8546.f23820.f23845 * 8) + (c8546.f23821.f23845 * 8) + (c8546.f23822.f23845 * 12) + (c8546.f23823.f23845 * 4) + (c8547.f23845 * 4), i);
            this.mapList = (c8546.f23830.length * 12) + 4;
            this.typeList += fourByteAlign(c8546.f23840.f23844);
            this.stringData += c8546.f23837.f23844;
            this.annotationsDirectory += c8546.f23826.f23844;
            this.annotationsSet += c8546.f23833.f23844;
            this.annotationsSetRefList += c8546.f23841.f23844;
            int i2 = this.code;
            if (z) {
                this.code = i2 + c85476.f23844;
                this.classData += c85475.f23844;
                this.encodedArray += c85474.f23844;
                this.annotation += c85473.f23844;
                this.debugInfo += c85472.f23844;
                return;
            }
            this.code = i2 + ((int) Math.ceil(((double) c85476.f23844) * 1.25d));
            this.classData += (int) Math.ceil(((double) c85475.f23844) * 1.67d);
            this.encodedArray = (c85474.f23844 * 2) + this.encodedArray;
            this.annotation += (int) Math.ceil(c85473.f23844 * 2);
            this.debugInfo = AbstractC6183.m11574(c85472.f23844, 2, 8, this.debugInfo);
        }

        public int size() {
            return this.header + this.idsDefs + this.mapList + this.typeList + this.classData + this.code + this.stringData + this.debugInfo + this.encodedArray + this.annotationsDirectory + this.annotationsSet + this.annotationsSetRefList + this.annotation;
        }

        private static int fourByteAlign(int i) {
            return (i + 3) & (-4);
        }

        public WriterSizes(C8558[] c8558Arr) {
            this.header = 112;
            for (C8558 c8558 : c8558Arr) {
                plus(c8558.f23889, false);
            }
            fourByteAlign();
        }
    }

    public DexMerger(C8558[] c8558Arr, CollisionPolicy collisionPolicy, DxContext dxContext) {
        this(c8558Arr, collisionPolicy, dxContext, new WriterSizes(c8558Arr));
    }
}

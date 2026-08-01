package com.android.p002dx.merge;

import com.android.dex.DexException;
import com.android.dex.DexIndexOverflowException;
import com.android.dex.MethodHandle$MethodHandleType;
import com.android.p002dx.command.dexer.DxContext;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3898;
import com.google.protobuf.C4181;
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
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import p308.C9369;
import p308.C9370;
import p308.C9371;
import p308.C9372;
import p308.C9373;
import p308.C9374;
import p308.C9375;
import p308.C9376;
import p308.C9377;
import p308.C9378;
import p308.C9379;
import p308.C9380;
import p308.C9381;
import p308.C9382;
import p308.C9383;
import p308.C9384;
import p308.C9385;
import p308.C9386;
import p308.C9387;
import p308.C9388;
import top.suzhelan.qstory.hook.item.C6755;

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
    private final C9386 annotationOut;
    private final C9386 annotationSetOut;
    private final C9386 annotationSetRefListOut;
    private final C9386 annotationsDirectoryOut;
    private final C9386 classDataOut;
    private final C9386 codeOut;
    private final CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final C9375 contentsOut;
    private final DxContext context;
    private final C9386 debugInfoOut;
    private final C9387 dexOut;
    private final C9387[] dexes;
    private final C9386 encodedArrayOut;
    private final C9386 headerOut;
    private final C9386 idsDefsOut;
    private final IndexMap[] indexMaps;
    private final InstructionTransformer instructionTransformer;
    private final C9386 mapListOut;
    private final C9386 stringDataOut;
    private final C9386 typeListOut;
    private final WriterSizes writerSizes;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public abstract class IdMerger<T extends Comparable<T>> {
        private final C9386 out;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public class UnsortedValue implements Comparable<IdMerger<T>.UnsortedValue> {
            final int index;
            final IndexMap indexMap;
            final int offset;
            final C9387 source;
            final T value;

            public UnsortedValue(C9387 c9387, IndexMap indexMap, T t, int i, int i2) {
                this.source = c9387;
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

        public IdMerger(C9386 c9386) {
            this.out = c9386;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int readIntoMap(C9386 c9386, C9376 c9376, IndexMap indexMap, int i, TreeMap<T, List<Integer>> treeMap, int i2) {
            int iPosition = c9386 != null ? c9386.f24227.position() : -1;
            if (i < c9376.f24190) {
                Comparable comparable = read(c9386, indexMap, i);
                List arrayList = (List) treeMap.get(comparable);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(comparable, arrayList);
                }
                arrayList.add(Integer.valueOf(i2));
            }
            return iPosition;
        }

        private List<IdMerger<T>.UnsortedValue> readUnsortedValues(C9387 c9387, IndexMap indexMap) {
            C9376 section = getSection(c9387.f24234);
            if (!section.m14670()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            C9386 c9386M14692 = c9387.m14692(section.f24191);
            for (int i = 0; i < section.f24190; i++) {
                arrayList.add(new UnsortedValue(c9387, indexMap, read(c9386M14692, indexMap, 0), i, c9386M14692.f24227.position()));
            }
            return arrayList;
        }

        public abstract C9376 getSection(C9375 c9375);

        public final void mergeSorted() {
            C9376[] c9376Arr = new C9376[DexMerger.this.dexes.length];
            C9386[] c9386Arr = new C9386[DexMerger.this.dexes.length];
            int[] iArr = new int[DexMerger.this.dexes.length];
            int[] iArr2 = new int[DexMerger.this.dexes.length];
            TreeMap<T, List<Integer>> treeMap = new TreeMap<>();
            int i = 0;
            int i2 = 0;
            while (i2 < DexMerger.this.dexes.length) {
                C9376 section = this.getSection(DexMerger.this.dexes[i2].f24234);
                c9376Arr[i2] = section;
                C9386 c9386M14692 = section.m14670() ? DexMerger.this.dexes[i2].m14692(c9376Arr[i2].f24191) : null;
                c9386Arr[i2] = c9386M14692;
                IdMerger<T> idMerger = this;
                iArr[i2] = idMerger.readIntoMap(c9386M14692, c9376Arr[i2], DexMerger.this.indexMaps[i2], iArr2[i2], treeMap, i2);
                i2++;
                this = idMerger;
            }
            IdMerger<T> idMerger2 = this;
            boolean zIsEmpty = treeMap.isEmpty();
            DexMerger dexMerger = DexMerger.this;
            if (zIsEmpty) {
                idMerger2.getSection(dexMerger.contentsOut).f24191 = 0;
                idMerger2.getSection(DexMerger.this.contentsOut).f24190 = 0;
                return;
            }
            idMerger2.getSection(dexMerger.contentsOut).f24191 = idMerger2.out.f24227.position();
            while (!treeMap.isEmpty()) {
                Map.Entry<T, List<Integer>> entryPollFirstEntry = treeMap.pollFirstEntry();
                for (Integer num : entryPollFirstEntry.getValue()) {
                    int i3 = iArr[num.intValue()];
                    IndexMap indexMap = DexMerger.this.indexMaps[num.intValue()];
                    int iIntValue = num.intValue();
                    int i4 = iArr2[iIntValue];
                    iArr2[iIntValue] = i4 + 1;
                    idMerger2.updateIndex(i3, indexMap, i4, i);
                    iArr[num.intValue()] = idMerger2.readIntoMap(c9386Arr[num.intValue()], c9376Arr[num.intValue()], DexMerger.this.indexMaps[num.intValue()], iArr2[num.intValue()], treeMap, num.intValue());
                }
                idMerger2.write(entryPollFirstEntry.getKey());
                i++;
            }
            idMerger2.getSection(DexMerger.this.contentsOut).f24190 = i;
        }

        public final void mergeUnsorted() {
            int i;
            getSection(DexMerger.this.contentsOut).f24191 = this.out.f24227.position();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < DexMerger.this.dexes.length; i2++) {
                arrayList.addAll(readUnsortedValues(DexMerger.this.dexes[i2], DexMerger.this.indexMaps[i2]));
            }
            if (arrayList.isEmpty()) {
                getSection(DexMerger.this.contentsOut).f24191 = 0;
                getSection(DexMerger.this.contentsOut).f24190 = 0;
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
            getSection(DexMerger.this.contentsOut).f24190 = i3;
        }

        public abstract T read(C9386 c9386, IndexMap indexMap, int i);

        public abstract void updateIndex(int i, IndexMap indexMap, int i2, int i3);

        public abstract void write(T t);
    }

    private DexMerger(C9387[] c9387Arr, CollisionPolicy collisionPolicy, DxContext dxContext, WriterSizes writerSizes) {
        this.compactWasteThreshold = 1048576;
        this.dexes = c9387Arr;
        this.collisionPolicy = collisionPolicy;
        this.context = dxContext;
        this.writerSizes = writerSizes;
        this.dexOut = new C9387(writerSizes.size());
        this.indexMaps = new IndexMap[c9387Arr.length];
        for (int i = 0; i < c9387Arr.length; i++) {
            this.indexMaps[i] = new IndexMap(this.dexOut, c9387Arr[i].f24234);
        }
        this.instructionTransformer = new InstructionTransformer();
        this.headerOut = this.dexOut.m14694(writerSizes.header, "header");
        this.idsDefsOut = this.dexOut.m14694(writerSizes.idsDefs, "ids defs");
        C9387 c9387 = this.dexOut;
        C9375 c9375 = c9387.f24234;
        this.contentsOut = c9375;
        int i2 = c9387.f24233;
        c9375.f24160 = i2;
        C9376 c9376 = c9375.f24188;
        c9376.f24191 = i2;
        c9376.f24190 = 1;
        this.mapListOut = c9387.m14694(writerSizes.mapList, "map list");
        C9376 c93762 = c9375.f24185;
        C9387 c93872 = this.dexOut;
        c93762.f24191 = c93872.f24233;
        this.typeListOut = c93872.m14694(writerSizes.typeList, "type list");
        C9376 c93763 = c9375.f24186;
        C9387 c93873 = this.dexOut;
        c93763.f24191 = c93873.f24233;
        this.annotationSetRefListOut = c93873.m14694(writerSizes.annotationsSetRefList, "annotation set ref list");
        C9376 c93764 = c9375.f24178;
        C9387 c93874 = this.dexOut;
        c93764.f24191 = c93874.f24233;
        this.annotationSetOut = c93874.m14694(writerSizes.annotationsSet, "annotation sets");
        C9376 c93765 = c9375.f24177;
        C9387 c93875 = this.dexOut;
        c93765.f24191 = c93875.f24233;
        this.classDataOut = c93875.m14694(writerSizes.classData, "class data");
        C9376 c93766 = c9375.f24181;
        C9387 c93876 = this.dexOut;
        c93766.f24191 = c93876.f24233;
        this.codeOut = c93876.m14694(writerSizes.code, "code");
        C9376 c93767 = c9375.f24182;
        C9387 c93877 = this.dexOut;
        c93767.f24191 = c93877.f24233;
        this.stringDataOut = c93877.m14694(writerSizes.stringData, "string data");
        C9376 c93768 = c9375.f24179;
        C9387 c93878 = this.dexOut;
        c93768.f24191 = c93878.f24233;
        this.debugInfoOut = c93878.m14694(writerSizes.debugInfo, "debug info");
        C9376 c93769 = c9375.f24180;
        C9387 c93879 = this.dexOut;
        c93769.f24191 = c93879.f24233;
        this.annotationOut = c93879.m14694(writerSizes.annotation, "annotation");
        C9376 c937610 = c9375.f24172;
        C9387 c938710 = this.dexOut;
        c937610.f24191 = c938710.f24233;
        this.encodedArrayOut = c938710.m14694(writerSizes.encodedArray, "encoded array");
        C9376 c937611 = c9375.f24171;
        C9387 c938711 = this.dexOut;
        c937611.f24191 = c938711.f24233;
        this.annotationsDirectoryOut = c938711.m14694(writerSizes.annotationsDirectory, "annotations directory");
        c9375.f24161 = this.dexOut.f24233 - c9375.f24160;
    }

    private SortableType[] getSortedTypes() {
        boolean zTryAssignDepth;
        int i = this.contentsOut.f24168.f24190;
        SortableType[] sortableTypeArr = new SortableType[i];
        int i2 = 0;
        while (true) {
            C9387[] c9387Arr = this.dexes;
            if (i2 >= c9387Arr.length) {
                break;
            }
            readSortableTypes(sortableTypeArr, c9387Arr[i2], this.indexMaps[i2]);
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
        C9387[] c9387Arr = new C9387[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            c9387Arr[i - 1] = new C9387(new File(strArr[i]));
        }
        C9387 c9387Merge = new DexMerger(c9387Arr, CollisionPolicy.KEEP_FIRST, new DxContext()).merge();
        File file = new File(strArr[0]);
        c9387Merge.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c9387Merge.m14695(fileOutputStream);
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
        new IdMerger<C9374>(this.annotationOut) { // from class: com.android.dx.merge.DexMerger.9
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24180;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9374 read(C9386 c9386, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c9386.f24227;
                byte b = byteBuffer.get();
                int iPosition = byteBuffer.position();
                new C9378(c9386, 29).m14677();
                C9387 c9387 = c9386.f24225;
                ByteBuffer byteBuffer2 = c9386.f24227;
                byte[] bArr = new byte[byteBuffer2.position() - iPosition];
                byteBuffer2.get(bArr);
                return indexMap.adjust(new C9374(c9387, b, new C9379(bArr)));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putAnnotationOffset(i, DexMerger.this.annotationOut.f24227.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9374 c9374) {
                C9386 c9386 = DexMerger.this.annotationOut;
                c9386.writeByte(c9374.f24157);
                c9386.write(c9374.f24158.f24200);
            }
        }.mergeUnsorted();
    }

    private int mergeApiLevels() {
        int i = -1;
        int i2 = 0;
        while (true) {
            C9387[] c9387Arr = this.dexes;
            if (i2 >= c9387Arr.length) {
                return i;
            }
            int i3 = c9387Arr[i2].f24234.f24176;
            if (i < i3) {
                i = i3;
            }
            i2++;
        }
    }

    private void mergeCallSiteIds() {
        new IdMerger<C9373>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.5
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24183;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9373 read(C9386 c9386, IndexMap indexMap, int i) {
                return indexMap.adjust(new C9373(c9386.f24225, c9386.f24227.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.callSiteIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9373 c9373) {
                DexMerger.this.idsDefsOut.writeInt(c9373.f24155);
            }
        }.mergeSorted();
    }

    private void mergeClassDefs() {
        SortableType[] sortedTypes = getSortedTypes();
        this.contentsOut.f24184.f24191 = this.idsDefsOut.f24227.position();
        this.contentsOut.f24184.f24190 = sortedTypes.length;
        for (SortableType sortableType : sortedTypes) {
            transformClassDef(sortableType.getDex(), sortableType.getClassDef(), sortableType.getIndexMap());
        }
    }

    private C9387 mergeDexes() {
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
        Arrays.sort(this.contentsOut.f24175);
        C9375 c9375 = this.contentsOut;
        C9376 c9376 = c9375.f24170;
        c9376.f24191 = 0;
        c9376.f24190 = 1;
        c9375.f24164 = this.dexOut.f24235.capacity();
        this.contentsOut.m14669();
        C9375 c93752 = this.contentsOut;
        C9386 c9386 = this.headerOut;
        int iMergeApiLevels = mergeApiLevels();
        c93752.getClass();
        c9386.write(AbstractC3889.m7303(iMergeApiLevels).getBytes("UTF-8"));
        c9386.writeInt(c93752.f24173);
        c9386.write(c93752.f24174);
        c9386.writeInt(c93752.f24164);
        c9386.writeInt(112);
        c9386.writeInt(305419896);
        c9386.writeInt(c93752.f24163);
        c9386.writeInt(c93752.f24162);
        c9386.writeInt(c93752.f24188.f24191);
        C9376 c93762 = c93752.f24169;
        c9386.writeInt(c93762.f24190);
        c9386.writeInt(c93762.f24191);
        C9376 c93763 = c93752.f24168;
        c9386.writeInt(c93763.f24190);
        c9386.writeInt(c93763.f24191);
        C9376 c93764 = c93752.f24167;
        c9386.writeInt(c93764.f24190);
        c9386.writeInt(c93764.f24191);
        C9376 c93765 = c93752.f24166;
        c9386.writeInt(c93765.f24190);
        c9386.writeInt(c93765.f24191);
        C9376 c93766 = c93752.f24165;
        c9386.writeInt(c93766.f24190);
        c9386.writeInt(c93766.f24191);
        C9376 c93767 = c93752.f24184;
        c9386.writeInt(c93767.f24190);
        c9386.writeInt(c93767.f24191);
        c9386.writeInt(c93752.f24161);
        c9386.writeInt(c93752.f24160);
        C9375 c93753 = this.contentsOut;
        C9386 c93862 = this.mapListOut;
        C9376[] c9376Arr = c93753.f24175;
        int i = 0;
        for (C9376 c93768 : c9376Arr) {
            if (c93768.m14670()) {
                i++;
            }
        }
        c93862.writeInt(i);
        for (C9376 c93769 : c9376Arr) {
            if (c93769.m14670()) {
                c93862.m14686(c93769.f24192);
                c93862.m14686((short) 0);
                c93862.writeInt(c93769.f24190);
                c93862.writeInt(c93769.f24191);
            }
        }
        C9387 c9387 = this.dexOut;
        C9386 c9386M14692 = c9387.m14692(12);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferDuplicate = c9387.f24235.duplicate();
            while (byteBufferDuplicate.hasRemaining()) {
                int iMin = Math.min(8192, byteBufferDuplicate.remaining());
                byteBufferDuplicate.get(bArr, 0, iMin);
                messageDigest.update(bArr, 0, iMin);
            }
            c9386M14692.write(messageDigest.digest());
            C9386 c9386M146922 = c9387.m14692(8);
            Adler32 adler32 = new Adler32();
            byte[] bArr2 = new byte[8192];
            ByteBuffer byteBufferDuplicate2 = c9387.f24235.duplicate();
            while (byteBufferDuplicate2.hasRemaining()) {
                int iMin2 = Math.min(8192, byteBufferDuplicate2.remaining());
                byteBufferDuplicate2.get(bArr2, 0, iMin2);
                adler32.update(bArr2, 0, iMin2);
            }
            c9386M146922.writeInt((int) adler32.getValue());
            return this.dexOut;
        } catch (NoSuchAlgorithmException unused) {
            C6385.m11429();
            return null;
        }
    }

    private void mergeFieldIds() {
        new IdMerger<C9382>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.7
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24166;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9382 read(C9386 c9386, IndexMap indexMap, int i) {
                return indexMap.adjust(new C9382(c9386.f24225, c9386.m14680(), c9386.m14680(), c9386.f24227.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC7012.m12147(i3, "field ID not in [0, 0xffff]: "));
                }
                indexMap.fieldIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9382 c9382) {
                C9386 c9386 = DexMerger.this.idsDefsOut;
                c9386.m14688(c9382.f24210);
                c9386.m14688(c9382.f24211);
                c9386.writeInt(c9382.f24209);
            }
        }.mergeSorted();
    }

    private void mergeMethodHandles() {
        new IdMerger<C9383>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.6
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24187;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9383 read(C9386 c9386, IndexMap indexMap, int i) {
                return indexMap.adjust(new C9383(c9386.f24225, MethodHandle$MethodHandleType.fromValue(c9386.m14680()), c9386.m14680(), c9386.m14680(), c9386.m14680()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.methodHandleIds.put(Integer.valueOf(i2), Integer.valueOf(indexMap.methodHandleIds.size()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9383 c9383) {
                C9386 c9386 = DexMerger.this.idsDefsOut;
                c9386.m14688(c9383.f24215.value);
                c9386.m14688(c9383.f24216);
                c9386.m14688(c9383.f24214);
                c9386.m14688(c9383.f24213);
            }
        }.mergeUnsorted();
    }

    private void mergeMethodIds() {
        new IdMerger<C9380>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.8
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24165;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9380 read(C9386 c9386, IndexMap indexMap, int i) {
                return indexMap.adjust(new C9380(c9386.f24225, c9386.m14680(), c9386.m14680(), c9386.f24227.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC7012.m12147(i3, "method ID not in [0, 0xffff]: "));
                }
                indexMap.methodIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9380 c9380) {
                C9386 c9386 = DexMerger.this.idsDefsOut;
                c9386.m14688(c9380.f24202);
                c9386.m14688(c9380.f24203);
                c9386.writeInt(c9380.f24201);
            }
        }.mergeSorted();
    }

    private void mergeProtoIds() {
        new IdMerger<C9381>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.4
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24167;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9381 read(C9386 c9386, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c9386.f24227;
                return indexMap.adjust(new C9381(c9386.f24225, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC7012.m12147(i3, "proto ID not in [0, 0xffff]: "));
                }
                indexMap.protoIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9381 c9381) {
                C9386 c9386 = DexMerger.this.idsDefsOut;
                c9386.writeInt(c9381.f24206);
                c9386.writeInt(c9381.f24207);
                c9386.writeInt(c9381.f24205);
            }
        }.mergeSorted();
    }

    private void mergeStringIds() {
        new IdMerger<String>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.1
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24169;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.stringIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(String str) {
                DexMerger.this.contentsOut.f24182.f24190++;
                DexMerger.this.idsDefsOut.writeInt(DexMerger.this.stringDataOut.f24227.position());
                C9386 c9386 = DexMerger.this.stringDataOut;
                c9386.getClass();
                try {
                    c9386.m14687(str.length());
                    c9386.write(AbstractC3898.m7428(str));
                    c9386.writeByte(0);
                } catch (UTFDataFormatException unused) {
                    C6385.m11429();
                }
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public String read(C9386 c9386, IndexMap indexMap, int i) {
                return c9386.m14682();
            }
        }.mergeSorted();
    }

    private void mergeTypeIds() {
        new IdMerger<Integer>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.2
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24168;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public Integer read(C9386 c9386, IndexMap indexMap, int i) {
                return Integer.valueOf(indexMap.adjustString(c9386.f24227.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC7012.m12147(i3, "type ID not in [0, 0xffff]: "));
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
        new IdMerger<C9377>(this.typeListOut) { // from class: com.android.dx.merge.DexMerger.3
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9376 getSection(C9375 c9375) {
                return c9375.f24185;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C9377 read(C9386 c9386, IndexMap indexMap, int i) {
                return indexMap.adjustTypeList(c9386.m14681());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putTypeListOffset(i, DexMerger.this.typeListOut.f24227.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C9377 c9377) {
                C9386 c9386 = DexMerger.this.typeListOut;
                c9386.getClass();
                short[] sArr = c9377.f24194;
                c9386.writeInt(sArr.length);
                for (short s : sArr) {
                    c9386.m14686(s);
                }
                ByteBuffer byteBuffer = c9386.f24227;
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

    private void readSortableTypes(SortableType[] sortableTypeArr, C9387 c9387, IndexMap indexMap) {
        c9387.getClass();
        Iterator it = !c9387.f24234.f24184.m14670() ? Collections.EMPTY_SET.iterator() : new C4181(c9387);
        while (it.hasNext()) {
            C9369 c9369 = (C9369) it.next();
            SortableType sortableTypeAdjust = indexMap.adjust(new SortableType(c9387, indexMap, c9369));
            int typeIndex = sortableTypeAdjust.getTypeIndex();
            if (sortableTypeArr[typeIndex] == null) {
                sortableTypeArr[typeIndex] = sortableTypeAdjust;
            } else if (this.collisionPolicy != CollisionPolicy.KEEP_FIRST) {
                throw new DexException("Multiple dex files define ".concat((String) c9387.f24230.get(c9369.f24139)));
            }
        }
    }

    private void transformAnnotationDirectories(C9387 c9387, IndexMap indexMap) {
        C9376 c9376 = c9387.f24234.f24171;
        if (c9376.m14670()) {
            C9386 c9386M14692 = c9387.m14692(c9376.f24191);
            for (int i = 0; i < c9376.f24190; i++) {
                transformAnnotationDirectory(c9386M14692, indexMap);
            }
        }
    }

    private void transformAnnotationDirectory(C9386 c9386, IndexMap indexMap) {
        this.contentsOut.f24171.f24190++;
        this.annotationsDirectoryOut.m14684();
        indexMap.putAnnotationDirectoryOffset(c9386.f24227.position(), this.annotationsDirectoryOut.f24227.position());
        ByteBuffer byteBuffer = c9386.f24227;
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

    private void transformAnnotationSet(IndexMap indexMap, C9386 c9386) {
        this.contentsOut.f24178.f24190++;
        this.annotationSetOut.m14684();
        indexMap.putAnnotationSetOffset(c9386.f24227.position(), this.annotationSetOut.f24227.position());
        ByteBuffer byteBuffer = c9386.f24227;
        int i = byteBuffer.getInt();
        this.annotationSetOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetOut.writeInt(indexMap.adjustAnnotation(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefList(IndexMap indexMap, C9386 c9386) {
        this.contentsOut.f24186.f24190++;
        this.annotationSetRefListOut.m14684();
        indexMap.putAnnotationSetRefListOffset(c9386.f24227.position(), this.annotationSetRefListOut.f24227.position());
        ByteBuffer byteBuffer = c9386.f24227;
        int i = byteBuffer.getInt();
        this.annotationSetRefListOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetRefListOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefLists(C9387 c9387, IndexMap indexMap) {
        C9376 c9376 = c9387.f24234.f24186;
        if (c9376.m14670()) {
            C9386 c9386M14692 = c9387.m14692(c9376.f24191);
            for (int i = 0; i < c9376.f24190; i++) {
                transformAnnotationSetRefList(indexMap, c9386M14692);
            }
        }
    }

    private void transformAnnotationSets(C9387 c9387, IndexMap indexMap) {
        C9376 c9376 = c9387.f24234.f24178;
        if (c9376.m14670()) {
            C9386 c9386M14692 = c9387.m14692(c9376.f24191);
            for (int i = 0; i < c9376.f24190; i++) {
                transformAnnotationSet(indexMap, c9386M14692);
            }
        }
    }

    private int[] transformCatchHandlers(IndexMap indexMap, C9385[] c9385Arr) {
        int iPosition = this.codeOut.f24227.position();
        this.codeOut.m14687(c9385Arr.length);
        int[] iArr = new int[c9385Arr.length];
        for (int i = 0; i < c9385Arr.length; i++) {
            iArr[i] = this.codeOut.f24227.position() - iPosition;
            transformEncodedCatchHandler(c9385Arr[i], indexMap);
        }
        return iArr;
    }

    private void transformClassData(C9387 c9387, C9370 c9370, IndexMap indexMap) {
        this.contentsOut.f24177.f24190++;
        C9372[] c9372Arr = c9370.f24149;
        C9372[] c9372Arr2 = c9370.f24148;
        C9371[] c9371Arr = c9370.f24147;
        C9371[] c9371Arr2 = c9370.f24146;
        this.classDataOut.m14687(c9372Arr.length);
        this.classDataOut.m14687(c9372Arr2.length);
        this.classDataOut.m14687(c9371Arr.length);
        this.classDataOut.m14687(c9371Arr2.length);
        transformFields(indexMap, c9372Arr);
        transformFields(indexMap, c9372Arr2);
        transformMethods(c9387, indexMap, c9371Arr);
        transformMethods(c9387, indexMap, c9371Arr2);
    }

    private void transformClassDef(C9387 c9387, C9369 c9369, IndexMap indexMap) {
        this.idsDefsOut.m14684();
        this.idsDefsOut.writeInt(c9369.f24139);
        this.idsDefsOut.writeInt(c9369.f24138);
        this.idsDefsOut.writeInt(c9369.f24137);
        this.idsDefsOut.writeInt(c9369.f24136);
        this.idsDefsOut.writeInt(indexMap.adjustString(c9369.f24143));
        this.idsDefsOut.writeInt(indexMap.adjustAnnotationDirectory(c9369.f24142));
        int i = c9369.f24144;
        C9386 c9386 = this.idsDefsOut;
        if (i == 0) {
            c9386.writeInt(0);
        } else {
            c9386.writeInt(this.classDataOut.f24227.position());
            transformClassData(c9387, c9387.m14691(c9369), indexMap);
        }
        this.idsDefsOut.writeInt(indexMap.adjustEncodedArray(c9369.f24145));
    }

    private void transformCode(C9387 c9387, C9388 c9388, IndexMap indexMap) {
        this.contentsOut.f24181.f24190++;
        this.codeOut.m14684();
        this.codeOut.m14688(c9388.f24244);
        this.codeOut.m14688(c9388.f24243);
        this.codeOut.m14688(c9388.f24242);
        C9384[] c9384Arr = c9388.f24239;
        C9385[] c9385Arr = c9388.f24245;
        this.codeOut.m14688(c9384Arr.length);
        int i = c9388.f24241;
        C9386 c9386 = this.codeOut;
        if (i != 0) {
            c9386.writeInt(this.debugInfoOut.f24227.position());
            transformDebugInfoItem(c9387.m14692(i), indexMap);
        } else {
            c9386.writeInt(0);
        }
        short[] sArrTransform = this.instructionTransformer.transform(indexMap, c9388.f24240);
        this.codeOut.writeInt(sArrTransform.length);
        C9386 c93862 = this.codeOut;
        c93862.getClass();
        for (short s : sArrTransform) {
            c93862.m14686(s);
        }
        if (c9384Arr.length > 0) {
            if (sArrTransform.length % 2 == 1) {
                this.codeOut.m14686((short) 0);
            }
            C9386 c9386M14692 = this.dexOut.m14692(this.codeOut.f24227.position());
            C9386 c93863 = this.codeOut;
            int length = c9384Arr.length * 8;
            if (length < 0) {
                c93863.getClass();
                C6755.m11865();
            } else {
                ByteBuffer byteBuffer = c93863.f24227;
                transformTries(c9386M14692, c9384Arr, transformCatchHandlers(indexMap, c9385Arr));
            }
        }
    }

    private void transformDebugInfoItem(C9386 c9386, IndexMap indexMap) {
        this.contentsOut.f24179.f24190++;
        c9386.getClass();
        this.debugInfoOut.m14687(AbstractC3887.m7204(c9386));
        int iM7204 = AbstractC3887.m7204(c9386);
        this.debugInfoOut.m14687(iM7204);
        for (int i = 0; i < iM7204; i++) {
            this.debugInfoOut.m14687(indexMap.adjustString(AbstractC3887.m7204(c9386) - 1) + 1);
        }
        while (true) {
            byte b = c9386.f24227.get();
            this.debugInfoOut.writeByte(b);
            if (b != 9) {
                switch (b) {
                    case 0:
                        return;
                    case 1:
                        this.debugInfoOut.m14687(AbstractC3887.m7204(c9386));
                        break;
                    case 2:
                        this.debugInfoOut.m14685(AbstractC3887.m7205(c9386));
                        break;
                    case 3:
                    case 4:
                        this.debugInfoOut.m14687(AbstractC3887.m7204(c9386));
                        this.debugInfoOut.m14687(indexMap.adjustString(AbstractC3887.m7204(c9386) - 1) + 1);
                        this.debugInfoOut.m14687(indexMap.adjustType(AbstractC3887.m7204(c9386) - 1) + 1);
                        if (b == 4) {
                            this.debugInfoOut.m14687(indexMap.adjustString(AbstractC3887.m7204(c9386) - 1) + 1);
                        }
                        break;
                    case 5:
                    case 6:
                        this.debugInfoOut.m14687(AbstractC3887.m7204(c9386));
                        break;
                }
            } else {
                this.debugInfoOut.m14687(indexMap.adjustString(AbstractC3887.m7204(c9386) - 1) + 1);
            }
        }
    }

    private void transformEncodedCatchHandler(C9385 c9385, IndexMap indexMap) {
        int i = c9385.f24222;
        int[] iArr = c9385.f24224;
        int[] iArr2 = c9385.f24223;
        C9386 c9386 = this.codeOut;
        if (i != -1) {
            c9386.m14685(-iArr.length);
        } else {
            c9386.m14685(iArr.length);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.codeOut.m14687(indexMap.adjustType(iArr[i2]));
            this.codeOut.m14687(iArr2[i2]);
        }
        if (i != -1) {
            this.codeOut.m14687(i);
        }
    }

    private void transformFields(IndexMap indexMap, C9372[] c9372Arr) {
        int length = c9372Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C9372 c9372 = c9372Arr[i];
            int iAdjustField = indexMap.adjustField(c9372.f24154);
            this.classDataOut.m14687(iAdjustField - i2);
            this.classDataOut.m14687(c9372.f24153);
            i++;
            i2 = iAdjustField;
        }
    }

    private void transformMethods(C9387 c9387, IndexMap indexMap, C9371[] c9371Arr) {
        int length = c9371Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C9371 c9371 = c9371Arr[i];
            int iAdjustMethod = indexMap.adjustMethod(c9371.f24152);
            this.classDataOut.m14687(iAdjustMethod - i2);
            this.classDataOut.m14687(c9371.f24151);
            if (c9371.f24150 == 0) {
                this.classDataOut.m14687(0);
            } else {
                ByteBuffer byteBuffer = this.codeOut.f24227;
                while ((byteBuffer.position() & 3) != 0) {
                    byteBuffer.put((byte) 0);
                }
                this.classDataOut.m14687(this.codeOut.f24227.position());
                transformCode(c9387, c9387.m14690(c9371), indexMap);
            }
            i++;
            i2 = iAdjustMethod;
        }
    }

    private void transformStaticValues(C9386 c9386, IndexMap indexMap) {
        this.contentsOut.f24172.f24190++;
        indexMap.putEncodedArrayValueOffset(c9386.f24227.position(), this.encodedArrayOut.f24227.position());
        ByteBuffer byteBuffer = c9386.f24227;
        int iPosition = byteBuffer.position();
        new C9378(c9386, 28).m14677();
        byte[] bArr = new byte[byteBuffer.position() - iPosition];
        byteBuffer.get(bArr);
        this.encodedArrayOut.write(indexMap.adjustEncodedArray(new C9379(bArr)).f24200);
    }

    private void transformTries(C9386 c9386, C9384[] c9384Arr, int[] iArr) {
        for (C9384 c9384 : c9384Arr) {
            c9386.writeInt(c9384.f24220);
            c9386.m14688(c9384.f24219);
            c9386.m14688(iArr[c9384.f24218]);
        }
    }

    private void unionAnnotationSetsAndDirectories() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C9387[] c9387Arr = this.dexes;
            if (i2 >= c9387Arr.length) {
                break;
            }
            transformAnnotationSets(c9387Arr[i2], this.indexMaps[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            C9387[] c9387Arr2 = this.dexes;
            if (i3 >= c9387Arr2.length) {
                break;
            }
            transformAnnotationSetRefLists(c9387Arr2[i3], this.indexMaps[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            C9387[] c9387Arr3 = this.dexes;
            if (i4 >= c9387Arr3.length) {
                break;
            }
            transformAnnotationDirectories(c9387Arr3[i4], this.indexMaps[i4]);
            i4++;
        }
        while (true) {
            C9387[] c9387Arr4 = this.dexes;
            if (i >= c9387Arr4.length) {
                return;
            }
            transformStaticValues(c9387Arr4[i], this.indexMaps[i]);
            i++;
        }
    }

    public C9387 merge() {
        C9387[] c9387Arr = this.dexes;
        int i = 0;
        if (c9387Arr.length == 1) {
            return c9387Arr[0];
        }
        if (c9387Arr.length == 0) {
            return null;
        }
        long jNanoTime = System.nanoTime();
        C9387 c9387MergeDexes = mergeDexes();
        WriterSizes writerSizes = new WriterSizes(this);
        int size = this.writerSizes.size() - writerSizes.size();
        if (size > this.compactWasteThreshold) {
            c9387MergeDexes = new DexMerger(new C9387[]{this.dexOut, new C9387(0)}, CollisionPolicy.FAIL, this.context, writerSizes).mergeDexes();
            this.context.out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", Float.valueOf(this.dexOut.f24235.capacity() / 1024.0f), Float.valueOf(c9387MergeDexes.f24235.capacity() / 1024.0f), Float.valueOf(size / 1024.0f));
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        while (true) {
            int length = this.dexes.length;
            DxContext dxContext = this.context;
            if (i >= length) {
                dxContext.out.printf("Result is %d defs/%.1fKiB. Took %.1fs%n", Integer.valueOf(c9387MergeDexes.f24234.f24184.f24190), Float.valueOf(c9387MergeDexes.f24235.capacity() / 1024.0f), Float.valueOf(jNanoTime2 / 1.0E9f));
                return c9387MergeDexes;
            }
            PrintStream printStream = dxContext.out;
            int i2 = i + 1;
            printStream.printf("Merged dex #%d (%d defs/%.1fKiB)%n", Integer.valueOf(i2), Integer.valueOf(this.dexes[i].f24234.f24184.f24190), Float.valueOf(this.dexes[i].f24235.capacity() / 1024.0f));
            i = i2;
        }
    }

    public void setCompactWasteThreshold(int i) {
        this.compactWasteThreshold = i;
    }

    private void transformStaticValues(C9387 c9387, IndexMap indexMap) {
        C9376 c9376 = c9387.f24234.f24172;
        if (c9376.m14670()) {
            C9386 c9386M14692 = c9387.m14692(c9376.f24191);
            for (int i = 0; i < c9376.f24190; i++) {
                transformStaticValues(c9386M14692, indexMap);
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
            this.header = dexMerger.headerOut.m14679();
            this.idsDefs = dexMerger.idsDefsOut.m14679();
            this.mapList = dexMerger.mapListOut.m14679();
            this.typeList = dexMerger.typeListOut.m14679();
            this.classData = dexMerger.classDataOut.m14679();
            this.code = dexMerger.codeOut.m14679();
            this.stringData = dexMerger.stringDataOut.m14679();
            this.debugInfo = dexMerger.debugInfoOut.m14679();
            this.encodedArray = dexMerger.encodedArrayOut.m14679();
            this.annotationsDirectory = dexMerger.annotationsDirectoryOut.m14679();
            this.annotationsSet = dexMerger.annotationSetOut.m14679();
            this.annotationsSetRefList = dexMerger.annotationSetRefListOut.m14679();
            this.annotation = dexMerger.annotationOut.m14679();
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

        private void plus(C9375 c9375, boolean z) {
            int i = this.idsDefs;
            C9376 c9376 = c9375.f24169;
            C9376 c93762 = c9375.f24179;
            C9376 c93763 = c9375.f24180;
            C9376 c93764 = c9375.f24172;
            C9376 c93765 = c9375.f24177;
            C9376 c93766 = c9375.f24181;
            this.idsDefs = AbstractC7012.m12133(c9375.f24184.f24190, 32, (c9375.f24165.f24190 * 8) + (c9375.f24166.f24190 * 8) + (c9375.f24167.f24190 * 12) + (c9375.f24168.f24190 * 4) + (c9376.f24190 * 4), i);
            this.mapList = (c9375.f24175.length * 12) + 4;
            this.typeList += fourByteAlign(c9375.f24185.f24189);
            this.stringData += c9375.f24182.f24189;
            this.annotationsDirectory += c9375.f24171.f24189;
            this.annotationsSet += c9375.f24178.f24189;
            this.annotationsSetRefList += c9375.f24186.f24189;
            int i2 = this.code;
            if (z) {
                this.code = i2 + c93766.f24189;
                this.classData += c93765.f24189;
                this.encodedArray += c93764.f24189;
                this.annotation += c93763.f24189;
                this.debugInfo += c93762.f24189;
                return;
            }
            this.code = i2 + ((int) Math.ceil(((double) c93766.f24189) * 1.25d));
            this.classData += (int) Math.ceil(((double) c93765.f24189) * 1.67d);
            this.encodedArray = (c93764.f24189 * 2) + this.encodedArray;
            this.annotation += (int) Math.ceil(c93763.f24189 * 2);
            this.debugInfo = AbstractC7012.m12133(c93762.f24189, 2, 8, this.debugInfo);
        }

        public int size() {
            return this.header + this.idsDefs + this.mapList + this.typeList + this.classData + this.code + this.stringData + this.debugInfo + this.encodedArray + this.annotationsDirectory + this.annotationsSet + this.annotationsSetRefList + this.annotation;
        }

        private static int fourByteAlign(int i) {
            return (i + 3) & (-4);
        }

        public WriterSizes(C9387[] c9387Arr) {
            this.header = 112;
            for (C9387 c9387 : c9387Arr) {
                plus(c9387.f24234, false);
            }
            fourByteAlign();
        }
    }

    public DexMerger(C9387[] c9387Arr, CollisionPolicy collisionPolicy, DxContext dxContext) {
        this(c9387Arr, collisionPolicy, dxContext, new WriterSizes(c9387Arr));
    }
}

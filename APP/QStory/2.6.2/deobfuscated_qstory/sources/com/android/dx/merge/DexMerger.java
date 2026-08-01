package com.android.dx.merge;

import com.android.dex.DexException;
import com.android.dex.DexIndexOverflowException;
import com.android.dex.MethodHandle$MethodHandleType;
import com.android.dx.command.dexer.DxContext;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.AbstractC3065;
import com.google.protobuf.C3348;
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
import lin.xposed.hook.javaplugin.C5553;
import p007.AbstractC6136;
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
import p292.C8560;
import p292.C8561;
import p292.C8562;
import p292.C8563;
import p292.C8564;
import p292.C8565;
import p292.C8566;
import p292.C8567;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
    private final C8565 annotationOut;
    private final C8565 annotationSetOut;
    private final C8565 annotationSetRefListOut;
    private final C8565 annotationsDirectoryOut;
    private final C8565 classDataOut;
    private final C8565 codeOut;
    private final CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final C8554 contentsOut;
    private final DxContext context;
    private final C8565 debugInfoOut;
    private final C8566 dexOut;
    private final C8566[] dexes;
    private final C8565 encodedArrayOut;
    private final C8565 headerOut;
    private final C8565 idsDefsOut;
    private final IndexMap[] indexMaps;
    private final InstructionTransformer instructionTransformer;
    private final C8565 mapListOut;
    private final C8565 stringDataOut;
    private final C8565 typeListOut;
    private final WriterSizes writerSizes;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public abstract class IdMerger<T extends Comparable<T>> {
        private final C8565 out;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public class UnsortedValue implements Comparable<IdMerger<T>.UnsortedValue> {
            final int index;
            final IndexMap indexMap;
            final int offset;
            final C8566 source;
            final T value;

            public UnsortedValue(C8566 c8566, IndexMap indexMap, T t, int i, int i2) {
                this.source = c8566;
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

        public IdMerger(C8565 c8565) {
            this.out = c8565;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int readIntoMap(C8565 c8565, C8555 c8555, IndexMap indexMap, int i, TreeMap<T, List<Integer>> treeMap, int i2) {
            int iPosition = c8565 != null ? c8565.f23891.position() : -1;
            if (i < c8555.f23854) {
                Comparable comparable = read(c8565, indexMap, i);
                List arrayList = (List) treeMap.get(comparable);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(comparable, arrayList);
                }
                arrayList.add(Integer.valueOf(i2));
            }
            return iPosition;
        }

        private List<IdMerger<T>.UnsortedValue> readUnsortedValues(C8566 c8566, IndexMap indexMap) {
            C8555 section = getSection(c8566.f23898);
            if (!section.m14092()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            C8565 c8565M14114 = c8566.m14114(section.f23855);
            for (int i = 0; i < section.f23854; i++) {
                arrayList.add(new UnsortedValue(c8566, indexMap, read(c8565M14114, indexMap, 0), i, c8565M14114.f23891.position()));
            }
            return arrayList;
        }

        public abstract C8555 getSection(C8554 c8554);

        public final void mergeSorted() {
            C8555[] c8555Arr = new C8555[DexMerger.this.dexes.length];
            C8565[] c8565Arr = new C8565[DexMerger.this.dexes.length];
            int[] iArr = new int[DexMerger.this.dexes.length];
            int[] iArr2 = new int[DexMerger.this.dexes.length];
            TreeMap<T, List<Integer>> treeMap = new TreeMap<>();
            int i = 0;
            int i2 = 0;
            while (i2 < DexMerger.this.dexes.length) {
                C8555 section = this.getSection(DexMerger.this.dexes[i2].f23898);
                c8555Arr[i2] = section;
                C8565 c8565M14114 = section.m14092() ? DexMerger.this.dexes[i2].m14114(c8555Arr[i2].f23855) : null;
                c8565Arr[i2] = c8565M14114;
                IdMerger<T> idMerger = this;
                iArr[i2] = idMerger.readIntoMap(c8565M14114, c8555Arr[i2], DexMerger.this.indexMaps[i2], iArr2[i2], treeMap, i2);
                i2++;
                this = idMerger;
            }
            IdMerger<T> idMerger2 = this;
            boolean zIsEmpty = treeMap.isEmpty();
            DexMerger dexMerger = DexMerger.this;
            if (zIsEmpty) {
                idMerger2.getSection(dexMerger.contentsOut).f23855 = 0;
                idMerger2.getSection(DexMerger.this.contentsOut).f23854 = 0;
                return;
            }
            idMerger2.getSection(dexMerger.contentsOut).f23855 = idMerger2.out.f23891.position();
            while (!treeMap.isEmpty()) {
                Map.Entry<T, List<Integer>> entryPollFirstEntry = treeMap.pollFirstEntry();
                for (Integer num : entryPollFirstEntry.getValue()) {
                    int i3 = iArr[num.intValue()];
                    IndexMap indexMap = DexMerger.this.indexMaps[num.intValue()];
                    int iIntValue = num.intValue();
                    int i4 = iArr2[iIntValue];
                    iArr2[iIntValue] = i4 + 1;
                    idMerger2.updateIndex(i3, indexMap, i4, i);
                    iArr[num.intValue()] = idMerger2.readIntoMap(c8565Arr[num.intValue()], c8555Arr[num.intValue()], DexMerger.this.indexMaps[num.intValue()], iArr2[num.intValue()], treeMap, num.intValue());
                }
                idMerger2.write(entryPollFirstEntry.getKey());
                i++;
            }
            idMerger2.getSection(DexMerger.this.contentsOut).f23854 = i;
        }

        public final void mergeUnsorted() {
            int i;
            getSection(DexMerger.this.contentsOut).f23855 = this.out.f23891.position();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < DexMerger.this.dexes.length; i2++) {
                arrayList.addAll(readUnsortedValues(DexMerger.this.dexes[i2], DexMerger.this.indexMaps[i2]));
            }
            if (arrayList.isEmpty()) {
                getSection(DexMerger.this.contentsOut).f23855 = 0;
                getSection(DexMerger.this.contentsOut).f23854 = 0;
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
            getSection(DexMerger.this.contentsOut).f23854 = i3;
        }

        public abstract T read(C8565 c8565, IndexMap indexMap, int i);

        public abstract void updateIndex(int i, IndexMap indexMap, int i2, int i3);

        public abstract void write(T t);
    }

    private DexMerger(C8566[] c8566Arr, CollisionPolicy collisionPolicy, DxContext dxContext, WriterSizes writerSizes) {
        this.compactWasteThreshold = 1048576;
        this.dexes = c8566Arr;
        this.collisionPolicy = collisionPolicy;
        this.context = dxContext;
        this.writerSizes = writerSizes;
        this.dexOut = new C8566(writerSizes.size());
        this.indexMaps = new IndexMap[c8566Arr.length];
        for (int i = 0; i < c8566Arr.length; i++) {
            this.indexMaps[i] = new IndexMap(this.dexOut, c8566Arr[i].f23898);
        }
        this.instructionTransformer = new InstructionTransformer();
        this.headerOut = this.dexOut.m14116(writerSizes.header, "header");
        this.idsDefsOut = this.dexOut.m14116(writerSizes.idsDefs, "ids defs");
        C8566 c8566 = this.dexOut;
        C8554 c8554 = c8566.f23898;
        this.contentsOut = c8554;
        int i2 = c8566.f23897;
        c8554.f23824 = i2;
        C8555 c8555 = c8554.f23852;
        c8555.f23855 = i2;
        c8555.f23854 = 1;
        this.mapListOut = c8566.m14116(writerSizes.mapList, "map list");
        C8555 c85552 = c8554.f23849;
        C8566 c85662 = this.dexOut;
        c85552.f23855 = c85662.f23897;
        this.typeListOut = c85662.m14116(writerSizes.typeList, "type list");
        C8555 c85553 = c8554.f23850;
        C8566 c85663 = this.dexOut;
        c85553.f23855 = c85663.f23897;
        this.annotationSetRefListOut = c85663.m14116(writerSizes.annotationsSetRefList, "annotation set ref list");
        C8555 c85554 = c8554.f23842;
        C8566 c85664 = this.dexOut;
        c85554.f23855 = c85664.f23897;
        this.annotationSetOut = c85664.m14116(writerSizes.annotationsSet, "annotation sets");
        C8555 c85555 = c8554.f23841;
        C8566 c85665 = this.dexOut;
        c85555.f23855 = c85665.f23897;
        this.classDataOut = c85665.m14116(writerSizes.classData, "class data");
        C8555 c85556 = c8554.f23845;
        C8566 c85666 = this.dexOut;
        c85556.f23855 = c85666.f23897;
        this.codeOut = c85666.m14116(writerSizes.code, "code");
        C8555 c85557 = c8554.f23846;
        C8566 c85667 = this.dexOut;
        c85557.f23855 = c85667.f23897;
        this.stringDataOut = c85667.m14116(writerSizes.stringData, "string data");
        C8555 c85558 = c8554.f23843;
        C8566 c85668 = this.dexOut;
        c85558.f23855 = c85668.f23897;
        this.debugInfoOut = c85668.m14116(writerSizes.debugInfo, "debug info");
        C8555 c85559 = c8554.f23844;
        C8566 c85669 = this.dexOut;
        c85559.f23855 = c85669.f23897;
        this.annotationOut = c85669.m14116(writerSizes.annotation, "annotation");
        C8555 c855510 = c8554.f23836;
        C8566 c856610 = this.dexOut;
        c855510.f23855 = c856610.f23897;
        this.encodedArrayOut = c856610.m14116(writerSizes.encodedArray, "encoded array");
        C8555 c855511 = c8554.f23835;
        C8566 c856611 = this.dexOut;
        c855511.f23855 = c856611.f23897;
        this.annotationsDirectoryOut = c856611.m14116(writerSizes.annotationsDirectory, "annotations directory");
        c8554.f23825 = this.dexOut.f23897 - c8554.f23824;
    }

    private SortableType[] getSortedTypes() {
        boolean zTryAssignDepth;
        int i = this.contentsOut.f23832.f23854;
        SortableType[] sortableTypeArr = new SortableType[i];
        int i2 = 0;
        while (true) {
            C8566[] c8566Arr = this.dexes;
            if (i2 >= c8566Arr.length) {
                break;
            }
            readSortableTypes(sortableTypeArr, c8566Arr[i2], this.indexMaps[i2]);
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
        C8566[] c8566Arr = new C8566[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            c8566Arr[i - 1] = new C8566(new File(strArr[i]));
        }
        C8566 c8566Merge = new DexMerger(c8566Arr, CollisionPolicy.KEEP_FIRST, new DxContext()).merge();
        File file = new File(strArr[0]);
        c8566Merge.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c8566Merge.m14117(fileOutputStream);
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
        new IdMerger<C8553>(this.annotationOut) { // from class: com.android.dx.merge.DexMerger.9
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23844;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8553 read(C8565 c8565, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c8565.f23891;
                byte b = byteBuffer.get();
                int iPosition = byteBuffer.position();
                new C8557(c8565, 29).m14099();
                C8566 c8566 = c8565.f23889;
                ByteBuffer byteBuffer2 = c8565.f23891;
                byte[] bArr = new byte[byteBuffer2.position() - iPosition];
                byteBuffer2.get(bArr);
                return indexMap.adjust(new C8553(c8566, b, new C8558(bArr)));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putAnnotationOffset(i, DexMerger.this.annotationOut.f23891.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8553 c8553) {
                C8565 c8565 = DexMerger.this.annotationOut;
                c8565.writeByte(c8553.f23821);
                c8565.write(c8553.f23822.f23864);
            }
        }.mergeUnsorted();
    }

    private int mergeApiLevels() {
        int i = -1;
        int i2 = 0;
        while (true) {
            C8566[] c8566Arr = this.dexes;
            if (i2 >= c8566Arr.length) {
                return i;
            }
            int i3 = c8566Arr[i2].f23898.f23840;
            if (i < i3) {
                i = i3;
            }
            i2++;
        }
    }

    private void mergeCallSiteIds() {
        new IdMerger<C8552>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.5
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23847;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8552 read(C8565 c8565, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8552(c8565.f23889, c8565.f23891.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.callSiteIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8552 c8552) {
                DexMerger.this.idsDefsOut.writeInt(c8552.f23819);
            }
        }.mergeSorted();
    }

    private void mergeClassDefs() {
        SortableType[] sortedTypes = getSortedTypes();
        this.contentsOut.f23848.f23855 = this.idsDefsOut.f23891.position();
        this.contentsOut.f23848.f23854 = sortedTypes.length;
        for (SortableType sortableType : sortedTypes) {
            transformClassDef(sortableType.getDex(), sortableType.getClassDef(), sortableType.getIndexMap());
        }
    }

    private C8566 mergeDexes() {
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
        Arrays.sort(this.contentsOut.f23839);
        C8554 c8554 = this.contentsOut;
        C8555 c8555 = c8554.f23834;
        c8555.f23855 = 0;
        c8555.f23854 = 1;
        c8554.f23828 = this.dexOut.f23899.capacity();
        this.contentsOut.m14091();
        C8554 c85542 = this.contentsOut;
        C8565 c8565 = this.headerOut;
        int iMergeApiLevels = mergeApiLevels();
        c85542.getClass();
        c8565.write(AbstractC3055.m6632(iMergeApiLevels).getBytes("UTF-8"));
        c8565.writeInt(c85542.f23837);
        c8565.write(c85542.f23838);
        c8565.writeInt(c85542.f23828);
        c8565.writeInt(112);
        c8565.writeInt(305419896);
        c8565.writeInt(c85542.f23827);
        c8565.writeInt(c85542.f23826);
        c8565.writeInt(c85542.f23852.f23855);
        C8555 c85552 = c85542.f23833;
        c8565.writeInt(c85552.f23854);
        c8565.writeInt(c85552.f23855);
        C8555 c85553 = c85542.f23832;
        c8565.writeInt(c85553.f23854);
        c8565.writeInt(c85553.f23855);
        C8555 c85554 = c85542.f23831;
        c8565.writeInt(c85554.f23854);
        c8565.writeInt(c85554.f23855);
        C8555 c85555 = c85542.f23830;
        c8565.writeInt(c85555.f23854);
        c8565.writeInt(c85555.f23855);
        C8555 c85556 = c85542.f23829;
        c8565.writeInt(c85556.f23854);
        c8565.writeInt(c85556.f23855);
        C8555 c85557 = c85542.f23848;
        c8565.writeInt(c85557.f23854);
        c8565.writeInt(c85557.f23855);
        c8565.writeInt(c85542.f23825);
        c8565.writeInt(c85542.f23824);
        C8554 c85543 = this.contentsOut;
        C8565 c85652 = this.mapListOut;
        C8555[] c8555Arr = c85543.f23839;
        int i = 0;
        for (C8555 c85558 : c8555Arr) {
            if (c85558.m14092()) {
                i++;
            }
        }
        c85652.writeInt(i);
        for (C8555 c85559 : c8555Arr) {
            if (c85559.m14092()) {
                c85652.m14108(c85559.f23856);
                c85652.m14108((short) 0);
                c85652.writeInt(c85559.f23854);
                c85652.writeInt(c85559.f23855);
            }
        }
        C8566 c8566 = this.dexOut;
        C8565 c8565M14114 = c8566.m14114(12);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferDuplicate = c8566.f23899.duplicate();
            while (byteBufferDuplicate.hasRemaining()) {
                int iMin = Math.min(8192, byteBufferDuplicate.remaining());
                byteBufferDuplicate.get(bArr, 0, iMin);
                messageDigest.update(bArr, 0, iMin);
            }
            c8565M14114.write(messageDigest.digest());
            C8565 c8565M141142 = c8566.m14114(8);
            Adler32 adler32 = new Adler32();
            byte[] bArr2 = new byte[8192];
            ByteBuffer byteBufferDuplicate2 = c8566.f23899.duplicate();
            while (byteBufferDuplicate2.hasRemaining()) {
                int iMin2 = Math.min(8192, byteBufferDuplicate2.remaining());
                byteBufferDuplicate2.get(bArr2, 0, iMin2);
                adler32.update(bArr2, 0, iMin2);
            }
            c8565M141142.writeInt((int) adler32.getValue());
            return this.dexOut;
        } catch (NoSuchAlgorithmException unused) {
            C5553.m10813();
            return null;
        }
    }

    private void mergeFieldIds() {
        new IdMerger<C8561>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.7
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23830;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8561 read(C8565 c8565, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8561(c8565.f23889, c8565.m14102(), c8565.m14102(), c8565.f23891.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6136.m11556(i3, "field ID not in [0, 0xffff]: "));
                }
                indexMap.fieldIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8561 c8561) {
                C8565 c8565 = DexMerger.this.idsDefsOut;
                c8565.m14110(c8561.f23874);
                c8565.m14110(c8561.f23875);
                c8565.writeInt(c8561.f23873);
            }
        }.mergeSorted();
    }

    private void mergeMethodHandles() {
        new IdMerger<C8562>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.6
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23851;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8562 read(C8565 c8565, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8562(c8565.f23889, MethodHandle$MethodHandleType.fromValue(c8565.m14102()), c8565.m14102(), c8565.m14102(), c8565.m14102()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.methodHandleIds.put(Integer.valueOf(i2), Integer.valueOf(indexMap.methodHandleIds.size()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8562 c8562) {
                C8565 c8565 = DexMerger.this.idsDefsOut;
                c8565.m14110(c8562.f23879.value);
                c8565.m14110(c8562.f23880);
                c8565.m14110(c8562.f23878);
                c8565.m14110(c8562.f23877);
            }
        }.mergeUnsorted();
    }

    private void mergeMethodIds() {
        new IdMerger<C8559>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.8
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23829;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8559 read(C8565 c8565, IndexMap indexMap, int i) {
                return indexMap.adjust(new C8559(c8565.f23889, c8565.m14102(), c8565.m14102(), c8565.f23891.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6136.m11556(i3, "method ID not in [0, 0xffff]: "));
                }
                indexMap.methodIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8559 c8559) {
                C8565 c8565 = DexMerger.this.idsDefsOut;
                c8565.m14110(c8559.f23866);
                c8565.m14110(c8559.f23867);
                c8565.writeInt(c8559.f23865);
            }
        }.mergeSorted();
    }

    private void mergeProtoIds() {
        new IdMerger<C8560>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.4
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23831;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8560 read(C8565 c8565, IndexMap indexMap, int i) {
                ByteBuffer byteBuffer = c8565.f23891;
                return indexMap.adjust(new C8560(c8565.f23889, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6136.m11556(i3, "proto ID not in [0, 0xffff]: "));
                }
                indexMap.protoIds[i2] = (short) i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8560 c8560) {
                C8565 c8565 = DexMerger.this.idsDefsOut;
                c8565.writeInt(c8560.f23870);
                c8565.writeInt(c8560.f23871);
                c8565.writeInt(c8560.f23869);
            }
        }.mergeSorted();
    }

    private void mergeStringIds() {
        new IdMerger<String>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.1
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23833;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.stringIds[i2] = i3;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(String str) {
                DexMerger.this.contentsOut.f23846.f23854++;
                DexMerger.this.idsDefsOut.writeInt(DexMerger.this.stringDataOut.f23891.position());
                C8565 c8565 = DexMerger.this.stringDataOut;
                c8565.getClass();
                try {
                    c8565.m14109(str.length());
                    c8565.write(AbstractC3064.m6764(str));
                    c8565.writeByte(0);
                } catch (UTFDataFormatException unused) {
                    C5553.m10813();
                }
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public String read(C8565 c8565, IndexMap indexMap, int i) {
                return c8565.m14104();
            }
        }.mergeSorted();
    }

    private void mergeTypeIds() {
        new IdMerger<Integer>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.2
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23832;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public Integer read(C8565 c8565, IndexMap indexMap, int i) {
                return Integer.valueOf(indexMap.adjustString(c8565.f23891.getInt()));
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(AbstractC6136.m11556(i3, "type ID not in [0, 0xffff]: "));
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
        new IdMerger<C8556>(this.typeListOut) { // from class: com.android.dx.merge.DexMerger.3
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8555 getSection(C8554 c8554) {
                return c8554.f23849;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public C8556 read(C8565 c8565, IndexMap indexMap, int i) {
                return indexMap.adjustTypeList(c8565.m14103());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putTypeListOffset(i, DexMerger.this.typeListOut.f23891.position());
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(C8556 c8556) {
                C8565 c8565 = DexMerger.this.typeListOut;
                c8565.getClass();
                short[] sArr = c8556.f23858;
                c8565.writeInt(sArr.length);
                for (short s : sArr) {
                    c8565.m14108(s);
                }
                ByteBuffer byteBuffer = c8565.f23891;
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

    private void readSortableTypes(SortableType[] sortableTypeArr, C8566 c8566, IndexMap indexMap) {
        c8566.getClass();
        Iterator it = !c8566.f23898.f23848.m14092() ? Collections.EMPTY_SET.iterator() : new C3348(c8566);
        while (it.hasNext()) {
            C8548 c8548 = (C8548) it.next();
            SortableType sortableTypeAdjust = indexMap.adjust(new SortableType(c8566, indexMap, c8548));
            int typeIndex = sortableTypeAdjust.getTypeIndex();
            if (sortableTypeArr[typeIndex] == null) {
                sortableTypeArr[typeIndex] = sortableTypeAdjust;
            } else if (this.collisionPolicy != CollisionPolicy.KEEP_FIRST) {
                throw new DexException("Multiple dex files define ".concat((String) c8566.f23894.get(c8548.f23803)));
            }
        }
    }

    private void transformAnnotationDirectories(C8566 c8566, IndexMap indexMap) {
        C8555 c8555 = c8566.f23898.f23835;
        if (c8555.m14092()) {
            C8565 c8565M14114 = c8566.m14114(c8555.f23855);
            for (int i = 0; i < c8555.f23854; i++) {
                transformAnnotationDirectory(c8565M14114, indexMap);
            }
        }
    }

    private void transformAnnotationDirectory(C8565 c8565, IndexMap indexMap) {
        this.contentsOut.f23835.f23854++;
        this.annotationsDirectoryOut.m14106();
        indexMap.putAnnotationDirectoryOffset(c8565.f23891.position(), this.annotationsDirectoryOut.f23891.position());
        ByteBuffer byteBuffer = c8565.f23891;
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

    private void transformAnnotationSet(IndexMap indexMap, C8565 c8565) {
        this.contentsOut.f23842.f23854++;
        this.annotationSetOut.m14106();
        indexMap.putAnnotationSetOffset(c8565.f23891.position(), this.annotationSetOut.f23891.position());
        ByteBuffer byteBuffer = c8565.f23891;
        int i = byteBuffer.getInt();
        this.annotationSetOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetOut.writeInt(indexMap.adjustAnnotation(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefList(IndexMap indexMap, C8565 c8565) {
        this.contentsOut.f23850.f23854++;
        this.annotationSetRefListOut.m14106();
        indexMap.putAnnotationSetRefListOffset(c8565.f23891.position(), this.annotationSetRefListOut.f23891.position());
        ByteBuffer byteBuffer = c8565.f23891;
        int i = byteBuffer.getInt();
        this.annotationSetRefListOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetRefListOut.writeInt(indexMap.adjustAnnotationSet(byteBuffer.getInt()));
        }
    }

    private void transformAnnotationSetRefLists(C8566 c8566, IndexMap indexMap) {
        C8555 c8555 = c8566.f23898.f23850;
        if (c8555.m14092()) {
            C8565 c8565M14114 = c8566.m14114(c8555.f23855);
            for (int i = 0; i < c8555.f23854; i++) {
                transformAnnotationSetRefList(indexMap, c8565M14114);
            }
        }
    }

    private void transformAnnotationSets(C8566 c8566, IndexMap indexMap) {
        C8555 c8555 = c8566.f23898.f23842;
        if (c8555.m14092()) {
            C8565 c8565M14114 = c8566.m14114(c8555.f23855);
            for (int i = 0; i < c8555.f23854; i++) {
                transformAnnotationSet(indexMap, c8565M14114);
            }
        }
    }

    private int[] transformCatchHandlers(IndexMap indexMap, C8564[] c8564Arr) {
        int iPosition = this.codeOut.f23891.position();
        this.codeOut.m14109(c8564Arr.length);
        int[] iArr = new int[c8564Arr.length];
        for (int i = 0; i < c8564Arr.length; i++) {
            iArr[i] = this.codeOut.f23891.position() - iPosition;
            transformEncodedCatchHandler(c8564Arr[i], indexMap);
        }
        return iArr;
    }

    private void transformClassData(C8566 c8566, C8549 c8549, IndexMap indexMap) {
        this.contentsOut.f23841.f23854++;
        C8551[] c8551Arr = c8549.f23813;
        C8551[] c8551Arr2 = c8549.f23812;
        C8550[] c8550Arr = c8549.f23811;
        C8550[] c8550Arr2 = c8549.f23810;
        this.classDataOut.m14109(c8551Arr.length);
        this.classDataOut.m14109(c8551Arr2.length);
        this.classDataOut.m14109(c8550Arr.length);
        this.classDataOut.m14109(c8550Arr2.length);
        transformFields(indexMap, c8551Arr);
        transformFields(indexMap, c8551Arr2);
        transformMethods(c8566, indexMap, c8550Arr);
        transformMethods(c8566, indexMap, c8550Arr2);
    }

    private void transformClassDef(C8566 c8566, C8548 c8548, IndexMap indexMap) {
        this.idsDefsOut.m14106();
        this.idsDefsOut.writeInt(c8548.f23803);
        this.idsDefsOut.writeInt(c8548.f23802);
        this.idsDefsOut.writeInt(c8548.f23801);
        this.idsDefsOut.writeInt(c8548.f23800);
        this.idsDefsOut.writeInt(indexMap.adjustString(c8548.f23807));
        this.idsDefsOut.writeInt(indexMap.adjustAnnotationDirectory(c8548.f23806));
        int i = c8548.f23808;
        C8565 c8565 = this.idsDefsOut;
        if (i == 0) {
            c8565.writeInt(0);
        } else {
            c8565.writeInt(this.classDataOut.f23891.position());
            transformClassData(c8566, c8566.m14113(c8548), indexMap);
        }
        this.idsDefsOut.writeInt(indexMap.adjustEncodedArray(c8548.f23809));
    }

    private void transformCode(C8566 c8566, C8567 c8567, IndexMap indexMap) {
        this.contentsOut.f23845.f23854++;
        this.codeOut.m14106();
        this.codeOut.m14110(c8567.f23908);
        this.codeOut.m14110(c8567.f23907);
        this.codeOut.m14110(c8567.f23906);
        C8563[] c8563Arr = c8567.f23903;
        C8564[] c8564Arr = c8567.f23909;
        this.codeOut.m14110(c8563Arr.length);
        int i = c8567.f23905;
        C8565 c8565 = this.codeOut;
        if (i != 0) {
            c8565.writeInt(this.debugInfoOut.f23891.position());
            transformDebugInfoItem(c8566.m14114(i), indexMap);
        } else {
            c8565.writeInt(0);
        }
        short[] sArrTransform = this.instructionTransformer.transform(indexMap, c8567.f23904);
        this.codeOut.writeInt(sArrTransform.length);
        C8565 c85652 = this.codeOut;
        c85652.getClass();
        for (short s : sArrTransform) {
            c85652.m14108(s);
        }
        if (c8563Arr.length > 0) {
            if (sArrTransform.length % 2 == 1) {
                this.codeOut.m14108((short) 0);
            }
            C8565 c8565M14114 = this.dexOut.m14114(this.codeOut.f23891.position());
            C8565 c85653 = this.codeOut;
            int length = c8563Arr.length * 8;
            if (length < 0) {
                c85653.getClass();
                C5919.m11245();
            } else {
                ByteBuffer byteBuffer = c85653.f23891;
                transformTries(c8565M14114, c8563Arr, transformCatchHandlers(indexMap, c8564Arr));
            }
        }
    }

    private void transformDebugInfoItem(C8565 c8565, IndexMap indexMap) {
        this.contentsOut.f23843.f23854++;
        c8565.getClass();
        this.debugInfoOut.m14109(AbstractC3065.m6852(c8565));
        int iM6852 = AbstractC3065.m6852(c8565);
        this.debugInfoOut.m14109(iM6852);
        for (int i = 0; i < iM6852; i++) {
            this.debugInfoOut.m14109(indexMap.adjustString(AbstractC3065.m6852(c8565) - 1) + 1);
        }
        while (true) {
            byte b = c8565.f23891.get();
            this.debugInfoOut.writeByte(b);
            if (b != 9) {
                switch (b) {
                    case 0:
                        return;
                    case 1:
                        this.debugInfoOut.m14109(AbstractC3065.m6852(c8565));
                        break;
                    case 2:
                        this.debugInfoOut.m14107(AbstractC3065.m6856(c8565));
                        break;
                    case 3:
                    case 4:
                        this.debugInfoOut.m14109(AbstractC3065.m6852(c8565));
                        this.debugInfoOut.m14109(indexMap.adjustString(AbstractC3065.m6852(c8565) - 1) + 1);
                        this.debugInfoOut.m14109(indexMap.adjustType(AbstractC3065.m6852(c8565) - 1) + 1);
                        if (b == 4) {
                            this.debugInfoOut.m14109(indexMap.adjustString(AbstractC3065.m6852(c8565) - 1) + 1);
                        }
                        break;
                    case 5:
                    case 6:
                        this.debugInfoOut.m14109(AbstractC3065.m6852(c8565));
                        break;
                }
            } else {
                this.debugInfoOut.m14109(indexMap.adjustString(AbstractC3065.m6852(c8565) - 1) + 1);
            }
        }
    }

    private void transformEncodedCatchHandler(C8564 c8564, IndexMap indexMap) {
        int i = c8564.f23886;
        int[] iArr = c8564.f23888;
        int[] iArr2 = c8564.f23887;
        C8565 c8565 = this.codeOut;
        if (i != -1) {
            c8565.m14107(-iArr.length);
        } else {
            c8565.m14107(iArr.length);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.codeOut.m14109(indexMap.adjustType(iArr[i2]));
            this.codeOut.m14109(iArr2[i2]);
        }
        if (i != -1) {
            this.codeOut.m14109(i);
        }
    }

    private void transformFields(IndexMap indexMap, C8551[] c8551Arr) {
        int length = c8551Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C8551 c8551 = c8551Arr[i];
            int iAdjustField = indexMap.adjustField(c8551.f23818);
            this.classDataOut.m14109(iAdjustField - i2);
            this.classDataOut.m14109(c8551.f23817);
            i++;
            i2 = iAdjustField;
        }
    }

    private void transformMethods(C8566 c8566, IndexMap indexMap, C8550[] c8550Arr) {
        int length = c8550Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C8550 c8550 = c8550Arr[i];
            int iAdjustMethod = indexMap.adjustMethod(c8550.f23816);
            this.classDataOut.m14109(iAdjustMethod - i2);
            this.classDataOut.m14109(c8550.f23815);
            if (c8550.f23814 == 0) {
                this.classDataOut.m14109(0);
            } else {
                ByteBuffer byteBuffer = this.codeOut.f23891;
                while ((byteBuffer.position() & 3) != 0) {
                    byteBuffer.put((byte) 0);
                }
                this.classDataOut.m14109(this.codeOut.f23891.position());
                transformCode(c8566, c8566.m14112(c8550), indexMap);
            }
            i++;
            i2 = iAdjustMethod;
        }
    }

    private void transformStaticValues(C8565 c8565, IndexMap indexMap) {
        this.contentsOut.f23836.f23854++;
        indexMap.putEncodedArrayValueOffset(c8565.f23891.position(), this.encodedArrayOut.f23891.position());
        ByteBuffer byteBuffer = c8565.f23891;
        int iPosition = byteBuffer.position();
        new C8557(c8565, 28).m14099();
        byte[] bArr = new byte[byteBuffer.position() - iPosition];
        byteBuffer.get(bArr);
        this.encodedArrayOut.write(indexMap.adjustEncodedArray(new C8558(bArr)).f23864);
    }

    private void transformTries(C8565 c8565, C8563[] c8563Arr, int[] iArr) {
        for (C8563 c8563 : c8563Arr) {
            c8565.writeInt(c8563.f23884);
            c8565.m14110(c8563.f23883);
            c8565.m14110(iArr[c8563.f23882]);
        }
    }

    private void unionAnnotationSetsAndDirectories() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C8566[] c8566Arr = this.dexes;
            if (i2 >= c8566Arr.length) {
                break;
            }
            transformAnnotationSets(c8566Arr[i2], this.indexMaps[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            C8566[] c8566Arr2 = this.dexes;
            if (i3 >= c8566Arr2.length) {
                break;
            }
            transformAnnotationSetRefLists(c8566Arr2[i3], this.indexMaps[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            C8566[] c8566Arr3 = this.dexes;
            if (i4 >= c8566Arr3.length) {
                break;
            }
            transformAnnotationDirectories(c8566Arr3[i4], this.indexMaps[i4]);
            i4++;
        }
        while (true) {
            C8566[] c8566Arr4 = this.dexes;
            if (i >= c8566Arr4.length) {
                return;
            }
            transformStaticValues(c8566Arr4[i], this.indexMaps[i]);
            i++;
        }
    }

    public C8566 merge() {
        C8566[] c8566Arr = this.dexes;
        int i = 0;
        if (c8566Arr.length == 1) {
            return c8566Arr[0];
        }
        if (c8566Arr.length == 0) {
            return null;
        }
        long jNanoTime = System.nanoTime();
        C8566 c8566MergeDexes = mergeDexes();
        WriterSizes writerSizes = new WriterSizes(this);
        int size = this.writerSizes.size() - writerSizes.size();
        if (size > this.compactWasteThreshold) {
            c8566MergeDexes = new DexMerger(new C8566[]{this.dexOut, new C8566(0)}, CollisionPolicy.FAIL, this.context, writerSizes).mergeDexes();
            this.context.out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", Float.valueOf(this.dexOut.f23899.capacity() / 1024.0f), Float.valueOf(c8566MergeDexes.f23899.capacity() / 1024.0f), Float.valueOf(size / 1024.0f));
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        while (true) {
            int length = this.dexes.length;
            DxContext dxContext = this.context;
            if (i >= length) {
                dxContext.out.printf("Result is %d defs/%.1fKiB. Took %.1fs%n", Integer.valueOf(c8566MergeDexes.f23898.f23848.f23854), Float.valueOf(c8566MergeDexes.f23899.capacity() / 1024.0f), Float.valueOf(jNanoTime2 / 1.0E9f));
                return c8566MergeDexes;
            }
            PrintStream printStream = dxContext.out;
            int i2 = i + 1;
            printStream.printf("Merged dex #%d (%d defs/%.1fKiB)%n", Integer.valueOf(i2), Integer.valueOf(this.dexes[i].f23898.f23848.f23854), Float.valueOf(this.dexes[i].f23899.capacity() / 1024.0f));
            i = i2;
        }
    }

    public void setCompactWasteThreshold(int i) {
        this.compactWasteThreshold = i;
    }

    private void transformStaticValues(C8566 c8566, IndexMap indexMap) {
        C8555 c8555 = c8566.f23898.f23836;
        if (c8555.m14092()) {
            C8565 c8565M14114 = c8566.m14114(c8555.f23855);
            for (int i = 0; i < c8555.f23854; i++) {
                transformStaticValues(c8565M14114, indexMap);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            this.header = dexMerger.headerOut.m14101();
            this.idsDefs = dexMerger.idsDefsOut.m14101();
            this.mapList = dexMerger.mapListOut.m14101();
            this.typeList = dexMerger.typeListOut.m14101();
            this.classData = dexMerger.classDataOut.m14101();
            this.code = dexMerger.codeOut.m14101();
            this.stringData = dexMerger.stringDataOut.m14101();
            this.debugInfo = dexMerger.debugInfoOut.m14101();
            this.encodedArray = dexMerger.encodedArrayOut.m14101();
            this.annotationsDirectory = dexMerger.annotationsDirectoryOut.m14101();
            this.annotationsSet = dexMerger.annotationSetOut.m14101();
            this.annotationsSetRefList = dexMerger.annotationSetRefListOut.m14101();
            this.annotation = dexMerger.annotationOut.m14101();
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

        private void plus(C8554 c8554, boolean z) {
            int i = this.idsDefs;
            C8555 c8555 = c8554.f23833;
            C8555 c85552 = c8554.f23843;
            C8555 c85553 = c8554.f23844;
            C8555 c85554 = c8554.f23836;
            C8555 c85555 = c8554.f23841;
            C8555 c85556 = c8554.f23845;
            this.idsDefs = AbstractC6136.m11541(c8554.f23848.f23854, 32, (c8554.f23829.f23854 * 8) + (c8554.f23830.f23854 * 8) + (c8554.f23831.f23854 * 12) + (c8554.f23832.f23854 * 4) + (c8555.f23854 * 4), i);
            this.mapList = (c8554.f23839.length * 12) + 4;
            this.typeList += fourByteAlign(c8554.f23849.f23853);
            this.stringData += c8554.f23846.f23853;
            this.annotationsDirectory += c8554.f23835.f23853;
            this.annotationsSet += c8554.f23842.f23853;
            this.annotationsSetRefList += c8554.f23850.f23853;
            int i2 = this.code;
            if (z) {
                this.code = i2 + c85556.f23853;
                this.classData += c85555.f23853;
                this.encodedArray += c85554.f23853;
                this.annotation += c85553.f23853;
                this.debugInfo += c85552.f23853;
                return;
            }
            this.code = i2 + ((int) Math.ceil(((double) c85556.f23853) * 1.25d));
            this.classData += (int) Math.ceil(((double) c85555.f23853) * 1.67d);
            this.encodedArray = (c85554.f23853 * 2) + this.encodedArray;
            this.annotation += (int) Math.ceil(c85553.f23853 * 2);
            this.debugInfo = AbstractC6136.m11541(c85552.f23853, 2, 8, this.debugInfo);
        }

        public int size() {
            return this.header + this.idsDefs + this.mapList + this.typeList + this.classData + this.code + this.stringData + this.debugInfo + this.encodedArray + this.annotationsDirectory + this.annotationsSet + this.annotationsSetRefList + this.annotation;
        }

        private static int fourByteAlign(int i) {
            return (i + 3) & (-4);
        }

        public WriterSizes(C8566[] c8566Arr) {
            this.header = 112;
            for (C8566 c8566 : c8566Arr) {
                plus(c8566.f23898, false);
            }
            fourByteAlign();
        }
    }

    public DexMerger(C8566[] c8566Arr, CollisionPolicy collisionPolicy, DxContext dxContext) {
        this(c8566Arr, collisionPolicy, dxContext, new WriterSizes(c8566Arr));
    }
}

package com.android.dx.merge;

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
    private final com.android.dex.Dex.Section annotationOut;
    private final com.android.dex.Dex.Section annotationSetOut;
    private final com.android.dex.Dex.Section annotationSetRefListOut;
    private final com.android.dex.Dex.Section annotationsDirectoryOut;
    private final com.android.dex.Dex.Section classDataOut;
    private final com.android.dex.Dex.Section codeOut;
    private final com.android.dx.merge.CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final com.android.dex.TableOfContents contentsOut;
    private final com.android.dx.command.dexer.DxContext context;
    private final com.android.dex.Dex.Section debugInfoOut;
    private final com.android.dex.Dex dexOut;
    private final com.android.dex.Dex[] dexes;
    private final com.android.dex.Dex.Section encodedArrayOut;
    private final com.android.dex.Dex.Section headerOut;
    private final com.android.dex.Dex.Section idsDefsOut;
    private final com.android.dx.merge.IndexMap[] indexMaps;
    private final com.android.dx.merge.InstructionTransformer instructionTransformer;
    private final com.android.dex.Dex.Section mapListOut;
    private final com.android.dex.Dex.Section stringDataOut;
    private final com.android.dex.Dex.Section typeListOut;
    private final com.android.dx.merge.DexMerger.WriterSizes writerSizes;










    public abstract class IdMerger<T extends java.lang.Comparable<T>> {
        private final com.android.dex.Dex.Section out;
        final /* synthetic */ com.android.dx.merge.DexMerger this$0;

        public class UnsortedValue implements java.lang.Comparable<com.android.dx.merge.DexMerger.IdMerger<T>.UnsortedValue> {
            final int index;
            final com.android.dx.merge.IndexMap indexMap;
            final int offset;
            final com.android.dex.Dex source;
            final /* synthetic */ com.android.dx.merge.DexMerger.IdMerger this$1;
            final T value;

            public UnsortedValue(com.android.dx.merge.DexMerger.IdMerger r1, com.android.dex.Dex r2, com.android.dx.merge.IndexMap r3, T r4, int r5, int r6) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.source = r2
                    r0.indexMap = r3
                    r0.value = r4
                    r0.index = r5
                    r0.offset = r6
                    return
            }

            public int compareTo(com.android.dx.merge.DexMerger.IdMerger<T>.UnsortedValue r2) {
                    r1 = this;
                    T extends java.lang.Comparable<T> r0 = r1.value
                    T extends java.lang.Comparable<T> r2 = r2.value
                    int r2 = r0.compareTo(r2)
                    return r2
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                    r0 = this;
                    com.android.dx.merge.DexMerger$IdMerger$UnsortedValue r1 = (com.android.dx.merge.DexMerger.IdMerger.UnsortedValue) r1
                    int r1 = r0.compareTo(r1)
                    return r1
            }
        }

        public IdMerger(com.android.dx.merge.DexMerger r1, com.android.dex.Dex.Section r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.out = r2
                return
        }

        private int readIntoMap(com.android.dex.Dex.Section r2, com.android.dex.TableOfContents.Section r3, com.android.dx.merge.IndexMap r4, int r5, java.util.TreeMap<T, java.util.List<java.lang.Integer>> r6, int r7) {
                r1 = this;
                if (r2 == 0) goto L7
                int r0 = r2.getPosition()
                goto L8
            L7:
                r0 = -1
            L8:
                int r3 = r3.size
                if (r5 >= r3) goto L27
                java.lang.Comparable r2 = r1.read(r2, r4, r5)
                java.lang.Object r3 = r6.get(r2)
                java.util.List r3 = (java.util.List) r3
                if (r3 != 0) goto L20
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r6.put(r2, r3)
            L20:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r3.add(r2)
            L27:
                return r0
        }

        private java.util.List<com.android.dx.merge.DexMerger.IdMerger<T>.UnsortedValue> readUnsortedValues(com.android.dex.Dex r14, com.android.dx.merge.IndexMap r15) {
                r13 = this;
                com.android.dex.TableOfContents r0 = r14.getTableOfContents()
                com.android.dex.TableOfContents$Section r0 = r13.getSection(r0)
                boolean r1 = r0.exists()
                if (r1 != 0) goto L13
                java.util.List r14 = java.util.Collections.emptyList()
                return r14
            L13:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.off
                com.android.dex.Dex$Section r2 = r14.open(r2)
                r3 = 0
                r11 = r3
            L20:
                int r4 = r0.size
                if (r11 >= r4) goto L3c
                int r10 = r2.getPosition()
                java.lang.Comparable r8 = r13.read(r2, r15, r3)
                com.android.dx.merge.DexMerger$IdMerger$UnsortedValue r12 = new com.android.dx.merge.DexMerger$IdMerger$UnsortedValue
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r9 = r11
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r1.add(r12)
                int r11 = r11 + 1
                goto L20
            L3c:
                return r1
        }

        public abstract com.android.dex.TableOfContents.Section getSection(com.android.dex.TableOfContents r1);

        public final void mergeSorted() {
                r17 = this;
                r7 = r17
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                int r0 = r0.length
                com.android.dex.TableOfContents$Section[] r8 = new com.android.dex.TableOfContents.Section[r0]
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                int r0 = r0.length
                com.android.dex.Dex$Section[] r9 = new com.android.dex.Dex.Section[r0]
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                int r0 = r0.length
                int[] r10 = new int[r0]
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                int r0 = r0.length
                int[] r11 = new int[r0]
                java.util.TreeMap r12 = new java.util.TreeMap
                r12.<init>()
                r13 = 0
                r14 = r13
            L2d:
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                int r0 = r0.length
                if (r14 >= r0) goto L7d
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                r0 = r0[r14]
                com.android.dex.TableOfContents r0 = r0.getTableOfContents()
                com.android.dex.TableOfContents$Section r0 = r7.getSection(r0)
                r8[r14] = r0
                boolean r0 = r0.exists()
                if (r0 == 0) goto L60
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.Dex[] r0 = com.android.dx.merge.DexMerger.access$1300(r0)
                r0 = r0[r14]
                r1 = r8[r14]
                int r1 = r1.off
                com.android.dex.Dex$Section r0 = r0.open(r1)
            L5e:
                r1 = r0
                goto L62
            L60:
                r0 = 0
                goto L5e
            L62:
                r9[r14] = r1
                r2 = r8[r14]
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dx.merge.IndexMap[] r0 = com.android.dx.merge.DexMerger.access$1400(r0)
                r3 = r0[r14]
                r4 = r11[r14]
                r0 = r17
                r5 = r12
                r6 = r14
                int r0 = r0.readIntoMap(r1, r2, r3, r4, r5, r6)
                r10[r14] = r0
                int r14 = r14 + 1
                goto L2d
            L7d:
                boolean r0 = r12.isEmpty()
                if (r0 == 0) goto L9c
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r7.getSection(r0)
                r0.off = r13
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r7.getSection(r0)
                r0.size = r13
                return
            L9c:
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r7.getSection(r0)
                com.android.dex.Dex$Section r1 = r7.out
                int r1 = r1.getPosition()
                r0.off = r1
            Lae:
                boolean r0 = r12.isEmpty()
                if (r0 != 0) goto L129
                java.util.Map$Entry r14 = r12.pollFirstEntry()
                java.lang.Object r0 = r14.getValue()
                java.util.List r0 = (java.util.List) r0
                java.util.Iterator r15 = r0.iterator()
            Lc2:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L11d
                java.lang.Object r0 = r15.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r1 = r0.intValue()
                r1 = r10[r1]
                com.android.dx.merge.DexMerger r2 = r7.this$0
                com.android.dx.merge.IndexMap[] r2 = com.android.dx.merge.DexMerger.access$1400(r2)
                int r3 = r0.intValue()
                r2 = r2[r3]
                int r3 = r0.intValue()
                r4 = r11[r3]
                int r5 = r4 + 1
                r11[r3] = r5
                r7.updateIndex(r1, r2, r4, r13)
                int r16 = r0.intValue()
                int r1 = r0.intValue()
                r1 = r9[r1]
                int r2 = r0.intValue()
                r2 = r8[r2]
                com.android.dx.merge.DexMerger r3 = r7.this$0
                com.android.dx.merge.IndexMap[] r3 = com.android.dx.merge.DexMerger.access$1400(r3)
                int r4 = r0.intValue()
                r3 = r3[r4]
                int r4 = r0.intValue()
                r4 = r11[r4]
                int r6 = r0.intValue()
                r0 = r17
                r5 = r12
                int r0 = r0.readIntoMap(r1, r2, r3, r4, r5, r6)
                r10[r16] = r0
                goto Lc2
            L11d:
                java.lang.Object r0 = r14.getKey()
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                r7.write(r0)
                int r13 = r13 + 1
                goto Lae
            L129:
                com.android.dx.merge.DexMerger r0 = r7.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r7.getSection(r0)
                r0.size = r13
                return
        }

        public final void mergeUnsorted() {
                r8 = this;
                com.android.dx.merge.DexMerger r0 = r8.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r8.getSection(r0)
                com.android.dex.Dex$Section r1 = r8.out
                int r1 = r1.getPosition()
                r0.off = r1
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = r1
            L19:
                com.android.dx.merge.DexMerger r3 = r8.this$0
                com.android.dex.Dex[] r3 = com.android.dx.merge.DexMerger.access$1300(r3)
                int r3 = r3.length
                if (r2 >= r3) goto L3c
                com.android.dx.merge.DexMerger r3 = r8.this$0
                com.android.dex.Dex[] r3 = com.android.dx.merge.DexMerger.access$1300(r3)
                r3 = r3[r2]
                com.android.dx.merge.DexMerger r4 = r8.this$0
                com.android.dx.merge.IndexMap[] r4 = com.android.dx.merge.DexMerger.access$1400(r4)
                r4 = r4[r2]
                java.util.List r3 = r8.readUnsortedValues(r3, r4)
                r0.addAll(r3)
                int r2 = r2 + 1
                goto L19
            L3c:
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L5b
                com.android.dx.merge.DexMerger r0 = r8.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r8.getSection(r0)
                r0.off = r1
                com.android.dx.merge.DexMerger r0 = r8.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r8.getSection(r0)
                r0.size = r1
                return
            L5b:
                java.util.Collections.sort(r0)
                r2 = r1
            L5f:
                int r3 = r0.size()
                if (r1 >= r3) goto La6
                int r3 = r1 + 1
                java.lang.Object r1 = r0.get(r1)
                com.android.dx.merge.DexMerger$IdMerger$UnsortedValue r1 = (com.android.dx.merge.DexMerger.IdMerger.UnsortedValue) r1
                int r4 = r1.offset
                com.android.dx.merge.IndexMap r5 = r1.indexMap
                int r6 = r1.index
                int r7 = r2 + (-1)
                r8.updateIndex(r4, r5, r6, r7)
            L78:
                int r4 = r0.size()
                if (r3 >= r4) goto L9d
                java.lang.Object r4 = r0.get(r3)
                com.android.dx.merge.DexMerger$IdMerger$UnsortedValue r4 = (com.android.dx.merge.DexMerger.IdMerger.UnsortedValue) r4
                int r4 = r1.compareTo(r4)
                if (r4 != 0) goto L9d
                int r4 = r3 + 1
                java.lang.Object r3 = r0.get(r3)
                com.android.dx.merge.DexMerger$IdMerger$UnsortedValue r3 = (com.android.dx.merge.DexMerger.IdMerger.UnsortedValue) r3
                int r5 = r3.offset
                com.android.dx.merge.IndexMap r6 = r3.indexMap
                int r3 = r3.index
                r8.updateIndex(r5, r6, r3, r7)
                r3 = r4
                goto L78
            L9d:
                T extends java.lang.Comparable<T> r1 = r1.value
                r8.write(r1)
                int r2 = r2 + 1
                r1 = r3
                goto L5f
            La6:
                com.android.dx.merge.DexMerger r0 = r8.this$0
                com.android.dex.TableOfContents r0 = com.android.dx.merge.DexMerger.access$1500(r0)
                com.android.dex.TableOfContents$Section r0 = r8.getSection(r0)
                r0.size = r2
                return
        }

        public abstract T read(com.android.dex.Dex.Section r1, com.android.dx.merge.IndexMap r2, int r3);

        public abstract void updateIndex(int r1, com.android.dx.merge.IndexMap r2, int r3, int r4);

        public abstract void write(T r1);
    }

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

        public WriterSizes(com.android.dx.merge.DexMerger r2) {
                r1 = this;
                r1.<init>()
                r0 = 112(0x70, float:1.57E-43)
                r1.header = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2000(r2)
                int r0 = r0.used()
                r1.header = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$1700(r2)
                int r0 = r0.used()
                r1.idsDefs = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2100(r2)
                int r0 = r0.used()
                r1.mapList = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$1800(r2)
                int r0 = r0.used()
                r1.typeList = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2200(r2)
                int r0 = r0.used()
                r1.classData = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2300(r2)
                int r0 = r0.used()
                r1.code = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$1600(r2)
                int r0 = r0.used()
                r1.stringData = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2400(r2)
                int r0 = r0.used()
                r1.debugInfo = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2500(r2)
                int r0 = r0.used()
                r1.encodedArray = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2600(r2)
                int r0 = r0.used()
                r1.annotationsDirectory = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2700(r2)
                int r0 = r0.used()
                r1.annotationsSet = r0
                com.android.dex.Dex$Section r0 = com.android.dx.merge.DexMerger.access$2800(r2)
                int r0 = r0.used()
                r1.annotationsSetRefList = r0
                com.android.dex.Dex$Section r2 = com.android.dx.merge.DexMerger.access$1900(r2)
                int r2 = r2.used()
                r1.annotation = r2
                r1.fourByteAlign()
                return
        }

        public WriterSizes(com.android.dex.Dex[] r4) {
                r3 = this;
                r3.<init>()
                r0 = 112(0x70, float:1.57E-43)
                r3.header = r0
                r0 = 0
                r1 = r0
            L9:
                int r2 = r4.length
                if (r1 >= r2) goto L18
                r2 = r4[r1]
                com.android.dex.TableOfContents r2 = r2.getTableOfContents()
                r3.plus(r2, r0)
                int r1 = r1 + 1
                goto L9
            L18:
                r3.fourByteAlign()
                return
        }

        public static /* synthetic */ int access$000(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.header
                return r0
        }

        public static /* synthetic */ int access$100(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.idsDefs
                return r0
        }

        public static /* synthetic */ int access$1000(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.annotation
                return r0
        }

        public static /* synthetic */ int access$1100(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.encodedArray
                return r0
        }

        public static /* synthetic */ int access$1200(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.annotationsDirectory
                return r0
        }

        public static /* synthetic */ int access$200(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.mapList
                return r0
        }

        public static /* synthetic */ int access$300(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.typeList
                return r0
        }

        public static /* synthetic */ int access$400(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.annotationsSetRefList
                return r0
        }

        public static /* synthetic */ int access$500(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.annotationsSet
                return r0
        }

        public static /* synthetic */ int access$600(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.classData
                return r0
        }

        public static /* synthetic */ int access$700(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.code
                return r0
        }

        public static /* synthetic */ int access$800(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.stringData
                return r0
        }

        public static /* synthetic */ int access$900(com.android.dx.merge.DexMerger.WriterSizes r0) {
                int r0 = r0.debugInfo
                return r0
        }

        private static int fourByteAlign(int r0) {
                int r0 = r0 + 3
                r0 = r0 & (-4)
                return r0
        }

        private void fourByteAlign() {
                r1 = this;
                int r0 = r1.header
                int r0 = fourByteAlign(r0)
                r1.header = r0
                int r0 = r1.idsDefs
                int r0 = fourByteAlign(r0)
                r1.idsDefs = r0
                int r0 = r1.mapList
                int r0 = fourByteAlign(r0)
                r1.mapList = r0
                int r0 = r1.typeList
                int r0 = fourByteAlign(r0)
                r1.typeList = r0
                int r0 = r1.classData
                int r0 = fourByteAlign(r0)
                r1.classData = r0
                int r0 = r1.code
                int r0 = fourByteAlign(r0)
                r1.code = r0
                int r0 = r1.stringData
                int r0 = fourByteAlign(r0)
                r1.stringData = r0
                int r0 = r1.debugInfo
                int r0 = fourByteAlign(r0)
                r1.debugInfo = r0
                int r0 = r1.encodedArray
                int r0 = fourByteAlign(r0)
                r1.encodedArray = r0
                int r0 = r1.annotationsDirectory
                int r0 = fourByteAlign(r0)
                r1.annotationsDirectory = r0
                int r0 = r1.annotationsSet
                int r0 = fourByteAlign(r0)
                r1.annotationsSet = r0
                int r0 = r1.annotationsSetRefList
                int r0 = fourByteAlign(r0)
                r1.annotationsSetRefList = r0
                int r0 = r1.annotation
                int r0 = fourByteAlign(r0)
                r1.annotation = r0
                return
        }

        private void plus(com.android.dex.TableOfContents r5, boolean r6) {
                r4 = this;
                int r0 = r4.idsDefs
                com.android.dex.TableOfContents$Section r1 = r5.stringIds
                int r1 = r1.size
                int r1 = r1 * 4
                com.android.dex.TableOfContents$Section r2 = r5.typeIds
                int r2 = r2.size
                int r2 = r2 * 4
                int r1 = r1 + r2
                com.android.dex.TableOfContents$Section r2 = r5.protoIds
                int r2 = r2.size
                int r2 = r2 * 12
                int r1 = r1 + r2
                com.android.dex.TableOfContents$Section r2 = r5.fieldIds
                int r2 = r2.size
                int r2 = r2 * 8
                int r1 = r1 + r2
                com.android.dex.TableOfContents$Section r2 = r5.methodIds
                int r2 = r2.size
                int r2 = r2 * 8
                int r1 = r1 + r2
                com.android.dex.TableOfContents$Section r2 = r5.classDefs
                int r2 = r2.size
                int r2 = r2 * 32
                int r1 = r1 + r2
                int r0 = r0 + r1
                r4.idsDefs = r0
                com.android.dex.TableOfContents$Section[] r0 = r5.sections
                int r0 = r0.length
                int r0 = r0 * 12
                int r0 = r0 + 4
                r4.mapList = r0
                int r0 = r4.typeList
                com.android.dex.TableOfContents$Section r1 = r5.typeLists
                int r1 = r1.byteCount
                int r1 = fourByteAlign(r1)
                int r0 = r0 + r1
                r4.typeList = r0
                int r0 = r4.stringData
                com.android.dex.TableOfContents$Section r1 = r5.stringDatas
                int r1 = r1.byteCount
                int r0 = r0 + r1
                r4.stringData = r0
                int r0 = r4.annotationsDirectory
                com.android.dex.TableOfContents$Section r1 = r5.annotationsDirectories
                int r1 = r1.byteCount
                int r0 = r0 + r1
                r4.annotationsDirectory = r0
                int r0 = r4.annotationsSet
                com.android.dex.TableOfContents$Section r1 = r5.annotationSets
                int r1 = r1.byteCount
                int r0 = r0 + r1
                r4.annotationsSet = r0
                int r0 = r4.annotationsSetRefList
                com.android.dex.TableOfContents$Section r1 = r5.annotationSetRefLists
                int r1 = r1.byteCount
                int r0 = r0 + r1
                r4.annotationsSetRefList = r0
                if (r6 == 0) goto L98
                int r6 = r4.code
                com.android.dex.TableOfContents$Section r0 = r5.codes
                int r0 = r0.byteCount
                int r6 = r6 + r0
                r4.code = r6
                int r6 = r4.classData
                com.android.dex.TableOfContents$Section r0 = r5.classDatas
                int r0 = r0.byteCount
                int r6 = r6 + r0
                r4.classData = r6
                int r6 = r4.encodedArray
                com.android.dex.TableOfContents$Section r0 = r5.encodedArrays
                int r0 = r0.byteCount
                int r6 = r6 + r0
                r4.encodedArray = r6
                int r6 = r4.annotation
                com.android.dex.TableOfContents$Section r0 = r5.annotations
                int r0 = r0.byteCount
                int r6 = r6 + r0
                r4.annotation = r6
                int r6 = r4.debugInfo
                com.android.dex.TableOfContents$Section r5 = r5.debugInfos
                int r5 = r5.byteCount
                int r6 = r6 + r5
                r4.debugInfo = r6
                goto Le8
            L98:
                int r6 = r4.code
                com.android.dex.TableOfContents$Section r0 = r5.codes
                int r0 = r0.byteCount
                double r0 = (double) r0
                r2 = 4608308318706860032(0x3ff4000000000000, double:1.25)
                double r0 = r0 * r2
                double r0 = java.lang.Math.ceil(r0)
                int r0 = (int) r0
                int r6 = r6 + r0
                r4.code = r6
                int r6 = r4.classData
                com.android.dex.TableOfContents$Section r0 = r5.classDatas
                int r0 = r0.byteCount
                double r0 = (double) r0
                r2 = 4610199830550355640(0x3ffab851eb851eb8, double:1.67)
                double r0 = r0 * r2
                double r0 = java.lang.Math.ceil(r0)
                int r0 = (int) r0
                int r6 = r6 + r0
                r4.classData = r6
                int r6 = r4.encodedArray
                com.android.dex.TableOfContents$Section r0 = r5.encodedArrays
                int r0 = r0.byteCount
                int r0 = r0 * 2
                int r6 = r6 + r0
                r4.encodedArray = r6
                int r6 = r4.annotation
                com.android.dex.TableOfContents$Section r0 = r5.annotations
                int r0 = r0.byteCount
                int r0 = r0 * 2
                double r0 = (double) r0
                double r0 = java.lang.Math.ceil(r0)
                int r0 = (int) r0
                int r6 = r6 + r0
                r4.annotation = r6
                int r6 = r4.debugInfo
                com.android.dex.TableOfContents$Section r5 = r5.debugInfos
                int r5 = r5.byteCount
                int r5 = r5 * 2
                int r5 = r5 + 8
                int r6 = r6 + r5
                r4.debugInfo = r6
            Le8:
                return
        }

        public int size() {
                r2 = this;
                int r0 = r2.header
                int r1 = r2.idsDefs
                int r0 = r0 + r1
                int r1 = r2.mapList
                int r0 = r0 + r1
                int r1 = r2.typeList
                int r0 = r0 + r1
                int r1 = r2.classData
                int r0 = r0 + r1
                int r1 = r2.code
                int r0 = r0 + r1
                int r1 = r2.stringData
                int r0 = r0 + r1
                int r1 = r2.debugInfo
                int r0 = r0 + r1
                int r1 = r2.encodedArray
                int r0 = r0 + r1
                int r1 = r2.annotationsDirectory
                int r0 = r0 + r1
                int r1 = r2.annotationsSet
                int r0 = r0 + r1
                int r1 = r2.annotationsSetRefList
                int r0 = r0 + r1
                int r1 = r2.annotation
                int r0 = r0 + r1
                return r0
        }
    }

    public DexMerger(com.android.dex.Dex[] r2, com.android.dx.merge.CollisionPolicy r3, com.android.dx.command.dexer.DxContext r4) throws java.io.IOException {
            r1 = this;
            com.android.dx.merge.DexMerger$WriterSizes r0 = new com.android.dx.merge.DexMerger$WriterSizes
            r0.<init>(r2)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private DexMerger(com.android.dex.Dex[] r4, com.android.dx.merge.CollisionPolicy r5, com.android.dx.command.dexer.DxContext r6, com.android.dx.merge.DexMerger.WriterSizes r7) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 1048576(0x100000, float:1.469368E-39)
            r3.compactWasteThreshold = r0
            r3.dexes = r4
            r3.collisionPolicy = r5
            r3.context = r6
            r3.writerSizes = r7
            com.android.dex.Dex r5 = new com.android.dex.Dex
            int r6 = r7.size()
            r5.<init>(r6)
            r3.dexOut = r5
            int r5 = r4.length
            com.android.dx.merge.IndexMap[] r5 = new com.android.dx.merge.IndexMap[r5]
            r3.indexMaps = r5
            r5 = 0
        L20:
            int r6 = r4.length
            if (r5 >= r6) goto L37
            com.android.dx.merge.IndexMap[] r6 = r3.indexMaps
            com.android.dx.merge.IndexMap r0 = new com.android.dx.merge.IndexMap
            com.android.dex.Dex r1 = r3.dexOut
            r2 = r4[r5]
            com.android.dex.TableOfContents r2 = r2.getTableOfContents()
            r0.<init>(r1, r2)
            r6[r5] = r0
            int r5 = r5 + 1
            goto L20
        L37:
            com.android.dx.merge.InstructionTransformer r4 = new com.android.dx.merge.InstructionTransformer
            r4.<init>()
            r3.instructionTransformer = r4
            com.android.dex.Dex r4 = r3.dexOut
            int r5 = com.android.dx.merge.DexMerger.WriterSizes.access$000(r7)
            java.lang.String r6 = "header"
            com.android.dex.Dex$Section r4 = r4.appendSection(r5, r6)
            r3.headerOut = r4
            com.android.dex.Dex r4 = r3.dexOut
            int r5 = com.android.dx.merge.DexMerger.WriterSizes.access$100(r7)
            java.lang.String r6 = "ids defs"
            com.android.dex.Dex$Section r4 = r4.appendSection(r5, r6)
            r3.idsDefsOut = r4
            com.android.dex.Dex r4 = r3.dexOut
            com.android.dex.TableOfContents r4 = r4.getTableOfContents()
            r3.contentsOut = r4
            com.android.dex.Dex r5 = r3.dexOut
            int r5 = r5.getNextSectionStart()
            r4.dataOff = r5
            com.android.dex.TableOfContents$Section r5 = r4.mapList
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.TableOfContents$Section r5 = r4.mapList
            r6 = 1
            r5.size = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$200(r7)
            java.lang.String r0 = "map list"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.mapListOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.typeLists
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$300(r7)
            java.lang.String r0 = "type list"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.typeListOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.annotationSetRefLists
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$400(r7)
            java.lang.String r0 = "annotation set ref list"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.annotationSetRefListOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.annotationSets
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$500(r7)
            java.lang.String r0 = "annotation sets"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.annotationSetOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.classDatas
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$600(r7)
            java.lang.String r0 = "class data"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.classDataOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.codes
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$700(r7)
            java.lang.String r0 = "code"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.codeOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.stringDatas
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$800(r7)
            java.lang.String r0 = "string data"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.stringDataOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.debugInfos
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$900(r7)
            java.lang.String r0 = "debug info"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.debugInfoOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.annotations
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$1000(r7)
            java.lang.String r0 = "annotation"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.annotationOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.encodedArrays
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$1100(r7)
            java.lang.String r0 = "encoded array"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r0)
            r3.encodedArrayOut = r5
            com.android.dex.TableOfContents$Section r5 = r4.annotationsDirectories
            com.android.dex.Dex r6 = r3.dexOut
            int r6 = r6.getNextSectionStart()
            r5.off = r6
            com.android.dex.Dex r5 = r3.dexOut
            int r6 = com.android.dx.merge.DexMerger.WriterSizes.access$1200(r7)
            java.lang.String r7 = "annotations directory"
            com.android.dex.Dex$Section r5 = r5.appendSection(r6, r7)
            r3.annotationsDirectoryOut = r5
            com.android.dex.Dex r5 = r3.dexOut
            int r5 = r5.getNextSectionStart()
            int r6 = r4.dataOff
            int r5 = r5 - r6
            r4.dataSize = r5
            return
    }

    public static /* synthetic */ com.android.dex.Dex[] access$1300(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex[] r0 = r0.dexes
            return r0
    }

    public static /* synthetic */ com.android.dx.merge.IndexMap[] access$1400(com.android.dx.merge.DexMerger r0) {
            com.android.dx.merge.IndexMap[] r0 = r0.indexMaps
            return r0
    }

    public static /* synthetic */ com.android.dex.TableOfContents access$1500(com.android.dx.merge.DexMerger r0) {
            com.android.dex.TableOfContents r0 = r0.contentsOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$1600(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.stringDataOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$1700(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.idsDefsOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$1800(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.typeListOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$1900(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.annotationOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2000(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.headerOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2100(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.mapListOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2200(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.classDataOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2300(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.codeOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2400(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.debugInfoOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2500(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.encodedArrayOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2600(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.annotationsDirectoryOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2700(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.annotationSetOut
            return r0
    }

    public static /* synthetic */ com.android.dex.Dex.Section access$2800(com.android.dx.merge.DexMerger r0) {
            com.android.dex.Dex$Section r0 = r0.annotationSetRefListOut
            return r0
    }

    private com.android.dx.merge.SortableType[] getSortedTypes() {
            r7 = this;
            com.android.dex.TableOfContents r0 = r7.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.typeIds
            int r0 = r0.size
            com.android.dx.merge.SortableType[] r1 = new com.android.dx.merge.SortableType[r0]
            r2 = 0
            r3 = r2
        La:
            com.android.dex.Dex[] r4 = r7.dexes
            int r5 = r4.length
            if (r3 >= r5) goto L1b
            r4 = r4[r3]
            com.android.dx.merge.IndexMap[] r5 = r7.indexMaps
            r5 = r5[r3]
            r7.readSortableTypes(r1, r4, r5)
            int r3 = r3 + 1
            goto La
        L1b:
            r3 = 1
            r4 = r2
        L1d:
            if (r4 >= r0) goto L31
            r5 = r1[r4]
            if (r5 == 0) goto L2e
            boolean r6 = r5.isDepthAssigned()
            if (r6 != 0) goto L2e
            boolean r5 = r5.tryAssignDepth(r1)
            r3 = r3 & r5
        L2e:
            int r4 = r4 + 1
            goto L1d
        L31:
            if (r3 == 0) goto L1b
            java.util.Comparator<com.android.dx.merge.SortableType> r0 = com.android.dx.merge.SortableType.NULLS_LAST_ORDER
            java.util.Arrays.sort(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r1)
            r3 = 0
            int r0 = r0.indexOf(r3)
            r3 = -1
            if (r0 == r3) goto L4b
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            r1 = r0
            com.android.dx.merge.SortableType[] r1 = (com.android.dx.merge.SortableType[]) r1
        L4b:
            return r1
    }

    public static void main(java.lang.String[] r6) throws java.io.IOException {
            int r0 = r6.length
            r1 = 2
            if (r0 >= r1) goto L8
            printUsage()
            return
        L8:
            int r0 = r6.length
            r1 = 1
            int r0 = r0 - r1
            com.android.dex.Dex[] r0 = new com.android.dex.Dex[r0]
        Ld:
            int r2 = r6.length
            if (r1 >= r2) goto L23
            int r2 = r1 + (-1)
            com.android.dex.Dex r3 = new com.android.dex.Dex
            java.io.File r4 = new java.io.File
            r5 = r6[r1]
            r4.<init>(r5)
            r3.<init>(r4)
            r0[r2] = r3
            int r1 = r1 + 1
            goto Ld
        L23:
            com.android.dx.merge.DexMerger r1 = new com.android.dx.merge.DexMerger
            com.android.dx.merge.CollisionPolicy r2 = com.android.dx.merge.CollisionPolicy.KEEP_FIRST
            com.android.dx.command.dexer.DxContext r3 = new com.android.dx.command.dexer.DxContext
            r3.<init>()
            r1.<init>(r0, r2, r3)
            com.android.dex.Dex r0 = r1.merge()
            java.io.File r1 = new java.io.File
            r2 = 0
            r6 = r6[r2]
            r1.<init>(r6)
            r0.writeTo(r1)
            return
    }

    private void mergeAnnotations() {
            r2 = this;
            com.android.dx.merge.DexMerger$9 r0 = new com.android.dx.merge.DexMerger$9
            com.android.dex.Dex$Section r1 = r2.annotationOut
            r0.<init>(r2, r1)
            r0.mergeUnsorted()
            return
    }

    private int mergeApiLevels() {
            r4 = this;
            r0 = -1
            r1 = 0
        L2:
            com.android.dex.Dex[] r2 = r4.dexes
            int r3 = r2.length
            if (r1 >= r3) goto L15
            r2 = r2[r1]
            com.android.dex.TableOfContents r2 = r2.getTableOfContents()
            int r2 = r2.apiLevel
            if (r0 >= r2) goto L12
            r0 = r2
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            return r0
    }

    private void mergeCallSiteIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$5 r0 = new com.android.dx.merge.DexMerger$5
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeClassDefs() {
            r6 = this;
            com.android.dx.merge.SortableType[] r0 = r6.getSortedTypes()
            com.android.dex.TableOfContents r1 = r6.contentsOut
            com.android.dex.TableOfContents$Section r1 = r1.classDefs
            com.android.dex.Dex$Section r2 = r6.idsDefsOut
            int r2 = r2.getPosition()
            r1.off = r2
            com.android.dex.TableOfContents r1 = r6.contentsOut
            com.android.dex.TableOfContents$Section r1 = r1.classDefs
            int r2 = r0.length
            r1.size = r2
            int r1 = r0.length
            r2 = 0
        L19:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            com.android.dex.Dex r4 = r3.getDex()
            com.android.dex.ClassDef r5 = r3.getClassDef()
            com.android.dx.merge.IndexMap r3 = r3.getIndexMap()
            r6.transformClassDef(r4, r5, r3)
            int r2 = r2 + 1
            goto L19
        L2f:
            return
    }

    private com.android.dex.Dex mergeDexes() throws java.io.IOException {
            r3 = this;
            r3.mergeStringIds()
            r3.mergeTypeIds()
            r3.mergeTypeLists()
            r3.mergeProtoIds()
            r3.mergeFieldIds()
            r3.mergeMethodIds()
            r3.mergeMethodHandles()
            r3.mergeAnnotations()
            r3.unionAnnotationSetsAndDirectories()
            r3.mergeCallSiteIds()
            r3.mergeClassDefs()
            com.android.dex.TableOfContents r0 = r3.contentsOut
            com.android.dex.TableOfContents$Section[] r0 = r0.sections
            java.util.Arrays.sort(r0)
            com.android.dex.TableOfContents r0 = r3.contentsOut
            com.android.dex.TableOfContents$Section r1 = r0.header
            r2 = 0
            r1.off = r2
            r2 = 1
            r1.size = r2
            com.android.dex.Dex r1 = r3.dexOut
            int r1 = r1.getLength()
            r0.fileSize = r1
            com.android.dex.TableOfContents r0 = r3.contentsOut
            r0.computeSizesFromOffsets()
            com.android.dex.TableOfContents r0 = r3.contentsOut
            com.android.dex.Dex$Section r1 = r3.headerOut
            int r2 = r3.mergeApiLevels()
            r0.writeHeader(r1, r2)
            com.android.dex.TableOfContents r0 = r3.contentsOut
            com.android.dex.Dex$Section r1 = r3.mapListOut
            r0.writeMap(r1)
            com.android.dex.Dex r0 = r3.dexOut
            r0.writeHashes()
            com.android.dex.Dex r0 = r3.dexOut
            return r0
    }

    private void mergeFieldIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$7 r0 = new com.android.dx.merge.DexMerger$7
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeMethodHandles() {
            r2 = this;
            com.android.dx.merge.DexMerger$6 r0 = new com.android.dx.merge.DexMerger$6
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeUnsorted()
            return
    }

    private void mergeMethodIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$8 r0 = new com.android.dx.merge.DexMerger$8
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeProtoIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$4 r0 = new com.android.dx.merge.DexMerger$4
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeStringIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$1 r0 = new com.android.dx.merge.DexMerger$1
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeTypeIds() {
            r2 = this;
            com.android.dx.merge.DexMerger$2 r0 = new com.android.dx.merge.DexMerger$2
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r0.<init>(r2, r1)
            r0.mergeSorted()
            return
    }

    private void mergeTypeLists() {
            r2 = this;
            com.android.dx.merge.DexMerger$3 r0 = new com.android.dx.merge.DexMerger$3
            com.android.dex.Dex$Section r1 = r2.typeListOut
            r0.<init>(r2, r1)
            r0.mergeUnsorted()
            return
    }

    private static void printUsage() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Usage: DexMerger <out.dex> <a.dex> <b.dex> ..."
            r0.println(r1)
            r0.println()
            java.lang.String r1 = "If a class is defined in several dex, the class found in the first dex will be used."
            r0.println(r1)
            return
    }

    private void readSortableTypes(com.android.dx.merge.SortableType[] r6, com.android.dex.Dex r7, com.android.dx.merge.IndexMap r8) {
            r5 = this;
            java.lang.Iterable r0 = r7.classDefs()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            com.android.dex.ClassDef r1 = (com.android.dex.ClassDef) r1
            com.android.dx.merge.SortableType r2 = new com.android.dx.merge.SortableType
            r2.<init>(r7, r8, r1)
            com.android.dx.merge.SortableType r2 = r8.adjust(r2)
            int r3 = r2.getTypeIndex()
            r4 = r6[r3]
            if (r4 != 0) goto L28
            r6[r3] = r2
            goto L8
        L28:
            com.android.dx.merge.CollisionPolicy r2 = r5.collisionPolicy
            com.android.dx.merge.CollisionPolicy r3 = com.android.dx.merge.CollisionPolicy.KEEP_FIRST
            if (r2 != r3) goto L2f
            goto L8
        L2f:
            com.android.dex.DexException r6 = new com.android.dex.DexException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Multiple dex files define "
            r8.append(r0)
            java.util.List r7 = r7.typeNames()
            int r0 = r1.getTypeIndex()
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L54:
            return
    }

    private void transformAnnotationDirectories(com.android.dex.Dex r4, com.android.dx.merge.IndexMap r5) {
            r3 = this;
            com.android.dex.TableOfContents r0 = r4.getTableOfContents()
            com.android.dex.TableOfContents$Section r0 = r0.annotationsDirectories
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            int r1 = r0.off
            com.android.dex.Dex$Section r4 = r4.open(r1)
            r1 = 0
        L13:
            int r2 = r0.size
            if (r1 >= r2) goto L1d
            r3.transformAnnotationDirectory(r4, r5)
            int r1 = r1 + 1
            goto L13
        L1d:
            return
    }

    private void transformAnnotationDirectory(com.android.dex.Dex.Section r8, com.android.dx.merge.IndexMap r9) {
            r7 = this;
            com.android.dex.TableOfContents r0 = r7.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.annotationsDirectories
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            com.android.dex.Dex$Section r0 = r7.annotationsDirectoryOut
            r0.assertFourByteAligned()
            int r0 = r8.getPosition()
            com.android.dex.Dex$Section r1 = r7.annotationsDirectoryOut
            int r1 = r1.getPosition()
            r9.putAnnotationDirectoryOffset(r0, r1)
            int r0 = r8.readInt()
            int r0 = r9.adjustAnnotationSet(r0)
            com.android.dex.Dex$Section r1 = r7.annotationsDirectoryOut
            r1.writeInt(r0)
            int r0 = r8.readInt()
            com.android.dex.Dex$Section r1 = r7.annotationsDirectoryOut
            r1.writeInt(r0)
            int r1 = r8.readInt()
            com.android.dex.Dex$Section r2 = r7.annotationsDirectoryOut
            r2.writeInt(r1)
            int r2 = r8.readInt()
            com.android.dex.Dex$Section r3 = r7.annotationsDirectoryOut
            r3.writeInt(r2)
            r3 = 0
            r4 = r3
        L46:
            if (r4 >= r0) goto L65
            com.android.dex.Dex$Section r5 = r7.annotationsDirectoryOut
            int r6 = r8.readInt()
            int r6 = r9.adjustField(r6)
            r5.writeInt(r6)
            com.android.dex.Dex$Section r5 = r7.annotationsDirectoryOut
            int r6 = r8.readInt()
            int r6 = r9.adjustAnnotationSet(r6)
            r5.writeInt(r6)
            int r4 = r4 + 1
            goto L46
        L65:
            r0 = r3
        L66:
            if (r0 >= r1) goto L85
            com.android.dex.Dex$Section r4 = r7.annotationsDirectoryOut
            int r5 = r8.readInt()
            int r5 = r9.adjustMethod(r5)
            r4.writeInt(r5)
            com.android.dex.Dex$Section r4 = r7.annotationsDirectoryOut
            int r5 = r8.readInt()
            int r5 = r9.adjustAnnotationSet(r5)
            r4.writeInt(r5)
            int r0 = r0 + 1
            goto L66
        L85:
            if (r3 >= r2) goto La4
            com.android.dex.Dex$Section r0 = r7.annotationsDirectoryOut
            int r1 = r8.readInt()
            int r1 = r9.adjustMethod(r1)
            r0.writeInt(r1)
            com.android.dex.Dex$Section r0 = r7.annotationsDirectoryOut
            int r1 = r8.readInt()
            int r1 = r9.adjustAnnotationSetRefList(r1)
            r0.writeInt(r1)
            int r3 = r3 + 1
            goto L85
        La4:
            return
    }

    private void transformAnnotationSet(com.android.dx.merge.IndexMap r5, com.android.dex.Dex.Section r6) {
            r4 = this;
            com.android.dex.TableOfContents r0 = r4.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.annotationSets
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            com.android.dex.Dex$Section r0 = r4.annotationSetOut
            r0.assertFourByteAligned()
            int r0 = r6.getPosition()
            com.android.dex.Dex$Section r1 = r4.annotationSetOut
            int r1 = r1.getPosition()
            r5.putAnnotationSetOffset(r0, r1)
            int r0 = r6.readInt()
            com.android.dex.Dex$Section r1 = r4.annotationSetOut
            r1.writeInt(r0)
            r1 = 0
        L26:
            if (r1 >= r0) goto L38
            com.android.dex.Dex$Section r2 = r4.annotationSetOut
            int r3 = r6.readInt()
            int r3 = r5.adjustAnnotation(r3)
            r2.writeInt(r3)
            int r1 = r1 + 1
            goto L26
        L38:
            return
    }

    private void transformAnnotationSetRefList(com.android.dx.merge.IndexMap r5, com.android.dex.Dex.Section r6) {
            r4 = this;
            com.android.dex.TableOfContents r0 = r4.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.annotationSetRefLists
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            com.android.dex.Dex$Section r0 = r4.annotationSetRefListOut
            r0.assertFourByteAligned()
            int r0 = r6.getPosition()
            com.android.dex.Dex$Section r1 = r4.annotationSetRefListOut
            int r1 = r1.getPosition()
            r5.putAnnotationSetRefListOffset(r0, r1)
            int r0 = r6.readInt()
            com.android.dex.Dex$Section r1 = r4.annotationSetRefListOut
            r1.writeInt(r0)
            r1 = 0
        L26:
            if (r1 >= r0) goto L38
            com.android.dex.Dex$Section r2 = r4.annotationSetRefListOut
            int r3 = r6.readInt()
            int r3 = r5.adjustAnnotationSet(r3)
            r2.writeInt(r3)
            int r1 = r1 + 1
            goto L26
        L38:
            return
    }

    private void transformAnnotationSetRefLists(com.android.dex.Dex r4, com.android.dx.merge.IndexMap r5) {
            r3 = this;
            com.android.dex.TableOfContents r0 = r4.getTableOfContents()
            com.android.dex.TableOfContents$Section r0 = r0.annotationSetRefLists
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            int r1 = r0.off
            com.android.dex.Dex$Section r4 = r4.open(r1)
            r1 = 0
        L13:
            int r2 = r0.size
            if (r1 >= r2) goto L1d
            r3.transformAnnotationSetRefList(r5, r4)
            int r1 = r1 + 1
            goto L13
        L1d:
            return
    }

    private void transformAnnotationSets(com.android.dex.Dex r4, com.android.dx.merge.IndexMap r5) {
            r3 = this;
            com.android.dex.TableOfContents r0 = r4.getTableOfContents()
            com.android.dex.TableOfContents$Section r0 = r0.annotationSets
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            int r1 = r0.off
            com.android.dex.Dex$Section r4 = r4.open(r1)
            r1 = 0
        L13:
            int r2 = r0.size
            if (r1 >= r2) goto L1d
            r3.transformAnnotationSet(r5, r4)
            int r1 = r1 + 1
            goto L13
        L1d:
            return
    }

    private int[] transformCatchHandlers(com.android.dx.merge.IndexMap r5, com.android.dex.Code.CatchHandler[] r6) {
            r4 = this;
            com.android.dex.Dex$Section r0 = r4.codeOut
            int r0 = r0.getPosition()
            com.android.dex.Dex$Section r1 = r4.codeOut
            int r2 = r6.length
            r1.writeUleb128(r2)
            int r1 = r6.length
            int[] r1 = new int[r1]
            r2 = 0
        L10:
            int r3 = r6.length
            if (r2 >= r3) goto L24
            com.android.dex.Dex$Section r3 = r4.codeOut
            int r3 = r3.getPosition()
            int r3 = r3 - r0
            r1[r2] = r3
            r3 = r6[r2]
            r4.transformEncodedCatchHandler(r3, r5)
            int r2 = r2 + 1
            goto L10
        L24:
            return r1
    }

    private void transformClassData(com.android.dex.Dex r6, com.android.dex.ClassData r7, com.android.dx.merge.IndexMap r8) {
            r5 = this;
            com.android.dex.TableOfContents r0 = r5.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.classDatas
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            com.android.dex.ClassData$Field[] r0 = r7.getStaticFields()
            com.android.dex.ClassData$Field[] r1 = r7.getInstanceFields()
            com.android.dex.ClassData$Method[] r2 = r7.getDirectMethods()
            com.android.dex.ClassData$Method[] r7 = r7.getVirtualMethods()
            com.android.dex.Dex$Section r3 = r5.classDataOut
            int r4 = r0.length
            r3.writeUleb128(r4)
            com.android.dex.Dex$Section r3 = r5.classDataOut
            int r4 = r1.length
            r3.writeUleb128(r4)
            com.android.dex.Dex$Section r3 = r5.classDataOut
            int r4 = r2.length
            r3.writeUleb128(r4)
            com.android.dex.Dex$Section r3 = r5.classDataOut
            int r4 = r7.length
            r3.writeUleb128(r4)
            r5.transformFields(r8, r0)
            r5.transformFields(r8, r1)
            r5.transformMethods(r6, r8, r2)
            r5.transformMethods(r6, r8, r7)
            return
    }

    private void transformClassDef(com.android.dex.Dex r3, com.android.dex.ClassDef r4, com.android.dx.merge.IndexMap r5) {
            r2 = this;
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            r0.assertFourByteAligned()
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            int r1 = r4.getTypeIndex()
            r0.writeInt(r1)
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            int r1 = r4.getAccessFlags()
            r0.writeInt(r1)
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            int r1 = r4.getSupertypeIndex()
            r0.writeInt(r1)
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            int r1 = r4.getInterfacesOffset()
            r0.writeInt(r1)
            int r0 = r4.getSourceFileIndex()
            int r0 = r5.adjustString(r0)
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            r1.writeInt(r0)
            int r0 = r4.getAnnotationsOffset()
            com.android.dex.Dex$Section r1 = r2.idsDefsOut
            int r0 = r5.adjustAnnotationDirectory(r0)
            r1.writeInt(r0)
            int r0 = r4.getClassDataOffset()
            if (r0 != 0) goto L50
            com.android.dex.Dex$Section r3 = r2.idsDefsOut
            r0 = 0
            r3.writeInt(r0)
            goto L62
        L50:
            com.android.dex.Dex$Section r0 = r2.idsDefsOut
            com.android.dex.Dex$Section r1 = r2.classDataOut
            int r1 = r1.getPosition()
            r0.writeInt(r1)
            com.android.dex.ClassData r0 = r3.readClassData(r4)
            r2.transformClassData(r3, r0, r5)
        L62:
            int r3 = r4.getStaticValuesOffset()
            com.android.dex.Dex$Section r4 = r2.idsDefsOut
            int r3 = r5.adjustEncodedArray(r3)
            r4.writeInt(r3)
            return
    }

    private void transformCode(com.android.dex.Dex r8, com.android.dex.Code r9, com.android.dx.merge.IndexMap r10) {
            r7 = this;
            com.android.dex.TableOfContents r0 = r7.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.codes
            int r1 = r0.size
            r2 = 1
            int r1 = r1 + r2
            r0.size = r1
            com.android.dex.Dex$Section r0 = r7.codeOut
            r0.assertFourByteAligned()
            com.android.dex.Dex$Section r0 = r7.codeOut
            int r1 = r9.getRegistersSize()
            r0.writeUnsignedShort(r1)
            com.android.dex.Dex$Section r0 = r7.codeOut
            int r1 = r9.getInsSize()
            r0.writeUnsignedShort(r1)
            com.android.dex.Dex$Section r0 = r7.codeOut
            int r1 = r9.getOutsSize()
            r0.writeUnsignedShort(r1)
            com.android.dex.Code$Try[] r0 = r9.getTries()
            com.android.dex.Code$CatchHandler[] r1 = r9.getCatchHandlers()
            com.android.dex.Dex$Section r3 = r7.codeOut
            int r4 = r0.length
            r3.writeUnsignedShort(r4)
            int r3 = r9.getDebugInfoOffset()
            r4 = 0
            if (r3 == 0) goto L52
            com.android.dex.Dex$Section r5 = r7.codeOut
            com.android.dex.Dex$Section r6 = r7.debugInfoOut
            int r6 = r6.getPosition()
            r5.writeInt(r6)
            com.android.dex.Dex$Section r8 = r8.open(r3)
            r7.transformDebugInfoItem(r8, r10)
            goto L57
        L52:
            com.android.dex.Dex$Section r8 = r7.codeOut
            r8.writeInt(r4)
        L57:
            short[] r8 = r9.getInstructions()
            com.android.dx.merge.InstructionTransformer r9 = r7.instructionTransformer
            short[] r8 = r9.transform(r10, r8)
            com.android.dex.Dex$Section r9 = r7.codeOut
            int r3 = r8.length
            r9.writeInt(r3)
            com.android.dex.Dex$Section r9 = r7.codeOut
            r9.write(r8)
            int r9 = r0.length
            if (r9 <= 0) goto L94
            int r8 = r8.length
            int r8 = r8 % 2
            if (r8 != r2) goto L79
            com.android.dex.Dex$Section r8 = r7.codeOut
            r8.writeShort(r4)
        L79:
            com.android.dex.Dex r8 = r7.dexOut
            com.android.dex.Dex$Section r9 = r7.codeOut
            int r9 = r9.getPosition()
            com.android.dex.Dex$Section r8 = r8.open(r9)
            com.android.dex.Dex$Section r9 = r7.codeOut
            int r2 = r0.length
            int r2 = r2 * 8
            r9.skip(r2)
            int[] r9 = r7.transformCatchHandlers(r10, r1)
            r7.transformTries(r8, r0, r9)
        L94:
            return
    }

    private void transformDebugInfoItem(com.android.dex.Dex.Section r5, com.android.dx.merge.IndexMap r6) {
            r4 = this;
            com.android.dex.TableOfContents r0 = r4.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.debugInfos
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2f
            int r2 = r5.readUleb128p1()
            com.android.dex.Dex$Section r3 = r4.debugInfoOut
            int r2 = r6.adjustString(r2)
            r3.writeUleb128p1(r2)
            int r1 = r1 + 1
            goto L1d
        L2f:
            byte r0 = r5.readByte()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeByte(r0)
            r1 = 9
            if (r0 == r1) goto L93
            switch(r0) {
                case 0: goto L92;
                case 1: goto L88;
                case 2: goto L7e;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L40;
                case 6: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L2f
        L40:
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            goto L2f
        L4a:
            int r1 = r5.readUleb128()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            r2.writeUleb128(r1)
            int r1 = r5.readUleb128p1()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            int r1 = r6.adjustString(r1)
            r2.writeUleb128p1(r1)
            int r1 = r5.readUleb128p1()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            int r1 = r6.adjustType(r1)
            r2.writeUleb128p1(r1)
            r1 = 4
            if (r0 != r1) goto L2f
            int r0 = r5.readUleb128p1()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            int r0 = r6.adjustString(r0)
            r1.writeUleb128p1(r0)
            goto L2f
        L7e:
            int r0 = r5.readSleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeSleb128(r0)
            goto L2f
        L88:
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            goto L2f
        L92:
            return
        L93:
            int r0 = r5.readUleb128p1()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            int r0 = r6.adjustString(r0)
            r1.writeUleb128p1(r0)
            goto L2f
    }

    private void transformEncodedCatchHandler(com.android.dex.Code.CatchHandler r7, com.android.dx.merge.IndexMap r8) {
            r6 = this;
            int r0 = r7.getCatchAllAddress()
            int[] r1 = r7.getTypeIndexes()
            int[] r7 = r7.getAddresses()
            r2 = -1
            if (r0 == r2) goto L17
            com.android.dex.Dex$Section r3 = r6.codeOut
            int r4 = r1.length
            int r4 = -r4
            r3.writeSleb128(r4)
            goto L1d
        L17:
            com.android.dex.Dex$Section r3 = r6.codeOut
            int r4 = r1.length
            r3.writeSleb128(r4)
        L1d:
            r3 = 0
        L1e:
            int r4 = r1.length
            if (r3 >= r4) goto L36
            com.android.dex.Dex$Section r4 = r6.codeOut
            r5 = r1[r3]
            int r5 = r8.adjustType(r5)
            r4.writeUleb128(r5)
            com.android.dex.Dex$Section r4 = r6.codeOut
            r5 = r7[r3]
            r4.writeUleb128(r5)
            int r3 = r3 + 1
            goto L1e
        L36:
            if (r0 == r2) goto L3d
            com.android.dex.Dex$Section r7 = r6.codeOut
            r7.writeUleb128(r0)
        L3d:
            return
    }

    private void transformFields(com.android.dx.merge.IndexMap r7, com.android.dex.ClassData.Field[] r8) {
            r6 = this;
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L23
            r3 = r8[r1]
            int r4 = r3.getFieldIndex()
            int r4 = r7.adjustField(r4)
            com.android.dex.Dex$Section r5 = r6.classDataOut
            int r2 = r4 - r2
            r5.writeUleb128(r2)
            com.android.dex.Dex$Section r2 = r6.classDataOut
            int r3 = r3.getAccessFlags()
            r2.writeUleb128(r3)
            int r1 = r1 + 1
            r2 = r4
            goto L3
        L23:
            return
    }

    private void transformMethods(com.android.dex.Dex r8, com.android.dx.merge.IndexMap r9, com.android.dex.ClassData.Method[] r10) {
            r7 = this;
            int r0 = r10.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L47
            r4 = r10[r2]
            int r5 = r4.getMethodIndex()
            int r5 = r9.adjustMethod(r5)
            com.android.dex.Dex$Section r6 = r7.classDataOut
            int r3 = r5 - r3
            r6.writeUleb128(r3)
            com.android.dex.Dex$Section r3 = r7.classDataOut
            int r6 = r4.getAccessFlags()
            r3.writeUleb128(r6)
            int r3 = r4.getCodeOffset()
            if (r3 != 0) goto L2c
            com.android.dex.Dex$Section r3 = r7.classDataOut
            r3.writeUleb128(r1)
            goto L43
        L2c:
            com.android.dex.Dex$Section r3 = r7.codeOut
            r3.alignToFourBytesWithZeroFill()
            com.android.dex.Dex$Section r3 = r7.classDataOut
            com.android.dex.Dex$Section r6 = r7.codeOut
            int r6 = r6.getPosition()
            r3.writeUleb128(r6)
            com.android.dex.Code r3 = r8.readCode(r4)
            r7.transformCode(r8, r3, r9)
        L43:
            int r2 = r2 + 1
            r3 = r5
            goto L4
        L47:
            return
    }

    private void transformStaticValues(com.android.dex.Dex.Section r3, com.android.dx.merge.IndexMap r4) {
            r2 = this;
            com.android.dex.TableOfContents r0 = r2.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.encodedArrays
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            int r0 = r3.getPosition()
            com.android.dex.Dex$Section r1 = r2.encodedArrayOut
            int r1 = r1.getPosition()
            r4.putEncodedArrayValueOffset(r0, r1)
            com.android.dex.EncodedValue r3 = r3.readEncodedArray()
            com.android.dex.EncodedValue r3 = r4.adjustEncodedArray(r3)
            com.android.dex.Dex$Section r4 = r2.encodedArrayOut
            r3.writeTo(r4)
            return
    }

    private void transformStaticValues(com.android.dex.Dex r4, com.android.dx.merge.IndexMap r5) {
            r3 = this;
            com.android.dex.TableOfContents r0 = r4.getTableOfContents()
            com.android.dex.TableOfContents$Section r0 = r0.encodedArrays
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            int r1 = r0.off
            com.android.dex.Dex$Section r4 = r4.open(r1)
            r1 = 0
        L13:
            int r2 = r0.size
            if (r1 >= r2) goto L1d
            r3.transformStaticValues(r4, r5)
            int r1 = r1 + 1
            goto L13
        L1d:
            return
    }

    private void transformTries(com.android.dex.Dex.Section r5, com.android.dex.Code.Try[] r6, int[] r7) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L20
            r2 = r6[r1]
            int r3 = r2.getStartAddress()
            r5.writeInt(r3)
            int r3 = r2.getInstructionCount()
            r5.writeUnsignedShort(r3)
            int r2 = r2.getCatchHandlerIndex()
            r2 = r7[r2]
            r5.writeUnsignedShort(r2)
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    private void unionAnnotationSetsAndDirectories() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            com.android.dex.Dex[] r2 = r4.dexes
            int r3 = r2.length
            if (r1 >= r3) goto L13
            r2 = r2[r1]
            com.android.dx.merge.IndexMap[] r3 = r4.indexMaps
            r3 = r3[r1]
            r4.transformAnnotationSets(r2, r3)
            int r1 = r1 + 1
            goto L2
        L13:
            r1 = r0
        L14:
            com.android.dex.Dex[] r2 = r4.dexes
            int r3 = r2.length
            if (r1 >= r3) goto L25
            r2 = r2[r1]
            com.android.dx.merge.IndexMap[] r3 = r4.indexMaps
            r3 = r3[r1]
            r4.transformAnnotationSetRefLists(r2, r3)
            int r1 = r1 + 1
            goto L14
        L25:
            r1 = r0
        L26:
            com.android.dex.Dex[] r2 = r4.dexes
            int r3 = r2.length
            if (r1 >= r3) goto L37
            r2 = r2[r1]
            com.android.dx.merge.IndexMap[] r3 = r4.indexMaps
            r3 = r3[r1]
            r4.transformAnnotationDirectories(r2, r3)
            int r1 = r1 + 1
            goto L26
        L37:
            com.android.dex.Dex[] r1 = r4.dexes
            int r2 = r1.length
            if (r0 >= r2) goto L48
            r1 = r1[r0]
            com.android.dx.merge.IndexMap[] r2 = r4.indexMaps
            r2 = r2[r0]
            r4.transformStaticValues(r1, r2)
            int r0 = r0 + 1
            goto L37
        L48:
            return
    }

    public com.android.dex.Dex merge() throws java.io.IOException {
            r10 = this;
            com.android.dex.Dex[] r0 = r10.dexes
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto La
            r0 = r0[r3]
            return r0
        La:
            int r0 = r0.length
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            long r0 = java.lang.System.nanoTime()
            com.android.dex.Dex r2 = r10.mergeDexes()
            com.android.dx.merge.DexMerger$WriterSizes r4 = new com.android.dx.merge.DexMerger$WriterSizes
            r4.<init>(r10)
            com.android.dx.merge.DexMerger$WriterSizes r5 = r10.writerSizes
            int r5 = r5.size()
            int r6 = r4.size()
            int r5 = r5 - r6
            int r6 = r10.compactWasteThreshold
            r7 = 1149239296(0x44800000, float:1024.0)
            if (r5 <= r6) goto L6e
            com.android.dx.merge.DexMerger r2 = new com.android.dx.merge.DexMerger
            com.android.dex.Dex r6 = r10.dexOut
            com.android.dex.Dex r8 = new com.android.dex.Dex
            r8.<init>(r3)
            com.android.dex.Dex[] r6 = new com.android.dex.Dex[]{r6, r8}
            com.android.dx.merge.CollisionPolicy r8 = com.android.dx.merge.CollisionPolicy.FAIL
            com.android.dx.command.dexer.DxContext r9 = r10.context
            r2.<init>(r6, r8, r9, r4)
            com.android.dex.Dex r2 = r2.mergeDexes()
            com.android.dx.command.dexer.DxContext r4 = r10.context
            java.io.PrintStream r4 = r4.out
            com.android.dex.Dex r6 = r10.dexOut
            int r6 = r6.getLength()
            float r6 = (float) r6
            float r6 = r6 / r7
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            int r8 = r2.getLength()
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r5 = (float) r5
            float r5 = r5 / r7
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r8, r5}
            java.lang.String r6 = "Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n"
            r4.printf(r6, r5)
        L6e:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r0
        L73:
            com.android.dex.Dex[] r0 = r10.dexes
            int r0 = r0.length
            if (r3 >= r0) goto Lab
            com.android.dx.command.dexer.DxContext r0 = r10.context
            java.io.PrintStream r0 = r0.out
            int r1 = r3 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            com.android.dex.Dex[] r8 = r10.dexes
            r8 = r8[r3]
            com.android.dex.TableOfContents r8 = r8.getTableOfContents()
            com.android.dex.TableOfContents$Section r8 = r8.classDefs
            int r8 = r8.size
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.android.dex.Dex[] r9 = r10.dexes
            r3 = r9[r3]
            int r3 = r3.getLength()
            float r3 = (float) r3
            float r3 = r3 / r7
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r8, r3}
            java.lang.String r6 = "Merged dex #%d (%d defs/%.1fKiB)%n"
            r0.printf(r6, r3)
            r3 = r1
            goto L73
        Lab:
            com.android.dx.command.dexer.DxContext r0 = r10.context
            java.io.PrintStream r0 = r0.out
            com.android.dex.TableOfContents r1 = r2.getTableOfContents()
            com.android.dex.TableOfContents$Section r1 = r1.classDefs
            int r1 = r1.size
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r2.getLength()
            float r3 = (float) r3
            float r3 = r3 / r7
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r4 = (float) r4
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r4 = r4 / r5
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r3 = "Result is %d defs/%.1fKiB. Took %.1fs%n"
            r0.printf(r3, r1)
            return r2
    }

    public void setCompactWasteThreshold(int r1) {
            r0 = this;
            r0.compactWasteThreshold = r1
            return
    }
}

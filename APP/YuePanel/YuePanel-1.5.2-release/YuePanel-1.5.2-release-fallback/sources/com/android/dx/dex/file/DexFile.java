package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class DexFile {
    private final com.android.dx.dex.file.MixedItemSection byteData;
    private final com.android.dx.dex.file.CallSiteIdsSection callSiteIds;
    private final com.android.dx.dex.file.MixedItemSection classData;
    private final com.android.dx.dex.file.ClassDefsSection classDefs;
    private final com.android.dx.dex.DexOptions dexOptions;
    private int dumpWidth;
    private final com.android.dx.dex.file.FieldIdsSection fieldIds;
    private int fileSize;
    private final com.android.dx.dex.file.HeaderSection header;
    private final com.android.dx.dex.file.MixedItemSection map;
    private final com.android.dx.dex.file.MethodHandlesSection methodHandles;
    private final com.android.dx.dex.file.MethodIdsSection methodIds;
    private final com.android.dx.dex.file.ProtoIdsSection protoIds;
    private final com.android.dx.dex.file.Section[] sections;
    private final com.android.dx.dex.file.MixedItemSection stringData;
    private final com.android.dx.dex.file.StringIdsSection stringIds;
    private final com.android.dx.dex.file.TypeIdsSection typeIds;
    private final com.android.dx.dex.file.MixedItemSection typeLists;
    private final com.android.dx.dex.file.MixedItemSection wordData;

    public static final class Storage {
        byte[] storage;

        public Storage(byte[] r1) {
                r0 = this;
                r0.<init>()
                r0.storage = r1
                return
        }

        public byte[] getStorage(int r5) {
                r4 = this;
                byte[] r0 = r4.storage
                int r0 = r0.length
                if (r0 >= r5) goto L2e
                java.util.logging.Logger r0 = java.util.logging.Logger.getAnonymousLogger()
                java.util.logging.Level r1 = java.util.logging.Level.FINER
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "DexFile storage too small  "
                r2.append(r3)
                byte[] r3 = r4.storage
                int r3 = r3.length
                r2.append(r3)
                java.lang.String r3 = " vs "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r0.log(r1, r2)
                byte[] r5 = new byte[r5]
                r4.storage = r5
            L2e:
                byte[] r5 = r4.storage
                return r5
        }
    }

    public DexFile(com.android.dx.dex.DexOptions r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r19.<init>()
            r0.dexOptions = r1
            com.android.dx.dex.file.HeaderSection r14 = new com.android.dx.dex.file.HeaderSection
            r14.<init>(r0)
            r0.header = r14
            com.android.dx.dex.file.MixedItemSection r15 = new com.android.dx.dex.file.MixedItemSection
            com.android.dx.dex.file.MixedItemSection$SortType r2 = com.android.dx.dex.file.MixedItemSection.SortType.NONE
            r3 = 0
            r4 = 4
            r15.<init>(r3, r0, r4, r2)
            r0.typeLists = r15
            com.android.dx.dex.file.MixedItemSection r5 = new com.android.dx.dex.file.MixedItemSection
            com.android.dx.dex.file.MixedItemSection$SortType r6 = com.android.dx.dex.file.MixedItemSection.SortType.TYPE
            java.lang.String r7 = "word_data"
            r5.<init>(r7, r0, r4, r6)
            r0.wordData = r5
            com.android.dx.dex.file.MixedItemSection r7 = new com.android.dx.dex.file.MixedItemSection
            com.android.dx.dex.file.MixedItemSection$SortType r8 = com.android.dx.dex.file.MixedItemSection.SortType.INSTANCE
            java.lang.String r9 = "string_data"
            r10 = 1
            r7.<init>(r9, r0, r10, r8)
            r0.stringData = r7
            com.android.dx.dex.file.MixedItemSection r8 = new com.android.dx.dex.file.MixedItemSection
            r8.<init>(r3, r0, r10, r2)
            r0.classData = r8
            com.android.dx.dex.file.MixedItemSection r9 = new com.android.dx.dex.file.MixedItemSection
            java.lang.String r3 = "byte_data"
            r9.<init>(r3, r0, r10, r6)
            r0.byteData = r9
            com.android.dx.dex.file.StringIdsSection r3 = new com.android.dx.dex.file.StringIdsSection
            r3.<init>(r0)
            r0.stringIds = r3
            com.android.dx.dex.file.TypeIdsSection r6 = new com.android.dx.dex.file.TypeIdsSection
            r6.<init>(r0)
            r0.typeIds = r6
            com.android.dx.dex.file.ProtoIdsSection r11 = new com.android.dx.dex.file.ProtoIdsSection
            r11.<init>(r0)
            r0.protoIds = r11
            com.android.dx.dex.file.FieldIdsSection r12 = new com.android.dx.dex.file.FieldIdsSection
            r12.<init>(r0)
            r0.fieldIds = r12
            com.android.dx.dex.file.MethodIdsSection r10 = new com.android.dx.dex.file.MethodIdsSection
            r10.<init>(r0)
            r0.methodIds = r10
            com.android.dx.dex.file.ClassDefsSection r13 = new com.android.dx.dex.file.ClassDefsSection
            r13.<init>(r0)
            r0.classDefs = r13
            r17 = r8
            com.android.dx.dex.file.MixedItemSection r8 = new com.android.dx.dex.file.MixedItemSection
            r18 = r9
            java.lang.String r9 = "map"
            r8.<init>(r9, r0, r4, r2)
            r0.map = r8
            r2 = 26
            boolean r1 = r1.apiIsSupported(r2)
            if (r1 == 0) goto Lca
            com.android.dx.dex.file.CallSiteIdsSection r1 = new com.android.dx.dex.file.CallSiteIdsSection
            r1.<init>(r0)
            r0.callSiteIds = r1
            com.android.dx.dex.file.MethodHandlesSection r2 = new com.android.dx.dex.file.MethodHandlesSection
            r2.<init>(r0)
            r0.methodHandles = r2
            r9 = 15
            com.android.dx.dex.file.Section[] r9 = new com.android.dx.dex.file.Section[r9]
            r16 = 0
            r9[r16] = r14
            r14 = 1
            r9[r14] = r3
            r3 = 2
            r9[r3] = r6
            r3 = 3
            r9[r3] = r11
            r9[r4] = r12
            r3 = 5
            r9[r3] = r10
            r3 = 6
            r9[r3] = r13
            r3 = 7
            r9[r3] = r1
            r1 = 8
            r9[r1] = r2
            r1 = 9
            r9[r1] = r5
            r1 = 10
            r9[r1] = r15
            r1 = 11
            r9[r1] = r7
            r1 = 12
            r9[r1] = r18
            r1 = 13
            r9[r1] = r17
            r1 = 14
            r9[r1] = r8
            r0.sections = r9
            goto L100
        Lca:
            r1 = 13
            r2 = 0
            r0.callSiteIds = r2
            r0.methodHandles = r2
            com.android.dx.dex.file.Section[] r1 = new com.android.dx.dex.file.Section[r1]
            r2 = 0
            r1[r2] = r14
            r2 = 1
            r1[r2] = r3
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r11
            r1[r4] = r12
            r2 = 5
            r1[r2] = r10
            r2 = 6
            r1[r2] = r13
            r2 = 7
            r1[r2] = r5
            r2 = 8
            r1[r2] = r15
            r2 = 9
            r1[r2] = r7
            r2 = 10
            r1[r2] = r18
            r2 = 11
            r1[r2] = r17
            r2 = 12
            r1[r2] = r8
            r0.sections = r1
        L100:
            r1 = -1
            r0.fileSize = r1
            r1 = 79
            r0.dumpWidth = r1
            return
    }

    private static void calcChecksum(byte[] r2, int r3) {
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            r1 = 12
            int r3 = r3 - r1
            r0.update(r2, r1, r3)
            long r0 = r0.getValue()
            int r3 = (int) r0
            r0 = 8
            byte r1 = (byte) r3
            r2[r0] = r1
            int r0 = r3 >> 8
            byte r0 = (byte) r0
            r1 = 9
            r2[r1] = r0
            int r0 = r3 >> 16
            byte r0 = (byte) r0
            r1 = 10
            r2[r1] = r0
            int r3 = r3 >> 24
            byte r3 = (byte) r3
            r0 = 11
            r2[r0] = r3
            return
    }

    private static void calcSignature(byte[] r2, int r3) {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L3a
            r1 = 32
            int r3 = r3 - r1
            r0.update(r2, r1, r3)
            r3 = 12
            r1 = 20
            int r2 = r0.digest(r2, r3, r1)     // Catch: java.security.DigestException -> L33
            if (r2 != r1) goto L17
            return
        L17:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.security.DigestException -> L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.security.DigestException -> L33
            r0.<init>()     // Catch: java.security.DigestException -> L33
            java.lang.String r1 = "unexpected digest write: "
            r0.append(r1)     // Catch: java.security.DigestException -> L33
            r0.append(r2)     // Catch: java.security.DigestException -> L33
            java.lang.String r2 = " bytes"
            r0.append(r2)     // Catch: java.security.DigestException -> L33
            java.lang.String r2 = r0.toString()     // Catch: java.security.DigestException -> L33
            r3.<init>(r2)     // Catch: java.security.DigestException -> L33
            throw r3     // Catch: java.security.DigestException -> L33
        L33:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L3a:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private com.android.dx.util.ByteArrayAnnotatedOutput toDex0(boolean r9, boolean r10, com.android.dx.dex.file.DexFile.Storage r11) {
            r8 = this;
            com.android.dx.dex.file.ClassDefsSection r0 = r8.classDefs
            r0.prepare()
            com.android.dx.dex.file.MixedItemSection r0 = r8.classData
            r0.prepare()
            com.android.dx.dex.file.MixedItemSection r0 = r8.wordData
            r0.prepare()
            com.android.dx.dex.DexOptions r0 = r8.dexOptions
            r1 = 26
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 == 0) goto L1e
            com.android.dx.dex.file.CallSiteIdsSection r0 = r8.callSiteIds
            r0.prepare()
        L1e:
            com.android.dx.dex.file.MixedItemSection r0 = r8.byteData
            r0.prepare()
            com.android.dx.dex.DexOptions r0 = r8.dexOptions
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 == 0) goto L30
            com.android.dx.dex.file.MethodHandlesSection r0 = r8.methodHandles
            r0.prepare()
        L30:
            com.android.dx.dex.file.MethodIdsSection r0 = r8.methodIds
            r0.prepare()
            com.android.dx.dex.file.FieldIdsSection r0 = r8.fieldIds
            r0.prepare()
            com.android.dx.dex.file.ProtoIdsSection r0 = r8.protoIds
            r0.prepare()
            com.android.dx.dex.file.MixedItemSection r0 = r8.typeLists
            r0.prepare()
            com.android.dx.dex.file.TypeIdsSection r0 = r8.typeIds
            r0.prepare()
            com.android.dx.dex.file.StringIdsSection r0 = r8.stringIds
            r0.prepare()
            com.android.dx.dex.file.MixedItemSection r0 = r8.stringData
            r0.prepare()
            com.android.dx.dex.file.HeaderSection r0 = r8.header
            r0.prepare()
            com.android.dx.dex.file.Section[] r0 = r8.sections
            int r0 = r0.length
            r1 = 0
            r2 = r1
            r3 = r2
        L5e:
            java.lang.String r4 = "...while writing section "
            if (r2 >= r0) goto Lcd
            com.android.dx.dex.file.Section[] r5 = r8.sections
            r5 = r5[r2]
            com.android.dx.dex.file.CallSiteIdsSection r6 = r8.callSiteIds
            if (r5 == r6) goto L6e
            com.android.dx.dex.file.MethodHandlesSection r6 = r8.methodHandles
            if (r5 != r6) goto L79
        L6e:
            java.util.Collection r6 = r5.items()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L79
            goto L9f
        L79:
            int r6 = r5.setFileOffset(r3)
            if (r6 < r3) goto Lb6
            com.android.dx.dex.file.MixedItemSection r3 = r8.map     // Catch: java.lang.RuntimeException -> L8e
            if (r5 != r3) goto L90
            com.android.dx.dex.file.Section[] r7 = r8.sections     // Catch: java.lang.RuntimeException -> L8e
            com.android.dx.dex.file.MapItem.addMap(r7, r3)     // Catch: java.lang.RuntimeException -> L8e
            com.android.dx.dex.file.MixedItemSection r3 = r8.map     // Catch: java.lang.RuntimeException -> L8e
            r3.prepare()     // Catch: java.lang.RuntimeException -> L8e
            goto L90
        L8e:
            r9 = move-exception
            goto La2
        L90:
            boolean r3 = r5 instanceof com.android.dx.dex.file.MixedItemSection     // Catch: java.lang.RuntimeException -> L8e
            if (r3 == 0) goto L9a
            r3 = r5
            com.android.dx.dex.file.MixedItemSection r3 = (com.android.dx.dex.file.MixedItemSection) r3     // Catch: java.lang.RuntimeException -> L8e
            r3.placeItems()     // Catch: java.lang.RuntimeException -> L8e
        L9a:
            int r3 = r5.writeSize()     // Catch: java.lang.RuntimeException -> L8e
            int r3 = r3 + r6
        L9f:
            int r2 = r2 + 1
            goto L5e
        La2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.android.dex.util.ExceptionWithContext r9 = com.android.dex.util.ExceptionWithContext.withContext(r9, r10)
            throw r9
        Lb6:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "bogus placement for section "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lcd:
            r8.fileSize = r3
            if (r11 != 0) goto Ld4
            byte[] r11 = new byte[r3]
            goto Ld8
        Ld4:
            byte[] r11 = r11.getStorage(r3)
        Ld8:
            com.android.dx.util.ByteArrayAnnotatedOutput r2 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r2.<init>(r11)
            if (r9 == 0) goto Le4
            int r3 = r8.dumpWidth
            r2.enableAnnotations(r3, r10)
        Le4:
            if (r1 >= r0) goto L14c
            com.android.dx.dex.file.Section[] r10 = r8.sections     // Catch: java.lang.RuntimeException -> Lf3
            r10 = r10[r1]     // Catch: java.lang.RuntimeException -> Lf3
            com.android.dx.dex.file.CallSiteIdsSection r3 = r8.callSiteIds     // Catch: java.lang.RuntimeException -> Lf3
            if (r10 == r3) goto Lf5
            com.android.dx.dex.file.MethodHandlesSection r3 = r8.methodHandles     // Catch: java.lang.RuntimeException -> Lf3
            if (r10 != r3) goto L100
            goto Lf5
        Lf3:
            r9 = move-exception
            goto L12c
        Lf5:
            java.util.Collection r3 = r10.items()     // Catch: java.lang.RuntimeException -> Lf3
            boolean r3 = r3.isEmpty()     // Catch: java.lang.RuntimeException -> Lf3
            if (r3 == 0) goto L100
            goto L111
        L100:
            int r3 = r10.getFileOffset()     // Catch: java.lang.RuntimeException -> Lf3
            int r5 = r2.getCursor()     // Catch: java.lang.RuntimeException -> Lf3
            int r3 = r3 - r5
            if (r3 < 0) goto L114
            r2.writeZeroes(r3)     // Catch: java.lang.RuntimeException -> Lf3
            r10.writeTo(r2)     // Catch: java.lang.RuntimeException -> Lf3
        L111:
            int r1 = r1 + 1
            goto Le4
        L114:
            com.android.dex.util.ExceptionWithContext r9 = new com.android.dex.util.ExceptionWithContext     // Catch: java.lang.RuntimeException -> Lf3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lf3
            r10.<init>()     // Catch: java.lang.RuntimeException -> Lf3
            java.lang.String r11 = "excess write of "
            r10.append(r11)     // Catch: java.lang.RuntimeException -> Lf3
            int r11 = -r3
            r10.append(r11)     // Catch: java.lang.RuntimeException -> Lf3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.RuntimeException -> Lf3
            r9.<init>(r10)     // Catch: java.lang.RuntimeException -> Lf3
            throw r9     // Catch: java.lang.RuntimeException -> Lf3
        L12c:
            boolean r10 = r9 instanceof com.android.dex.util.ExceptionWithContext
            if (r10 == 0) goto L133
            com.android.dex.util.ExceptionWithContext r9 = (com.android.dex.util.ExceptionWithContext) r9
            goto L139
        L133:
            com.android.dex.util.ExceptionWithContext r10 = new com.android.dex.util.ExceptionWithContext
            r10.<init>(r9)
            r9 = r10
        L139:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.addContext(r10)
            throw r9
        L14c:
            int r10 = r2.getCursor()
            int r0 = r8.fileSize
            if (r10 != r0) goto L178
            int r10 = r2.getCursor()
            calcSignature(r11, r10)
            int r10 = r2.getCursor()
            calcChecksum(r11, r10)
            if (r9 == 0) goto L177
            com.android.dx.dex.file.MixedItemSection r9 = r8.wordData
            com.android.dx.dex.file.ItemType r10 = com.android.dx.dex.file.ItemType.TYPE_CODE_ITEM
            java.lang.String r11 = "\nmethod code index:\n\n"
            r9.writeIndexAnnotation(r2, r10, r11)
            com.android.dx.dex.file.Statistics r9 = r8.getStatistics()
            r9.writeAnnotation(r2)
            r2.finishAnnotating()
        L177:
            return r2
        L178:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "foreshortened write"
            r9.<init>(r10)
            throw r9
    }

    public void add(com.android.dx.dex.file.ClassDefItem r2) {
            r1 = this;
            com.android.dx.dex.file.ClassDefsSection r0 = r1.classDefs
            r0.add(r2)
            return
    }

    public com.android.dx.dex.file.IndexedItem findItemOrNull(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstString
            if (r0 == 0) goto Lb
            com.android.dx.dex.file.StringIdsSection r0 = r1.stringIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstType
            if (r0 == 0) goto L16
            com.android.dx.dex.file.TypeIdsSection r0 = r1.typeIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L16:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstBaseMethodRef
            if (r0 == 0) goto L21
            com.android.dx.dex.file.MethodIdsSection r0 = r1.methodIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L21:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r0 == 0) goto L2c
            com.android.dx.dex.file.FieldIdsSection r0 = r1.fieldIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L2c:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstEnumRef
            if (r0 == 0) goto L3d
            com.android.dx.dex.file.FieldIdsSection r0 = r1.fieldIds
            com.android.dx.rop.cst.CstEnumRef r2 = (com.android.dx.rop.cst.CstEnumRef) r2
            com.android.dx.rop.cst.CstFieldRef r2 = r2.getFieldRef()
            com.android.dx.dex.file.FieldIdItem r2 = r0.intern(r2)
            return r2
        L3d:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 == 0) goto L48
            com.android.dx.dex.file.ProtoIdsSection r0 = r1.protoIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L48:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r0 == 0) goto L53
            com.android.dx.dex.file.MethodHandlesSection r0 = r1.methodHandles
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L53:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstCallSiteRef
            if (r0 == 0) goto L5e
            com.android.dx.dex.file.CallSiteIdsSection r0 = r1.callSiteIds
            com.android.dx.dex.file.IndexedItem r2 = r0.get(r2)
            return r2
        L5e:
            r2 = 0
            return r2
    }

    public com.android.dx.dex.file.MixedItemSection getByteData() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.byteData
            return r0
    }

    public com.android.dx.dex.file.CallSiteIdsSection getCallSiteIds() {
            r1 = this;
            com.android.dx.dex.file.CallSiteIdsSection r0 = r1.callSiteIds
            return r0
    }

    public com.android.dx.dex.file.MixedItemSection getClassData() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.classData
            return r0
    }

    public com.android.dx.dex.file.ClassDefsSection getClassDefs() {
            r1 = this;
            com.android.dx.dex.file.ClassDefsSection r0 = r1.classDefs
            return r0
    }

    public com.android.dx.dex.file.ClassDefItem getClassOrNull(java.lang.String r3) {
            r2 = this;
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.internClassName(r3)     // Catch: java.lang.IllegalArgumentException -> L12
            com.android.dx.dex.file.ClassDefsSection r0 = r2.classDefs     // Catch: java.lang.IllegalArgumentException -> L12
            com.android.dx.rop.cst.CstType r1 = new com.android.dx.rop.cst.CstType     // Catch: java.lang.IllegalArgumentException -> L12
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L12
            com.android.dx.dex.file.IndexedItem r3 = r0.get(r1)     // Catch: java.lang.IllegalArgumentException -> L12
            com.android.dx.dex.file.ClassDefItem r3 = (com.android.dx.dex.file.ClassDefItem) r3     // Catch: java.lang.IllegalArgumentException -> L12
            return r3
        L12:
            r3 = 0
            return r3
    }

    public com.android.dx.dex.DexOptions getDexOptions() {
            r1 = this;
            com.android.dx.dex.DexOptions r0 = r1.dexOptions
            return r0
    }

    public com.android.dx.dex.file.FieldIdsSection getFieldIds() {
            r1 = this;
            com.android.dx.dex.file.FieldIdsSection r0 = r1.fieldIds
            return r0
    }

    public int getFileSize() {
            r2 = this;
            int r0 = r2.fileSize
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "file size not yet known"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.dex.file.Section getFirstDataSection() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.wordData
            return r0
    }

    public com.android.dx.dex.file.Section getLastDataSection() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.map
            return r0
    }

    public com.android.dx.dex.file.MixedItemSection getMap() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.map
            return r0
    }

    public com.android.dx.dex.file.MethodHandlesSection getMethodHandles() {
            r1 = this;
            com.android.dx.dex.file.MethodHandlesSection r0 = r1.methodHandles
            return r0
    }

    public com.android.dx.dex.file.MethodIdsSection getMethodIds() {
            r1 = this;
            com.android.dx.dex.file.MethodIdsSection r0 = r1.methodIds
            return r0
    }

    public com.android.dx.dex.file.ProtoIdsSection getProtoIds() {
            r1 = this;
            com.android.dx.dex.file.ProtoIdsSection r0 = r1.protoIds
            return r0
    }

    public com.android.dx.dex.file.Statistics getStatistics() {
            r5 = this;
            com.android.dx.dex.file.Statistics r0 = new com.android.dx.dex.file.Statistics
            r0.<init>()
            com.android.dx.dex.file.Section[] r1 = r5.sections
            int r2 = r1.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L13
            r4 = r1[r3]
            r0.addAll(r4)
            int r3 = r3 + 1
            goto L9
        L13:
            return r0
    }

    public com.android.dx.dex.file.MixedItemSection getStringData() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.stringData
            return r0
    }

    public com.android.dx.dex.file.StringIdsSection getStringIds() {
            r1 = this;
            com.android.dx.dex.file.StringIdsSection r0 = r1.stringIds
            return r0
    }

    public com.android.dx.dex.file.TypeIdsSection getTypeIds() {
            r1 = this;
            com.android.dx.dex.file.TypeIdsSection r0 = r1.typeIds
            return r0
    }

    public com.android.dx.dex.file.MixedItemSection getTypeLists() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.typeLists
            return r0
    }

    public com.android.dx.dex.file.MixedItemSection getWordData() {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r1.wordData
            return r0
    }

    public void internIfAppropriate(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L5e
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstString
            if (r0 == 0) goto Le
            com.android.dx.dex.file.StringIdsSection r0 = r1.stringIds
            com.android.dx.rop.cst.CstString r2 = (com.android.dx.rop.cst.CstString) r2
            r0.intern(r2)
            goto L5d
        Le:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstType
            if (r0 == 0) goto L1a
            com.android.dx.dex.file.TypeIdsSection r0 = r1.typeIds
            com.android.dx.rop.cst.CstType r2 = (com.android.dx.rop.cst.CstType) r2
            r0.intern(r2)
            goto L5d
        L1a:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstBaseMethodRef
            if (r0 == 0) goto L26
            com.android.dx.dex.file.MethodIdsSection r0 = r1.methodIds
            com.android.dx.rop.cst.CstBaseMethodRef r2 = (com.android.dx.rop.cst.CstBaseMethodRef) r2
            r0.intern(r2)
            goto L5d
        L26:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r0 == 0) goto L32
            com.android.dx.dex.file.FieldIdsSection r0 = r1.fieldIds
            com.android.dx.rop.cst.CstFieldRef r2 = (com.android.dx.rop.cst.CstFieldRef) r2
            r0.intern(r2)
            goto L5d
        L32:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstEnumRef
            if (r0 == 0) goto L42
            com.android.dx.dex.file.FieldIdsSection r0 = r1.fieldIds
            com.android.dx.rop.cst.CstEnumRef r2 = (com.android.dx.rop.cst.CstEnumRef) r2
            com.android.dx.rop.cst.CstFieldRef r2 = r2.getFieldRef()
            r0.intern(r2)
            goto L5d
        L42:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 == 0) goto L52
            com.android.dx.dex.file.ProtoIdsSection r0 = r1.protoIds
            com.android.dx.rop.cst.CstProtoRef r2 = (com.android.dx.rop.cst.CstProtoRef) r2
            com.android.dx.rop.type.Prototype r2 = r2.getPrototype()
            r0.intern(r2)
            goto L5d
        L52:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r0 == 0) goto L5d
            com.android.dx.dex.file.MethodHandlesSection r0 = r1.methodHandles
            com.android.dx.rop.cst.CstMethodHandle r2 = (com.android.dx.rop.cst.CstMethodHandle) r2
            r0.intern(r2)
        L5d:
            return
        L5e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    public boolean isEmpty() {
            r1 = this;
            com.android.dx.dex.file.ClassDefsSection r0 = r1.classDefs
            java.util.Collection r0 = r0.items()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public void setDumpWidth(int r2) {
            r1 = this;
            r0 = 40
            if (r2 < r0) goto L7
            r1.dumpWidth = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "dumpWidth < 40"
            r2.<init>(r0)
            throw r2
    }

    public byte[] toDex(java.io.Writer r3, boolean r4) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1 = 0
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = r2.toDex0(r0, r4, r1)
            if (r0 == 0) goto Lf
            r4.writeAnnotationsTo(r3)
        Lf:
            byte[] r3 = r4.getArray()
            return r3
    }

    public com.android.dx.util.ByteArrayAnnotatedOutput writeTo(com.android.dx.dex.file.DexFile.Storage r2) {
            r1 = this;
            r0 = 0
            com.android.dx.util.ByteArrayAnnotatedOutput r2 = r1.toDex0(r0, r0, r2)
            return r2
    }

    public void writeTo(java.io.OutputStream r2, com.android.dx.dex.file.DexFile.Storage r3, java.io.Writer r4, boolean r5) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.android.dx.util.ByteArrayAnnotatedOutput r3 = r1.toDex0(r0, r5, r3)
            if (r2 == 0) goto L12
            byte[] r5 = r3.getArray()
            r2.write(r5)
        L12:
            if (r0 == 0) goto L17
            r3.writeAnnotationsTo(r4)
        L17:
            return
    }

    public void writeTo(java.io.OutputStream r2, java.io.Writer r3, boolean r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.writeTo(r2, r0, r3, r4)
            return
    }
}

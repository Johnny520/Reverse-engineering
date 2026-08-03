package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class TableOfContents {
    public final com.android.dex.TableOfContents.Section annotationSetRefLists;
    public final com.android.dex.TableOfContents.Section annotationSets;
    public final com.android.dex.TableOfContents.Section annotations;
    public final com.android.dex.TableOfContents.Section annotationsDirectories;
    public int apiLevel;
    public final com.android.dex.TableOfContents.Section callSiteIds;
    public int checksum;
    public final com.android.dex.TableOfContents.Section classDatas;
    public final com.android.dex.TableOfContents.Section classDefs;
    public final com.android.dex.TableOfContents.Section codes;
    public int dataOff;
    public int dataSize;
    public final com.android.dex.TableOfContents.Section debugInfos;
    public final com.android.dex.TableOfContents.Section encodedArrays;
    public final com.android.dex.TableOfContents.Section fieldIds;
    public int fileSize;
    public final com.android.dex.TableOfContents.Section header;
    public int linkOff;
    public int linkSize;
    public final com.android.dex.TableOfContents.Section mapList;
    public final com.android.dex.TableOfContents.Section methodHandles;
    public final com.android.dex.TableOfContents.Section methodIds;
    public final com.android.dex.TableOfContents.Section protoIds;
    public final com.android.dex.TableOfContents.Section[] sections;
    public byte[] signature;
    public final com.android.dex.TableOfContents.Section stringDatas;
    public final com.android.dex.TableOfContents.Section stringIds;
    public final com.android.dex.TableOfContents.Section typeIds;
    public final com.android.dex.TableOfContents.Section typeLists;

    public static class Section implements java.lang.Comparable<com.android.dex.TableOfContents.Section> {
        public int byteCount;
        public int off;
        public int size;
        public final short type;

        public Section(int r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.size = r0
                r1 = -1
                r2.off = r1
                r2.byteCount = r0
                short r3 = (short) r3
                r2.type = r3
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.android.dex.TableOfContents.Section r2) {
                r1 = this;
                int r0 = r1.off
                int r2 = r2.off
                if (r0 == r2) goto Lc
                if (r0 >= r2) goto La
                r2 = -1
                goto Lb
            La:
                r2 = 1
            Lb:
                return r2
            Lc:
                r2 = 0
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.android.dex.TableOfContents.Section r1) {
                r0 = this;
                com.android.dex.TableOfContents$Section r1 = (com.android.dex.TableOfContents.Section) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean exists() {
                r1 = this;
                int r0 = r1.size
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                short r0 = r3.type
                java.lang.Short r0 = java.lang.Short.valueOf(r0)
                int r1 = r3.off
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r3.size
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = "Section[type=%#x,off=%#x,size=%#x]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    public TableOfContents() {
            r23 = this;
            r0 = r23
            r23.<init>()
            com.android.dex.TableOfContents$Section r2 = new com.android.dex.TableOfContents$Section
            r1 = r2
            r3 = 0
            r2.<init>(r3)
            r0.header = r2
            com.android.dex.TableOfContents$Section r3 = new com.android.dex.TableOfContents$Section
            r2 = r3
            r4 = 1
            r3.<init>(r4)
            r0.stringIds = r3
            com.android.dex.TableOfContents$Section r4 = new com.android.dex.TableOfContents$Section
            r3 = r4
            r5 = 2
            r4.<init>(r5)
            r0.typeIds = r4
            com.android.dex.TableOfContents$Section r5 = new com.android.dex.TableOfContents$Section
            r4 = r5
            r6 = 3
            r5.<init>(r6)
            r0.protoIds = r5
            com.android.dex.TableOfContents$Section r6 = new com.android.dex.TableOfContents$Section
            r5 = r6
            r7 = 4
            r6.<init>(r7)
            r0.fieldIds = r6
            com.android.dex.TableOfContents$Section r7 = new com.android.dex.TableOfContents$Section
            r6 = r7
            r8 = 5
            r7.<init>(r8)
            r0.methodIds = r7
            com.android.dex.TableOfContents$Section r8 = new com.android.dex.TableOfContents$Section
            r7 = r8
            r9 = 6
            r8.<init>(r9)
            r0.classDefs = r8
            com.android.dex.TableOfContents$Section r8 = new com.android.dex.TableOfContents$Section
            r9 = r8
            r10 = 7
            r8.<init>(r10)
            r0.callSiteIds = r8
            com.android.dex.TableOfContents$Section r8 = new com.android.dex.TableOfContents$Section
            r10 = r8
            r11 = 8
            r8.<init>(r11)
            r0.methodHandles = r8
            com.android.dex.TableOfContents$Section r11 = new com.android.dex.TableOfContents$Section
            r8 = r11
            r12 = 4096(0x1000, float:5.74E-42)
            r11.<init>(r12)
            r0.mapList = r11
            com.android.dex.TableOfContents$Section r12 = new com.android.dex.TableOfContents$Section
            r11 = r12
            r13 = 4097(0x1001, float:5.741E-42)
            r12.<init>(r13)
            r0.typeLists = r12
            com.android.dex.TableOfContents$Section r13 = new com.android.dex.TableOfContents$Section
            r12 = r13
            r14 = 4098(0x1002, float:5.743E-42)
            r13.<init>(r14)
            r0.annotationSetRefLists = r13
            com.android.dex.TableOfContents$Section r14 = new com.android.dex.TableOfContents$Section
            r13 = r14
            r15 = 4099(0x1003, float:5.744E-42)
            r14.<init>(r15)
            r0.annotationSets = r14
            com.android.dex.TableOfContents$Section r15 = new com.android.dex.TableOfContents$Section
            r14 = r15
            r21 = r1
            r1 = 8192(0x2000, float:1.148E-41)
            r15.<init>(r1)
            r0.classDatas = r15
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r15 = r1
            r22 = r2
            r2 = 8193(0x2001, float:1.1481E-41)
            r1.<init>(r2)
            r0.codes = r1
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r16 = r1
            r2 = 8194(0x2002, float:1.1482E-41)
            r1.<init>(r2)
            r0.stringDatas = r1
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r17 = r1
            r2 = 8195(0x2003, float:1.1484E-41)
            r1.<init>(r2)
            r0.debugInfos = r1
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r18 = r1
            r2 = 8196(0x2004, float:1.1485E-41)
            r1.<init>(r2)
            r0.annotations = r1
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r19 = r1
            r2 = 8197(0x2005, float:1.1486E-41)
            r1.<init>(r2)
            r0.encodedArrays = r1
            com.android.dex.TableOfContents$Section r1 = new com.android.dex.TableOfContents$Section
            r20 = r1
            r2 = 8198(0x2006, float:1.1488E-41)
            r1.<init>(r2)
            r0.annotationsDirectories = r1
            r1 = r21
            r2 = r22
            com.android.dex.TableOfContents$Section[] r1 = new com.android.dex.TableOfContents.Section[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            r0.sections = r1
            r1 = 20
            byte[] r1 = new byte[r1]
            r0.signature = r1
            return
    }

    private com.android.dex.TableOfContents.Section getSection(short r6) {
            r5 = this;
            com.android.dex.TableOfContents$Section[] r0 = r5.sections
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            short r4 = r3.type
            if (r4 != r6) goto Ld
            return r3
        Ld:
            int r2 = r2 + 1
            goto L4
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No such map item: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    private void readHeader(com.android.dex.Dex.Section r10) throws java.io.UnsupportedEncodingException {
            r9 = this;
            r0 = 8
            byte[] r0 = r10.readByteArray(r0)
            boolean r1 = com.android.dex.DexFormat.isSupportedDexMagic(r0)
            if (r1 == 0) goto Lfc
            int r0 = com.android.dex.DexFormat.magicToApi(r0)
            r9.apiLevel = r0
            int r0 = r10.readInt()
            r9.checksum = r0
            r0 = 20
            byte[] r0 = r10.readByteArray(r0)
            r9.signature = r0
            int r0 = r10.readInt()
            r9.fileSize = r0
            int r0 = r10.readInt()
            r1 = 112(0x70, float:1.57E-43)
            if (r0 != r1) goto Le1
            int r0 = r10.readInt()
            r1 = 305419896(0x12345678, float:5.6904566E-28)
            if (r0 != r1) goto Lc6
            int r0 = r10.readInt()
            r9.linkSize = r0
            int r0 = r10.readInt()
            r9.linkOff = r0
            com.android.dex.TableOfContents$Section r0 = r9.mapList
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.mapList
            int r0 = r0.off
            if (r0 == 0) goto Lbe
            com.android.dex.TableOfContents$Section r0 = r9.stringIds
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.stringIds
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.typeIds
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.typeIds
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.protoIds
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.protoIds
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.fieldIds
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.fieldIds
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.methodIds
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.methodIds
            int r1 = r10.readInt()
            r0.off = r1
            com.android.dex.TableOfContents$Section r0 = r9.classDefs
            int r1 = r10.readInt()
            r0.size = r1
            com.android.dex.TableOfContents$Section r0 = r9.classDefs
            int r1 = r10.readInt()
            r0.off = r1
            int r0 = r10.readInt()
            r9.dataSize = r0
            int r10 = r10.readInt()
            r9.dataOff = r10
            return
        Lbe:
            com.android.dex.DexException r10 = new com.android.dex.DexException
            java.lang.String r0 = "Cannot merge dex files that do not contain a map"
            r10.<init>(r0)
            throw r10
        Lc6:
            com.android.dex.DexException r10 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected endian tag: 0x"
            r1.append(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        Le1:
            com.android.dex.DexException r10 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected header: 0x"
            r1.append(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        Lfc:
            r10 = 0
            r10 = r0[r10]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r10 = 1
            r10 = r0[r10]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r10)
            r10 = 2
            r10 = r0[r10]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
            r10 = 3
            r10 = r0[r10]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r10)
            r10 = 4
            r10 = r0[r10]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r10)
            r10 = 5
            r10 = r0[r10]
            java.lang.Byte r6 = java.lang.Byte.valueOf(r10)
            r10 = 6
            r10 = r0[r10]
            java.lang.Byte r7 = java.lang.Byte.valueOf(r10)
            r10 = 7
            r10 = r0[r10]
            java.lang.Byte r8 = java.lang.Byte.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r0 = "Unexpected magic: [0x%02x, 0x%02x, 0x%02x, 0x%02x, 0x%02x, 0x%02x, 0x%02x, 0x%02x]"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            com.android.dex.DexException r0 = new com.android.dex.DexException
            r0.<init>(r10)
            throw r0
    }

    private void readMap(com.android.dex.Dex.Section r10) throws java.io.IOException {
            r9 = this;
            int r0 = r10.readInt()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L72
            short r3 = r10.readShort()
            r10.readShort()
            com.android.dex.TableOfContents$Section r4 = r9.getSection(r3)
            int r5 = r10.readInt()
            int r6 = r10.readInt()
            int r7 = r4.size
            if (r7 == 0) goto L21
            if (r7 != r5) goto L29
        L21:
            int r7 = r4.off
            r8 = -1
            if (r7 == r8) goto L44
            if (r7 != r6) goto L29
            goto L44
        L29:
            com.android.dex.DexException r10 = new com.android.dex.DexException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected map value for 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L44:
            r4.size = r5
            r4.off = r6
            if (r1 == 0) goto L6e
            int r3 = r1.off
            if (r3 > r6) goto L4f
            goto L6e
        L4f:
            com.android.dex.DexException r10 = new com.android.dex.DexException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Map is unsorted at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L6e:
            int r2 = r2 + 1
            r1 = r4
            goto L6
        L72:
            com.android.dex.TableOfContents$Section[] r10 = r9.sections
            java.util.Arrays.sort(r10)
            return
    }

    public void computeSizesFromOffsets() {
            r5 = this;
            int r0 = r5.dataOff
            int r1 = r5.dataSize
            int r0 = r0 + r1
            com.android.dex.TableOfContents$Section[] r1 = r5.sections
            int r1 = r1.length
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L36
            com.android.dex.TableOfContents$Section[] r2 = r5.sections
            r2 = r2[r1]
            int r3 = r2.off
            r4 = -1
            if (r3 != r4) goto L16
            goto L1c
        L16:
            if (r3 > r0) goto L1f
            int r0 = r0 - r3
            r2.byteCount = r0
            r0 = r3
        L1c:
            int r1 = r1 + (-1)
            goto La
        L1f:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Map is unsorted at "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L36:
            return
    }

    public void readFrom(com.android.dex.Dex r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            com.android.dex.Dex$Section r0 = r2.open(r0)
            r1.readHeader(r0)
            com.android.dex.TableOfContents$Section r0 = r1.mapList
            int r0 = r0.off
            com.android.dex.Dex$Section r2 = r2.open(r0)
            r1.readMap(r2)
            r1.computeSizesFromOffsets()
            return
    }

    public void writeHeader(com.android.dex.Dex.Section r2, int r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r3 = com.android.dex.DexFormat.apiToMagic(r3)
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)
            r2.write(r3)
            int r3 = r1.checksum
            r2.writeInt(r3)
            byte[] r3 = r1.signature
            r2.write(r3)
            int r3 = r1.fileSize
            r2.writeInt(r3)
            r3 = 112(0x70, float:1.57E-43)
            r2.writeInt(r3)
            r3 = 305419896(0x12345678, float:5.6904566E-28)
            r2.writeInt(r3)
            int r3 = r1.linkSize
            r2.writeInt(r3)
            int r3 = r1.linkOff
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.mapList
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.stringIds
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.stringIds
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.typeIds
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.typeIds
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.protoIds
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.protoIds
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.fieldIds
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.fieldIds
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.methodIds
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.methodIds
            int r3 = r3.off
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.classDefs
            int r3 = r3.size
            r2.writeInt(r3)
            com.android.dex.TableOfContents$Section r3 = r1.classDefs
            int r3 = r3.off
            r2.writeInt(r3)
            int r3 = r1.dataSize
            r2.writeInt(r3)
            int r3 = r1.dataOff
            r2.writeInt(r3)
            return
    }

    public void writeMap(com.android.dex.Dex.Section r7) throws java.io.IOException {
            r6 = this;
            com.android.dex.TableOfContents$Section[] r0 = r6.sections
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L15
            r5 = r0[r3]
            boolean r5 = r5.exists()
            if (r5 == 0) goto L12
            int r4 = r4 + 1
        L12:
            int r3 = r3 + 1
            goto L6
        L15:
            r7.writeInt(r4)
            com.android.dex.TableOfContents$Section[] r0 = r6.sections
            int r1 = r0.length
            r3 = r2
        L1c:
            if (r3 >= r1) goto L3b
            r4 = r0[r3]
            boolean r5 = r4.exists()
            if (r5 == 0) goto L38
            short r5 = r4.type
            r7.writeShort(r5)
            r7.writeShort(r2)
            int r5 = r4.size
            r7.writeInt(r5)
            int r4 = r4.off
            r7.writeInt(r4)
        L38:
            int r3 = r3 + 1
            goto L1c
        L3b:
            return
    }
}

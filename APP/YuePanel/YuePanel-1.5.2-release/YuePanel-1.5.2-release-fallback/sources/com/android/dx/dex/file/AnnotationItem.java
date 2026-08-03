package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final com.android.dx.dex.file.AnnotationItem.TypeIdSorter TYPE_ID_SORTER = null;
    private static final int VISIBILITY_BUILD = 0;
    private static final int VISIBILITY_RUNTIME = 1;
    private static final int VISIBILITY_SYSTEM = 2;
    private final com.android.dx.rop.annotation.Annotation annotation;
    private byte[] encodedForm;
    private com.android.dx.dex.file.TypeIdItem type;

    /* JADX INFO: renamed from: com.android.dx.dex.file.AnnotationItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility = null;

        static {
                com.android.dx.rop.annotation.AnnotationVisibility[] r0 = com.android.dx.rop.annotation.AnnotationVisibility.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dx.dex.file.AnnotationItem.AnonymousClass1.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility = r0
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.dx.rop.annotation.AnnotationVisibility.BUILD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dx.dex.file.AnnotationItem.AnonymousClass1.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.dx.rop.annotation.AnnotationVisibility.RUNTIME     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.android.dx.dex.file.AnnotationItem.AnonymousClass1.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility     // Catch: java.lang.NoSuchFieldError -> L28
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static class TypeIdSorter implements java.util.Comparator<com.android.dx.dex.file.AnnotationItem> {
        private TypeIdSorter() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ TypeIdSorter(com.android.dx.dex.file.AnnotationItem.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(com.android.dx.dex.file.AnnotationItem r1, com.android.dx.dex.file.AnnotationItem r2) {
                r0 = this;
                com.android.dx.dex.file.TypeIdItem r1 = com.android.dx.dex.file.AnnotationItem.access$100(r1)
                int r1 = r1.getIndex()
                com.android.dx.dex.file.TypeIdItem r2 = com.android.dx.dex.file.AnnotationItem.access$100(r2)
                int r2 = r2.getIndex()
                if (r1 >= r2) goto L14
                r1 = -1
                return r1
            L14:
                if (r1 <= r2) goto L18
                r1 = 1
                return r1
            L18:
                r1 = 0
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.android.dx.dex.file.AnnotationItem r1, com.android.dx.dex.file.AnnotationItem r2) {
                r0 = this;
                com.android.dx.dex.file.AnnotationItem r1 = (com.android.dx.dex.file.AnnotationItem) r1
                com.android.dx.dex.file.AnnotationItem r2 = (com.android.dx.dex.file.AnnotationItem) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            com.android.dx.dex.file.AnnotationItem$TypeIdSorter r0 = new com.android.dx.dex.file.AnnotationItem$TypeIdSorter
            r1 = 0
            r0.<init>(r1)
            com.android.dx.dex.file.AnnotationItem.TYPE_ID_SORTER = r0
            return
    }

    public AnnotationItem(com.android.dx.rop.annotation.Annotation r3, com.android.dx.dex.file.DexFile r4) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto L12
            r2.annotation = r3
            r3 = 0
            r2.type = r3
            r2.encodedForm = r3
            r2.addContents(r4)
            return
        L12:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "annotation == null"
            r3.<init>(r4)
            throw r3
    }

    public static /* synthetic */ com.android.dx.dex.file.TypeIdItem access$100(com.android.dx.dex.file.AnnotationItem r0) {
            com.android.dx.dex.file.TypeIdItem r0 = r0.type
            return r0
    }

    public static void sortByTypeIdIndex(com.android.dx.dex.file.AnnotationItem[] r1) {
            com.android.dx.dex.file.AnnotationItem$TypeIdSorter r0 = com.android.dx.dex.file.AnnotationItem.TYPE_ID_SORTER
            java.util.Arrays.sort(r1, r0)
            return
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.TypeIdsSection r0 = r3.getTypeIds()
            com.android.dx.rop.annotation.Annotation r1 = r2.annotation
            com.android.dx.rop.cst.CstType r1 = r1.getType()
            com.android.dx.dex.file.TypeIdItem r0 = r0.intern(r1)
            r2.type = r0
            com.android.dx.rop.annotation.Annotation r0 = r2.annotation
            com.android.dx.dex.file.ValueEncoder.addContents(r3, r0)
            return
    }

    public void annotateTo(com.android.dx.util.AnnotatedOutput r6, java.lang.String r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "visibility: "
            r0.append(r1)
            com.android.dx.rop.annotation.Annotation r1 = r5.annotation
            com.android.dx.rop.annotation.AnnotationVisibility r1 = r1.getVisibility()
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.annotate(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r2 = "type: "
            r0.append(r2)
            com.android.dx.rop.annotation.Annotation r2 = r5.annotation
            com.android.dx.rop.cst.CstType r2 = r2.getType()
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.annotate(r1, r0)
            com.android.dx.rop.annotation.Annotation r0 = r5.annotation
            java.util.Collection r0 = r0.getNameValuePairs()
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r0.next()
            com.android.dx.rop.annotation.NameValuePair r2 = (com.android.dx.rop.annotation.NameValuePair) r2
            com.android.dx.rop.cst.CstString r3 = r2.getName()
            com.android.dx.rop.cst.Constant r2 = r2.getValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r3 = r3.toHuman()
            r4.append(r3)
            java.lang.String r3 = ": "
            r4.append(r3)
            java.lang.String r2 = com.android.dx.dex.file.ValueEncoder.constantToHuman(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r6.annotate(r1, r2)
            goto L4d
        L84:
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            com.android.dx.dex.file.AnnotationItem r2 = (com.android.dx.dex.file.AnnotationItem) r2
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            com.android.dx.rop.annotation.Annotation r2 = r2.annotation
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r3, int r4) {
            r2 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r4.<init>()
            com.android.dx.dex.file.ValueEncoder r0 = new com.android.dx.dex.file.ValueEncoder
            com.android.dx.dex.file.DexFile r3 = r3.getFile()
            r0.<init>(r3, r4)
            com.android.dx.rop.annotation.Annotation r3 = r2.annotation
            r1 = 0
            r0.writeAnnotation(r3, r1)
            byte[] r3 = r4.toByteArray()
            r2.encodedForm = r3
            int r3 = r3.length
            int r3 = r3 + 1
            r2.setWriteSize(r3)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8) {
            r6 = this;
            boolean r0 = r8.annotates()
            com.android.dx.rop.annotation.Annotation r1 = r6.annotation
            com.android.dx.rop.annotation.AnnotationVisibility r1 = r1.getVisibility()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.offsetString()
            r4.append(r5)
            java.lang.String r5 = " annotation"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r8.annotate(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  visibility: VISBILITY_"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r8.annotate(r3, r4)
        L3a:
            int[] r4 = com.android.dx.dex.file.AnnotationItem.AnonymousClass1.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility
            int r1 = r1.ordinal()
            r1 = r4[r1]
            if (r1 == r3) goto L5a
            r2 = 2
            if (r1 == r2) goto L56
            r4 = 3
            if (r1 != r4) goto L4e
            r8.writeByte(r2)
            goto L5d
        L4e:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "shouldn't happen"
            r7.<init>(r8)
            throw r7
        L56:
            r8.writeByte(r3)
            goto L5d
        L5a:
            r8.writeByte(r2)
        L5d:
            if (r0 == 0) goto L6a
            com.android.dx.dex.file.ValueEncoder r0 = new com.android.dx.dex.file.ValueEncoder
            r0.<init>(r7, r8)
            com.android.dx.rop.annotation.Annotation r7 = r6.annotation
            r0.writeAnnotation(r7, r3)
            goto L6f
        L6a:
            byte[] r7 = r6.encodedForm
            r8.write(r7)
        L6f:
            return
    }
}

package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MixedItemSection extends com.android.dx.dex.file.Section {
    private static final java.util.Comparator<com.android.dx.dex.file.OffsettedItem> TYPE_SORTER = null;
    private final java.util.HashMap<com.android.dx.dex.file.OffsettedItem, com.android.dx.dex.file.OffsettedItem> interns;
    private final java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> items;
    private final com.android.dx.dex.file.MixedItemSection.SortType sort;
    private int writeSize;


    /* JADX INFO: renamed from: com.android.dx.dex.file.MixedItemSection$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType = null;

        static {
                com.android.dx.dex.file.MixedItemSection$SortType[] r0 = com.android.dx.dex.file.MixedItemSection.SortType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dx.dex.file.MixedItemSection.AnonymousClass2.$SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType = r0
                com.android.dx.dex.file.MixedItemSection$SortType r1 = com.android.dx.dex.file.MixedItemSection.SortType.INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dx.dex.file.MixedItemSection.AnonymousClass2.$SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dx.dex.file.MixedItemSection$SortType r1 = com.android.dx.dex.file.MixedItemSection.SortType.TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public enum SortType extends java.lang.Enum<com.android.dx.dex.file.MixedItemSection.SortType> {
        private static final /* synthetic */ com.android.dx.dex.file.MixedItemSection.SortType[] $VALUES = null;
        public static final com.android.dx.dex.file.MixedItemSection.SortType INSTANCE = null;
        public static final com.android.dx.dex.file.MixedItemSection.SortType NONE = null;
        public static final com.android.dx.dex.file.MixedItemSection.SortType TYPE = null;

        static {
                com.android.dx.dex.file.MixedItemSection$SortType r0 = new com.android.dx.dex.file.MixedItemSection$SortType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.dex.file.MixedItemSection.SortType.NONE = r0
                com.android.dx.dex.file.MixedItemSection$SortType r1 = new com.android.dx.dex.file.MixedItemSection$SortType
                java.lang.String r2 = "TYPE"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.dex.file.MixedItemSection.SortType.TYPE = r1
                com.android.dx.dex.file.MixedItemSection$SortType r2 = new com.android.dx.dex.file.MixedItemSection$SortType
                java.lang.String r3 = "INSTANCE"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.dex.file.MixedItemSection.SortType.INSTANCE = r2
                com.android.dx.dex.file.MixedItemSection$SortType[] r0 = new com.android.dx.dex.file.MixedItemSection.SortType[]{r0, r1, r2}
                com.android.dx.dex.file.MixedItemSection.SortType.$VALUES = r0
                return
        }

        SortType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.dex.file.MixedItemSection.SortType valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.dex.file.MixedItemSection$SortType> r0 = com.android.dx.dex.file.MixedItemSection.SortType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.dex.file.MixedItemSection$SortType r1 = (com.android.dx.dex.file.MixedItemSection.SortType) r1
                return r1
        }

        public static com.android.dx.dex.file.MixedItemSection.SortType[] values() {
                com.android.dx.dex.file.MixedItemSection$SortType[] r0 = com.android.dx.dex.file.MixedItemSection.SortType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.dex.file.MixedItemSection$SortType[] r0 = (com.android.dx.dex.file.MixedItemSection.SortType[]) r0
                return r0
        }
    }

    static {
            com.android.dx.dex.file.MixedItemSection$1 r0 = new com.android.dx.dex.file.MixedItemSection$1
            r0.<init>()
            com.android.dx.dex.file.MixedItemSection.TYPE_SORTER = r0
            return
    }

    public MixedItemSection(java.lang.String r1, com.android.dx.dex.file.DexFile r2, int r3, com.android.dx.dex.file.MixedItemSection.SortType r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 100
            r1.<init>(r2)
            r0.items = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            r0.interns = r1
            r0.sort = r4
            r1 = -1
            r0.writeSize = r1
            return
    }

    public void add(com.android.dx.dex.file.OffsettedItem r3) {
            r2 = this;
            r2.throwIfPrepared()
            int r0 = r3.getAlignment()     // Catch: java.lang.NullPointerException -> L1b
            int r1 = r2.getAlignment()     // Catch: java.lang.NullPointerException -> L1b
            if (r0 > r1) goto L13
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r2.items
            r0.add(r3)
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.NullPointerException -> L1b
            java.lang.String r0 = "incompatible item alignment"
            r3.<init>(r0)     // Catch: java.lang.NullPointerException -> L1b
            throw r3     // Catch: java.lang.NullPointerException -> L1b
        L1b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "item == null"
            r3.<init>(r0)
            throw r3
    }

    public <T extends com.android.dx.dex.file.OffsettedItem> T get(T r2) {
            r1 = this;
            r1.throwIfNotPrepared()
            java.util.HashMap<com.android.dx.dex.file.OffsettedItem, com.android.dx.dex.file.OffsettedItem> r0 = r1.interns
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.dex.file.OffsettedItem r0 = (com.android.dx.dex.file.OffsettedItem) r0
            if (r0 == 0) goto Le
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // com.android.dx.dex.file.Section
    public int getAbsoluteItemOffset(com.android.dx.dex.file.Item r1) {
            r0 = this;
            com.android.dx.dex.file.OffsettedItem r1 = (com.android.dx.dex.file.OffsettedItem) r1
            int r1 = r1.getAbsoluteOffset()
            return r1
    }

    public synchronized <T extends com.android.dx.dex.file.OffsettedItem> T intern(T r2) {
            r1 = this;
            monitor-enter(r1)
            r1.throwIfPrepared()     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap<com.android.dx.dex.file.OffsettedItem, com.android.dx.dex.file.OffsettedItem> r0 = r1.interns     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1a
            com.android.dx.dex.file.OffsettedItem r0 = (com.android.dx.dex.file.OffsettedItem) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L10
            monitor-exit(r1)
            return r0
        L10:
            r1.add(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap<com.android.dx.dex.file.OffsettedItem, com.android.dx.dex.file.OffsettedItem> r0 = r1.interns     // Catch: java.lang.Throwable -> L1a
            r0.put(r2, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r1.items
            return r0
    }

    public void placeItems() {
            r5 = this;
            r5.throwIfNotPrepared()
            int[] r0 = com.android.dx.dex.file.MixedItemSection.AnonymousClass2.$SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType
            com.android.dx.dex.file.MixedItemSection$SortType r1 = r5.sort
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto L14
            goto L21
        L14:
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r5.items
            java.util.Comparator<com.android.dx.dex.file.OffsettedItem> r1 = com.android.dx.dex.file.MixedItemSection.TYPE_SORTER
            java.util.Collections.sort(r0, r1)
            goto L21
        L1c:
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r5.items
            java.util.Collections.sort(r0)
        L21:
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r5.items
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L29:
            if (r1 >= r0) goto L70
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r3 = r5.items
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.dex.file.OffsettedItem r3 = (com.android.dx.dex.file.OffsettedItem) r3
            int r4 = r3.place(r5, r2)     // Catch: java.lang.RuntimeException -> L41
            if (r4 < r2) goto L43
            int r2 = r3.writeSize()     // Catch: java.lang.RuntimeException -> L41
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L29
        L41:
            r0 = move-exception
            goto L5a
        L43:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.RuntimeException -> L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L41
            r1.<init>()     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r2 = "bogus place() result for "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L41
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L41
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L41
            throw r0     // Catch: java.lang.RuntimeException -> L41
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while placing "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
        L70:
            r5.writeSize = r2
            return
    }

    @Override // com.android.dx.dex.file.Section
    public void prepare0() {
            r4 = this;
            com.android.dx.dex.file.DexFile r0 = r4.getFile()
            r1 = 0
        L5:
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r2 = r4.items
            int r2 = r2.size()
            if (r1 < r2) goto Le
            return
        Le:
            if (r1 >= r2) goto L5
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r3 = r4.items
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.dex.file.OffsettedItem r3 = (com.android.dx.dex.file.OffsettedItem) r3
            r3.addContents(r0)
            int r1 = r1 + 1
            goto Le
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r0 = r1.items
            int r0 = r0.size()
            return r0
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r7) {
            r6 = this;
            r6.throwIfNotPrepared()
            int r0 = r6.writeSize
            r1 = -1
            if (r0 == r1) goto L74
            if (r0 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            int r1 = r6.getFileOffset()
        L10:
            java.lang.String r2 = r6.getName()
            if (r2 != 0) goto L18
            java.lang.String r2 = "<unnamed>"
        L18:
            int r3 = r2.length()
            int r3 = 15 - r3
            char[] r3 = new char[r3]
            r4 = 32
            java.util.Arrays.fill(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            boolean r3 = r7.annotates()
            if (r3 == 0) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r5 = "_size:"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = com.android.dx.util.Hex.u4(r0)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 4
            r7.annotate(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "_off: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7.annotate(r5, r2)
        L6d:
            r7.writeInt(r0)
            r7.writeInt(r1)
            return
        L74:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "write size not yet set"
            r7.<init>(r0)
            throw r7
    }

    public void writeIndexAnnotation(com.android.dx.util.AnnotatedOutput r5, com.android.dx.dex.file.ItemType r6, java.lang.String r7) {
            r4 = this;
            r4.throwIfNotPrepared()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r1 = r4.items
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.OffsettedItem r2 = (com.android.dx.dex.file.OffsettedItem) r2
            com.android.dx.dex.file.ItemType r3 = r2.itemType()
            if (r3 != r6) goto Le
            java.lang.String r3 = r2.toHuman()
            r0.put(r3, r2)
            goto Le
        L28:
            int r6 = r0.size()
            if (r6 != 0) goto L2f
            return
        L2f:
            r6 = 0
            r5.annotate(r6, r7)
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L3b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.android.dx.dex.file.OffsettedItem r0 = (com.android.dx.dex.file.OffsettedItem) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.offsetString()
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            r2.append(r1)
            r0 = 10
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.annotate(r6, r0)
            goto L3b
        L74:
            return
    }

    @Override // com.android.dx.dex.file.Section
    public int writeSize() {
            r1 = this;
            r1.throwIfNotPrepared()
            int r0 = r1.writeSize
            return r0
    }

    @Override // com.android.dx.dex.file.Section
    public void writeTo0(com.android.dx.util.AnnotatedOutput r11) {
            r10 = this;
            boolean r0 = r11.annotates()
            com.android.dx.dex.file.DexFile r1 = r10.getFile()
            java.util.ArrayList<com.android.dx.dex.file.OffsettedItem> r2 = r10.items
            java.util.Iterator r2 = r2.iterator()
            r3 = 1
            r4 = 0
            r6 = r3
            r5 = r4
        L12:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L43
            java.lang.Object r7 = r2.next()
            com.android.dx.dex.file.OffsettedItem r7 = (com.android.dx.dex.file.OffsettedItem) r7
            if (r0 == 0) goto L29
            if (r6 == 0) goto L24
            r6 = r4
            goto L29
        L24:
            java.lang.String r8 = "\n"
            r11.annotate(r4, r8)
        L29:
            int r8 = r7.getAlignment()
            int r8 = r8 - r3
            int r9 = r5 + r8
            int r8 = ~r8
            r8 = r8 & r9
            if (r5 == r8) goto L3a
            int r5 = r8 - r5
            r11.writeZeroes(r5)
            r5 = r8
        L3a:
            r7.writeTo(r1, r11)
            int r7 = r7.writeSize()
            int r5 = r5 + r7
            goto L12
        L43:
            int r11 = r10.writeSize
            if (r5 != r11) goto L48
            return
        L48:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "output size mismatch"
            r11.<init>(r0)
            throw r11
    }
}

package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class Dex {
    private static final int CHECKSUM_OFFSET = 8;
    private static final int CHECKSUM_SIZE = 4;
    static final short[] EMPTY_SHORT_ARRAY = null;
    private static final int SIGNATURE_OFFSET = 12;
    private static final int SIGNATURE_SIZE = 20;
    private java.nio.ByteBuffer data;
    private final com.android.dex.Dex.FieldIdTable fieldIds;
    private final com.android.dex.Dex.MethodIdTable methodIds;
    private int nextSectionStart;
    private final com.android.dex.Dex.ProtoIdTable protoIds;
    private final com.android.dex.Dex.StringTable strings;
    private final com.android.dex.TableOfContents tableOfContents;
    private final com.android.dex.Dex.TypeIndexToDescriptorIndexTable typeIds;
    private final com.android.dex.Dex.TypeIndexToDescriptorTable typeNames;

    /* JADX INFO: renamed from: com.android.dex.Dex$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class ClassDefIterable implements java.lang.Iterable<com.android.dex.ClassDef> {
        final /* synthetic */ com.android.dex.Dex this$0;

        private ClassDefIterable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ClassDefIterable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<com.android.dex.ClassDef> iterator() {
                r3 = this;
                com.android.dex.Dex r0 = r3.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.classDefs
                boolean r0 = r0.exists()
                if (r0 != 0) goto L17
                java.util.Set r0 = java.util.Collections.emptySet()
                java.util.Iterator r0 = r0.iterator()
                goto L1f
            L17:
                com.android.dex.Dex$ClassDefIterator r0 = new com.android.dex.Dex$ClassDefIterator
                com.android.dex.Dex r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
            L1f:
                return r0
        }
    }

    public final class ClassDefIterator implements java.util.Iterator<com.android.dex.ClassDef> {
        private int count;
        private final com.android.dex.Dex.Section in;
        final /* synthetic */ com.android.dex.Dex this$0;

        private ClassDefIterator(com.android.dex.Dex r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r2)
                com.android.dex.TableOfContents$Section r0 = r0.classDefs
                int r0 = r0.off
                com.android.dex.Dex$Section r2 = r2.open(r0)
                r1.in = r2
                r2 = 0
                r1.count = r2
                return
        }

        public /* synthetic */ ClassDefIterator(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.count
                com.android.dex.Dex r1 = r2.this$0
                com.android.dex.TableOfContents r1 = com.android.dex.Dex.access$1000(r1)
                com.android.dex.TableOfContents$Section r1 = r1.classDefs
                int r1 = r1.size
                if (r0 >= r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.android.dex.ClassDef next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L13
                int r0 = r1.count
                int r0 = r0 + 1
                r1.count = r0
                com.android.dex.Dex$Section r0 = r1.in
                com.android.dex.ClassDef r0 = r0.readClassDef()
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ com.android.dex.ClassDef next() {
                r1 = this;
                com.android.dex.ClassDef r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    public final class FieldIdTable extends java.util.AbstractList<com.android.dex.FieldId> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private FieldIdTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ FieldIdTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.android.dex.FieldId get(int r3) {
                r2 = this;
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.fieldIds
                int r0 = r0.size
                com.android.dex.Dex.access$1100(r3, r0)
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r1 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r1 = r1.fieldIds
                int r1 = r1.off
                int r3 = r3 * 8
                int r1 = r1 + r3
                com.android.dex.Dex$Section r3 = r0.open(r1)
                com.android.dex.FieldId r3 = r3.readFieldId()
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.android.dex.FieldId r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.fieldIds
                int r0 = r0.size
                return r0
        }
    }

    public final class MethodIdTable extends java.util.AbstractList<com.android.dex.MethodId> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private MethodIdTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MethodIdTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.android.dex.MethodId get(int r3) {
                r2 = this;
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.methodIds
                int r0 = r0.size
                com.android.dex.Dex.access$1100(r3, r0)
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r1 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r1 = r1.methodIds
                int r1 = r1.off
                int r3 = r3 * 8
                int r1 = r1 + r3
                com.android.dex.Dex$Section r3 = r0.open(r1)
                com.android.dex.MethodId r3 = r3.readMethodId()
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.android.dex.MethodId r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.methodIds
                int r0 = r0.size
                return r0
        }
    }

    public final class ProtoIdTable extends java.util.AbstractList<com.android.dex.ProtoId> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private ProtoIdTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ProtoIdTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.android.dex.ProtoId get(int r3) {
                r2 = this;
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.protoIds
                int r0 = r0.size
                com.android.dex.Dex.access$1100(r3, r0)
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r1 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r1 = r1.protoIds
                int r1 = r1.off
                int r3 = r3 * 12
                int r1 = r1 + r3
                com.android.dex.Dex$Section r3 = r0.open(r1)
                com.android.dex.ProtoId r3 = r3.readProtoId()
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.android.dex.ProtoId r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.protoIds
                int r0 = r0.size
                return r0
        }
    }

    public final class Section implements com.android.dex.util.ByteInput, com.android.dex.util.ByteOutput {
        private final java.nio.ByteBuffer data;
        private final int initialPosition;
        private final java.lang.String name;
        final /* synthetic */ com.android.dex.Dex this$0;

        private Section(com.android.dex.Dex r1, java.lang.String r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.data = r3
                int r1 = r3.position()
                r0.initialPosition = r1
                return
        }

        public /* synthetic */ Section(com.android.dex.Dex r1, java.lang.String r2, java.nio.ByteBuffer r3, com.android.dex.Dex.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ com.android.dex.ClassData access$800(com.android.dex.Dex.Section r0) {
                com.android.dex.ClassData r0 = r0.readClassData()
                return r0
        }

        public static /* synthetic */ com.android.dex.Code access$900(com.android.dex.Dex.Section r0) {
                com.android.dex.Code r0 = r0.readCode()
                return r0
        }

        private int findCatchHandlerIndex(com.android.dex.Code.CatchHandler[] r3, int r4) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r3.length
                if (r0 >= r1) goto L10
                r1 = r3[r0]
                int r1 = r1.getOffset()
                if (r1 != r4) goto Ld
                return r0
            Ld:
                int r0 = r0 + 1
                goto L1
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }

        private byte[] getBytesFrom(int r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.data
                int r0 = r0.position()
                int r0 = r0 - r3
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r1 = r2.data
                r1.position(r3)
                java.nio.ByteBuffer r3 = r2.data
                r3.get(r0)
                return r0
        }

        private com.android.dex.Code.CatchHandler readCatchHandler(int r7) {
                r6 = this;
                int r0 = r6.readSleb128()
                int r1 = java.lang.Math.abs(r0)
                int[] r2 = new int[r1]
                int[] r3 = new int[r1]
                r4 = 0
            Ld:
                if (r4 >= r1) goto L1e
                int r5 = r6.readUleb128()
                r2[r4] = r5
                int r5 = r6.readUleb128()
                r3[r4] = r5
                int r4 = r4 + 1
                goto Ld
            L1e:
                if (r0 > 0) goto L25
                int r0 = r6.readUleb128()
                goto L26
            L25:
                r0 = -1
            L26:
                com.android.dex.Code$CatchHandler r1 = new com.android.dex.Code$CatchHandler
                r1.<init>(r2, r3, r0, r7)
                return r1
        }

        private com.android.dex.Code.CatchHandler[] readCatchHandlers() {
                r5 = this;
                java.nio.ByteBuffer r0 = r5.data
                int r0 = r0.position()
                int r1 = r5.readUleb128()
                com.android.dex.Code$CatchHandler[] r2 = new com.android.dex.Code.CatchHandler[r1]
                r3 = 0
            Ld:
                if (r3 >= r1) goto L1f
                java.nio.ByteBuffer r4 = r5.data
                int r4 = r4.position()
                int r4 = r4 - r0
                com.android.dex.Code$CatchHandler r4 = r5.readCatchHandler(r4)
                r2[r3] = r4
                int r3 = r3 + 1
                goto Ld
            L1f:
                return r2
        }

        private com.android.dex.ClassData readClassData() {
                r5 = this;
                int r0 = r5.readUleb128()
                int r1 = r5.readUleb128()
                int r2 = r5.readUleb128()
                int r3 = r5.readUleb128()
                com.android.dex.ClassData$Field[] r0 = r5.readFields(r0)
                com.android.dex.ClassData$Field[] r1 = r5.readFields(r1)
                com.android.dex.ClassData$Method[] r2 = r5.readMethods(r2)
                com.android.dex.ClassData$Method[] r3 = r5.readMethods(r3)
                com.android.dex.ClassData r4 = new com.android.dex.ClassData
                r4.<init>(r0, r1, r2, r3)
                return r4
        }

        private com.android.dex.Code readCode() {
                r9 = this;
                int r1 = r9.readUnsignedShort()
                int r2 = r9.readUnsignedShort()
                int r3 = r9.readUnsignedShort()
                int r0 = r9.readUnsignedShort()
                int r4 = r9.readInt()
                int r5 = r9.readInt()
                short[] r5 = r9.readShortArray(r5)
                if (r0 <= 0) goto L42
                int r6 = r5.length
                int r6 = r6 % 2
                r7 = 1
                if (r6 != r7) goto L27
                r9.readShort()
            L27:
                com.android.dex.Dex r6 = r9.this$0
                java.nio.ByteBuffer r7 = r9.data
                int r7 = r7.position()
                com.android.dex.Dex$Section r6 = r6.open(r7)
                int r7 = r0 * 8
                r9.skip(r7)
                com.android.dex.Code$CatchHandler[] r7 = r9.readCatchHandlers()
                com.android.dex.Code$Try[] r0 = r6.readTries(r0, r7)
                r6 = r0
                goto L48
            L42:
                r0 = 0
                com.android.dex.Code$Try[] r6 = new com.android.dex.Code.Try[r0]
                com.android.dex.Code$CatchHandler[] r0 = new com.android.dex.Code.CatchHandler[r0]
                r7 = r0
            L48:
                com.android.dex.Code r8 = new com.android.dex.Code
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        private com.android.dex.ClassData.Field[] readFields(int r6) {
                r5 = this;
                com.android.dex.ClassData$Field[] r0 = new com.android.dex.ClassData.Field[r6]
                r1 = 0
                r2 = r1
            L4:
                if (r1 >= r6) goto L19
                int r3 = r5.readUleb128()
                int r2 = r2 + r3
                int r3 = r5.readUleb128()
                com.android.dex.ClassData$Field r4 = new com.android.dex.ClassData$Field
                r4.<init>(r2, r3)
                r0[r1] = r4
                int r1 = r1 + 1
                goto L4
            L19:
                return r0
        }

        private com.android.dex.ClassData.Method[] readMethods(int r7) {
                r6 = this;
                com.android.dex.ClassData$Method[] r0 = new com.android.dex.ClassData.Method[r7]
                r1 = 0
                r2 = r1
            L4:
                if (r1 >= r7) goto L1d
                int r3 = r6.readUleb128()
                int r2 = r2 + r3
                int r3 = r6.readUleb128()
                int r4 = r6.readUleb128()
                com.android.dex.ClassData$Method r5 = new com.android.dex.ClassData$Method
                r5.<init>(r2, r3, r4)
                r0[r1] = r5
                int r1 = r1 + 1
                goto L4
            L1d:
                return r0
        }

        private com.android.dex.Code.Try[] readTries(int r7, com.android.dex.Code.CatchHandler[] r8) {
                r6 = this;
                com.android.dex.Code$Try[] r0 = new com.android.dex.Code.Try[r7]
                r1 = 0
            L3:
                if (r1 >= r7) goto L1f
                int r2 = r6.readInt()
                int r3 = r6.readUnsignedShort()
                int r4 = r6.readUnsignedShort()
                int r4 = r6.findCatchHandlerIndex(r8, r4)
                com.android.dex.Code$Try r5 = new com.android.dex.Code$Try
                r5.<init>(r2, r3, r4)
                r0[r1] = r5
                int r1 = r1 + 1
                goto L3
            L1f:
                return r0
        }

        public void alignToFourBytes() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.data
                int r1 = r0.position()
                int r1 = r1 + 3
                r1 = r1 & (-4)
                r0.position(r1)
                return
        }

        public void alignToFourBytesWithZeroFill() {
                r2 = this;
            L0:
                java.nio.ByteBuffer r0 = r2.data
                int r0 = r0.position()
                r0 = r0 & 3
                if (r0 == 0) goto L11
                java.nio.ByteBuffer r0 = r2.data
                r1 = 0
                r0.put(r1)
                goto L0
            L11:
                return
        }

        public void assertFourByteAligned() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.data
                int r0 = r0.position()
                r0 = r0 & 3
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Not four byte aligned!"
                r0.<init>(r1)
                throw r0
        }

        public int getPosition() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                int r0 = r0.position()
                return r0
        }

        public com.android.dex.Annotation readAnnotation() {
                r5 = this;
                byte r0 = r5.readByte()
                java.nio.ByteBuffer r1 = r5.data
                int r1 = r1.position()
                com.android.dex.EncodedValueReader r2 = new com.android.dex.EncodedValueReader
                r3 = 29
                r2.<init>(r5, r3)
                r2.skipValue()
                com.android.dex.Annotation r2 = new com.android.dex.Annotation
                com.android.dex.Dex r3 = r5.this$0
                com.android.dex.EncodedValue r4 = new com.android.dex.EncodedValue
                byte[] r1 = r5.getBytesFrom(r1)
                r4.<init>(r1)
                r2.<init>(r3, r0, r4)
                return r2
        }

        @Override // com.android.dex.util.ByteInput
        public byte readByte() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                byte r0 = r0.get()
                return r0
        }

        public byte[] readByteArray(int r2) {
                r1 = this;
                byte[] r2 = new byte[r2]
                java.nio.ByteBuffer r0 = r1.data
                r0.get(r2)
                return r2
        }

        public com.android.dex.CallSiteId readCallSiteId() {
                r3 = this;
                int r0 = r3.readInt()
                com.android.dex.CallSiteId r1 = new com.android.dex.CallSiteId
                com.android.dex.Dex r2 = r3.this$0
                r1.<init>(r2, r0)
                return r1
        }

        public com.android.dex.ClassDef readClassDef() {
                r12 = this;
                int r2 = r12.getPosition()
                int r3 = r12.readInt()
                int r4 = r12.readInt()
                int r5 = r12.readInt()
                int r6 = r12.readInt()
                int r7 = r12.readInt()
                int r8 = r12.readInt()
                int r9 = r12.readInt()
                int r10 = r12.readInt()
                com.android.dex.ClassDef r11 = new com.android.dex.ClassDef
                com.android.dex.Dex r1 = r12.this$0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public com.android.dex.EncodedValue readEncodedArray() {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.data
                int r0 = r0.position()
                com.android.dex.EncodedValueReader r1 = new com.android.dex.EncodedValueReader
                r2 = 28
                r1.<init>(r3, r2)
                r1.skipValue()
                com.android.dex.EncodedValue r1 = new com.android.dex.EncodedValue
                byte[] r0 = r3.getBytesFrom(r0)
                r1.<init>(r0)
                return r1
        }

        public com.android.dex.FieldId readFieldId() {
                r5 = this;
                int r0 = r5.readUnsignedShort()
                int r1 = r5.readUnsignedShort()
                int r2 = r5.readInt()
                com.android.dex.FieldId r3 = new com.android.dex.FieldId
                com.android.dex.Dex r4 = r5.this$0
                r3.<init>(r4, r0, r1, r2)
                return r3
        }

        public int readInt() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                int r0 = r0.getInt()
                return r0
        }

        public com.android.dex.MethodHandle readMethodHandle() {
                r7 = this;
                int r0 = r7.readUnsignedShort()
                com.android.dex.MethodHandle$MethodHandleType r3 = com.android.dex.MethodHandle.MethodHandleType.fromValue(r0)
                int r4 = r7.readUnsignedShort()
                int r5 = r7.readUnsignedShort()
                int r6 = r7.readUnsignedShort()
                com.android.dex.MethodHandle r0 = new com.android.dex.MethodHandle
                com.android.dex.Dex r2 = r7.this$0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        public com.android.dex.MethodId readMethodId() {
                r5 = this;
                int r0 = r5.readUnsignedShort()
                int r1 = r5.readUnsignedShort()
                int r2 = r5.readInt()
                com.android.dex.MethodId r3 = new com.android.dex.MethodId
                com.android.dex.Dex r4 = r5.this$0
                r3.<init>(r4, r0, r1, r2)
                return r3
        }

        public com.android.dex.ProtoId readProtoId() {
                r5 = this;
                int r0 = r5.readInt()
                int r1 = r5.readInt()
                int r2 = r5.readInt()
                com.android.dex.ProtoId r3 = new com.android.dex.ProtoId
                com.android.dex.Dex r4 = r5.this$0
                r3.<init>(r4, r0, r1, r2)
                return r3
        }

        public short readShort() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                short r0 = r0.getShort()
                return r0
        }

        public short[] readShortArray(int r4) {
                r3 = this;
                if (r4 != 0) goto L5
                short[] r4 = com.android.dex.Dex.EMPTY_SHORT_ARRAY
                return r4
            L5:
                short[] r0 = new short[r4]
                r1 = 0
            L8:
                if (r1 >= r4) goto L13
                short r2 = r3.readShort()
                r0[r1] = r2
                int r1 = r1 + 1
                goto L8
            L13:
                return r0
        }

        public int readSleb128() {
                r1 = this;
                int r0 = com.android.dex.Leb128.readSignedLeb128(r1)
                return r0
        }

        public java.lang.String readString() {
                r7 = this;
                int r0 = r7.readInt()
                java.nio.ByteBuffer r1 = r7.data
                int r1 = r1.position()
                java.nio.ByteBuffer r2 = r7.data
                int r2 = r2.limit()
                java.nio.ByteBuffer r3 = r7.data
                r3.position(r0)
                java.nio.ByteBuffer r0 = r7.data
                int r3 = r0.capacity()
                r0.limit(r3)
                int r0 = r7.readUleb128()     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                char[] r3 = new char[r0]     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                java.lang.String r3 = com.android.dex.Mutf8.decode(r7, r3)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                int r4 = r3.length()     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                if (r4 != r0) goto L39
                java.nio.ByteBuffer r0 = r7.data
                r0.position(r1)
                java.nio.ByteBuffer r0 = r7.data
                r0.limit(r2)
                return r3
            L39:
                com.android.dex.DexException r4 = new com.android.dex.DexException     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                r5.<init>()     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                java.lang.String r6 = "Declared length "
                r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                r5.append(r0)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                java.lang.String r0 = " doesn't match decoded length of "
                r5.append(r0)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                int r0 = r3.length()     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                r5.append(r0)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                r4.<init>(r0)     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
                throw r4     // Catch: java.lang.Throwable -> L5c java.io.UTFDataFormatException -> L5e
            L5c:
                r0 = move-exception
                goto L65
            L5e:
                r0 = move-exception
                com.android.dex.DexException r3 = new com.android.dex.DexException     // Catch: java.lang.Throwable -> L5c
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L5c
                throw r3     // Catch: java.lang.Throwable -> L5c
            L65:
                java.nio.ByteBuffer r3 = r7.data
                r3.position(r1)
                java.nio.ByteBuffer r1 = r7.data
                r1.limit(r2)
                throw r0
        }

        public com.android.dex.TypeList readTypeList() {
                r3 = this;
                int r0 = r3.readInt()
                short[] r0 = r3.readShortArray(r0)
                r3.alignToFourBytes()
                com.android.dex.TypeList r1 = new com.android.dex.TypeList
                com.android.dex.Dex r2 = r3.this$0
                r1.<init>(r2, r0)
                return r1
        }

        public int readUleb128() {
                r1 = this;
                int r0 = com.android.dex.Leb128.readUnsignedLeb128(r1)
                return r0
        }

        public int readUleb128p1() {
                r1 = this;
                int r0 = com.android.dex.Leb128.readUnsignedLeb128(r1)
                int r0 = r0 + (-1)
                return r0
        }

        public int readUnsignedShort() {
                r2 = this;
                short r0 = r2.readShort()
                r1 = 65535(0xffff, float:9.1834E-41)
                r0 = r0 & r1
                return r0
        }

        public void skip(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                java.nio.ByteBuffer r0 = r2.data
                int r1 = r0.position()
                int r1 = r1 + r3
                r0.position(r1)
                return
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }

        public int used() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.data
                int r0 = r0.position()
                int r1 = r2.initialPosition
                int r0 = r0 - r1
                return r0
        }

        public void write(byte[] r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                r0.put(r2)
                return
        }

        public void write(short[] r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Lc
                short r2 = r4[r1]
                r3.writeShort(r2)
                int r1 = r1 + 1
                goto L2
            Lc:
                return
        }

        @Override // com.android.dex.util.ByteOutput
        public void writeByte(int r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                byte r2 = (byte) r2
                r0.put(r2)
                return
        }

        public void writeInt(int r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                r0.putInt(r2)
                return
        }

        public void writeShort(short r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                r0.putShort(r2)
                return
        }

        public void writeSleb128(int r3) {
                r2 = this;
                com.android.dex.Leb128.writeSignedLeb128(r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
                return
            L4:
                com.android.dex.DexException r3 = new com.android.dex.DexException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Section limit "
                r0.append(r1)
                java.nio.ByteBuffer r1 = r2.data
                int r1 = r1.limit()
                r0.append(r1)
                java.lang.String r1 = " exceeded by "
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void writeStringData(java.lang.String r2) {
                r1 = this;
                int r0 = r2.length()     // Catch: java.io.UTFDataFormatException -> L13
                r1.writeUleb128(r0)     // Catch: java.io.UTFDataFormatException -> L13
                byte[] r2 = com.android.dex.Mutf8.encode(r2)     // Catch: java.io.UTFDataFormatException -> L13
                r1.write(r2)     // Catch: java.io.UTFDataFormatException -> L13
                r2 = 0
                r1.writeByte(r2)     // Catch: java.io.UTFDataFormatException -> L13
                return
            L13:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        public void writeTypeList(com.android.dex.TypeList r4) {
                r3 = this;
                short[] r4 = r4.getTypes()
                int r0 = r4.length
                r3.writeInt(r0)
                int r0 = r4.length
                r1 = 0
            La:
                if (r1 >= r0) goto L14
                short r2 = r4[r1]
                r3.writeShort(r2)
                int r1 = r1 + 1
                goto La
            L14:
                r3.alignToFourBytesWithZeroFill()
                return
        }

        public void writeUleb128(int r3) {
                r2 = this;
                com.android.dex.Leb128.writeUnsignedLeb128(r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
                return
            L4:
                com.android.dex.DexException r3 = new com.android.dex.DexException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Section limit "
                r0.append(r1)
                java.nio.ByteBuffer r1 = r2.data
                int r1 = r1.limit()
                r0.append(r1)
                java.lang.String r1 = " exceeded by "
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void writeUleb128p1(int r1) {
                r0 = this;
                int r1 = r1 + 1
                r0.writeUleb128(r1)
                return
        }

        public void writeUnsignedShort(int r4) {
                r3 = this;
                short r0 = (short) r4
                r1 = 65535(0xffff, float:9.1834E-41)
                r1 = r1 & r0
                if (r4 != r1) goto Lb
                r3.writeShort(r0)
                return
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected an unsigned short: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    public final class StringTable extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private StringTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ StringTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.String r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.String get(int r3) {
                r2 = this;
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.stringIds
                int r0 = r0.size
                com.android.dex.Dex.access$1100(r3, r0)
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.TableOfContents r1 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r1 = r1.stringIds
                int r1 = r1.off
                int r3 = r3 * 4
                int r1 = r1 + r3
                com.android.dex.Dex$Section r3 = r0.open(r1)
                java.lang.String r3 = r3.readString()
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.stringIds
                int r0 = r0.size
                return r0
        }
    }

    public final class TypeIndexToDescriptorIndexTable extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private TypeIndexToDescriptorIndexTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ TypeIndexToDescriptorIndexTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer get(int r2) {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                int r2 = r0.descriptorIndexFromTypeIndex(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Integer r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.typeIds
                int r0 = r0.size
                return r0
        }
    }

    public final class TypeIndexToDescriptorTable extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess {
        final /* synthetic */ com.android.dex.Dex this$0;

        private TypeIndexToDescriptorTable(com.android.dex.Dex r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ TypeIndexToDescriptorTable(com.android.dex.Dex r1, com.android.dex.Dex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.String r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.String get(int r3) {
                r2 = this;
                com.android.dex.Dex r0 = r2.this$0
                com.android.dex.Dex$StringTable r0 = com.android.dex.Dex.access$1200(r0)
                com.android.dex.Dex r1 = r2.this$0
                int r3 = r1.descriptorIndexFromTypeIndex(r3)
                java.lang.String r3 = r0.get(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.android.dex.Dex r0 = r1.this$0
                com.android.dex.TableOfContents r0 = com.android.dex.Dex.access$1000(r0)
                com.android.dex.TableOfContents$Section r0 = r0.typeIds
                int r0 = r0.size
                return r0
        }
    }

    static {
            r0 = 0
            short[] r0 = new short[r0]
            com.android.dex.Dex.EMPTY_SHORT_ARRAY = r0
            return
    }

    public Dex(int r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.android.dex.TableOfContents r0 = new com.android.dex.TableOfContents
            r0.<init>()
            r2.tableOfContents = r0
            r0 = 0
            r2.nextSectionStart = r0
            com.android.dex.Dex$StringTable r0 = new com.android.dex.Dex$StringTable
            r1 = 0
            r0.<init>(r2, r1)
            r2.strings = r0
            com.android.dex.Dex$TypeIndexToDescriptorIndexTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorIndexTable
            r0.<init>(r2, r1)
            r2.typeIds = r0
            com.android.dex.Dex$TypeIndexToDescriptorTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorTable
            r0.<init>(r2, r1)
            r2.typeNames = r0
            com.android.dex.Dex$ProtoIdTable r0 = new com.android.dex.Dex$ProtoIdTable
            r0.<init>(r2, r1)
            r2.protoIds = r0
            com.android.dex.Dex$FieldIdTable r0 = new com.android.dex.Dex$FieldIdTable
            r0.<init>(r2, r1)
            r2.fieldIds = r0
            com.android.dex.Dex$MethodIdTable r0 = new com.android.dex.Dex$MethodIdTable
            r0.<init>(r2, r1)
            r2.methodIds = r0
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r2.data = r3
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.order(r0)
            return
    }

    public Dex(java.io.File r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            com.android.dex.TableOfContents r0 = new com.android.dex.TableOfContents
            r0.<init>()
            r3.tableOfContents = r0
            r0 = 0
            r3.nextSectionStart = r0
            com.android.dex.Dex$StringTable r0 = new com.android.dex.Dex$StringTable
            r1 = 0
            r0.<init>(r3, r1)
            r3.strings = r0
            com.android.dex.Dex$TypeIndexToDescriptorIndexTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorIndexTable
            r0.<init>(r3, r1)
            r3.typeIds = r0
            com.android.dex.Dex$TypeIndexToDescriptorTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorTable
            r0.<init>(r3, r1)
            r3.typeNames = r0
            com.android.dex.Dex$ProtoIdTable r0 = new com.android.dex.Dex$ProtoIdTable
            r0.<init>(r3, r1)
            r3.protoIds = r0
            com.android.dex.Dex$FieldIdTable r0 = new com.android.dex.Dex$FieldIdTable
            r0.<init>(r3, r1)
            r3.fieldIds = r0
            com.android.dex.Dex$MethodIdTable r0 = new com.android.dex.Dex$MethodIdTable
            r0.<init>(r3, r1)
            r3.methodIds = r0
            java.lang.String r0 = r4.getName()
            boolean r0 = com.android.dex.util.FileUtils.hasArchiveSuffix(r0)
            if (r0 == 0) goto L84
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r4)
            java.lang.String r1 = "classes.dex"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)
            if (r1 == 0) goto L6d
            java.io.InputStream r4 = r0.getInputStream(r1)
            r3.loadFrom(r4)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L5b
            r4.close()
        L5b:
            r0.close()
            goto L9b
        L5f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            if (r4 == 0) goto L6c
            r4.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r4 = move-exception
            r0.addSuppressed(r4)
        L6c:
            throw r1
        L6d:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected classes.dex in "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L84:
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = ".dex"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto La8
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            r3.loadFrom(r0)     // Catch: java.lang.Throwable -> L9c
            r0.close()
        L9b:
            return
        L9c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L9e
        L9e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r0 = move-exception
            r4.addSuppressed(r0)
        La7:
            throw r1
        La8:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown output extension: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public Dex(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.android.dex.TableOfContents r0 = new com.android.dex.TableOfContents
            r0.<init>()
            r2.tableOfContents = r0
            r0 = 0
            r2.nextSectionStart = r0
            com.android.dex.Dex$StringTable r0 = new com.android.dex.Dex$StringTable
            r1 = 0
            r0.<init>(r2, r1)
            r2.strings = r0
            com.android.dex.Dex$TypeIndexToDescriptorIndexTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorIndexTable
            r0.<init>(r2, r1)
            r2.typeIds = r0
            com.android.dex.Dex$TypeIndexToDescriptorTable r0 = new com.android.dex.Dex$TypeIndexToDescriptorTable
            r0.<init>(r2, r1)
            r2.typeNames = r0
            com.android.dex.Dex$ProtoIdTable r0 = new com.android.dex.Dex$ProtoIdTable
            r0.<init>(r2, r1)
            r2.protoIds = r0
            com.android.dex.Dex$FieldIdTable r0 = new com.android.dex.Dex$FieldIdTable
            r0.<init>(r2, r1)
            r2.fieldIds = r0
            com.android.dex.Dex$MethodIdTable r0 = new com.android.dex.Dex$MethodIdTable
            r0.<init>(r2, r1)
            r2.methodIds = r0
            r2.loadFrom(r3)     // Catch: java.lang.Throwable -> L3f
            r3.close()
            return
        L3f:
            r0 = move-exception
            r3.close()
            throw r0
    }

    private Dex(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            com.android.dex.TableOfContents r0 = new com.android.dex.TableOfContents
            r0.<init>()
            r3.tableOfContents = r0
            r1 = 0
            r3.nextSectionStart = r1
            com.android.dex.Dex$StringTable r1 = new com.android.dex.Dex$StringTable
            r2 = 0
            r1.<init>(r3, r2)
            r3.strings = r1
            com.android.dex.Dex$TypeIndexToDescriptorIndexTable r1 = new com.android.dex.Dex$TypeIndexToDescriptorIndexTable
            r1.<init>(r3, r2)
            r3.typeIds = r1
            com.android.dex.Dex$TypeIndexToDescriptorTable r1 = new com.android.dex.Dex$TypeIndexToDescriptorTable
            r1.<init>(r3, r2)
            r3.typeNames = r1
            com.android.dex.Dex$ProtoIdTable r1 = new com.android.dex.Dex$ProtoIdTable
            r1.<init>(r3, r2)
            r3.protoIds = r1
            com.android.dex.Dex$FieldIdTable r1 = new com.android.dex.Dex$FieldIdTable
            r1.<init>(r3, r2)
            r3.fieldIds = r1
            com.android.dex.Dex$MethodIdTable r1 = new com.android.dex.Dex$MethodIdTable
            r1.<init>(r3, r2)
            r3.methodIds = r1
            r3.data = r4
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r1)
            r0.readFrom(r3)
            return
    }

    public Dex(byte[] r1) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ com.android.dex.TableOfContents access$1000(com.android.dex.Dex r0) {
            com.android.dex.TableOfContents r0 = r0.tableOfContents
            return r0
    }

    public static /* synthetic */ void access$1100(int r0, int r1) {
            checkBounds(r0, r1)
            return
    }

    public static /* synthetic */ com.android.dex.Dex.StringTable access$1200(com.android.dex.Dex r0) {
            com.android.dex.Dex$StringTable r0 = r0.strings
            return r0
    }

    private static void checkBounds(int r3, int r4) {
            if (r3 < 0) goto L5
            if (r3 >= r4) goto L5
            return
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", length="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void loadFrom(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r5.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r5 = r0.toByteArray()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r4.data = r5
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r5.order(r0)
            com.android.dex.TableOfContents r5 = r4.tableOfContents
            r5.readFrom(r4)
            return
    }

    public com.android.dex.Dex.Section appendSection(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r4 & 3
            if (r0 != 0) goto L23
            int r0 = r3.nextSectionStart
            int r0 = r0 + r4
            java.nio.ByteBuffer r4 = r3.data
            java.nio.ByteBuffer r4 = r4.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r1)
            int r1 = r3.nextSectionStart
            r4.position(r1)
            r4.limit(r0)
            com.android.dex.Dex$Section r1 = new com.android.dex.Dex$Section
            r2 = 0
            r1.<init>(r3, r5, r4, r2)
            r3.nextSectionStart = r0
            return r1
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Not four byte aligned!"
            r4.<init>(r5)
            throw r4
    }

    public java.lang.Iterable<com.android.dex.ClassDef> classDefs() {
            r2 = this;
            com.android.dex.Dex$ClassDefIterable r0 = new com.android.dex.Dex$ClassDefIterable
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int computeChecksum() throws java.io.IOException {
            r6 = this;
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r1]
            java.nio.ByteBuffer r3 = r6.data
            java.nio.ByteBuffer r3 = r3.duplicate()
            int r4 = r3.capacity()
            r3.limit(r4)
            r4 = 12
            r3.position(r4)
        L1b:
            boolean r4 = r3.hasRemaining()
            if (r4 == 0) goto L31
            int r4 = r3.remaining()
            int r4 = java.lang.Math.min(r1, r4)
            r5 = 0
            r3.get(r2, r5, r4)
            r0.update(r2, r5, r4)
            goto L1b
        L31:
            long r0 = r0.getValue()
            int r0 = (int) r0
            return r0
    }

    public byte[] computeSignature() throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L37
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r1]
            java.nio.ByteBuffer r3 = r6.data
            java.nio.ByteBuffer r3 = r3.duplicate()
            int r4 = r3.capacity()
            r3.limit(r4)
            r4 = 32
            r3.position(r4)
        L1c:
            boolean r4 = r3.hasRemaining()
            if (r4 == 0) goto L32
            int r4 = r3.remaining()
            int r4 = java.lang.Math.min(r1, r4)
            r5 = 0
            r3.get(r2, r5, r4)
            r0.update(r2, r5, r4)
            goto L1c
        L32:
            byte[] r0 = r0.digest()
            return r0
        L37:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public int descriptorIndexFromTypeIndex(int r2) {
            r1 = this;
            com.android.dex.TableOfContents r0 = r1.tableOfContents
            com.android.dex.TableOfContents$Section r0 = r0.typeIds
            int r0 = r0.size
            checkBounds(r2, r0)
            com.android.dex.TableOfContents r0 = r1.tableOfContents
            com.android.dex.TableOfContents$Section r0 = r0.typeIds
            int r0 = r0.off
            int r2 = r2 * 4
            int r0 = r0 + r2
            java.nio.ByteBuffer r2 = r1.data
            int r2 = r2.getInt(r0)
            return r2
    }

    public java.util.List<com.android.dex.FieldId> fieldIds() {
            r1 = this;
            com.android.dex.Dex$FieldIdTable r0 = r1.fieldIds
            return r0
    }

    public byte[] getBytes() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.data
            java.nio.ByteBuffer r0 = r0.duplicate()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.position(r2)
            r0.get(r1)
            return r1
    }

    public int getLength() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            int r0 = r0.capacity()
            return r0
    }

    public int getNextSectionStart() {
            r1 = this;
            int r0 = r1.nextSectionStart
            return r0
    }

    public com.android.dex.TableOfContents getTableOfContents() {
            r1 = this;
            com.android.dex.TableOfContents r0 = r1.tableOfContents
            return r0
    }

    public java.util.List<com.android.dex.MethodId> methodIds() {
            r1 = this;
            com.android.dex.Dex$MethodIdTable r0 = r1.methodIds
            return r0
    }

    public com.android.dex.Dex.Section open(int r4) {
            r3 = this;
            if (r4 < 0) goto L2a
            java.nio.ByteBuffer r0 = r3.data
            int r0 = r0.capacity()
            if (r4 >= r0) goto L2a
            java.nio.ByteBuffer r0 = r3.data
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            r0.position(r4)
            java.nio.ByteBuffer r4 = r3.data
            int r4 = r4.capacity()
            r0.limit(r4)
            com.android.dex.Dex$Section r4 = new com.android.dex.Dex$Section
            java.lang.String r1 = "section"
            r2 = 0
            r4.<init>(r3, r1, r0, r2)
            return r4
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "position="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " length="
            r1.append(r4)
            java.nio.ByteBuffer r4 = r3.data
            int r4 = r4.capacity()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.util.List<com.android.dex.ProtoId> protoIds() {
            r1 = this;
            com.android.dex.Dex$ProtoIdTable r0 = r1.protoIds
            return r0
    }

    public com.android.dex.ClassData readClassData(com.android.dex.ClassDef r2) {
            r1 = this;
            int r2 = r2.getClassDataOffset()
            if (r2 == 0) goto Lf
            com.android.dex.Dex$Section r2 = r1.open(r2)
            com.android.dex.ClassData r2 = com.android.dex.Dex.Section.access$800(r2)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "offset == 0"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dex.Code readCode(com.android.dex.ClassData.Method r2) {
            r1 = this;
            int r2 = r2.getCodeOffset()
            if (r2 == 0) goto Lf
            com.android.dex.Dex$Section r2 = r1.open(r2)
            com.android.dex.Code r2 = com.android.dex.Dex.Section.access$900(r2)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "offset == 0"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dex.TypeList readTypeList(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            com.android.dex.TypeList r1 = com.android.dex.TypeList.EMPTY
            return r1
        L5:
            com.android.dex.Dex$Section r1 = r0.open(r1)
            com.android.dex.TypeList r1 = r1.readTypeList()
            return r1
    }

    public java.util.List<java.lang.String> strings() {
            r1 = this;
            com.android.dex.Dex$StringTable r0 = r1.strings
            return r0
    }

    public java.util.List<java.lang.Integer> typeIds() {
            r1 = this;
            com.android.dex.Dex$TypeIndexToDescriptorIndexTable r0 = r1.typeIds
            return r0
    }

    public java.util.List<java.lang.String> typeNames() {
            r1 = this;
            com.android.dex.Dex$TypeIndexToDescriptorTable r0 = r1.typeNames
            return r0
    }

    public void writeHashes() throws java.io.IOException {
            r2 = this;
            r0 = 12
            com.android.dex.Dex$Section r0 = r2.open(r0)
            byte[] r1 = r2.computeSignature()
            r0.write(r1)
            r0 = 8
            com.android.dex.Dex$Section r0 = r2.open(r0)
            int r1 = r2.computeChecksum()
            r0.writeInt(r1)
            return
    }

    public void writeTo(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            r2.writeTo(r0)     // Catch: java.lang.Throwable -> Lc
            r0.close()
            return
        Lc:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Le
        Le:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            r3.addSuppressed(r0)
        L17:
            throw r1
    }

    public void writeTo(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r2 = r5.data
            java.nio.ByteBuffer r2 = r2.duplicate()
            r2.clear()
        Ld:
            boolean r3 = r2.hasRemaining()
            if (r3 == 0) goto L23
            int r3 = r2.remaining()
            int r3 = java.lang.Math.min(r0, r3)
            r4 = 0
            r2.get(r1, r4, r3)
            r6.write(r1, r4, r3)
            goto Ld
        L23:
            return
    }
}

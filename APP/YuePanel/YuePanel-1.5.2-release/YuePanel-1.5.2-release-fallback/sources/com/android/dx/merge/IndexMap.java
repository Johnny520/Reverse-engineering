package com.android.dx.merge;

/* JADX INFO: loaded from: classes.dex */
public final class IndexMap {
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> annotationDirectoryOffsets;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> annotationOffsets;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> annotationSetOffsets;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> annotationSetRefListOffsets;
    public final int[] callSiteIds;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> encodedArrayValueOffset;
    public final short[] fieldIds;
    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> methodHandleIds;
    public final short[] methodIds;
    public final short[] protoIds;
    public final int[] stringIds;
    private final com.android.dex.Dex target;
    public final short[] typeIds;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> typeListOffsets;

    public final class EncodedValueTransformer {
        private final com.android.dex.util.ByteOutput out;
        final /* synthetic */ com.android.dx.merge.IndexMap this$0;

        public EncodedValueTransformer(com.android.dx.merge.IndexMap r1, com.android.dex.util.ByteOutput r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.out = r2
                return
        }

        public static /* synthetic */ void access$000(com.android.dx.merge.IndexMap.EncodedValueTransformer r0, com.android.dex.EncodedValueReader r1) {
                r0.transformArray(r1)
                return
        }

        public static /* synthetic */ void access$100(com.android.dx.merge.IndexMap.EncodedValueTransformer r0, com.android.dex.EncodedValueReader r1) {
                r0.transformAnnotation(r1)
                return
        }

        private void transformAnnotation(com.android.dex.EncodedValueReader r6) {
                r5 = this;
                int r0 = r6.readAnnotation()
                com.android.dex.util.ByteOutput r1 = r5.out
                com.android.dx.merge.IndexMap r2 = r5.this$0
                int r3 = r6.getAnnotationType()
                int r2 = r2.adjustType(r3)
                com.android.dex.Leb128.writeUnsignedLeb128(r1, r2)
                com.android.dex.util.ByteOutput r1 = r5.out
                com.android.dex.Leb128.writeUnsignedLeb128(r1, r0)
                r1 = 0
            L19:
                if (r1 >= r0) goto L30
                com.android.dex.util.ByteOutput r2 = r5.out
                com.android.dx.merge.IndexMap r3 = r5.this$0
                int r4 = r6.readAnnotationName()
                int r3 = r3.adjustString(r4)
                com.android.dex.Leb128.writeUnsignedLeb128(r2, r3)
                r5.transform(r6)
                int r1 = r1 + 1
                goto L19
            L30:
                return
        }

        private void transformArray(com.android.dex.EncodedValueReader r3) {
                r2 = this;
                int r0 = r3.readArray()
                com.android.dex.util.ByteOutput r1 = r2.out
                com.android.dex.Leb128.writeUnsignedLeb128(r1, r0)
                r1 = 0
            La:
                if (r1 >= r0) goto L12
                r2.transform(r3)
                int r1 = r1 + 1
                goto La
            L12:
                return
        }

        private void writeTypeAndArg(int r2, int r3) {
                r1 = this;
                com.android.dex.util.ByteOutput r0 = r1.out
                int r3 = r3 << 5
                r2 = r2 | r3
                r0.writeByte(r2)
                return
        }

        public void transform(com.android.dex.EncodedValueReader r6) {
                r5 = this;
                int r0 = r6.peek()
                r1 = 0
                if (r0 == 0) goto L13b
                r2 = 6
                if (r0 == r2) goto L131
                r2 = 2
                if (r0 == r2) goto L126
                r2 = 3
                if (r0 == r2) goto L11b
                r2 = 4
                if (r0 == r2) goto L110
                r2 = 16
                if (r0 == r2) goto Lfe
                r2 = 17
                if (r0 == r2) goto Lf0
                switch(r0) {
                    case 21: goto Ldd;
                    case 22: goto Lca;
                    case 23: goto Lb6;
                    case 24: goto La2;
                    case 25: goto L8e;
                    case 26: goto L7a;
                    case 27: goto L66;
                    case 28: goto L5c;
                    case 29: goto L52;
                    case 30: goto L48;
                    case 31: goto L3d;
                    default: goto L1e;
                }
            L1e:
                com.android.dex.DexException r0 = new com.android.dex.DexException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected type: "
                r1.append(r2)
                int r6 = r6.peek()
                java.lang.String r6 = java.lang.Integer.toHexString(r6)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            L3d:
                boolean r6 = r6.readBoolean()
                r0 = 31
                r5.writeTypeAndArg(r0, r6)
                goto L145
            L48:
                r6.readNull()
                r6 = 30
                r5.writeTypeAndArg(r6, r1)
                goto L145
            L52:
                r0 = 29
                r5.writeTypeAndArg(r0, r1)
                r5.transformAnnotation(r6)
                goto L145
            L5c:
                r0 = 28
                r5.writeTypeAndArg(r0, r1)
                r5.transformArray(r6)
                goto L145
            L66:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readEnum()
                int r6 = r1.adjustField(r6)
                long r1 = (long) r6
                r6 = 27
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            L7a:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readMethod()
                int r6 = r1.adjustMethod(r6)
                long r1 = (long) r6
                r6 = 26
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            L8e:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readField()
                int r6 = r1.adjustField(r6)
                long r1 = (long) r6
                r6 = 25
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            La2:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readType()
                int r6 = r1.adjustType(r6)
                long r1 = (long) r6
                r6 = 24
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            Lb6:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readString()
                int r6 = r1.adjustString(r6)
                long r1 = (long) r6
                r6 = 23
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            Lca:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readMethodHandle()
                int r6 = r1.adjustMethodHandle(r6)
                long r1 = (long) r6
                r6 = 22
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            Ldd:
                com.android.dex.util.ByteOutput r0 = r5.out
                com.android.dx.merge.IndexMap r1 = r5.this$0
                int r6 = r6.readMethodType()
                int r6 = r1.adjustProto(r6)
                long r1 = (long) r6
                r6 = 21
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r6, r1)
                goto L145
            Lf0:
                com.android.dex.util.ByteOutput r0 = r5.out
                double r3 = r6.readDouble()
                long r3 = java.lang.Double.doubleToLongBits(r3)
                com.android.dex.EncodedValueCodec.writeRightZeroExtendedValue(r0, r2, r3)
                goto L145
            Lfe:
                float r6 = r6.readFloat()
                int r6 = java.lang.Float.floatToIntBits(r6)
                long r0 = (long) r6
                r6 = 32
                long r0 = r0 << r6
                com.android.dex.util.ByteOutput r6 = r5.out
                com.android.dex.EncodedValueCodec.writeRightZeroExtendedValue(r6, r2, r0)
                goto L145
            L110:
                com.android.dex.util.ByteOutput r0 = r5.out
                int r6 = r6.readInt()
                long r3 = (long) r6
                com.android.dex.EncodedValueCodec.writeSignedIntegralValue(r0, r2, r3)
                goto L145
            L11b:
                com.android.dex.util.ByteOutput r0 = r5.out
                char r6 = r6.readChar()
                long r3 = (long) r6
                com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r0, r2, r3)
                goto L145
            L126:
                com.android.dex.util.ByteOutput r0 = r5.out
                short r6 = r6.readShort()
                long r3 = (long) r6
                com.android.dex.EncodedValueCodec.writeSignedIntegralValue(r0, r2, r3)
                goto L145
            L131:
                com.android.dex.util.ByteOutput r0 = r5.out
                long r3 = r6.readLong()
                com.android.dex.EncodedValueCodec.writeSignedIntegralValue(r0, r2, r3)
                goto L145
            L13b:
                com.android.dex.util.ByteOutput r0 = r5.out
                byte r6 = r6.readByte()
                long r2 = (long) r6
                com.android.dex.EncodedValueCodec.writeSignedIntegralValue(r0, r1, r2)
            L145:
                return
        }
    }

    public IndexMap(com.android.dex.Dex r4, com.android.dex.TableOfContents r5) {
            r3 = this;
            r3.<init>()
            r3.target = r4
            com.android.dex.TableOfContents$Section r4 = r5.stringIds
            int r4 = r4.size
            int[] r4 = new int[r4]
            r3.stringIds = r4
            com.android.dex.TableOfContents$Section r4 = r5.typeIds
            int r4 = r4.size
            short[] r4 = new short[r4]
            r3.typeIds = r4
            com.android.dex.TableOfContents$Section r4 = r5.protoIds
            int r4 = r4.size
            short[] r4 = new short[r4]
            r3.protoIds = r4
            com.android.dex.TableOfContents$Section r4 = r5.fieldIds
            int r4 = r4.size
            short[] r4 = new short[r4]
            r3.fieldIds = r4
            com.android.dex.TableOfContents$Section r4 = r5.methodIds
            int r4 = r4.size
            short[] r4 = new short[r4]
            r3.methodIds = r4
            com.android.dex.TableOfContents$Section r4 = r5.callSiteIds
            int r4 = r4.size
            int[] r4 = new int[r4]
            r3.callSiteIds = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.methodHandleIds = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.typeListOffsets = r4
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.annotationOffsets = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.annotationSetOffsets = r5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.annotationSetRefListOffsets = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.annotationDirectoryOffsets = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.encodedArrayValueOffset = r1
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r2, r2)
            r5.put(r2, r2)
            r0.put(r2, r2)
            r1.put(r2, r2)
            return
    }

    public com.android.dex.Annotation adjust(com.android.dex.Annotation r5) {
            r4 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r1 = 32
            r0.<init>(r1)
            com.android.dx.merge.IndexMap$EncodedValueTransformer r1 = new com.android.dx.merge.IndexMap$EncodedValueTransformer
            r1.<init>(r4, r0)
            com.android.dex.EncodedValueReader r2 = r5.getReader()
            com.android.dx.merge.IndexMap.EncodedValueTransformer.access$100(r1, r2)
            com.android.dex.Annotation r1 = new com.android.dex.Annotation
            com.android.dex.Dex r2 = r4.target
            byte r5 = r5.getVisibility()
            com.android.dex.EncodedValue r3 = new com.android.dex.EncodedValue
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r1.<init>(r2, r5, r3)
            return r1
    }

    public com.android.dex.CallSiteId adjust(com.android.dex.CallSiteId r3) {
            r2 = this;
            com.android.dex.CallSiteId r0 = new com.android.dex.CallSiteId
            com.android.dex.Dex r1 = r2.target
            int r3 = r3.getCallSiteOffset()
            int r3 = r2.adjustEncodedArray(r3)
            r0.<init>(r1, r3)
            return r0
    }

    public com.android.dex.ClassDef adjust(com.android.dex.ClassDef r13) {
            r12 = this;
            com.android.dex.ClassDef r11 = new com.android.dex.ClassDef
            com.android.dex.Dex r1 = r12.target
            int r2 = r13.getOffset()
            int r0 = r13.getTypeIndex()
            int r3 = r12.adjustType(r0)
            int r4 = r13.getAccessFlags()
            int r0 = r13.getSupertypeIndex()
            int r5 = r12.adjustType(r0)
            int r0 = r13.getInterfacesOffset()
            int r6 = r12.adjustTypeListOffset(r0)
            int r7 = r13.getSourceFileIndex()
            int r8 = r13.getAnnotationsOffset()
            int r9 = r13.getClassDataOffset()
            int r10 = r13.getStaticValuesOffset()
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public com.android.dex.FieldId adjust(com.android.dex.FieldId r5) {
            r4 = this;
            com.android.dex.FieldId r0 = new com.android.dex.FieldId
            com.android.dex.Dex r1 = r4.target
            int r2 = r5.getDeclaringClassIndex()
            int r2 = r4.adjustType(r2)
            int r3 = r5.getTypeIndex()
            int r3 = r4.adjustType(r3)
            int r5 = r5.getNameIndex()
            int r5 = r4.adjustString(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public com.android.dex.MethodHandle adjust(com.android.dex.MethodHandle r8) {
            r7 = this;
            com.android.dex.MethodHandle r6 = new com.android.dex.MethodHandle
            com.android.dex.Dex r1 = r7.target
            com.android.dex.MethodHandle$MethodHandleType r2 = r8.getMethodHandleType()
            int r3 = r8.getUnused1()
            com.android.dex.MethodHandle$MethodHandleType r0 = r8.getMethodHandleType()
            boolean r0 = r0.isField()
            if (r0 == 0) goto L20
            int r0 = r8.getFieldOrMethodId()
            int r0 = r7.adjustField(r0)
        L1e:
            r4 = r0
            goto L29
        L20:
            int r0 = r8.getFieldOrMethodId()
            int r0 = r7.adjustMethod(r0)
            goto L1e
        L29:
            int r5 = r8.getUnused2()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public com.android.dex.MethodId adjust(com.android.dex.MethodId r5) {
            r4 = this;
            com.android.dex.MethodId r0 = new com.android.dex.MethodId
            com.android.dex.Dex r1 = r4.target
            int r2 = r5.getDeclaringClassIndex()
            int r2 = r4.adjustType(r2)
            int r3 = r5.getProtoIndex()
            int r3 = r4.adjustProto(r3)
            int r5 = r5.getNameIndex()
            int r5 = r4.adjustString(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public com.android.dex.ProtoId adjust(com.android.dex.ProtoId r5) {
            r4 = this;
            com.android.dex.ProtoId r0 = new com.android.dex.ProtoId
            com.android.dex.Dex r1 = r4.target
            int r2 = r5.getShortyIndex()
            int r2 = r4.adjustString(r2)
            int r3 = r5.getReturnTypeIndex()
            int r3 = r4.adjustType(r3)
            int r5 = r5.getParametersOffset()
            int r5 = r4.adjustTypeListOffset(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public com.android.dx.merge.SortableType adjust(com.android.dx.merge.SortableType r4) {
            r3 = this;
            com.android.dx.merge.SortableType r0 = new com.android.dx.merge.SortableType
            com.android.dex.Dex r1 = r4.getDex()
            com.android.dx.merge.IndexMap r2 = r4.getIndexMap()
            com.android.dex.ClassDef r4 = r4.getClassDef()
            com.android.dex.ClassDef r4 = r3.adjust(r4)
            r0.<init>(r1, r2, r4)
            return r0
    }

    public int adjustAnnotation(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int adjustAnnotationDirectory(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationDirectoryOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int adjustAnnotationSet(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationSetOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int adjustAnnotationSetRefList(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationSetRefListOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int adjustCallSite(int r2) {
            r1 = this;
            int[] r0 = r1.callSiteIds
            r2 = r0[r2]
            return r2
    }

    public int adjustEncodedArray(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.encodedArrayValueOffset
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public com.android.dex.EncodedValue adjustEncodedArray(com.android.dex.EncodedValue r5) {
            r4 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r1 = 32
            r0.<init>(r1)
            com.android.dx.merge.IndexMap$EncodedValueTransformer r1 = new com.android.dx.merge.IndexMap$EncodedValueTransformer
            r1.<init>(r4, r0)
            com.android.dex.EncodedValueReader r2 = new com.android.dex.EncodedValueReader
            r3 = 28
            r2.<init>(r5, r3)
            com.android.dx.merge.IndexMap.EncodedValueTransformer.access$000(r1, r2)
            com.android.dex.EncodedValue r5 = new com.android.dex.EncodedValue
            byte[] r0 = r0.toByteArray()
            r5.<init>(r0)
            return r5
    }

    public com.android.dex.EncodedValue adjustEncodedValue(com.android.dex.EncodedValue r4) {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r1 = 32
            r0.<init>(r1)
            com.android.dx.merge.IndexMap$EncodedValueTransformer r1 = new com.android.dx.merge.IndexMap$EncodedValueTransformer
            r1.<init>(r3, r0)
            com.android.dex.EncodedValueReader r2 = new com.android.dex.EncodedValueReader
            r2.<init>(r4)
            r1.transform(r2)
            com.android.dex.EncodedValue r4 = new com.android.dex.EncodedValue
            byte[] r0 = r0.toByteArray()
            r4.<init>(r0)
            return r4
    }

    public int adjustField(int r2) {
            r1 = this;
            short[] r0 = r1.fieldIds
            short r2 = r0[r2]
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    public int adjustMethod(int r2) {
            r1 = this;
            short[] r0 = r1.methodIds
            short r2 = r0[r2]
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    public int adjustMethodHandle(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.methodHandleIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public int adjustProto(int r2) {
            r1 = this;
            short[] r0 = r1.protoIds
            short r2 = r0[r2]
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    public int adjustString(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L4
            goto L8
        L4:
            int[] r0 = r1.stringIds
            r0 = r0[r2]
        L8:
            return r0
    }

    public int adjustType(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L4
            goto Lc
        L4:
            short[] r0 = r1.typeIds
            short r2 = r0[r2]
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
        Lc:
            return r0
    }

    public com.android.dex.TypeList adjustTypeList(com.android.dex.TypeList r3) {
            r2 = this;
            com.android.dex.TypeList r0 = com.android.dex.TypeList.EMPTY
            if (r3 != r0) goto L5
            return r3
        L5:
            short[] r3 = r3.getTypes()
            java.lang.Object r3 = r3.clone()
            short[] r3 = (short[]) r3
            r0 = 0
        L10:
            int r1 = r3.length
            if (r0 >= r1) goto L1f
            short r1 = r3[r0]
            int r1 = r2.adjustType(r1)
            short r1 = (short) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L10
        L1f:
            com.android.dex.TypeList r0 = new com.android.dex.TypeList
            com.android.dex.Dex r1 = r2.target
            r0.<init>(r1, r3)
            return r0
    }

    public int adjustTypeListOffset(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.typeListOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public void putAnnotationDirectoryOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationDirectoryOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void putAnnotationOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void putAnnotationSetOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationSetOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void putAnnotationSetRefListOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.annotationSetRefListOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void putEncodedArrayValueOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.encodedArrayValueOffset
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void putTypeListOffset(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L12
            if (r3 <= 0) goto L12
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.typeListOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }
}

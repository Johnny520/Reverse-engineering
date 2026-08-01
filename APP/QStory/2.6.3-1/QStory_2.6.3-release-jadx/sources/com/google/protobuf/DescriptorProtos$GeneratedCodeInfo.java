package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessage implements InterfaceC4312 {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private List<Annotation> annotation_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "GeneratedCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$GeneratedCodeInfo();
        PARSER = new C4315();
    }

    private DescriptorProtos$GeneratedCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11808;
    }

    public static C4116 newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$GeneratedCodeInfo)) {
            return super.equals(obj);
        }
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = (DescriptorProtos$GeneratedCodeInfo) obj;
        return getAnnotationList().equals(descriptorProtos$GeneratedCodeInfo.getAnnotationList()) && getUnknownFields().equals(descriptorProtos$GeneratedCodeInfo.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC4312
    public Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4312
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // com.google.protobuf.InterfaceC4312
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.InterfaceC4312
    public InterfaceC4316 getAnnotationOrBuilder(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4312
    public List<? extends InterfaceC4316> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11808;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int size = this.annotation_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.annotation_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8202 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getAnnotationCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getAnnotationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11807;
        c4451.m8386(DescriptorProtos$GeneratedCodeInfo.class, C4116.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4116 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4116(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4116 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4116() : new C4116().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.annotation_.size(); i++) {
            abstractC4294.mo8208(1, this.annotation_.get(i));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Annotation extends GeneratedMessage implements InterfaceC4316 {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static final InterfaceC4207 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SEMANTIC_FIELD_NUMBER = 5;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int begin_;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC4227 path_;
        private int semantic_;
        private volatile Object sourceFile_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Annotation");
            DEFAULT_INSTANCE = new Annotation();
            PARSER = new C4314();
        }

        private Annotation() {
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.sourceFile_ = "";
            this.begin_ = 0;
            this.end_ = 0;
            this.semantic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = GeneratedMessage.emptyIntList();
            this.sourceFile_ = "";
            this.semantic_ = 0;
        }

        public static /* synthetic */ int access$37276(Annotation annotation, int i) {
            int i2 = i | annotation.bitField0_;
            annotation.bitField0_ = i2;
            return i2;
        }

        public static Annotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11803;
        }

        public static C4115 newBuilder(Annotation annotation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) {
            return (Annotation) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Annotation)) {
                return super.equals(obj);
            }
            Annotation annotation = (Annotation) obj;
            if (!getPathList().equals(annotation.getPathList()) || hasSourceFile() != annotation.hasSourceFile()) {
                return false;
            }
            if ((hasSourceFile() && !getSourceFile().equals(annotation.getSourceFile())) || hasBegin() != annotation.hasBegin()) {
                return false;
            }
            if ((hasBegin() && getBegin() != annotation.getBegin()) || hasEnd() != annotation.hasEnd()) {
                return false;
            }
            if ((!hasEnd() || getEnd() == annotation.getEnd()) && hasSemantic() == annotation.hasSemantic()) {
                return (!hasSemantic() || this.semantic_ == annotation.semantic_) && getUnknownFields().equals(annotation.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public int getBegin() {
            return this.begin_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11803;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public InterfaceC4207 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public int getPath(int i) {
            return ((C4445) this.path_).m8373(i);
        }

        @Override // com.google.protobuf.InterfaceC4316
        public int getPathCount() {
            return ((C4445) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC4316
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public Semantic getSemantic() {
            Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
            return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public int getSerializedSize() {
            int iM8191;
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM8197 = 0;
            while (true) {
                if (i2 >= ((C4445) this.path_).f11597) {
                    break;
                }
                iM8197 += AbstractC4294.m8197(((C4445) r2).m8373(i2));
                i2++;
            }
            if (getPathList().isEmpty()) {
                iM8191 = iM8197;
            } else {
                iM8191 = AbstractC4294.m8197(iM8197) + iM8197 + 1;
            }
            this.pathMemoizedSerializedSize = iM8197;
            if ((this.bitField0_ & 1) != 0) {
                iM8191 += GeneratedMessage.computeStringSize(2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iM8191 += AbstractC4294.m8190(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM8191 += AbstractC4294.m8190(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM8191 += AbstractC4294.m8191(5, this.semantic_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8191;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public String getSourceFile() {
            Object obj = this.sourceFile_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sourceFile_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public ByteString getSourceFileBytes() {
            Object obj = this.sourceFile_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceFile_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public boolean hasSemantic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4316
        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (hasSourceFile()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getSourceFile().hashCode();
            }
            if (hasBegin()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getBegin();
            }
            if (hasEnd()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getEnd();
            }
            if (hasSemantic()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.semantic_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11804;
            c4451.m8386(Annotation.class, C4115.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365
        public C4115 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4115(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4115 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4115() : new C4115().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC4294.mo8204(10);
                abstractC4294.mo8204(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C4445 c4445 = (C4445) this.path_;
                if (i >= c4445.f11597) {
                    break;
                }
                abstractC4294.mo8209(c4445.m8373(i));
                i++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC4294, 2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8210(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC4294.mo8210(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC4294.mo8210(5, this.semantic_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4115 extends GeneratedMessage.AbstractC4137 implements InterfaceC4316 {
            private int begin_;
            private int bitField0_;
            private int end_;
            private InterfaceC4227 path_;
            private int semantic_;
            private Object sourceFile_;

            private C4115() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            private void buildPartial0(Annotation annotation) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC4380) this.path_).m8346();
                    annotation.path_ = this.path_;
                }
                if ((i2 & 2) != 0) {
                    annotation.sourceFile_ = this.sourceFile_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    annotation.begin_ = this.begin_;
                    i |= 2;
                }
                if ((i2 & 8) != 0) {
                    annotation.end_ = this.end_;
                    i |= 4;
                }
                if ((i2 & 16) != 0) {
                    annotation.semantic_ = this.semantic_;
                    i |= 8;
                }
                Annotation.access$37276(annotation, i);
            }

            private void ensurePathIsMutable() {
                InterfaceC4235 interfaceC4235 = this.path_;
                if (!((AbstractC4380) interfaceC4235).f11544) {
                    this.path_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
                }
                this.bitField0_ |= 1;
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11803;
            }

            public C4115 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC4362.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4115 addPath(int i) {
                ensurePathIsMutable();
                ((C4445) this.path_).m8371(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) annotationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(annotation);
                }
                onBuilt();
                return annotation;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4115 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.begin_ = 0;
                this.end_ = 0;
                this.semantic_ = 0;
                return this;
            }

            public C4115 clearBegin() {
                this.bitField0_ &= -5;
                this.begin_ = 0;
                onChanged();
                return this;
            }

            public C4115 clearEnd() {
                this.bitField0_ &= -9;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C4115 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C4115 clearSemantic() {
                this.bitField0_ &= -17;
                this.semantic_ = 0;
                onChanged();
                return this;
            }

            public C4115 clearSourceFile() {
                this.sourceFile_ = Annotation.getDefaultInstance().getSourceFile();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public int getBegin() {
                return this.begin_;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11803;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public int getPath(int i) {
                return ((C4445) this.path_).m8373(i);
            }

            @Override // com.google.protobuf.InterfaceC4316
            public int getPathCount() {
                return ((C4445) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC4316
            public List<Integer> getPathList() {
                ((AbstractC4380) this.path_).m8346();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public Semantic getSemantic() {
                Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
                return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public String getSourceFile() {
                Object obj = this.sourceFile_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sourceFile_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public ByteString getSourceFileBytes() {
                Object obj = this.sourceFile_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFile_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public boolean hasBegin() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public boolean hasEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public boolean hasSemantic() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4316
            public boolean hasSourceFile() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11804;
                c4451.m8386(Annotation.class, C4115.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4115 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    int iMo8276 = abstractC4306.mo8276();
                                    ensurePathIsMutable();
                                    ((C4445) this.path_).m8371(iMo8276);
                                } else if (iMo8264 == 10) {
                                    int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                                    ensurePathIsMutable();
                                    while (abstractC4306.mo8269() > 0) {
                                        ((C4445) this.path_).m8371(abstractC4306.mo8276());
                                    }
                                    abstractC4306.mo8285(iMo8286);
                                } else if (iMo8264 == 18) {
                                    this.sourceFile_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 24) {
                                    this.begin_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 4;
                                } else if (iMo8264 == 32) {
                                    this.end_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 8;
                                } else if (iMo8264 == 40) {
                                    int iMo8283 = abstractC4306.mo8283();
                                    if (Semantic.forNumber(iMo8283) == null) {
                                        mergeUnknownVarintField(5, iMo8283);
                                    } else {
                                        this.semantic_ = iMo8283;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }

            public C4115 setBegin(int i) {
                this.begin_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4115 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C4115 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C4445) this.path_).m8374(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4115 setSemantic(Semantic semantic) {
                semantic.getClass();
                this.bitField0_ |= 16;
                this.semantic_ = semantic.getNumber();
                onChanged();
                return this;
            }

            public C4115 setSourceFile(String str) {
                str.getClass();
                this.sourceFile_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4115 setSourceFileBytes(ByteString byteString) {
                byteString.getClass();
                this.sourceFile_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            private C4115(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4115 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof Annotation) {
                    return mergeFrom((Annotation) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C4115 mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (!annotation.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC4227 interfaceC4227 = annotation.path_;
                        this.path_ = interfaceC4227;
                        ((AbstractC4380) interfaceC4227).m8346();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C4445) this.path_).addAll(annotation.path_);
                    }
                    onChanged();
                }
                if (annotation.hasSourceFile()) {
                    this.sourceFile_ = annotation.sourceFile_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (annotation.hasBegin()) {
                    setBegin(annotation.getBegin());
                }
                if (annotation.hasEnd()) {
                    setEnd(annotation.getEnd());
                }
                if (annotation.hasSemantic()) {
                    setSemantic(annotation.getSemantic());
                }
                mergeUnknownFields(annotation.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Annotation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4115 newBuilderForType() {
            return newBuilder();
        }

        public static C4115 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (Annotation) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static Annotation parseFrom(ByteString byteString) {
            return (Annotation) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static Annotation parseFrom(ByteString byteString, C4529 c4529) {
            return (Annotation) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Semantic implements InterfaceC4213 {
            NONE(0),
            SET(1),
            ALIAS(2);

            public static final int ALIAS_VALUE = 2;
            public static final int NONE_VALUE = 0;
            public static final int SET_VALUE = 1;
            private static final Semantic[] VALUES;
            private static final InterfaceC4230 internalValueMap;
            private final int value;

            static {
                AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Semantic");
                internalValueMap = new C4317();
                VALUES = values();
            }

            Semantic(int i) {
                this.value = i;
            }

            public static Semantic forNumber(int i) {
                if (i == 0) {
                    return NONE;
                }
                if (i == 1) {
                    return SET;
                }
                if (i != 2) {
                    return null;
                }
                return ALIAS;
            }

            public static C4498 getDescriptor() {
                return Annotation.getDescriptor().f11722[0];
            }

            public static InterfaceC4230 internalGetValueMap() {
                return internalValueMap;
            }

            public static Semantic valueOf(C4496 c4496) {
                if (c4496.f11729 == getDescriptor()) {
                    return VALUES[c4496.f11730];
                }
                C6755.m11869("EnumValueDescriptor is not for this type.");
                return null;
            }

            public final C4498 getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC4231
            public final int getNumber() {
                return this.value;
            }

            public final C4496 getValueDescriptor() {
                C4498 descriptor = getDescriptor();
                return descriptor.f11739[ordinal()];
            }

            @Deprecated
            public static Semantic valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Annotation parseFrom(byte[] bArr) {
            return (Annotation) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static Annotation parseFrom(byte[] bArr, C4529 c4529) {
            return (Annotation) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static Annotation parseFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, C4529 c4529) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static Annotation parseFrom(AbstractC4306 abstractC4306) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        private Annotation(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.sourceFile_ = "";
            this.begin_ = 0;
            this.end_ = 0;
            this.semantic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Annotation parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4116 extends GeneratedMessage.AbstractC4137 implements InterfaceC4312 {
        private C4195 annotationBuilder_;
        private List<Annotation> annotation_;
        private int bitField0_;

        private C4116() {
            this.annotation_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                descriptorProtos$GeneratedCodeInfo.annotation_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
                this.bitField0_ &= -2;
            }
            descriptorProtos$GeneratedCodeInfo.annotation_ = this.annotation_;
        }

        private void ensureAnnotationIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.annotation_ = new ArrayList(this.annotation_);
                this.bitField0_ |= 1;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11808;
        }

        private C4195 internalGetAnnotationFieldBuilder() {
            if (this.annotationBuilder_ == null) {
                this.annotationBuilder_ = new C4195(this.annotation_, getParentForChildren(), isClean());
                this.annotation_ = null;
            }
            return this.annotationBuilder_;
        }

        public C4116 addAllAnnotation(Iterable<? extends Annotation> iterable) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureAnnotationIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.annotation_);
            onChanged();
            return this;
        }

        public C4116 addAnnotation(Annotation.C4115 c4115) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4115.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.add(c4115.build());
            onChanged();
            return this;
        }

        public Annotation.C4115 addAnnotationBuilder() {
            return (Annotation.C4115) internalGetAnnotationFieldBuilder().m8019(Annotation.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$GeneratedCodeInfo build() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$GeneratedCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$GeneratedCodeInfoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$GeneratedCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$GeneratedCodeInfo buildPartial() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$GeneratedCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$GeneratedCodeInfo);
            }
            onBuilt();
            return descriptorProtos$GeneratedCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4116 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 == null) {
                this.annotation_ = Collections.EMPTY_LIST;
            } else {
                this.annotation_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C4116 clearAnnotation() {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.annotation_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4312
        public Annotation getAnnotation(int i) {
            C4195 c4195 = this.annotationBuilder_;
            return c4195 == null ? this.annotation_.get(i) : (Annotation) c4195.m8025(i, false);
        }

        public Annotation.C4115 getAnnotationBuilder(int i) {
            return (Annotation.C4115) internalGetAnnotationFieldBuilder().m8032(i);
        }

        public List<Annotation.C4115> getAnnotationBuilderList() {
            return internalGetAnnotationFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4312
        public int getAnnotationCount() {
            C4195 c4195 = this.annotationBuilder_;
            return c4195 == null ? this.annotation_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4312
        public List<Annotation> getAnnotationList() {
            C4195 c4195 = this.annotationBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.annotation_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4312
        public InterfaceC4316 getAnnotationOrBuilder(int i) {
            C4195 c4195 = this.annotationBuilder_;
            return c4195 == null ? this.annotation_.get(i) : (InterfaceC4316) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4312
        public List<? extends InterfaceC4316> getAnnotationOrBuilderList() {
            C4195 c4195 = this.annotationBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.annotation_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11808;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11807;
            c4451.m8386(DescriptorProtos$GeneratedCodeInfo.class, C4116.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4116 mergeFrom(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
            if (descriptorProtos$GeneratedCodeInfo == DescriptorProtos$GeneratedCodeInfo.getDefaultInstance()) {
                return this;
            }
            if (this.annotationBuilder_ == null) {
                if (!descriptorProtos$GeneratedCodeInfo.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = descriptorProtos$GeneratedCodeInfo.annotation_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(descriptorProtos$GeneratedCodeInfo.annotation_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$GeneratedCodeInfo.annotation_.isEmpty()) {
                boolean zIsEmpty = this.annotationBuilder_.f11357.isEmpty();
                C4195 c4195 = this.annotationBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.annotationBuilder_ = null;
                    this.annotation_ = descriptorProtos$GeneratedCodeInfo.annotation_;
                    this.bitField0_ &= -2;
                    this.annotationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetAnnotationFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$GeneratedCodeInfo.annotation_);
                }
            }
            mergeUnknownFields(descriptorProtos$GeneratedCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C4116 removeAnnotation(int i) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
            onChanged();
            return this;
        }

        public C4116 setAnnotation(int i, Annotation.C4115 c4115) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4115.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.set(i, c4115.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$GeneratedCodeInfo.getDefaultInstance();
        }

        private C4116(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.annotation_ = Collections.EMPTY_LIST;
        }

        public Annotation.C4115 addAnnotationBuilder(int i) {
            return (Annotation.C4115) internalGetAnnotationFieldBuilder().m8020(i, Annotation.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        }

        public C4116 addAnnotation(int i, Annotation annotation) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(i, annotation);
                onChanged();
                return this;
            }
            c4195.m8018(i, annotation);
            return this;
        }

        public C4116 setAnnotation(int i, Annotation annotation) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.set(i, annotation);
                onChanged();
                return this;
            }
            c4195.m8022(i, annotation);
            return this;
        }

        public C4116 addAnnotation(Annotation annotation) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(annotation);
                onChanged();
                return this;
            }
            c4195.m8017(annotation);
            return this;
        }

        public C4116 addAnnotation(int i, Annotation.C4115 c4115) {
            C4195 c4195 = this.annotationBuilder_;
            if (c4195 == null) {
                ensureAnnotationIsMutable();
                this.annotation_.add(i, c4115.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4115.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4116 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$GeneratedCodeInfo) {
                return mergeFrom((DescriptorProtos$GeneratedCodeInfo) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4116 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 != 10) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                Annotation annotation = (Annotation) abstractC4306.mo8274(Annotation.parser(), c4529);
                                C4195 c4195 = this.annotationBuilder_;
                                if (c4195 == null) {
                                    ensureAnnotationIsMutable();
                                    this.annotation_.add(annotation);
                                } else {
                                    c4195.m8017(annotation);
                                }
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4116 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$GeneratedCodeInfo(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4116 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessage implements InterfaceC3480 {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private List<Annotation> annotation_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "GeneratedCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$GeneratedCodeInfo();
        PARSER = new C3483();
    }

    private DescriptorProtos$GeneratedCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11463;
    }

    public static C3284 newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3480
    public Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3480
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // com.google.protobuf.InterfaceC3480
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.InterfaceC3480
    public InterfaceC3484 getAnnotationOrBuilder(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3480
    public List<? extends InterfaceC3484> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11463;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int size = this.annotation_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.annotation_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7643 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getAnnotationCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getAnnotationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11462;
        c3619.m7827(DescriptorProtos$GeneratedCodeInfo.class, C3284.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

    @Override // com.google.protobuf.AbstractC3533
    public C3284 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3284(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3284 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3284() : new C3284().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.annotation_.size(); i++) {
            abstractC3462.mo7649(1, this.annotation_.get(i));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Annotation extends GeneratedMessage implements InterfaceC3484 {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static final InterfaceC3375 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SEMANTIC_FIELD_NUMBER = 5;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int begin_;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC3395 path_;
        private int semantic_;
        private volatile Object sourceFile_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Annotation");
            DEFAULT_INSTANCE = new Annotation();
            PARSER = new C3482();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11458;
        }

        public static C3283 newBuilder(Annotation annotation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) {
            return (Annotation) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.InterfaceC3484
        public int getBegin() {
            return this.begin_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11458;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public InterfaceC3375 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public int getPath(int i) {
            return ((C3613) this.path_).m7814(i);
        }

        @Override // com.google.protobuf.InterfaceC3484
        public int getPathCount() {
            return ((C3613) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC3484
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public Semantic getSemantic() {
            Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
            return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public int getSerializedSize() {
            int iM7632;
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM7638 = 0;
            while (true) {
                if (i2 >= ((C3613) this.path_).f11252) {
                    break;
                }
                iM7638 += AbstractC3462.m7638(((C3613) r2).m7814(i2));
                i2++;
            }
            if (getPathList().isEmpty()) {
                iM7632 = iM7638;
            } else {
                iM7632 = AbstractC3462.m7638(iM7638) + iM7638 + 1;
            }
            this.pathMemoizedSerializedSize = iM7638;
            if ((this.bitField0_ & 1) != 0) {
                iM7632 += GeneratedMessage.computeStringSize(2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iM7632 += AbstractC3462.m7631(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7632 += AbstractC3462.m7631(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7632 += AbstractC3462.m7632(5, this.semantic_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7632;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3484
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

        @Override // com.google.protobuf.InterfaceC3484
        public ByteString getSourceFileBytes() {
            Object obj = this.sourceFile_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceFile_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public boolean hasSemantic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3484
        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (hasSourceFile()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getSourceFile().hashCode();
            }
            if (hasBegin()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getBegin();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getEnd();
            }
            if (hasSemantic()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + this.semantic_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11459;
            c3619.m7827(Annotation.class, C3283.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

        @Override // com.google.protobuf.AbstractC3533
        public C3283 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3283(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3283 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3283() : new C3283().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC3462.mo7645(10);
                abstractC3462.mo7645(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C3613 c3613 = (C3613) this.path_;
                if (i >= c3613.f11252) {
                    break;
                }
                abstractC3462.mo7650(c3613.m7814(i));
                i++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3462, 2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7651(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3462.mo7651(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3462.mo7651(5, this.semantic_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3283 extends GeneratedMessage.AbstractC3305 implements InterfaceC3484 {
            private int begin_;
            private int bitField0_;
            private int end_;
            private InterfaceC3395 path_;
            private int semantic_;
            private Object sourceFile_;

            private C3283() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            private void buildPartial0(Annotation annotation) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC3548) this.path_).m7787();
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
                InterfaceC3403 interfaceC3403 = this.path_;
                if (!((AbstractC3548) interfaceC3403).f11199) {
                    this.path_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
                }
                this.bitField0_ |= 1;
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11458;
            }

            public C3283 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC3530.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3283 addPath(int i) {
                ensurePathIsMutable();
                ((C3613) this.path_).m7812(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) annotationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(annotation);
                }
                onBuilt();
                return annotation;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3283 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.begin_ = 0;
                this.end_ = 0;
                this.semantic_ = 0;
                return this;
            }

            public C3283 clearBegin() {
                this.bitField0_ &= -5;
                this.begin_ = 0;
                onChanged();
                return this;
            }

            public C3283 clearEnd() {
                this.bitField0_ &= -9;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3283 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C3283 clearSemantic() {
                this.bitField0_ &= -17;
                this.semantic_ = 0;
                onChanged();
                return this;
            }

            public C3283 clearSourceFile() {
                this.sourceFile_ = Annotation.getDefaultInstance().getSourceFile();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public int getBegin() {
                return this.begin_;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11458;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public int getPath(int i) {
                return ((C3613) this.path_).m7814(i);
            }

            @Override // com.google.protobuf.InterfaceC3484
            public int getPathCount() {
                return ((C3613) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC3484
            public List<Integer> getPathList() {
                ((AbstractC3548) this.path_).m7787();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public Semantic getSemantic() {
                Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
                return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3484
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

            @Override // com.google.protobuf.InterfaceC3484
            public ByteString getSourceFileBytes() {
                Object obj = this.sourceFile_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFile_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public boolean hasBegin() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public boolean hasEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public boolean hasSemantic() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3484
            public boolean hasSourceFile() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11459;
                c3619.m7827(Annotation.class, C3283.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3283 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    int iMo7717 = abstractC3474.mo7717();
                                    ensurePathIsMutable();
                                    ((C3613) this.path_).m7812(iMo7717);
                                } else if (iMo7705 == 10) {
                                    int iMo7727 = abstractC3474.mo7727(abstractC3474.mo7701());
                                    ensurePathIsMutable();
                                    while (abstractC3474.mo7710() > 0) {
                                        ((C3613) this.path_).m7812(abstractC3474.mo7717());
                                    }
                                    abstractC3474.mo7726(iMo7727);
                                } else if (iMo7705 == 18) {
                                    this.sourceFile_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 24) {
                                    this.begin_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 4;
                                } else if (iMo7705 == 32) {
                                    this.end_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 8;
                                } else if (iMo7705 == 40) {
                                    int iMo7724 = abstractC3474.mo7724();
                                    if (Semantic.forNumber(iMo7724) == null) {
                                        mergeUnknownVarintField(5, iMo7724);
                                    } else {
                                        this.semantic_ = iMo7724;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

            public C3283 setBegin(int i) {
                this.begin_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3283 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3283 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C3613) this.path_).m7815(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3283 setSemantic(Semantic semantic) {
                semantic.getClass();
                this.bitField0_ |= 16;
                this.semantic_ = semantic.getNumber();
                onChanged();
                return this;
            }

            public C3283 setSourceFile(String str) {
                str.getClass();
                this.sourceFile_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3283 setSourceFileBytes(ByteString byteString) {
                byteString.getClass();
                this.sourceFile_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            private C3283(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3283 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof Annotation) {
                    return mergeFrom((Annotation) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3283 mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (!annotation.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC3395 interfaceC3395 = annotation.path_;
                        this.path_ = interfaceC3395;
                        ((AbstractC3548) interfaceC3395).m7787();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C3613) this.path_).addAll(annotation.path_);
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Annotation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3283 newBuilderForType() {
            return newBuilder();
        }

        public static C3283 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (Annotation) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static Annotation parseFrom(ByteString byteString) {
            return (Annotation) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static Annotation parseFrom(ByteString byteString, C3697 c3697) {
            return (Annotation) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Semantic implements InterfaceC3381 {
            NONE(0),
            SET(1),
            ALIAS(2);

            public static final int ALIAS_VALUE = 2;
            public static final int NONE_VALUE = 0;
            public static final int SET_VALUE = 1;
            private static final Semantic[] VALUES;
            private static final InterfaceC3398 internalValueMap;
            private final int value;

            static {
                AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Semantic");
                internalValueMap = new C3485();
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

            public static C3666 getDescriptor() {
                return Annotation.getDescriptor().f11377[0];
            }

            public static InterfaceC3398 internalGetValueMap() {
                return internalValueMap;
            }

            public static Semantic valueOf(C3664 c3664) {
                if (c3664.f11384 == getDescriptor()) {
                    return VALUES[c3664.f11385];
                }
                C5925.m11310("EnumValueDescriptor is not for this type.");
                return null;
            }

            public final C3666 getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC3399
            public final int getNumber() {
                return this.value;
            }

            public final C3664 getValueDescriptor() {
                C3666 descriptor = getDescriptor();
                return descriptor.f11394[ordinal()];
            }

            @Deprecated
            public static Semantic valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Annotation parseFrom(byte[] bArr) {
            return (Annotation) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static Annotation parseFrom(byte[] bArr, C3697 c3697) {
            return (Annotation) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static Annotation parseFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, C3697 c3697) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static Annotation parseFrom(AbstractC3474 abstractC3474) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        private Annotation(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.sourceFile_ = "";
            this.begin_ = 0;
            this.end_ = 0;
            this.semantic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Annotation parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3284 extends GeneratedMessage.AbstractC3305 implements InterfaceC3480 {
        private C3363 annotationBuilder_;
        private List<Annotation> annotation_;
        private int bitField0_;

        private C3284() {
            this.annotation_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                descriptorProtos$GeneratedCodeInfo.annotation_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11463;
        }

        private C3363 internalGetAnnotationFieldBuilder() {
            if (this.annotationBuilder_ == null) {
                this.annotationBuilder_ = new C3363(this.annotation_, getParentForChildren(), isClean());
                this.annotation_ = null;
            }
            return this.annotationBuilder_;
        }

        public C3284 addAllAnnotation(Iterable<? extends Annotation> iterable) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureAnnotationIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.annotation_);
            onChanged();
            return this;
        }

        public C3284 addAnnotation(Annotation.C3283 c3283) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3283.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.add(c3283.build());
            onChanged();
            return this;
        }

        public Annotation.C3283 addAnnotationBuilder() {
            return (Annotation.C3283) internalGetAnnotationFieldBuilder().m7460(Annotation.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$GeneratedCodeInfo build() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$GeneratedCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$GeneratedCodeInfoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$GeneratedCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$GeneratedCodeInfo buildPartial() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$GeneratedCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$GeneratedCodeInfo);
            }
            onBuilt();
            return descriptorProtos$GeneratedCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3284 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 == null) {
                this.annotation_ = Collections.EMPTY_LIST;
            } else {
                this.annotation_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C3284 clearAnnotation() {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.annotation_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3480
        public Annotation getAnnotation(int i) {
            C3363 c3363 = this.annotationBuilder_;
            return c3363 == null ? this.annotation_.get(i) : (Annotation) c3363.m7466(i, false);
        }

        public Annotation.C3283 getAnnotationBuilder(int i) {
            return (Annotation.C3283) internalGetAnnotationFieldBuilder().m7473(i);
        }

        public List<Annotation.C3283> getAnnotationBuilderList() {
            return internalGetAnnotationFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3480
        public int getAnnotationCount() {
            C3363 c3363 = this.annotationBuilder_;
            return c3363 == null ? this.annotation_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3480
        public List<Annotation> getAnnotationList() {
            C3363 c3363 = this.annotationBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.annotation_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3480
        public InterfaceC3484 getAnnotationOrBuilder(int i) {
            C3363 c3363 = this.annotationBuilder_;
            return c3363 == null ? this.annotation_.get(i) : (InterfaceC3484) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3480
        public List<? extends InterfaceC3484> getAnnotationOrBuilderList() {
            C3363 c3363 = this.annotationBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.annotation_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11463;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11462;
            c3619.m7827(DescriptorProtos$GeneratedCodeInfo.class, C3284.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3284 mergeFrom(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
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
                boolean zIsEmpty = this.annotationBuilder_.f11012.isEmpty();
                C3363 c3363 = this.annotationBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.annotationBuilder_ = null;
                    this.annotation_ = descriptorProtos$GeneratedCodeInfo.annotation_;
                    this.bitField0_ &= -2;
                    this.annotationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetAnnotationFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$GeneratedCodeInfo.annotation_);
                }
            }
            mergeUnknownFields(descriptorProtos$GeneratedCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C3284 removeAnnotation(int i) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
            onChanged();
            return this;
        }

        public C3284 setAnnotation(int i, Annotation.C3283 c3283) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3283.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.set(i, c3283.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$GeneratedCodeInfo.getDefaultInstance();
        }

        private C3284(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.annotation_ = Collections.EMPTY_LIST;
        }

        public Annotation.C3283 addAnnotationBuilder(int i) {
            return (Annotation.C3283) internalGetAnnotationFieldBuilder().m7461(i, Annotation.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        }

        public C3284 addAnnotation(int i, Annotation annotation) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(i, annotation);
                onChanged();
                return this;
            }
            c3363.m7459(i, annotation);
            return this;
        }

        public C3284 setAnnotation(int i, Annotation annotation) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.set(i, annotation);
                onChanged();
                return this;
            }
            c3363.m7463(i, annotation);
            return this;
        }

        public C3284 addAnnotation(Annotation annotation) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(annotation);
                onChanged();
                return this;
            }
            c3363.m7458(annotation);
            return this;
        }

        public C3284 addAnnotation(int i, Annotation.C3283 c3283) {
            C3363 c3363 = this.annotationBuilder_;
            if (c3363 == null) {
                ensureAnnotationIsMutable();
                this.annotation_.add(i, c3283.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3283.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3284 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$GeneratedCodeInfo) {
                return mergeFrom((DescriptorProtos$GeneratedCodeInfo) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3284 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 != 10) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                Annotation annotation = (Annotation) abstractC3474.mo7715(Annotation.parser(), c3697);
                                C3363 c3363 = this.annotationBuilder_;
                                if (c3363 == null) {
                                    ensureAnnotationIsMutable();
                                    this.annotation_.add(annotation);
                                } else {
                                    c3363.m7458(annotation);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3284 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$GeneratedCodeInfo(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3284 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

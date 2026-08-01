package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessage implements InterfaceC3479 {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private List<Annotation> annotation_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "GeneratedCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$GeneratedCodeInfo();
        PARSER = new C3482();
    }

    private DescriptorProtos$GeneratedCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11458;
    }

    public static C3283 newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3479
    public Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3479
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // com.google.protobuf.InterfaceC3479
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.InterfaceC3479
    public InterfaceC3483 getAnnotationOrBuilder(int i) {
        return this.annotation_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3479
    public List<? extends InterfaceC3483> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11458;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int size = this.annotation_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.annotation_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7656 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getAnnotationCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getAnnotationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11457;
        c3618.m7840(DescriptorProtos$GeneratedCodeInfo.class, C3283.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3283 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3283(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3283 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3283() : new C3283().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        for (int i = 0; i < this.annotation_.size(); i++) {
            abstractC3461.mo7662(1, this.annotation_.get(i));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Annotation extends GeneratedMessage implements InterfaceC3483 {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static final InterfaceC3374 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SEMANTIC_FIELD_NUMBER = 5;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int begin_;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC3394 path_;
        private int semantic_;
        private volatile Object sourceFile_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Annotation");
            DEFAULT_INSTANCE = new Annotation();
            PARSER = new C3481();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11453;
        }

        public static C3282 newBuilder(Annotation annotation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) {
            return (Annotation) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.InterfaceC3483
        public int getBegin() {
            return this.begin_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11453;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public InterfaceC3374 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public int getPath(int i) {
            return ((C3612) this.path_).m7827(i);
        }

        @Override // com.google.protobuf.InterfaceC3483
        public int getPathCount() {
            return ((C3612) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC3483
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public Semantic getSemantic() {
            Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
            return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public int getSerializedSize() {
            int iM7645;
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM7651 = 0;
            while (true) {
                if (i2 >= ((C3612) this.path_).f11247) {
                    break;
                }
                iM7651 += AbstractC3461.m7651(((C3612) r2).m7827(i2));
                i2++;
            }
            if (getPathList().isEmpty()) {
                iM7645 = iM7651;
            } else {
                iM7645 = AbstractC3461.m7651(iM7651) + iM7651 + 1;
            }
            this.pathMemoizedSerializedSize = iM7651;
            if ((this.bitField0_ & 1) != 0) {
                iM7645 += GeneratedMessage.computeStringSize(2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iM7645 += AbstractC3461.m7644(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7645 += AbstractC3461.m7644(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7645 += AbstractC3461.m7645(5, this.semantic_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7645;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3483
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

        @Override // com.google.protobuf.InterfaceC3483
        public ByteString getSourceFileBytes() {
            Object obj = this.sourceFile_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceFile_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public boolean hasSemantic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3483
        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (hasSourceFile()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getSourceFile().hashCode();
            }
            if (hasBegin()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getBegin();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getEnd();
            }
            if (hasSemantic()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + this.semantic_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11454;
            c3618.m7840(Annotation.class, C3282.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        @Override // com.google.protobuf.AbstractC3532
        public C3282 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3282(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3282 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3282() : new C3282().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC3461.mo7658(10);
                abstractC3461.mo7658(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C3612 c3612 = (C3612) this.path_;
                if (i >= c3612.f11247) {
                    break;
                }
                abstractC3461.mo7663(c3612.m7827(i));
                i++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3461, 2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7664(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3461.mo7664(4, this.end_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3461.mo7664(5, this.semantic_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3282 extends GeneratedMessage.AbstractC3304 implements InterfaceC3483 {
            private int begin_;
            private int bitField0_;
            private int end_;
            private InterfaceC3394 path_;
            private int semantic_;
            private Object sourceFile_;

            private C3282() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            private void buildPartial0(Annotation annotation) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC3547) this.path_).m7800();
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
                InterfaceC3402 interfaceC3402 = this.path_;
                if (!((AbstractC3547) interfaceC3402).f11194) {
                    this.path_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
                }
                this.bitField0_ |= 1;
            }

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11453;
            }

            public C3282 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC3529.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3282 addPath(int i) {
                ensurePathIsMutable();
                ((C3612) this.path_).m7825(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) annotationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(annotation);
                }
                onBuilt();
                return annotation;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3282 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.begin_ = 0;
                this.end_ = 0;
                this.semantic_ = 0;
                return this;
            }

            public C3282 clearBegin() {
                this.bitField0_ &= -5;
                this.begin_ = 0;
                onChanged();
                return this;
            }

            public C3282 clearEnd() {
                this.bitField0_ &= -9;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3282 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C3282 clearSemantic() {
                this.bitField0_ &= -17;
                this.semantic_ = 0;
                onChanged();
                return this;
            }

            public C3282 clearSourceFile() {
                this.sourceFile_ = Annotation.getDefaultInstance().getSourceFile();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public int getBegin() {
                return this.begin_;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11453;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public int getPath(int i) {
                return ((C3612) this.path_).m7827(i);
            }

            @Override // com.google.protobuf.InterfaceC3483
            public int getPathCount() {
                return ((C3612) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC3483
            public List<Integer> getPathList() {
                ((AbstractC3547) this.path_).m7800();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public Semantic getSemantic() {
                Semantic semanticForNumber = Semantic.forNumber(this.semantic_);
                return semanticForNumber == null ? Semantic.NONE : semanticForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3483
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

            @Override // com.google.protobuf.InterfaceC3483
            public ByteString getSourceFileBytes() {
                Object obj = this.sourceFile_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFile_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public boolean hasBegin() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public boolean hasEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public boolean hasSemantic() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3483
            public boolean hasSourceFile() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11454;
                c3618.m7840(Annotation.class, C3282.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3282 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    int iMo7730 = abstractC3473.mo7730();
                                    ensurePathIsMutable();
                                    ((C3612) this.path_).m7825(iMo7730);
                                } else if (iMo7718 == 10) {
                                    int iMo7740 = abstractC3473.mo7740(abstractC3473.mo7714());
                                    ensurePathIsMutable();
                                    while (abstractC3473.mo7723() > 0) {
                                        ((C3612) this.path_).m7825(abstractC3473.mo7730());
                                    }
                                    abstractC3473.mo7739(iMo7740);
                                } else if (iMo7718 == 18) {
                                    this.sourceFile_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 24) {
                                    this.begin_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 4;
                                } else if (iMo7718 == 32) {
                                    this.end_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 8;
                                } else if (iMo7718 == 40) {
                                    int iMo7737 = abstractC3473.mo7737();
                                    if (Semantic.forNumber(iMo7737) == null) {
                                        mergeUnknownVarintField(5, iMo7737);
                                    } else {
                                        this.semantic_ = iMo7737;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

            public C3282 setBegin(int i) {
                this.begin_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3282 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3282 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C3612) this.path_).m7828(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3282 setSemantic(Semantic semantic) {
                semantic.getClass();
                this.bitField0_ |= 16;
                this.semantic_ = semantic.getNumber();
                onChanged();
                return this;
            }

            public C3282 setSourceFile(String str) {
                str.getClass();
                this.sourceFile_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3282 setSourceFileBytes(ByteString byteString) {
                byteString.getClass();
                this.sourceFile_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            private C3282(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.path_ = GeneratedMessage.emptyIntList();
                this.sourceFile_ = "";
                this.semantic_ = 0;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3282 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof Annotation) {
                    return mergeFrom((Annotation) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3282 mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (!annotation.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC3394 interfaceC3394 = annotation.path_;
                        this.path_ = interfaceC3394;
                        ((AbstractC3547) interfaceC3394).m7800();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C3612) this.path_).addAll(annotation.path_);
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Annotation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (Annotation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3282 newBuilderForType() {
            return newBuilder();
        }

        public static C3282 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (Annotation) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static Annotation parseFrom(ByteString byteString) {
            return (Annotation) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static Annotation parseFrom(ByteString byteString, C3696 c3696) {
            return (Annotation) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum Semantic implements InterfaceC3380 {
            NONE(0),
            SET(1),
            ALIAS(2);

            public static final int ALIAS_VALUE = 2;
            public static final int NONE_VALUE = 0;
            public static final int SET_VALUE = 1;
            private static final Semantic[] VALUES;
            private static final InterfaceC3397 internalValueMap;
            private final int value;

            static {
                AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Semantic");
                internalValueMap = new C3484();
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

            public static C3665 getDescriptor() {
                return Annotation.getDescriptor().f11372[0];
            }

            public static InterfaceC3397 internalGetValueMap() {
                return internalValueMap;
            }

            public static Semantic valueOf(C3663 c3663) {
                if (c3663.f11379 == getDescriptor()) {
                    return VALUES[c3663.f11380];
                }
                C5919.m11249("EnumValueDescriptor is not for this type.");
                return null;
            }

            public final C3665 getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC3398
            public final int getNumber() {
                return this.value;
            }

            public final C3663 getValueDescriptor() {
                C3665 descriptor = getDescriptor();
                return descriptor.f11389[ordinal()];
            }

            @Deprecated
            public static Semantic valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Annotation parseFrom(byte[] bArr) {
            return (Annotation) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static Annotation parseFrom(byte[] bArr, C3696 c3696) {
            return (Annotation) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static Annotation parseFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, C3696 c3696) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static Annotation parseFrom(AbstractC3473 abstractC3473) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        private Annotation(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.sourceFile_ = "";
            this.begin_ = 0;
            this.end_ = 0;
            this.semantic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Annotation parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (Annotation) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3283 extends GeneratedMessage.AbstractC3304 implements InterfaceC3479 {
        private C3362 annotationBuilder_;
        private List<Annotation> annotation_;
        private int bitField0_;

        private C3283() {
            this.annotation_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                descriptorProtos$GeneratedCodeInfo.annotation_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11458;
        }

        private C3362 internalGetAnnotationFieldBuilder() {
            if (this.annotationBuilder_ == null) {
                this.annotationBuilder_ = new C3362(this.annotation_, getParentForChildren(), isClean());
                this.annotation_ = null;
            }
            return this.annotationBuilder_;
        }

        public C3283 addAllAnnotation(Iterable<? extends Annotation> iterable) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureAnnotationIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.annotation_);
            onChanged();
            return this;
        }

        public C3283 addAnnotation(Annotation.C3282 c3282) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3282.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.add(c3282.build());
            onChanged();
            return this;
        }

        public Annotation.C3282 addAnnotationBuilder() {
            return (Annotation.C3282) internalGetAnnotationFieldBuilder().m7473(Annotation.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$GeneratedCodeInfo build() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$GeneratedCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$GeneratedCodeInfoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$GeneratedCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$GeneratedCodeInfo buildPartial() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$GeneratedCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$GeneratedCodeInfo);
            }
            onBuilt();
            return descriptorProtos$GeneratedCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3283 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 == null) {
                this.annotation_ = Collections.EMPTY_LIST;
            } else {
                this.annotation_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C3283 clearAnnotation() {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.annotation_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3479
        public Annotation getAnnotation(int i) {
            C3362 c3362 = this.annotationBuilder_;
            return c3362 == null ? this.annotation_.get(i) : (Annotation) c3362.m7479(i, false);
        }

        public Annotation.C3282 getAnnotationBuilder(int i) {
            return (Annotation.C3282) internalGetAnnotationFieldBuilder().m7486(i);
        }

        public List<Annotation.C3282> getAnnotationBuilderList() {
            return internalGetAnnotationFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3479
        public int getAnnotationCount() {
            C3362 c3362 = this.annotationBuilder_;
            return c3362 == null ? this.annotation_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3479
        public List<Annotation> getAnnotationList() {
            C3362 c3362 = this.annotationBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.annotation_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3479
        public InterfaceC3483 getAnnotationOrBuilder(int i) {
            C3362 c3362 = this.annotationBuilder_;
            return c3362 == null ? this.annotation_.get(i) : (InterfaceC3483) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3479
        public List<? extends InterfaceC3483> getAnnotationOrBuilderList() {
            C3362 c3362 = this.annotationBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.annotation_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11458;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11457;
            c3618.m7840(DescriptorProtos$GeneratedCodeInfo.class, C3283.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3283 mergeFrom(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
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
                boolean zIsEmpty = this.annotationBuilder_.f11007.isEmpty();
                C3362 c3362 = this.annotationBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.annotationBuilder_ = null;
                    this.annotation_ = descriptorProtos$GeneratedCodeInfo.annotation_;
                    this.bitField0_ &= -2;
                    this.annotationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetAnnotationFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$GeneratedCodeInfo.annotation_);
                }
            }
            mergeUnknownFields(descriptorProtos$GeneratedCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C3283 removeAnnotation(int i) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
            onChanged();
            return this;
        }

        public C3283 setAnnotation(int i, Annotation.C3282 c3282) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3282.build());
                return this;
            }
            ensureAnnotationIsMutable();
            this.annotation_.set(i, c3282.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$GeneratedCodeInfo.getDefaultInstance();
        }

        private C3283(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.annotation_ = Collections.EMPTY_LIST;
        }

        public Annotation.C3282 addAnnotationBuilder(int i) {
            return (Annotation.C3282) internalGetAnnotationFieldBuilder().m7474(i, Annotation.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        }

        public C3283 addAnnotation(int i, Annotation annotation) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(i, annotation);
                onChanged();
                return this;
            }
            c3362.m7472(i, annotation);
            return this;
        }

        public C3283 setAnnotation(int i, Annotation annotation) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.set(i, annotation);
                onChanged();
                return this;
            }
            c3362.m7476(i, annotation);
            return this;
        }

        public C3283 addAnnotation(Annotation annotation) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 == null) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(annotation);
                onChanged();
                return this;
            }
            c3362.m7471(annotation);
            return this;
        }

        public C3283 addAnnotation(int i, Annotation.C3282 c3282) {
            C3362 c3362 = this.annotationBuilder_;
            if (c3362 == null) {
                ensureAnnotationIsMutable();
                this.annotation_.add(i, c3282.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3282.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3283 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$GeneratedCodeInfo) {
                return mergeFrom((DescriptorProtos$GeneratedCodeInfo) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3283 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 != 10) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                Annotation annotation = (Annotation) abstractC3473.mo7728(Annotation.parser(), c3696);
                                C3362 c3362 = this.annotationBuilder_;
                                if (c3362 == null) {
                                    ensureAnnotationIsMutable();
                                    this.annotation_.add(annotation);
                                } else {
                                    c3362.m7471(annotation);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3283 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$GeneratedCodeInfo(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3283 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

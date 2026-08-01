package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMask extends GeneratedMessage implements InterfaceC3686 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int PATHS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private C3384 paths_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldMask");
        DEFAULT_INSTANCE = new FieldMask();
        PARSER = new C3687();
    }

    private FieldMask(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.paths_ = C3384.f11037;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3689.f11489;
    }

    public static C3302 newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldMask)) {
            return super.equals(obj);
        }
        FieldMask fieldMask = (FieldMask) obj;
        return getPathsList().equals(fieldMask.getPathsList()) && getUnknownFields().equals(fieldMask.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3689.f11489;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3686
    public String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3686
    public ByteString getPathsBytes(int i) {
        return this.paths_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3686
    public int getPathsCount() {
        return this.paths_.f11038.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.paths_.f11038.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.paths_.f11038.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPathsList().size() + iComputeStringSizeNoTag;
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
        if (getPathsCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getPathsList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3689.f11488;
        c3619.m7827(FieldMask.class, C3302.class);
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
    public C3302 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3302(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3302 toBuilder() {
        C3687 c3687 = null;
        return this == DEFAULT_INSTANCE ? new C3302(c3687) : new C3302(c3687).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.paths_.f11038.size(); i++) {
            GeneratedMessage.writeString(abstractC3462, 1, this.paths_.f11038.get(i));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldMask$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3302 extends GeneratedMessage.AbstractC3305 implements InterfaceC3686 {
        private int bitField0_;
        private C3384 paths_;

        private C3302() {
            this.paths_ = C3384.f11037;
        }

        private void buildPartial0(FieldMask fieldMask) {
            if ((this.bitField0_ & 1) != 0) {
                this.paths_.m7787();
                fieldMask.paths_ = this.paths_;
            }
        }

        private void ensurePathsIsMutable() {
            if (!this.paths_.f11199) {
                this.paths_ = new C3384(this.paths_);
            }
            this.bitField0_ |= 1;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3689.f11489;
        }

        public C3302 addAllPaths(Iterable<String> iterable) {
            ensurePathsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.paths_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3302 addPaths(String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.m7493(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3302 addPathsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            ensurePathsIsMutable();
            this.paths_.mo7495(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public FieldMask build() {
            FieldMask fieldMaskBuildPartial = buildPartial();
            if (fieldMaskBuildPartial.isInitialized()) {
                return fieldMaskBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) fieldMaskBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public FieldMask buildPartial() {
            FieldMask fieldMask = new FieldMask(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(fieldMask);
            }
            onBuilt();
            return fieldMask;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3302 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.paths_ = C3384.f11037;
            return this;
        }

        public C3302 clearPaths() {
            this.paths_ = C3384.f11037;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3689.f11489;
        }

        @Override // com.google.protobuf.InterfaceC3686
        public String getPaths(int i) {
            return this.paths_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3686
        public ByteString getPathsBytes(int i) {
            return this.paths_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3686
        public int getPathsCount() {
            return this.paths_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3686
        public InterfaceC3377 getPathsList() {
            this.paths_.m7787();
            return this.paths_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3689.f11488;
            c3619.m7827(FieldMask.class, C3302.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3302 mergeFrom(FieldMask fieldMask) {
            if (fieldMask == FieldMask.getDefaultInstance()) {
                return this;
            }
            if (!fieldMask.paths_.isEmpty()) {
                if (this.paths_.isEmpty()) {
                    this.paths_ = fieldMask.paths_;
                    this.bitField0_ |= 1;
                } else {
                    ensurePathsIsMutable();
                    this.paths_.addAll(fieldMask.paths_);
                }
                onChanged();
            }
            mergeUnknownFields(fieldMask.getUnknownFields());
            onChanged();
            return this;
        }

        public C3302 setPaths(int i, String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public FieldMask getDefaultInstanceForType() {
            return FieldMask.getDefaultInstance();
        }

        public /* synthetic */ C3302(C3687 c3687) {
            this();
        }

        public /* synthetic */ C3302(InterfaceC3532 interfaceC3532, C3687 c3687) {
            this(interfaceC3532);
        }

        private C3302(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.paths_ = C3384.f11037;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3302 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof FieldMask) {
                return mergeFrom((FieldMask) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3302 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                                ensurePathsIsMutable();
                                this.paths_.m7493(abstractC3474.mo7706());
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

    @Override // com.google.protobuf.InterfaceC3686
    public InterfaceC3377 getPathsList() {
        return this.paths_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public FieldMask getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3302 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FieldMask(GeneratedMessage.AbstractC3305 abstractC3305, C3687 c3687) {
        this(abstractC3305);
    }

    public static C3302 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private FieldMask() {
        C3384 c3384 = C3384.f11037;
        this.memoizedIsInitialized = (byte) -1;
        this.paths_ = c3384;
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (FieldMask) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static FieldMask parseFrom(ByteString byteString) {
        return (FieldMask) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static FieldMask parseFrom(ByteString byteString, C3697 c3697) {
        return (FieldMask) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static FieldMask parseFrom(byte[] bArr) {
        return (FieldMask) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static FieldMask parseFrom(byte[] bArr, C3697 c3697) {
        return (FieldMask) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, C3697 c3697) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static FieldMask parseFrom(AbstractC3474 abstractC3474) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static FieldMask parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

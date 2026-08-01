package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMask extends GeneratedMessage implements InterfaceC4518 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int PATHS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private C4216 paths_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldMask");
        DEFAULT_INSTANCE = new FieldMask();
        PARSER = new C4519();
    }

    private FieldMask(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.paths_ = C4216.f11382;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4521.f11834;
    }

    public static C4134 newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4521.f11834;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4518
    public String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4518
    public ByteString getPathsBytes(int i) {
        return this.paths_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4518
    public int getPathsCount() {
        return this.paths_.f11383.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.paths_.f11383.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.paths_.f11383.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPathsList().size() + iComputeStringSizeNoTag;
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
        if (getPathsCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getPathsList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4521.f11833;
        c4451.m8386(FieldMask.class, C4134.class);
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
    public C4134 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4134(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4134 toBuilder() {
        C4519 c4519 = null;
        return this == DEFAULT_INSTANCE ? new C4134(c4519) : new C4134(c4519).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.paths_.f11383.size(); i++) {
            GeneratedMessage.writeString(abstractC4294, 1, this.paths_.f11383.get(i));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldMask$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4134 extends GeneratedMessage.AbstractC4137 implements InterfaceC4518 {
        private int bitField0_;
        private C4216 paths_;

        private C4134() {
            this.paths_ = C4216.f11382;
        }

        private void buildPartial0(FieldMask fieldMask) {
            if ((this.bitField0_ & 1) != 0) {
                this.paths_.m8346();
                fieldMask.paths_ = this.paths_;
            }
        }

        private void ensurePathsIsMutable() {
            if (!this.paths_.f11544) {
                this.paths_ = new C4216(this.paths_);
            }
            this.bitField0_ |= 1;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4521.f11834;
        }

        public C4134 addAllPaths(Iterable<String> iterable) {
            ensurePathsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.paths_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4134 addPaths(String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.m8052(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4134 addPathsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            ensurePathsIsMutable();
            this.paths_.mo8054(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public FieldMask build() {
            FieldMask fieldMaskBuildPartial = buildPartial();
            if (fieldMaskBuildPartial.isInitialized()) {
                return fieldMaskBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) fieldMaskBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public FieldMask buildPartial() {
            FieldMask fieldMask = new FieldMask(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(fieldMask);
            }
            onBuilt();
            return fieldMask;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4134 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.paths_ = C4216.f11382;
            return this;
        }

        public C4134 clearPaths() {
            this.paths_ = C4216.f11382;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4521.f11834;
        }

        @Override // com.google.protobuf.InterfaceC4518
        public String getPaths(int i) {
            return this.paths_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4518
        public ByteString getPathsBytes(int i) {
            return this.paths_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4518
        public int getPathsCount() {
            return this.paths_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4518
        public InterfaceC4209 getPathsList() {
            this.paths_.m8346();
            return this.paths_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4521.f11833;
            c4451.m8386(FieldMask.class, C4134.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4134 mergeFrom(FieldMask fieldMask) {
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

        public C4134 setPaths(int i, String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public FieldMask getDefaultInstanceForType() {
            return FieldMask.getDefaultInstance();
        }

        public /* synthetic */ C4134(C4519 c4519) {
            this();
        }

        public /* synthetic */ C4134(InterfaceC4364 interfaceC4364, C4519 c4519) {
            this(interfaceC4364);
        }

        private C4134(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.paths_ = C4216.f11382;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4134 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof FieldMask) {
                return mergeFrom((FieldMask) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4134 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                ensurePathsIsMutable();
                                this.paths_.m8052(abstractC4306.mo8265());
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

    @Override // com.google.protobuf.InterfaceC4518
    public InterfaceC4209 getPathsList() {
        return this.paths_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public FieldMask getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4134 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FieldMask(GeneratedMessage.AbstractC4137 abstractC4137, C4519 c4519) {
        this(abstractC4137);
    }

    public static C4134 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private FieldMask() {
        C4216 c4216 = C4216.f11382;
        this.memoizedIsInitialized = (byte) -1;
        this.paths_ = c4216;
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (FieldMask) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static FieldMask parseFrom(ByteString byteString) {
        return (FieldMask) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static FieldMask parseFrom(ByteString byteString, C4529 c4529) {
        return (FieldMask) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static FieldMask parseFrom(byte[] bArr) {
        return (FieldMask) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static FieldMask parseFrom(byte[] bArr, C4529 c4529) {
        return (FieldMask) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, C4529 c4529) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static FieldMask parseFrom(AbstractC4306 abstractC4306) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static FieldMask parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

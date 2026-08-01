package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessage implements InterfaceC3488 {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$OneofOptions options_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "OneofDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$OneofDescriptorProto();
        PARSER = new C3487();
    }

    private DescriptorProtos$OneofDescriptorProto() {
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static /* synthetic */ int access$10576(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, int i) {
        int i2 = i | descriptorProtos$OneofDescriptorProto.bitField0_;
        descriptorProtos$OneofDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$OneofDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11436;
    }

    public static C3287 newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$OneofDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = (DescriptorProtos$OneofDescriptorProto) obj;
        if (hasName() != descriptorProtos$OneofDescriptorProto.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(descriptorProtos$OneofDescriptorProto.getName())) && hasOptions() == descriptorProtos$OneofDescriptorProto.hasOptions()) {
            return (!hasOptions() || getOptions().equals(descriptorProtos$OneofDescriptorProto.getOptions())) && getUnknownFields().equals(descriptorProtos$OneofDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11436;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.name_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public InterfaceC3486 getOptionsOrBuilder() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC3461.m7652(2, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3488
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11437;
        c3618.m7840(DescriptorProtos$OneofDescriptorProto.class, C3287.class);
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3287 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3287(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3287 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3287() : new C3287().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7662(2, getOptions());
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$OneofDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3287 extends GeneratedMessage.AbstractC3304 implements InterfaceC3488 {
        private int bitField0_;
        private Object name_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$OneofOptions options_;

        private C3287() {
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$OneofDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$OneofDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$OneofOptions) c3341.m7397();
                i |= 2;
            }
            DescriptorProtos$OneofDescriptorProto.access$10576(descriptorProtos$OneofDescriptorProto, i);
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11436;
        }

        private C3341 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetOptionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$OneofDescriptorProto build() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$OneofDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$OneofDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$OneofDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$OneofDescriptorProto buildPartial() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$OneofDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$OneofDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3287 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3287 clearName() {
            this.name_ = DescriptorProtos$OneofDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3287 clearOptions() {
            this.bitField0_ &= -3;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11436;
        }

        @Override // com.google.protobuf.InterfaceC3488
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3488
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3488
        public DescriptorProtos$OneofOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$OneofOptions) c3341.m7393();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        public DescriptorProtos$OneofOptions.C3288 getOptionsBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (DescriptorProtos$OneofOptions.C3288) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3488
        public InterfaceC3486 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3486) c3341.m7392();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        @Override // com.google.protobuf.InterfaceC3488
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3488
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11437;
            c3618.m7840(DescriptorProtos$OneofDescriptorProto.class, C3287.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3287 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 2;
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

        public C3287 mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$OneofOptions);
            } else if ((this.bitField0_ & 2) == 0 || (descriptorProtos$OneofOptions2 = this.options_) == null || descriptorProtos$OneofOptions2 == DescriptorProtos$OneofOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$OneofOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$OneofOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public C3287 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3287 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3287 setOptions(DescriptorProtos$OneofOptions.C3288 c3288) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3288.build();
            } else {
                c3341.m7400(c3288.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$OneofDescriptorProto.getDefaultInstance();
        }

        private C3287(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3287 setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$OneofOptions.getClass();
                this.options_ = descriptorProtos$OneofOptions;
            } else {
                c3341.m7400(descriptorProtos$OneofOptions);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3287 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$OneofDescriptorProto) {
                return mergeFrom((DescriptorProtos$OneofDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3287 mergeFrom(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            if (descriptorProtos$OneofDescriptorProto == DescriptorProtos$OneofDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$OneofDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$OneofDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$OneofDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$OneofDescriptorProto.getOptions());
            }
            mergeUnknownFields(descriptorProtos$OneofDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3287 newBuilderForType() {
        return newBuilder();
    }

    public static C3287 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DescriptorProtos$OneofDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

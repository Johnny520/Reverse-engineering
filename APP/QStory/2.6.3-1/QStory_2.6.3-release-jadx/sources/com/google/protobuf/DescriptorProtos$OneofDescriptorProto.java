package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessage implements InterfaceC4321 {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$OneofOptions options_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "OneofDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$OneofDescriptorProto();
        PARSER = new C4320();
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11786;
    }

    public static C4120 newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11786;
    }

    @Override // com.google.protobuf.InterfaceC4321
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

    @Override // com.google.protobuf.InterfaceC4321
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4321
    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
    }

    @Override // com.google.protobuf.InterfaceC4321
    public InterfaceC4319 getOptionsOrBuilder() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC4294.m8198(2, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4321
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4321
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11787;
        c4451.m8386(DescriptorProtos$OneofDescriptorProto.class, C4120.class);
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4120 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4120(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4120 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4120() : new C4120().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8208(2, getOptions());
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$OneofDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4120 extends GeneratedMessage.AbstractC4137 implements InterfaceC4321 {
        private int bitField0_;
        private Object name_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$OneofOptions options_;

        private C4120() {
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
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$OneofDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$OneofOptions) c4174.m7943();
                i |= 2;
            }
            DescriptorProtos$OneofDescriptorProto.access$10576(descriptorProtos$OneofDescriptorProto, i);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11786;
        }

        private C4174 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetOptionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$OneofDescriptorProto build() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$OneofDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$OneofDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$OneofDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$OneofDescriptorProto buildPartial() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$OneofDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$OneofDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4120 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C4120 clearName() {
            this.name_ = DescriptorProtos$OneofDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4120 clearOptions() {
            this.bitField0_ &= -3;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11786;
        }

        @Override // com.google.protobuf.InterfaceC4321
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

        @Override // com.google.protobuf.InterfaceC4321
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4321
        public DescriptorProtos$OneofOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$OneofOptions) c4174.m7939();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        public DescriptorProtos$OneofOptions.C4121 getOptionsBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (DescriptorProtos$OneofOptions.C4121) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4321
        public InterfaceC4319 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4319) c4174.m7938();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        @Override // com.google.protobuf.InterfaceC4321
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4321
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11787;
            c4451.m8386(DescriptorProtos$OneofDescriptorProto.class, C4120.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4120 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 2;
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

        public C4120 mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$OneofOptions);
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

        public C4120 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4120 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4120 setOptions(DescriptorProtos$OneofOptions.C4121 c4121) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4121.build();
            } else {
                c4174.m7946(c4121.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$OneofDescriptorProto.getDefaultInstance();
        }

        private C4120(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C4120 setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$OneofOptions.getClass();
                this.options_ = descriptorProtos$OneofOptions;
            } else {
                c4174.m7946(descriptorProtos$OneofOptions);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4120 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$OneofDescriptorProto) {
                return mergeFrom((DescriptorProtos$OneofDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4120 mergeFrom(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4120 newBuilderForType() {
        return newBuilder();
    }

    public static C4120 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DescriptorProtos$OneofDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

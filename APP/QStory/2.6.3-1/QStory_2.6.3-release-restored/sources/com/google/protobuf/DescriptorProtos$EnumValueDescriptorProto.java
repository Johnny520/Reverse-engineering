package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumValueDescriptorProto extends GeneratedMessage implements InterfaceC4388 {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValueDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumValueDescriptorProto();
        PARSER = new C4389();
    }

    private DescriptorProtos$EnumValueDescriptorProto() {
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static /* synthetic */ int access$13476(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, int i) {
        int i2 = i | descriptorProtos$EnumValueDescriptorProto.bitField0_;
        descriptorProtos$EnumValueDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$EnumValueDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11780;
    }

    public static C4100 newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$EnumValueDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = (DescriptorProtos$EnumValueDescriptorProto) obj;
        if (hasName() != descriptorProtos$EnumValueDescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$EnumValueDescriptorProto.getName())) || hasNumber() != descriptorProtos$EnumValueDescriptorProto.hasNumber()) {
            return false;
        }
        if ((!hasNumber() || getNumber() == descriptorProtos$EnumValueDescriptorProto.getNumber()) && hasOptions() == descriptorProtos$EnumValueDescriptorProto.hasOptions()) {
            return (!hasOptions() || getOptions().equals(descriptorProtos$EnumValueDescriptorProto.getOptions())) && getUnknownFields().equals(descriptorProtos$EnumValueDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11780;
    }

    @Override // com.google.protobuf.InterfaceC4388
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

    @Override // com.google.protobuf.InterfaceC4388
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public InterfaceC4386 getOptionsOrBuilder() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
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
            iComputeStringSize += AbstractC4294.m8190(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC4294.m8198(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4388
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
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
        if (hasNumber()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getNumber();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11781;
        c4451.m8386(DescriptorProtos$EnumValueDescriptorProto.class, C4100.class);
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
    public C4100 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4100(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4100 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4100() : new C4100().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8208(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4100 extends GeneratedMessage.AbstractC4137 implements InterfaceC4388 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$EnumValueOptions options_;

        private C4100() {
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$EnumValueDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$EnumValueDescriptorProto.number_ = this.number_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$EnumValueDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$EnumValueOptions) c4174.m7943();
                i |= 4;
            }
            DescriptorProtos$EnumValueDescriptorProto.access$13476(descriptorProtos$EnumValueDescriptorProto, i);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11780;
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
        public DescriptorProtos$EnumValueDescriptorProto build() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumValueDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumValueDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$EnumValueDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$EnumValueDescriptorProto buildPartial() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumValueDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumValueDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4100 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C4100 clearName() {
            this.name_ = DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4100 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C4100 clearOptions() {
            this.bitField0_ &= -5;
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
            return AbstractC4502.f11780;
        }

        @Override // com.google.protobuf.InterfaceC4388
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

        @Override // com.google.protobuf.InterfaceC4388
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4388
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC4388
        public DescriptorProtos$EnumValueOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$EnumValueOptions) c4174.m7939();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        public DescriptorProtos$EnumValueOptions.C4101 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumValueOptions.C4101) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4388
        public InterfaceC4386 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4386) c4174.m7938();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        @Override // com.google.protobuf.InterfaceC4388
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4388
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4388
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11781;
            c4451.m8386(DescriptorProtos$EnumValueDescriptorProto.class, C4100.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4100 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                            } else if (iMo8264 == 16) {
                                this.number_ = abstractC4306.mo8276();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 26) {
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4;
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

        public C4100 mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$EnumValueOptions);
            } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$EnumValueOptions2 = this.options_) == null || descriptorProtos$EnumValueOptions2 == DescriptorProtos$EnumValueOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$EnumValueOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$EnumValueOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public C4100 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4100 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4100 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4100 setOptions(DescriptorProtos$EnumValueOptions.C4101 c4101) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4101.build();
            } else {
                c4174.m7946(c4101.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance();
        }

        private C4100(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C4100 setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$EnumValueOptions.getClass();
                this.options_ = descriptorProtos$EnumValueOptions;
            } else {
                c4174.m7946(descriptorProtos$EnumValueOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4100 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$EnumValueDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumValueDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4100 mergeFrom(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            if (descriptorProtos$EnumValueDescriptorProto == DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$EnumValueDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$EnumValueDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$EnumValueDescriptorProto.hasNumber()) {
                setNumber(descriptorProtos$EnumValueDescriptorProto.getNumber());
            }
            if (descriptorProtos$EnumValueDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$EnumValueDescriptorProto.getOptions());
            }
            mergeUnknownFields(descriptorProtos$EnumValueDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4100 newBuilderForType() {
        return newBuilder();
    }

    public static C4100 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    private DescriptorProtos$EnumValueDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

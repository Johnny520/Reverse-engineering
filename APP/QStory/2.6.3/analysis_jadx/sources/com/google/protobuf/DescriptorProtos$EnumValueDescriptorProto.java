package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumValueDescriptorProto extends GeneratedMessage implements InterfaceC3556 {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValueDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumValueDescriptorProto();
        PARSER = new C3557();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11435;
    }

    public static C3268 newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11435;
    }

    @Override // com.google.protobuf.InterfaceC3556
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

    @Override // com.google.protobuf.InterfaceC3556
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public InterfaceC3554 getOptionsOrBuilder() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC3462.m7631(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3462.m7639(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3556
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasNumber()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getNumber();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11436;
        c3619.m7827(DescriptorProtos$EnumValueDescriptorProto.class, C3268.class);
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3268 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3268(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3268 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3268() : new C3268().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7649(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3268 extends GeneratedMessage.AbstractC3305 implements InterfaceC3556 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$EnumValueOptions options_;

        private C3268() {
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
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$EnumValueDescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$EnumValueOptions) c3342.m7384();
                i |= 4;
            }
            DescriptorProtos$EnumValueDescriptorProto.access$13476(descriptorProtos$EnumValueDescriptorProto, i);
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11435;
        }

        private C3342 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3342(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetOptionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$EnumValueDescriptorProto build() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumValueDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumValueDescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$EnumValueDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$EnumValueDescriptorProto buildPartial() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumValueDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumValueDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3268 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3268 clearName() {
            this.name_ = DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3268 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3268 clearOptions() {
            this.bitField0_ &= -5;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11435;
        }

        @Override // com.google.protobuf.InterfaceC3556
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

        @Override // com.google.protobuf.InterfaceC3556
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3556
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3556
        public DescriptorProtos$EnumValueOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$EnumValueOptions) c3342.m7380();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        public DescriptorProtos$EnumValueOptions.C3269 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumValueOptions.C3269) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3556
        public InterfaceC3554 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3554) c3342.m7379();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        @Override // com.google.protobuf.InterfaceC3556
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3556
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3556
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11436;
            c3619.m7827(DescriptorProtos$EnumValueDescriptorProto.class, C3268.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3268 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 16) {
                                this.number_ = abstractC3474.mo7717();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 26) {
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 4;
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

        public C3268 mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$EnumValueOptions);
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

        public C3268 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3268 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3268 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3268 setOptions(DescriptorProtos$EnumValueOptions.C3269 c3269) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3269.build();
            } else {
                c3342.m7387(c3269.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance();
        }

        private C3268(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3268 setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$EnumValueOptions.getClass();
                this.options_ = descriptorProtos$EnumValueOptions;
            } else {
                c3342.m7387(descriptorProtos$EnumValueOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3268 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$EnumValueDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumValueDescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3268 mergeFrom(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3268 newBuilderForType() {
        return newBuilder();
    }

    public static C3268 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    private DescriptorProtos$EnumValueDescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

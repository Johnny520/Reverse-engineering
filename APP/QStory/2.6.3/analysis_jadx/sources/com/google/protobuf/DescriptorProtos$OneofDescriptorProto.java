package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessage implements InterfaceC3489 {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$OneofOptions options_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "OneofDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$OneofDescriptorProto();
        PARSER = new C3488();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11441;
    }

    public static C3288 newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11441;
    }

    @Override // com.google.protobuf.InterfaceC3489
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

    @Override // com.google.protobuf.InterfaceC3489
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public InterfaceC3487 getOptionsOrBuilder() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
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
            iComputeStringSize += AbstractC3462.m7639(2, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
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
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11442;
        c3619.m7827(DescriptorProtos$OneofDescriptorProto.class, C3288.class);
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
    public C3288 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3288(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3288 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3288() : new C3288().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(2, getOptions());
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$OneofDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3288 extends GeneratedMessage.AbstractC3305 implements InterfaceC3489 {
        private int bitField0_;
        private Object name_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$OneofOptions options_;

        private C3288() {
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
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$OneofDescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$OneofOptions) c3342.m7384();
                i |= 2;
            }
            DescriptorProtos$OneofDescriptorProto.access$10576(descriptorProtos$OneofDescriptorProto, i);
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11441;
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
        public DescriptorProtos$OneofDescriptorProto build() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$OneofDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$OneofDescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$OneofDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$OneofDescriptorProto buildPartial() {
            DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$OneofDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$OneofDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3288 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3288 clearName() {
            this.name_ = DescriptorProtos$OneofDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3288 clearOptions() {
            this.bitField0_ &= -3;
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
            return AbstractC3670.f11441;
        }

        @Override // com.google.protobuf.InterfaceC3489
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

        @Override // com.google.protobuf.InterfaceC3489
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public DescriptorProtos$OneofOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$OneofOptions) c3342.m7380();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        public DescriptorProtos$OneofOptions.C3289 getOptionsBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (DescriptorProtos$OneofOptions.C3289) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3489
        public InterfaceC3487 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3487) c3342.m7379();
            }
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
            return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11442;
            c3619.m7827(DescriptorProtos$OneofDescriptorProto.class, C3288.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3288 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                            } else if (iMo7705 == 18) {
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 2;
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

        public C3288 mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$OneofOptions);
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

        public C3288 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3288 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3288 setOptions(DescriptorProtos$OneofOptions.C3289 c3289) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3289.build();
            } else {
                c3342.m7387(c3289.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$OneofDescriptorProto.getDefaultInstance();
        }

        private C3288(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3288 setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$OneofOptions.getClass();
                this.options_ = descriptorProtos$OneofOptions;
            } else {
                c3342.m7387(descriptorProtos$OneofOptions);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3288 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$OneofDescriptorProto) {
                return mergeFrom((DescriptorProtos$OneofDescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3288 mergeFrom(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3288 newBuilderForType() {
        return newBuilder();
    }

    public static C3288 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DescriptorProtos$OneofDescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

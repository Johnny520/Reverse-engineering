package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Option extends GeneratedMessage implements InterfaceC4208 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Any value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Option");
        DEFAULT_INSTANCE = new Option();
        PARSER = new C4205();
    }

    private Option() {
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static /* synthetic */ int access$576(Option option, int i) {
        int i2 = i | option.bitField0_;
        option.bitField0_ = i2;
        return i2;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4533.f11859;
    }

    public static C4148 newBuilder(Option option) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return super.equals(obj);
        }
        Option option = (Option) obj;
        if (getName().equals(option.getName()) && hasValue() == option.hasValue()) {
            return (!hasValue() || getValue().equals(option.getValue())) && getUnknownFields().equals(option.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4533.f11859;
    }

    @Override // com.google.protobuf.InterfaceC4208
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4208
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += AbstractC4294.m8198(2, getValue());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4208
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC4208
    public InterfaceC4384 getValueOrBuilder() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC4208
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasValue()) {
            iHashCode = getValue().hashCode() + AbstractC3275.m5131(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4533.f11860;
        c4451.m8386(Option.class, C4148.class);
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
    public C4148 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4148(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4148 toBuilder() {
        C4205 c4205 = null;
        return this == DEFAULT_INSTANCE ? new C4148(c4205) : new C4148(c4205).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8208(2, getValue());
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Option$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4148 extends GeneratedMessage.AbstractC4137 implements InterfaceC4208 {
        private int bitField0_;
        private Object name_;
        private C4174 valueBuilder_;
        private Any value_;

        private C4148() {
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(Option option) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                option.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                C4174 c4174 = this.valueBuilder_;
                option.value_ = c4174 == null ? this.value_ : (Any) c4174.m7943();
                i = 1;
            } else {
                i = 0;
            }
            Option.access$576(option, i);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4533.f11859;
        }

        private C4174 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C4174(getValue(), getParentForChildren(), isClean());
                this.value_ = null;
            }
            return this.valueBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetValueFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Option build() {
            Option optionBuildPartial = buildPartial();
            if (optionBuildPartial.isInitialized()) {
                return optionBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) optionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Option buildPartial() {
            Option option = new Option(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(option);
            }
            onBuilt();
            return option;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4148 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.value_ = null;
            C4174 c4174 = this.valueBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.valueBuilder_ = null;
            }
            return this;
        }

        public C4148 clearName() {
            this.name_ = Option.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4148 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = null;
            C4174 c4174 = this.valueBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.valueBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4533.f11859;
        }

        @Override // com.google.protobuf.InterfaceC4208
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4208
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4208
        public Any getValue() {
            C4174 c4174 = this.valueBuilder_;
            if (c4174 != null) {
                return (Any) c4174.m7939();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Any.C4090 getValueBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Any.C4090) internalGetValueFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4208
        public InterfaceC4384 getValueOrBuilder() {
            C4174 c4174 = this.valueBuilder_;
            if (c4174 != null) {
                return (InterfaceC4384) c4174.m7938();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.google.protobuf.InterfaceC4208
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4533.f11860;
            c4451.m8386(Option.class, C4148.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4148 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                abstractC4306.mo8275(internalGetValueFieldBuilder().m7940(), c4529);
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

        public C4148 mergeValue(Any any) {
            Any any2;
            C4174 c4174 = this.valueBuilder_;
            if (c4174 != null) {
                c4174.m7945(any);
            } else if ((this.bitField0_ & 2) == 0 || (any2 = this.value_) == null || any2 == Any.getDefaultInstance()) {
                this.value_ = any;
            } else {
                getValueBuilder().mergeFrom(any);
            }
            if (this.value_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public C4148 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4148 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4148 setValue(Any.C4090 c4090) {
            C4174 c4174 = this.valueBuilder_;
            if (c4174 == null) {
                this.value_ = c4090.build();
            } else {
                c4174.m7946(c4090.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Option getDefaultInstanceForType() {
            return Option.getDefaultInstance();
        }

        public /* synthetic */ C4148(C4205 c4205) {
            this();
        }

        public /* synthetic */ C4148(InterfaceC4364 interfaceC4364, C4205 c4205) {
            this(interfaceC4364);
        }

        private C4148(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C4148 setValue(Any any) {
            C4174 c4174 = this.valueBuilder_;
            if (c4174 == null) {
                any.getClass();
                this.value_ = any;
            } else {
                c4174.m7946(any);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4148 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Option) {
                return mergeFrom((Option) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4148 mergeFrom(Option option) {
            if (option == Option.getDefaultInstance()) {
                return this;
            }
            if (!option.getName().isEmpty()) {
                this.name_ = option.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (option.hasValue()) {
                mergeValue(option.getValue());
            }
            mergeUnknownFields(option.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Option getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Option parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4148 newBuilderForType() {
        return newBuilder();
    }

    public static C4148 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private Option(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Option parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Option) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public /* synthetic */ Option(GeneratedMessage.AbstractC4137 abstractC4137, C4205 c4205) {
        this(abstractC4137);
    }

    public static Option parseFrom(ByteString byteString) {
        return (Option) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Option parseFrom(ByteString byteString, C4529 c4529) {
        return (Option) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Option parseFrom(byte[] bArr) {
        return (Option) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Option parseFrom(byte[] bArr, C4529 c4529) {
        return (Option) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Option parseFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, C4529 c4529) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Option parseFrom(AbstractC4306 abstractC4306) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Option parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

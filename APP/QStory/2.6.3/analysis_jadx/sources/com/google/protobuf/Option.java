package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Option extends GeneratedMessage implements InterfaceC3376 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Any value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Option");
        DEFAULT_INSTANCE = new Option();
        PARSER = new C3373();
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

    public static final C3663 getDescriptor() {
        return AbstractC3701.f11514;
    }

    public static C3316 newBuilder(Option option) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3701.f11514;
    }

    @Override // com.google.protobuf.InterfaceC3376
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3376
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += AbstractC3462.m7639(2, getValue());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3376
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC3376
    public InterfaceC3552 getValueOrBuilder() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC3376
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasValue()) {
            iHashCode = getValue().hashCode() + AbstractC2442.m4571(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3701.f11515;
        c3619.m7827(Option.class, C3316.class);
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
    public C3316 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3316(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3316 toBuilder() {
        C3373 c3373 = null;
        return this == DEFAULT_INSTANCE ? new C3316(c3373) : new C3316(c3373).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7649(2, getValue());
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Option$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3316 extends GeneratedMessage.AbstractC3305 implements InterfaceC3376 {
        private int bitField0_;
        private Object name_;
        private C3342 valueBuilder_;
        private Any value_;

        private C3316() {
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
                C3342 c3342 = this.valueBuilder_;
                option.value_ = c3342 == null ? this.value_ : (Any) c3342.m7384();
                i = 1;
            } else {
                i = 0;
            }
            Option.access$576(option, i);
        }

        public static final C3663 getDescriptor() {
            return AbstractC3701.f11514;
        }

        private C3342 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C3342(getValue(), getParentForChildren(), isClean());
                this.value_ = null;
            }
            return this.valueBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetValueFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Option build() {
            Option optionBuildPartial = buildPartial();
            if (optionBuildPartial.isInitialized()) {
                return optionBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) optionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Option buildPartial() {
            Option option = new Option(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(option);
            }
            onBuilt();
            return option;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3316 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.value_ = null;
            C3342 c3342 = this.valueBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.valueBuilder_ = null;
            }
            return this;
        }

        public C3316 clearName() {
            this.name_ = Option.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3316 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = null;
            C3342 c3342 = this.valueBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.valueBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3701.f11514;
        }

        @Override // com.google.protobuf.InterfaceC3376
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3376
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3376
        public Any getValue() {
            C3342 c3342 = this.valueBuilder_;
            if (c3342 != null) {
                return (Any) c3342.m7380();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Any.C3258 getValueBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Any.C3258) internalGetValueFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3376
        public InterfaceC3552 getValueOrBuilder() {
            C3342 c3342 = this.valueBuilder_;
            if (c3342 != null) {
                return (InterfaceC3552) c3342.m7379();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.google.protobuf.InterfaceC3376
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3701.f11515;
            c3619.m7827(Option.class, C3316.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3316 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                abstractC3474.mo7716(internalGetValueFieldBuilder().m7381(), c3697);
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

        public C3316 mergeValue(Any any) {
            Any any2;
            C3342 c3342 = this.valueBuilder_;
            if (c3342 != null) {
                c3342.m7386(any);
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

        public C3316 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3316 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3316 setValue(Any.C3258 c3258) {
            C3342 c3342 = this.valueBuilder_;
            if (c3342 == null) {
                this.value_ = c3258.build();
            } else {
                c3342.m7387(c3258.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Option getDefaultInstanceForType() {
            return Option.getDefaultInstance();
        }

        public /* synthetic */ C3316(C3373 c3373) {
            this();
        }

        public /* synthetic */ C3316(InterfaceC3532 interfaceC3532, C3373 c3373) {
            this(interfaceC3532);
        }

        private C3316(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3316 setValue(Any any) {
            C3342 c3342 = this.valueBuilder_;
            if (c3342 == null) {
                any.getClass();
                this.value_ = any;
            } else {
                c3342.m7387(any);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3316 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Option) {
                return mergeFrom((Option) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3316 mergeFrom(Option option) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Option getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Option parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3316 newBuilderForType() {
        return newBuilder();
    }

    public static C3316 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private Option(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Option parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Option) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public /* synthetic */ Option(GeneratedMessage.AbstractC3305 abstractC3305, C3373 c3373) {
        this(abstractC3305);
    }

    public static Option parseFrom(ByteString byteString) {
        return (Option) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Option parseFrom(ByteString byteString, C3697 c3697) {
        return (Option) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Option parseFrom(byte[] bArr) {
        return (Option) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Option parseFrom(byte[] bArr, C3697 c3697) {
        return (Option) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Option parseFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, C3697 c3697) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Option parseFrom(AbstractC3474 abstractC3474) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Option parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

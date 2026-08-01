package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Option extends GeneratedMessage implements InterfaceC3375 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Any value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Option");
        DEFAULT_INSTANCE = new Option();
        PARSER = new C3372();
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

    public static final C3662 getDescriptor() {
        return AbstractC3700.f11509;
    }

    public static C3315 newBuilder(Option option) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3700.f11509;
    }

    @Override // com.google.protobuf.InterfaceC3375
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3375
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += AbstractC3461.m7652(2, getValue());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3375
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC3375
    public InterfaceC3551 getValueOrBuilder() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.InterfaceC3375
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasValue()) {
            iHashCode = getValue().hashCode() + AbstractC2442.m4561(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3700.f11510;
        c3618.m7840(Option.class, C3315.class);
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
    public C3315 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3315(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3315 toBuilder() {
        C3372 c3372 = null;
        return this == DEFAULT_INSTANCE ? new C3315(c3372) : new C3315(c3372).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7662(2, getValue());
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Option$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3315 extends GeneratedMessage.AbstractC3304 implements InterfaceC3375 {
        private int bitField0_;
        private Object name_;
        private C3341 valueBuilder_;
        private Any value_;

        private C3315() {
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
                C3341 c3341 = this.valueBuilder_;
                option.value_ = c3341 == null ? this.value_ : (Any) c3341.m7397();
                i = 1;
            } else {
                i = 0;
            }
            Option.access$576(option, i);
        }

        public static final C3662 getDescriptor() {
            return AbstractC3700.f11509;
        }

        private C3341 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C3341(getValue(), getParentForChildren(), isClean());
                this.value_ = null;
            }
            return this.valueBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetValueFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Option build() {
            Option optionBuildPartial = buildPartial();
            if (optionBuildPartial.isInitialized()) {
                return optionBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) optionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Option buildPartial() {
            Option option = new Option(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(option);
            }
            onBuilt();
            return option;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3315 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.value_ = null;
            C3341 c3341 = this.valueBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.valueBuilder_ = null;
            }
            return this;
        }

        public C3315 clearName() {
            this.name_ = Option.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3315 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = null;
            C3341 c3341 = this.valueBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.valueBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3700.f11509;
        }

        @Override // com.google.protobuf.InterfaceC3375
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3375
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3375
        public Any getValue() {
            C3341 c3341 = this.valueBuilder_;
            if (c3341 != null) {
                return (Any) c3341.m7393();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Any.C3257 getValueBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Any.C3257) internalGetValueFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3375
        public InterfaceC3551 getValueOrBuilder() {
            C3341 c3341 = this.valueBuilder_;
            if (c3341 != null) {
                return (InterfaceC3551) c3341.m7392();
            }
            Any any = this.value_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.google.protobuf.InterfaceC3375
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3700.f11510;
            c3618.m7840(Option.class, C3315.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3315 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                abstractC3473.mo7729(internalGetValueFieldBuilder().m7394(), c3696);
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

        public C3315 mergeValue(Any any) {
            Any any2;
            C3341 c3341 = this.valueBuilder_;
            if (c3341 != null) {
                c3341.m7399(any);
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

        public C3315 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3315 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3315 setValue(Any.C3257 c3257) {
            C3341 c3341 = this.valueBuilder_;
            if (c3341 == null) {
                this.value_ = c3257.build();
            } else {
                c3341.m7400(c3257.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Option getDefaultInstanceForType() {
            return Option.getDefaultInstance();
        }

        public /* synthetic */ C3315(C3372 c3372) {
            this();
        }

        public /* synthetic */ C3315(InterfaceC3531 interfaceC3531, C3372 c3372) {
            this(interfaceC3531);
        }

        private C3315(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3315 setValue(Any any) {
            C3341 c3341 = this.valueBuilder_;
            if (c3341 == null) {
                any.getClass();
                this.value_ = any;
            } else {
                c3341.m7400(any);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3315 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Option) {
                return mergeFrom((Option) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3315 mergeFrom(Option option) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Option getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Option parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Option) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3315 newBuilderForType() {
        return newBuilder();
    }

    public static C3315 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private Option(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Option parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Option) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public /* synthetic */ Option(GeneratedMessage.AbstractC3304 abstractC3304, C3372 c3372) {
        this(abstractC3304);
    }

    public static Option parseFrom(ByteString byteString) {
        return (Option) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Option parseFrom(ByteString byteString, C3696 c3696) {
        return (Option) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Option parseFrom(byte[] bArr) {
        return (Option) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Option parseFrom(byte[] bArr, C3696 c3696) {
        return (Option) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Option parseFrom(InputStream inputStream) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, C3696 c3696) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Option parseFrom(AbstractC3473 abstractC3473) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Option parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Option) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

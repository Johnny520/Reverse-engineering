package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumValueDescriptorProto extends GeneratedMessage implements InterfaceC3555 {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValueDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumValueDescriptorProto();
        PARSER = new C3556();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11430;
    }

    public static C3267 newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11430;
    }

    @Override // com.google.protobuf.InterfaceC3555
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

    @Override // com.google.protobuf.InterfaceC3555
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public InterfaceC3553 getOptionsOrBuilder() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
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
            iComputeStringSize += AbstractC3461.m7644(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3461.m7652(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3555
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
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
        if (hasNumber()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getNumber();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11431;
        c3618.m7840(DescriptorProtos$EnumValueDescriptorProto.class, C3267.class);
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
    public C3267 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3267(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3267 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3267() : new C3267().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(2, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7662(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3267 extends GeneratedMessage.AbstractC3304 implements InterfaceC3555 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$EnumValueOptions options_;

        private C3267() {
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
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$EnumValueDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$EnumValueOptions) c3341.m7397();
                i |= 4;
            }
            DescriptorProtos$EnumValueDescriptorProto.access$13476(descriptorProtos$EnumValueDescriptorProto, i);
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11430;
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
        public DescriptorProtos$EnumValueDescriptorProto build() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumValueDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumValueDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$EnumValueDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$EnumValueDescriptorProto buildPartial() {
            DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumValueDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumValueDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3267 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3267 clearName() {
            this.name_ = DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3267 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3267 clearOptions() {
            this.bitField0_ &= -5;
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
            return AbstractC3669.f11430;
        }

        @Override // com.google.protobuf.InterfaceC3555
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

        @Override // com.google.protobuf.InterfaceC3555
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3555
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3555
        public DescriptorProtos$EnumValueOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$EnumValueOptions) c3341.m7393();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        public DescriptorProtos$EnumValueOptions.C3268 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumValueOptions.C3268) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3555
        public InterfaceC3553 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3553) c3341.m7392();
            }
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
            return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
        }

        @Override // com.google.protobuf.InterfaceC3555
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3555
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3555
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11431;
            c3618.m7840(DescriptorProtos$EnumValueDescriptorProto.class, C3267.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3267 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                            } else if (iMo7718 == 16) {
                                this.number_ = abstractC3473.mo7730();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 26) {
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 4;
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

        public C3267 mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$EnumValueOptions);
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

        public C3267 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3267 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3267 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3267 setOptions(DescriptorProtos$EnumValueOptions.C3268 c3268) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3268.build();
            } else {
                c3341.m7400(c3268.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance();
        }

        private C3267(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public C3267 setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$EnumValueOptions.getClass();
                this.options_ = descriptorProtos$EnumValueOptions;
            } else {
                c3341.m7400(descriptorProtos$EnumValueOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3267 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$EnumValueDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumValueDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3267 mergeFrom(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3267 newBuilderForType() {
        return newBuilder();
    }

    public static C3267 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    private DescriptorProtos$EnumValueDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

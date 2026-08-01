package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumValue extends GeneratedMessage implements InterfaceC3579 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private List<Option> options_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValue");
        DEFAULT_INSTANCE = new EnumValue();
        PARSER = new C3583();
    }

    private EnumValue() {
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.options_ = Collections.EMPTY_LIST;
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3700.f11507;
    }

    public static C3299 newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) {
        return (EnumValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EnumValue)) {
            return super.equals(obj);
        }
        EnumValue enumValue = (EnumValue) obj;
        return getName().equals(enumValue.getName()) && getNumber() == enumValue.getNumber() && getOptionsList().equals(enumValue.getOptionsList()) && getUnknownFields().equals(enumValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3700.f11507;
    }

    @Override // com.google.protobuf.InterfaceC3579
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3579
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3579
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3579
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3579
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3579
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3579
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3579
    public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
        return this.options_;
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
        int i2 = this.number_;
        if (i2 != 0) {
            iComputeStringSize += AbstractC3461.m7644(2, i2);
        }
        int size = this.options_.size();
        for (int i3 = 0; i3 < size; i3++) {
            iComputeStringSize += AbstractC3461.m7656(this.options_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int number = getNumber() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (getOptionsCount() > 0) {
            number = AbstractC2442.m4561(number, 37, 3, 53) + getOptionsList().hashCode();
        }
        int iHashCode = getUnknownFields().hashCode() + (number * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3700.f11506;
        c3618.m7840(EnumValue.class, C3299.class);
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
    public C3299 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3299(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3299 toBuilder() {
        C3583 c3583 = null;
        return this == DEFAULT_INSTANCE ? new C3299(c3583) : new C3299(c3583).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC3461.mo7664(2, i);
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3461.mo7662(3, this.options_.get(i2));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.EnumValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3299 extends GeneratedMessage.AbstractC3304 implements InterfaceC3579 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C3362 optionsBuilder_;
        private List<Option> options_;

        private C3299() {
            this.name_ = "";
            this.options_ = Collections.EMPTY_LIST;
        }

        private void buildPartial0(EnumValue enumValue) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                enumValue.name_ = this.name_;
            }
            if ((i & 2) != 0) {
                enumValue.number_ = this.number_;
            }
        }

        private void buildPartialRepeatedFields(EnumValue enumValue) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                enumValue.options_ = c3362.m7485();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -5;
            }
            enumValue.options_ = this.options_;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3700.f11507;
        }

        private C3362 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3362(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3299 addAllOptions(Iterable<? extends Option> iterable) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C3299 addOptions(Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3315.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c3315.build());
            onChanged();
            return this;
        }

        public Option.C3315 addOptionsBuilder() {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7473(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public EnumValue build() {
            EnumValue enumValueBuildPartial = buildPartial();
            if (enumValueBuildPartial.isInitialized()) {
                return enumValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) enumValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public EnumValue buildPartial() {
            EnumValue enumValue = new EnumValue(this, null);
            buildPartialRepeatedFields(enumValue);
            if (this.bitField0_ != 0) {
                buildPartial0(enumValue);
            }
            onBuilt();
            return enumValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3299 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -5;
            return this;
        }

        public C3299 clearName() {
            this.name_ = EnumValue.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3299 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3299 clearOptions() {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3700.f11507;
        }

        @Override // com.google.protobuf.InterfaceC3579
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3579
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3579
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3579
        public Option getOptions(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (Option) c3362.m7479(i, false);
        }

        public Option.C3315 getOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7486(i);
        }

        public List<Option.C3315> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3579
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3579
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3579
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3579
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3700.f11506;
            c3618.m7840(EnumValue.class, C3299.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3299 mergeFrom(EnumValue enumValue) {
            if (enumValue == EnumValue.getDefaultInstance()) {
                return this;
            }
            if (!enumValue.getName().isEmpty()) {
                this.name_ = enumValue.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (enumValue.getNumber() != 0) {
                setNumber(enumValue.getNumber());
            }
            if (this.optionsBuilder_ == null) {
                if (!enumValue.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = enumValue.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(enumValue.options_);
                    }
                    onChanged();
                }
            } else if (!enumValue.options_.isEmpty()) {
                boolean zIsEmpty = this.optionsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = enumValue.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3362.m7475(enumValue.options_);
                }
            }
            mergeUnknownFields(enumValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C3299 removeOptions(int i) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C3299 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3299 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3299 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3299 setOptions(int i, Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3315.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c3315.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public EnumValue getDefaultInstanceForType() {
            return EnumValue.getDefaultInstance();
        }

        public /* synthetic */ C3299(C3583 c3583) {
            this();
        }

        public /* synthetic */ C3299(InterfaceC3531 interfaceC3531, C3583 c3583) {
            this(interfaceC3531);
        }

        private C3299(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.options_ = Collections.EMPTY_LIST;
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public C3299 addOptions(int i, Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c3362.m7472(i, option);
            return this;
        }

        public C3299 setOptions(int i, Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c3362.m7476(i, option);
            return this;
        }

        public C3299 addOptions(Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c3362.m7471(option);
            return this;
        }

        public C3299 addOptions(int i, Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c3315.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3315.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3299 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof EnumValue) {
                return mergeFrom((EnumValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3299 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                            } else if (iMo7718 == 16) {
                                this.number_ = abstractC3473.mo7730();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 != 26) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                Option option = (Option) abstractC3473.mo7728(Option.parser(), c3696);
                                C3362 c3362 = this.optionsBuilder_;
                                if (c3362 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3362.m7471(option);
                                }
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public EnumValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3299 newBuilderForType() {
        return newBuilder();
    }

    public static C3299 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (EnumValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static EnumValue parseFrom(ByteString byteString) {
        return (EnumValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private EnumValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EnumValue parseFrom(ByteString byteString, C3696 c3696) {
        return (EnumValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static EnumValue parseFrom(byte[] bArr) {
        return (EnumValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public /* synthetic */ EnumValue(GeneratedMessage.AbstractC3304 abstractC3304, C3583 c3583) {
        this(abstractC3304);
    }

    public static EnumValue parseFrom(byte[] bArr, C3696 c3696) {
        return (EnumValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static EnumValue parseFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static EnumValue parseFrom(AbstractC3473 abstractC3473) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static EnumValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

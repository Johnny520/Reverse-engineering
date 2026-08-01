package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumValue extends GeneratedMessage implements InterfaceC4412 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private List<Option> options_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValue");
        DEFAULT_INSTANCE = new EnumValue();
        PARSER = new C4416();
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

    public static final C4495 getDescriptor() {
        return AbstractC4533.f11857;
    }

    public static C4132 newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) {
        return (EnumValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4533.f11857;
    }

    @Override // com.google.protobuf.InterfaceC4412
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4412
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4412
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC4412
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4412
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4412
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4412
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4412
    public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
        return this.options_;
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
        int i2 = this.number_;
        if (i2 != 0) {
            iComputeStringSize += AbstractC4294.m8190(2, i2);
        }
        int size = this.options_.size();
        for (int i3 = 0; i3 < size; i3++) {
            iComputeStringSize += AbstractC4294.m8202(this.options_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int number = getNumber() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (getOptionsCount() > 0) {
            number = AbstractC3275.m5131(number, 37, 3, 53) + getOptionsList().hashCode();
        }
        int iHashCode = getUnknownFields().hashCode() + (number * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4533.f11856;
        c4451.m8386(EnumValue.class, C4132.class);
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
    public C4132 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4132(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4132 toBuilder() {
        C4416 c4416 = null;
        return this == DEFAULT_INSTANCE ? new C4132(c4416) : new C4132(c4416).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC4294.mo8210(2, i);
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC4294.mo8208(3, this.options_.get(i2));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.EnumValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4132 extends GeneratedMessage.AbstractC4137 implements InterfaceC4412 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C4195 optionsBuilder_;
        private List<Option> options_;

        private C4132() {
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
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                enumValue.options_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4533.f11857;
        }

        private C4195 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4195(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C4132 addAllOptions(Iterable<? extends Option> iterable) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C4132 addOptions(Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4148.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c4148.build());
            onChanged();
            return this;
        }

        public Option.C4148 addOptionsBuilder() {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8019(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public EnumValue build() {
            EnumValue enumValueBuildPartial = buildPartial();
            if (enumValueBuildPartial.isInitialized()) {
                return enumValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) enumValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public EnumValue buildPartial() {
            EnumValue enumValue = new EnumValue(this, null);
            buildPartialRepeatedFields(enumValue);
            if (this.bitField0_ != 0) {
                buildPartial0(enumValue);
            }
            onBuilt();
            return enumValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4132 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -5;
            return this;
        }

        public C4132 clearName() {
            this.name_ = EnumValue.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4132 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C4132 clearOptions() {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4533.f11857;
        }

        @Override // com.google.protobuf.InterfaceC4412
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4412
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4412
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC4412
        public Option getOptions(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (Option) c4195.m8025(i, false);
        }

        public Option.C4148 getOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8032(i);
        }

        public List<Option.C4148> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4412
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4412
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4412
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4412
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4533.f11856;
            c4451.m8386(EnumValue.class, C4132.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4132 mergeFrom(EnumValue enumValue) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = enumValue.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c4195.m8021(enumValue.options_);
                }
            }
            mergeUnknownFields(enumValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C4132 removeOptions(int i) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C4132 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4132 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4132 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4132 setOptions(int i, Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4148.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c4148.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public EnumValue getDefaultInstanceForType() {
            return EnumValue.getDefaultInstance();
        }

        public /* synthetic */ C4132(C4416 c4416) {
            this();
        }

        public /* synthetic */ C4132(InterfaceC4364 interfaceC4364, C4416 c4416) {
            this(interfaceC4364);
        }

        private C4132(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.options_ = Collections.EMPTY_LIST;
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public C4132 addOptions(int i, Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c4195.m8018(i, option);
            return this;
        }

        public C4132 setOptions(int i, Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c4195.m8022(i, option);
            return this;
        }

        public C4132 addOptions(Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c4195.m8017(option);
            return this;
        }

        public C4132 addOptions(int i, Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c4148.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4148.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4132 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof EnumValue) {
                return mergeFrom((EnumValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4132 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                            } else if (iMo8264 == 16) {
                                this.number_ = abstractC4306.mo8276();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 != 26) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                Option option = (Option) abstractC4306.mo8274(Option.parser(), c4529);
                                C4195 c4195 = this.optionsBuilder_;
                                if (c4195 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c4195.m8017(option);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public EnumValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4132 newBuilderForType() {
        return newBuilder();
    }

    public static C4132 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (EnumValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static EnumValue parseFrom(ByteString byteString) {
        return (EnumValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private EnumValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EnumValue parseFrom(ByteString byteString, C4529 c4529) {
        return (EnumValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static EnumValue parseFrom(byte[] bArr) {
        return (EnumValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public /* synthetic */ EnumValue(GeneratedMessage.AbstractC4137 abstractC4137, C4416 c4416) {
        this(abstractC4137);
    }

    public static EnumValue parseFrom(byte[] bArr, C4529 c4529) {
        return (EnumValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static EnumValue parseFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static EnumValue parseFrom(AbstractC4306 abstractC4306) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static EnumValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

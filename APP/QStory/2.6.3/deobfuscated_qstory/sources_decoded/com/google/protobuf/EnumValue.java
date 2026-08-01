package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumValue extends GeneratedMessage implements InterfaceC3580 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private List<Option> options_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValue");
        DEFAULT_INSTANCE = new EnumValue();
        PARSER = new C3584();
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

    public static final C3663 getDescriptor() {
        return AbstractC3701.f11512;
    }

    public static C3300 newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) {
        return (EnumValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3701.f11512;
    }

    @Override // com.google.protobuf.InterfaceC3580
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3580
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3580
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3580
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3580
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3580
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3580
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3580
    public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
        return this.options_;
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
        int i2 = this.number_;
        if (i2 != 0) {
            iComputeStringSize += AbstractC3462.m7631(2, i2);
        }
        int size = this.options_.size();
        for (int i3 = 0; i3 < size; i3++) {
            iComputeStringSize += AbstractC3462.m7643(this.options_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int number = getNumber() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (getOptionsCount() > 0) {
            number = AbstractC2442.m4571(number, 37, 3, 53) + getOptionsList().hashCode();
        }
        int iHashCode = getUnknownFields().hashCode() + (number * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3701.f11511;
        c3619.m7827(EnumValue.class, C3300.class);
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
    public C3300 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3300(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3300 toBuilder() {
        C3584 c3584 = null;
        return this == DEFAULT_INSTANCE ? new C3300(c3584) : new C3300(c3584).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC3462.mo7651(2, i);
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3462.mo7649(3, this.options_.get(i2));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.EnumValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3300 extends GeneratedMessage.AbstractC3305 implements InterfaceC3580 {
        private int bitField0_;
        private Object name_;
        private int number_;
        private C3363 optionsBuilder_;
        private List<Option> options_;

        private C3300() {
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
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                enumValue.options_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3701.f11512;
        }

        private C3363 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3363(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3300 addAllOptions(Iterable<? extends Option> iterable) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C3300 addOptions(Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3316.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c3316.build());
            onChanged();
            return this;
        }

        public Option.C3316 addOptionsBuilder() {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7460(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public EnumValue build() {
            EnumValue enumValueBuildPartial = buildPartial();
            if (enumValueBuildPartial.isInitialized()) {
                return enumValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) enumValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public EnumValue buildPartial() {
            EnumValue enumValue = new EnumValue(this, null);
            buildPartialRepeatedFields(enumValue);
            if (this.bitField0_ != 0) {
                buildPartial0(enumValue);
            }
            onBuilt();
            return enumValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3300 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -5;
            return this;
        }

        public C3300 clearName() {
            this.name_ = EnumValue.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3300 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3300 clearOptions() {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3701.f11512;
        }

        @Override // com.google.protobuf.InterfaceC3580
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3580
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3580
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3580
        public Option getOptions(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (Option) c3363.m7466(i, false);
        }

        public Option.C3316 getOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7473(i);
        }

        public List<Option.C3316> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3580
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3580
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3580
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3580
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3701.f11511;
            c3619.m7827(EnumValue.class, C3300.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3300 mergeFrom(EnumValue enumValue) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = enumValue.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3363.m7462(enumValue.options_);
                }
            }
            mergeUnknownFields(enumValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C3300 removeOptions(int i) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C3300 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3300 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3300 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3300 setOptions(int i, Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3316.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c3316.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public EnumValue getDefaultInstanceForType() {
            return EnumValue.getDefaultInstance();
        }

        public /* synthetic */ C3300(C3584 c3584) {
            this();
        }

        public /* synthetic */ C3300(InterfaceC3532 interfaceC3532, C3584 c3584) {
            this(interfaceC3532);
        }

        private C3300(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            this.options_ = Collections.EMPTY_LIST;
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public C3300 addOptions(int i, Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c3363.m7459(i, option);
            return this;
        }

        public C3300 setOptions(int i, Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c3363.m7463(i, option);
            return this;
        }

        public C3300 addOptions(Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c3363.m7458(option);
            return this;
        }

        public C3300 addOptions(int i, Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c3316.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3316.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3300 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof EnumValue) {
                return mergeFrom((EnumValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3300 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                            } else if (iMo7705 == 16) {
                                this.number_ = abstractC3474.mo7717();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 != 26) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                Option option = (Option) abstractC3474.mo7715(Option.parser(), c3697);
                                C3363 c3363 = this.optionsBuilder_;
                                if (c3363 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3363.m7458(option);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public EnumValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (EnumValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3300 newBuilderForType() {
        return newBuilder();
    }

    public static C3300 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (EnumValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static EnumValue parseFrom(ByteString byteString) {
        return (EnumValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private EnumValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.number_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EnumValue parseFrom(ByteString byteString, C3697 c3697) {
        return (EnumValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static EnumValue parseFrom(byte[] bArr) {
        return (EnumValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public /* synthetic */ EnumValue(GeneratedMessage.AbstractC3305 abstractC3305, C3584 c3584) {
        this(abstractC3305);
    }

    public static EnumValue parseFrom(byte[] bArr, C3697 c3697) {
        return (EnumValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static EnumValue parseFrom(InputStream inputStream) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static EnumValue parseFrom(AbstractC3474 abstractC3474) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static EnumValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (EnumValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Field extends GeneratedMessage implements InterfaceC4520 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static final InterfaceC4207 PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int cardinality_;
    private volatile Object defaultValue_;
    private volatile Object jsonName_;
    private int kind_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private int oneofIndex_;
    private List<Option> options_;
    private boolean packed_;
    private volatile Object typeUrl_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Field");
        DEFAULT_INSTANCE = new Field();
        PARSER = new C4507();
    }

    private Field() {
        this.kind_ = 0;
        this.cardinality_ = 0;
        this.number_ = 0;
        this.name_ = "";
        this.typeUrl_ = "";
        this.oneofIndex_ = 0;
        this.packed_ = false;
        this.jsonName_ = "";
        this.defaultValue_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.kind_ = 0;
        this.cardinality_ = 0;
        this.name_ = "";
        this.typeUrl_ = "";
        this.options_ = Collections.EMPTY_LIST;
        this.jsonName_ = "";
        this.defaultValue_ = "";
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4533.f11853;
    }

    public static C4133 newBuilder(Field field) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return super.equals(obj);
        }
        Field field = (Field) obj;
        return this.kind_ == field.kind_ && this.cardinality_ == field.cardinality_ && getNumber() == field.getNumber() && getName().equals(field.getName()) && getTypeUrl().equals(field.getTypeUrl()) && getOneofIndex() == field.getOneofIndex() && getPacked() == field.getPacked() && getOptionsList().equals(field.getOptionsList()) && getJsonName().equals(field.getJsonName()) && getDefaultValue().equals(field.getDefaultValue()) && getUnknownFields().equals(field.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC4520
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.defaultValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public ByteString getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.defaultValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4533.f11853;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.jsonName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public ByteString getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.jsonName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4520
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4520
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4520
    public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public boolean getPacked() {
        return this.packed_;
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
        int iM8191 = this.kind_ != Kind.TYPE_UNKNOWN.getNumber() ? AbstractC4294.m8191(1, this.kind_) : 0;
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iM8191 += AbstractC4294.m8191(2, this.cardinality_);
        }
        int i2 = this.number_;
        if (i2 != 0) {
            iM8191 += AbstractC4294.m8190(3, i2);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            iM8191 += GeneratedMessage.computeStringSize(4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            iM8191 += GeneratedMessage.computeStringSize(6, this.typeUrl_);
        }
        int i3 = this.oneofIndex_;
        if (i3 != 0) {
            iM8191 += AbstractC4294.m8190(7, i3);
        }
        if (this.packed_) {
            iM8191 += AbstractC4294.m8193(8);
        }
        int size = this.options_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM8191 += AbstractC4294.m8202(this.options_.get(i4));
        }
        int iComputeStringSize = iM8191 + size;
        if (!GeneratedMessage.isStringEmpty(this.jsonName_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(10, this.jsonName_);
        }
        if (!GeneratedMessage.isStringEmpty(this.defaultValue_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(11, this.defaultValue_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public String getTypeUrl() {
        Object obj = this.typeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.typeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4520
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM8062 = AbstractC4234.m8062(getPacked()) + ((((getOneofIndex() + ((((getTypeUrl().hashCode() + ((((getName().hashCode() + ((((getNumber() + ((((((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.kind_) * 37) + 2) * 53) + this.cardinality_) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
        if (getOptionsCount() > 0) {
            iM8062 = getOptionsList().hashCode() + AbstractC3275.m5131(iM8062, 37, 9, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getDefaultValue().hashCode() + ((((getJsonName().hashCode() + AbstractC3275.m5131(iM8062, 37, 10, 53)) * 37) + 11) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4533.f11852;
        c4451.m8386(Field.class, C4133.class);
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
    public C4133 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4133(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4133 toBuilder() {
        C4507 c4507 = null;
        return this == DEFAULT_INSTANCE ? new C4133(c4507) : new C4133(c4507).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (this.kind_ != Kind.TYPE_UNKNOWN.getNumber()) {
            abstractC4294.mo8210(1, this.kind_);
        }
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            abstractC4294.mo8210(2, this.cardinality_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC4294.mo8210(3, i);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC4294, 6, this.typeUrl_);
        }
        int i2 = this.oneofIndex_;
        if (i2 != 0) {
            abstractC4294.mo8210(7, i2);
        }
        boolean z = this.packed_;
        if (z) {
            abstractC4294.mo8222(8, z);
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC4294.mo8208(9, this.options_.get(i3));
        }
        if (!GeneratedMessage.isStringEmpty(this.jsonName_)) {
            GeneratedMessage.writeString(abstractC4294, 10, this.jsonName_);
        }
        if (!GeneratedMessage.isStringEmpty(this.defaultValue_)) {
            GeneratedMessage.writeString(abstractC4294, 11, this.defaultValue_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Field$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4133 extends GeneratedMessage.AbstractC4137 implements InterfaceC4520 {
        private int bitField0_;
        private int cardinality_;
        private Object defaultValue_;
        private Object jsonName_;
        private int kind_;
        private Object name_;
        private int number_;
        private int oneofIndex_;
        private C4195 optionsBuilder_;
        private List<Option> options_;
        private boolean packed_;
        private Object typeUrl_;

        private C4133() {
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.jsonName_ = "";
            this.defaultValue_ = "";
        }

        private void buildPartial0(Field field) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                field.kind_ = this.kind_;
            }
            if ((i & 2) != 0) {
                field.cardinality_ = this.cardinality_;
            }
            if ((i & 4) != 0) {
                field.number_ = this.number_;
            }
            if ((i & 8) != 0) {
                field.name_ = this.name_;
            }
            if ((i & 16) != 0) {
                field.typeUrl_ = this.typeUrl_;
            }
            if ((i & 32) != 0) {
                field.oneofIndex_ = this.oneofIndex_;
            }
            if ((i & 64) != 0) {
                field.packed_ = this.packed_;
            }
            if ((i & 256) != 0) {
                field.jsonName_ = this.jsonName_;
            }
            if ((i & 512) != 0) {
                field.defaultValue_ = this.defaultValue_;
            }
        }

        private void buildPartialRepeatedFields(Field field) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                field.options_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 128) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -129;
            }
            field.options_ = this.options_;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 128;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4533.f11853;
        }

        private C4195 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4195(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C4133 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C4133 addOptions(Option.C4148 c4148) {
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
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) fieldBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Field buildPartial() {
            Field field = new Field(this, null);
            buildPartialRepeatedFields(field);
            if (this.bitField0_ != 0) {
                buildPartial0(field);
            }
            onBuilt();
            return field;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4133 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.number_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.oneofIndex_ = 0;
            this.packed_ = false;
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -129;
            this.jsonName_ = "";
            this.defaultValue_ = "";
            return this;
        }

        public C4133 clearCardinality() {
            this.bitField0_ &= -3;
            this.cardinality_ = 0;
            onChanged();
            return this;
        }

        public C4133 clearDefaultValue() {
            this.defaultValue_ = Field.getDefaultInstance().getDefaultValue();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C4133 clearJsonName() {
            this.jsonName_ = Field.getDefaultInstance().getJsonName();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C4133 clearKind() {
            this.bitField0_ &= -2;
            this.kind_ = 0;
            onChanged();
            return this;
        }

        public C4133 clearName() {
            this.name_ = Field.getDefaultInstance().getName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C4133 clearNumber() {
            this.bitField0_ &= -5;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C4133 clearOneofIndex() {
            this.bitField0_ &= -33;
            this.oneofIndex_ = 0;
            onChanged();
            return this;
        }

        public C4133 clearOptions() {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C4133 clearPacked() {
            this.bitField0_ &= -65;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C4133 clearTypeUrl() {
            this.typeUrl_ = Field.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public Cardinality getCardinality() {
            Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
            return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public int getCardinalityValue() {
            return this.cardinality_;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.defaultValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4533.f11853;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.jsonName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public ByteString getJsonNameBytes() {
            Object obj = this.jsonName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jsonName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public Kind getKind() {
            Kind kindForNumber = Kind.forNumber(this.kind_);
            return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public int getKindValue() {
            return this.kind_;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.InterfaceC4520
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

        @Override // com.google.protobuf.InterfaceC4520
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4520
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4520
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4520
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC4520
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4520
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4533.f11852;
            c4451.m8386(Field.class, C4133.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4133 mergeFrom(Field field) {
            if (field == Field.getDefaultInstance()) {
                return this;
            }
            if (field.kind_ != 0) {
                setKindValue(field.getKindValue());
            }
            if (field.cardinality_ != 0) {
                setCardinalityValue(field.getCardinalityValue());
            }
            if (field.getNumber() != 0) {
                setNumber(field.getNumber());
            }
            if (!field.getName().isEmpty()) {
                this.name_ = field.name_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!field.getTypeUrl().isEmpty()) {
                this.typeUrl_ = field.typeUrl_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (field.getOneofIndex() != 0) {
                setOneofIndex(field.getOneofIndex());
            }
            if (field.getPacked()) {
                setPacked(field.getPacked());
            }
            if (this.optionsBuilder_ == null) {
                if (!field.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = field.options_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(field.options_);
                    }
                    onChanged();
                }
            } else if (!field.options_.isEmpty()) {
                boolean zIsEmpty = this.optionsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = field.options_;
                    this.bitField0_ &= -129;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c4195.m8021(field.options_);
                }
            }
            if (!field.getJsonName().isEmpty()) {
                this.jsonName_ = field.jsonName_;
                this.bitField0_ |= 256;
                onChanged();
            }
            if (!field.getDefaultValue().isEmpty()) {
                this.defaultValue_ = field.defaultValue_;
                this.bitField0_ |= 512;
                onChanged();
            }
            mergeUnknownFields(field.getUnknownFields());
            onChanged();
            return this;
        }

        public C4133 removeOptions(int i) {
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

        public C4133 setCardinality(Cardinality cardinality) {
            cardinality.getClass();
            this.bitField0_ |= 2;
            this.cardinality_ = cardinality.getNumber();
            onChanged();
            return this;
        }

        public C4133 setCardinalityValue(int i) {
            this.cardinality_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4133 setDefaultValue(String str) {
            str.getClass();
            this.defaultValue_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4133 setDefaultValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.defaultValue_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4133 setJsonName(String str) {
            str.getClass();
            this.jsonName_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C4133 setJsonNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.jsonName_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C4133 setKind(Kind kind) {
            kind.getClass();
            this.bitField0_ |= 1;
            this.kind_ = kind.getNumber();
            onChanged();
            return this;
        }

        public C4133 setKindValue(int i) {
            this.kind_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4133 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4133 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4133 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4133 setOneofIndex(int i) {
            this.oneofIndex_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4133 setOptions(int i, Option.C4148 c4148) {
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

        public C4133 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4133 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4133 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Field getDefaultInstanceForType() {
            return Field.getDefaultInstance();
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C4133(C4507 c4507) {
            this();
        }

        public /* synthetic */ C4133(InterfaceC4364 interfaceC4364, C4507 c4507) {
            this(interfaceC4364);
        }

        private C4133(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.jsonName_ = "";
            this.defaultValue_ = "";
        }

        public C4133 addOptions(int i, Option option) {
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

        public C4133 setOptions(int i, Option option) {
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

        public C4133 addOptions(Option option) {
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

        public C4133 addOptions(int i, Option.C4148 c4148) {
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
        public C4133 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Field) {
                return mergeFrom((Field) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4133 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        switch (iMo8264) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.kind_ = abstractC4306.mo8283();
                                this.bitField0_ |= 1;
                                break;
                            case 16:
                                this.cardinality_ = abstractC4306.mo8283();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.number_ = abstractC4306.mo8276();
                                this.bitField0_ |= 4;
                                break;
                            case 34:
                                this.name_ = abstractC4306.mo8265();
                                this.bitField0_ |= 8;
                                break;
                            case 50:
                                this.typeUrl_ = abstractC4306.mo8265();
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.oneofIndex_ = abstractC4306.mo8276();
                                this.bitField0_ |= 32;
                                break;
                            case 64:
                                this.packed_ = abstractC4306.mo8279();
                                this.bitField0_ |= 64;
                                break;
                            case 74:
                                Option option = (Option) abstractC4306.mo8274(Option.parser(), c4529);
                                C4195 c4195 = this.optionsBuilder_;
                                if (c4195 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c4195.m8017(option);
                                }
                                break;
                            case 82:
                                this.jsonName_ = abstractC4306.mo8265();
                                this.bitField0_ |= 256;
                                break;
                            case 90:
                                this.defaultValue_ = abstractC4306.mo8265();
                                this.bitField0_ |= 512;
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                    z = true;
                                }
                                break;
                        }
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
    public Field getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Field parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4133 newBuilderForType() {
        return newBuilder();
    }

    public static C4133 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Field parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Field) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Field parseFrom(ByteString byteString) {
        return (Field) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Field parseFrom(ByteString byteString, C4529 c4529) {
        return (Field) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Cardinality implements InterfaceC4213 {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final Cardinality[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Cardinality");
            internalValueMap = new C4506();
            VALUES = values();
        }

        Cardinality(int i) {
            this.value = i;
        }

        public static Cardinality forNumber(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static C4498 getDescriptor() {
            return Field.getDescriptor().f11722[1];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Cardinality valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                int i = c4496.f11730;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C6755.m11869("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C4496 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C6755.m11870("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Kind implements InterfaceC4213 {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final Kind[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Kind");
            internalValueMap = new C4522();
            VALUES = values();
        }

        Kind(int i) {
            this.value = i;
        }

        public static Kind forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static C4498 getDescriptor() {
            return Field.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Kind valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                int i = c4496.f11730;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C6755.m11869("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C4496 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C6755.m11870("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static Kind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Field parseFrom(byte[] bArr, C4529 c4529) {
        return (Field) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, C4529 c4529) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Field parseFrom(AbstractC4306 abstractC4306) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Field parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private Field(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.kind_ = 0;
        this.cardinality_ = 0;
        this.number_ = 0;
        this.name_ = "";
        this.typeUrl_ = "";
        this.oneofIndex_ = 0;
        this.packed_ = false;
        this.jsonName_ = "";
        this.defaultValue_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public /* synthetic */ Field(GeneratedMessage.AbstractC4137 abstractC4137, C4507 c4507) {
        this(abstractC4137);
    }
}

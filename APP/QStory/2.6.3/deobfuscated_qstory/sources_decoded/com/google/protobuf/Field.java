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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Field extends GeneratedMessage implements InterfaceC3688 {
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
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Field");
        DEFAULT_INSTANCE = new Field();
        PARSER = new C3675();
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

    public static final C3663 getDescriptor() {
        return AbstractC3701.f11508;
    }

    public static C3301 newBuilder(Field field) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3688
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.defaultValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public ByteString getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.defaultValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3701.f11508;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.jsonName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public ByteString getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.jsonName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3688
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3688
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3688
    public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public boolean getPacked() {
        return this.packed_;
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
        int iM7632 = this.kind_ != Kind.TYPE_UNKNOWN.getNumber() ? AbstractC3462.m7632(1, this.kind_) : 0;
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iM7632 += AbstractC3462.m7632(2, this.cardinality_);
        }
        int i2 = this.number_;
        if (i2 != 0) {
            iM7632 += AbstractC3462.m7631(3, i2);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            iM7632 += GeneratedMessage.computeStringSize(4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            iM7632 += GeneratedMessage.computeStringSize(6, this.typeUrl_);
        }
        int i3 = this.oneofIndex_;
        if (i3 != 0) {
            iM7632 += AbstractC3462.m7631(7, i3);
        }
        if (this.packed_) {
            iM7632 += AbstractC3462.m7634(8);
        }
        int size = this.options_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM7632 += AbstractC3462.m7643(this.options_.get(i4));
        }
        int iComputeStringSize = iM7632 + size;
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

    @Override // com.google.protobuf.InterfaceC3688
    public String getTypeUrl() {
        Object obj = this.typeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.typeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3688
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM7503 = AbstractC3402.m7503(getPacked()) + ((((getOneofIndex() + ((((getTypeUrl().hashCode() + ((((getName().hashCode() + ((((getNumber() + ((((((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.kind_) * 37) + 2) * 53) + this.cardinality_) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
        if (getOptionsCount() > 0) {
            iM7503 = getOptionsList().hashCode() + AbstractC2442.m4571(iM7503, 37, 9, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getDefaultValue().hashCode() + ((((getJsonName().hashCode() + AbstractC2442.m4571(iM7503, 37, 10, 53)) * 37) + 11) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3701.f11507;
        c3619.m7827(Field.class, C3301.class);
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
    public C3301 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3301(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3301 toBuilder() {
        C3675 c3675 = null;
        return this == DEFAULT_INSTANCE ? new C3301(c3675) : new C3301(c3675).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (this.kind_ != Kind.TYPE_UNKNOWN.getNumber()) {
            abstractC3462.mo7651(1, this.kind_);
        }
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            abstractC3462.mo7651(2, this.cardinality_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC3462.mo7651(3, i);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC3462, 6, this.typeUrl_);
        }
        int i2 = this.oneofIndex_;
        if (i2 != 0) {
            abstractC3462.mo7651(7, i2);
        }
        boolean z = this.packed_;
        if (z) {
            abstractC3462.mo7663(8, z);
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC3462.mo7649(9, this.options_.get(i3));
        }
        if (!GeneratedMessage.isStringEmpty(this.jsonName_)) {
            GeneratedMessage.writeString(abstractC3462, 10, this.jsonName_);
        }
        if (!GeneratedMessage.isStringEmpty(this.defaultValue_)) {
            GeneratedMessage.writeString(abstractC3462, 11, this.defaultValue_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Field$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3301 extends GeneratedMessage.AbstractC3305 implements InterfaceC3688 {
        private int bitField0_;
        private int cardinality_;
        private Object defaultValue_;
        private Object jsonName_;
        private int kind_;
        private Object name_;
        private int number_;
        private int oneofIndex_;
        private C3363 optionsBuilder_;
        private List<Option> options_;
        private boolean packed_;
        private Object typeUrl_;

        private C3301() {
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
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                field.options_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3701.f11508;
        }

        private C3363 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3363(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3301 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3301 addOptions(Option.C3316 c3316) {
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
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) fieldBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Field buildPartial() {
            Field field = new Field(this, null);
            buildPartialRepeatedFields(field);
            if (this.bitField0_ != 0) {
                buildPartial0(field);
            }
            onBuilt();
            return field;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3301 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.number_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.oneofIndex_ = 0;
            this.packed_ = false;
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -129;
            this.jsonName_ = "";
            this.defaultValue_ = "";
            return this;
        }

        public C3301 clearCardinality() {
            this.bitField0_ &= -3;
            this.cardinality_ = 0;
            onChanged();
            return this;
        }

        public C3301 clearDefaultValue() {
            this.defaultValue_ = Field.getDefaultInstance().getDefaultValue();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3301 clearJsonName() {
            this.jsonName_ = Field.getDefaultInstance().getJsonName();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3301 clearKind() {
            this.bitField0_ &= -2;
            this.kind_ = 0;
            onChanged();
            return this;
        }

        public C3301 clearName() {
            this.name_ = Field.getDefaultInstance().getName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3301 clearNumber() {
            this.bitField0_ &= -5;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3301 clearOneofIndex() {
            this.bitField0_ &= -33;
            this.oneofIndex_ = 0;
            onChanged();
            return this;
        }

        public C3301 clearOptions() {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3301 clearPacked() {
            this.bitField0_ &= -65;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C3301 clearTypeUrl() {
            this.typeUrl_ = Field.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public Cardinality getCardinality() {
            Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
            return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public int getCardinalityValue() {
            return this.cardinality_;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.defaultValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3701.f11508;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.jsonName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public ByteString getJsonNameBytes() {
            Object obj = this.jsonName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jsonName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public Kind getKind() {
            Kind kindForNumber = Kind.forNumber(this.kind_);
            return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public int getKindValue() {
            return this.kind_;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.InterfaceC3688
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

        @Override // com.google.protobuf.InterfaceC3688
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3688
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3688
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3688
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3688
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3688
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3701.f11507;
            c3619.m7827(Field.class, C3301.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3301 mergeFrom(Field field) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = field.options_;
                    this.bitField0_ &= -129;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3363.m7462(field.options_);
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

        public C3301 removeOptions(int i) {
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

        public C3301 setCardinality(Cardinality cardinality) {
            cardinality.getClass();
            this.bitField0_ |= 2;
            this.cardinality_ = cardinality.getNumber();
            onChanged();
            return this;
        }

        public C3301 setCardinalityValue(int i) {
            this.cardinality_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3301 setDefaultValue(String str) {
            str.getClass();
            this.defaultValue_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3301 setDefaultValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.defaultValue_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3301 setJsonName(String str) {
            str.getClass();
            this.jsonName_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3301 setJsonNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.jsonName_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3301 setKind(Kind kind) {
            kind.getClass();
            this.bitField0_ |= 1;
            this.kind_ = kind.getNumber();
            onChanged();
            return this;
        }

        public C3301 setKindValue(int i) {
            this.kind_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3301 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3301 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3301 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3301 setOneofIndex(int i) {
            this.oneofIndex_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3301 setOptions(int i, Option.C3316 c3316) {
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

        public C3301 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3301 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3301 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Field getDefaultInstanceForType() {
            return Field.getDefaultInstance();
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3301(C3675 c3675) {
            this();
        }

        public /* synthetic */ C3301(InterfaceC3532 interfaceC3532, C3675 c3675) {
            this(interfaceC3532);
        }

        private C3301(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.jsonName_ = "";
            this.defaultValue_ = "";
        }

        public C3301 addOptions(int i, Option option) {
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

        public C3301 setOptions(int i, Option option) {
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

        public C3301 addOptions(Option option) {
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

        public C3301 addOptions(int i, Option.C3316 c3316) {
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
        public C3301 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Field) {
                return mergeFrom((Field) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3301 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        switch (iMo7705) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.kind_ = abstractC3474.mo7724();
                                this.bitField0_ |= 1;
                                break;
                            case 16:
                                this.cardinality_ = abstractC3474.mo7724();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.number_ = abstractC3474.mo7717();
                                this.bitField0_ |= 4;
                                break;
                            case 34:
                                this.name_ = abstractC3474.mo7706();
                                this.bitField0_ |= 8;
                                break;
                            case 50:
                                this.typeUrl_ = abstractC3474.mo7706();
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.oneofIndex_ = abstractC3474.mo7717();
                                this.bitField0_ |= 32;
                                break;
                            case 64:
                                this.packed_ = abstractC3474.mo7720();
                                this.bitField0_ |= 64;
                                break;
                            case 74:
                                Option option = (Option) abstractC3474.mo7715(Option.parser(), c3697);
                                C3363 c3363 = this.optionsBuilder_;
                                if (c3363 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3363.m7458(option);
                                }
                                break;
                            case 82:
                                this.jsonName_ = abstractC3474.mo7706();
                                this.bitField0_ |= 256;
                                break;
                            case 90:
                                this.defaultValue_ = abstractC3474.mo7706();
                                this.bitField0_ |= 512;
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Field getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Field parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3301 newBuilderForType() {
        return newBuilder();
    }

    public static C3301 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Field parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Field) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Field parseFrom(ByteString byteString) {
        return (Field) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Field parseFrom(ByteString byteString, C3697 c3697) {
        return (Field) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Cardinality implements InterfaceC3381 {
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
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Cardinality");
            internalValueMap = new C3674();
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

        public static C3666 getDescriptor() {
            return Field.getDescriptor().f11377[1];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static Cardinality valueOf(C3664 c3664) {
            if (c3664.f11384 == getDescriptor()) {
                int i = c3664.f11385;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C5925.m11310("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3666 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3399
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C5925.m11310("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C3664 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C5925.m11311("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C3666 descriptor = getDescriptor();
            return descriptor.f11394[ordinal()];
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Kind implements InterfaceC3381 {
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
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Kind");
            internalValueMap = new C3690();
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

        public static C3666 getDescriptor() {
            return Field.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static Kind valueOf(C3664 c3664) {
            if (c3664.f11384 == getDescriptor()) {
                int i = c3664.f11385;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C5925.m11310("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3666 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3399
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C5925.m11310("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C3664 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C5925.m11311("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C3666 descriptor = getDescriptor();
            return descriptor.f11394[ordinal()];
        }

        @Deprecated
        public static Kind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Field parseFrom(byte[] bArr, C3697 c3697) {
        return (Field) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, C3697 c3697) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Field parseFrom(AbstractC3474 abstractC3474) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Field parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private Field(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
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

    public /* synthetic */ Field(GeneratedMessage.AbstractC3305 abstractC3305, C3675 c3675) {
        this(abstractC3305);
    }
}

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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Field extends GeneratedMessage implements InterfaceC3687 {
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
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Field");
        DEFAULT_INSTANCE = new Field();
        PARSER = new C3674();
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

    public static final C3662 getDescriptor() {
        return AbstractC3700.f11503;
    }

    public static C3300 newBuilder(Field field) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3687
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.defaultValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public ByteString getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.defaultValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3700.f11503;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.jsonName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public ByteString getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.jsonName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3687
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3687
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3687
    public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public boolean getPacked() {
        return this.packed_;
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
        int iM7645 = this.kind_ != Kind.TYPE_UNKNOWN.getNumber() ? AbstractC3461.m7645(1, this.kind_) : 0;
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iM7645 += AbstractC3461.m7645(2, this.cardinality_);
        }
        int i2 = this.number_;
        if (i2 != 0) {
            iM7645 += AbstractC3461.m7644(3, i2);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            iM7645 += GeneratedMessage.computeStringSize(4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            iM7645 += GeneratedMessage.computeStringSize(6, this.typeUrl_);
        }
        int i3 = this.oneofIndex_;
        if (i3 != 0) {
            iM7645 += AbstractC3461.m7644(7, i3);
        }
        if (this.packed_) {
            iM7645 += AbstractC3461.m7647(8);
        }
        int size = this.options_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM7645 += AbstractC3461.m7656(this.options_.get(i4));
        }
        int iComputeStringSize = iM7645 + size;
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

    @Override // com.google.protobuf.InterfaceC3687
    public String getTypeUrl() {
        Object obj = this.typeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.typeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3687
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM7516 = AbstractC3401.m7516(getPacked()) + ((((getOneofIndex() + ((((getTypeUrl().hashCode() + ((((getName().hashCode() + ((((getNumber() + ((((((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.kind_) * 37) + 2) * 53) + this.cardinality_) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
        if (getOptionsCount() > 0) {
            iM7516 = getOptionsList().hashCode() + AbstractC2442.m4561(iM7516, 37, 9, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getDefaultValue().hashCode() + ((((getJsonName().hashCode() + AbstractC2442.m4561(iM7516, 37, 10, 53)) * 37) + 11) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3700.f11502;
        c3618.m7840(Field.class, C3300.class);
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
    public C3300 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3300(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3300 toBuilder() {
        C3674 c3674 = null;
        return this == DEFAULT_INSTANCE ? new C3300(c3674) : new C3300(c3674).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (this.kind_ != Kind.TYPE_UNKNOWN.getNumber()) {
            abstractC3461.mo7664(1, this.kind_);
        }
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            abstractC3461.mo7664(2, this.cardinality_);
        }
        int i = this.number_;
        if (i != 0) {
            abstractC3461.mo7664(3, i);
        }
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 4, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC3461, 6, this.typeUrl_);
        }
        int i2 = this.oneofIndex_;
        if (i2 != 0) {
            abstractC3461.mo7664(7, i2);
        }
        boolean z = this.packed_;
        if (z) {
            abstractC3461.mo7676(8, z);
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC3461.mo7662(9, this.options_.get(i3));
        }
        if (!GeneratedMessage.isStringEmpty(this.jsonName_)) {
            GeneratedMessage.writeString(abstractC3461, 10, this.jsonName_);
        }
        if (!GeneratedMessage.isStringEmpty(this.defaultValue_)) {
            GeneratedMessage.writeString(abstractC3461, 11, this.defaultValue_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Field$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3300 extends GeneratedMessage.AbstractC3304 implements InterfaceC3687 {
        private int bitField0_;
        private int cardinality_;
        private Object defaultValue_;
        private Object jsonName_;
        private int kind_;
        private Object name_;
        private int number_;
        private int oneofIndex_;
        private C3362 optionsBuilder_;
        private List<Option> options_;
        private boolean packed_;
        private Object typeUrl_;

        private C3300() {
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
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                field.options_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3700.f11503;
        }

        private C3362 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3362(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3300 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3300 addOptions(Option.C3315 c3315) {
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
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) fieldBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Field buildPartial() {
            Field field = new Field(this, null);
            buildPartialRepeatedFields(field);
            if (this.bitField0_ != 0) {
                buildPartial0(field);
            }
            onBuilt();
            return field;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3300 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.number_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.oneofIndex_ = 0;
            this.packed_ = false;
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -129;
            this.jsonName_ = "";
            this.defaultValue_ = "";
            return this;
        }

        public C3300 clearCardinality() {
            this.bitField0_ &= -3;
            this.cardinality_ = 0;
            onChanged();
            return this;
        }

        public C3300 clearDefaultValue() {
            this.defaultValue_ = Field.getDefaultInstance().getDefaultValue();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3300 clearJsonName() {
            this.jsonName_ = Field.getDefaultInstance().getJsonName();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3300 clearKind() {
            this.bitField0_ &= -2;
            this.kind_ = 0;
            onChanged();
            return this;
        }

        public C3300 clearName() {
            this.name_ = Field.getDefaultInstance().getName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3300 clearNumber() {
            this.bitField0_ &= -5;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C3300 clearOneofIndex() {
            this.bitField0_ &= -33;
            this.oneofIndex_ = 0;
            onChanged();
            return this;
        }

        public C3300 clearOptions() {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3300 clearPacked() {
            this.bitField0_ &= -65;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C3300 clearTypeUrl() {
            this.typeUrl_ = Field.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public Cardinality getCardinality() {
            Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
            return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public int getCardinalityValue() {
            return this.cardinality_;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.defaultValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3700.f11503;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.jsonName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public ByteString getJsonNameBytes() {
            Object obj = this.jsonName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jsonName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public Kind getKind() {
            Kind kindForNumber = Kind.forNumber(this.kind_);
            return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public int getKindValue() {
            return this.kind_;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.InterfaceC3687
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

        @Override // com.google.protobuf.InterfaceC3687
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3687
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3687
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3687
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3687
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3687
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3700.f11502;
            c3618.m7840(Field.class, C3300.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3300 mergeFrom(Field field) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = field.options_;
                    this.bitField0_ &= -129;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3362.m7475(field.options_);
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

        public C3300 removeOptions(int i) {
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

        public C3300 setCardinality(Cardinality cardinality) {
            cardinality.getClass();
            this.bitField0_ |= 2;
            this.cardinality_ = cardinality.getNumber();
            onChanged();
            return this;
        }

        public C3300 setCardinalityValue(int i) {
            this.cardinality_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3300 setDefaultValue(String str) {
            str.getClass();
            this.defaultValue_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3300 setDefaultValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.defaultValue_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3300 setJsonName(String str) {
            str.getClass();
            this.jsonName_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3300 setJsonNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.jsonName_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3300 setKind(Kind kind) {
            kind.getClass();
            this.bitField0_ |= 1;
            this.kind_ = kind.getNumber();
            onChanged();
            return this;
        }

        public C3300 setKindValue(int i) {
            this.kind_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3300 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3300 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3300 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3300 setOneofIndex(int i) {
            this.oneofIndex_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3300 setOptions(int i, Option.C3315 c3315) {
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

        public C3300 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3300 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3300 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Field getDefaultInstanceForType() {
            return Field.getDefaultInstance();
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3300(C3674 c3674) {
            this();
        }

        public /* synthetic */ C3300(InterfaceC3531 interfaceC3531, C3674 c3674) {
            this(interfaceC3531);
        }

        private C3300(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.kind_ = 0;
            this.cardinality_ = 0;
            this.name_ = "";
            this.typeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.jsonName_ = "";
            this.defaultValue_ = "";
        }

        public C3300 addOptions(int i, Option option) {
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

        public C3300 setOptions(int i, Option option) {
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

        public C3300 addOptions(Option option) {
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

        public C3300 addOptions(int i, Option.C3315 c3315) {
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
        public C3300 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Field) {
                return mergeFrom((Field) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3300 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        switch (iMo7718) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.kind_ = abstractC3473.mo7737();
                                this.bitField0_ |= 1;
                                break;
                            case 16:
                                this.cardinality_ = abstractC3473.mo7737();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.number_ = abstractC3473.mo7730();
                                this.bitField0_ |= 4;
                                break;
                            case 34:
                                this.name_ = abstractC3473.mo7719();
                                this.bitField0_ |= 8;
                                break;
                            case 50:
                                this.typeUrl_ = abstractC3473.mo7719();
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.oneofIndex_ = abstractC3473.mo7730();
                                this.bitField0_ |= 32;
                                break;
                            case 64:
                                this.packed_ = abstractC3473.mo7733();
                                this.bitField0_ |= 64;
                                break;
                            case 74:
                                Option option = (Option) abstractC3473.mo7728(Option.parser(), c3696);
                                C3362 c3362 = this.optionsBuilder_;
                                if (c3362 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3362.m7471(option);
                                }
                                break;
                            case 82:
                                this.jsonName_ = abstractC3473.mo7719();
                                this.bitField0_ |= 256;
                                break;
                            case 90:
                                this.defaultValue_ = abstractC3473.mo7719();
                                this.bitField0_ |= 512;
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Field getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Field parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Field) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3300 newBuilderForType() {
        return newBuilder();
    }

    public static C3300 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Field parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Field) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Field parseFrom(ByteString byteString) {
        return (Field) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Field parseFrom(ByteString byteString, C3696 c3696) {
        return (Field) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Cardinality implements InterfaceC3380 {
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
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Cardinality");
            internalValueMap = new C3673();
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

        public static C3665 getDescriptor() {
            return Field.getDescriptor().f11372[1];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static Cardinality valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                int i = c3663.f11380;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C5919.m11249("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C3663 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C5919.m11250("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Kind implements InterfaceC3380 {
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
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Kind");
            internalValueMap = new C3689();
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

        public static C3665 getDescriptor() {
            return Field.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static Kind valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                int i = c3663.f11380;
                return i == -1 ? UNRECOGNIZED : VALUES[i];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            C5919.m11249("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final C3663 getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                C5919.m11250("Can't get the descriptor of an unrecognized enum value.");
                return null;
            }
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static Kind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Field parseFrom(byte[] bArr, C3696 c3696) {
        return (Field) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, C3696 c3696) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Field parseFrom(AbstractC3473 abstractC3473) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Field parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Field) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private Field(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
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

    public /* synthetic */ Field(GeneratedMessage.AbstractC3304 abstractC3304, C3674 c3674) {
        this(abstractC3304);
    }
}

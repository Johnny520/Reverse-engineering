package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Value extends GeneratedMessage implements InterfaceC3721 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Value");
        DEFAULT_INSTANCE = new Value();
        PARSER = new C3722();
    }

    private Value(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3336.f10952;
    }

    public static C3323 newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return super.equals(obj);
        }
        Value value = (Value) obj;
        if (!getKindCase().equals(value.getKindCase())) {
            return false;
        }
        switch (this.kindCase_) {
            case 1:
                if (getNullValueValue() != value.getNullValueValue()) {
                    return false;
                }
                break;
            case 2:
                if (Double.doubleToLongBits(getNumberValue()) != Double.doubleToLongBits(value.getNumberValue())) {
                    return false;
                }
                break;
            case 3:
                if (!getStringValue().equals(value.getStringValue())) {
                    return false;
                }
                break;
            case 4:
                if (getBoolValue() != value.getBoolValue()) {
                    return false;
                }
                break;
            case 5:
                if (!getStructValue().equals(value.getStructValue())) {
                    return false;
                }
                break;
            case 6:
                if (!getListValue().equals(value.getListValue())) {
                    return false;
                }
                break;
        }
        return getUnknownFields().equals(value.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3336.f10952;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.InterfaceC3721
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3721
    public InterfaceC3430 getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3721
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
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
        int iM7645 = this.kindCase_ == 1 ? AbstractC3461.m7645(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            ((Double) this.kind_).getClass();
            iM7645 += AbstractC3461.m7655(2) + 8;
        }
        if (this.kindCase_ == 3) {
            iM7645 += GeneratedMessage.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            ((Boolean) this.kind_).getClass();
            iM7645 += AbstractC3461.m7647(4);
        }
        if (this.kindCase_ == 5) {
            iM7645 += AbstractC3461.m7652(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iM7645 += AbstractC3461.m7652(6, (ListValue) this.kind_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7645;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public String getStringValue() {
        if (this.kindCase_ != 3) {
            return "";
        }
        Object obj = this.kind_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.kind_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public ByteString getStringValueBytes() {
        if (this.kindCase_ != 3) {
            return ByteString.copyFromUtf8("");
        }
        Object obj = this.kind_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.kind_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3721
    public InterfaceC3335 getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.InterfaceC3721
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int iM4561;
        int nullValueValue;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        switch (this.kindCase_) {
            case 1:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 1, 53);
                nullValueValue = getNullValueValue();
                break;
            case 2:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 2, 53);
                nullValueValue = AbstractC3401.m7515(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 3, 53);
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 4, 53);
                nullValueValue = AbstractC3401.m7516(getBoolValue());
                break;
            case 5:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 5, 53);
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                iM4561 = AbstractC2442.m4561(iHashCode, 37, 6, 53);
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = iM4561 + nullValueValue;
        int iHashCode22 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3336.f10951;
        c3618.m7840(Value.class, C3323.class);
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
    public C3323 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3323(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3323 toBuilder() {
        C3722 c3722 = null;
        return this == DEFAULT_INSTANCE ? new C3323(c3722) : new C3323(c3722).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (this.kindCase_ == 1) {
            abstractC3461.mo7664(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            abstractC3461.m7677(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessage.writeString(abstractC3461, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            abstractC3461.mo7676(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            abstractC3461.mo7662(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            abstractC3461.mo7662(6, (ListValue) this.kind_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3323 extends GeneratedMessage.AbstractC3304 implements InterfaceC3721 {
        private int bitField0_;
        private int kindCase_;
        private Object kind_;
        private C3341 listValueBuilder_;
        private C3341 structValueBuilder_;

        private C3323() {
            this.kindCase_ = 0;
        }

        private void buildPartialOneofs(Value value) {
            C3341 c3341;
            C3341 c33412;
            value.kindCase_ = this.kindCase_;
            value.kind_ = this.kind_;
            if (this.kindCase_ == 5 && (c33412 = this.structValueBuilder_) != null) {
                value.kind_ = c33412.m7397();
            }
            if (this.kindCase_ != 6 || (c3341 = this.listValueBuilder_) == null) {
                return;
            }
            value.kind_ = c3341.m7397();
        }

        public static final C3662 getDescriptor() {
            return AbstractC3336.f10952;
        }

        private C3341 internalGetListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new C3341((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private C3341 internalGetStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new C3341((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) valueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Value buildPartial() {
            Value value = new Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(value);
            }
            buildPartialOneofs(value);
            onBuilt();
            return value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3323 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3341 c3341 = this.structValueBuilder_;
            if (c3341 != null) {
                c3341.m7396();
            }
            C3341 c33412 = this.listValueBuilder_;
            if (c33412 != null) {
                c33412.m7396();
            }
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        public C3323 clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3323 clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public C3323 clearListValue() {
            C3341 c3341 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c3341 == null) {
                if (i == 6) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 6) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            c3341.m7396();
            return this;
        }

        public C3323 clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3323 clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3323 clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3323 clearStructValue() {
            C3341 c3341 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c3341 == null) {
                if (i == 5) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 5) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            c3341.m7396();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3336.f10952;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        @Override // com.google.protobuf.InterfaceC3721
        public ListValue getListValue() {
            C3341 c3341 = this.listValueBuilder_;
            int i = this.kindCase_;
            return c3341 == null ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : i == 6 ? (ListValue) c3341.m7393() : ListValue.getDefaultInstance();
        }

        public ListValue.C3312 getListValueBuilder() {
            return (ListValue.C3312) internalGetListValueFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3721
        public InterfaceC3430 getListValueOrBuilder() {
            C3341 c3341;
            int i = this.kindCase_;
            return (i != 6 || (c3341 = this.listValueBuilder_) == null) ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : (InterfaceC3430) c3341.m7392();
        }

        @Override // com.google.protobuf.InterfaceC3721
        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
            return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public String getStringValue() {
            if (this.kindCase_ != 3) {
                return "";
            }
            Object obj = this.kind_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kind_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public ByteString getStringValueBytes() {
            if (this.kindCase_ != 3) {
                return ByteString.copyFromUtf8("");
            }
            Object obj = this.kind_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kind_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public Struct getStructValue() {
            C3341 c3341 = this.structValueBuilder_;
            int i = this.kindCase_;
            return c3341 == null ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : i == 5 ? (Struct) c3341.m7393() : Struct.getDefaultInstance();
        }

        public Struct.C3318 getStructValueBuilder() {
            return (Struct.C3318) internalGetStructValueFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3721
        public InterfaceC3335 getStructValueOrBuilder() {
            C3341 c3341;
            int i = this.kindCase_;
            return (i != 5 || (c3341 = this.structValueBuilder_) == null) ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : (InterfaceC3335) c3341.m7392();
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasBoolValue() {
            return this.kindCase_ == 4;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasNullValue() {
            return this.kindCase_ == 1;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasNumberValue() {
            return this.kindCase_ == 2;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasStringValue() {
            return this.kindCase_ == 3;
        }

        @Override // com.google.protobuf.InterfaceC3721
        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3336.f10951;
            c3618.m7840(Value.class, C3323.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3323 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                int iMo7737 = abstractC3473.mo7737();
                                this.kindCase_ = 1;
                                this.kind_ = Integer.valueOf(iMo7737);
                            } else if (iMo7718 == 17) {
                                this.kind_ = Double.valueOf(abstractC3473.mo7736());
                                this.kindCase_ = 2;
                            } else if (iMo7718 == 26) {
                                this.kindCase_ = 3;
                                this.kind_ = abstractC3473.mo7719();
                            } else if (iMo7718 == 32) {
                                this.kind_ = Boolean.valueOf(abstractC3473.mo7733());
                                this.kindCase_ = 4;
                            } else if (iMo7718 == 42) {
                                abstractC3473.mo7729(internalGetStructValueFieldBuilder().m7394(), c3696);
                                this.kindCase_ = 5;
                            } else if (iMo7718 == 50) {
                                abstractC3473.mo7729(internalGetListValueFieldBuilder().m7394(), c3696);
                                this.kindCase_ = 6;
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

        public C3323 mergeListValue(ListValue listValue) {
            C3341 c3341 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c3341 == null) {
                if (i != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else if (i == 6) {
                c3341.m7399(listValue);
            } else {
                c3341.m7400(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3323 mergeStructValue(Struct struct) {
            C3341 c3341 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c3341 == null) {
                if (i != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else if (i == 5) {
                c3341.m7399(struct);
            } else {
                c3341.m7400(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public C3323 setBoolValue(boolean z) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        public C3323 setListValue(ListValue.C3312 c3312) {
            C3341 c3341 = this.listValueBuilder_;
            if (c3341 == null) {
                this.kind_ = c3312.build();
                onChanged();
            } else {
                c3341.m7400(c3312.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3323 setNullValue(NullValue nullValue) {
            nullValue.getClass();
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public C3323 setNullValueValue(int i) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public C3323 setNumberValue(double d) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d);
            onChanged();
            return this;
        }

        public C3323 setStringValue(String str) {
            str.getClass();
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public C3323 setStringValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public C3323 setStructValue(Struct.C3318 c3318) {
            C3341 c3341 = this.structValueBuilder_;
            if (c3341 == null) {
                this.kind_ = c3318.build();
                onChanged();
            } else {
                c3341.m7400(c3318.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        public /* synthetic */ C3323(C3722 c3722) {
            this();
        }

        public /* synthetic */ C3323(InterfaceC3531 interfaceC3531, C3722 c3722) {
            this(interfaceC3531);
        }

        private C3323(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.kindCase_ = 0;
        }

        private void buildPartial0(Value value) {
        }

        public C3323 setListValue(ListValue listValue) {
            C3341 c3341 = this.listValueBuilder_;
            if (c3341 == null) {
                listValue.getClass();
                this.kind_ = listValue;
                onChanged();
            } else {
                c3341.m7400(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3323 setStructValue(Struct struct) {
            C3341 c3341 = this.structValueBuilder_;
            if (c3341 == null) {
                struct.getClass();
                this.kind_ = struct;
                onChanged();
            } else {
                c3341.m7400(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3323 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Value) {
                return mergeFrom((Value) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3323 mergeFrom(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            int iOrdinal = value.getKindCase().ordinal();
            if (iOrdinal == 0) {
                setNullValueValue(value.getNullValueValue());
            } else if (iOrdinal == 1) {
                setNumberValue(value.getNumberValue());
            } else if (iOrdinal == 2) {
                this.kindCase_ = 3;
                this.kind_ = value.kind_;
                onChanged();
            } else if (iOrdinal == 3) {
                setBoolValue(value.getBoolValue());
            } else if (iOrdinal == 4) {
                mergeStructValue(value.getStructValue());
            } else if (iOrdinal == 5) {
                mergeListValue(value.getListValue());
            }
            mergeUnknownFields(value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum KindCase implements InterfaceC3398 {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i) {
            this.value = i;
        }

        public static KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3398
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Value parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3323 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Value(GeneratedMessage.AbstractC3304 abstractC3304, C3722 c3722) {
        this(abstractC3304);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3323 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Value) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Value parseFrom(ByteString byteString) {
        return (Value) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Value parseFrom(ByteString byteString, C3696 c3696) {
        return (Value) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Value parseFrom(byte[] bArr, C3696 c3696) {
        return (Value) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, C3696 c3696) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Value parseFrom(AbstractC3473 abstractC3473) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Value parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

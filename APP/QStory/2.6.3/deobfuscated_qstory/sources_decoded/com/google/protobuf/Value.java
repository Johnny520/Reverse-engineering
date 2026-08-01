package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Value extends GeneratedMessage implements InterfaceC3722 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Value");
        DEFAULT_INSTANCE = new Value();
        PARSER = new C3723();
    }

    private Value(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3337.f10957;
    }

    public static C3324 newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3722
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3337.f10957;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.InterfaceC3722
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3722
    public InterfaceC3431 getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3722
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
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
        int iM7632 = this.kindCase_ == 1 ? AbstractC3462.m7632(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            ((Double) this.kind_).getClass();
            iM7632 += AbstractC3462.m7642(2) + 8;
        }
        if (this.kindCase_ == 3) {
            iM7632 += GeneratedMessage.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            ((Boolean) this.kind_).getClass();
            iM7632 += AbstractC3462.m7634(4);
        }
        if (this.kindCase_ == 5) {
            iM7632 += AbstractC3462.m7639(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iM7632 += AbstractC3462.m7639(6, (ListValue) this.kind_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7632;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3722
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

    @Override // com.google.protobuf.InterfaceC3722
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

    @Override // com.google.protobuf.InterfaceC3722
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3722
    public InterfaceC3336 getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.InterfaceC3722
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int iM4571;
        int nullValueValue;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        switch (this.kindCase_) {
            case 1:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 1, 53);
                nullValueValue = getNullValueValue();
                break;
            case 2:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 2, 53);
                nullValueValue = AbstractC3402.m7502(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 3, 53);
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 4, 53);
                nullValueValue = AbstractC3402.m7503(getBoolValue());
                break;
            case 5:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 5, 53);
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                iM4571 = AbstractC2442.m4571(iHashCode, 37, 6, 53);
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = iM4571 + nullValueValue;
        int iHashCode22 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3337.f10956;
        c3619.m7827(Value.class, C3324.class);
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
    public C3324 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3324(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3324 toBuilder() {
        C3723 c3723 = null;
        return this == DEFAULT_INSTANCE ? new C3324(c3723) : new C3324(c3723).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (this.kindCase_ == 1) {
            abstractC3462.mo7651(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            abstractC3462.m7664(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessage.writeString(abstractC3462, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            abstractC3462.mo7663(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            abstractC3462.mo7649(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            abstractC3462.mo7649(6, (ListValue) this.kind_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3324 extends GeneratedMessage.AbstractC3305 implements InterfaceC3722 {
        private int bitField0_;
        private int kindCase_;
        private Object kind_;
        private C3342 listValueBuilder_;
        private C3342 structValueBuilder_;

        private C3324() {
            this.kindCase_ = 0;
        }

        private void buildPartialOneofs(Value value) {
            C3342 c3342;
            C3342 c33422;
            value.kindCase_ = this.kindCase_;
            value.kind_ = this.kind_;
            if (this.kindCase_ == 5 && (c33422 = this.structValueBuilder_) != null) {
                value.kind_ = c33422.m7384();
            }
            if (this.kindCase_ != 6 || (c3342 = this.listValueBuilder_) == null) {
                return;
            }
            value.kind_ = c3342.m7384();
        }

        public static final C3663 getDescriptor() {
            return AbstractC3337.f10957;
        }

        private C3342 internalGetListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new C3342((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private C3342 internalGetStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new C3342((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) valueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Value buildPartial() {
            Value value = new Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(value);
            }
            buildPartialOneofs(value);
            onBuilt();
            return value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3324 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3342 c3342 = this.structValueBuilder_;
            if (c3342 != null) {
                c3342.m7383();
            }
            C3342 c33422 = this.listValueBuilder_;
            if (c33422 != null) {
                c33422.m7383();
            }
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        public C3324 clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3324 clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public C3324 clearListValue() {
            C3342 c3342 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c3342 == null) {
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
            c3342.m7383();
            return this;
        }

        public C3324 clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3324 clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3324 clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C3324 clearStructValue() {
            C3342 c3342 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c3342 == null) {
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
            c3342.m7383();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3337.f10957;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        @Override // com.google.protobuf.InterfaceC3722
        public ListValue getListValue() {
            C3342 c3342 = this.listValueBuilder_;
            int i = this.kindCase_;
            return c3342 == null ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : i == 6 ? (ListValue) c3342.m7380() : ListValue.getDefaultInstance();
        }

        public ListValue.C3313 getListValueBuilder() {
            return (ListValue.C3313) internalGetListValueFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3722
        public InterfaceC3431 getListValueOrBuilder() {
            C3342 c3342;
            int i = this.kindCase_;
            return (i != 6 || (c3342 = this.listValueBuilder_) == null) ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : (InterfaceC3431) c3342.m7379();
        }

        @Override // com.google.protobuf.InterfaceC3722
        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
            return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.google.protobuf.InterfaceC3722
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

        @Override // com.google.protobuf.InterfaceC3722
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

        @Override // com.google.protobuf.InterfaceC3722
        public Struct getStructValue() {
            C3342 c3342 = this.structValueBuilder_;
            int i = this.kindCase_;
            return c3342 == null ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : i == 5 ? (Struct) c3342.m7380() : Struct.getDefaultInstance();
        }

        public Struct.C3319 getStructValueBuilder() {
            return (Struct.C3319) internalGetStructValueFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3722
        public InterfaceC3336 getStructValueOrBuilder() {
            C3342 c3342;
            int i = this.kindCase_;
            return (i != 5 || (c3342 = this.structValueBuilder_) == null) ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : (InterfaceC3336) c3342.m7379();
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasBoolValue() {
            return this.kindCase_ == 4;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasNullValue() {
            return this.kindCase_ == 1;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasNumberValue() {
            return this.kindCase_ == 2;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasStringValue() {
            return this.kindCase_ == 3;
        }

        @Override // com.google.protobuf.InterfaceC3722
        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3337.f10956;
            c3619.m7827(Value.class, C3324.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3324 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                int iMo7724 = abstractC3474.mo7724();
                                this.kindCase_ = 1;
                                this.kind_ = Integer.valueOf(iMo7724);
                            } else if (iMo7705 == 17) {
                                this.kind_ = Double.valueOf(abstractC3474.mo7723());
                                this.kindCase_ = 2;
                            } else if (iMo7705 == 26) {
                                this.kindCase_ = 3;
                                this.kind_ = abstractC3474.mo7706();
                            } else if (iMo7705 == 32) {
                                this.kind_ = Boolean.valueOf(abstractC3474.mo7720());
                                this.kindCase_ = 4;
                            } else if (iMo7705 == 42) {
                                abstractC3474.mo7716(internalGetStructValueFieldBuilder().m7381(), c3697);
                                this.kindCase_ = 5;
                            } else if (iMo7705 == 50) {
                                abstractC3474.mo7716(internalGetListValueFieldBuilder().m7381(), c3697);
                                this.kindCase_ = 6;
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

        public C3324 mergeListValue(ListValue listValue) {
            C3342 c3342 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c3342 == null) {
                if (i != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else if (i == 6) {
                c3342.m7386(listValue);
            } else {
                c3342.m7387(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3324 mergeStructValue(Struct struct) {
            C3342 c3342 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c3342 == null) {
                if (i != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else if (i == 5) {
                c3342.m7386(struct);
            } else {
                c3342.m7387(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public C3324 setBoolValue(boolean z) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        public C3324 setListValue(ListValue.C3313 c3313) {
            C3342 c3342 = this.listValueBuilder_;
            if (c3342 == null) {
                this.kind_ = c3313.build();
                onChanged();
            } else {
                c3342.m7387(c3313.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3324 setNullValue(NullValue nullValue) {
            nullValue.getClass();
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public C3324 setNullValueValue(int i) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public C3324 setNumberValue(double d) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d);
            onChanged();
            return this;
        }

        public C3324 setStringValue(String str) {
            str.getClass();
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public C3324 setStringValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public C3324 setStructValue(Struct.C3319 c3319) {
            C3342 c3342 = this.structValueBuilder_;
            if (c3342 == null) {
                this.kind_ = c3319.build();
                onChanged();
            } else {
                c3342.m7387(c3319.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        public /* synthetic */ C3324(C3723 c3723) {
            this();
        }

        public /* synthetic */ C3324(InterfaceC3532 interfaceC3532, C3723 c3723) {
            this(interfaceC3532);
        }

        private C3324(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.kindCase_ = 0;
        }

        private void buildPartial0(Value value) {
        }

        public C3324 setListValue(ListValue listValue) {
            C3342 c3342 = this.listValueBuilder_;
            if (c3342 == null) {
                listValue.getClass();
                this.kind_ = listValue;
                onChanged();
            } else {
                c3342.m7387(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C3324 setStructValue(Struct struct) {
            C3342 c3342 = this.structValueBuilder_;
            if (c3342 == null) {
                struct.getClass();
                this.kind_ = struct;
                onChanged();
            } else {
                c3342.m7387(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3324 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Value) {
                return mergeFrom((Value) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3324 mergeFrom(Value value) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum KindCase implements InterfaceC3399 {
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

        @Override // com.google.protobuf.InterfaceC3399
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Value parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3324 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Value(GeneratedMessage.AbstractC3305 abstractC3305, C3723 c3723) {
        this(abstractC3305);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3324 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Value) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Value parseFrom(ByteString byteString) {
        return (Value) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Value parseFrom(ByteString byteString, C3697 c3697) {
        return (Value) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Value parseFrom(byte[] bArr, C3697 c3697) {
        return (Value) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, C3697 c3697) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Value parseFrom(AbstractC3474 abstractC3474) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Value parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

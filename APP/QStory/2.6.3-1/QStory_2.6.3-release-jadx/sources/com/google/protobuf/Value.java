package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Value extends GeneratedMessage implements InterfaceC4554 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Value");
        DEFAULT_INSTANCE = new Value();
        PARSER = new C4555();
    }

    private Value(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4169.f11302;
    }

    public static C4156 newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.InterfaceC4554
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4169.f11302;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.InterfaceC4554
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC4554
    public InterfaceC4263 getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC4554
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
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
        int iM8191 = this.kindCase_ == 1 ? AbstractC4294.m8191(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            ((Double) this.kind_).getClass();
            iM8191 += AbstractC4294.m8201(2) + 8;
        }
        if (this.kindCase_ == 3) {
            iM8191 += GeneratedMessage.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            ((Boolean) this.kind_).getClass();
            iM8191 += AbstractC4294.m8193(4);
        }
        if (this.kindCase_ == 5) {
            iM8191 += AbstractC4294.m8198(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iM8191 += AbstractC4294.m8198(6, (ListValue) this.kind_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8191;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4554
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

    @Override // com.google.protobuf.InterfaceC4554
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

    @Override // com.google.protobuf.InterfaceC4554
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC4554
    public InterfaceC4168 getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.InterfaceC4554
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int iM5131;
        int nullValueValue;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        switch (this.kindCase_) {
            case 1:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 1, 53);
                nullValueValue = getNullValueValue();
                break;
            case 2:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 2, 53);
                nullValueValue = AbstractC4234.m8061(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 3, 53);
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 4, 53);
                nullValueValue = AbstractC4234.m8062(getBoolValue());
                break;
            case 5:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 5, 53);
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                iM5131 = AbstractC3275.m5131(iHashCode, 37, 6, 53);
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = iM5131 + nullValueValue;
        int iHashCode22 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4169.f11301;
        c4451.m8386(Value.class, C4156.class);
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
    public C4156 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4156(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4156 toBuilder() {
        C4555 c4555 = null;
        return this == DEFAULT_INSTANCE ? new C4156(c4555) : new C4156(c4555).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (this.kindCase_ == 1) {
            abstractC4294.mo8210(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            abstractC4294.m8223(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessage.writeString(abstractC4294, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            abstractC4294.mo8222(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            abstractC4294.mo8208(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            abstractC4294.mo8208(6, (ListValue) this.kind_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4156 extends GeneratedMessage.AbstractC4137 implements InterfaceC4554 {
        private int bitField0_;
        private int kindCase_;
        private Object kind_;
        private C4174 listValueBuilder_;
        private C4174 structValueBuilder_;

        private C4156() {
            this.kindCase_ = 0;
        }

        private void buildPartialOneofs(Value value) {
            C4174 c4174;
            C4174 c41742;
            value.kindCase_ = this.kindCase_;
            value.kind_ = this.kind_;
            if (this.kindCase_ == 5 && (c41742 = this.structValueBuilder_) != null) {
                value.kind_ = c41742.m7943();
            }
            if (this.kindCase_ != 6 || (c4174 = this.listValueBuilder_) == null) {
                return;
            }
            value.kind_ = c4174.m7943();
        }

        public static final C4495 getDescriptor() {
            return AbstractC4169.f11302;
        }

        private C4174 internalGetListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new C4174((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private C4174 internalGetStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new C4174((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) valueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Value buildPartial() {
            Value value = new Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(value);
            }
            buildPartialOneofs(value);
            onBuilt();
            return value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4156 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4174 c4174 = this.structValueBuilder_;
            if (c4174 != null) {
                c4174.m7942();
            }
            C4174 c41742 = this.listValueBuilder_;
            if (c41742 != null) {
                c41742.m7942();
            }
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        public C4156 clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C4156 clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public C4156 clearListValue() {
            C4174 c4174 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c4174 == null) {
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
            c4174.m7942();
            return this;
        }

        public C4156 clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C4156 clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C4156 clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public C4156 clearStructValue() {
            C4174 c4174 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c4174 == null) {
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
            c4174.m7942();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4169.f11302;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        @Override // com.google.protobuf.InterfaceC4554
        public ListValue getListValue() {
            C4174 c4174 = this.listValueBuilder_;
            int i = this.kindCase_;
            return c4174 == null ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : i == 6 ? (ListValue) c4174.m7939() : ListValue.getDefaultInstance();
        }

        public ListValue.C4145 getListValueBuilder() {
            return (ListValue.C4145) internalGetListValueFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4554
        public InterfaceC4263 getListValueOrBuilder() {
            C4174 c4174;
            int i = this.kindCase_;
            return (i != 6 || (c4174 = this.listValueBuilder_) == null) ? i == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : (InterfaceC4263) c4174.m7938();
        }

        @Override // com.google.protobuf.InterfaceC4554
        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
            return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.google.protobuf.InterfaceC4554
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

        @Override // com.google.protobuf.InterfaceC4554
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

        @Override // com.google.protobuf.InterfaceC4554
        public Struct getStructValue() {
            C4174 c4174 = this.structValueBuilder_;
            int i = this.kindCase_;
            return c4174 == null ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : i == 5 ? (Struct) c4174.m7939() : Struct.getDefaultInstance();
        }

        public Struct.C4151 getStructValueBuilder() {
            return (Struct.C4151) internalGetStructValueFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4554
        public InterfaceC4168 getStructValueOrBuilder() {
            C4174 c4174;
            int i = this.kindCase_;
            return (i != 5 || (c4174 = this.structValueBuilder_) == null) ? i == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : (InterfaceC4168) c4174.m7938();
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasBoolValue() {
            return this.kindCase_ == 4;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasNullValue() {
            return this.kindCase_ == 1;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasNumberValue() {
            return this.kindCase_ == 2;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasStringValue() {
            return this.kindCase_ == 3;
        }

        @Override // com.google.protobuf.InterfaceC4554
        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4169.f11301;
            c4451.m8386(Value.class, C4156.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4156 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                int iMo8283 = abstractC4306.mo8283();
                                this.kindCase_ = 1;
                                this.kind_ = Integer.valueOf(iMo8283);
                            } else if (iMo8264 == 17) {
                                this.kind_ = Double.valueOf(abstractC4306.mo8282());
                                this.kindCase_ = 2;
                            } else if (iMo8264 == 26) {
                                this.kindCase_ = 3;
                                this.kind_ = abstractC4306.mo8265();
                            } else if (iMo8264 == 32) {
                                this.kind_ = Boolean.valueOf(abstractC4306.mo8279());
                                this.kindCase_ = 4;
                            } else if (iMo8264 == 42) {
                                abstractC4306.mo8275(internalGetStructValueFieldBuilder().m7940(), c4529);
                                this.kindCase_ = 5;
                            } else if (iMo8264 == 50) {
                                abstractC4306.mo8275(internalGetListValueFieldBuilder().m7940(), c4529);
                                this.kindCase_ = 6;
                            } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

        public C4156 mergeListValue(ListValue listValue) {
            C4174 c4174 = this.listValueBuilder_;
            int i = this.kindCase_;
            if (c4174 == null) {
                if (i != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else if (i == 6) {
                c4174.m7945(listValue);
            } else {
                c4174.m7946(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C4156 mergeStructValue(Struct struct) {
            C4174 c4174 = this.structValueBuilder_;
            int i = this.kindCase_;
            if (c4174 == null) {
                if (i != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else if (i == 5) {
                c4174.m7945(struct);
            } else {
                c4174.m7946(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public C4156 setBoolValue(boolean z) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        public C4156 setListValue(ListValue.C4145 c4145) {
            C4174 c4174 = this.listValueBuilder_;
            if (c4174 == null) {
                this.kind_ = c4145.build();
                onChanged();
            } else {
                c4174.m7946(c4145.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public C4156 setNullValue(NullValue nullValue) {
            nullValue.getClass();
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public C4156 setNullValueValue(int i) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public C4156 setNumberValue(double d) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d);
            onChanged();
            return this;
        }

        public C4156 setStringValue(String str) {
            str.getClass();
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public C4156 setStringValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public C4156 setStructValue(Struct.C4151 c4151) {
            C4174 c4174 = this.structValueBuilder_;
            if (c4174 == null) {
                this.kind_ = c4151.build();
                onChanged();
            } else {
                c4174.m7946(c4151.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        public /* synthetic */ C4156(C4555 c4555) {
            this();
        }

        public /* synthetic */ C4156(InterfaceC4364 interfaceC4364, C4555 c4555) {
            this(interfaceC4364);
        }

        private C4156(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.kindCase_ = 0;
        }

        private void buildPartial0(Value value) {
        }

        public C4156 setListValue(ListValue listValue) {
            C4174 c4174 = this.listValueBuilder_;
            if (c4174 == null) {
                listValue.getClass();
                this.kind_ = listValue;
                onChanged();
            } else {
                c4174.m7946(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public C4156 setStructValue(Struct struct) {
            C4174 c4174 = this.structValueBuilder_;
            if (c4174 == null) {
                struct.getClass();
                this.kind_ = struct;
                onChanged();
            } else {
                c4174.m7946(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4156 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Value) {
                return mergeFrom((Value) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4156 mergeFrom(Value value) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum KindCase implements InterfaceC4231 {
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

        @Override // com.google.protobuf.InterfaceC4231
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Value parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4156 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Value(GeneratedMessage.AbstractC4137 abstractC4137, C4555 c4555) {
        this(abstractC4137);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4156 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Value) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Value parseFrom(ByteString byteString) {
        return (Value) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Value parseFrom(ByteString byteString, C4529 c4529) {
        return (Value) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Value parseFrom(byte[] bArr, C4529 c4529) {
        return (Value) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, C4529 c4529) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Value parseFrom(AbstractC4306 abstractC4306) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Value parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

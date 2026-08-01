package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessage implements InterfaceC3573 {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$EnumOptions options_;
    private C3384 reservedName_;
    private List<EnumReservedRange> reservedRange_;
    private List<DescriptorProtos$EnumValueDescriptorProto> value_;
    private int visibility_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumDescriptorProto();
        PARSER = new C3571();
    }

    private DescriptorProtos$EnumDescriptorProto() {
        this.name_ = "";
        C3384 c3384 = C3384.f11037;
        this.reservedName_ = c3384;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.value_ = list;
        this.reservedRange_ = list;
        this.reservedName_ = c3384;
        this.visibility_ = 0;
    }

    public static /* synthetic */ int access$12576(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int i) {
        int i2 = i | descriptorProtos$EnumDescriptorProto.bitField0_;
        descriptorProtos$EnumDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11434;
    }

    public static C3266 newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$EnumDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) obj;
        if (hasName() != descriptorProtos$EnumDescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$EnumDescriptorProto.getName())) || !getValueList().equals(descriptorProtos$EnumDescriptorProto.getValueList()) || hasOptions() != descriptorProtos$EnumDescriptorProto.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(descriptorProtos$EnumDescriptorProto.getOptions())) && getReservedRangeList().equals(descriptorProtos$EnumDescriptorProto.getReservedRangeList()) && getReservedNameList().equals(descriptorProtos$EnumDescriptorProto.getReservedNameList()) && hasVisibility() == descriptorProtos$EnumDescriptorProto.hasVisibility()) {
            return (!hasVisibility() || this.visibility_ == descriptorProtos$EnumDescriptorProto.visibility_) && getUnknownFields().equals(descriptorProtos$EnumDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11434;
    }

    @Override // com.google.protobuf.InterfaceC3573
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

    @Override // com.google.protobuf.InterfaceC3573
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public InterfaceC3558 getOptionsOrBuilder() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public int getReservedNameCount() {
        return this.reservedName_.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3573
    public EnumReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3573
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public InterfaceC3576 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public List<? extends InterfaceC3576> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.value_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.value_.get(i2));
        }
        int iM7643 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM7643 += AbstractC3462.m7639(3, getOptions());
        }
        int size2 = this.reservedRange_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7643 += AbstractC3462.m7643(this.reservedRange_.get(i3));
        }
        int i4 = iM7643 + size2;
        int iComputeStringSizeNoTag = 0;
        for (int i5 = 0; i5 < this.reservedName_.f11038.size(); i5++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11038.get(i5));
        }
        int size3 = getReservedNameList().size() + i4 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size3 += AbstractC3462.m7632(6, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.protobuf.InterfaceC3573
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public InterfaceC3556 getValueOrBuilder(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3573
    public List<? extends InterfaceC3556> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3573
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getValueCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getValueList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11433;
        c3619.m7827(DescriptorProtos$EnumDescriptorProto.class, C3266.class);
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
        for (int i = 0; i < getValueCount(); i++) {
            if (!getValue(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3266 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3266(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3266 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3266() : new C3266().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.value_.size(); i++) {
            abstractC3462.mo7649(2, this.value_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(3, getOptions());
        }
        for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
            abstractC3462.mo7649(4, this.reservedRange_.get(i2));
        }
        for (int i3 = 0; i3 < this.reservedName_.f11038.size(); i3++) {
            GeneratedMessage.writeString(abstractC3462, 5, this.reservedName_.f11038.get(i3));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(6, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class EnumReservedRange extends GeneratedMessage implements InterfaceC3576 {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC3375 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumReservedRange");
            DEFAULT_INSTANCE = new EnumReservedRange();
            PARSER = new C3575();
        }

        private EnumReservedRange(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$11576(EnumReservedRange enumReservedRange, int i) {
            int i2 = i | enumReservedRange.bitField0_;
            enumReservedRange.bitField0_ = i2;
            return i2;
        }

        public static EnumReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11437;
        }

        public static C3265 newBuilder(EnumReservedRange enumReservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumReservedRange)) {
                return super.equals(obj);
            }
            EnumReservedRange enumReservedRange = (EnumReservedRange) obj;
            if (hasStart() != enumReservedRange.hasStart()) {
                return false;
            }
            if ((!hasStart() || getStart() == enumReservedRange.getStart()) && hasEnd() == enumReservedRange.hasEnd()) {
                return (!hasEnd() || getEnd() == enumReservedRange.getEnd()) && getUnknownFields().equals(enumReservedRange.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11437;
        }

        @Override // com.google.protobuf.InterfaceC3576
        public int getEnd() {
            return this.end_;
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
            int iM7631 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7631(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7631 += AbstractC3462.m7631(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7631;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3576
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3576
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3576
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11438;
            c3619.m7827(EnumReservedRange.class, C3265.class);
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
        public C3265 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3265(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3265 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3265() : new C3265().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7651(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3265 extends GeneratedMessage.AbstractC3305 implements InterfaceC3576 {
            private int bitField0_;
            private int end_;
            private int start_;

            private void buildPartial0(EnumReservedRange enumReservedRange) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    enumReservedRange.start_ = this.start_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    enumReservedRange.end_ = this.end_;
                    i |= 2;
                }
                EnumReservedRange.access$11576(enumReservedRange, i);
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11437;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public EnumReservedRange build() {
                EnumReservedRange enumReservedRangeBuildPartial = buildPartial();
                if (enumReservedRangeBuildPartial.isInitialized()) {
                    return enumReservedRangeBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) enumReservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public EnumReservedRange buildPartial() {
                EnumReservedRange enumReservedRange = new EnumReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumReservedRange);
                }
                onBuilt();
                return enumReservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3265 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C3265 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3265 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11437;
            }

            @Override // com.google.protobuf.InterfaceC3576
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3576
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3576
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3576
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11438;
                c3619.m7827(EnumReservedRange.class, C3265.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3265 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    this.start_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 16) {
                                    this.end_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 2;
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

            public C3265 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3265 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C3265() {
            }

            private C3265(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public EnumReservedRange getDefaultInstanceForType() {
                return EnumReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3265 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof EnumReservedRange) {
                    return mergeFrom((EnumReservedRange) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3265 mergeFrom(EnumReservedRange enumReservedRange) {
                if (enumReservedRange == EnumReservedRange.getDefaultInstance()) {
                    return this;
                }
                if (enumReservedRange.hasStart()) {
                    setStart(enumReservedRange.getStart());
                }
                if (enumReservedRange.hasEnd()) {
                    setEnd(enumReservedRange.getEnd());
                }
                mergeUnknownFields(enumReservedRange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public EnumReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3265 newBuilderForType() {
            return newBuilder();
        }

        public static C3265 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private EnumReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static EnumReservedRange parseFrom(ByteString byteString) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static EnumReservedRange parseFrom(ByteString byteString, C3697 c3697) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, C3697 c3697) {
            return (EnumReservedRange) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, C3697 c3697) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static EnumReservedRange parseFrom(AbstractC3474 abstractC3474) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static EnumReservedRange parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3266 extends GeneratedMessage.AbstractC3305 implements InterfaceC3573 {
        private int bitField0_;
        private Object name_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$EnumOptions options_;
        private C3384 reservedName_;
        private C3363 reservedRangeBuilder_;
        private List<EnumReservedRange> reservedRange_;
        private C3363 valueBuilder_;
        private List<DescriptorProtos$EnumValueDescriptorProto> value_;
        private int visibility_;

        private C3266() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$EnumDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$EnumDescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$EnumOptions) c3342.m7384();
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.reservedName_.m7787();
                descriptorProtos$EnumDescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$EnumDescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$EnumDescriptorProto.access$12576(descriptorProtos$EnumDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.value_ = Collections.unmodifiableList(this.value_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$EnumDescriptorProto.value_ = this.value_;
            } else {
                descriptorProtos$EnumDescriptorProto.value_ = c3363.m7472();
            }
            C3363 c33632 = this.reservedRangeBuilder_;
            if (c33632 != null) {
                descriptorProtos$EnumDescriptorProto.reservedRange_ = c33632.m7472();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                this.bitField0_ &= -9;
            }
            descriptorProtos$EnumDescriptorProto.reservedRange_ = this.reservedRange_;
        }

        private void ensureReservedNameIsMutable() {
            if (!this.reservedName_.f11199) {
                this.reservedName_ = new C3384(this.reservedName_);
            }
            this.bitField0_ |= 16;
        }

        private void ensureReservedRangeIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.reservedRange_ = new ArrayList(this.reservedRange_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureValueIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.value_ = new ArrayList(this.value_);
                this.bitField0_ |= 2;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11434;
        }

        private C3342 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3342(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3363 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C3363(this.reservedRange_, getParentForChildren(), isClean());
                this.reservedRange_ = null;
            }
            return this.reservedRangeBuilder_;
        }

        private C3363 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C3363(this.value_, getParentForChildren(), isClean());
                this.value_ = null;
            }
            return this.valueBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetValueFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetReservedRangeFieldBuilder();
            }
        }

        public C3266 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3266 addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C3266 addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureValueIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.value_);
            onChanged();
            return this;
        }

        public C3266 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m7493(str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3266 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo7495(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3266 addReservedRange(EnumReservedRange.C3265 c3265) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3265.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c3265.build());
            onChanged();
            return this;
        }

        public EnumReservedRange.C3265 addReservedRangeBuilder() {
            return (EnumReservedRange.C3265) internalGetReservedRangeFieldBuilder().m7460(EnumReservedRange.getDefaultInstance());
        }

        public C3266 addValue(DescriptorProtos$EnumValueDescriptorProto.C3268 c3268) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3268.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.add(c3268.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3268 addValueBuilder() {
            return (DescriptorProtos$EnumValueDescriptorProto.C3268) internalGetValueFieldBuilder().m7460(DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$EnumDescriptorProto build() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumDescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$EnumDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$EnumDescriptorProto buildPartial() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$EnumDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3266 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                this.value_ = Collections.EMPTY_LIST;
            } else {
                this.value_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            C3363 c33632 = this.reservedRangeBuilder_;
            if (c33632 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -9;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            return this;
        }

        public C3266 clearName() {
            this.name_ = DescriptorProtos$EnumDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3266 clearOptions() {
            this.bitField0_ &= -5;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3266 clearReservedName() {
            this.reservedName_ = C3384.f11037;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3266 clearReservedRange() {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3266 clearValue() {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.value_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3266 clearVisibility() {
            this.bitField0_ &= -33;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11434;
        }

        @Override // com.google.protobuf.InterfaceC3573
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

        @Override // com.google.protobuf.InterfaceC3573
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public DescriptorProtos$EnumOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$EnumOptions) c3342.m7380();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        public DescriptorProtos$EnumOptions.C3267 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumOptions.C3267) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public InterfaceC3558 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3558) c3342.m7379();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public int getReservedNameCount() {
            return this.reservedName_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public InterfaceC3377 getReservedNameList() {
            this.reservedName_.m7787();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public EnumReservedRange getReservedRange(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.get(i) : (EnumReservedRange) c3363.m7466(i, false);
        }

        public EnumReservedRange.C3265 getReservedRangeBuilder(int i) {
            return (EnumReservedRange.C3265) internalGetReservedRangeFieldBuilder().m7473(i);
        }

        public List<EnumReservedRange.C3265> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public int getReservedRangeCount() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public List<EnumReservedRange> getReservedRangeList() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.reservedRange_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public InterfaceC3576 getReservedRangeOrBuilder(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.get(i) : (InterfaceC3576) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public List<? extends InterfaceC3576> getReservedRangeOrBuilderList() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.reservedRange_);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
            C3363 c3363 = this.valueBuilder_;
            return c3363 == null ? this.value_.get(i) : (DescriptorProtos$EnumValueDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3268 getValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C3268) internalGetValueFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$EnumValueDescriptorProto.C3268> getValueBuilderList() {
            return internalGetValueFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public int getValueCount() {
            C3363 c3363 = this.valueBuilder_;
            return c3363 == null ? this.value_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
            C3363 c3363 = this.valueBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.value_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3573
        public InterfaceC3556 getValueOrBuilder(int i) {
            C3363 c3363 = this.valueBuilder_;
            return c3363 == null ? this.value_.get(i) : (InterfaceC3556) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public List<? extends InterfaceC3556> getValueOrBuilderList() {
            C3363 c3363 = this.valueBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.value_);
        }

        @Override // com.google.protobuf.InterfaceC3573
        public DescriptorProtos$SymbolVisibility getVisibility() {
            DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
            return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3573
        public boolean hasVisibility() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11433;
            c3619.m7827(DescriptorProtos$EnumDescriptorProto.class, C3266.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getValueCount(); i++) {
                if (!getValue(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C3266 mergeFrom(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            if (descriptorProtos$EnumDescriptorProto == DescriptorProtos$EnumDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$EnumDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$EnumDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.valueBuilder_ == null) {
                if (!descriptorProtos$EnumDescriptorProto.value_.isEmpty()) {
                    if (this.value_.isEmpty()) {
                        this.value_ = descriptorProtos$EnumDescriptorProto.value_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureValueIsMutable();
                        this.value_.addAll(descriptorProtos$EnumDescriptorProto.value_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$EnumDescriptorProto.value_.isEmpty()) {
                boolean zIsEmpty = this.valueBuilder_.f11012.isEmpty();
                C3363 c3363 = this.valueBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.valueBuilder_ = null;
                    this.value_ = descriptorProtos$EnumDescriptorProto.value_;
                    this.bitField0_ &= -3;
                    this.valueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValueFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$EnumDescriptorProto.value_);
                }
            }
            if (descriptorProtos$EnumDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$EnumDescriptorProto.getOptions());
            }
            if (this.reservedRangeBuilder_ == null) {
                if (!descriptorProtos$EnumDescriptorProto.reservedRange_.isEmpty()) {
                    if (this.reservedRange_.isEmpty()) {
                        this.reservedRange_ = descriptorProtos$EnumDescriptorProto.reservedRange_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureReservedRangeIsMutable();
                        this.reservedRange_.addAll(descriptorProtos$EnumDescriptorProto.reservedRange_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$EnumDescriptorProto.reservedRange_.isEmpty()) {
                boolean zIsEmpty2 = this.reservedRangeBuilder_.f11012.isEmpty();
                C3363 c33632 = this.reservedRangeBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$EnumDescriptorProto.reservedRange_;
                    this.bitField0_ &= -9;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c33632.m7462(descriptorProtos$EnumDescriptorProto.reservedRange_);
                }
            }
            if (!descriptorProtos$EnumDescriptorProto.reservedName_.isEmpty()) {
                if (this.reservedName_.isEmpty()) {
                    this.reservedName_ = descriptorProtos$EnumDescriptorProto.reservedName_;
                    this.bitField0_ |= 16;
                } else {
                    ensureReservedNameIsMutable();
                    this.reservedName_.addAll(descriptorProtos$EnumDescriptorProto.reservedName_);
                }
                onChanged();
            }
            if (descriptorProtos$EnumDescriptorProto.hasVisibility()) {
                setVisibility(descriptorProtos$EnumDescriptorProto.getVisibility());
            }
            mergeUnknownFields(descriptorProtos$EnumDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C3266 mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$EnumOptions);
            } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$EnumOptions2 = this.options_) == null || descriptorProtos$EnumOptions2 == DescriptorProtos$EnumOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$EnumOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$EnumOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public C3266 removeReservedRange(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C3266 removeValue(int i) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureValueIsMutable();
            this.value_.remove(i);
            onChanged();
            return this;
        }

        public C3266 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3266 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3266 setOptions(DescriptorProtos$EnumOptions.C3267 c3267) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3267.build();
            } else {
                c3342.m7387(c3267.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3266 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3266 setReservedRange(int i, EnumReservedRange.C3265 c3265) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3265.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c3265.build());
            onChanged();
            return this;
        }

        public C3266 setValue(int i, DescriptorProtos$EnumValueDescriptorProto.C3268 c3268) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3268.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.set(i, c3268.build());
            onChanged();
            return this;
        }

        public C3266 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 32;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumDescriptorProto.getDefaultInstance();
        }

        public EnumReservedRange.C3265 addReservedRangeBuilder(int i) {
            return (EnumReservedRange.C3265) internalGetReservedRangeFieldBuilder().m7461(i, EnumReservedRange.getDefaultInstance());
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3268 addValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C3268) internalGetValueFieldBuilder().m7461(i, DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        private C3266(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C3266 addReservedRange(int i, EnumReservedRange enumReservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, enumReservedRange);
                onChanged();
                return this;
            }
            c3363.m7459(i, enumReservedRange);
            return this;
        }

        public C3266 addValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3266 setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$EnumOptions.getClass();
                this.options_ = descriptorProtos$EnumOptions;
            } else {
                c3342.m7387(descriptorProtos$EnumOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3266 setReservedRange(int i, EnumReservedRange enumReservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, enumReservedRange);
                onChanged();
                return this;
            }
            c3363.m7463(i, enumReservedRange);
            return this;
        }

        public C3266 setValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.set(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3266 addReservedRange(EnumReservedRange enumReservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(enumReservedRange);
                onChanged();
                return this;
            }
            c3363.m7458(enumReservedRange);
            return this;
        }

        public C3266 addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3266 addReservedRange(int i, EnumReservedRange.C3265 c3265) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c3265.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3265.build());
            return this;
        }

        public C3266 addValue(int i, DescriptorProtos$EnumValueDescriptorProto.C3268 c3268) {
            C3363 c3363 = this.valueBuilder_;
            if (c3363 == null) {
                ensureValueIsMutable();
                this.value_.add(i, c3268.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3268.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3266 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$EnumDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumDescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3266 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = (DescriptorProtos$EnumValueDescriptorProto) abstractC3474.mo7715(DescriptorProtos$EnumValueDescriptorProto.parser(), c3697);
                                C3363 c3363 = this.valueBuilder_;
                                if (c3363 == null) {
                                    ensureValueIsMutable();
                                    this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$EnumValueDescriptorProto);
                                }
                            } else if (iMo7705 == 26) {
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 34) {
                                EnumReservedRange enumReservedRange = (EnumReservedRange) abstractC3474.mo7715(EnumReservedRange.parser(), c3697);
                                C3363 c33632 = this.reservedRangeBuilder_;
                                if (c33632 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(enumReservedRange);
                                } else {
                                    c33632.m7458(enumReservedRange);
                                }
                            } else if (iMo7705 == 42) {
                                ByteString byteStringMo7719 = abstractC3474.mo7719();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo7495(byteStringMo7719);
                            } else if (iMo7705 != 48) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                int iMo7724 = abstractC3474.mo7724();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(6, iMo7724);
                                } else {
                                    this.visibility_ = iMo7724;
                                    this.bitField0_ |= 32;
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

    @Override // com.google.protobuf.InterfaceC3573
    public InterfaceC3377 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3266 newBuilderForType() {
        return newBuilder();
    }

    public static C3266 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    private DescriptorProtos$EnumDescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.reservedName_ = C3384.f11037;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

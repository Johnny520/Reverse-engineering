package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
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
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessage implements InterfaceC4405 {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$EnumOptions options_;
    private C4216 reservedName_;
    private List<EnumReservedRange> reservedRange_;
    private List<DescriptorProtos$EnumValueDescriptorProto> value_;
    private int visibility_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumDescriptorProto();
        PARSER = new C4403();
    }

    private DescriptorProtos$EnumDescriptorProto() {
        this.name_ = "";
        C4216 c4216 = C4216.f11382;
        this.reservedName_ = c4216;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.value_ = list;
        this.reservedRange_ = list;
        this.reservedName_ = c4216;
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11779;
    }

    public static C4098 newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11779;
    }

    @Override // com.google.protobuf.InterfaceC4405
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

    @Override // com.google.protobuf.InterfaceC4405
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public InterfaceC4390 getOptionsOrBuilder() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public int getReservedNameCount() {
        return this.reservedName_.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4405
    public EnumReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC4405
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public InterfaceC4408 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public List<? extends InterfaceC4408> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.value_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.value_.get(i2));
        }
        int iM8202 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM8202 += AbstractC4294.m8198(3, getOptions());
        }
        int size2 = this.reservedRange_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM8202 += AbstractC4294.m8202(this.reservedRange_.get(i3));
        }
        int i4 = iM8202 + size2;
        int iComputeStringSizeNoTag = 0;
        for (int i5 = 0; i5 < this.reservedName_.f11383.size(); i5++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11383.get(i5));
        }
        int size3 = getReservedNameList().size() + i4 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size3 += AbstractC4294.m8191(6, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.protobuf.InterfaceC4405
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public InterfaceC4388 getValueOrBuilder(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4405
    public List<? extends InterfaceC4388> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4405
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getValueCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getValueList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11778;
        c4451.m8386(DescriptorProtos$EnumDescriptorProto.class, C4098.class);
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

    @Override // com.google.protobuf.AbstractC4365
    public C4098 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4098(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4098 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4098() : new C4098().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.value_.size(); i++) {
            abstractC4294.mo8208(2, this.value_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8208(3, getOptions());
        }
        for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
            abstractC4294.mo8208(4, this.reservedRange_.get(i2));
        }
        for (int i3 = 0; i3 < this.reservedName_.f11383.size(); i3++) {
            GeneratedMessage.writeString(abstractC4294, 5, this.reservedName_.f11383.get(i3));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(6, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class EnumReservedRange extends GeneratedMessage implements InterfaceC4408 {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC4207 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumReservedRange");
            DEFAULT_INSTANCE = new EnumReservedRange();
            PARSER = new C4407();
        }

        private EnumReservedRange(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11782;
        }

        public static C4097 newBuilder(EnumReservedRange enumReservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11782;
        }

        @Override // com.google.protobuf.InterfaceC4408
        public int getEnd() {
            return this.end_;
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
            int iM8190 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8190(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8190 += AbstractC4294.m8190(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8190;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4408
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC4408
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4408
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11783;
            c4451.m8386(EnumReservedRange.class, C4097.class);
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
        public C4097 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4097(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4097 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4097() : new C4097().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8210(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4097 extends GeneratedMessage.AbstractC4137 implements InterfaceC4408 {
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

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11782;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public EnumReservedRange build() {
                EnumReservedRange enumReservedRangeBuildPartial = buildPartial();
                if (enumReservedRangeBuildPartial.isInitialized()) {
                    return enumReservedRangeBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) enumReservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public EnumReservedRange buildPartial() {
                EnumReservedRange enumReservedRange = new EnumReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumReservedRange);
                }
                onBuilt();
                return enumReservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4097 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C4097 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C4097 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11782;
            }

            @Override // com.google.protobuf.InterfaceC4408
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC4408
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC4408
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4408
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11783;
                c4451.m8386(EnumReservedRange.class, C4097.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4097 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    this.start_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 1;
                                } else if (iMo8264 == 16) {
                                    this.end_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 2;
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

            public C4097 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4097 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C4097() {
            }

            private C4097(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public EnumReservedRange getDefaultInstanceForType() {
                return EnumReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4097 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof EnumReservedRange) {
                    return mergeFrom((EnumReservedRange) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4097 mergeFrom(EnumReservedRange enumReservedRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public EnumReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4097 newBuilderForType() {
            return newBuilder();
        }

        public static C4097 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private EnumReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static EnumReservedRange parseFrom(ByteString byteString) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static EnumReservedRange parseFrom(ByteString byteString, C4529 c4529) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, C4529 c4529) {
            return (EnumReservedRange) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, C4529 c4529) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static EnumReservedRange parseFrom(AbstractC4306 abstractC4306) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static EnumReservedRange parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4098 extends GeneratedMessage.AbstractC4137 implements InterfaceC4405 {
        private int bitField0_;
        private Object name_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$EnumOptions options_;
        private C4216 reservedName_;
        private C4195 reservedRangeBuilder_;
        private List<EnumReservedRange> reservedRange_;
        private C4195 valueBuilder_;
        private List<DescriptorProtos$EnumValueDescriptorProto> value_;
        private int visibility_;

        private C4098() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C4216.f11382;
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
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$EnumDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$EnumOptions) c4174.m7943();
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.reservedName_.m8346();
                descriptorProtos$EnumDescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$EnumDescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$EnumDescriptorProto.access$12576(descriptorProtos$EnumDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.value_ = Collections.unmodifiableList(this.value_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$EnumDescriptorProto.value_ = this.value_;
            } else {
                descriptorProtos$EnumDescriptorProto.value_ = c4195.m8031();
            }
            C4195 c41952 = this.reservedRangeBuilder_;
            if (c41952 != null) {
                descriptorProtos$EnumDescriptorProto.reservedRange_ = c41952.m8031();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                this.bitField0_ &= -9;
            }
            descriptorProtos$EnumDescriptorProto.reservedRange_ = this.reservedRange_;
        }

        private void ensureReservedNameIsMutable() {
            if (!this.reservedName_.f11544) {
                this.reservedName_ = new C4216(this.reservedName_);
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11779;
        }

        private C4174 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C4195 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C4195(this.reservedRange_, getParentForChildren(), isClean());
                this.reservedRange_ = null;
            }
            return this.reservedRangeBuilder_;
        }

        private C4195 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C4195(this.value_, getParentForChildren(), isClean());
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

        public C4098 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4098 addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C4098 addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureValueIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.value_);
            onChanged();
            return this;
        }

        public C4098 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m8052(str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4098 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo8054(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4098 addReservedRange(EnumReservedRange.C4097 c4097) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4097.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c4097.build());
            onChanged();
            return this;
        }

        public EnumReservedRange.C4097 addReservedRangeBuilder() {
            return (EnumReservedRange.C4097) internalGetReservedRangeFieldBuilder().m8019(EnumReservedRange.getDefaultInstance());
        }

        public C4098 addValue(DescriptorProtos$EnumValueDescriptorProto.C4100 c4100) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4100.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.add(c4100.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumValueDescriptorProto.C4100 addValueBuilder() {
            return (DescriptorProtos$EnumValueDescriptorProto.C4100) internalGetValueFieldBuilder().m8019(DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$EnumDescriptorProto build() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$EnumDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$EnumDescriptorProto buildPartial() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$EnumDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4098 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                this.value_ = Collections.EMPTY_LIST;
            } else {
                this.value_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            C4195 c41952 = this.reservedRangeBuilder_;
            if (c41952 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -9;
            this.reservedName_ = C4216.f11382;
            this.visibility_ = 0;
            return this;
        }

        public C4098 clearName() {
            this.name_ = DescriptorProtos$EnumDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4098 clearOptions() {
            this.bitField0_ &= -5;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4098 clearReservedName() {
            this.reservedName_ = C4216.f11382;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C4098 clearReservedRange() {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C4098 clearValue() {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.value_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4098 clearVisibility() {
            this.bitField0_ &= -33;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11779;
        }

        @Override // com.google.protobuf.InterfaceC4405
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

        @Override // com.google.protobuf.InterfaceC4405
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public DescriptorProtos$EnumOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$EnumOptions) c4174.m7939();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        public DescriptorProtos$EnumOptions.C4099 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumOptions.C4099) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public InterfaceC4390 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4390) c4174.m7938();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public int getReservedNameCount() {
            return this.reservedName_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public InterfaceC4209 getReservedNameList() {
            this.reservedName_.m8346();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public EnumReservedRange getReservedRange(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.get(i) : (EnumReservedRange) c4195.m8025(i, false);
        }

        public EnumReservedRange.C4097 getReservedRangeBuilder(int i) {
            return (EnumReservedRange.C4097) internalGetReservedRangeFieldBuilder().m8032(i);
        }

        public List<EnumReservedRange.C4097> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public int getReservedRangeCount() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public List<EnumReservedRange> getReservedRangeList() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.reservedRange_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public InterfaceC4408 getReservedRangeOrBuilder(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.get(i) : (InterfaceC4408) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public List<? extends InterfaceC4408> getReservedRangeOrBuilderList() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.reservedRange_);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
            C4195 c4195 = this.valueBuilder_;
            return c4195 == null ? this.value_.get(i) : (DescriptorProtos$EnumValueDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$EnumValueDescriptorProto.C4100 getValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C4100) internalGetValueFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$EnumValueDescriptorProto.C4100> getValueBuilderList() {
            return internalGetValueFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public int getValueCount() {
            C4195 c4195 = this.valueBuilder_;
            return c4195 == null ? this.value_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
            C4195 c4195 = this.valueBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.value_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4405
        public InterfaceC4388 getValueOrBuilder(int i) {
            C4195 c4195 = this.valueBuilder_;
            return c4195 == null ? this.value_.get(i) : (InterfaceC4388) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public List<? extends InterfaceC4388> getValueOrBuilderList() {
            C4195 c4195 = this.valueBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.value_);
        }

        @Override // com.google.protobuf.InterfaceC4405
        public DescriptorProtos$SymbolVisibility getVisibility() {
            DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
            return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4405
        public boolean hasVisibility() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11778;
            c4451.m8386(DescriptorProtos$EnumDescriptorProto.class, C4098.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getValueCount(); i++) {
                if (!getValue(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C4098 mergeFrom(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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
                boolean zIsEmpty = this.valueBuilder_.f11357.isEmpty();
                C4195 c4195 = this.valueBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.valueBuilder_ = null;
                    this.value_ = descriptorProtos$EnumDescriptorProto.value_;
                    this.bitField0_ &= -3;
                    this.valueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValueFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$EnumDescriptorProto.value_);
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
                boolean zIsEmpty2 = this.reservedRangeBuilder_.f11357.isEmpty();
                C4195 c41952 = this.reservedRangeBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$EnumDescriptorProto.reservedRange_;
                    this.bitField0_ &= -9;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c41952.m8021(descriptorProtos$EnumDescriptorProto.reservedRange_);
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

        public C4098 mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$EnumOptions);
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

        public C4098 removeReservedRange(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C4098 removeValue(int i) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureValueIsMutable();
            this.value_.remove(i);
            onChanged();
            return this;
        }

        public C4098 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4098 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4098 setOptions(DescriptorProtos$EnumOptions.C4099 c4099) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4099.build();
            } else {
                c4174.m7946(c4099.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4098 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4098 setReservedRange(int i, EnumReservedRange.C4097 c4097) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4097.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c4097.build());
            onChanged();
            return this;
        }

        public C4098 setValue(int i, DescriptorProtos$EnumValueDescriptorProto.C4100 c4100) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4100.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.set(i, c4100.build());
            onChanged();
            return this;
        }

        public C4098 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 32;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumDescriptorProto.getDefaultInstance();
        }

        public EnumReservedRange.C4097 addReservedRangeBuilder(int i) {
            return (EnumReservedRange.C4097) internalGetReservedRangeFieldBuilder().m8020(i, EnumReservedRange.getDefaultInstance());
        }

        public DescriptorProtos$EnumValueDescriptorProto.C4100 addValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C4100) internalGetValueFieldBuilder().m8020(i, DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        private C4098(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C4216.f11382;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C4098 addReservedRange(int i, EnumReservedRange enumReservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, enumReservedRange);
                onChanged();
                return this;
            }
            c4195.m8018(i, enumReservedRange);
            return this;
        }

        public C4098 addValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C4098 setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$EnumOptions.getClass();
                this.options_ = descriptorProtos$EnumOptions;
            } else {
                c4174.m7946(descriptorProtos$EnumOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4098 setReservedRange(int i, EnumReservedRange enumReservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, enumReservedRange);
                onChanged();
                return this;
            }
            c4195.m8022(i, enumReservedRange);
            return this;
        }

        public C4098 setValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.set(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C4098 addReservedRange(EnumReservedRange enumReservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(enumReservedRange);
                onChanged();
                return this;
            }
            c4195.m8017(enumReservedRange);
            return this;
        }

        public C4098 addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C4098 addReservedRange(int i, EnumReservedRange.C4097 c4097) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c4097.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4097.build());
            return this;
        }

        public C4098 addValue(int i, DescriptorProtos$EnumValueDescriptorProto.C4100 c4100) {
            C4195 c4195 = this.valueBuilder_;
            if (c4195 == null) {
                ensureValueIsMutable();
                this.value_.add(i, c4100.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4100.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4098 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$EnumDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4098 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = (DescriptorProtos$EnumValueDescriptorProto) abstractC4306.mo8274(DescriptorProtos$EnumValueDescriptorProto.parser(), c4529);
                                C4195 c4195 = this.valueBuilder_;
                                if (c4195 == null) {
                                    ensureValueIsMutable();
                                    this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$EnumValueDescriptorProto);
                                }
                            } else if (iMo8264 == 26) {
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 34) {
                                EnumReservedRange enumReservedRange = (EnumReservedRange) abstractC4306.mo8274(EnumReservedRange.parser(), c4529);
                                C4195 c41952 = this.reservedRangeBuilder_;
                                if (c41952 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(enumReservedRange);
                                } else {
                                    c41952.m8017(enumReservedRange);
                                }
                            } else if (iMo8264 == 42) {
                                ByteString byteStringMo8278 = abstractC4306.mo8278();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo8054(byteStringMo8278);
                            } else if (iMo8264 != 48) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                int iMo8283 = abstractC4306.mo8283();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(6, iMo8283);
                                } else {
                                    this.visibility_ = iMo8283;
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

    @Override // com.google.protobuf.InterfaceC4405
    public InterfaceC4209 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4098 newBuilderForType() {
        return newBuilder();
    }

    public static C4098 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    private DescriptorProtos$EnumDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.reservedName_ = C4216.f11382;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessage implements InterfaceC3572 {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$EnumOptions options_;
    private C3383 reservedName_;
    private List<EnumReservedRange> reservedRange_;
    private List<DescriptorProtos$EnumValueDescriptorProto> value_;
    private int visibility_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumDescriptorProto();
        PARSER = new C3570();
    }

    private DescriptorProtos$EnumDescriptorProto() {
        this.name_ = "";
        C3383 c3383 = C3383.f11032;
        this.reservedName_ = c3383;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.value_ = list;
        this.reservedRange_ = list;
        this.reservedName_ = c3383;
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11429;
    }

    public static C3265 newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11429;
    }

    @Override // com.google.protobuf.InterfaceC3572
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

    @Override // com.google.protobuf.InterfaceC3572
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3557 getOptionsOrBuilder() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getReservedNameCount() {
        return this.reservedName_.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public EnumReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3575 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3575> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.value_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.value_.get(i2));
        }
        int iM7656 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM7656 += AbstractC3461.m7652(3, getOptions());
        }
        int size2 = this.reservedRange_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7656 += AbstractC3461.m7656(this.reservedRange_.get(i3));
        }
        int i4 = iM7656 + size2;
        int iComputeStringSizeNoTag = 0;
        for (int i5 = 0; i5 < this.reservedName_.f11033.size(); i5++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11033.get(i5));
        }
        int size3 = getReservedNameList().size() + i4 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size3 += AbstractC3461.m7645(6, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3555 getValueOrBuilder(int i) {
        return this.value_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3555> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getValueCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getValueList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11428;
        c3618.m7840(DescriptorProtos$EnumDescriptorProto.class, C3265.class);
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

    @Override // com.google.protobuf.AbstractC3532
    public C3265 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3265(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3265 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3265() : new C3265().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.value_.size(); i++) {
            abstractC3461.mo7662(2, this.value_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7662(3, getOptions());
        }
        for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
            abstractC3461.mo7662(4, this.reservedRange_.get(i2));
        }
        for (int i3 = 0; i3 < this.reservedName_.f11033.size(); i3++) {
            GeneratedMessage.writeString(abstractC3461, 5, this.reservedName_.f11033.get(i3));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(6, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class EnumReservedRange extends GeneratedMessage implements InterfaceC3575 {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC3374 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumReservedRange");
            DEFAULT_INSTANCE = new EnumReservedRange();
            PARSER = new C3574();
        }

        private EnumReservedRange(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11432;
        }

        public static C3264 newBuilder(EnumReservedRange enumReservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11432;
        }

        @Override // com.google.protobuf.InterfaceC3575
        public int getEnd() {
            return this.end_;
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
            int iM7644 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7644(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7644 += AbstractC3461.m7644(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7644;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3575
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3575
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3575
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11433;
            c3618.m7840(EnumReservedRange.class, C3264.class);
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
        public C3264 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3264(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3264 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3264() : new C3264().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7664(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3264 extends GeneratedMessage.AbstractC3304 implements InterfaceC3575 {
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

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11432;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public EnumReservedRange build() {
                EnumReservedRange enumReservedRangeBuildPartial = buildPartial();
                if (enumReservedRangeBuildPartial.isInitialized()) {
                    return enumReservedRangeBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) enumReservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public EnumReservedRange buildPartial() {
                EnumReservedRange enumReservedRange = new EnumReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumReservedRange);
                }
                onBuilt();
                return enumReservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3264 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C3264 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3264 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11432;
            }

            @Override // com.google.protobuf.InterfaceC3575
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3575
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3575
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3575
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11433;
                c3618.m7840(EnumReservedRange.class, C3264.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3264 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    this.start_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 1;
                                } else if (iMo7718 == 16) {
                                    this.end_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 2;
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

            public C3264 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3264 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C3264() {
            }

            private C3264(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public EnumReservedRange getDefaultInstanceForType() {
                return EnumReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3264 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof EnumReservedRange) {
                    return mergeFrom((EnumReservedRange) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3264 mergeFrom(EnumReservedRange enumReservedRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public EnumReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (EnumReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3264 newBuilderForType() {
            return newBuilder();
        }

        public static C3264 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private EnumReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static EnumReservedRange parseFrom(ByteString byteString) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static EnumReservedRange parseFrom(ByteString byteString, C3696 c3696) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, C3696 c3696) {
            return (EnumReservedRange) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, C3696 c3696) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static EnumReservedRange parseFrom(AbstractC3473 abstractC3473) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static EnumReservedRange parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (EnumReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3265 extends GeneratedMessage.AbstractC3304 implements InterfaceC3572 {
        private int bitField0_;
        private Object name_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$EnumOptions options_;
        private C3383 reservedName_;
        private C3362 reservedRangeBuilder_;
        private List<EnumReservedRange> reservedRange_;
        private C3362 valueBuilder_;
        private List<DescriptorProtos$EnumValueDescriptorProto> value_;
        private int visibility_;

        private C3265() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3383.f11032;
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
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$EnumDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$EnumOptions) c3341.m7397();
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.reservedName_.m7800();
                descriptorProtos$EnumDescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$EnumDescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$EnumDescriptorProto.access$12576(descriptorProtos$EnumDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.value_ = Collections.unmodifiableList(this.value_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$EnumDescriptorProto.value_ = this.value_;
            } else {
                descriptorProtos$EnumDescriptorProto.value_ = c3362.m7485();
            }
            C3362 c33622 = this.reservedRangeBuilder_;
            if (c33622 != null) {
                descriptorProtos$EnumDescriptorProto.reservedRange_ = c33622.m7485();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                this.bitField0_ &= -9;
            }
            descriptorProtos$EnumDescriptorProto.reservedRange_ = this.reservedRange_;
        }

        private void ensureReservedNameIsMutable() {
            if (!this.reservedName_.f11194) {
                this.reservedName_ = new C3383(this.reservedName_);
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11429;
        }

        private C3341 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3362 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C3362(this.reservedRange_, getParentForChildren(), isClean());
                this.reservedRange_ = null;
            }
            return this.reservedRangeBuilder_;
        }

        private C3362 internalGetValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new C3362(this.value_, getParentForChildren(), isClean());
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

        public C3265 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3265 addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C3265 addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureValueIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.value_);
            onChanged();
            return this;
        }

        public C3265 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m7506(str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3265 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo7508(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3265 addReservedRange(EnumReservedRange.C3264 c3264) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3264.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c3264.build());
            onChanged();
            return this;
        }

        public EnumReservedRange.C3264 addReservedRangeBuilder() {
            return (EnumReservedRange.C3264) internalGetReservedRangeFieldBuilder().m7473(EnumReservedRange.getDefaultInstance());
        }

        public C3265 addValue(DescriptorProtos$EnumValueDescriptorProto.C3267 c3267) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3267.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.add(c3267.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3267 addValueBuilder() {
            return (DescriptorProtos$EnumValueDescriptorProto.C3267) internalGetValueFieldBuilder().m7473(DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$EnumDescriptorProto build() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$EnumDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$EnumDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$EnumDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$EnumDescriptorProto buildPartial() {
            DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$EnumDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$EnumDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3265 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                this.value_ = Collections.EMPTY_LIST;
            } else {
                this.value_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            C3362 c33622 = this.reservedRangeBuilder_;
            if (c33622 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -9;
            this.reservedName_ = C3383.f11032;
            this.visibility_ = 0;
            return this;
        }

        public C3265 clearName() {
            this.name_ = DescriptorProtos$EnumDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3265 clearOptions() {
            this.bitField0_ &= -5;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3265 clearReservedName() {
            this.reservedName_ = C3383.f11032;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3265 clearReservedRange() {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3265 clearValue() {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.value_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3265 clearVisibility() {
            this.bitField0_ &= -33;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11429;
        }

        @Override // com.google.protobuf.InterfaceC3572
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

        @Override // com.google.protobuf.InterfaceC3572
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$EnumOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$EnumOptions) c3341.m7393();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        public DescriptorProtos$EnumOptions.C3266 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$EnumOptions.C3266) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3557 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3557) c3341.m7392();
            }
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
            return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getReservedNameCount() {
            return this.reservedName_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3376 getReservedNameList() {
            this.reservedName_.m7800();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public EnumReservedRange getReservedRange(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.get(i) : (EnumReservedRange) c3362.m7479(i, false);
        }

        public EnumReservedRange.C3264 getReservedRangeBuilder(int i) {
            return (EnumReservedRange.C3264) internalGetReservedRangeFieldBuilder().m7486(i);
        }

        public List<EnumReservedRange.C3264> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getReservedRangeCount() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<EnumReservedRange> getReservedRangeList() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.reservedRange_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3575 getReservedRangeOrBuilder(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.get(i) : (InterfaceC3575) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3575> getReservedRangeOrBuilderList() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.reservedRange_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$EnumValueDescriptorProto getValue(int i) {
            C3362 c3362 = this.valueBuilder_;
            return c3362 == null ? this.value_.get(i) : (DescriptorProtos$EnumValueDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3267 getValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C3267) internalGetValueFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$EnumValueDescriptorProto.C3267> getValueBuilderList() {
            return internalGetValueFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getValueCount() {
            C3362 c3362 = this.valueBuilder_;
            return c3362 == null ? this.value_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
            C3362 c3362 = this.valueBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.value_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3555 getValueOrBuilder(int i) {
            C3362 c3362 = this.valueBuilder_;
            return c3362 == null ? this.value_.get(i) : (InterfaceC3555) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3555> getValueOrBuilderList() {
            C3362 c3362 = this.valueBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.value_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$SymbolVisibility getVisibility() {
            DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
            return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public boolean hasVisibility() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11428;
            c3618.m7840(DescriptorProtos$EnumDescriptorProto.class, C3265.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getValueCount(); i++) {
                if (!getValue(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C3265 mergeFrom(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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
                boolean zIsEmpty = this.valueBuilder_.f11007.isEmpty();
                C3362 c3362 = this.valueBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.valueBuilder_ = null;
                    this.value_ = descriptorProtos$EnumDescriptorProto.value_;
                    this.bitField0_ &= -3;
                    this.valueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValueFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$EnumDescriptorProto.value_);
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
                boolean zIsEmpty2 = this.reservedRangeBuilder_.f11007.isEmpty();
                C3362 c33622 = this.reservedRangeBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$EnumDescriptorProto.reservedRange_;
                    this.bitField0_ &= -9;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c33622.m7475(descriptorProtos$EnumDescriptorProto.reservedRange_);
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

        public C3265 mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$EnumOptions);
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

        public C3265 removeReservedRange(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C3265 removeValue(int i) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureValueIsMutable();
            this.value_.remove(i);
            onChanged();
            return this;
        }

        public C3265 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3265 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3265 setOptions(DescriptorProtos$EnumOptions.C3266 c3266) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3266.build();
            } else {
                c3341.m7400(c3266.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3265 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3265 setReservedRange(int i, EnumReservedRange.C3264 c3264) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3264.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c3264.build());
            onChanged();
            return this;
        }

        public C3265 setValue(int i, DescriptorProtos$EnumValueDescriptorProto.C3267 c3267) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3267.build());
                return this;
            }
            ensureValueIsMutable();
            this.value_.set(i, c3267.build());
            onChanged();
            return this;
        }

        public C3265 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 32;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$EnumDescriptorProto.getDefaultInstance();
        }

        public EnumReservedRange.C3264 addReservedRangeBuilder(int i) {
            return (EnumReservedRange.C3264) internalGetReservedRangeFieldBuilder().m7474(i, EnumReservedRange.getDefaultInstance());
        }

        public DescriptorProtos$EnumValueDescriptorProto.C3267 addValueBuilder(int i) {
            return (DescriptorProtos$EnumValueDescriptorProto.C3267) internalGetValueFieldBuilder().m7474(i, DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance());
        }

        private C3265(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.value_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3383.f11032;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C3265 addReservedRange(int i, EnumReservedRange enumReservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, enumReservedRange);
                onChanged();
                return this;
            }
            c3362.m7472(i, enumReservedRange);
            return this;
        }

        public C3265 addValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3265 setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$EnumOptions.getClass();
                this.options_ = descriptorProtos$EnumOptions;
            } else {
                c3341.m7400(descriptorProtos$EnumOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3265 setReservedRange(int i, EnumReservedRange enumReservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, enumReservedRange);
                onChanged();
                return this;
            }
            c3362.m7476(i, enumReservedRange);
            return this;
        }

        public C3265 setValue(int i, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.set(i, descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3265 addReservedRange(EnumReservedRange enumReservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                enumReservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(enumReservedRange);
                onChanged();
                return this;
            }
            c3362.m7471(enumReservedRange);
            return this;
        }

        public C3265 addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumValueDescriptorProto.getClass();
                ensureValueIsMutable();
                this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public C3265 addReservedRange(int i, EnumReservedRange.C3264 c3264) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c3264.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3264.build());
            return this;
        }

        public C3265 addValue(int i, DescriptorProtos$EnumValueDescriptorProto.C3267 c3267) {
            C3362 c3362 = this.valueBuilder_;
            if (c3362 == null) {
                ensureValueIsMutable();
                this.value_.add(i, c3267.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3267.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3265 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$EnumDescriptorProto) {
                return mergeFrom((DescriptorProtos$EnumDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3265 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = (DescriptorProtos$EnumValueDescriptorProto) abstractC3473.mo7728(DescriptorProtos$EnumValueDescriptorProto.parser(), c3696);
                                C3362 c3362 = this.valueBuilder_;
                                if (c3362 == null) {
                                    ensureValueIsMutable();
                                    this.value_.add(descriptorProtos$EnumValueDescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$EnumValueDescriptorProto);
                                }
                            } else if (iMo7718 == 26) {
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 34) {
                                EnumReservedRange enumReservedRange = (EnumReservedRange) abstractC3473.mo7728(EnumReservedRange.parser(), c3696);
                                C3362 c33622 = this.reservedRangeBuilder_;
                                if (c33622 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(enumReservedRange);
                                } else {
                                    c33622.m7471(enumReservedRange);
                                }
                            } else if (iMo7718 == 42) {
                                ByteString byteStringMo7732 = abstractC3473.mo7732();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo7508(byteStringMo7732);
                            } else if (iMo7718 != 48) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                int iMo7737 = abstractC3473.mo7737();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(6, iMo7737);
                                } else {
                                    this.visibility_ = iMo7737;
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

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3376 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3265 newBuilderForType() {
        return newBuilder();
    }

    public static C3265 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    private DescriptorProtos$EnumDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.reservedName_ = C3383.f11032;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

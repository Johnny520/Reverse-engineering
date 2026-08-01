package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$UninterpretedOption extends GeneratedMessage implements InterfaceC4505 {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static final InterfaceC4207 PARSER;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object aggregateValue_;
    private int bitField0_;
    private double doubleValue_;
    private volatile Object identifierValue_;
    private byte memoizedIsInitialized;
    private List<NamePart> name_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private ByteString stringValue_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "UninterpretedOption");
        DEFAULT_INSTANCE = new DescriptorProtos$UninterpretedOption();
        PARSER = new C4501();
    }

    private DescriptorProtos$UninterpretedOption() {
        this.identifierValue_ = "";
        this.positiveIntValue_ = 0L;
        this.negativeIntValue_ = 0L;
        this.doubleValue_ = 0.0d;
        ByteString byteString = ByteString.EMPTY;
        this.stringValue_ = byteString;
        this.aggregateValue_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = Collections.EMPTY_LIST;
        this.identifierValue_ = "";
        this.stringValue_ = byteString;
        this.aggregateValue_ = "";
    }

    public static /* synthetic */ int access$30576(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, int i) {
        int i2 = i | descriptorProtos$UninterpretedOption.bitField0_;
        descriptorProtos$UninterpretedOption.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11812;
    }

    public static C4127 newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$UninterpretedOption)) {
            return super.equals(obj);
        }
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) obj;
        if (!getNameList().equals(descriptorProtos$UninterpretedOption.getNameList()) || hasIdentifierValue() != descriptorProtos$UninterpretedOption.hasIdentifierValue()) {
            return false;
        }
        if ((hasIdentifierValue() && !getIdentifierValue().equals(descriptorProtos$UninterpretedOption.getIdentifierValue())) || hasPositiveIntValue() != descriptorProtos$UninterpretedOption.hasPositiveIntValue()) {
            return false;
        }
        if ((hasPositiveIntValue() && getPositiveIntValue() != descriptorProtos$UninterpretedOption.getPositiveIntValue()) || hasNegativeIntValue() != descriptorProtos$UninterpretedOption.hasNegativeIntValue()) {
            return false;
        }
        if ((hasNegativeIntValue() && getNegativeIntValue() != descriptorProtos$UninterpretedOption.getNegativeIntValue()) || hasDoubleValue() != descriptorProtos$UninterpretedOption.hasDoubleValue()) {
            return false;
        }
        if ((hasDoubleValue() && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(descriptorProtos$UninterpretedOption.getDoubleValue())) || hasStringValue() != descriptorProtos$UninterpretedOption.hasStringValue()) {
            return false;
        }
        if ((!hasStringValue() || getStringValue().equals(descriptorProtos$UninterpretedOption.getStringValue())) && hasAggregateValue() == descriptorProtos$UninterpretedOption.hasAggregateValue()) {
            return (!hasAggregateValue() || getAggregateValue().equals(descriptorProtos$UninterpretedOption.getAggregateValue())) && getUnknownFields().equals(descriptorProtos$UninterpretedOption.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public String getAggregateValue() {
        Object obj = this.aggregateValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aggregateValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public ByteString getAggregateValueBytes() {
        Object obj = this.aggregateValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.aggregateValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11812;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public String getIdentifierValue() {
        Object obj = this.identifierValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.identifierValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public ByteString getIdentifierValueBytes() {
        Object obj = this.identifierValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.identifierValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public NamePart getName(int i) {
        return this.name_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4505
    public int getNameCount() {
        return this.name_.size();
    }

    @Override // com.google.protobuf.InterfaceC4505
    public List<NamePart> getNameList() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public InterfaceC4504 getNameOrBuilder(int i) {
        return this.name_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4505
    public List<? extends InterfaceC4504> getNameOrBuilderList() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int size = this.name_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.name_.get(i2));
        }
        int iComputeStringSize = iM8202 + size;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC4294.m8196(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC4294.m8199(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC4294.m8201(6) + 8;
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC4294.m8192(7, this.stringValue_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(8, this.aggregateValue_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public ByteString getStringValue() {
        return this.stringValue_;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4505
    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getNameCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getNameList().hashCode();
        }
        if (hasIdentifierValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getIdentifierValue().hashCode();
        }
        if (hasPositiveIntValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + AbstractC4234.m8061(getPositiveIntValue());
        }
        if (hasNegativeIntValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + AbstractC4234.m8061(getNegativeIntValue());
        }
        if (hasDoubleValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + AbstractC4234.m8061(Double.doubleToLongBits(getDoubleValue()));
        }
        if (hasStringValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + getStringValue().hashCode();
        }
        if (hasAggregateValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 8, 53) + getAggregateValue().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11811;
        c4451.m8386(DescriptorProtos$UninterpretedOption.class, C4127.class);
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
        for (int i = 0; i < getNameCount(); i++) {
            if (!getName(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4127 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4127(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4127 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4127() : new C4127().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.name_.size(); i++) {
            abstractC4294.mo8208(2, this.name_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8207(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8207(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.m8223(6, this.doubleValue_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8225(7, this.stringValue_);
        }
        if ((this.bitField0_ & 32) != 0) {
            GeneratedMessage.writeString(abstractC4294, 8, this.aggregateValue_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class NamePart extends GeneratedMessage implements InterfaceC4504 {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static final InterfaceC4207 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized;
        private volatile Object namePart_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "NamePart");
            DEFAULT_INSTANCE = new NamePart();
            PARSER = new C4500();
        }

        private NamePart() {
            this.namePart_ = "";
            this.isExtension_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.namePart_ = "";
        }

        public static /* synthetic */ int access$29476(NamePart namePart, int i) {
            int i2 = i | namePart.bitField0_;
            namePart.bitField0_ = i2;
            return i2;
        }

        public static NamePart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11815;
        }

        public static C4126 newBuilder(NamePart namePart) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) {
            return (NamePart) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NamePart)) {
                return super.equals(obj);
            }
            NamePart namePart = (NamePart) obj;
            if (hasNamePart() != namePart.hasNamePart()) {
                return false;
            }
            if ((!hasNamePart() || getNamePart().equals(namePart.getNamePart())) && hasIsExtension() == namePart.hasIsExtension()) {
                return (!hasIsExtension() || getIsExtension() == namePart.getIsExtension()) && getUnknownFields().equals(namePart.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11815;
        }

        @Override // com.google.protobuf.InterfaceC4504
        public boolean getIsExtension() {
            return this.isExtension_;
        }

        @Override // com.google.protobuf.InterfaceC4504
        public String getNamePart() {
            Object obj = this.namePart_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.namePart_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4504
        public ByteString getNamePartBytes() {
            Object obj = this.namePart_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.namePart_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.namePart_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC4294.m8193(2);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4504
        public boolean hasIsExtension() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4504
        public boolean hasNamePart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNamePart()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getNamePart().hashCode();
            }
            if (hasIsExtension()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + AbstractC4234.m8062(getIsExtension());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11816;
            c4451.m8386(NamePart.class, C4126.class);
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
            if (!hasNamePart()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIsExtension()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.AbstractC4365
        public C4126 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4126(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4126 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4126() : new C4126().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC4294, 1, this.namePart_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8222(2, this.isExtension_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4126 extends GeneratedMessage.AbstractC4137 implements InterfaceC4504 {
            private int bitField0_;
            private boolean isExtension_;
            private Object namePart_;

            private C4126() {
                this.namePart_ = "";
            }

            private void buildPartial0(NamePart namePart) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    namePart.namePart_ = this.namePart_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    namePart.isExtension_ = this.isExtension_;
                    i |= 2;
                }
                NamePart.access$29476(namePart, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11815;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public NamePart build() {
                NamePart namePartBuildPartial = buildPartial();
                if (namePartBuildPartial.isInitialized()) {
                    return namePartBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) namePartBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public NamePart buildPartial() {
                NamePart namePart = new NamePart(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(namePart);
                }
                onBuilt();
                return namePart;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4126 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.namePart_ = "";
                this.isExtension_ = false;
                return this;
            }

            public C4126 clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
                onChanged();
                return this;
            }

            public C4126 clearNamePart() {
                this.namePart_ = NamePart.getDefaultInstance().getNamePart();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11815;
            }

            @Override // com.google.protobuf.InterfaceC4504
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.InterfaceC4504
            public String getNamePart() {
                Object obj = this.namePart_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.namePart_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4504
            public ByteString getNamePartBytes() {
                Object obj = this.namePart_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.namePart_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4504
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4504
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11816;
                c4451.m8386(NamePart.class, C4126.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return hasNamePart() && hasIsExtension();
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4126 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 10) {
                                    this.namePart_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 1;
                                } else if (iMo8264 == 16) {
                                    this.isExtension_ = abstractC4306.mo8279();
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

            public C4126 setIsExtension(boolean z) {
                this.isExtension_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4126 setNamePart(String str) {
                str.getClass();
                this.namePart_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4126 setNamePartBytes(ByteString byteString) {
                byteString.getClass();
                this.namePart_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public NamePart getDefaultInstanceForType() {
                return NamePart.getDefaultInstance();
            }

            private C4126(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.namePart_ = "";
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4126 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof NamePart) {
                    return mergeFrom((NamePart) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4126 mergeFrom(NamePart namePart) {
                if (namePart == NamePart.getDefaultInstance()) {
                    return this;
                }
                if (namePart.hasNamePart()) {
                    this.namePart_ = namePart.namePart_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (namePart.hasIsExtension()) {
                    setIsExtension(namePart.getIsExtension());
                }
                mergeUnknownFields(namePart.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public NamePart getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (NamePart) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4126 newBuilderForType() {
            return newBuilder();
        }

        public static C4126 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (NamePart) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        private NamePart(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.namePart_ = "";
            this.isExtension_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NamePart parseFrom(ByteString byteString) {
            return (NamePart) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static NamePart parseFrom(ByteString byteString, C4529 c4529) {
            return (NamePart) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static NamePart parseFrom(byte[] bArr) {
            return (NamePart) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static NamePart parseFrom(byte[] bArr, C4529 c4529) {
            return (NamePart) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static NamePart parseFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, C4529 c4529) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static NamePart parseFrom(AbstractC4306 abstractC4306) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static NamePart parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4127 extends GeneratedMessage.AbstractC4137 implements InterfaceC4505 {
        private Object aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private Object identifierValue_;
        private C4195 nameBuilder_;
        private List<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;

        private C4127() {
            this.name_ = Collections.EMPTY_LIST;
            this.identifierValue_ = "";
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
        }

        private void buildPartial0(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 2) != 0) {
                descriptorProtos$UninterpretedOption.identifierValue_ = this.identifierValue_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$UninterpretedOption.positiveIntValue_ = this.positiveIntValue_;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$UninterpretedOption.negativeIntValue_ = this.negativeIntValue_;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$UninterpretedOption.doubleValue_ = this.doubleValue_;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$UninterpretedOption.stringValue_ = this.stringValue_;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                descriptorProtos$UninterpretedOption.aggregateValue_ = this.aggregateValue_;
                i |= 32;
            }
            DescriptorProtos$UninterpretedOption.access$30576(descriptorProtos$UninterpretedOption, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                descriptorProtos$UninterpretedOption.name_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.name_ = Collections.unmodifiableList(this.name_);
                this.bitField0_ &= -2;
            }
            descriptorProtos$UninterpretedOption.name_ = this.name_;
        }

        private void ensureNameIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.name_ = new ArrayList(this.name_);
                this.bitField0_ |= 1;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11812;
        }

        private C4195 internalGetNameFieldBuilder() {
            if (this.nameBuilder_ == null) {
                this.nameBuilder_ = new C4195(this.name_, getParentForChildren(), isClean());
                this.name_ = null;
            }
            return this.nameBuilder_;
        }

        public C4127 addAllName(Iterable<? extends NamePart> iterable) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureNameIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.name_);
            onChanged();
            return this;
        }

        public C4127 addName(NamePart.C4126 c4126) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4126.build());
                return this;
            }
            ensureNameIsMutable();
            this.name_.add(c4126.build());
            onChanged();
            return this;
        }

        public NamePart.C4126 addNameBuilder() {
            return (NamePart.C4126) internalGetNameFieldBuilder().m8019(NamePart.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$UninterpretedOption build() {
            DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOptionBuildPartial = buildPartial();
            if (descriptorProtos$UninterpretedOptionBuildPartial.isInitialized()) {
                return descriptorProtos$UninterpretedOptionBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$UninterpretedOptionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$UninterpretedOption buildPartial() {
            DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption(this);
            buildPartialRepeatedFields(descriptorProtos$UninterpretedOption);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$UninterpretedOption);
            }
            onBuilt();
            return descriptorProtos$UninterpretedOption;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4127 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.nameBuilder_;
            if (c4195 == null) {
                this.name_ = Collections.EMPTY_LIST;
            } else {
                this.name_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            this.identifierValue_ = "";
            this.positiveIntValue_ = 0L;
            this.negativeIntValue_ = 0L;
            this.doubleValue_ = 0.0d;
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
            return this;
        }

        public C4127 clearAggregateValue() {
            this.aggregateValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getAggregateValue();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C4127 clearDoubleValue() {
            this.bitField0_ &= -17;
            this.doubleValue_ = 0.0d;
            onChanged();
            return this;
        }

        public C4127 clearIdentifierValue() {
            this.identifierValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getIdentifierValue();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4127 clearName() {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.name_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4127 clearNegativeIntValue() {
            this.bitField0_ &= -9;
            this.negativeIntValue_ = 0L;
            onChanged();
            return this;
        }

        public C4127 clearPositiveIntValue() {
            this.bitField0_ &= -5;
            this.positiveIntValue_ = 0L;
            onChanged();
            return this;
        }

        public C4127 clearStringValue() {
            this.bitField0_ &= -33;
            this.stringValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getStringValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public String getAggregateValue() {
            Object obj = this.aggregateValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aggregateValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public ByteString getAggregateValueBytes() {
            Object obj = this.aggregateValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aggregateValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11812;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public String getIdentifierValue() {
            Object obj = this.identifierValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.identifierValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public ByteString getIdentifierValueBytes() {
            Object obj = this.identifierValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.identifierValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public NamePart getName(int i) {
            C4195 c4195 = this.nameBuilder_;
            return c4195 == null ? this.name_.get(i) : (NamePart) c4195.m8025(i, false);
        }

        public NamePart.C4126 getNameBuilder(int i) {
            return (NamePart.C4126) internalGetNameFieldBuilder().m8032(i);
        }

        public List<NamePart.C4126> getNameBuilderList() {
            return internalGetNameFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4505
        public int getNameCount() {
            C4195 c4195 = this.nameBuilder_;
            return c4195 == null ? this.name_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4505
        public List<NamePart> getNameList() {
            C4195 c4195 = this.nameBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.name_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4505
        public InterfaceC4504 getNameOrBuilder(int i) {
            C4195 c4195 = this.nameBuilder_;
            return c4195 == null ? this.name_.get(i) : (InterfaceC4504) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4505
        public List<? extends InterfaceC4504> getNameOrBuilderList() {
            C4195 c4195 = this.nameBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC4505
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4505
        public boolean hasStringValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11811;
            c4451.m8386(DescriptorProtos$UninterpretedOption.class, C4127.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getNameCount(); i++) {
                if (!getName(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C4127 mergeFrom(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            if (descriptorProtos$UninterpretedOption == DescriptorProtos$UninterpretedOption.getDefaultInstance()) {
                return this;
            }
            if (this.nameBuilder_ == null) {
                if (!descriptorProtos$UninterpretedOption.name_.isEmpty()) {
                    if (this.name_.isEmpty()) {
                        this.name_ = descriptorProtos$UninterpretedOption.name_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureNameIsMutable();
                        this.name_.addAll(descriptorProtos$UninterpretedOption.name_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$UninterpretedOption.name_.isEmpty()) {
                boolean zIsEmpty = this.nameBuilder_.f11357.isEmpty();
                C4195 c4195 = this.nameBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.nameBuilder_ = null;
                    this.name_ = descriptorProtos$UninterpretedOption.name_;
                    this.bitField0_ &= -2;
                    this.nameBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNameFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$UninterpretedOption.name_);
                }
            }
            if (descriptorProtos$UninterpretedOption.hasIdentifierValue()) {
                this.identifierValue_ = descriptorProtos$UninterpretedOption.identifierValue_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (descriptorProtos$UninterpretedOption.hasPositiveIntValue()) {
                setPositiveIntValue(descriptorProtos$UninterpretedOption.getPositiveIntValue());
            }
            if (descriptorProtos$UninterpretedOption.hasNegativeIntValue()) {
                setNegativeIntValue(descriptorProtos$UninterpretedOption.getNegativeIntValue());
            }
            if (descriptorProtos$UninterpretedOption.hasDoubleValue()) {
                setDoubleValue(descriptorProtos$UninterpretedOption.getDoubleValue());
            }
            if (descriptorProtos$UninterpretedOption.hasStringValue()) {
                setStringValue(descriptorProtos$UninterpretedOption.getStringValue());
            }
            if (descriptorProtos$UninterpretedOption.hasAggregateValue()) {
                this.aggregateValue_ = descriptorProtos$UninterpretedOption.aggregateValue_;
                this.bitField0_ |= 64;
                onChanged();
            }
            mergeUnknownFields(descriptorProtos$UninterpretedOption.getUnknownFields());
            onChanged();
            return this;
        }

        public C4127 removeName(int i) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureNameIsMutable();
            this.name_.remove(i);
            onChanged();
            return this;
        }

        public C4127 setAggregateValue(String str) {
            str.getClass();
            this.aggregateValue_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4127 setAggregateValueBytes(ByteString byteString) {
            byteString.getClass();
            this.aggregateValue_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4127 setDoubleValue(double d) {
            this.doubleValue_ = d;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4127 setIdentifierValue(String str) {
            str.getClass();
            this.identifierValue_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4127 setIdentifierValueBytes(ByteString byteString) {
            byteString.getClass();
            this.identifierValue_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4127 setName(int i, NamePart.C4126 c4126) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4126.build());
                return this;
            }
            ensureNameIsMutable();
            this.name_.set(i, c4126.build());
            onChanged();
            return this;
        }

        public C4127 setNegativeIntValue(long j) {
            this.negativeIntValue_ = j;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4127 setPositiveIntValue(long j) {
            this.positiveIntValue_ = j;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4127 setStringValue(ByteString byteString) {
            byteString.getClass();
            this.stringValue_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$UninterpretedOption getDefaultInstanceForType() {
            return DescriptorProtos$UninterpretedOption.getDefaultInstance();
        }

        public NamePart.C4126 addNameBuilder(int i) {
            return (NamePart.C4126) internalGetNameFieldBuilder().m8020(i, NamePart.getDefaultInstance());
        }

        private C4127(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = Collections.EMPTY_LIST;
            this.identifierValue_ = "";
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
        }

        public C4127 addName(int i, NamePart namePart) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.add(i, namePart);
                onChanged();
                return this;
            }
            c4195.m8018(i, namePart);
            return this;
        }

        public C4127 setName(int i, NamePart namePart) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.set(i, namePart);
                onChanged();
                return this;
            }
            c4195.m8022(i, namePart);
            return this;
        }

        public C4127 addName(NamePart namePart) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.add(namePart);
                onChanged();
                return this;
            }
            c4195.m8017(namePart);
            return this;
        }

        public C4127 addName(int i, NamePart.C4126 c4126) {
            C4195 c4195 = this.nameBuilder_;
            if (c4195 == null) {
                ensureNameIsMutable();
                this.name_.add(i, c4126.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4126.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4127 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$UninterpretedOption) {
                return mergeFrom((DescriptorProtos$UninterpretedOption) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4127 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 18) {
                                NamePart namePart = (NamePart) abstractC4306.mo8274(NamePart.parser(), c4529);
                                C4195 c4195 = this.nameBuilder_;
                                if (c4195 == null) {
                                    ensureNameIsMutable();
                                    this.name_.add(namePart);
                                } else {
                                    c4195.m8017(namePart);
                                }
                            } else if (iMo8264 == 26) {
                                this.identifierValue_ = abstractC4306.mo8278();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 32) {
                                this.positiveIntValue_ = abstractC4306.mo8262();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 40) {
                                this.negativeIntValue_ = abstractC4306.mo8277();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 49) {
                                this.doubleValue_ = abstractC4306.mo8282();
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 58) {
                                this.stringValue_ = abstractC4306.mo8278();
                                this.bitField0_ |= 32;
                            } else if (iMo8264 != 66) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                this.aggregateValue_ = abstractC4306.mo8278();
                                this.bitField0_ |= 64;
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$UninterpretedOption getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4127 newBuilderForType() {
        return newBuilder();
    }

    public static C4127 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private DescriptorProtos$UninterpretedOption(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.identifierValue_ = "";
        this.positiveIntValue_ = 0L;
        this.negativeIntValue_ = 0L;
        this.doubleValue_ = 0.0d;
        this.stringValue_ = ByteString.EMPTY;
        this.aggregateValue_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }
}

package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$UninterpretedOption extends GeneratedMessage implements InterfaceC3673 {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "UninterpretedOption");
        DEFAULT_INSTANCE = new DescriptorProtos$UninterpretedOption();
        PARSER = new C3669();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11467;
    }

    public static C3295 newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3673
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

    @Override // com.google.protobuf.InterfaceC3673
    public ByteString getAggregateValueBytes() {
        Object obj = this.aggregateValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.aggregateValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11467;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // com.google.protobuf.InterfaceC3673
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

    @Override // com.google.protobuf.InterfaceC3673
    public ByteString getIdentifierValueBytes() {
        Object obj = this.identifierValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.identifierValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public NamePart getName(int i) {
        return this.name_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3673
    public int getNameCount() {
        return this.name_.size();
    }

    @Override // com.google.protobuf.InterfaceC3673
    public List<NamePart> getNameList() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public InterfaceC3672 getNameOrBuilder(int i) {
        return this.name_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3673
    public List<? extends InterfaceC3672> getNameOrBuilderList() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int size = this.name_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.name_.get(i2));
        }
        int iComputeStringSize = iM7643 + size;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC3462.m7637(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3462.m7640(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3462.m7642(6) + 8;
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC3462.m7633(7, this.stringValue_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(8, this.aggregateValue_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public ByteString getStringValue() {
        return this.stringValue_;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3673
    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getNameCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getNameList().hashCode();
        }
        if (hasIdentifierValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getIdentifierValue().hashCode();
        }
        if (hasPositiveIntValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + AbstractC3402.m7502(getPositiveIntValue());
        }
        if (hasNegativeIntValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + AbstractC3402.m7502(getNegativeIntValue());
        }
        if (hasDoubleValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + AbstractC3402.m7502(Double.doubleToLongBits(getDoubleValue()));
        }
        if (hasStringValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 7, 53) + getStringValue().hashCode();
        }
        if (hasAggregateValue()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 8, 53) + getAggregateValue().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11466;
        c3619.m7827(DescriptorProtos$UninterpretedOption.class, C3295.class);
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
        for (int i = 0; i < getNameCount(); i++) {
            if (!getName(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3295 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3295(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3295 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3295() : new C3295().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.name_.size(); i++) {
            abstractC3462.mo7649(2, this.name_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7648(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7648(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.m7664(6, this.doubleValue_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3462.mo7666(7, this.stringValue_);
        }
        if ((this.bitField0_ & 32) != 0) {
            GeneratedMessage.writeString(abstractC3462, 8, this.aggregateValue_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class NamePart extends GeneratedMessage implements InterfaceC3672 {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static final InterfaceC3375 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized;
        private volatile Object namePart_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "NamePart");
            DEFAULT_INSTANCE = new NamePart();
            PARSER = new C3668();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11470;
        }

        public static C3294 newBuilder(NamePart namePart) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) {
            return (NamePart) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11470;
        }

        @Override // com.google.protobuf.InterfaceC3672
        public boolean getIsExtension() {
            return this.isExtension_;
        }

        @Override // com.google.protobuf.InterfaceC3672
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

        @Override // com.google.protobuf.InterfaceC3672
        public ByteString getNamePartBytes() {
            Object obj = this.namePart_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.namePart_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.namePart_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC3462.m7634(2);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3672
        public boolean hasIsExtension() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3672
        public boolean hasNamePart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNamePart()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getNamePart().hashCode();
            }
            if (hasIsExtension()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + AbstractC3402.m7503(getIsExtension());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11471;
            c3619.m7827(NamePart.class, C3294.class);
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

        @Override // com.google.protobuf.AbstractC3533
        public C3294 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3294(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3294 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3294() : new C3294().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3462, 1, this.namePart_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7663(2, this.isExtension_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3294 extends GeneratedMessage.AbstractC3305 implements InterfaceC3672 {
            private int bitField0_;
            private boolean isExtension_;
            private Object namePart_;

            private C3294() {
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

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11470;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public NamePart build() {
                NamePart namePartBuildPartial = buildPartial();
                if (namePartBuildPartial.isInitialized()) {
                    return namePartBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) namePartBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public NamePart buildPartial() {
                NamePart namePart = new NamePart(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(namePart);
                }
                onBuilt();
                return namePart;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3294 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.namePart_ = "";
                this.isExtension_ = false;
                return this;
            }

            public C3294 clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
                onChanged();
                return this;
            }

            public C3294 clearNamePart() {
                this.namePart_ = NamePart.getDefaultInstance().getNamePart();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11470;
            }

            @Override // com.google.protobuf.InterfaceC3672
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.InterfaceC3672
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

            @Override // com.google.protobuf.InterfaceC3672
            public ByteString getNamePartBytes() {
                Object obj = this.namePart_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.namePart_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3672
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3672
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11471;
                c3619.m7827(NamePart.class, C3294.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return hasNamePart() && hasIsExtension();
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3294 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 10) {
                                    this.namePart_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 16) {
                                    this.isExtension_ = abstractC3474.mo7720();
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

            public C3294 setIsExtension(boolean z) {
                this.isExtension_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3294 setNamePart(String str) {
                str.getClass();
                this.namePart_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3294 setNamePartBytes(ByteString byteString) {
                byteString.getClass();
                this.namePart_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public NamePart getDefaultInstanceForType() {
                return NamePart.getDefaultInstance();
            }

            private C3294(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.namePart_ = "";
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3294 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof NamePart) {
                    return mergeFrom((NamePart) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3294 mergeFrom(NamePart namePart) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public NamePart getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (NamePart) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3294 newBuilderForType() {
            return newBuilder();
        }

        public static C3294 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (NamePart) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        private NamePart(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.namePart_ = "";
            this.isExtension_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NamePart parseFrom(ByteString byteString) {
            return (NamePart) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static NamePart parseFrom(ByteString byteString, C3697 c3697) {
            return (NamePart) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static NamePart parseFrom(byte[] bArr) {
            return (NamePart) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static NamePart parseFrom(byte[] bArr, C3697 c3697) {
            return (NamePart) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static NamePart parseFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, C3697 c3697) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static NamePart parseFrom(AbstractC3474 abstractC3474) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static NamePart parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (NamePart) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3295 extends GeneratedMessage.AbstractC3305 implements InterfaceC3673 {
        private Object aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private Object identifierValue_;
        private C3363 nameBuilder_;
        private List<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;

        private C3295() {
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
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                descriptorProtos$UninterpretedOption.name_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11467;
        }

        private C3363 internalGetNameFieldBuilder() {
            if (this.nameBuilder_ == null) {
                this.nameBuilder_ = new C3363(this.name_, getParentForChildren(), isClean());
                this.name_ = null;
            }
            return this.nameBuilder_;
        }

        public C3295 addAllName(Iterable<? extends NamePart> iterable) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureNameIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.name_);
            onChanged();
            return this;
        }

        public C3295 addName(NamePart.C3294 c3294) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3294.build());
                return this;
            }
            ensureNameIsMutable();
            this.name_.add(c3294.build());
            onChanged();
            return this;
        }

        public NamePart.C3294 addNameBuilder() {
            return (NamePart.C3294) internalGetNameFieldBuilder().m7460(NamePart.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$UninterpretedOption build() {
            DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOptionBuildPartial = buildPartial();
            if (descriptorProtos$UninterpretedOptionBuildPartial.isInitialized()) {
                return descriptorProtos$UninterpretedOptionBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$UninterpretedOptionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$UninterpretedOption buildPartial() {
            DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption(this);
            buildPartialRepeatedFields(descriptorProtos$UninterpretedOption);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$UninterpretedOption);
            }
            onBuilt();
            return descriptorProtos$UninterpretedOption;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3295 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.nameBuilder_;
            if (c3363 == null) {
                this.name_ = Collections.EMPTY_LIST;
            } else {
                this.name_ = null;
                c3363.m7471();
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

        public C3295 clearAggregateValue() {
            this.aggregateValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getAggregateValue();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3295 clearDoubleValue() {
            this.bitField0_ &= -17;
            this.doubleValue_ = 0.0d;
            onChanged();
            return this;
        }

        public C3295 clearIdentifierValue() {
            this.identifierValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getIdentifierValue();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3295 clearName() {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.name_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3295 clearNegativeIntValue() {
            this.bitField0_ &= -9;
            this.negativeIntValue_ = 0L;
            onChanged();
            return this;
        }

        public C3295 clearPositiveIntValue() {
            this.bitField0_ &= -5;
            this.positiveIntValue_ = 0L;
            onChanged();
            return this;
        }

        public C3295 clearStringValue() {
            this.bitField0_ &= -33;
            this.stringValue_ = DescriptorProtos$UninterpretedOption.getDefaultInstance().getStringValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3673
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

        @Override // com.google.protobuf.InterfaceC3673
        public ByteString getAggregateValueBytes() {
            Object obj = this.aggregateValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aggregateValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11467;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // com.google.protobuf.InterfaceC3673
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

        @Override // com.google.protobuf.InterfaceC3673
        public ByteString getIdentifierValueBytes() {
            Object obj = this.identifierValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.identifierValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public NamePart getName(int i) {
            C3363 c3363 = this.nameBuilder_;
            return c3363 == null ? this.name_.get(i) : (NamePart) c3363.m7466(i, false);
        }

        public NamePart.C3294 getNameBuilder(int i) {
            return (NamePart.C3294) internalGetNameFieldBuilder().m7473(i);
        }

        public List<NamePart.C3294> getNameBuilderList() {
            return internalGetNameFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3673
        public int getNameCount() {
            C3363 c3363 = this.nameBuilder_;
            return c3363 == null ? this.name_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3673
        public List<NamePart> getNameList() {
            C3363 c3363 = this.nameBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.name_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3673
        public InterfaceC3672 getNameOrBuilder(int i) {
            C3363 c3363 = this.nameBuilder_;
            return c3363 == null ? this.name_.get(i) : (InterfaceC3672) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3673
        public List<? extends InterfaceC3672> getNameOrBuilderList() {
            C3363 c3363 = this.nameBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC3673
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3673
        public boolean hasStringValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11466;
            c3619.m7827(DescriptorProtos$UninterpretedOption.class, C3295.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getNameCount(); i++) {
                if (!getName(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C3295 mergeFrom(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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
                boolean zIsEmpty = this.nameBuilder_.f11012.isEmpty();
                C3363 c3363 = this.nameBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.nameBuilder_ = null;
                    this.name_ = descriptorProtos$UninterpretedOption.name_;
                    this.bitField0_ &= -2;
                    this.nameBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNameFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$UninterpretedOption.name_);
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

        public C3295 removeName(int i) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureNameIsMutable();
            this.name_.remove(i);
            onChanged();
            return this;
        }

        public C3295 setAggregateValue(String str) {
            str.getClass();
            this.aggregateValue_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3295 setAggregateValueBytes(ByteString byteString) {
            byteString.getClass();
            this.aggregateValue_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3295 setDoubleValue(double d) {
            this.doubleValue_ = d;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3295 setIdentifierValue(String str) {
            str.getClass();
            this.identifierValue_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3295 setIdentifierValueBytes(ByteString byteString) {
            byteString.getClass();
            this.identifierValue_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3295 setName(int i, NamePart.C3294 c3294) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3294.build());
                return this;
            }
            ensureNameIsMutable();
            this.name_.set(i, c3294.build());
            onChanged();
            return this;
        }

        public C3295 setNegativeIntValue(long j) {
            this.negativeIntValue_ = j;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3295 setPositiveIntValue(long j) {
            this.positiveIntValue_ = j;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3295 setStringValue(ByteString byteString) {
            byteString.getClass();
            this.stringValue_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$UninterpretedOption getDefaultInstanceForType() {
            return DescriptorProtos$UninterpretedOption.getDefaultInstance();
        }

        public NamePart.C3294 addNameBuilder(int i) {
            return (NamePart.C3294) internalGetNameFieldBuilder().m7461(i, NamePart.getDefaultInstance());
        }

        private C3295(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = Collections.EMPTY_LIST;
            this.identifierValue_ = "";
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
        }

        public C3295 addName(int i, NamePart namePart) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.add(i, namePart);
                onChanged();
                return this;
            }
            c3363.m7459(i, namePart);
            return this;
        }

        public C3295 setName(int i, NamePart namePart) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.set(i, namePart);
                onChanged();
                return this;
            }
            c3363.m7463(i, namePart);
            return this;
        }

        public C3295 addName(NamePart namePart) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 == null) {
                namePart.getClass();
                ensureNameIsMutable();
                this.name_.add(namePart);
                onChanged();
                return this;
            }
            c3363.m7458(namePart);
            return this;
        }

        public C3295 addName(int i, NamePart.C3294 c3294) {
            C3363 c3363 = this.nameBuilder_;
            if (c3363 == null) {
                ensureNameIsMutable();
                this.name_.add(i, c3294.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3294.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3295 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$UninterpretedOption) {
                return mergeFrom((DescriptorProtos$UninterpretedOption) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3295 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 18) {
                                NamePart namePart = (NamePart) abstractC3474.mo7715(NamePart.parser(), c3697);
                                C3363 c3363 = this.nameBuilder_;
                                if (c3363 == null) {
                                    ensureNameIsMutable();
                                    this.name_.add(namePart);
                                } else {
                                    c3363.m7458(namePart);
                                }
                            } else if (iMo7705 == 26) {
                                this.identifierValue_ = abstractC3474.mo7719();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 32) {
                                this.positiveIntValue_ = abstractC3474.mo7703();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 40) {
                                this.negativeIntValue_ = abstractC3474.mo7718();
                                this.bitField0_ |= 8;
                            } else if (iMo7705 == 49) {
                                this.doubleValue_ = abstractC3474.mo7723();
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 58) {
                                this.stringValue_ = abstractC3474.mo7719();
                                this.bitField0_ |= 32;
                            } else if (iMo7705 != 66) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                this.aggregateValue_ = abstractC3474.mo7719();
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$UninterpretedOption getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3295 newBuilderForType() {
        return newBuilder();
    }

    public static C3295 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private DescriptorProtos$UninterpretedOption(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.identifierValue_ = "";
        this.positiveIntValue_ = 0L;
        this.negativeIntValue_ = 0L;
        this.doubleValue_ = 0.0d;
        this.stringValue_ = ByteString.EMPTY;
        this.aggregateValue_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }
}

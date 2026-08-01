package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$ExtensionRangeOptions> implements InterfaceC4397 {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static final InterfaceC4207 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int VERIFICATION_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<Declaration> declaration_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
    private int verification_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRangeOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$ExtensionRangeOptions();
        PARSER = new C4385();
    }

    private DescriptorProtos$ExtensionRangeOptions() {
        this.verification_ = 1;
        this.memoizedIsInitialized = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.uninterpretedOption_ = list;
        this.declaration_ = list;
        this.verification_ = 1;
    }

    public static /* synthetic */ int access$8076(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions, int i) {
        int i2 = i | descriptorProtos$ExtensionRangeOptions.bitField0_;
        descriptorProtos$ExtensionRangeOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$ExtensionRangeOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11792;
    }

    public static C4103 newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$ExtensionRangeOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = (DescriptorProtos$ExtensionRangeOptions) obj;
        if (!getUninterpretedOptionList().equals(descriptorProtos$ExtensionRangeOptions.getUninterpretedOptionList()) || !getDeclarationList().equals(descriptorProtos$ExtensionRangeOptions.getDeclarationList()) || hasFeatures() != descriptorProtos$ExtensionRangeOptions.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(descriptorProtos$ExtensionRangeOptions.getFeatures())) && hasVerification() == descriptorProtos$ExtensionRangeOptions.hasVerification()) {
            return (!hasVerification() || this.verification_ == descriptorProtos$ExtensionRangeOptions.verification_) && getUnknownFields().equals(descriptorProtos$ExtensionRangeOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$ExtensionRangeOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public Declaration getDeclaration(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // com.google.protobuf.InterfaceC4397
    public List<Declaration> getDeclarationList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public InterfaceC4402 getDeclarationOrBuilder(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public List<? extends InterfaceC4402> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11792;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public InterfaceC4338 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
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
        int size = this.declaration_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.declaration_.get(i2));
        }
        int iM82022 = iM8202 + size;
        if ((this.bitField0_ & 2) != 0) {
            iM82022 += AbstractC4294.m8191(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            iM82022 += AbstractC4294.m8198(50, getFeatures());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM82022 += AbstractC4294.m8202(this.uninterpretedOption_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM82022;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC4397
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public VerificationState getVerification() {
        VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
        return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4397
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4397
    public boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        if (getDeclarationCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getDeclarationList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 50, 53) + getFeatures().hashCode();
        }
        if (hasVerification()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + this.verification_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC4365.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11793;
        c4451.m8386(DescriptorProtos$ExtensionRangeOptions.class, C4103.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4103 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4103(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4103 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4103() : new C4103().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.declaration_.size(); i++) {
            abstractC4294.mo8208(2, this.declaration_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8208(50, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            abstractC4294.mo8208(999, this.uninterpretedOption_.get(i2));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536870912, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Declaration extends GeneratedMessage implements InterfaceC4402 {
        private static final Declaration DEFAULT_INSTANCE;
        public static final int FULL_NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static final InterfaceC4207 PARSER;
        public static final int REPEATED_FIELD_NUMBER = 6;
        public static final int RESERVED_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object fullName_;
        private byte memoizedIsInitialized;
        private int number_;
        private boolean repeated_;
        private boolean reserved_;
        private volatile Object type_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Declaration");
            DEFAULT_INSTANCE = new Declaration();
            PARSER = new C4401();
        }

        private Declaration() {
            this.number_ = 0;
            this.fullName_ = "";
            this.type_ = "";
            this.reserved_ = false;
            this.repeated_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.fullName_ = "";
            this.type_ = "";
        }

        public static /* synthetic */ int access$7276(Declaration declaration, int i) {
            int i2 = i | declaration.bitField0_;
            declaration.bitField0_ = i2;
            return i2;
        }

        public static Declaration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11785;
        }

        public static C4102 newBuilder(Declaration declaration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(declaration);
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer) {
            return (Declaration) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Declaration)) {
                return super.equals(obj);
            }
            Declaration declaration = (Declaration) obj;
            if (hasNumber() != declaration.hasNumber()) {
                return false;
            }
            if ((hasNumber() && getNumber() != declaration.getNumber()) || hasFullName() != declaration.hasFullName()) {
                return false;
            }
            if ((hasFullName() && !getFullName().equals(declaration.getFullName())) || hasType() != declaration.hasType()) {
                return false;
            }
            if ((hasType() && !getType().equals(declaration.getType())) || hasReserved() != declaration.hasReserved()) {
                return false;
            }
            if ((!hasReserved() || getReserved() == declaration.getReserved()) && hasRepeated() == declaration.hasRepeated()) {
                return (!hasRepeated() || getRepeated() == declaration.getRepeated()) && getUnknownFields().equals(declaration.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11785;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public String getFullName() {
            Object obj = this.fullName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fullName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public ByteString getFullNameBytes() {
            Object obj = this.fullName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fullName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public InterfaceC4207 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean getRepeated() {
            return this.repeated_;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean getReserved() {
            return this.reserved_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM8190 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8190(1, this.number_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8190 += GeneratedMessage.computeStringSize(2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM8190 += GeneratedMessage.computeStringSize(3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM8190 += AbstractC4294.m8193(5);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM8190 += AbstractC4294.m8193(6);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8190;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.type_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean hasFullName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean hasRepeated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean hasReserved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4402
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNumber()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getNumber();
            }
            if (hasFullName()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getFullName().hashCode();
            }
            if (hasType()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getType().hashCode();
            }
            if (hasReserved()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + AbstractC4234.m8062(getReserved());
            }
            if (hasRepeated()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + AbstractC4234.m8062(getRepeated());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11784;
            c4451.m8386(Declaration.class, C4102.class);
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
        public C4102 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4102(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4102 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4102() : new C4102().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(1, this.number_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC4294, 2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC4294, 3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC4294.mo8222(5, this.reserved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                abstractC4294.mo8222(6, this.repeated_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4102 extends GeneratedMessage.AbstractC4137 implements InterfaceC4402 {
            private int bitField0_;
            private Object fullName_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private Object type_;

            private C4102() {
                this.fullName_ = "";
                this.type_ = "";
            }

            private void buildPartial0(Declaration declaration) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    declaration.number_ = this.number_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    declaration.fullName_ = this.fullName_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    declaration.type_ = this.type_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    declaration.reserved_ = this.reserved_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    declaration.repeated_ = this.repeated_;
                    i |= 16;
                }
                Declaration.access$7276(declaration, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11785;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Declaration build() {
                Declaration declarationBuildPartial = buildPartial();
                if (declarationBuildPartial.isInitialized()) {
                    return declarationBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) declarationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Declaration buildPartial() {
                Declaration declaration = new Declaration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(declaration);
                }
                onBuilt();
                return declaration;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4102 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.number_ = 0;
                this.fullName_ = "";
                this.type_ = "";
                this.reserved_ = false;
                this.repeated_ = false;
                return this;
            }

            public C4102 clearFullName() {
                this.fullName_ = Declaration.getDefaultInstance().getFullName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C4102 clearNumber() {
                this.bitField0_ &= -2;
                this.number_ = 0;
                onChanged();
                return this;
            }

            public C4102 clearRepeated() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
                onChanged();
                return this;
            }

            public C4102 clearReserved() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
                onChanged();
                return this;
            }

            public C4102 clearType() {
                this.type_ = Declaration.getDefaultInstance().getType();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11785;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public String getFullName() {
                Object obj = this.fullName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fullName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public ByteString getFullNameBytes() {
                Object obj = this.fullName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fullName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean getRepeated() {
                return this.repeated_;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean getReserved() {
                return this.reserved_;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.type_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean hasRepeated() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4402
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11784;
                c4451.m8386(Declaration.class, C4102.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4102 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    this.number_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 1;
                                } else if (iMo8264 == 18) {
                                    this.fullName_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 26) {
                                    this.type_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 4;
                                } else if (iMo8264 == 40) {
                                    this.reserved_ = abstractC4306.mo8279();
                                    this.bitField0_ |= 8;
                                } else if (iMo8264 == 48) {
                                    this.repeated_ = abstractC4306.mo8279();
                                    this.bitField0_ |= 16;
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

            public C4102 setFullName(String str) {
                str.getClass();
                this.fullName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4102 setFullNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fullName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4102 setNumber(int i) {
                this.number_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4102 setRepeated(boolean z) {
                this.repeated_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4102 setReserved(boolean z) {
                this.reserved_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C4102 setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4102 setTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.type_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public Declaration getDefaultInstanceForType() {
                return Declaration.getDefaultInstance();
            }

            private C4102(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.fullName_ = "";
                this.type_ = "";
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4102 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof Declaration) {
                    return mergeFrom((Declaration) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4102 mergeFrom(Declaration declaration) {
                if (declaration == Declaration.getDefaultInstance()) {
                    return this;
                }
                if (declaration.hasNumber()) {
                    setNumber(declaration.getNumber());
                }
                if (declaration.hasFullName()) {
                    this.fullName_ = declaration.fullName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (declaration.hasType()) {
                    this.type_ = declaration.type_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (declaration.hasReserved()) {
                    setReserved(declaration.getReserved());
                }
                if (declaration.hasRepeated()) {
                    setRepeated(declaration.getRepeated());
                }
                mergeUnknownFields(declaration.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Declaration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4102 newBuilderForType() {
            return newBuilder();
        }

        public static C4102 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (Declaration) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static Declaration parseFrom(ByteString byteString) {
            return (Declaration) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static Declaration parseFrom(ByteString byteString, C4529 c4529) {
            return (Declaration) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static Declaration parseFrom(byte[] bArr) {
            return (Declaration) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        private Declaration(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.number_ = 0;
            this.fullName_ = "";
            this.type_ = "";
            this.reserved_ = false;
            this.repeated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Declaration parseFrom(byte[] bArr, C4529 c4529) {
            return (Declaration) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static Declaration parseFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(InputStream inputStream, C4529 c4529) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static Declaration parseFrom(AbstractC4306 abstractC4306) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static Declaration parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4103 extends GeneratedMessage.AbstractC4136 implements InterfaceC4397 {
        private int bitField0_;
        private C4195 declarationBuilder_;
        private List<Declaration> declaration_;
        private C4174 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C4195 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private int verification_;

        private C4103() {
            List list = Collections.EMPTY_LIST;
            this.uninterpretedOption_ = list;
            this.declaration_ = list;
            this.verification_ = 1;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 4) != 0) {
                C4174 c4174 = this.featuresBuilder_;
                descriptorProtos$ExtensionRangeOptions.features_ = c4174 == null ? this.features_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$ExtensionRangeOptions.verification_ = this.verification_;
                i |= 2;
            }
            DescriptorProtos$ExtensionRangeOptions.access$8076(descriptorProtos$ExtensionRangeOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    this.bitField0_ &= -2;
                }
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = this.uninterpretedOption_;
            } else {
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = c4195.m8031();
            }
            C4195 c41952 = this.declarationBuilder_;
            if (c41952 != null) {
                descriptorProtos$ExtensionRangeOptions.declaration_ = c41952.m8031();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.declaration_ = Collections.unmodifiableList(this.declaration_);
                this.bitField0_ &= -3;
            }
            descriptorProtos$ExtensionRangeOptions.declaration_ = this.declaration_;
        }

        private void ensureDeclarationIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.declaration_ = new ArrayList(this.declaration_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 1;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11792;
        }

        private C4195 internalGetDeclarationFieldBuilder() {
            if (this.declarationBuilder_ == null) {
                this.declarationBuilder_ = new C4195(this.declaration_, getParentForChildren(), isClean());
                this.declaration_ = null;
            }
            return this.declarationBuilder_;
        }

        private C4174 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C4174(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C4195 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C4195(this.uninterpretedOption_, getParentForChildren(), isClean());
                this.uninterpretedOption_ = null;
            }
            return this.uninterpretedOptionBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetUninterpretedOptionFieldBuilder();
                internalGetDeclarationFieldBuilder();
                internalGetFeaturesFieldBuilder();
            }
        }

        public C4103 addAllDeclaration(Iterable<? extends Declaration> iterable) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureDeclarationIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.declaration_);
            onChanged();
            return this;
        }

        public C4103 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public C4103 addDeclaration(Declaration.C4102 c4102) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4102.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.add(c4102.build());
            onChanged();
            return this;
        }

        public Declaration.C4102 addDeclarationBuilder() {
            return (Declaration.C4102) internalGetDeclarationFieldBuilder().m8019(Declaration.getDefaultInstance());
        }

        public <Type> C4103 addExtension(C4448 c4448, Type type) {
            return (C4103) addExtension((AbstractC4411) c4448, type);
        }

        public C4103 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4127.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c4127.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8019(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$ExtensionRangeOptions build() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptionsBuildPartial = buildPartial();
            if (descriptorProtos$ExtensionRangeOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$ExtensionRangeOptionsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$ExtensionRangeOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$ExtensionRangeOptions buildPartial() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions(this);
            buildPartialRepeatedFields(descriptorProtos$ExtensionRangeOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ExtensionRangeOptions);
            }
            onBuilt();
            return descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4103 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            C4195 c41952 = this.declarationBuilder_;
            if (c41952 == null) {
                this.declaration_ = Collections.EMPTY_LIST;
            } else {
                this.declaration_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -3;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            this.verification_ = 1;
            return this;
        }

        public C4103 clearDeclaration() {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.declaration_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public <Type> C4103 clearExtension(C4448 c4448) {
            return (C4103) clearExtension((AbstractC4411) c4448);
        }

        public C4103 clearFeatures() {
            this.bitField0_ &= -5;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4103 clearUninterpretedOption() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4103 clearVerification() {
            this.bitField0_ &= -9;
            this.verification_ = 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4397
        public Declaration getDeclaration(int i) {
            C4195 c4195 = this.declarationBuilder_;
            return c4195 == null ? this.declaration_.get(i) : (Declaration) c4195.m8025(i, false);
        }

        public Declaration.C4102 getDeclarationBuilder(int i) {
            return (Declaration.C4102) internalGetDeclarationFieldBuilder().m8032(i);
        }

        public List<Declaration.C4102> getDeclarationBuilderList() {
            return internalGetDeclarationFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public int getDeclarationCount() {
            C4195 c4195 = this.declarationBuilder_;
            return c4195 == null ? this.declaration_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public List<Declaration> getDeclarationList() {
            C4195 c4195 = this.declarationBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.declaration_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public InterfaceC4402 getDeclarationOrBuilder(int i) {
            C4195 c4195 = this.declarationBuilder_;
            return c4195 == null ? this.declaration_.get(i) : (InterfaceC4402) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4397
        public List<? extends InterfaceC4402> getDeclarationOrBuilderList() {
            C4195 c4195 = this.declarationBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.declaration_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11792;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4397
        public DescriptorProtos$FeatureSet getFeatures() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FeatureSet) c4174.m7939();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C4105 getFeaturesBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$FeatureSet.C4105) internalGetFeaturesFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public InterfaceC4338 getFeaturesOrBuilder() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (InterfaceC4338) c4174.m7938();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4397
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c4195.m8025(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C4127 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C4127> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public int getUninterpretedOptionCount() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4397
        public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (InterfaceC4505) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4397
        public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC4397
        public VerificationState getVerification() {
            VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
            return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4397
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4397
        public boolean hasVerification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11793;
            c4451.m8386(DescriptorProtos$ExtensionRangeOptions.class, C4103.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    return false;
                }
            }
            return (!hasFeatures() || getFeatures().isInitialized()) && extensionsAreInitialized();
        }

        public C4103 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public C4103 mergeFrom(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            if (descriptorProtos$ExtensionRangeOptions == DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                return this;
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$ExtensionRangeOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$ExtensionRangeOptions.uninterpretedOption_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$ExtensionRangeOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$ExtensionRangeOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11357.isEmpty();
                C4195 c4195 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$ExtensionRangeOptions.uninterpretedOption_;
                    this.bitField0_ &= -2;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$ExtensionRangeOptions.uninterpretedOption_);
                }
            }
            if (this.declarationBuilder_ == null) {
                if (!descriptorProtos$ExtensionRangeOptions.declaration_.isEmpty()) {
                    if (this.declaration_.isEmpty()) {
                        this.declaration_ = descriptorProtos$ExtensionRangeOptions.declaration_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureDeclarationIsMutable();
                        this.declaration_.addAll(descriptorProtos$ExtensionRangeOptions.declaration_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$ExtensionRangeOptions.declaration_.isEmpty()) {
                boolean zIsEmpty2 = this.declarationBuilder_.f11357.isEmpty();
                C4195 c41952 = this.declarationBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.declarationBuilder_ = null;
                    this.declaration_ = descriptorProtos$ExtensionRangeOptions.declaration_;
                    this.bitField0_ &= -3;
                    this.declarationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDeclarationFieldBuilder() : null;
                } else {
                    c41952.m8021(descriptorProtos$ExtensionRangeOptions.declaration_);
                }
            }
            if (descriptorProtos$ExtensionRangeOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$ExtensionRangeOptions.getFeatures());
            }
            if (descriptorProtos$ExtensionRangeOptions.hasVerification()) {
                setVerification(descriptorProtos$ExtensionRangeOptions.getVerification());
            }
            mergeExtensionFields(descriptorProtos$ExtensionRangeOptions);
            mergeUnknownFields(descriptorProtos$ExtensionRangeOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C4103 removeDeclaration(int i) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.remove(i);
            onChanged();
            return this;
        }

        public C4103 removeUninterpretedOption(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C4103 setDeclaration(int i, Declaration.C4102 c4102) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4102.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.set(i, c4102.build());
            onChanged();
            return this;
        }

        public <Type> C4103 setExtension(C4448 c4448, Type type) {
            return (C4103) setExtension((AbstractC4411) c4448, type);
        }

        public C4103 setFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                this.features_ = c4105.build();
            } else {
                c4174.m7946(c4105.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4103 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4127.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c4127.build());
            onChanged();
            return this;
        }

        public C4103 setVerification(VerificationState verificationState) {
            verificationState.getClass();
            this.bitField0_ |= 8;
            this.verification_ = verificationState.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
            return DescriptorProtos$ExtensionRangeOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4103 setExtension(C4448 c4448, int i, Type type) {
            return (C4103) setExtension((AbstractC4411) c4448, i, type);
        }

        public Declaration.C4102 addDeclarationBuilder(int i) {
            return (Declaration.C4102) internalGetDeclarationFieldBuilder().m8020(i, Declaration.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8020(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C4103(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            List list = Collections.EMPTY_LIST;
            this.uninterpretedOption_ = list;
            this.declaration_ = list;
            this.verification_ = 1;
            maybeForceBuilderInitialization();
        }

        public C4103 addDeclaration(int i, Declaration declaration) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(i, declaration);
                onChanged();
                return this;
            }
            c4195.m8018(i, declaration);
            return this;
        }

        public C4103 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4103 setDeclaration(int i, Declaration declaration) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.set(i, declaration);
                onChanged();
                return this;
            }
            c4195.m8022(i, declaration);
            return this;
        }

        public C4103 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c4174.m7946(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4103 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4103 addDeclaration(Declaration declaration) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(declaration);
                onChanged();
                return this;
            }
            c4195.m8017(declaration);
            return this;
        }

        public C4103 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4103 addDeclaration(int i, Declaration.C4102 c4102) {
            C4195 c4195 = this.declarationBuilder_;
            if (c4195 == null) {
                ensureDeclarationIsMutable();
                this.declaration_.add(i, c4102.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4102.build());
            return this;
        }

        public C4103 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c4127.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4127.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4103 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$ExtensionRangeOptions) {
                return mergeFrom((DescriptorProtos$ExtensionRangeOptions) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4103 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 18) {
                                Declaration declaration = (Declaration) abstractC4306.mo8274(Declaration.parser(), c4529);
                                C4195 c4195 = this.declarationBuilder_;
                                if (c4195 == null) {
                                    ensureDeclarationIsMutable();
                                    this.declaration_.add(declaration);
                                } else {
                                    c4195.m8017(declaration);
                                }
                            } else if (iMo8264 == 24) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (VerificationState.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(3, iMo8283);
                                } else {
                                    this.verification_ = iMo8283;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo8264 == 402) {
                                abstractC4306.mo8275(internalGetFeaturesFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4;
                            } else if (iMo8264 != 7994) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC4306.mo8274(DescriptorProtos$UninterpretedOption.parser(), c4529);
                                C4195 c41952 = this.uninterpretedOptionBuilder_;
                                if (c41952 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c41952.m8017(descriptorProtos$UninterpretedOption);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
        return super.getExtension(abstractC4411, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
        return super.getExtensionCount(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
        return super.hasExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4103 newBuilderForType() {
        return newBuilder();
    }

    public static C4103 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private DescriptorProtos$ExtensionRangeOptions(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.verification_ = 1;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum VerificationState implements InterfaceC4213 {
        DECLARATION(0),
        UNVERIFIED(1);

        public static final int DECLARATION_VALUE = 0;
        public static final int UNVERIFIED_VALUE = 1;
        private static final VerificationState[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "VerificationState");
            internalValueMap = new C4398();
            VALUES = values();
        }

        VerificationState(int i) {
            this.value = i;
        }

        public static VerificationState forNumber(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i != 1) {
                return null;
            }
            return UNVERIFIED;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$ExtensionRangeOptions.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static VerificationState valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                return VALUES[c4496.f11730];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            return this.value;
        }

        public final C4496 getValueDescriptor() {
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static VerificationState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

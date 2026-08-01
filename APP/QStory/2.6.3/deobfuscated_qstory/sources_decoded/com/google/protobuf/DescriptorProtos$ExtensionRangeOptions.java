package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$ExtensionRangeOptions> implements InterfaceC3565 {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRangeOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$ExtensionRangeOptions();
        PARSER = new C3553();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11447;
    }

    public static C3271 newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3565
    public Declaration getDeclaration(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // com.google.protobuf.InterfaceC3565
    public List<Declaration> getDeclarationList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public InterfaceC3570 getDeclarationOrBuilder(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public List<? extends InterfaceC3570> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11447;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
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
        int size = this.declaration_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.declaration_.get(i2));
        }
        int iM76432 = iM7643 + size;
        if ((this.bitField0_ & 2) != 0) {
            iM76432 += AbstractC3462.m7632(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            iM76432 += AbstractC3462.m7639(50, getFeatures());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM76432 += AbstractC3462.m7643(this.uninterpretedOption_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM76432;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3565
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public VerificationState getVerification() {
        VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
        return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3565
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3565
    public boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        if (getDeclarationCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getDeclarationList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 50, 53) + getFeatures().hashCode();
        }
        if (hasVerification()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + this.verification_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11448;
        c3619.m7827(DescriptorProtos$ExtensionRangeOptions.class, C3271.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

    @Override // com.google.protobuf.AbstractC3533
    public C3271 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3271(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3271 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3271() : new C3271().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.declaration_.size(); i++) {
            abstractC3462.mo7649(2, this.declaration_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7649(50, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i2));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Declaration extends GeneratedMessage implements InterfaceC3570 {
        private static final Declaration DEFAULT_INSTANCE;
        public static final int FULL_NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static final InterfaceC3375 PARSER;
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
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Declaration");
            DEFAULT_INSTANCE = new Declaration();
            PARSER = new C3569();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11440;
        }

        public static C3270 newBuilder(Declaration declaration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(declaration);
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer) {
            return (Declaration) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11440;
        }

        @Override // com.google.protobuf.InterfaceC3570
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

        @Override // com.google.protobuf.InterfaceC3570
        public ByteString getFullNameBytes() {
            Object obj = this.fullName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fullName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public InterfaceC3375 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean getRepeated() {
            return this.repeated_;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean getReserved() {
            return this.reserved_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM7631 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7631(1, this.number_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7631 += GeneratedMessage.computeStringSize(2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7631 += GeneratedMessage.computeStringSize(3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7631 += AbstractC3462.m7634(5);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM7631 += AbstractC3462.m7634(6);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7631;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3570
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

        @Override // com.google.protobuf.InterfaceC3570
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean hasFullName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean hasRepeated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean hasReserved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3570
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNumber()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getNumber();
            }
            if (hasFullName()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getFullName().hashCode();
            }
            if (hasType()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getType().hashCode();
            }
            if (hasReserved()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + AbstractC3402.m7503(getReserved());
            }
            if (hasRepeated()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + AbstractC3402.m7503(getRepeated());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11439;
            c3619.m7827(Declaration.class, C3270.class);
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
        public C3270 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3270(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3270 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3270() : new C3270().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(1, this.number_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3462, 2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3462, 3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3462.mo7663(5, this.reserved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                abstractC3462.mo7663(6, this.repeated_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3270 extends GeneratedMessage.AbstractC3305 implements InterfaceC3570 {
            private int bitField0_;
            private Object fullName_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private Object type_;

            private C3270() {
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

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11440;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Declaration build() {
                Declaration declarationBuildPartial = buildPartial();
                if (declarationBuildPartial.isInitialized()) {
                    return declarationBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) declarationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Declaration buildPartial() {
                Declaration declaration = new Declaration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(declaration);
                }
                onBuilt();
                return declaration;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3270 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.number_ = 0;
                this.fullName_ = "";
                this.type_ = "";
                this.reserved_ = false;
                this.repeated_ = false;
                return this;
            }

            public C3270 clearFullName() {
                this.fullName_ = Declaration.getDefaultInstance().getFullName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3270 clearNumber() {
                this.bitField0_ &= -2;
                this.number_ = 0;
                onChanged();
                return this;
            }

            public C3270 clearRepeated() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
                onChanged();
                return this;
            }

            public C3270 clearReserved() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
                onChanged();
                return this;
            }

            public C3270 clearType() {
                this.type_ = Declaration.getDefaultInstance().getType();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11440;
            }

            @Override // com.google.protobuf.InterfaceC3570
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

            @Override // com.google.protobuf.InterfaceC3570
            public ByteString getFullNameBytes() {
                Object obj = this.fullName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fullName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean getRepeated() {
                return this.repeated_;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean getReserved() {
                return this.reserved_;
            }

            @Override // com.google.protobuf.InterfaceC3570
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

            @Override // com.google.protobuf.InterfaceC3570
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean hasRepeated() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3570
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11439;
                c3619.m7827(Declaration.class, C3270.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3270 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    this.number_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 18) {
                                    this.fullName_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 26) {
                                    this.type_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 4;
                                } else if (iMo7705 == 40) {
                                    this.reserved_ = abstractC3474.mo7720();
                                    this.bitField0_ |= 8;
                                } else if (iMo7705 == 48) {
                                    this.repeated_ = abstractC3474.mo7720();
                                    this.bitField0_ |= 16;
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

            public C3270 setFullName(String str) {
                str.getClass();
                this.fullName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3270 setFullNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fullName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3270 setNumber(int i) {
                this.number_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3270 setRepeated(boolean z) {
                this.repeated_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3270 setReserved(boolean z) {
                this.reserved_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3270 setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3270 setTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.type_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public Declaration getDefaultInstanceForType() {
                return Declaration.getDefaultInstance();
            }

            private C3270(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.fullName_ = "";
                this.type_ = "";
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3270 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof Declaration) {
                    return mergeFrom((Declaration) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3270 mergeFrom(Declaration declaration) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Declaration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3270 newBuilderForType() {
            return newBuilder();
        }

        public static C3270 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (Declaration) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static Declaration parseFrom(ByteString byteString) {
            return (Declaration) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static Declaration parseFrom(ByteString byteString, C3697 c3697) {
            return (Declaration) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static Declaration parseFrom(byte[] bArr) {
            return (Declaration) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        private Declaration(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.number_ = 0;
            this.fullName_ = "";
            this.type_ = "";
            this.reserved_ = false;
            this.repeated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Declaration parseFrom(byte[] bArr, C3697 c3697) {
            return (Declaration) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static Declaration parseFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(InputStream inputStream, C3697 c3697) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static Declaration parseFrom(AbstractC3474 abstractC3474) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static Declaration parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3271 extends GeneratedMessage.AbstractC3304 implements InterfaceC3565 {
        private int bitField0_;
        private C3363 declarationBuilder_;
        private List<Declaration> declaration_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private int verification_;

        private C3271() {
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
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$ExtensionRangeOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
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
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    this.bitField0_ &= -2;
                }
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = this.uninterpretedOption_;
            } else {
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = c3363.m7472();
            }
            C3363 c33632 = this.declarationBuilder_;
            if (c33632 != null) {
                descriptorProtos$ExtensionRangeOptions.declaration_ = c33632.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11447;
        }

        private C3363 internalGetDeclarationFieldBuilder() {
            if (this.declarationBuilder_ == null) {
                this.declarationBuilder_ = new C3363(this.declaration_, getParentForChildren(), isClean());
                this.declaration_ = null;
            }
            return this.declarationBuilder_;
        }

        private C3342 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3342(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3363 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3363(this.uninterpretedOption_, getParentForChildren(), isClean());
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

        public C3271 addAllDeclaration(Iterable<? extends Declaration> iterable) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureDeclarationIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.declaration_);
            onChanged();
            return this;
        }

        public C3271 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public C3271 addDeclaration(Declaration.C3270 c3270) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3270.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.add(c3270.build());
            onChanged();
            return this;
        }

        public Declaration.C3270 addDeclarationBuilder() {
            return (Declaration.C3270) internalGetDeclarationFieldBuilder().m7460(Declaration.getDefaultInstance());
        }

        public <Type> C3271 addExtension(C3616 c3616, Type type) {
            return (C3271) addExtension((AbstractC3579) c3616, type);
        }

        public C3271 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3295.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7460(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$ExtensionRangeOptions build() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptionsBuildPartial = buildPartial();
            if (descriptorProtos$ExtensionRangeOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$ExtensionRangeOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$ExtensionRangeOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$ExtensionRangeOptions buildPartial() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions(this);
            buildPartialRepeatedFields(descriptorProtos$ExtensionRangeOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ExtensionRangeOptions);
            }
            onBuilt();
            return descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3271 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            C3363 c33632 = this.declarationBuilder_;
            if (c33632 == null) {
                this.declaration_ = Collections.EMPTY_LIST;
            } else {
                this.declaration_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -3;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            this.verification_ = 1;
            return this;
        }

        public C3271 clearDeclaration() {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.declaration_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public <Type> C3271 clearExtension(C3616 c3616) {
            return (C3271) clearExtension((AbstractC3579) c3616);
        }

        public C3271 clearFeatures() {
            this.bitField0_ &= -5;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3271 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3271 clearVerification() {
            this.bitField0_ &= -9;
            this.verification_ = 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3565
        public Declaration getDeclaration(int i) {
            C3363 c3363 = this.declarationBuilder_;
            return c3363 == null ? this.declaration_.get(i) : (Declaration) c3363.m7466(i, false);
        }

        public Declaration.C3270 getDeclarationBuilder(int i) {
            return (Declaration.C3270) internalGetDeclarationFieldBuilder().m7473(i);
        }

        public List<Declaration.C3270> getDeclarationBuilderList() {
            return internalGetDeclarationFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public int getDeclarationCount() {
            C3363 c3363 = this.declarationBuilder_;
            return c3363 == null ? this.declaration_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public List<Declaration> getDeclarationList() {
            C3363 c3363 = this.declarationBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.declaration_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public InterfaceC3570 getDeclarationOrBuilder(int i) {
            C3363 c3363 = this.declarationBuilder_;
            return c3363 == null ? this.declaration_.get(i) : (InterfaceC3570) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3565
        public List<? extends InterfaceC3570> getDeclarationOrBuilderList() {
            C3363 c3363 = this.declarationBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.declaration_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11447;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3565
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3565
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3363.m7466(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3295 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3295> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3565
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3565
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3565
        public VerificationState getVerification() {
            VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
            return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3565
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3565
        public boolean hasVerification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11448;
            c3619.m7827(DescriptorProtos$ExtensionRangeOptions.class, C3271.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    return false;
                }
            }
            return (!hasFeatures() || getFeatures().isInitialized()) && extensionsAreInitialized();
        }

        public C3271 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
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

        public C3271 mergeFrom(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$ExtensionRangeOptions.uninterpretedOption_;
                    this.bitField0_ &= -2;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$ExtensionRangeOptions.uninterpretedOption_);
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
                boolean zIsEmpty2 = this.declarationBuilder_.f11012.isEmpty();
                C3363 c33632 = this.declarationBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.declarationBuilder_ = null;
                    this.declaration_ = descriptorProtos$ExtensionRangeOptions.declaration_;
                    this.bitField0_ &= -3;
                    this.declarationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDeclarationFieldBuilder() : null;
                } else {
                    c33632.m7462(descriptorProtos$ExtensionRangeOptions.declaration_);
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

        public C3271 removeDeclaration(int i) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.remove(i);
            onChanged();
            return this;
        }

        public C3271 removeUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3271 setDeclaration(int i, Declaration.C3270 c3270) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3270.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.set(i, c3270.build());
            onChanged();
            return this;
        }

        public <Type> C3271 setExtension(C3616 c3616, Type type) {
            return (C3271) setExtension((AbstractC3579) c3616, type);
        }

        public C3271 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3271 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3295.build());
            onChanged();
            return this;
        }

        public C3271 setVerification(VerificationState verificationState) {
            verificationState.getClass();
            this.bitField0_ |= 8;
            this.verification_ = verificationState.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
            return DescriptorProtos$ExtensionRangeOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3271 setExtension(C3616 c3616, int i, Type type) {
            return (C3271) setExtension((AbstractC3579) c3616, i, type);
        }

        public Declaration.C3270 addDeclarationBuilder(int i) {
            return (Declaration.C3270) internalGetDeclarationFieldBuilder().m7461(i, Declaration.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C3271(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            List list = Collections.EMPTY_LIST;
            this.uninterpretedOption_ = list;
            this.declaration_ = list;
            this.verification_ = 1;
            maybeForceBuilderInitialization();
        }

        public C3271 addDeclaration(int i, Declaration declaration) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(i, declaration);
                onChanged();
                return this;
            }
            c3363.m7459(i, declaration);
            return this;
        }

        public C3271 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3271 setDeclaration(int i, Declaration declaration) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.set(i, declaration);
                onChanged();
                return this;
            }
            c3363.m7463(i, declaration);
            return this;
        }

        public C3271 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3271 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3271 addDeclaration(Declaration declaration) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(declaration);
                onChanged();
                return this;
            }
            c3363.m7458(declaration);
            return this;
        }

        public C3271 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3271 addDeclaration(int i, Declaration.C3270 c3270) {
            C3363 c3363 = this.declarationBuilder_;
            if (c3363 == null) {
                ensureDeclarationIsMutable();
                this.declaration_.add(i, c3270.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3270.build());
            return this;
        }

        public C3271 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3295.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3295.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3271 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$ExtensionRangeOptions) {
                return mergeFrom((DescriptorProtos$ExtensionRangeOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3271 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 18) {
                                Declaration declaration = (Declaration) abstractC3474.mo7715(Declaration.parser(), c3697);
                                C3363 c3363 = this.declarationBuilder_;
                                if (c3363 == null) {
                                    ensureDeclarationIsMutable();
                                    this.declaration_.add(declaration);
                                } else {
                                    c3363.m7458(declaration);
                                }
                            } else if (iMo7705 == 24) {
                                int iMo7724 = abstractC3474.mo7724();
                                if (VerificationState.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(3, iMo7724);
                                } else {
                                    this.verification_ = iMo7724;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo7705 == 402) {
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 4;
                            } else if (iMo7705 != 7994) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3474.mo7715(DescriptorProtos$UninterpretedOption.parser(), c3697);
                                C3363 c33632 = this.uninterpretedOptionBuilder_;
                                if (c33632 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c33632.m7458(descriptorProtos$UninterpretedOption);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3271 newBuilderForType() {
        return newBuilder();
    }

    public static C3271 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private DescriptorProtos$ExtensionRangeOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.verification_ = 1;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum VerificationState implements InterfaceC3381 {
        DECLARATION(0),
        UNVERIFIED(1);

        public static final int DECLARATION_VALUE = 0;
        public static final int UNVERIFIED_VALUE = 1;
        private static final VerificationState[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "VerificationState");
            internalValueMap = new C3566();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$ExtensionRangeOptions.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static VerificationState valueOf(C3664 c3664) {
            if (c3664.f11384 == getDescriptor()) {
                return VALUES[c3664.f11385];
            }
            C5925.m11310("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3666 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3399
        public final int getNumber() {
            return this.value;
        }

        public final C3664 getValueDescriptor() {
            C3666 descriptor = getDescriptor();
            return descriptor.f11394[ordinal()];
        }

        @Deprecated
        public static VerificationState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$ExtensionRangeOptions> implements InterfaceC3564 {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRangeOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$ExtensionRangeOptions();
        PARSER = new C3552();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11442;
    }

    public static C3270 newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3564
    public Declaration getDeclaration(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // com.google.protobuf.InterfaceC3564
    public List<Declaration> getDeclarationList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public InterfaceC3569 getDeclarationOrBuilder(int i) {
        return this.declaration_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public List<? extends InterfaceC3569> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11442;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public InterfaceC3505 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
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
        int size = this.declaration_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.declaration_.get(i2));
        }
        int iM76562 = iM7656 + size;
        if ((this.bitField0_ & 2) != 0) {
            iM76562 += AbstractC3461.m7645(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            iM76562 += AbstractC3461.m7652(50, getFeatures());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM76562 += AbstractC3461.m7656(this.uninterpretedOption_.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM76562;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3564
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public VerificationState getVerification() {
        VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
        return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3564
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3564
    public boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        if (getDeclarationCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getDeclarationList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 50, 53) + getFeatures().hashCode();
        }
        if (hasVerification()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + this.verification_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11443;
        c3618.m7840(DescriptorProtos$ExtensionRangeOptions.class, C3270.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3270 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3270(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3270 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3270() : new C3270().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.declaration_.size(); i++) {
            abstractC3461.mo7662(2, this.declaration_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(3, this.verification_);
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7662(50, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            abstractC3461.mo7662(999, this.uninterpretedOption_.get(i2));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536870912, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Declaration extends GeneratedMessage implements InterfaceC3569 {
        private static final Declaration DEFAULT_INSTANCE;
        public static final int FULL_NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static final InterfaceC3374 PARSER;
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
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Declaration");
            DEFAULT_INSTANCE = new Declaration();
            PARSER = new C3568();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11435;
        }

        public static C3269 newBuilder(Declaration declaration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(declaration);
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer) {
            return (Declaration) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11435;
        }

        @Override // com.google.protobuf.InterfaceC3569
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

        @Override // com.google.protobuf.InterfaceC3569
        public ByteString getFullNameBytes() {
            Object obj = this.fullName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fullName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public InterfaceC3374 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean getRepeated() {
            return this.repeated_;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean getReserved() {
            return this.reserved_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM7644 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7644(1, this.number_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7644 += GeneratedMessage.computeStringSize(2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7644 += GeneratedMessage.computeStringSize(3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7644 += AbstractC3461.m7647(5);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM7644 += AbstractC3461.m7647(6);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7644;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3569
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

        @Override // com.google.protobuf.InterfaceC3569
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean hasFullName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean hasRepeated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean hasReserved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3569
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNumber()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getNumber();
            }
            if (hasFullName()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getFullName().hashCode();
            }
            if (hasType()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getType().hashCode();
            }
            if (hasReserved()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + AbstractC3401.m7516(getReserved());
            }
            if (hasRepeated()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + AbstractC3401.m7516(getRepeated());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11434;
            c3618.m7840(Declaration.class, C3269.class);
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
        public C3269 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3269(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3269 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3269() : new C3269().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(1, this.number_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3461, 2, this.fullName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3461, 3, this.type_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3461.mo7676(5, this.reserved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                abstractC3461.mo7676(6, this.repeated_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3269 extends GeneratedMessage.AbstractC3304 implements InterfaceC3569 {
            private int bitField0_;
            private Object fullName_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private Object type_;

            private C3269() {
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

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11435;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Declaration build() {
                Declaration declarationBuildPartial = buildPartial();
                if (declarationBuildPartial.isInitialized()) {
                    return declarationBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) declarationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Declaration buildPartial() {
                Declaration declaration = new Declaration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(declaration);
                }
                onBuilt();
                return declaration;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3269 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.number_ = 0;
                this.fullName_ = "";
                this.type_ = "";
                this.reserved_ = false;
                this.repeated_ = false;
                return this;
            }

            public C3269 clearFullName() {
                this.fullName_ = Declaration.getDefaultInstance().getFullName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3269 clearNumber() {
                this.bitField0_ &= -2;
                this.number_ = 0;
                onChanged();
                return this;
            }

            public C3269 clearRepeated() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
                onChanged();
                return this;
            }

            public C3269 clearReserved() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
                onChanged();
                return this;
            }

            public C3269 clearType() {
                this.type_ = Declaration.getDefaultInstance().getType();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11435;
            }

            @Override // com.google.protobuf.InterfaceC3569
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

            @Override // com.google.protobuf.InterfaceC3569
            public ByteString getFullNameBytes() {
                Object obj = this.fullName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fullName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean getRepeated() {
                return this.repeated_;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean getReserved() {
                return this.reserved_;
            }

            @Override // com.google.protobuf.InterfaceC3569
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

            @Override // com.google.protobuf.InterfaceC3569
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean hasRepeated() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3569
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11434;
                c3618.m7840(Declaration.class, C3269.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3269 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    this.number_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 1;
                                } else if (iMo7718 == 18) {
                                    this.fullName_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 26) {
                                    this.type_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 4;
                                } else if (iMo7718 == 40) {
                                    this.reserved_ = abstractC3473.mo7733();
                                    this.bitField0_ |= 8;
                                } else if (iMo7718 == 48) {
                                    this.repeated_ = abstractC3473.mo7733();
                                    this.bitField0_ |= 16;
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

            public C3269 setFullName(String str) {
                str.getClass();
                this.fullName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3269 setFullNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fullName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3269 setNumber(int i) {
                this.number_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3269 setRepeated(boolean z) {
                this.repeated_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3269 setReserved(boolean z) {
                this.reserved_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3269 setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3269 setTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.type_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public Declaration getDefaultInstanceForType() {
                return Declaration.getDefaultInstance();
            }

            private C3269(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.fullName_ = "";
                this.type_ = "";
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3269 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof Declaration) {
                    return mergeFrom((Declaration) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3269 mergeFrom(Declaration declaration) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Declaration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (Declaration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3269 newBuilderForType() {
            return newBuilder();
        }

        public static C3269 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (Declaration) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static Declaration parseFrom(ByteString byteString) {
            return (Declaration) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static Declaration parseFrom(ByteString byteString, C3696 c3696) {
            return (Declaration) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static Declaration parseFrom(byte[] bArr) {
            return (Declaration) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        private Declaration(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.number_ = 0;
            this.fullName_ = "";
            this.type_ = "";
            this.reserved_ = false;
            this.repeated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Declaration parseFrom(byte[] bArr, C3696 c3696) {
            return (Declaration) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static Declaration parseFrom(InputStream inputStream) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Declaration parseFrom(InputStream inputStream, C3696 c3696) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static Declaration parseFrom(AbstractC3473 abstractC3473) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static Declaration parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (Declaration) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3270 extends GeneratedMessage.AbstractC3303 implements InterfaceC3564 {
        private int bitField0_;
        private C3362 declarationBuilder_;
        private List<Declaration> declaration_;
        private C3341 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C3362 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private int verification_;

        private C3270() {
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
                C3341 c3341 = this.featuresBuilder_;
                descriptorProtos$ExtensionRangeOptions.features_ = c3341 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3341.m7397();
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
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    this.bitField0_ &= -2;
                }
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = this.uninterpretedOption_;
            } else {
                descriptorProtos$ExtensionRangeOptions.uninterpretedOption_ = c3362.m7485();
            }
            C3362 c33622 = this.declarationBuilder_;
            if (c33622 != null) {
                descriptorProtos$ExtensionRangeOptions.declaration_ = c33622.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11442;
        }

        private C3362 internalGetDeclarationFieldBuilder() {
            if (this.declarationBuilder_ == null) {
                this.declarationBuilder_ = new C3362(this.declaration_, getParentForChildren(), isClean());
                this.declaration_ = null;
            }
            return this.declarationBuilder_;
        }

        private C3341 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3341(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3362 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3362(this.uninterpretedOption_, getParentForChildren(), isClean());
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

        public C3270 addAllDeclaration(Iterable<? extends Declaration> iterable) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureDeclarationIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.declaration_);
            onChanged();
            return this;
        }

        public C3270 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public C3270 addDeclaration(Declaration.C3269 c3269) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3269.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.add(c3269.build());
            onChanged();
            return this;
        }

        public Declaration.C3269 addDeclarationBuilder() {
            return (Declaration.C3269) internalGetDeclarationFieldBuilder().m7473(Declaration.getDefaultInstance());
        }

        public <Type> C3270 addExtension(C3615 c3615, Type type) {
            return (C3270) addExtension((AbstractC3578) c3615, type);
        }

        public C3270 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3294.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7473(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$ExtensionRangeOptions build() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptionsBuildPartial = buildPartial();
            if (descriptorProtos$ExtensionRangeOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$ExtensionRangeOptionsBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$ExtensionRangeOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$ExtensionRangeOptions buildPartial() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions(this);
            buildPartialRepeatedFields(descriptorProtos$ExtensionRangeOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ExtensionRangeOptions);
            }
            onBuilt();
            return descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3270 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            C3362 c33622 = this.declarationBuilder_;
            if (c33622 == null) {
                this.declaration_ = Collections.EMPTY_LIST;
            } else {
                this.declaration_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -3;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            this.verification_ = 1;
            return this;
        }

        public C3270 clearDeclaration() {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.declaration_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public <Type> C3270 clearExtension(C3615 c3615) {
            return (C3270) clearExtension((AbstractC3578) c3615);
        }

        public C3270 clearFeatures() {
            this.bitField0_ &= -5;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3270 clearUninterpretedOption() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3270 clearVerification() {
            this.bitField0_ &= -9;
            this.verification_ = 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3564
        public Declaration getDeclaration(int i) {
            C3362 c3362 = this.declarationBuilder_;
            return c3362 == null ? this.declaration_.get(i) : (Declaration) c3362.m7479(i, false);
        }

        public Declaration.C3269 getDeclarationBuilder(int i) {
            return (Declaration.C3269) internalGetDeclarationFieldBuilder().m7486(i);
        }

        public List<Declaration.C3269> getDeclarationBuilderList() {
            return internalGetDeclarationFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public int getDeclarationCount() {
            C3362 c3362 = this.declarationBuilder_;
            return c3362 == null ? this.declaration_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public List<Declaration> getDeclarationList() {
            C3362 c3362 = this.declarationBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.declaration_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public InterfaceC3569 getDeclarationOrBuilder(int i) {
            C3362 c3362 = this.declarationBuilder_;
            return c3362 == null ? this.declaration_.get(i) : (InterfaceC3569) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3564
        public List<? extends InterfaceC3569> getDeclarationOrBuilderList() {
            C3362 c3362 = this.declarationBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.declaration_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11442;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3564
        public DescriptorProtos$FeatureSet getFeatures() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$FeatureSet) c3341.m7393();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3272 getFeaturesBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3272) internalGetFeaturesFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public InterfaceC3505 getFeaturesOrBuilder() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (InterfaceC3505) c3341.m7392();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3564
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3362.m7479(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3294 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3294> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public int getUninterpretedOptionCount() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3564
        public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3672) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3564
        public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3564
        public VerificationState getVerification() {
            VerificationState verificationStateForNumber = VerificationState.forNumber(this.verification_);
            return verificationStateForNumber == null ? VerificationState.UNVERIFIED : verificationStateForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3564
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3564
        public boolean hasVerification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11443;
            c3618.m7840(DescriptorProtos$ExtensionRangeOptions.class, C3270.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    return false;
                }
            }
            return (!hasFeatures() || getFeatures().isInitialized()) && extensionsAreInitialized();
        }

        public C3270 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$FeatureSet);
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

        public C3270 mergeFrom(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11007.isEmpty();
                C3362 c3362 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$ExtensionRangeOptions.uninterpretedOption_;
                    this.bitField0_ &= -2;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$ExtensionRangeOptions.uninterpretedOption_);
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
                boolean zIsEmpty2 = this.declarationBuilder_.f11007.isEmpty();
                C3362 c33622 = this.declarationBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.declarationBuilder_ = null;
                    this.declaration_ = descriptorProtos$ExtensionRangeOptions.declaration_;
                    this.bitField0_ &= -3;
                    this.declarationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDeclarationFieldBuilder() : null;
                } else {
                    c33622.m7475(descriptorProtos$ExtensionRangeOptions.declaration_);
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

        public C3270 removeDeclaration(int i) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.remove(i);
            onChanged();
            return this;
        }

        public C3270 removeUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3270 setDeclaration(int i, Declaration.C3269 c3269) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3269.build());
                return this;
            }
            ensureDeclarationIsMutable();
            this.declaration_.set(i, c3269.build());
            onChanged();
            return this;
        }

        public <Type> C3270 setExtension(C3615 c3615, Type type) {
            return (C3270) setExtension((AbstractC3578) c3615, type);
        }

        public C3270 setFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                this.features_ = c3272.build();
            } else {
                c3341.m7400(c3272.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3270 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3294.build());
            onChanged();
            return this;
        }

        public C3270 setVerification(VerificationState verificationState) {
            verificationState.getClass();
            this.bitField0_ |= 8;
            this.verification_ = verificationState.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
            return DescriptorProtos$ExtensionRangeOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3270 setExtension(C3615 c3615, int i, Type type) {
            return (C3270) setExtension((AbstractC3578) c3615, i, type);
        }

        public Declaration.C3269 addDeclarationBuilder(int i) {
            return (Declaration.C3269) internalGetDeclarationFieldBuilder().m7474(i, Declaration.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7474(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C3270(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            List list = Collections.EMPTY_LIST;
            this.uninterpretedOption_ = list;
            this.declaration_ = list;
            this.verification_ = 1;
            maybeForceBuilderInitialization();
        }

        public C3270 addDeclaration(int i, Declaration declaration) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(i, declaration);
                onChanged();
                return this;
            }
            c3362.m7472(i, declaration);
            return this;
        }

        public C3270 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3270 setDeclaration(int i, Declaration declaration) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.set(i, declaration);
                onChanged();
                return this;
            }
            c3362.m7476(i, declaration);
            return this;
        }

        public C3270 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3341.m7400(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3270 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3270 addDeclaration(Declaration declaration) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 == null) {
                declaration.getClass();
                ensureDeclarationIsMutable();
                this.declaration_.add(declaration);
                onChanged();
                return this;
            }
            c3362.m7471(declaration);
            return this;
        }

        public C3270 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3270 addDeclaration(int i, Declaration.C3269 c3269) {
            C3362 c3362 = this.declarationBuilder_;
            if (c3362 == null) {
                ensureDeclarationIsMutable();
                this.declaration_.add(i, c3269.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3269.build());
            return this;
        }

        public C3270 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3294.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3294.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3270 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$ExtensionRangeOptions) {
                return mergeFrom((DescriptorProtos$ExtensionRangeOptions) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3270 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 18) {
                                Declaration declaration = (Declaration) abstractC3473.mo7728(Declaration.parser(), c3696);
                                C3362 c3362 = this.declarationBuilder_;
                                if (c3362 == null) {
                                    ensureDeclarationIsMutable();
                                    this.declaration_.add(declaration);
                                } else {
                                    c3362.m7471(declaration);
                                }
                            } else if (iMo7718 == 24) {
                                int iMo7737 = abstractC3473.mo7737();
                                if (VerificationState.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(3, iMo7737);
                                } else {
                                    this.verification_ = iMo7737;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo7718 == 402) {
                                abstractC3473.mo7729(internalGetFeaturesFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 4;
                            } else if (iMo7718 != 7994) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3473.mo7728(DescriptorProtos$UninterpretedOption.parser(), c3696);
                                C3362 c33622 = this.uninterpretedOptionBuilder_;
                                if (c33622 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c33622.m7471(descriptorProtos$UninterpretedOption);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3270 newBuilderForType() {
        return newBuilder();
    }

    public static C3270 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private DescriptorProtos$ExtensionRangeOptions(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
        this.verification_ = 1;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum VerificationState implements InterfaceC3380 {
        DECLARATION(0),
        UNVERIFIED(1);

        public static final int DECLARATION_VALUE = 0;
        public static final int UNVERIFIED_VALUE = 1;
        private static final VerificationState[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "VerificationState");
            internalValueMap = new C3565();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$ExtensionRangeOptions.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static VerificationState valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static VerificationState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

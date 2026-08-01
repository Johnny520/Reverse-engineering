package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import p071.C6917;
import p075.C6960;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {
    public static InterfaceC4699 PARSER = new C6917(15);
    private static final ProtoBuf$Property defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private List<ProtoBuf$Annotation> backingFieldAnnotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$ValueParameter> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private List<ProtoBuf$Annotation> delegateFieldAnnotation_;
    private List<ProtoBuf$Annotation> extensionReceiverAnnotation_;
    private int flags_;
    private List<ProtoBuf$Annotation> getterAnnotation_;
    private ProtoBuf$Contract getterContract_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private List<ProtoBuf$Annotation> setterAnnotation_;
    private ProtoBuf$Contract setterContract_;
    private int setterFlags_;
    private ProtoBuf$ValueParameter setterValueParameter_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private final AbstractC4710 unknownFields;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(true);
        defaultInstance = protoBuf$Property;
        protoBuf$Property.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ProtoBuf$Property(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r23, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):void");
    }

    public static ProtoBuf$Property getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.contextParameter_ = list;
        this.setterValueParameter_ = ProtoBuf$ValueParameter.getDefaultInstance();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.getterAnnotation_ = list;
        this.setterAnnotation_ = list;
        this.extensionReceiverAnnotation_ = list;
        this.backingFieldAnnotation_ = list;
        this.delegateFieldAnnotation_ = list;
        this.getterContract_ = ProtoBuf$Contract.getDefaultInstance();
        this.setterContract_ = ProtoBuf$Contract.getDefaultInstance();
    }

    public static C6960 newBuilder(ProtoBuf$Property protoBuf$Property) {
        C6960 c6960NewBuilder = newBuilder();
        c6960NewBuilder.m12268(protoBuf$Property);
        return c6960NewBuilder;
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public ProtoBuf$Annotation getBackingFieldAnnotation(int i) {
        return this.backingFieldAnnotation_.get(i);
    }

    public int getBackingFieldAnnotationCount() {
        return this.backingFieldAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getBackingFieldAnnotationList() {
        return this.backingFieldAnnotation_;
    }

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ProtoBuf$ValueParameter getContextParameter(int i) {
        return this.contextParameter_.get(i);
    }

    public int getContextParameterCount() {
        return this.contextParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getContextParameterList() {
        return this.contextParameter_;
    }

    public ProtoBuf$Type getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ProtoBuf$Type> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public ProtoBuf$Annotation getDelegateFieldAnnotation(int i) {
        return this.delegateFieldAnnotation_.get(i);
    }

    public int getDelegateFieldAnnotationCount() {
        return this.delegateFieldAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getDelegateFieldAnnotationList() {
        return this.delegateFieldAnnotation_;
    }

    public ProtoBuf$Annotation getExtensionReceiverAnnotation(int i) {
        return this.extensionReceiverAnnotation_.get(i);
    }

    public int getExtensionReceiverAnnotationCount() {
        return this.extensionReceiverAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getExtensionReceiverAnnotationList() {
        return this.extensionReceiverAnnotation_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ProtoBuf$Annotation getGetterAnnotation(int i) {
        return this.getterAnnotation_.get(i);
    }

    public int getGetterAnnotationCount() {
        return this.getterAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getGetterAnnotationList() {
        return this.getterAnnotation_;
    }

    public ProtoBuf$Contract getGetterContract() {
        return this.getterContract_;
    }

    public int getGetterFlags() {
        return this.getterFlags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Type getReceiverType() {
        return this.receiverType_;
    }

    public int getReceiverTypeId() {
        return this.receiverTypeId_;
    }

    public ProtoBuf$Type getReturnType() {
        return this.returnType_;
    }

    public int getReturnTypeId() {
        return this.returnTypeId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 2) == 2 ? C4708.m9362(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9362(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9360(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9362 += C4708.m9360(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9362 += C4708.m9360(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9362 += C4708.m9360(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iM9362 += C4708.m9362(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iM9362 += C4708.m9362(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9362(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9362 += C4708.m9362(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9362 += C4708.m9362(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            iM9362 += C4708.m9360(12, this.contextReceiverType_.get(i3));
        }
        int iM9361 = 0;
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            iM9361 += C4708.m9361(this.contextReceiverTypeId_.get(i4).intValue());
        }
        int iM9360 = iM9362 + iM9361;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM9360 = iM9360 + 1 + C4708.m9361(iM9361);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM9361;
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            iM9360 += C4708.m9360(14, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
            iM9360 += C4708.m9360(15, this.getterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
            iM9360 += C4708.m9360(16, this.setterAnnotation_.get(i7));
        }
        for (int i8 = 0; i8 < this.contextParameter_.size(); i8++) {
            iM9360 += C4708.m9360(17, this.contextParameter_.get(i8));
        }
        int iM93612 = 0;
        for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
            iM93612 += C4708.m9361(this.versionRequirement_.get(i9).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9360 + iM93612;
        for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
            size += C4708.m9360(32, this.compilerPluginData_.get(i10));
        }
        for (int i11 = 0; i11 < this.extensionReceiverAnnotation_.size(); i11++) {
            size += C4708.m9360(33, this.extensionReceiverAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.backingFieldAnnotation_.size(); i12++) {
            size += C4708.m9360(34, this.backingFieldAnnotation_.get(i12));
        }
        for (int i13 = 0; i13 < this.delegateFieldAnnotation_.size(); i13++) {
            size += C4708.m9360(35, this.delegateFieldAnnotation_.get(i13));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            size += C4708.m9360(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            size += C4708.m9360(41, this.setterContract_);
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$Annotation getSetterAnnotation(int i) {
        return this.setterAnnotation_.get(i);
    }

    public int getSetterAnnotationCount() {
        return this.setterAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getSetterAnnotationList() {
        return this.setterAnnotation_;
    }

    public ProtoBuf$Contract getSetterContract() {
        return this.setterContract_;
    }

    public int getSetterFlags() {
        return this.setterFlags_;
    }

    public ProtoBuf$ValueParameter getSetterValueParameter() {
        return this.setterValueParameter_;
    }

    public ProtoBuf$TypeParameter getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ProtoBuf$TypeParameter> getTypeParameterList() {
        return this.typeParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetterContract() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasGetterFlags() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasOldFlags() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReceiverType() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasReceiverTypeId() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasReturnType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasReturnTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasSetterContract() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasSetterFlags() {
        return (this.bitField0_ & 512) == 512;
    }

    public boolean hasSetterValueParameter() {
        return (this.bitField0_ & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasReturnType() && !getReturnType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasReceiverType() && !getReceiverType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
            if (!getContextReceiverType(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
            if (!getContextParameter(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
            if (!getCompilerPluginData(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
            if (!getAnnotation(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
            if (!getGetterAnnotation(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
            if (!getSetterAnnotation(i7).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
            if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
            if (!getBackingFieldAnnotation(i9).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
            if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasGetterContract() && !getGetterContract().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasSetterContract() && !getSetterContract().isInitialized()) {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9378(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9370(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c4708.m9370(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9370(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            c4708.m9370(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            c4708.m9378(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            c4708.m9378(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9378(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c4708.m9378(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            c4708.m9370(12, this.contextReceiverType_.get(i2));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c4708.m9366(106);
            c4708.m9366(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            c4708.m9371(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            c4708.m9370(14, this.annotation_.get(i4));
        }
        for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
            c4708.m9370(15, this.getterAnnotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
            c4708.m9370(16, this.setterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            c4708.m9370(17, this.contextParameter_.get(i7));
        }
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            c4708.m9378(31, this.versionRequirement_.get(i8).intValue());
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            c4708.m9370(32, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            c4708.m9370(33, this.extensionReceiverAnnotation_.get(i10));
        }
        for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
            c4708.m9370(34, this.backingFieldAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
            c4708.m9370(35, this.delegateFieldAnnotation_.get(i12));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            c4708.m9370(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            c4708.m9370(41, this.setterContract_);
        }
        c4720NewExtensionWriter.m9410(19000, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Property getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6960 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6960 toBuilder() {
        return newBuilder(this);
    }

    public static C6960 newBuilder() {
        return C6960.m12267();
    }

    private ProtoBuf$Property(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$Property(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

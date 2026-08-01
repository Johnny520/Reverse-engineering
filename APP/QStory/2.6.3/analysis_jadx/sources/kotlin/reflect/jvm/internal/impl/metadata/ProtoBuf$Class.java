package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6951;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {
    public static InterfaceC4699 PARSER = new C6917(5);
    private static final ProtoBuf$Class defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int companionObjectName_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$Constructor> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private List<ProtoBuf$EnumEntry> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<ProtoBuf$Function> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private ProtoBuf$Type inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<ProtoBuf$Property> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<ProtoBuf$Type> supertype_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC4710 unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;
    private List<Integer> versionRequirement_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Kind implements InterfaceC4722 {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static InterfaceC4723 internalValueMap = new C4679();
        private final int value;

        Kind(int i, int i2) {
            this.value = i2;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(true);
        defaultInstance = protoBuf$Class;
        protoBuf$Class.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ProtoBuf$Class(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r22, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):void");
    }

    public static ProtoBuf$Class getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.supertype_ = list;
        this.supertypeId_ = list;
        this.nestedClassName_ = list;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.constructor_ = list;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.enumEntry_ = list;
        this.sealedSubclassFqName_ = list;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.annotation_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        this.compilerPluginData_ = list;
    }

    public static C6951 newBuilder(ProtoBuf$Class protoBuf$Class) {
        C6951 c6951NewBuilder = newBuilder();
        c6951NewBuilder.m12247(protoBuf$Class);
        return c6951NewBuilder;
    }

    public static ProtoBuf$Class parseFrom(InputStream inputStream, C4726 c4726) throws InvalidProtocolBufferException {
        AbstractC4712 abstractC4712 = (AbstractC4712) PARSER;
        abstractC4712.getClass();
        C4709 c4709 = new C4709(inputStream);
        InterfaceC4701 interfaceC4701 = (InterfaceC4701) abstractC4712.mo9272(c4709, c4726);
        try {
            if (c4709.f13765 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4712.m9406(interfaceC4701);
            return (ProtoBuf$Class) interfaceC4701;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4701);
        }
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

    public int getCompanionObjectName() {
        return this.companionObjectName_;
    }

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ProtoBuf$Constructor getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public List<ProtoBuf$Constructor> getConstructorList() {
        return this.constructor_;
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

    public ProtoBuf$EnumEntry getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public List<ProtoBuf$EnumEntry> getEnumEntryList() {
        return this.enumEntry_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFqName() {
        return this.fqName_;
    }

    public ProtoBuf$Function getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ProtoBuf$Function> getFunctionList() {
        return this.function_;
    }

    public int getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public ProtoBuf$Type getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public int getInlineClassUnderlyingTypeId() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public List<Integer> getNestedClassNameList() {
        return this.nestedClassName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Property getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ProtoBuf$Property> getPropertyList() {
        return this.property_;
    }

    public List<Integer> getSealedSubclassFqNameList() {
        return this.sealedSubclassFqName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.flags_) : 0;
        int iM9361 = 0;
        for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
            iM9361 += C4708.m9361(this.supertypeId_.get(i2).intValue());
        }
        int iM9360 = iM9362 + iM9361;
        if (!getSupertypeIdList().isEmpty()) {
            iM9360 = iM9360 + 1 + C4708.m9361(iM9361);
        }
        this.supertypeIdMemoizedSerializedSize = iM9361;
        if ((this.bitField0_ & 2) == 2) {
            iM9360 += C4708.m9362(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9360 += C4708.m9362(4, this.companionObjectName_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iM9360 += C4708.m9360(5, this.typeParameter_.get(i3));
        }
        for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
            iM9360 += C4708.m9360(6, this.supertype_.get(i4));
        }
        int iM93612 = 0;
        for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
            iM93612 += C4708.m9361(this.nestedClassName_.get(i5).intValue());
        }
        int iM93602 = iM9360 + iM93612;
        if (!getNestedClassNameList().isEmpty()) {
            iM93602 = iM93602 + 1 + C4708.m9361(iM93612);
        }
        this.nestedClassNameMemoizedSerializedSize = iM93612;
        for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
            iM93602 += C4708.m9360(8, this.constructor_.get(i6));
        }
        for (int i7 = 0; i7 < this.function_.size(); i7++) {
            iM93602 += C4708.m9360(9, this.function_.get(i7));
        }
        for (int i8 = 0; i8 < this.property_.size(); i8++) {
            iM93602 += C4708.m9360(10, this.property_.get(i8));
        }
        for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
            iM93602 += C4708.m9360(11, this.typeAlias_.get(i9));
        }
        for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
            iM93602 += C4708.m9360(13, this.enumEntry_.get(i10));
        }
        int iM93613 = 0;
        for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
            iM93613 += C4708.m9361(this.sealedSubclassFqName_.get(i11).intValue());
        }
        int iM93603 = iM93602 + iM93613;
        if (!getSealedSubclassFqNameList().isEmpty()) {
            iM93603 = iM93603 + 2 + C4708.m9361(iM93613);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iM93613;
        if ((this.bitField0_ & 8) == 8) {
            iM93603 += C4708.m9362(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM93603 += C4708.m9360(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM93603 += C4708.m9362(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
            iM93603 += C4708.m9360(20, this.contextReceiverType_.get(i12));
        }
        int iM93614 = 0;
        for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
            iM93614 += C4708.m9361(this.contextReceiverTypeId_.get(i13).intValue());
        }
        int iM93604 = iM93603 + iM93614;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM93604 = iM93604 + 2 + C4708.m9361(iM93614);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM93614;
        for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
            iM93604 += C4708.m9360(25, this.annotation_.get(i14));
        }
        if ((this.bitField0_ & 64) == 64) {
            iM93604 += C4708.m9360(30, this.typeTable_);
        }
        int iM93615 = 0;
        for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
            iM93615 += C4708.m9361(this.versionRequirement_.get(i15).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM93604 + iM93615;
        if ((this.bitField0_ & 128) == 128) {
            size += C4708.m9360(32, this.versionRequirementTable_);
        }
        for (int i16 = 0; i16 < this.compilerPluginData_.size(); i16++) {
            size += C4708.m9360(33, this.compilerPluginData_.get(i16));
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$Type getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public List<Integer> getSupertypeIdList() {
        return this.supertypeId_;
    }

    public List<ProtoBuf$Type> getSupertypeList() {
        return this.supertype_;
    }

    public ProtoBuf$TypeAlias getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ProtoBuf$TypeAlias> getTypeAliasList() {
        return this.typeAlias_;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasCompanionObjectName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasFqName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasInlineClassUnderlyingPropertyName() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasInlineClassUnderlyingType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasInlineClassUnderlyingTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasVersionRequirementTable() {
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
        if (!hasFqName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
            if (!getSupertype(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
            if (!getContextReceiverType(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getConstructorCount(); i4++) {
            if (!getConstructor(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getFunctionCount(); i5++) {
            if (!getFunction(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getPropertyCount(); i6++) {
            if (!getProperty(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
            if (!getTypeAlias(i7).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
            if (!getEnumEntry(i8).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
            if (!getAnnotation(i9).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
            if (!getCompilerPluginData(i10).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
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
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.flags_);
        }
        if (getSupertypeIdList().size() > 0) {
            c4708.m9366(18);
            c4708.m9366(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            c4708.m9371(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9378(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            c4708.m9370(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            c4708.m9370(6, this.supertype_.get(i3));
        }
        if (getNestedClassNameList().size() > 0) {
            c4708.m9366(58);
            c4708.m9366(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            c4708.m9371(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            c4708.m9370(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            c4708.m9370(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            c4708.m9370(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            c4708.m9370(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            c4708.m9370(13, this.enumEntry_.get(i9));
        }
        if (getSealedSubclassFqNameList().size() > 0) {
            c4708.m9366(130);
            c4708.m9366(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            c4708.m9371(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9378(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9370(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9378(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            c4708.m9370(20, this.contextReceiverType_.get(i11));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c4708.m9366(170);
            c4708.m9366(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            c4708.m9371(this.contextReceiverTypeId_.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
            c4708.m9370(25, this.annotation_.get(i13));
        }
        if ((this.bitField0_ & 64) == 64) {
            c4708.m9370(30, this.typeTable_);
        }
        for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
            c4708.m9378(31, this.versionRequirement_.get(i14).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            c4708.m9370(32, this.versionRequirementTable_);
        }
        for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
            c4708.m9370(33, this.compilerPluginData_.get(i15));
        }
        c4720NewExtensionWriter.m9410(19000, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Class getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6951 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6951 toBuilder() {
        return newBuilder(this);
    }

    public static C6951 newBuilder() {
        return C6951.m12246();
    }

    private ProtoBuf$Class(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$Class(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

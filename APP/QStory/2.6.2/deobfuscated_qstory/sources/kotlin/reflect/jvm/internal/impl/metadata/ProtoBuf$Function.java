package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4711;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6958;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {
    public static InterfaceC4698 PARSER = new C6916(12);
    private static final ProtoBuf$Function defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$ValueParameter> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private ProtoBuf$Contract contract_;
    private List<ProtoBuf$Annotation> extensionReceiverAnnotation_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC4709 unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(true);
        defaultInstance = protoBuf$Function;
        protoBuf$Function.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0395  */
    /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r11v52, types: [飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v33, types: [飘花落叶言世楪哲苏子兰.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ProtoBuf$Function(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r22, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):void");
    }

    public static ProtoBuf$Function getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
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
        this.valueParameter_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.contract_ = ProtoBuf$Contract.getDefaultInstance();
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.extensionReceiverAnnotation_ = list;
    }

    public static C6958 newBuilder(ProtoBuf$Function protoBuf$Function) {
        C6958 c6958NewBuilder = newBuilder();
        c6958NewBuilder.m12240(protoBuf$Function);
        return c6958NewBuilder;
    }

    public static ProtoBuf$Function parseFrom(InputStream inputStream, C4725 c4725) throws InvalidProtocolBufferException {
        AbstractC4711 abstractC4711 = (AbstractC4711) PARSER;
        abstractC4711.getClass();
        C4708 c4708 = new C4708(inputStream);
        InterfaceC4700 interfaceC4700 = (InterfaceC4700) abstractC4711.mo9282(c4708, c4725);
        try {
            if (c4708.f13761 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4711.m9416(interfaceC4700);
            return (ProtoBuf$Function) interfaceC4700;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4700);
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

    public ProtoBuf$Contract getContract() {
        return this.contract_;
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

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 2) == 2 ? C4707.m9372(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9372(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9370(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9372 += C4707.m9370(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9372 += C4707.m9370(5, this.receiverType_);
        }
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            iM9372 += C4707.m9370(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9372 += C4707.m9372(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9372 += C4707.m9372(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9372 += C4707.m9372(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            iM9372 += C4707.m9370(10, this.contextReceiverType_.get(i4));
        }
        int iM9371 = 0;
        for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
            iM9371 += C4707.m9371(this.contextReceiverTypeId_.get(i5).intValue());
        }
        int iM9370 = iM9372 + iM9371;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM9370 = iM9370 + 1 + C4707.m9371(iM9371);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM9371;
        for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
            iM9370 += C4707.m9370(12, this.annotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            iM9370 += C4707.m9370(13, this.contextParameter_.get(i7));
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9370 += C4707.m9370(30, this.typeTable_);
        }
        int iM93712 = 0;
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            iM93712 += C4707.m9371(this.versionRequirement_.get(i8).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9370 + iM93712;
        if ((this.bitField0_ & 256) == 256) {
            size += C4707.m9370(32, this.contract_);
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            size += C4707.m9370(33, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            size += C4707.m9370(34, this.extensionReceiverAnnotation_.get(i10));
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
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

    public ProtoBuf$ValueParameter getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasContract() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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

    public boolean hasTypeTable() {
        return (this.bitField0_ & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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
        for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
            if (!getValueParameter(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasContract() && !getContract().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
            if (!getCompilerPluginData(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
            if (!getAnnotation(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
            if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9388(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9380(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c4707.m9380(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            c4707.m9380(5, this.receiverType_);
        }
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            c4707.m9380(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9388(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c4707.m9388(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            c4707.m9380(10, this.contextReceiverType_.get(i3));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c4707.m9376(90);
            c4707.m9376(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            c4707.m9381(this.contextReceiverTypeId_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            c4707.m9380(12, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
            c4707.m9380(13, this.contextParameter_.get(i6));
        }
        if ((this.bitField0_ & 128) == 128) {
            c4707.m9380(30, this.typeTable_);
        }
        for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
            c4707.m9388(31, this.versionRequirement_.get(i7).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            c4707.m9380(32, this.contract_);
        }
        for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
            c4707.m9380(33, this.compilerPluginData_.get(i8));
        }
        for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
            c4707.m9380(34, this.extensionReceiverAnnotation_.get(i9));
        }
        c4719NewExtensionWriter.m9420(19000, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Function getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6958 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6958 toBuilder() {
        return newBuilder(this);
    }

    public static C6958 newBuilder() {
        return C6958.m12239();
    }

    private ProtoBuf$Function(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$Function(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

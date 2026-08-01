package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$DescriptorProto extends GeneratedMessage implements InterfaceC3572 {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static final InterfaceC3375 PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    public static final int VISIBILITY_FIELD_NUMBER = 11;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<DescriptorProtos$EnumDescriptorProto> enumType_;
    private List<ExtensionRange> extensionRange_;
    private List<DescriptorProtos$FieldDescriptorProto> extension_;
    private List<DescriptorProtos$FieldDescriptorProto> field_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<DescriptorProtos$DescriptorProto> nestedType_;
    private List<DescriptorProtos$OneofDescriptorProto> oneofDecl_;
    private DescriptorProtos$MessageOptions options_;
    private C3384 reservedName_;
    private List<ReservedRange> reservedRange_;
    private int visibility_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "DescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$DescriptorProto();
        PARSER = new C3458();
    }

    private DescriptorProtos$DescriptorProto() {
        this.name_ = "";
        C3384 c3384 = C3384.f11037;
        this.reservedName_ = c3384;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.field_ = list;
        this.extension_ = list;
        this.nestedType_ = list;
        this.enumType_ = list;
        this.extensionRange_ = list;
        this.oneofDecl_ = list;
        this.reservedRange_ = list;
        this.reservedName_ = c3384;
        this.visibility_ = 0;
    }

    public static /* synthetic */ int access$5976(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int i) {
        int i2 = i | descriptorProtos$DescriptorProto.bitField0_;
        descriptorProtos$DescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11428;
    }

    public static C3264 newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$DescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) obj;
        if (hasName() != descriptorProtos$DescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$DescriptorProto.getName())) || !getFieldList().equals(descriptorProtos$DescriptorProto.getFieldList()) || !getExtensionList().equals(descriptorProtos$DescriptorProto.getExtensionList()) || !getNestedTypeList().equals(descriptorProtos$DescriptorProto.getNestedTypeList()) || !getEnumTypeList().equals(descriptorProtos$DescriptorProto.getEnumTypeList()) || !getExtensionRangeList().equals(descriptorProtos$DescriptorProto.getExtensionRangeList()) || !getOneofDeclList().equals(descriptorProtos$DescriptorProto.getOneofDeclList()) || hasOptions() != descriptorProtos$DescriptorProto.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(descriptorProtos$DescriptorProto.getOptions())) && getReservedRangeList().equals(descriptorProtos$DescriptorProto.getReservedRangeList()) && getReservedNameList().equals(descriptorProtos$DescriptorProto.getReservedNameList()) && hasVisibility() == descriptorProtos$DescriptorProto.hasVisibility()) {
            return (!hasVisibility() || this.visibility_ == descriptorProtos$DescriptorProto.visibility_) && getUnknownFields().equals(descriptorProtos$DescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11428;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3573 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3573> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3505 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3505> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public ExtensionRange getExtensionRange(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3460 getExtensionRangeOrBuilder(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3460> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$FieldDescriptorProto getField(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3505 getFieldOrBuilder(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3505> getFieldOrBuilderList() {
        return this.field_;
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
    public DescriptorProtos$DescriptorProto getNestedType(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3572 getNestedTypeOrBuilder(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3572> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3489 getOneofDeclOrBuilder(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3489> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3502 getOptionsOrBuilder() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getReservedNameCount() {
        return this.reservedName_.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public ReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC3572
    public InterfaceC3457 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3572
    public List<? extends InterfaceC3457> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.field_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.field_.get(i2));
        }
        int iM7643 = iComputeStringSize + size;
        int size2 = this.nestedType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7643 += AbstractC3462.m7643(this.nestedType_.get(i3));
        }
        int iM76432 = iM7643 + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM76432 += AbstractC3462.m7643(this.enumType_.get(i4));
        }
        int iM76433 = iM76432 + size3;
        int size4 = this.extensionRange_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM76433 += AbstractC3462.m7643(this.extensionRange_.get(i5));
        }
        int iM76434 = iM76433 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM76434 += AbstractC3462.m7643(this.extension_.get(i6));
        }
        int iM76435 = iM76434 + size5;
        if ((this.bitField0_ & 2) != 0) {
            iM76435 += AbstractC3462.m7639(7, getOptions());
        }
        int size6 = this.oneofDecl_.size();
        for (int i7 = 0; i7 < size6; i7++) {
            iM76435 += AbstractC3462.m7643(this.oneofDecl_.get(i7));
        }
        int iM76436 = iM76435 + size6;
        int size7 = this.reservedRange_.size();
        for (int i8 = 0; i8 < size7; i8++) {
            iM76436 += AbstractC3462.m7643(this.reservedRange_.get(i8));
        }
        int i9 = iM76436 + size7;
        int iComputeStringSizeNoTag = 0;
        for (int i10 = 0; i10 < this.reservedName_.f11038.size(); i10++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11038.get(i10));
        }
        int size8 = getReservedNameList().size() + i9 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size8 += AbstractC3462.m7632(11, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size8;
        this.memoizedSize = serializedSize;
        return serializedSize;
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

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getFieldCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getFieldList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + getExtensionList().hashCode();
        }
        if (getNestedTypeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getNestedTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getEnumTypeList().hashCode();
        }
        if (getExtensionRangeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + getExtensionRangeList().hashCode();
        }
        if (getOneofDeclCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 8, 53) + getOneofDeclList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 7, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 9, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 10, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 11, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11427;
        c3619.m7827(DescriptorProtos$DescriptorProto.class, C3264.class);
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
        for (int i = 0; i < getFieldCount(); i++) {
            if (!getField(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getExtensionCount(); i2++) {
            if (!getExtension(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
            if (!getNestedType(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
            if (!getEnumType(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
            if (!getExtensionRange(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
            if (!getOneofDecl(i6).isInitialized()) {
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

    @Override // com.google.protobuf.AbstractC3533
    public C3264 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3264(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3264 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3264() : new C3264().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.field_.size(); i++) {
            abstractC3462.mo7649(2, this.field_.get(i));
        }
        for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
            abstractC3462.mo7649(3, this.nestedType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC3462.mo7649(4, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
            abstractC3462.mo7649(5, this.extensionRange_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC3462.mo7649(6, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(7, getOptions());
        }
        for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
            abstractC3462.mo7649(8, this.oneofDecl_.get(i6));
        }
        for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
            abstractC3462.mo7649(9, this.reservedRange_.get(i7));
        }
        for (int i8 = 0; i8 < this.reservedName_.f11038.size(); i8++) {
            GeneratedMessage.writeString(abstractC3462, 10, this.reservedName_.f11038.get(i8));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(11, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ReservedRange extends GeneratedMessage implements InterfaceC3457 {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC3375 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "ReservedRange");
            DEFAULT_INSTANCE = new ReservedRange();
            PARSER = new C3456();
        }

        private ReservedRange(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$4476(ReservedRange reservedRange, int i) {
            int i2 = i | reservedRange.bitField0_;
            reservedRange.bitField0_ = i2;
            return i2;
        }

        public static ReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11449;
        }

        public static C3263 newBuilder(ReservedRange reservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReservedRange)) {
                return super.equals(obj);
            }
            ReservedRange reservedRange = (ReservedRange) obj;
            if (hasStart() != reservedRange.hasStart()) {
                return false;
            }
            if ((!hasStart() || getStart() == reservedRange.getStart()) && hasEnd() == reservedRange.hasEnd()) {
                return (!hasEnd() || getEnd() == reservedRange.getEnd()) && getUnknownFields().equals(reservedRange.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11449;
        }

        @Override // com.google.protobuf.InterfaceC3457
        public int getEnd() {
            return this.end_;
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
            int iM7631 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7631(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7631 += AbstractC3462.m7631(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7631;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3457
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3457
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3457
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11450;
            c3619.m7827(ReservedRange.class, C3263.class);
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
        public C3263 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3263(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3263 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3263() : new C3263().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7651(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3263 extends GeneratedMessage.AbstractC3305 implements InterfaceC3457 {
            private int bitField0_;
            private int end_;
            private int start_;

            private void buildPartial0(ReservedRange reservedRange) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    reservedRange.start_ = this.start_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    reservedRange.end_ = this.end_;
                    i |= 2;
                }
                ReservedRange.access$4476(reservedRange, i);
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11449;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public ReservedRange build() {
                ReservedRange reservedRangeBuildPartial = buildPartial();
                if (reservedRangeBuildPartial.isInitialized()) {
                    return reservedRangeBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) reservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public ReservedRange buildPartial() {
                ReservedRange reservedRange = new ReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(reservedRange);
                }
                onBuilt();
                return reservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3263 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C3263 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3263 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11449;
            }

            @Override // com.google.protobuf.InterfaceC3457
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3457
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3457
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3457
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11450;
                c3619.m7827(ReservedRange.class, C3263.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3263 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    this.start_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 16) {
                                    this.end_ = abstractC3474.mo7717();
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

            public C3263 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3263 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C3263() {
            }

            private C3263(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public ReservedRange getDefaultInstanceForType() {
                return ReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3263 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof ReservedRange) {
                    return mergeFrom((ReservedRange) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3263 mergeFrom(ReservedRange reservedRange) {
                if (reservedRange == ReservedRange.getDefaultInstance()) {
                    return this;
                }
                if (reservedRange.hasStart()) {
                    setStart(reservedRange.getStart());
                }
                if (reservedRange.hasEnd()) {
                    setEnd(reservedRange.getEnd());
                }
                mergeUnknownFields(reservedRange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public ReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3263 newBuilderForType() {
            return newBuilder();
        }

        public static C3263 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static ReservedRange parseFrom(ByteString byteString) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static ReservedRange parseFrom(ByteString byteString, C3697 c3697) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static ReservedRange parseFrom(byte[] bArr) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static ReservedRange parseFrom(byte[] bArr, C3697 c3697) {
            return (ReservedRange) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static ReservedRange parseFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, C3697 c3697) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static ReservedRange parseFrom(AbstractC3474 abstractC3474) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static ReservedRange parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ExtensionRange extends GeneratedMessage implements InterfaceC3460 {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static final InterfaceC3375 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRange");
            DEFAULT_INSTANCE = new ExtensionRange();
            PARSER = new C3461();
        }

        private ExtensionRange(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$3676(ExtensionRange extensionRange, int i) {
            int i2 = i | extensionRange.bitField0_;
            extensionRange.bitField0_ = i2;
            return i2;
        }

        public static ExtensionRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11446;
        }

        public static C3262 newBuilder(ExtensionRange extensionRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExtensionRange)) {
                return super.equals(obj);
            }
            ExtensionRange extensionRange = (ExtensionRange) obj;
            if (hasStart() != extensionRange.hasStart()) {
                return false;
            }
            if ((hasStart() && getStart() != extensionRange.getStart()) || hasEnd() != extensionRange.hasEnd()) {
                return false;
            }
            if ((!hasEnd() || getEnd() == extensionRange.getEnd()) && hasOptions() == extensionRange.hasOptions()) {
                return (!hasOptions() || getOptions().equals(extensionRange.getOptions())) && getUnknownFields().equals(extensionRange.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11446;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public InterfaceC3565 getOptionsOrBuilder() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
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
            int iM7631 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7631(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7631 += AbstractC3462.m7631(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7631 += AbstractC3462.m7639(3, getOptions());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7631;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3460
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getEnd();
            }
            if (hasOptions()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getOptions().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11445;
            c3619.m7827(ExtensionRange.class, C3262.class);
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
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.AbstractC3533
        public C3262 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3262(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3262 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3262() : new C3262().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7651(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3462.mo7649(3, getOptions());
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3262 extends GeneratedMessage.AbstractC3305 implements InterfaceC3460 {
            private int bitField0_;
            private int end_;
            private C3342 optionsBuilder_;
            private DescriptorProtos$ExtensionRangeOptions options_;
            private int start_;

            private C3262() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ExtensionRange extensionRange) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    extensionRange.start_ = this.start_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    extensionRange.end_ = this.end_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    C3342 c3342 = this.optionsBuilder_;
                    extensionRange.options_ = c3342 == null ? this.options_ : (DescriptorProtos$ExtensionRangeOptions) c3342.m7384();
                    i |= 4;
                }
                ExtensionRange.access$3676(extensionRange, i);
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11446;
            }

            private C3342 internalGetOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new C3342(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public ExtensionRange build() {
                ExtensionRange extensionRangeBuildPartial = buildPartial();
                if (extensionRangeBuildPartial.isInitialized()) {
                    return extensionRangeBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) extensionRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public ExtensionRange buildPartial() {
                ExtensionRange extensionRange = new ExtensionRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(extensionRange);
                }
                onBuilt();
                return extensionRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3262 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                this.options_ = null;
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.optionsBuilder_ = null;
                }
                return this;
            }

            public C3262 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3262 clearOptions() {
                this.bitField0_ &= -5;
                this.options_ = null;
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.optionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3262 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11446;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public DescriptorProtos$ExtensionRangeOptions getOptions() {
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 != null) {
                    return (DescriptorProtos$ExtensionRangeOptions) c3342.m7380();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            public DescriptorProtos$ExtensionRangeOptions.C3271 getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$ExtensionRangeOptions.C3271) internalGetOptionsFieldBuilder().m7381();
            }

            @Override // com.google.protobuf.InterfaceC3460
            public InterfaceC3565 getOptionsOrBuilder() {
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 != null) {
                    return (InterfaceC3565) c3342.m7379();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3460
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11445;
                c3619.m7827(ExtensionRange.class, C3262.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3262 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    this.start_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 16) {
                                    this.end_ = abstractC3474.mo7717();
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 26) {
                                    abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                    this.bitField0_ |= 4;
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

            public C3262 mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2;
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 != null) {
                    c3342.m7386(descriptorProtos$ExtensionRangeOptions);
                } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$ExtensionRangeOptions2 = this.options_) == null || descriptorProtos$ExtensionRangeOptions2 == DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                    this.options_ = descriptorProtos$ExtensionRangeOptions;
                } else {
                    getOptionsBuilder().mergeFrom(descriptorProtos$ExtensionRangeOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public C3262 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3262 setOptions(DescriptorProtos$ExtensionRangeOptions.C3271 c3271) {
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 == null) {
                    this.options_ = c3271.build();
                } else {
                    c3342.m7387(c3271.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3262 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public ExtensionRange getDefaultInstanceForType() {
                return ExtensionRange.getDefaultInstance();
            }

            private C3262(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                maybeForceBuilderInitialization();
            }

            public C3262 setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                C3342 c3342 = this.optionsBuilder_;
                if (c3342 == null) {
                    descriptorProtos$ExtensionRangeOptions.getClass();
                    this.options_ = descriptorProtos$ExtensionRangeOptions;
                } else {
                    c3342.m7387(descriptorProtos$ExtensionRangeOptions);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3262 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof ExtensionRange) {
                    return mergeFrom((ExtensionRange) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3262 mergeFrom(ExtensionRange extensionRange) {
                if (extensionRange == ExtensionRange.getDefaultInstance()) {
                    return this;
                }
                if (extensionRange.hasStart()) {
                    setStart(extensionRange.getStart());
                }
                if (extensionRange.hasEnd()) {
                    setEnd(extensionRange.getEnd());
                }
                if (extensionRange.hasOptions()) {
                    mergeOptions(extensionRange.getOptions());
                }
                mergeUnknownFields(extensionRange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public ExtensionRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3262 newBuilderForType() {
            return newBuilder();
        }

        public static C3262 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ExtensionRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static ExtensionRange parseFrom(ByteString byteString) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static ExtensionRange parseFrom(ByteString byteString, C3697 c3697) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static ExtensionRange parseFrom(byte[] bArr) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static ExtensionRange parseFrom(byte[] bArr, C3697 c3697) {
            return (ExtensionRange) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, C3697 c3697) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static ExtensionRange parseFrom(AbstractC3474 abstractC3474) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static ExtensionRange parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3264 extends GeneratedMessage.AbstractC3305 implements InterfaceC3572 {
        private int bitField0_;
        private C3363 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C3363 extensionBuilder_;
        private C3363 extensionRangeBuilder_;
        private List<ExtensionRange> extensionRange_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C3363 fieldBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> field_;
        private Object name_;
        private C3363 nestedTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> nestedType_;
        private C3363 oneofDeclBuilder_;
        private List<DescriptorProtos$OneofDescriptorProto> oneofDecl_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$MessageOptions options_;
        private C3384 reservedName_;
        private C3363 reservedRangeBuilder_;
        private List<ReservedRange> reservedRange_;
        private int visibility_;

        private C3264() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$DescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 128) != 0) {
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$DescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$MessageOptions) c3342.m7384();
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.reservedName_.m7787();
                descriptorProtos$DescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 1024) != 0) {
                descriptorProtos$DescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$DescriptorProto.access$5976(descriptorProtos$DescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.field_ = Collections.unmodifiableList(this.field_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$DescriptorProto.field_ = this.field_;
            } else {
                descriptorProtos$DescriptorProto.field_ = c3363.m7472();
            }
            C3363 c33632 = this.extensionBuilder_;
            if (c33632 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.extension_ = Collections.unmodifiableList(this.extension_);
                    this.bitField0_ &= -5;
                }
                descriptorProtos$DescriptorProto.extension_ = this.extension_;
            } else {
                descriptorProtos$DescriptorProto.extension_ = c33632.m7472();
            }
            C3363 c33633 = this.nestedTypeBuilder_;
            if (c33633 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                    this.bitField0_ &= -9;
                }
                descriptorProtos$DescriptorProto.nestedType_ = this.nestedType_;
            } else {
                descriptorProtos$DescriptorProto.nestedType_ = c33633.m7472();
            }
            C3363 c33634 = this.enumTypeBuilder_;
            if (c33634 == null) {
                if ((this.bitField0_ & 16) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -17;
                }
                descriptorProtos$DescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$DescriptorProto.enumType_ = c33634.m7472();
            }
            C3363 c33635 = this.extensionRangeBuilder_;
            if (c33635 == null) {
                if ((this.bitField0_ & 32) != 0) {
                    this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                    this.bitField0_ &= -33;
                }
                descriptorProtos$DescriptorProto.extensionRange_ = this.extensionRange_;
            } else {
                descriptorProtos$DescriptorProto.extensionRange_ = c33635.m7472();
            }
            C3363 c33636 = this.oneofDeclBuilder_;
            if (c33636 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$DescriptorProto.oneofDecl_ = this.oneofDecl_;
            } else {
                descriptorProtos$DescriptorProto.oneofDecl_ = c33636.m7472();
            }
            C3363 c33637 = this.reservedRangeBuilder_;
            if (c33637 != null) {
                descriptorProtos$DescriptorProto.reservedRange_ = c33637.m7472();
                return;
            }
            if ((this.bitField0_ & 256) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                this.bitField0_ &= -257;
            }
            descriptorProtos$DescriptorProto.reservedRange_ = this.reservedRange_;
        }

        private void ensureEnumTypeIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.enumType_ = new ArrayList(this.enumType_);
                this.bitField0_ |= 16;
            }
        }

        private void ensureExtensionIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.extension_ = new ArrayList(this.extension_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureExtensionRangeIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.extensionRange_ = new ArrayList(this.extensionRange_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureFieldIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.field_ = new ArrayList(this.field_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureNestedTypeIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.nestedType_ = new ArrayList(this.nestedType_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureOneofDeclIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.oneofDecl_ = new ArrayList(this.oneofDecl_);
                this.bitField0_ |= 64;
            }
        }

        private void ensureReservedNameIsMutable() {
            if (!this.reservedName_.f11199) {
                this.reservedName_ = new C3384(this.reservedName_);
            }
            this.bitField0_ |= 512;
        }

        private void ensureReservedRangeIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.reservedRange_ = new ArrayList(this.reservedRange_);
                this.bitField0_ |= 256;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11428;
        }

        private C3363 internalGetEnumTypeFieldBuilder() {
            if (this.enumTypeBuilder_ == null) {
                this.enumTypeBuilder_ = new C3363(this.enumType_, getParentForChildren(), isClean());
                this.enumType_ = null;
            }
            return this.enumTypeBuilder_;
        }

        private C3363 internalGetExtensionFieldBuilder() {
            if (this.extensionBuilder_ == null) {
                this.extensionBuilder_ = new C3363(this.extension_, getParentForChildren(), isClean());
                this.extension_ = null;
            }
            return this.extensionBuilder_;
        }

        private C3363 internalGetExtensionRangeFieldBuilder() {
            if (this.extensionRangeBuilder_ == null) {
                this.extensionRangeBuilder_ = new C3363(this.extensionRange_, getParentForChildren(), isClean());
                this.extensionRange_ = null;
            }
            return this.extensionRangeBuilder_;
        }

        private C3363 internalGetFieldFieldBuilder() {
            if (this.fieldBuilder_ == null) {
                this.fieldBuilder_ = new C3363(this.field_, getParentForChildren(), isClean());
                this.field_ = null;
            }
            return this.fieldBuilder_;
        }

        private C3363 internalGetNestedTypeFieldBuilder() {
            if (this.nestedTypeBuilder_ == null) {
                this.nestedTypeBuilder_ = new C3363(this.nestedType_, getParentForChildren(), isClean());
                this.nestedType_ = null;
            }
            return this.nestedTypeBuilder_;
        }

        private C3363 internalGetOneofDeclFieldBuilder() {
            if (this.oneofDeclBuilder_ == null) {
                this.oneofDeclBuilder_ = new C3363(this.oneofDecl_, getParentForChildren(), isClean());
                this.oneofDecl_ = null;
            }
            return this.oneofDeclBuilder_;
        }

        private C3342 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3342(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3363 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C3363(this.reservedRange_, getParentForChildren(), isClean());
                this.reservedRange_ = null;
            }
            return this.reservedRangeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetFieldFieldBuilder();
                internalGetExtensionFieldBuilder();
                internalGetNestedTypeFieldBuilder();
                internalGetEnumTypeFieldBuilder();
                internalGetExtensionRangeFieldBuilder();
                internalGetOneofDeclFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetReservedRangeFieldBuilder();
            }
        }

        public C3264 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureEnumTypeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.enumType_);
            onChanged();
            return this;
        }

        public C3264 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureExtensionIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.extension_);
            onChanged();
            return this;
        }

        public C3264 addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureExtensionRangeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.extensionRange_);
            onChanged();
            return this;
        }

        public C3264 addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureFieldIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.field_);
            onChanged();
            return this;
        }

        public C3264 addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureNestedTypeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.nestedType_);
            onChanged();
            return this;
        }

        public C3264 addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureOneofDeclIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.oneofDecl_);
            onChanged();
            return this;
        }

        public C3264 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3264 addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C3264 addEnumType(DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3266.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.add(c3266.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumDescriptorProto.C3266 addEnumTypeBuilder() {
            return (DescriptorProtos$EnumDescriptorProto.C3266) internalGetEnumTypeFieldBuilder().m7460(DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public C3264 addExtension(DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3276.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.add(c3276.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 addExtensionBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetExtensionFieldBuilder().m7460(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3264 addExtensionRange(ExtensionRange.C3262 c3262) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3262.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(c3262.build());
            onChanged();
            return this;
        }

        public ExtensionRange.C3262 addExtensionRangeBuilder() {
            return (ExtensionRange.C3262) internalGetExtensionRangeFieldBuilder().m7460(ExtensionRange.getDefaultInstance());
        }

        public C3264 addField(DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3276.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.add(c3276.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 addFieldBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetFieldFieldBuilder().m7460(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3264 addNestedType(C3264 c3264) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3264.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.add(c3264.build());
            onChanged();
            return this;
        }

        public C3264 addNestedTypeBuilder() {
            return (C3264) internalGetNestedTypeFieldBuilder().m7460(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C3264 addOneofDecl(DescriptorProtos$OneofDescriptorProto.C3288 c3288) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3288.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(c3288.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$OneofDescriptorProto.C3288 addOneofDeclBuilder() {
            return (DescriptorProtos$OneofDescriptorProto.C3288) internalGetOneofDeclFieldBuilder().m7460(DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public C3264 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m7493(str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3264 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo7495(byteString);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3264 addReservedRange(ReservedRange.C3263 c3263) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3263.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c3263.build());
            onChanged();
            return this;
        }

        public ReservedRange.C3263 addReservedRangeBuilder() {
            return (ReservedRange.C3263) internalGetReservedRangeFieldBuilder().m7460(ReservedRange.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$DescriptorProto build() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$DescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$DescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$DescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$DescriptorProto buildPartial() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$DescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$DescriptorProto);
            }
            onBuilt();
            return descriptorProtos$DescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3264 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                this.field_ = Collections.EMPTY_LIST;
            } else {
                this.field_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -3;
            C3363 c33632 = this.extensionBuilder_;
            if (c33632 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -5;
            C3363 c33633 = this.nestedTypeBuilder_;
            if (c33633 == null) {
                this.nestedType_ = Collections.EMPTY_LIST;
            } else {
                this.nestedType_ = null;
                c33633.m7471();
            }
            this.bitField0_ &= -9;
            C3363 c33634 = this.enumTypeBuilder_;
            if (c33634 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c33634.m7471();
            }
            this.bitField0_ &= -17;
            C3363 c33635 = this.extensionRangeBuilder_;
            if (c33635 == null) {
                this.extensionRange_ = Collections.EMPTY_LIST;
            } else {
                this.extensionRange_ = null;
                c33635.m7471();
            }
            this.bitField0_ &= -33;
            C3363 c33636 = this.oneofDeclBuilder_;
            if (c33636 == null) {
                this.oneofDecl_ = Collections.EMPTY_LIST;
            } else {
                this.oneofDecl_ = null;
                c33636.m7471();
            }
            this.bitField0_ &= -65;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            C3363 c33637 = this.reservedRangeBuilder_;
            if (c33637 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c33637.m7471();
            }
            this.bitField0_ &= -257;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            return this;
        }

        public C3264 clearEnumType() {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3264 clearExtension() {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3264 clearExtensionRange() {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.extensionRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3264 clearField() {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.field_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3264 clearName() {
            this.name_ = DescriptorProtos$DescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3264 clearNestedType() {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.nestedType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3264 clearOneofDecl() {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.oneofDecl_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3264 clearOptions() {
            this.bitField0_ &= -129;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3264 clearReservedName() {
            this.reservedName_ = C3384.f11037;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3264 clearReservedRange() {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3264 clearVisibility() {
            this.bitField0_ &= -1025;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11428;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? this.enumType_.get(i) : (DescriptorProtos$EnumDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$EnumDescriptorProto.C3266 getEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3266) internalGetEnumTypeFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$EnumDescriptorProto.C3266> getEnumTypeBuilderList() {
            return internalGetEnumTypeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getEnumTypeCount() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? this.enumType_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.enumType_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3573 getEnumTypeOrBuilder(int i) {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? this.enumType_.get(i) : (InterfaceC3573) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3573> getEnumTypeOrBuilderList() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? this.extension_.get(i) : (DescriptorProtos$FieldDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 getExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetExtensionFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C3276> getExtensionBuilderList() {
            return internalGetExtensionFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getExtensionCount() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? this.extension_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.extension_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3505 getExtensionOrBuilder(int i) {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? this.extension_.get(i) : (InterfaceC3505) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3505> getExtensionOrBuilderList() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public ExtensionRange getExtensionRange(int i) {
            C3363 c3363 = this.extensionRangeBuilder_;
            return c3363 == null ? this.extensionRange_.get(i) : (ExtensionRange) c3363.m7466(i, false);
        }

        public ExtensionRange.C3262 getExtensionRangeBuilder(int i) {
            return (ExtensionRange.C3262) internalGetExtensionRangeFieldBuilder().m7473(i);
        }

        public List<ExtensionRange.C3262> getExtensionRangeBuilderList() {
            return internalGetExtensionRangeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getExtensionRangeCount() {
            C3363 c3363 = this.extensionRangeBuilder_;
            return c3363 == null ? this.extensionRange_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<ExtensionRange> getExtensionRangeList() {
            C3363 c3363 = this.extensionRangeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.extensionRange_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3460 getExtensionRangeOrBuilder(int i) {
            C3363 c3363 = this.extensionRangeBuilder_;
            return c3363 == null ? this.extensionRange_.get(i) : (InterfaceC3460) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3460> getExtensionRangeOrBuilderList() {
            C3363 c3363 = this.extensionRangeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.extensionRange_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$FieldDescriptorProto getField(int i) {
            C3363 c3363 = this.fieldBuilder_;
            return c3363 == null ? this.field_.get(i) : (DescriptorProtos$FieldDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 getFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetFieldFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C3276> getFieldBuilderList() {
            return internalGetFieldFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getFieldCount() {
            C3363 c3363 = this.fieldBuilder_;
            return c3363 == null ? this.field_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
            C3363 c3363 = this.fieldBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.field_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3505 getFieldOrBuilder(int i) {
            C3363 c3363 = this.fieldBuilder_;
            return c3363 == null ? this.field_.get(i) : (InterfaceC3505) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3505> getFieldOrBuilderList() {
            C3363 c3363 = this.fieldBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.field_);
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
        public DescriptorProtos$DescriptorProto getNestedType(int i) {
            C3363 c3363 = this.nestedTypeBuilder_;
            return c3363 == null ? this.nestedType_.get(i) : (DescriptorProtos$DescriptorProto) c3363.m7466(i, false);
        }

        public C3264 getNestedTypeBuilder(int i) {
            return (C3264) internalGetNestedTypeFieldBuilder().m7473(i);
        }

        public List<C3264> getNestedTypeBuilderList() {
            return internalGetNestedTypeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getNestedTypeCount() {
            C3363 c3363 = this.nestedTypeBuilder_;
            return c3363 == null ? this.nestedType_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
            C3363 c3363 = this.nestedTypeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.nestedType_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3572 getNestedTypeOrBuilder(int i) {
            C3363 c3363 = this.nestedTypeBuilder_;
            return c3363 == null ? this.nestedType_.get(i) : (InterfaceC3572) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3572> getNestedTypeOrBuilderList() {
            C3363 c3363 = this.nestedTypeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.nestedType_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
            C3363 c3363 = this.oneofDeclBuilder_;
            return c3363 == null ? this.oneofDecl_.get(i) : (DescriptorProtos$OneofDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$OneofDescriptorProto.C3288 getOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C3288) internalGetOneofDeclFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$OneofDescriptorProto.C3288> getOneofDeclBuilderList() {
            return internalGetOneofDeclFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getOneofDeclCount() {
            C3363 c3363 = this.oneofDeclBuilder_;
            return c3363 == null ? this.oneofDecl_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
            C3363 c3363 = this.oneofDeclBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.oneofDecl_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3489 getOneofDeclOrBuilder(int i) {
            C3363 c3363 = this.oneofDeclBuilder_;
            return c3363 == null ? this.oneofDecl_.get(i) : (InterfaceC3489) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3489> getOneofDeclOrBuilderList() {
            C3363 c3363 = this.oneofDeclBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.oneofDecl_);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public DescriptorProtos$MessageOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$MessageOptions) c3342.m7380();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        public DescriptorProtos$MessageOptions.C3285 getOptionsBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (DescriptorProtos$MessageOptions.C3285) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3502 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3502) c3342.m7379();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getReservedNameCount() {
            return this.reservedName_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3377 getReservedNameList() {
            this.reservedName_.m7787();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public ReservedRange getReservedRange(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.get(i) : (ReservedRange) c3363.m7466(i, false);
        }

        public ReservedRange.C3263 getReservedRangeBuilder(int i) {
            return (ReservedRange.C3263) internalGetReservedRangeFieldBuilder().m7473(i);
        }

        public List<ReservedRange.C3263> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public int getReservedRangeCount() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<ReservedRange> getReservedRangeList() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.reservedRange_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3572
        public InterfaceC3457 getReservedRangeOrBuilder(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 == null ? this.reservedRange_.get(i) : (InterfaceC3457) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3572
        public List<? extends InterfaceC3457> getReservedRangeOrBuilderList() {
            C3363 c3363 = this.reservedRangeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.reservedRange_);
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
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3572
        public boolean hasVisibility() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11427;
            c3619.m7827(DescriptorProtos$DescriptorProto.class, C3264.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getFieldCount(); i++) {
                if (!getField(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < getExtensionCount(); i2++) {
                if (!getExtension(i2).isInitialized()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
                if (!getNestedType(i3).isInitialized()) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
                if (!getEnumType(i4).isInitialized()) {
                    return false;
                }
            }
            for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
                if (!getExtensionRange(i5).isInitialized()) {
                    return false;
                }
            }
            for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
                if (!getOneofDecl(i6).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C3264 mergeFrom(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            if (descriptorProtos$DescriptorProto == DescriptorProtos$DescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$DescriptorProto.hasName()) {
                this.name_ = descriptorProtos$DescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.fieldBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.field_.isEmpty()) {
                    if (this.field_.isEmpty()) {
                        this.field_ = descriptorProtos$DescriptorProto.field_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFieldIsMutable();
                        this.field_.addAll(descriptorProtos$DescriptorProto.field_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.field_.isEmpty()) {
                boolean zIsEmpty = this.fieldBuilder_.f11012.isEmpty();
                C3363 c3363 = this.fieldBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.fieldBuilder_ = null;
                    this.field_ = descriptorProtos$DescriptorProto.field_;
                    this.bitField0_ &= -3;
                    this.fieldBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$DescriptorProto.field_);
                }
            }
            if (this.extensionBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.extension_.isEmpty()) {
                    if (this.extension_.isEmpty()) {
                        this.extension_ = descriptorProtos$DescriptorProto.extension_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureExtensionIsMutable();
                        this.extension_.addAll(descriptorProtos$DescriptorProto.extension_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.extension_.isEmpty()) {
                boolean zIsEmpty2 = this.extensionBuilder_.f11012.isEmpty();
                C3363 c33632 = this.extensionBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$DescriptorProto.extension_;
                    this.bitField0_ &= -5;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c33632.m7462(descriptorProtos$DescriptorProto.extension_);
                }
            }
            if (this.nestedTypeBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.nestedType_.isEmpty()) {
                    if (this.nestedType_.isEmpty()) {
                        this.nestedType_ = descriptorProtos$DescriptorProto.nestedType_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureNestedTypeIsMutable();
                        this.nestedType_.addAll(descriptorProtos$DescriptorProto.nestedType_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.nestedType_.isEmpty()) {
                boolean zIsEmpty3 = this.nestedTypeBuilder_.f11012.isEmpty();
                C3363 c33633 = this.nestedTypeBuilder_;
                if (zIsEmpty3) {
                    c33633.f11013 = null;
                    this.nestedTypeBuilder_ = null;
                    this.nestedType_ = descriptorProtos$DescriptorProto.nestedType_;
                    this.bitField0_ &= -9;
                    this.nestedTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNestedTypeFieldBuilder() : null;
                } else {
                    c33633.m7462(descriptorProtos$DescriptorProto.nestedType_);
                }
            }
            if (this.enumTypeBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.enumType_.isEmpty()) {
                    if (this.enumType_.isEmpty()) {
                        this.enumType_ = descriptorProtos$DescriptorProto.enumType_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureEnumTypeIsMutable();
                        this.enumType_.addAll(descriptorProtos$DescriptorProto.enumType_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.enumType_.isEmpty()) {
                boolean zIsEmpty4 = this.enumTypeBuilder_.f11012.isEmpty();
                C3363 c33634 = this.enumTypeBuilder_;
                if (zIsEmpty4) {
                    c33634.f11013 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$DescriptorProto.enumType_;
                    this.bitField0_ &= -17;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c33634.m7462(descriptorProtos$DescriptorProto.enumType_);
                }
            }
            if (this.extensionRangeBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.extensionRange_.isEmpty()) {
                    if (this.extensionRange_.isEmpty()) {
                        this.extensionRange_ = descriptorProtos$DescriptorProto.extensionRange_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtensionRangeIsMutable();
                        this.extensionRange_.addAll(descriptorProtos$DescriptorProto.extensionRange_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.extensionRange_.isEmpty()) {
                boolean zIsEmpty5 = this.extensionRangeBuilder_.f11012.isEmpty();
                C3363 c33635 = this.extensionRangeBuilder_;
                if (zIsEmpty5) {
                    c33635.f11013 = null;
                    this.extensionRangeBuilder_ = null;
                    this.extensionRange_ = descriptorProtos$DescriptorProto.extensionRange_;
                    this.bitField0_ &= -33;
                    this.extensionRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionRangeFieldBuilder() : null;
                } else {
                    c33635.m7462(descriptorProtos$DescriptorProto.extensionRange_);
                }
            }
            if (this.oneofDeclBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.oneofDecl_.isEmpty()) {
                    if (this.oneofDecl_.isEmpty()) {
                        this.oneofDecl_ = descriptorProtos$DescriptorProto.oneofDecl_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureOneofDeclIsMutable();
                        this.oneofDecl_.addAll(descriptorProtos$DescriptorProto.oneofDecl_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.oneofDecl_.isEmpty()) {
                boolean zIsEmpty6 = this.oneofDeclBuilder_.f11012.isEmpty();
                C3363 c33636 = this.oneofDeclBuilder_;
                if (zIsEmpty6) {
                    c33636.f11013 = null;
                    this.oneofDeclBuilder_ = null;
                    this.oneofDecl_ = descriptorProtos$DescriptorProto.oneofDecl_;
                    this.bitField0_ &= -65;
                    this.oneofDeclBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOneofDeclFieldBuilder() : null;
                } else {
                    c33636.m7462(descriptorProtos$DescriptorProto.oneofDecl_);
                }
            }
            if (descriptorProtos$DescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$DescriptorProto.getOptions());
            }
            if (this.reservedRangeBuilder_ == null) {
                if (!descriptorProtos$DescriptorProto.reservedRange_.isEmpty()) {
                    if (this.reservedRange_.isEmpty()) {
                        this.reservedRange_ = descriptorProtos$DescriptorProto.reservedRange_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureReservedRangeIsMutable();
                        this.reservedRange_.addAll(descriptorProtos$DescriptorProto.reservedRange_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$DescriptorProto.reservedRange_.isEmpty()) {
                boolean zIsEmpty7 = this.reservedRangeBuilder_.f11012.isEmpty();
                C3363 c33637 = this.reservedRangeBuilder_;
                if (zIsEmpty7) {
                    c33637.f11013 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$DescriptorProto.reservedRange_;
                    this.bitField0_ &= -257;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c33637.m7462(descriptorProtos$DescriptorProto.reservedRange_);
                }
            }
            if (!descriptorProtos$DescriptorProto.reservedName_.isEmpty()) {
                if (this.reservedName_.isEmpty()) {
                    this.reservedName_ = descriptorProtos$DescriptorProto.reservedName_;
                    this.bitField0_ |= 512;
                } else {
                    ensureReservedNameIsMutable();
                    this.reservedName_.addAll(descriptorProtos$DescriptorProto.reservedName_);
                }
                onChanged();
            }
            if (descriptorProtos$DescriptorProto.hasVisibility()) {
                setVisibility(descriptorProtos$DescriptorProto.getVisibility());
            }
            mergeUnknownFields(descriptorProtos$DescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C3264 mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$MessageOptions);
            } else if ((this.bitField0_ & 128) == 0 || (descriptorProtos$MessageOptions2 = this.options_) == null || descriptorProtos$MessageOptions2 == DescriptorProtos$MessageOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$MessageOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$MessageOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public C3264 removeEnumType(int i) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeExtension(int i) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeExtensionRange(int i) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeField(int i) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureFieldIsMutable();
            this.field_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeNestedType(int i) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeOneofDecl(int i) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
            onChanged();
            return this;
        }

        public C3264 removeReservedRange(int i) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C3264 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3266.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, c3266.build());
            onChanged();
            return this;
        }

        public C3264 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3276.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.set(i, c3276.build());
            onChanged();
            return this;
        }

        public C3264 setExtensionRange(int i, ExtensionRange.C3262 c3262) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3262.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, c3262.build());
            onChanged();
            return this;
        }

        public C3264 setField(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3276.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.set(i, c3276.build());
            onChanged();
            return this;
        }

        public C3264 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3264 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3264 setNestedType(int i, C3264 c3264) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3264.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, c3264.build());
            onChanged();
            return this;
        }

        public C3264 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C3288 c3288) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3288.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, c3288.build());
            onChanged();
            return this;
        }

        public C3264 setOptions(DescriptorProtos$MessageOptions.C3285 c3285) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3285.build();
            } else {
                c3342.m7387(c3285.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3264 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3264 setReservedRange(int i, ReservedRange.C3263 c3263) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3263.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c3263.build());
            onChanged();
            return this;
        }

        public C3264 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 1024;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$DescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C3266 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3266) internalGetEnumTypeFieldBuilder().m7461(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetExtensionFieldBuilder().m7461(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public ExtensionRange.C3262 addExtensionRangeBuilder(int i) {
            return (ExtensionRange.C3262) internalGetExtensionRangeFieldBuilder().m7461(i, ExtensionRange.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 addFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetFieldFieldBuilder().m7461(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3264 addNestedTypeBuilder(int i) {
            return (C3264) internalGetNestedTypeFieldBuilder().m7461(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$OneofDescriptorProto.C3288 addOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C3288) internalGetOneofDeclFieldBuilder().m7461(i, DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public ReservedRange.C3263 addReservedRangeBuilder(int i) {
            return (ReservedRange.C3263) internalGetReservedRangeFieldBuilder().m7461(i, ReservedRange.getDefaultInstance());
        }

        public C3264 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3264 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 addExtensionRange(int i, ExtensionRange extensionRange) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, extensionRange);
                onChanged();
                return this;
            }
            c3363.m7459(i, extensionRange);
            return this;
        }

        public C3264 addField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 addNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3264 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3264 addReservedRange(int i, ReservedRange reservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, reservedRange);
                onChanged();
                return this;
            }
            c3363.m7459(i, reservedRange);
            return this;
        }

        public C3264 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.set(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3264 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 setExtensionRange(int i, ExtensionRange extensionRange) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.set(i, extensionRange);
                onChanged();
                return this;
            }
            c3363.m7463(i, extensionRange);
            return this;
        }

        public C3264 setField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 setNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3264 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.set(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3264 setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$MessageOptions.getClass();
                this.options_ = descriptorProtos$MessageOptions;
            } else {
                c3342.m7387(descriptorProtos$MessageOptions);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3264 setReservedRange(int i, ReservedRange reservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, reservedRange);
                onChanged();
                return this;
            }
            c3363.m7463(i, reservedRange);
            return this;
        }

        public C3264 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3264 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 addExtensionRange(ExtensionRange extensionRange) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(extensionRange);
                onChanged();
                return this;
            }
            c3363.m7458(extensionRange);
            return this;
        }

        public C3264 addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3264 addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$DescriptorProto);
            return this;
        }

        public C3264 addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3264 addReservedRange(ReservedRange reservedRange) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(reservedRange);
                onChanged();
                return this;
            }
            c3363.m7458(reservedRange);
            return this;
        }

        private C3264(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3384.f11037;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C3264 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 == null) {
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, c3266.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3266.build());
            return this;
        }

        public C3264 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 == null) {
                ensureExtensionIsMutable();
                this.extension_.add(i, c3276.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3276.build());
            return this;
        }

        public C3264 addExtensionRange(int i, ExtensionRange.C3262 c3262) {
            C3363 c3363 = this.extensionRangeBuilder_;
            if (c3363 == null) {
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, c3262.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3262.build());
            return this;
        }

        public C3264 addField(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
            C3363 c3363 = this.fieldBuilder_;
            if (c3363 == null) {
                ensureFieldIsMutable();
                this.field_.add(i, c3276.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3276.build());
            return this;
        }

        public C3264 addNestedType(int i, C3264 c3264) {
            C3363 c3363 = this.nestedTypeBuilder_;
            if (c3363 == null) {
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, c3264.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3264.build());
            return this;
        }

        public C3264 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C3288 c3288) {
            C3363 c3363 = this.oneofDeclBuilder_;
            if (c3363 == null) {
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, c3288.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3288.build());
            return this;
        }

        public C3264 addReservedRange(int i, ReservedRange.C3263 c3263) {
            C3363 c3363 = this.reservedRangeBuilder_;
            if (c3363 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c3263.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3263.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3264 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$DescriptorProto) {
                return mergeFrom((DescriptorProtos$DescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3264 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        switch (iMo7705) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.name_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                                break;
                            case 18:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FieldDescriptorProto.parser(), c3697);
                                C3363 c3363 = this.fieldBuilder_;
                                if (c3363 == null) {
                                    ensureFieldIsMutable();
                                    this.field_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 26:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC3474.mo7715(DescriptorProtos$DescriptorProto.parser(), c3697);
                                C3363 c33632 = this.nestedTypeBuilder_;
                                if (c33632 == null) {
                                    ensureNestedTypeIsMutable();
                                    this.nestedType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c33632.m7458(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 34:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC3474.mo7715(DescriptorProtos$EnumDescriptorProto.parser(), c3697);
                                C3363 c33633 = this.enumTypeBuilder_;
                                if (c33633 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c33633.m7458(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 42:
                                ExtensionRange extensionRange = (ExtensionRange) abstractC3474.mo7715(ExtensionRange.parser(), c3697);
                                C3363 c33634 = this.extensionRangeBuilder_;
                                if (c33634 == null) {
                                    ensureExtensionRangeIsMutable();
                                    this.extensionRange_.add(extensionRange);
                                } else {
                                    c33634.m7458(extensionRange);
                                }
                                break;
                            case 50:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto2 = (DescriptorProtos$FieldDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FieldDescriptorProto.parser(), c3697);
                                C3363 c33635 = this.extensionBuilder_;
                                if (c33635 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto2);
                                } else {
                                    c33635.m7458(descriptorProtos$FieldDescriptorProto2);
                                }
                                break;
                            case 58:
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 128;
                                break;
                            case 66:
                                DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = (DescriptorProtos$OneofDescriptorProto) abstractC3474.mo7715(DescriptorProtos$OneofDescriptorProto.parser(), c3697);
                                C3363 c33636 = this.oneofDeclBuilder_;
                                if (c33636 == null) {
                                    ensureOneofDeclIsMutable();
                                    this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                                } else {
                                    c33636.m7458(descriptorProtos$OneofDescriptorProto);
                                }
                                break;
                            case 74:
                                ReservedRange reservedRange = (ReservedRange) abstractC3474.mo7715(ReservedRange.parser(), c3697);
                                C3363 c33637 = this.reservedRangeBuilder_;
                                if (c33637 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(reservedRange);
                                } else {
                                    c33637.m7458(reservedRange);
                                }
                                break;
                            case 82:
                                ByteString byteStringMo7719 = abstractC3474.mo7719();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo7495(byteStringMo7719);
                                break;
                            case 88:
                                int iMo7724 = abstractC3474.mo7724();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(11, iMo7724);
                                } else {
                                    this.visibility_ = iMo7724;
                                    this.bitField0_ |= 1024;
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                    z = true;
                                }
                                break;
                        }
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
    public InterfaceC3377 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3264 newBuilderForType() {
        return newBuilder();
    }

    public static C3264 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private DescriptorProtos$DescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.reservedName_ = C3384.f11037;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

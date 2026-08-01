package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
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
public final class DescriptorProtos$DescriptorProto extends GeneratedMessage implements InterfaceC4404 {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static final InterfaceC4207 PARSER;
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
    private C4216 reservedName_;
    private List<ReservedRange> reservedRange_;
    private int visibility_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "DescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$DescriptorProto();
        PARSER = new C4290();
    }

    private DescriptorProtos$DescriptorProto() {
        this.name_ = "";
        C4216 c4216 = C4216.f11382;
        this.reservedName_ = c4216;
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
        this.reservedName_ = c4216;
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11773;
    }

    public static C4096 newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11773;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4405 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4405> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4337 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4337> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public ExtensionRange getExtensionRange(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4292 getExtensionRangeOrBuilder(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4292> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$FieldDescriptorProto getField(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4337 getFieldOrBuilder(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4337> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC4404
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

    @Override // com.google.protobuf.InterfaceC4404
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$DescriptorProto getNestedType(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4404 getNestedTypeOrBuilder(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4404> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4321 getOneofDeclOrBuilder(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4321> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4334 getOptionsOrBuilder() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getReservedNameCount() {
        return this.reservedName_.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public ReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4289 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4404
    public List<? extends InterfaceC4289> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.field_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.field_.get(i2));
        }
        int iM8202 = iComputeStringSize + size;
        int size2 = this.nestedType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM8202 += AbstractC4294.m8202(this.nestedType_.get(i3));
        }
        int iM82022 = iM8202 + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM82022 += AbstractC4294.m8202(this.enumType_.get(i4));
        }
        int iM82023 = iM82022 + size3;
        int size4 = this.extensionRange_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM82023 += AbstractC4294.m8202(this.extensionRange_.get(i5));
        }
        int iM82024 = iM82023 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM82024 += AbstractC4294.m8202(this.extension_.get(i6));
        }
        int iM82025 = iM82024 + size5;
        if ((this.bitField0_ & 2) != 0) {
            iM82025 += AbstractC4294.m8198(7, getOptions());
        }
        int size6 = this.oneofDecl_.size();
        for (int i7 = 0; i7 < size6; i7++) {
            iM82025 += AbstractC4294.m8202(this.oneofDecl_.get(i7));
        }
        int iM82026 = iM82025 + size6;
        int size7 = this.reservedRange_.size();
        for (int i8 = 0; i8 < size7; i8++) {
            iM82026 += AbstractC4294.m8202(this.reservedRange_.get(i8));
        }
        int i9 = iM82026 + size7;
        int iComputeStringSizeNoTag = 0;
        for (int i10 = 0; i10 < this.reservedName_.f11383.size(); i10++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11383.get(i10));
        }
        int size8 = getReservedNameList().size() + i9 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size8 += AbstractC4294.m8191(11, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size8;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4404
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getFieldCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getFieldList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + getExtensionList().hashCode();
        }
        if (getNestedTypeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getNestedTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getEnumTypeList().hashCode();
        }
        if (getExtensionRangeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + getExtensionRangeList().hashCode();
        }
        if (getOneofDeclCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 8, 53) + getOneofDeclList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 9, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 10, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 11, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11772;
        c4451.m8386(DescriptorProtos$DescriptorProto.class, C4096.class);
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

    @Override // com.google.protobuf.AbstractC4365
    public C4096 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4096(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4096 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4096() : new C4096().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.field_.size(); i++) {
            abstractC4294.mo8208(2, this.field_.get(i));
        }
        for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
            abstractC4294.mo8208(3, this.nestedType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC4294.mo8208(4, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
            abstractC4294.mo8208(5, this.extensionRange_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC4294.mo8208(6, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8208(7, getOptions());
        }
        for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
            abstractC4294.mo8208(8, this.oneofDecl_.get(i6));
        }
        for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
            abstractC4294.mo8208(9, this.reservedRange_.get(i7));
        }
        for (int i8 = 0; i8 < this.reservedName_.f11383.size(); i8++) {
            GeneratedMessage.writeString(abstractC4294, 10, this.reservedName_.f11383.get(i8));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(11, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ReservedRange extends GeneratedMessage implements InterfaceC4289 {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC4207 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "ReservedRange");
            DEFAULT_INSTANCE = new ReservedRange();
            PARSER = new C4288();
        }

        private ReservedRange(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11794;
        }

        public static C4095 newBuilder(ReservedRange reservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11794;
        }

        @Override // com.google.protobuf.InterfaceC4289
        public int getEnd() {
            return this.end_;
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
            int iM8190 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8190(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8190 += AbstractC4294.m8190(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8190;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4289
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC4289
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4289
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11795;
            c4451.m8386(ReservedRange.class, C4095.class);
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
        public C4095 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4095(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4095 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4095() : new C4095().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8210(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4095 extends GeneratedMessage.AbstractC4137 implements InterfaceC4289 {
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

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11794;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public ReservedRange build() {
                ReservedRange reservedRangeBuildPartial = buildPartial();
                if (reservedRangeBuildPartial.isInitialized()) {
                    return reservedRangeBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) reservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public ReservedRange buildPartial() {
                ReservedRange reservedRange = new ReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(reservedRange);
                }
                onBuilt();
                return reservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4095 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C4095 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C4095 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11794;
            }

            @Override // com.google.protobuf.InterfaceC4289
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC4289
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC4289
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4289
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11795;
                c4451.m8386(ReservedRange.class, C4095.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4095 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    this.start_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 1;
                                } else if (iMo8264 == 16) {
                                    this.end_ = abstractC4306.mo8276();
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

            public C4095 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4095 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C4095() {
            }

            private C4095(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public ReservedRange getDefaultInstanceForType() {
                return ReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4095 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof ReservedRange) {
                    return mergeFrom((ReservedRange) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4095 mergeFrom(ReservedRange reservedRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public ReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4095 newBuilderForType() {
            return newBuilder();
        }

        public static C4095 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static ReservedRange parseFrom(ByteString byteString) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static ReservedRange parseFrom(ByteString byteString, C4529 c4529) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static ReservedRange parseFrom(byte[] bArr) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static ReservedRange parseFrom(byte[] bArr, C4529 c4529) {
            return (ReservedRange) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static ReservedRange parseFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, C4529 c4529) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static ReservedRange parseFrom(AbstractC4306 abstractC4306) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static ReservedRange parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ExtensionRange extends GeneratedMessage implements InterfaceC4292 {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static final InterfaceC4207 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRange");
            DEFAULT_INSTANCE = new ExtensionRange();
            PARSER = new C4293();
        }

        private ExtensionRange(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11791;
        }

        public static C4094 newBuilder(ExtensionRange extensionRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11791;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public InterfaceC4397 getOptionsOrBuilder() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
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
            int iM8190 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8190(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8190 += AbstractC4294.m8190(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM8190 += AbstractC4294.m8198(3, getOptions());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8190;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4292
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getEnd();
            }
            if (hasOptions()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getOptions().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11790;
            c4451.m8386(ExtensionRange.class, C4094.class);
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
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.AbstractC4365
        public C4094 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4094(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4094 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4094() : new C4094().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8210(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC4294.mo8208(3, getOptions());
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4094 extends GeneratedMessage.AbstractC4137 implements InterfaceC4292 {
            private int bitField0_;
            private int end_;
            private C4174 optionsBuilder_;
            private DescriptorProtos$ExtensionRangeOptions options_;
            private int start_;

            private C4094() {
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
                    C4174 c4174 = this.optionsBuilder_;
                    extensionRange.options_ = c4174 == null ? this.options_ : (DescriptorProtos$ExtensionRangeOptions) c4174.m7943();
                    i |= 4;
                }
                ExtensionRange.access$3676(extensionRange, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11791;
            }

            private C4174 internalGetOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public ExtensionRange build() {
                ExtensionRange extensionRangeBuildPartial = buildPartial();
                if (extensionRangeBuildPartial.isInitialized()) {
                    return extensionRangeBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) extensionRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public ExtensionRange buildPartial() {
                ExtensionRange extensionRange = new ExtensionRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(extensionRange);
                }
                onBuilt();
                return extensionRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4094 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                this.options_ = null;
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.optionsBuilder_ = null;
                }
                return this;
            }

            public C4094 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C4094 clearOptions() {
                this.bitField0_ &= -5;
                this.options_ = null;
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.optionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C4094 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11791;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public DescriptorProtos$ExtensionRangeOptions getOptions() {
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 != null) {
                    return (DescriptorProtos$ExtensionRangeOptions) c4174.m7939();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            public DescriptorProtos$ExtensionRangeOptions.C4103 getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$ExtensionRangeOptions.C4103) internalGetOptionsFieldBuilder().m7940();
            }

            @Override // com.google.protobuf.InterfaceC4292
            public InterfaceC4397 getOptionsOrBuilder() {
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 != null) {
                    return (InterfaceC4397) c4174.m7938();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4292
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11790;
                c4451.m8386(ExtensionRange.class, C4094.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4094 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    this.start_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 1;
                                } else if (iMo8264 == 16) {
                                    this.end_ = abstractC4306.mo8276();
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 26) {
                                    abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                    this.bitField0_ |= 4;
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

            public C4094 mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2;
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 != null) {
                    c4174.m7945(descriptorProtos$ExtensionRangeOptions);
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

            public C4094 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4094 setOptions(DescriptorProtos$ExtensionRangeOptions.C4103 c4103) {
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 == null) {
                    this.options_ = c4103.build();
                } else {
                    c4174.m7946(c4103.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4094 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public ExtensionRange getDefaultInstanceForType() {
                return ExtensionRange.getDefaultInstance();
            }

            private C4094(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                maybeForceBuilderInitialization();
            }

            public C4094 setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                C4174 c4174 = this.optionsBuilder_;
                if (c4174 == null) {
                    descriptorProtos$ExtensionRangeOptions.getClass();
                    this.options_ = descriptorProtos$ExtensionRangeOptions;
                } else {
                    c4174.m7946(descriptorProtos$ExtensionRangeOptions);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4094 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof ExtensionRange) {
                    return mergeFrom((ExtensionRange) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4094 mergeFrom(ExtensionRange extensionRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public ExtensionRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4094 newBuilderForType() {
            return newBuilder();
        }

        public static C4094 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ExtensionRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static ExtensionRange parseFrom(ByteString byteString) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static ExtensionRange parseFrom(ByteString byteString, C4529 c4529) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static ExtensionRange parseFrom(byte[] bArr) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static ExtensionRange parseFrom(byte[] bArr, C4529 c4529) {
            return (ExtensionRange) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, C4529 c4529) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static ExtensionRange parseFrom(AbstractC4306 abstractC4306) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static ExtensionRange parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4096 extends GeneratedMessage.AbstractC4137 implements InterfaceC4404 {
        private int bitField0_;
        private C4195 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C4195 extensionBuilder_;
        private C4195 extensionRangeBuilder_;
        private List<ExtensionRange> extensionRange_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C4195 fieldBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> field_;
        private Object name_;
        private C4195 nestedTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> nestedType_;
        private C4195 oneofDeclBuilder_;
        private List<DescriptorProtos$OneofDescriptorProto> oneofDecl_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$MessageOptions options_;
        private C4216 reservedName_;
        private C4195 reservedRangeBuilder_;
        private List<ReservedRange> reservedRange_;
        private int visibility_;

        private C4096() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C4216.f11382;
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
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$DescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$MessageOptions) c4174.m7943();
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.reservedName_.m8346();
                descriptorProtos$DescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 1024) != 0) {
                descriptorProtos$DescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$DescriptorProto.access$5976(descriptorProtos$DescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.field_ = Collections.unmodifiableList(this.field_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$DescriptorProto.field_ = this.field_;
            } else {
                descriptorProtos$DescriptorProto.field_ = c4195.m8031();
            }
            C4195 c41952 = this.extensionBuilder_;
            if (c41952 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.extension_ = Collections.unmodifiableList(this.extension_);
                    this.bitField0_ &= -5;
                }
                descriptorProtos$DescriptorProto.extension_ = this.extension_;
            } else {
                descriptorProtos$DescriptorProto.extension_ = c41952.m8031();
            }
            C4195 c41953 = this.nestedTypeBuilder_;
            if (c41953 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                    this.bitField0_ &= -9;
                }
                descriptorProtos$DescriptorProto.nestedType_ = this.nestedType_;
            } else {
                descriptorProtos$DescriptorProto.nestedType_ = c41953.m8031();
            }
            C4195 c41954 = this.enumTypeBuilder_;
            if (c41954 == null) {
                if ((this.bitField0_ & 16) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -17;
                }
                descriptorProtos$DescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$DescriptorProto.enumType_ = c41954.m8031();
            }
            C4195 c41955 = this.extensionRangeBuilder_;
            if (c41955 == null) {
                if ((this.bitField0_ & 32) != 0) {
                    this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                    this.bitField0_ &= -33;
                }
                descriptorProtos$DescriptorProto.extensionRange_ = this.extensionRange_;
            } else {
                descriptorProtos$DescriptorProto.extensionRange_ = c41955.m8031();
            }
            C4195 c41956 = this.oneofDeclBuilder_;
            if (c41956 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$DescriptorProto.oneofDecl_ = this.oneofDecl_;
            } else {
                descriptorProtos$DescriptorProto.oneofDecl_ = c41956.m8031();
            }
            C4195 c41957 = this.reservedRangeBuilder_;
            if (c41957 != null) {
                descriptorProtos$DescriptorProto.reservedRange_ = c41957.m8031();
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
            if (!this.reservedName_.f11544) {
                this.reservedName_ = new C4216(this.reservedName_);
            }
            this.bitField0_ |= 512;
        }

        private void ensureReservedRangeIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.reservedRange_ = new ArrayList(this.reservedRange_);
                this.bitField0_ |= 256;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11773;
        }

        private C4195 internalGetEnumTypeFieldBuilder() {
            if (this.enumTypeBuilder_ == null) {
                this.enumTypeBuilder_ = new C4195(this.enumType_, getParentForChildren(), isClean());
                this.enumType_ = null;
            }
            return this.enumTypeBuilder_;
        }

        private C4195 internalGetExtensionFieldBuilder() {
            if (this.extensionBuilder_ == null) {
                this.extensionBuilder_ = new C4195(this.extension_, getParentForChildren(), isClean());
                this.extension_ = null;
            }
            return this.extensionBuilder_;
        }

        private C4195 internalGetExtensionRangeFieldBuilder() {
            if (this.extensionRangeBuilder_ == null) {
                this.extensionRangeBuilder_ = new C4195(this.extensionRange_, getParentForChildren(), isClean());
                this.extensionRange_ = null;
            }
            return this.extensionRangeBuilder_;
        }

        private C4195 internalGetFieldFieldBuilder() {
            if (this.fieldBuilder_ == null) {
                this.fieldBuilder_ = new C4195(this.field_, getParentForChildren(), isClean());
                this.field_ = null;
            }
            return this.fieldBuilder_;
        }

        private C4195 internalGetNestedTypeFieldBuilder() {
            if (this.nestedTypeBuilder_ == null) {
                this.nestedTypeBuilder_ = new C4195(this.nestedType_, getParentForChildren(), isClean());
                this.nestedType_ = null;
            }
            return this.nestedTypeBuilder_;
        }

        private C4195 internalGetOneofDeclFieldBuilder() {
            if (this.oneofDeclBuilder_ == null) {
                this.oneofDeclBuilder_ = new C4195(this.oneofDecl_, getParentForChildren(), isClean());
                this.oneofDecl_ = null;
            }
            return this.oneofDeclBuilder_;
        }

        private C4174 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C4195 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C4195(this.reservedRange_, getParentForChildren(), isClean());
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

        public C4096 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureEnumTypeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.enumType_);
            onChanged();
            return this;
        }

        public C4096 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureExtensionIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.extension_);
            onChanged();
            return this;
        }

        public C4096 addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureExtensionRangeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.extensionRange_);
            onChanged();
            return this;
        }

        public C4096 addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureFieldIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.field_);
            onChanged();
            return this;
        }

        public C4096 addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureNestedTypeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.nestedType_);
            onChanged();
            return this;
        }

        public C4096 addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureOneofDeclIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.oneofDecl_);
            onChanged();
            return this;
        }

        public C4096 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4096 addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C4096 addEnumType(DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4098.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.add(c4098.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumDescriptorProto.C4098 addEnumTypeBuilder() {
            return (DescriptorProtos$EnumDescriptorProto.C4098) internalGetEnumTypeFieldBuilder().m8019(DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public C4096 addExtension(DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4108.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.add(c4108.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 addExtensionBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetExtensionFieldBuilder().m8019(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C4096 addExtensionRange(ExtensionRange.C4094 c4094) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4094.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(c4094.build());
            onChanged();
            return this;
        }

        public ExtensionRange.C4094 addExtensionRangeBuilder() {
            return (ExtensionRange.C4094) internalGetExtensionRangeFieldBuilder().m8019(ExtensionRange.getDefaultInstance());
        }

        public C4096 addField(DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4108.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.add(c4108.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 addFieldBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetFieldFieldBuilder().m8019(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C4096 addNestedType(C4096 c4096) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4096.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.add(c4096.build());
            onChanged();
            return this;
        }

        public C4096 addNestedTypeBuilder() {
            return (C4096) internalGetNestedTypeFieldBuilder().m8019(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C4096 addOneofDecl(DescriptorProtos$OneofDescriptorProto.C4120 c4120) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4120.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(c4120.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$OneofDescriptorProto.C4120 addOneofDeclBuilder() {
            return (DescriptorProtos$OneofDescriptorProto.C4120) internalGetOneofDeclFieldBuilder().m8019(DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public C4096 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m8052(str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4096 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo8054(byteString);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4096 addReservedRange(ReservedRange.C4095 c4095) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4095.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c4095.build());
            onChanged();
            return this;
        }

        public ReservedRange.C4095 addReservedRangeBuilder() {
            return (ReservedRange.C4095) internalGetReservedRangeFieldBuilder().m8019(ReservedRange.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$DescriptorProto build() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$DescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$DescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$DescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$DescriptorProto buildPartial() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$DescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$DescriptorProto);
            }
            onBuilt();
            return descriptorProtos$DescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4096 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                this.field_ = Collections.EMPTY_LIST;
            } else {
                this.field_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -3;
            C4195 c41952 = this.extensionBuilder_;
            if (c41952 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -5;
            C4195 c41953 = this.nestedTypeBuilder_;
            if (c41953 == null) {
                this.nestedType_ = Collections.EMPTY_LIST;
            } else {
                this.nestedType_ = null;
                c41953.m8030();
            }
            this.bitField0_ &= -9;
            C4195 c41954 = this.enumTypeBuilder_;
            if (c41954 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c41954.m8030();
            }
            this.bitField0_ &= -17;
            C4195 c41955 = this.extensionRangeBuilder_;
            if (c41955 == null) {
                this.extensionRange_ = Collections.EMPTY_LIST;
            } else {
                this.extensionRange_ = null;
                c41955.m8030();
            }
            this.bitField0_ &= -33;
            C4195 c41956 = this.oneofDeclBuilder_;
            if (c41956 == null) {
                this.oneofDecl_ = Collections.EMPTY_LIST;
            } else {
                this.oneofDecl_ = null;
                c41956.m8030();
            }
            this.bitField0_ &= -65;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            C4195 c41957 = this.reservedRangeBuilder_;
            if (c41957 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c41957.m8030();
            }
            this.bitField0_ &= -257;
            this.reservedName_ = C4216.f11382;
            this.visibility_ = 0;
            return this;
        }

        public C4096 clearEnumType() {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C4096 clearExtension() {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4096 clearExtensionRange() {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.extensionRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4096 clearField() {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.field_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4096 clearName() {
            this.name_ = DescriptorProtos$DescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4096 clearNestedType() {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.nestedType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C4096 clearOneofDecl() {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.oneofDecl_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C4096 clearOptions() {
            this.bitField0_ &= -129;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4096 clearReservedName() {
            this.reservedName_ = C4216.f11382;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C4096 clearReservedRange() {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C4096 clearVisibility() {
            this.bitField0_ &= -1025;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11773;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? this.enumType_.get(i) : (DescriptorProtos$EnumDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$EnumDescriptorProto.C4098 getEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C4098) internalGetEnumTypeFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$EnumDescriptorProto.C4098> getEnumTypeBuilderList() {
            return internalGetEnumTypeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getEnumTypeCount() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? this.enumType_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.enumType_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4405 getEnumTypeOrBuilder(int i) {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? this.enumType_.get(i) : (InterfaceC4405) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4405> getEnumTypeOrBuilderList() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? this.extension_.get(i) : (DescriptorProtos$FieldDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 getExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetExtensionFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C4108> getExtensionBuilderList() {
            return internalGetExtensionFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getExtensionCount() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? this.extension_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.extension_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4337 getExtensionOrBuilder(int i) {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? this.extension_.get(i) : (InterfaceC4337) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4337> getExtensionOrBuilderList() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public ExtensionRange getExtensionRange(int i) {
            C4195 c4195 = this.extensionRangeBuilder_;
            return c4195 == null ? this.extensionRange_.get(i) : (ExtensionRange) c4195.m8025(i, false);
        }

        public ExtensionRange.C4094 getExtensionRangeBuilder(int i) {
            return (ExtensionRange.C4094) internalGetExtensionRangeFieldBuilder().m8032(i);
        }

        public List<ExtensionRange.C4094> getExtensionRangeBuilderList() {
            return internalGetExtensionRangeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getExtensionRangeCount() {
            C4195 c4195 = this.extensionRangeBuilder_;
            return c4195 == null ? this.extensionRange_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<ExtensionRange> getExtensionRangeList() {
            C4195 c4195 = this.extensionRangeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.extensionRange_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4292 getExtensionRangeOrBuilder(int i) {
            C4195 c4195 = this.extensionRangeBuilder_;
            return c4195 == null ? this.extensionRange_.get(i) : (InterfaceC4292) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4292> getExtensionRangeOrBuilderList() {
            C4195 c4195 = this.extensionRangeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.extensionRange_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$FieldDescriptorProto getField(int i) {
            C4195 c4195 = this.fieldBuilder_;
            return c4195 == null ? this.field_.get(i) : (DescriptorProtos$FieldDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 getFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetFieldFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C4108> getFieldBuilderList() {
            return internalGetFieldFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getFieldCount() {
            C4195 c4195 = this.fieldBuilder_;
            return c4195 == null ? this.field_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
            C4195 c4195 = this.fieldBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.field_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4337 getFieldOrBuilder(int i) {
            C4195 c4195 = this.fieldBuilder_;
            return c4195 == null ? this.field_.get(i) : (InterfaceC4337) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4337> getFieldOrBuilderList() {
            C4195 c4195 = this.fieldBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.field_);
        }

        @Override // com.google.protobuf.InterfaceC4404
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

        @Override // com.google.protobuf.InterfaceC4404
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$DescriptorProto getNestedType(int i) {
            C4195 c4195 = this.nestedTypeBuilder_;
            return c4195 == null ? this.nestedType_.get(i) : (DescriptorProtos$DescriptorProto) c4195.m8025(i, false);
        }

        public C4096 getNestedTypeBuilder(int i) {
            return (C4096) internalGetNestedTypeFieldBuilder().m8032(i);
        }

        public List<C4096> getNestedTypeBuilderList() {
            return internalGetNestedTypeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getNestedTypeCount() {
            C4195 c4195 = this.nestedTypeBuilder_;
            return c4195 == null ? this.nestedType_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
            C4195 c4195 = this.nestedTypeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.nestedType_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4404 getNestedTypeOrBuilder(int i) {
            C4195 c4195 = this.nestedTypeBuilder_;
            return c4195 == null ? this.nestedType_.get(i) : (InterfaceC4404) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4404> getNestedTypeOrBuilderList() {
            C4195 c4195 = this.nestedTypeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.nestedType_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
            C4195 c4195 = this.oneofDeclBuilder_;
            return c4195 == null ? this.oneofDecl_.get(i) : (DescriptorProtos$OneofDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$OneofDescriptorProto.C4120 getOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C4120) internalGetOneofDeclFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$OneofDescriptorProto.C4120> getOneofDeclBuilderList() {
            return internalGetOneofDeclFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getOneofDeclCount() {
            C4195 c4195 = this.oneofDeclBuilder_;
            return c4195 == null ? this.oneofDecl_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
            C4195 c4195 = this.oneofDeclBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.oneofDecl_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4321 getOneofDeclOrBuilder(int i) {
            C4195 c4195 = this.oneofDeclBuilder_;
            return c4195 == null ? this.oneofDecl_.get(i) : (InterfaceC4321) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4321> getOneofDeclOrBuilderList() {
            C4195 c4195 = this.oneofDeclBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.oneofDecl_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$MessageOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$MessageOptions) c4174.m7939();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        public DescriptorProtos$MessageOptions.C4117 getOptionsBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (DescriptorProtos$MessageOptions.C4117) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4334 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4334) c4174.m7938();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getReservedNameCount() {
            return this.reservedName_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4209 getReservedNameList() {
            this.reservedName_.m8346();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public ReservedRange getReservedRange(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.get(i) : (ReservedRange) c4195.m8025(i, false);
        }

        public ReservedRange.C4095 getReservedRangeBuilder(int i) {
            return (ReservedRange.C4095) internalGetReservedRangeFieldBuilder().m8032(i);
        }

        public List<ReservedRange.C4095> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public int getReservedRangeCount() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<ReservedRange> getReservedRangeList() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.reservedRange_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4404
        public InterfaceC4289 getReservedRangeOrBuilder(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 == null ? this.reservedRange_.get(i) : (InterfaceC4289) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public List<? extends InterfaceC4289> getReservedRangeOrBuilderList() {
            C4195 c4195 = this.reservedRangeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.reservedRange_);
        }

        @Override // com.google.protobuf.InterfaceC4404
        public DescriptorProtos$SymbolVisibility getVisibility() {
            DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
            return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public boolean hasOptions() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4404
        public boolean hasVisibility() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11772;
            c4451.m8386(DescriptorProtos$DescriptorProto.class, C4096.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
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

        public C4096 mergeFrom(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
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
                boolean zIsEmpty = this.fieldBuilder_.f11357.isEmpty();
                C4195 c4195 = this.fieldBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.fieldBuilder_ = null;
                    this.field_ = descriptorProtos$DescriptorProto.field_;
                    this.bitField0_ &= -3;
                    this.fieldBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$DescriptorProto.field_);
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
                boolean zIsEmpty2 = this.extensionBuilder_.f11357.isEmpty();
                C4195 c41952 = this.extensionBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$DescriptorProto.extension_;
                    this.bitField0_ &= -5;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c41952.m8021(descriptorProtos$DescriptorProto.extension_);
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
                boolean zIsEmpty3 = this.nestedTypeBuilder_.f11357.isEmpty();
                C4195 c41953 = this.nestedTypeBuilder_;
                if (zIsEmpty3) {
                    c41953.f11358 = null;
                    this.nestedTypeBuilder_ = null;
                    this.nestedType_ = descriptorProtos$DescriptorProto.nestedType_;
                    this.bitField0_ &= -9;
                    this.nestedTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNestedTypeFieldBuilder() : null;
                } else {
                    c41953.m8021(descriptorProtos$DescriptorProto.nestedType_);
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
                boolean zIsEmpty4 = this.enumTypeBuilder_.f11357.isEmpty();
                C4195 c41954 = this.enumTypeBuilder_;
                if (zIsEmpty4) {
                    c41954.f11358 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$DescriptorProto.enumType_;
                    this.bitField0_ &= -17;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c41954.m8021(descriptorProtos$DescriptorProto.enumType_);
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
                boolean zIsEmpty5 = this.extensionRangeBuilder_.f11357.isEmpty();
                C4195 c41955 = this.extensionRangeBuilder_;
                if (zIsEmpty5) {
                    c41955.f11358 = null;
                    this.extensionRangeBuilder_ = null;
                    this.extensionRange_ = descriptorProtos$DescriptorProto.extensionRange_;
                    this.bitField0_ &= -33;
                    this.extensionRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionRangeFieldBuilder() : null;
                } else {
                    c41955.m8021(descriptorProtos$DescriptorProto.extensionRange_);
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
                boolean zIsEmpty6 = this.oneofDeclBuilder_.f11357.isEmpty();
                C4195 c41956 = this.oneofDeclBuilder_;
                if (zIsEmpty6) {
                    c41956.f11358 = null;
                    this.oneofDeclBuilder_ = null;
                    this.oneofDecl_ = descriptorProtos$DescriptorProto.oneofDecl_;
                    this.bitField0_ &= -65;
                    this.oneofDeclBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOneofDeclFieldBuilder() : null;
                } else {
                    c41956.m8021(descriptorProtos$DescriptorProto.oneofDecl_);
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
                boolean zIsEmpty7 = this.reservedRangeBuilder_.f11357.isEmpty();
                C4195 c41957 = this.reservedRangeBuilder_;
                if (zIsEmpty7) {
                    c41957.f11358 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$DescriptorProto.reservedRange_;
                    this.bitField0_ &= -257;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c41957.m8021(descriptorProtos$DescriptorProto.reservedRange_);
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

        public C4096 mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$MessageOptions);
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

        public C4096 removeEnumType(int i) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeExtension(int i) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeExtensionRange(int i) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeField(int i) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureFieldIsMutable();
            this.field_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeNestedType(int i) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeOneofDecl(int i) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
            onChanged();
            return this;
        }

        public C4096 removeReservedRange(int i) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C4096 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4098.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, c4098.build());
            onChanged();
            return this;
        }

        public C4096 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4108.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.set(i, c4108.build());
            onChanged();
            return this;
        }

        public C4096 setExtensionRange(int i, ExtensionRange.C4094 c4094) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4094.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, c4094.build());
            onChanged();
            return this;
        }

        public C4096 setField(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4108.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.set(i, c4108.build());
            onChanged();
            return this;
        }

        public C4096 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4096 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4096 setNestedType(int i, C4096 c4096) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4096.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, c4096.build());
            onChanged();
            return this;
        }

        public C4096 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C4120 c4120) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4120.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, c4120.build());
            onChanged();
            return this;
        }

        public C4096 setOptions(DescriptorProtos$MessageOptions.C4117 c4117) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4117.build();
            } else {
                c4174.m7946(c4117.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4096 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4096 setReservedRange(int i, ReservedRange.C4095 c4095) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4095.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c4095.build());
            onChanged();
            return this;
        }

        public C4096 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 1024;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$DescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C4098 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C4098) internalGetEnumTypeFieldBuilder().m8020(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetExtensionFieldBuilder().m8020(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public ExtensionRange.C4094 addExtensionRangeBuilder(int i) {
            return (ExtensionRange.C4094) internalGetExtensionRangeFieldBuilder().m8020(i, ExtensionRange.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 addFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetFieldFieldBuilder().m8020(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C4096 addNestedTypeBuilder(int i) {
            return (C4096) internalGetNestedTypeFieldBuilder().m8020(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$OneofDescriptorProto.C4120 addOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C4120) internalGetOneofDeclFieldBuilder().m8020(i, DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public ReservedRange.C4095 addReservedRangeBuilder(int i) {
            return (ReservedRange.C4095) internalGetReservedRangeFieldBuilder().m8020(i, ReservedRange.getDefaultInstance());
        }

        public C4096 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C4096 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 addExtensionRange(int i, ExtensionRange extensionRange) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, extensionRange);
                onChanged();
                return this;
            }
            c4195.m8018(i, extensionRange);
            return this;
        }

        public C4096 addField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 addNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C4096 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C4096 addReservedRange(int i, ReservedRange reservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, reservedRange);
                onChanged();
                return this;
            }
            c4195.m8018(i, reservedRange);
            return this;
        }

        public C4096 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.set(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C4096 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 setExtensionRange(int i, ExtensionRange extensionRange) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.set(i, extensionRange);
                onChanged();
                return this;
            }
            c4195.m8022(i, extensionRange);
            return this;
        }

        public C4096 setField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 setNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C4096 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.set(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C4096 setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$MessageOptions.getClass();
                this.options_ = descriptorProtos$MessageOptions;
            } else {
                c4174.m7946(descriptorProtos$MessageOptions);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4096 setReservedRange(int i, ReservedRange reservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, reservedRange);
                onChanged();
                return this;
            }
            c4195.m8022(i, reservedRange);
            return this;
        }

        public C4096 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C4096 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 addExtensionRange(ExtensionRange extensionRange) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(extensionRange);
                onChanged();
                return this;
            }
            c4195.m8017(extensionRange);
            return this;
        }

        public C4096 addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C4096 addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$DescriptorProto);
            return this;
        }

        public C4096 addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C4096 addReservedRange(ReservedRange reservedRange) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(reservedRange);
                onChanged();
                return this;
            }
            c4195.m8017(reservedRange);
            return this;
        }

        private C4096(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C4216.f11382;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C4096 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 == null) {
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, c4098.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4098.build());
            return this;
        }

        public C4096 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 == null) {
                ensureExtensionIsMutable();
                this.extension_.add(i, c4108.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4108.build());
            return this;
        }

        public C4096 addExtensionRange(int i, ExtensionRange.C4094 c4094) {
            C4195 c4195 = this.extensionRangeBuilder_;
            if (c4195 == null) {
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, c4094.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4094.build());
            return this;
        }

        public C4096 addField(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
            C4195 c4195 = this.fieldBuilder_;
            if (c4195 == null) {
                ensureFieldIsMutable();
                this.field_.add(i, c4108.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4108.build());
            return this;
        }

        public C4096 addNestedType(int i, C4096 c4096) {
            C4195 c4195 = this.nestedTypeBuilder_;
            if (c4195 == null) {
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, c4096.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4096.build());
            return this;
        }

        public C4096 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C4120 c4120) {
            C4195 c4195 = this.oneofDeclBuilder_;
            if (c4195 == null) {
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, c4120.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4120.build());
            return this;
        }

        public C4096 addReservedRange(int i, ReservedRange.C4095 c4095) {
            C4195 c4195 = this.reservedRangeBuilder_;
            if (c4195 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c4095.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4095.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4096 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$DescriptorProto) {
                return mergeFrom((DescriptorProtos$DescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4096 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        switch (iMo8264) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.name_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                                break;
                            case 18:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FieldDescriptorProto.parser(), c4529);
                                C4195 c4195 = this.fieldBuilder_;
                                if (c4195 == null) {
                                    ensureFieldIsMutable();
                                    this.field_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 26:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC4306.mo8274(DescriptorProtos$DescriptorProto.parser(), c4529);
                                C4195 c41952 = this.nestedTypeBuilder_;
                                if (c41952 == null) {
                                    ensureNestedTypeIsMutable();
                                    this.nestedType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c41952.m8017(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 34:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC4306.mo8274(DescriptorProtos$EnumDescriptorProto.parser(), c4529);
                                C4195 c41953 = this.enumTypeBuilder_;
                                if (c41953 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c41953.m8017(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 42:
                                ExtensionRange extensionRange = (ExtensionRange) abstractC4306.mo8274(ExtensionRange.parser(), c4529);
                                C4195 c41954 = this.extensionRangeBuilder_;
                                if (c41954 == null) {
                                    ensureExtensionRangeIsMutable();
                                    this.extensionRange_.add(extensionRange);
                                } else {
                                    c41954.m8017(extensionRange);
                                }
                                break;
                            case 50:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto2 = (DescriptorProtos$FieldDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FieldDescriptorProto.parser(), c4529);
                                C4195 c41955 = this.extensionBuilder_;
                                if (c41955 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto2);
                                } else {
                                    c41955.m8017(descriptorProtos$FieldDescriptorProto2);
                                }
                                break;
                            case 58:
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 128;
                                break;
                            case 66:
                                DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = (DescriptorProtos$OneofDescriptorProto) abstractC4306.mo8274(DescriptorProtos$OneofDescriptorProto.parser(), c4529);
                                C4195 c41956 = this.oneofDeclBuilder_;
                                if (c41956 == null) {
                                    ensureOneofDeclIsMutable();
                                    this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                                } else {
                                    c41956.m8017(descriptorProtos$OneofDescriptorProto);
                                }
                                break;
                            case 74:
                                ReservedRange reservedRange = (ReservedRange) abstractC4306.mo8274(ReservedRange.parser(), c4529);
                                C4195 c41957 = this.reservedRangeBuilder_;
                                if (c41957 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(reservedRange);
                                } else {
                                    c41957.m8017(reservedRange);
                                }
                                break;
                            case 82:
                                ByteString byteStringMo8278 = abstractC4306.mo8278();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo8054(byteStringMo8278);
                                break;
                            case 88:
                                int iMo8283 = abstractC4306.mo8283();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(11, iMo8283);
                                } else {
                                    this.visibility_ = iMo8283;
                                    this.bitField0_ |= 1024;
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

    @Override // com.google.protobuf.InterfaceC4404
    public InterfaceC4209 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4096 newBuilderForType() {
        return newBuilder();
    }

    public static C4096 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private DescriptorProtos$DescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.reservedName_ = C4216.f11382;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

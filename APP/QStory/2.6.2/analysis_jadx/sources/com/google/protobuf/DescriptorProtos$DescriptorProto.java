package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
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

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$DescriptorProto extends GeneratedMessage implements InterfaceC3571 {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static final InterfaceC3374 PARSER;
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
    private C3383 reservedName_;
    private List<ReservedRange> reservedRange_;
    private int visibility_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "DescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$DescriptorProto();
        PARSER = new C3457();
    }

    private DescriptorProtos$DescriptorProto() {
        this.name_ = "";
        C3383 c3383 = C3383.f11032;
        this.reservedName_ = c3383;
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
        this.reservedName_ = c3383;
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11423;
    }

    public static C3263 newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11423;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3572 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3572> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3504 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3504> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public ExtensionRange getExtensionRange(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3459 getExtensionRangeOrBuilder(int i) {
        return this.extensionRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3459> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$FieldDescriptorProto getField(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3504 getFieldOrBuilder(int i) {
        return this.field_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3504> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC3571
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

    @Override // com.google.protobuf.InterfaceC3571
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$DescriptorProto getNestedType(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3571 getNestedTypeOrBuilder(int i) {
        return this.nestedType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3571> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3488 getOneofDeclOrBuilder(int i) {
        return this.oneofDecl_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3488> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3501 getOptionsOrBuilder() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public ByteString getReservedNameBytes(int i) {
        return this.reservedName_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getReservedNameCount() {
        return this.reservedName_.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public ReservedRange getReservedRange(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3456 getReservedRangeOrBuilder(int i) {
        return this.reservedRange_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3571
    public List<? extends InterfaceC3456> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.field_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.field_.get(i2));
        }
        int iM7656 = iComputeStringSize + size;
        int size2 = this.nestedType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7656 += AbstractC3461.m7656(this.nestedType_.get(i3));
        }
        int iM76562 = iM7656 + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM76562 += AbstractC3461.m7656(this.enumType_.get(i4));
        }
        int iM76563 = iM76562 + size3;
        int size4 = this.extensionRange_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM76563 += AbstractC3461.m7656(this.extensionRange_.get(i5));
        }
        int iM76564 = iM76563 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM76564 += AbstractC3461.m7656(this.extension_.get(i6));
        }
        int iM76565 = iM76564 + size5;
        if ((this.bitField0_ & 2) != 0) {
            iM76565 += AbstractC3461.m7652(7, getOptions());
        }
        int size6 = this.oneofDecl_.size();
        for (int i7 = 0; i7 < size6; i7++) {
            iM76565 += AbstractC3461.m7656(this.oneofDecl_.get(i7));
        }
        int iM76566 = iM76565 + size6;
        int size7 = this.reservedRange_.size();
        for (int i8 = 0; i8 < size7; i8++) {
            iM76566 += AbstractC3461.m7656(this.reservedRange_.get(i8));
        }
        int i9 = iM76566 + size7;
        int iComputeStringSizeNoTag = 0;
        for (int i10 = 0; i10 < this.reservedName_.f11033.size(); i10++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.reservedName_.f11033.get(i10));
        }
        int size8 = getReservedNameList().size() + i9 + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 4) != 0) {
            size8 += AbstractC3461.m7645(11, this.visibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size8;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3571
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getFieldCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getFieldList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + getExtensionList().hashCode();
        }
        if (getNestedTypeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getNestedTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getEnumTypeList().hashCode();
        }
        if (getExtensionRangeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + getExtensionRangeList().hashCode();
        }
        if (getOneofDeclCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 8, 53) + getOneofDeclList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 7, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 9, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 10, 53) + getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 11, 53) + this.visibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11422;
        c3618.m7840(DescriptorProtos$DescriptorProto.class, C3263.class);
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

    @Override // com.google.protobuf.AbstractC3532
    public C3263 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3263(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3263 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3263() : new C3263().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.field_.size(); i++) {
            abstractC3461.mo7662(2, this.field_.get(i));
        }
        for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
            abstractC3461.mo7662(3, this.nestedType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC3461.mo7662(4, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
            abstractC3461.mo7662(5, this.extensionRange_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC3461.mo7662(6, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7662(7, getOptions());
        }
        for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
            abstractC3461.mo7662(8, this.oneofDecl_.get(i6));
        }
        for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
            abstractC3461.mo7662(9, this.reservedRange_.get(i7));
        }
        for (int i8 = 0; i8 < this.reservedName_.f11033.size(); i8++) {
            GeneratedMessage.writeString(abstractC3461, 10, this.reservedName_.f11033.get(i8));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(11, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class ReservedRange extends GeneratedMessage implements InterfaceC3456 {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static final InterfaceC3374 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private int start_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "ReservedRange");
            DEFAULT_INSTANCE = new ReservedRange();
            PARSER = new C3455();
        }

        private ReservedRange(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11444;
        }

        public static C3262 newBuilder(ReservedRange reservedRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11444;
        }

        @Override // com.google.protobuf.InterfaceC3456
        public int getEnd() {
            return this.end_;
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
            int iM7644 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7644(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7644 += AbstractC3461.m7644(2, this.end_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7644;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3456
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3456
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3456
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11445;
            c3618.m7840(ReservedRange.class, C3262.class);
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
        public C3262 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3262(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3262 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3262() : new C3262().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7664(2, this.end_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3262 extends GeneratedMessage.AbstractC3304 implements InterfaceC3456 {
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

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11444;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public ReservedRange build() {
                ReservedRange reservedRangeBuildPartial = buildPartial();
                if (reservedRangeBuildPartial.isInitialized()) {
                    return reservedRangeBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) reservedRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public ReservedRange buildPartial() {
                ReservedRange reservedRange = new ReservedRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(reservedRange);
                }
                onBuilt();
                return reservedRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3262 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                return this;
            }

            public C3262 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3262 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11444;
            }

            @Override // com.google.protobuf.InterfaceC3456
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3456
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3456
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3456
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11445;
                c3618.m7840(ReservedRange.class, C3262.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3262 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    this.start_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 1;
                                } else if (iMo7718 == 16) {
                                    this.end_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 2;
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

            public C3262 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3262 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private C3262() {
            }

            private C3262(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public ReservedRange getDefaultInstanceForType() {
                return ReservedRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3262 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof ReservedRange) {
                    return mergeFrom((ReservedRange) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3262 mergeFrom(ReservedRange reservedRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public ReservedRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (ReservedRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3262 newBuilderForType() {
            return newBuilder();
        }

        public static C3262 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ReservedRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static ReservedRange parseFrom(ByteString byteString) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static ReservedRange parseFrom(ByteString byteString, C3696 c3696) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static ReservedRange parseFrom(byte[] bArr) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static ReservedRange parseFrom(byte[] bArr, C3696 c3696) {
            return (ReservedRange) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static ReservedRange parseFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, C3696 c3696) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static ReservedRange parseFrom(AbstractC3473 abstractC3473) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static ReservedRange parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (ReservedRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class ExtensionRange extends GeneratedMessage implements InterfaceC3459 {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static final InterfaceC3374 PARSER;
        public static final int START_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "ExtensionRange");
            DEFAULT_INSTANCE = new ExtensionRange();
            PARSER = new C3460();
        }

        private ExtensionRange(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11441;
        }

        public static C3261 newBuilder(ExtensionRange extensionRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11441;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public InterfaceC3564 getOptionsOrBuilder() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
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
            int iM7644 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7644(1, this.start_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7644 += AbstractC3461.m7644(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7644 += AbstractC3461.m7652(3, getOptions());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7644;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3459
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStart()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getEnd();
            }
            if (hasOptions()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getOptions().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11440;
            c3618.m7840(ExtensionRange.class, C3261.class);
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
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.AbstractC3532
        public C3261 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3261(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3261 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3261() : new C3261().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7664(2, this.end_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3461.mo7662(3, getOptions());
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3261 extends GeneratedMessage.AbstractC3304 implements InterfaceC3459 {
            private int bitField0_;
            private int end_;
            private C3341 optionsBuilder_;
            private DescriptorProtos$ExtensionRangeOptions options_;
            private int start_;

            private C3261() {
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
                    C3341 c3341 = this.optionsBuilder_;
                    extensionRange.options_ = c3341 == null ? this.options_ : (DescriptorProtos$ExtensionRangeOptions) c3341.m7397();
                    i |= 4;
                }
                ExtensionRange.access$3676(extensionRange, i);
            }

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11441;
            }

            private C3341 internalGetOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public ExtensionRange build() {
                ExtensionRange extensionRangeBuildPartial = buildPartial();
                if (extensionRangeBuildPartial.isInitialized()) {
                    return extensionRangeBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) extensionRangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public ExtensionRange buildPartial() {
                ExtensionRange extensionRange = new ExtensionRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(extensionRange);
                }
                onBuilt();
                return extensionRange;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3261 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.start_ = 0;
                this.end_ = 0;
                this.options_ = null;
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.optionsBuilder_ = null;
                }
                return this;
            }

            public C3261 clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public C3261 clearOptions() {
                this.bitField0_ &= -5;
                this.options_ = null;
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.optionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3261 clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11441;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public DescriptorProtos$ExtensionRangeOptions getOptions() {
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 != null) {
                    return (DescriptorProtos$ExtensionRangeOptions) c3341.m7393();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            public DescriptorProtos$ExtensionRangeOptions.C3270 getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$ExtensionRangeOptions.C3270) internalGetOptionsFieldBuilder().m7394();
            }

            @Override // com.google.protobuf.InterfaceC3459
            public InterfaceC3564 getOptionsOrBuilder() {
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 != null) {
                    return (InterfaceC3564) c3341.m7392();
                }
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
                return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3459
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11440;
                c3618.m7840(ExtensionRange.class, C3261.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3261 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    this.start_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 1;
                                } else if (iMo7718 == 16) {
                                    this.end_ = abstractC3473.mo7730();
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 26) {
                                    abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                    this.bitField0_ |= 4;
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

            public C3261 mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2;
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 != null) {
                    c3341.m7399(descriptorProtos$ExtensionRangeOptions);
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

            public C3261 setEnd(int i) {
                this.end_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3261 setOptions(DescriptorProtos$ExtensionRangeOptions.C3270 c3270) {
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 == null) {
                    this.options_ = c3270.build();
                } else {
                    c3341.m7400(c3270.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3261 setStart(int i) {
                this.start_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public ExtensionRange getDefaultInstanceForType() {
                return ExtensionRange.getDefaultInstance();
            }

            private C3261(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                maybeForceBuilderInitialization();
            }

            public C3261 setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                C3341 c3341 = this.optionsBuilder_;
                if (c3341 == null) {
                    descriptorProtos$ExtensionRangeOptions.getClass();
                    this.options_ = descriptorProtos$ExtensionRangeOptions;
                } else {
                    c3341.m7400(descriptorProtos$ExtensionRangeOptions);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3261 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof ExtensionRange) {
                    return mergeFrom((ExtensionRange) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3261 mergeFrom(ExtensionRange extensionRange) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public ExtensionRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (ExtensionRange) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3261 newBuilderForType() {
            return newBuilder();
        }

        public static C3261 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private ExtensionRange() {
            this.start_ = 0;
            this.end_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static ExtensionRange parseFrom(ByteString byteString) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static ExtensionRange parseFrom(ByteString byteString, C3696 c3696) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static ExtensionRange parseFrom(byte[] bArr) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static ExtensionRange parseFrom(byte[] bArr, C3696 c3696) {
            return (ExtensionRange) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, C3696 c3696) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static ExtensionRange parseFrom(AbstractC3473 abstractC3473) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static ExtensionRange parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (ExtensionRange) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3263 extends GeneratedMessage.AbstractC3304 implements InterfaceC3571 {
        private int bitField0_;
        private C3362 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C3362 extensionBuilder_;
        private C3362 extensionRangeBuilder_;
        private List<ExtensionRange> extensionRange_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C3362 fieldBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> field_;
        private Object name_;
        private C3362 nestedTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> nestedType_;
        private C3362 oneofDeclBuilder_;
        private List<DescriptorProtos$OneofDescriptorProto> oneofDecl_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$MessageOptions options_;
        private C3383 reservedName_;
        private C3362 reservedRangeBuilder_;
        private List<ReservedRange> reservedRange_;
        private int visibility_;

        private C3263() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3383.f11032;
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
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$DescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$MessageOptions) c3341.m7397();
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.reservedName_.m7800();
                descriptorProtos$DescriptorProto.reservedName_ = this.reservedName_;
            }
            if ((i2 & 1024) != 0) {
                descriptorProtos$DescriptorProto.visibility_ = this.visibility_;
                i |= 4;
            }
            DescriptorProtos$DescriptorProto.access$5976(descriptorProtos$DescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.field_ = Collections.unmodifiableList(this.field_);
                    this.bitField0_ &= -3;
                }
                descriptorProtos$DescriptorProto.field_ = this.field_;
            } else {
                descriptorProtos$DescriptorProto.field_ = c3362.m7485();
            }
            C3362 c33622 = this.extensionBuilder_;
            if (c33622 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.extension_ = Collections.unmodifiableList(this.extension_);
                    this.bitField0_ &= -5;
                }
                descriptorProtos$DescriptorProto.extension_ = this.extension_;
            } else {
                descriptorProtos$DescriptorProto.extension_ = c33622.m7485();
            }
            C3362 c33623 = this.nestedTypeBuilder_;
            if (c33623 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                    this.bitField0_ &= -9;
                }
                descriptorProtos$DescriptorProto.nestedType_ = this.nestedType_;
            } else {
                descriptorProtos$DescriptorProto.nestedType_ = c33623.m7485();
            }
            C3362 c33624 = this.enumTypeBuilder_;
            if (c33624 == null) {
                if ((this.bitField0_ & 16) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -17;
                }
                descriptorProtos$DescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$DescriptorProto.enumType_ = c33624.m7485();
            }
            C3362 c33625 = this.extensionRangeBuilder_;
            if (c33625 == null) {
                if ((this.bitField0_ & 32) != 0) {
                    this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                    this.bitField0_ &= -33;
                }
                descriptorProtos$DescriptorProto.extensionRange_ = this.extensionRange_;
            } else {
                descriptorProtos$DescriptorProto.extensionRange_ = c33625.m7485();
            }
            C3362 c33626 = this.oneofDeclBuilder_;
            if (c33626 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$DescriptorProto.oneofDecl_ = this.oneofDecl_;
            } else {
                descriptorProtos$DescriptorProto.oneofDecl_ = c33626.m7485();
            }
            C3362 c33627 = this.reservedRangeBuilder_;
            if (c33627 != null) {
                descriptorProtos$DescriptorProto.reservedRange_ = c33627.m7485();
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
            if (!this.reservedName_.f11194) {
                this.reservedName_ = new C3383(this.reservedName_);
            }
            this.bitField0_ |= 512;
        }

        private void ensureReservedRangeIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.reservedRange_ = new ArrayList(this.reservedRange_);
                this.bitField0_ |= 256;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11423;
        }

        private C3362 internalGetEnumTypeFieldBuilder() {
            if (this.enumTypeBuilder_ == null) {
                this.enumTypeBuilder_ = new C3362(this.enumType_, getParentForChildren(), isClean());
                this.enumType_ = null;
            }
            return this.enumTypeBuilder_;
        }

        private C3362 internalGetExtensionFieldBuilder() {
            if (this.extensionBuilder_ == null) {
                this.extensionBuilder_ = new C3362(this.extension_, getParentForChildren(), isClean());
                this.extension_ = null;
            }
            return this.extensionBuilder_;
        }

        private C3362 internalGetExtensionRangeFieldBuilder() {
            if (this.extensionRangeBuilder_ == null) {
                this.extensionRangeBuilder_ = new C3362(this.extensionRange_, getParentForChildren(), isClean());
                this.extensionRange_ = null;
            }
            return this.extensionRangeBuilder_;
        }

        private C3362 internalGetFieldFieldBuilder() {
            if (this.fieldBuilder_ == null) {
                this.fieldBuilder_ = new C3362(this.field_, getParentForChildren(), isClean());
                this.field_ = null;
            }
            return this.fieldBuilder_;
        }

        private C3362 internalGetNestedTypeFieldBuilder() {
            if (this.nestedTypeBuilder_ == null) {
                this.nestedTypeBuilder_ = new C3362(this.nestedType_, getParentForChildren(), isClean());
                this.nestedType_ = null;
            }
            return this.nestedTypeBuilder_;
        }

        private C3362 internalGetOneofDeclFieldBuilder() {
            if (this.oneofDeclBuilder_ == null) {
                this.oneofDeclBuilder_ = new C3362(this.oneofDecl_, getParentForChildren(), isClean());
                this.oneofDecl_ = null;
            }
            return this.oneofDeclBuilder_;
        }

        private C3341 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3362 internalGetReservedRangeFieldBuilder() {
            if (this.reservedRangeBuilder_ == null) {
                this.reservedRangeBuilder_ = new C3362(this.reservedRange_, getParentForChildren(), isClean());
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

        public C3263 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureEnumTypeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.enumType_);
            onChanged();
            return this;
        }

        public C3263 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureExtensionIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.extension_);
            onChanged();
            return this;
        }

        public C3263 addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureExtensionRangeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.extensionRange_);
            onChanged();
            return this;
        }

        public C3263 addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureFieldIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.field_);
            onChanged();
            return this;
        }

        public C3263 addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureNestedTypeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.nestedType_);
            onChanged();
            return this;
        }

        public C3263 addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureOneofDeclIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.oneofDecl_);
            onChanged();
            return this;
        }

        public C3263 addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.reservedName_);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3263 addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureReservedRangeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.reservedRange_);
            onChanged();
            return this;
        }

        public C3263 addEnumType(DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3265.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.add(c3265.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$EnumDescriptorProto.C3265 addEnumTypeBuilder() {
            return (DescriptorProtos$EnumDescriptorProto.C3265) internalGetEnumTypeFieldBuilder().m7473(DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public C3263 addExtension(DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3275.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.add(c3275.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 addExtensionBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetExtensionFieldBuilder().m7473(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3263 addExtensionRange(ExtensionRange.C3261 c3261) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3261.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(c3261.build());
            onChanged();
            return this;
        }

        public ExtensionRange.C3261 addExtensionRangeBuilder() {
            return (ExtensionRange.C3261) internalGetExtensionRangeFieldBuilder().m7473(ExtensionRange.getDefaultInstance());
        }

        public C3263 addField(DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3275.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.add(c3275.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 addFieldBuilder() {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetFieldFieldBuilder().m7473(DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3263 addNestedType(C3263 c3263) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3263.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.add(c3263.build());
            onChanged();
            return this;
        }

        public C3263 addNestedTypeBuilder() {
            return (C3263) internalGetNestedTypeFieldBuilder().m7473(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C3263 addOneofDecl(DescriptorProtos$OneofDescriptorProto.C3287 c3287) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3287.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(c3287.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$OneofDescriptorProto.C3287 addOneofDeclBuilder() {
            return (DescriptorProtos$OneofDescriptorProto.C3287) internalGetOneofDeclFieldBuilder().m7473(DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public C3263 addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.m7506(str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3263 addReservedNameBytes(ByteString byteString) {
            byteString.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.mo7508(byteString);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3263 addReservedRange(ReservedRange.C3262 c3262) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3262.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(c3262.build());
            onChanged();
            return this;
        }

        public ReservedRange.C3262 addReservedRangeBuilder() {
            return (ReservedRange.C3262) internalGetReservedRangeFieldBuilder().m7473(ReservedRange.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$DescriptorProto build() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$DescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$DescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$DescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$DescriptorProto buildPartial() {
            DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$DescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$DescriptorProto);
            }
            onBuilt();
            return descriptorProtos$DescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3263 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                this.field_ = Collections.EMPTY_LIST;
            } else {
                this.field_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -3;
            C3362 c33622 = this.extensionBuilder_;
            if (c33622 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -5;
            C3362 c33623 = this.nestedTypeBuilder_;
            if (c33623 == null) {
                this.nestedType_ = Collections.EMPTY_LIST;
            } else {
                this.nestedType_ = null;
                c33623.m7484();
            }
            this.bitField0_ &= -9;
            C3362 c33624 = this.enumTypeBuilder_;
            if (c33624 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c33624.m7484();
            }
            this.bitField0_ &= -17;
            C3362 c33625 = this.extensionRangeBuilder_;
            if (c33625 == null) {
                this.extensionRange_ = Collections.EMPTY_LIST;
            } else {
                this.extensionRange_ = null;
                c33625.m7484();
            }
            this.bitField0_ &= -33;
            C3362 c33626 = this.oneofDeclBuilder_;
            if (c33626 == null) {
                this.oneofDecl_ = Collections.EMPTY_LIST;
            } else {
                this.oneofDecl_ = null;
                c33626.m7484();
            }
            this.bitField0_ &= -65;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            C3362 c33627 = this.reservedRangeBuilder_;
            if (c33627 == null) {
                this.reservedRange_ = Collections.EMPTY_LIST;
            } else {
                this.reservedRange_ = null;
                c33627.m7484();
            }
            this.bitField0_ &= -257;
            this.reservedName_ = C3383.f11032;
            this.visibility_ = 0;
            return this;
        }

        public C3263 clearEnumType() {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3263 clearExtension() {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3263 clearExtensionRange() {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.extensionRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3263 clearField() {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.field_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3263 clearName() {
            this.name_ = DescriptorProtos$DescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3263 clearNestedType() {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.nestedType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3263 clearOneofDecl() {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.oneofDecl_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3263 clearOptions() {
            this.bitField0_ &= -129;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3263 clearReservedName() {
            this.reservedName_ = C3383.f11032;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3263 clearReservedRange() {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.reservedRange_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3263 clearVisibility() {
            this.bitField0_ &= -1025;
            this.visibility_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11423;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? this.enumType_.get(i) : (DescriptorProtos$EnumDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$EnumDescriptorProto.C3265 getEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3265) internalGetEnumTypeFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$EnumDescriptorProto.C3265> getEnumTypeBuilderList() {
            return internalGetEnumTypeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getEnumTypeCount() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? this.enumType_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.enumType_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3572 getEnumTypeOrBuilder(int i) {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? this.enumType_.get(i) : (InterfaceC3572) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3572> getEnumTypeOrBuilderList() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? this.extension_.get(i) : (DescriptorProtos$FieldDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 getExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetExtensionFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C3275> getExtensionBuilderList() {
            return internalGetExtensionFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getExtensionCount() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? this.extension_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.extension_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3504 getExtensionOrBuilder(int i) {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? this.extension_.get(i) : (InterfaceC3504) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3504> getExtensionOrBuilderList() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public ExtensionRange getExtensionRange(int i) {
            C3362 c3362 = this.extensionRangeBuilder_;
            return c3362 == null ? this.extensionRange_.get(i) : (ExtensionRange) c3362.m7479(i, false);
        }

        public ExtensionRange.C3261 getExtensionRangeBuilder(int i) {
            return (ExtensionRange.C3261) internalGetExtensionRangeFieldBuilder().m7486(i);
        }

        public List<ExtensionRange.C3261> getExtensionRangeBuilderList() {
            return internalGetExtensionRangeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getExtensionRangeCount() {
            C3362 c3362 = this.extensionRangeBuilder_;
            return c3362 == null ? this.extensionRange_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<ExtensionRange> getExtensionRangeList() {
            C3362 c3362 = this.extensionRangeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.extensionRange_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3459 getExtensionRangeOrBuilder(int i) {
            C3362 c3362 = this.extensionRangeBuilder_;
            return c3362 == null ? this.extensionRange_.get(i) : (InterfaceC3459) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3459> getExtensionRangeOrBuilderList() {
            C3362 c3362 = this.extensionRangeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.extensionRange_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$FieldDescriptorProto getField(int i) {
            C3362 c3362 = this.fieldBuilder_;
            return c3362 == null ? this.field_.get(i) : (DescriptorProtos$FieldDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 getFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetFieldFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$FieldDescriptorProto.C3275> getFieldBuilderList() {
            return internalGetFieldFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getFieldCount() {
            C3362 c3362 = this.fieldBuilder_;
            return c3362 == null ? this.field_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
            C3362 c3362 = this.fieldBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.field_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3504 getFieldOrBuilder(int i) {
            C3362 c3362 = this.fieldBuilder_;
            return c3362 == null ? this.field_.get(i) : (InterfaceC3504) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3504> getFieldOrBuilderList() {
            C3362 c3362 = this.fieldBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.field_);
        }

        @Override // com.google.protobuf.InterfaceC3571
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

        @Override // com.google.protobuf.InterfaceC3571
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$DescriptorProto getNestedType(int i) {
            C3362 c3362 = this.nestedTypeBuilder_;
            return c3362 == null ? this.nestedType_.get(i) : (DescriptorProtos$DescriptorProto) c3362.m7479(i, false);
        }

        public C3263 getNestedTypeBuilder(int i) {
            return (C3263) internalGetNestedTypeFieldBuilder().m7486(i);
        }

        public List<C3263> getNestedTypeBuilderList() {
            return internalGetNestedTypeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getNestedTypeCount() {
            C3362 c3362 = this.nestedTypeBuilder_;
            return c3362 == null ? this.nestedType_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
            C3362 c3362 = this.nestedTypeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.nestedType_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3571 getNestedTypeOrBuilder(int i) {
            C3362 c3362 = this.nestedTypeBuilder_;
            return c3362 == null ? this.nestedType_.get(i) : (InterfaceC3571) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3571> getNestedTypeOrBuilderList() {
            C3362 c3362 = this.nestedTypeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.nestedType_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i) {
            C3362 c3362 = this.oneofDeclBuilder_;
            return c3362 == null ? this.oneofDecl_.get(i) : (DescriptorProtos$OneofDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$OneofDescriptorProto.C3287 getOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C3287) internalGetOneofDeclFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$OneofDescriptorProto.C3287> getOneofDeclBuilderList() {
            return internalGetOneofDeclFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getOneofDeclCount() {
            C3362 c3362 = this.oneofDeclBuilder_;
            return c3362 == null ? this.oneofDecl_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
            C3362 c3362 = this.oneofDeclBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.oneofDecl_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3488 getOneofDeclOrBuilder(int i) {
            C3362 c3362 = this.oneofDeclBuilder_;
            return c3362 == null ? this.oneofDecl_.get(i) : (InterfaceC3488) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3488> getOneofDeclOrBuilderList() {
            C3362 c3362 = this.oneofDeclBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.oneofDecl_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$MessageOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$MessageOptions) c3341.m7393();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        public DescriptorProtos$MessageOptions.C3284 getOptionsBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (DescriptorProtos$MessageOptions.C3284) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3501 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3501) c3341.m7392();
            }
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
            return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getReservedNameCount() {
            return this.reservedName_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3376 getReservedNameList() {
            this.reservedName_.m7800();
            return this.reservedName_;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public ReservedRange getReservedRange(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.get(i) : (ReservedRange) c3362.m7479(i, false);
        }

        public ReservedRange.C3262 getReservedRangeBuilder(int i) {
            return (ReservedRange.C3262) internalGetReservedRangeFieldBuilder().m7486(i);
        }

        public List<ReservedRange.C3262> getReservedRangeBuilderList() {
            return internalGetReservedRangeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public int getReservedRangeCount() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<ReservedRange> getReservedRangeList() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.reservedRange_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3571
        public InterfaceC3456 getReservedRangeOrBuilder(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 == null ? this.reservedRange_.get(i) : (InterfaceC3456) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public List<? extends InterfaceC3456> getReservedRangeOrBuilderList() {
            C3362 c3362 = this.reservedRangeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.reservedRange_);
        }

        @Override // com.google.protobuf.InterfaceC3571
        public DescriptorProtos$SymbolVisibility getVisibility() {
            DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibilityForNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
            return descriptorProtos$SymbolVisibilityForNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : descriptorProtos$SymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public boolean hasOptions() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3571
        public boolean hasVisibility() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11422;
            c3618.m7840(DescriptorProtos$DescriptorProto.class, C3263.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        public C3263 mergeFrom(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
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
                boolean zIsEmpty = this.fieldBuilder_.f11007.isEmpty();
                C3362 c3362 = this.fieldBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.fieldBuilder_ = null;
                    this.field_ = descriptorProtos$DescriptorProto.field_;
                    this.bitField0_ &= -3;
                    this.fieldBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$DescriptorProto.field_);
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
                boolean zIsEmpty2 = this.extensionBuilder_.f11007.isEmpty();
                C3362 c33622 = this.extensionBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$DescriptorProto.extension_;
                    this.bitField0_ &= -5;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c33622.m7475(descriptorProtos$DescriptorProto.extension_);
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
                boolean zIsEmpty3 = this.nestedTypeBuilder_.f11007.isEmpty();
                C3362 c33623 = this.nestedTypeBuilder_;
                if (zIsEmpty3) {
                    c33623.f11008 = null;
                    this.nestedTypeBuilder_ = null;
                    this.nestedType_ = descriptorProtos$DescriptorProto.nestedType_;
                    this.bitField0_ &= -9;
                    this.nestedTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNestedTypeFieldBuilder() : null;
                } else {
                    c33623.m7475(descriptorProtos$DescriptorProto.nestedType_);
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
                boolean zIsEmpty4 = this.enumTypeBuilder_.f11007.isEmpty();
                C3362 c33624 = this.enumTypeBuilder_;
                if (zIsEmpty4) {
                    c33624.f11008 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$DescriptorProto.enumType_;
                    this.bitField0_ &= -17;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c33624.m7475(descriptorProtos$DescriptorProto.enumType_);
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
                boolean zIsEmpty5 = this.extensionRangeBuilder_.f11007.isEmpty();
                C3362 c33625 = this.extensionRangeBuilder_;
                if (zIsEmpty5) {
                    c33625.f11008 = null;
                    this.extensionRangeBuilder_ = null;
                    this.extensionRange_ = descriptorProtos$DescriptorProto.extensionRange_;
                    this.bitField0_ &= -33;
                    this.extensionRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionRangeFieldBuilder() : null;
                } else {
                    c33625.m7475(descriptorProtos$DescriptorProto.extensionRange_);
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
                boolean zIsEmpty6 = this.oneofDeclBuilder_.f11007.isEmpty();
                C3362 c33626 = this.oneofDeclBuilder_;
                if (zIsEmpty6) {
                    c33626.f11008 = null;
                    this.oneofDeclBuilder_ = null;
                    this.oneofDecl_ = descriptorProtos$DescriptorProto.oneofDecl_;
                    this.bitField0_ &= -65;
                    this.oneofDeclBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOneofDeclFieldBuilder() : null;
                } else {
                    c33626.m7475(descriptorProtos$DescriptorProto.oneofDecl_);
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
                boolean zIsEmpty7 = this.reservedRangeBuilder_.f11007.isEmpty();
                C3362 c33627 = this.reservedRangeBuilder_;
                if (zIsEmpty7) {
                    c33627.f11008 = null;
                    this.reservedRangeBuilder_ = null;
                    this.reservedRange_ = descriptorProtos$DescriptorProto.reservedRange_;
                    this.bitField0_ &= -257;
                    this.reservedRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetReservedRangeFieldBuilder() : null;
                } else {
                    c33627.m7475(descriptorProtos$DescriptorProto.reservedRange_);
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

        public C3263 mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$MessageOptions);
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

        public C3263 removeEnumType(int i) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeExtension(int i) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeExtensionRange(int i) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeField(int i) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureFieldIsMutable();
            this.field_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeNestedType(int i) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeOneofDecl(int i) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
            onChanged();
            return this;
        }

        public C3263 removeReservedRange(int i) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
            onChanged();
            return this;
        }

        public C3263 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3265.build());
                return this;
            }
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, c3265.build());
            onChanged();
            return this;
        }

        public C3263 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3275.build());
                return this;
            }
            ensureExtensionIsMutable();
            this.extension_.set(i, c3275.build());
            onChanged();
            return this;
        }

        public C3263 setExtensionRange(int i, ExtensionRange.C3261 c3261) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3261.build());
                return this;
            }
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, c3261.build());
            onChanged();
            return this;
        }

        public C3263 setField(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3275.build());
                return this;
            }
            ensureFieldIsMutable();
            this.field_.set(i, c3275.build());
            onChanged();
            return this;
        }

        public C3263 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3263 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3263 setNestedType(int i, C3263 c3263) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3263.build());
                return this;
            }
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, c3263.build());
            onChanged();
            return this;
        }

        public C3263 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C3287 c3287) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3287.build());
                return this;
            }
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, c3287.build());
            onChanged();
            return this;
        }

        public C3263 setOptions(DescriptorProtos$MessageOptions.C3284 c3284) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3284.build();
            } else {
                c3341.m7400(c3284.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3263 setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3263 setReservedRange(int i, ReservedRange.C3262 c3262) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3262.build());
                return this;
            }
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, c3262.build());
            onChanged();
            return this;
        }

        public C3263 setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            descriptorProtos$SymbolVisibility.getClass();
            this.bitField0_ |= 1024;
            this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$DescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C3265 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3265) internalGetEnumTypeFieldBuilder().m7474(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetExtensionFieldBuilder().m7474(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public ExtensionRange.C3261 addExtensionRangeBuilder(int i) {
            return (ExtensionRange.C3261) internalGetExtensionRangeFieldBuilder().m7474(i, ExtensionRange.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 addFieldBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetFieldFieldBuilder().m7474(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public C3263 addNestedTypeBuilder(int i) {
            return (C3263) internalGetNestedTypeFieldBuilder().m7474(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$OneofDescriptorProto.C3287 addOneofDeclBuilder(int i) {
            return (DescriptorProtos$OneofDescriptorProto.C3287) internalGetOneofDeclFieldBuilder().m7474(i, DescriptorProtos$OneofDescriptorProto.getDefaultInstance());
        }

        public ReservedRange.C3262 addReservedRangeBuilder(int i) {
            return (ReservedRange.C3262) internalGetReservedRangeFieldBuilder().m7474(i, ReservedRange.getDefaultInstance());
        }

        public C3263 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3263 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 addExtensionRange(int i, ExtensionRange extensionRange) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, extensionRange);
                onChanged();
                return this;
            }
            c3362.m7472(i, extensionRange);
            return this;
        }

        public C3263 addField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 addNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3263 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3263 addReservedRange(int i, ReservedRange reservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, reservedRange);
                onChanged();
                return this;
            }
            c3362.m7472(i, reservedRange);
            return this;
        }

        public C3263 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.set(i, descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3263 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 setExtensionRange(int i, ExtensionRange extensionRange) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.set(i, extensionRange);
                onChanged();
                return this;
            }
            c3362.m7476(i, extensionRange);
            return this;
        }

        public C3263 setField(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.set(i, descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 setNestedType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3263 setOneofDecl(int i, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.set(i, descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3263 setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$MessageOptions.getClass();
                this.options_ = descriptorProtos$MessageOptions;
            } else {
                c3341.m7400(descriptorProtos$MessageOptions);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3263 setReservedRange(int i, ReservedRange reservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.set(i, reservedRange);
                onChanged();
                return this;
            }
            c3362.m7476(i, reservedRange);
            return this;
        }

        public C3263 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$EnumDescriptorProto.getClass();
                ensureEnumTypeIsMutable();
                this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public C3263 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureExtensionIsMutable();
                this.extension_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 addExtensionRange(ExtensionRange extensionRange) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 == null) {
                extensionRange.getClass();
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(extensionRange);
                onChanged();
                return this;
            }
            c3362.m7471(extensionRange);
            return this;
        }

        public C3263 addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                descriptorProtos$FieldDescriptorProto.getClass();
                ensureFieldIsMutable();
                this.field_.add(descriptorProtos$FieldDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public C3263 addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureNestedTypeIsMutable();
                this.nestedType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$DescriptorProto);
            return this;
        }

        public C3263 addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 == null) {
                descriptorProtos$OneofDescriptorProto.getClass();
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public C3263 addReservedRange(ReservedRange reservedRange) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                reservedRange.getClass();
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(reservedRange);
                onChanged();
                return this;
            }
            c3362.m7471(reservedRange);
            return this;
        }

        private C3263(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.field_ = list;
            this.extension_ = list;
            this.nestedType_ = list;
            this.enumType_ = list;
            this.extensionRange_ = list;
            this.oneofDecl_ = list;
            this.reservedRange_ = list;
            this.reservedName_ = C3383.f11032;
            this.visibility_ = 0;
            maybeForceBuilderInitialization();
        }

        public C3263 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 == null) {
                ensureEnumTypeIsMutable();
                this.enumType_.add(i, c3265.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3265.build());
            return this;
        }

        public C3263 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 == null) {
                ensureExtensionIsMutable();
                this.extension_.add(i, c3275.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3275.build());
            return this;
        }

        public C3263 addExtensionRange(int i, ExtensionRange.C3261 c3261) {
            C3362 c3362 = this.extensionRangeBuilder_;
            if (c3362 == null) {
                ensureExtensionRangeIsMutable();
                this.extensionRange_.add(i, c3261.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3261.build());
            return this;
        }

        public C3263 addField(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
            C3362 c3362 = this.fieldBuilder_;
            if (c3362 == null) {
                ensureFieldIsMutable();
                this.field_.add(i, c3275.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3275.build());
            return this;
        }

        public C3263 addNestedType(int i, C3263 c3263) {
            C3362 c3362 = this.nestedTypeBuilder_;
            if (c3362 == null) {
                ensureNestedTypeIsMutable();
                this.nestedType_.add(i, c3263.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3263.build());
            return this;
        }

        public C3263 addOneofDecl(int i, DescriptorProtos$OneofDescriptorProto.C3287 c3287) {
            C3362 c3362 = this.oneofDeclBuilder_;
            if (c3362 == null) {
                ensureOneofDeclIsMutable();
                this.oneofDecl_.add(i, c3287.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3287.build());
            return this;
        }

        public C3263 addReservedRange(int i, ReservedRange.C3262 c3262) {
            C3362 c3362 = this.reservedRangeBuilder_;
            if (c3362 == null) {
                ensureReservedRangeIsMutable();
                this.reservedRange_.add(i, c3262.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3262.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3263 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$DescriptorProto) {
                return mergeFrom((DescriptorProtos$DescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3263 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        switch (iMo7718) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.name_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                                break;
                            case 18:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FieldDescriptorProto.parser(), c3696);
                                C3362 c3362 = this.fieldBuilder_;
                                if (c3362 == null) {
                                    ensureFieldIsMutable();
                                    this.field_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 26:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC3473.mo7728(DescriptorProtos$DescriptorProto.parser(), c3696);
                                C3362 c33622 = this.nestedTypeBuilder_;
                                if (c33622 == null) {
                                    ensureNestedTypeIsMutable();
                                    this.nestedType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c33622.m7471(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 34:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC3473.mo7728(DescriptorProtos$EnumDescriptorProto.parser(), c3696);
                                C3362 c33623 = this.enumTypeBuilder_;
                                if (c33623 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c33623.m7471(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 42:
                                ExtensionRange extensionRange = (ExtensionRange) abstractC3473.mo7728(ExtensionRange.parser(), c3696);
                                C3362 c33624 = this.extensionRangeBuilder_;
                                if (c33624 == null) {
                                    ensureExtensionRangeIsMutable();
                                    this.extensionRange_.add(extensionRange);
                                } else {
                                    c33624.m7471(extensionRange);
                                }
                                break;
                            case 50:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto2 = (DescriptorProtos$FieldDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FieldDescriptorProto.parser(), c3696);
                                C3362 c33625 = this.extensionBuilder_;
                                if (c33625 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto2);
                                } else {
                                    c33625.m7471(descriptorProtos$FieldDescriptorProto2);
                                }
                                break;
                            case 58:
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 128;
                                break;
                            case 66:
                                DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = (DescriptorProtos$OneofDescriptorProto) abstractC3473.mo7728(DescriptorProtos$OneofDescriptorProto.parser(), c3696);
                                C3362 c33626 = this.oneofDeclBuilder_;
                                if (c33626 == null) {
                                    ensureOneofDeclIsMutable();
                                    this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
                                } else {
                                    c33626.m7471(descriptorProtos$OneofDescriptorProto);
                                }
                                break;
                            case 74:
                                ReservedRange reservedRange = (ReservedRange) abstractC3473.mo7728(ReservedRange.parser(), c3696);
                                C3362 c33627 = this.reservedRangeBuilder_;
                                if (c33627 == null) {
                                    ensureReservedRangeIsMutable();
                                    this.reservedRange_.add(reservedRange);
                                } else {
                                    c33627.m7471(reservedRange);
                                }
                                break;
                            case 82:
                                ByteString byteStringMo7732 = abstractC3473.mo7732();
                                ensureReservedNameIsMutable();
                                this.reservedName_.mo7508(byteStringMo7732);
                                break;
                            case 88:
                                int iMo7737 = abstractC3473.mo7737();
                                if (DescriptorProtos$SymbolVisibility.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(11, iMo7737);
                                } else {
                                    this.visibility_ = iMo7737;
                                    this.bitField0_ |= 1024;
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

    @Override // com.google.protobuf.InterfaceC3571
    public InterfaceC3376 getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$DescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3263 newBuilderForType() {
        return newBuilder();
    }

    public static C3263 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private DescriptorProtos$DescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.reservedName_ = C3383.f11032;
        this.visibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

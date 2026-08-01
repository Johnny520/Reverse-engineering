package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessage implements InterfaceC3492 {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int EDITION_FIELD_NUMBER = 14;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int OPTION_DEPENDENCY_FIELD_NUMBER = 15;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private C3383 dependency_;
    private int edition_;
    private List<DescriptorProtos$EnumDescriptorProto> enumType_;
    private List<DescriptorProtos$FieldDescriptorProto> extension_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$DescriptorProto> messageType_;
    private volatile Object name_;
    private C3383 optionDependency_;
    private DescriptorProtos$FileOptions options_;
    private volatile Object package_;
    private InterfaceC3394 publicDependency_;
    private List<DescriptorProtos$ServiceDescriptorProto> service_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private volatile Object syntax_;
    private InterfaceC3394 weakDependency_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorProto();
        PARSER = new C3513();
    }

    private DescriptorProtos$FileDescriptorProto() {
        this.name_ = "";
        this.package_ = "";
        C3383 c3383 = C3383.f11032;
        this.dependency_ = c3383;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3383;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.package_ = "";
        this.dependency_ = c3383;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3383;
        List list = Collections.EMPTY_LIST;
        this.messageType_ = list;
        this.enumType_ = list;
        this.service_ = list;
        this.extension_ = list;
        this.syntax_ = "";
        this.edition_ = 0;
    }

    public static /* synthetic */ int access$2576(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int i) {
        int i2 = i | descriptorProtos$FileDescriptorProto.bitField0_;
        descriptorProtos$FileDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11425;
    }

    public static C3279 newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FileDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) obj;
        if (hasName() != descriptorProtos$FileDescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$FileDescriptorProto.getName())) || hasPackage() != descriptorProtos$FileDescriptorProto.hasPackage()) {
            return false;
        }
        if ((hasPackage() && !getPackage().equals(descriptorProtos$FileDescriptorProto.getPackage())) || !getDependencyList().equals(descriptorProtos$FileDescriptorProto.getDependencyList()) || !getPublicDependencyList().equals(descriptorProtos$FileDescriptorProto.getPublicDependencyList()) || !getWeakDependencyList().equals(descriptorProtos$FileDescriptorProto.getWeakDependencyList()) || !getOptionDependencyList().equals(descriptorProtos$FileDescriptorProto.getOptionDependencyList()) || !getMessageTypeList().equals(descriptorProtos$FileDescriptorProto.getMessageTypeList()) || !getEnumTypeList().equals(descriptorProtos$FileDescriptorProto.getEnumTypeList()) || !getServiceList().equals(descriptorProtos$FileDescriptorProto.getServiceList()) || !getExtensionList().equals(descriptorProtos$FileDescriptorProto.getExtensionList()) || hasOptions() != descriptorProtos$FileDescriptorProto.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(descriptorProtos$FileDescriptorProto.getOptions())) || hasSourceCodeInfo() != descriptorProtos$FileDescriptorProto.hasSourceCodeInfo()) {
            return false;
        }
        if ((hasSourceCodeInfo() && !getSourceCodeInfo().equals(descriptorProtos$FileDescriptorProto.getSourceCodeInfo())) || hasSyntax() != descriptorProtos$FileDescriptorProto.hasSyntax()) {
            return false;
        }
        if ((!hasSyntax() || getSyntax().equals(descriptorProtos$FileDescriptorProto.getSyntax())) && hasEdition() == descriptorProtos$FileDescriptorProto.hasEdition()) {
            return (!hasEdition() || this.edition_ == descriptorProtos$FileDescriptorProto.edition_) && getUnknownFields().equals(descriptorProtos$FileDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public String getDependency(int i) {
        return this.dependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public ByteString getDependencyBytes(int i) {
        return this.dependency_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getDependencyCount() {
        return this.dependency_.f11033.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11425;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$Edition getEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3572 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<? extends InterfaceC3572> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3504 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<? extends InterfaceC3504> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$DescriptorProto getMessageType(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3571 getMessageTypeOrBuilder(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<? extends InterfaceC3571> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC3492
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

    @Override // com.google.protobuf.InterfaceC3492
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public String getOptionDependency(int i) {
        return this.optionDependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public ByteString getOptionDependencyBytes(int i) {
        return this.optionDependency_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getOptionDependencyCount() {
        return this.optionDependency_.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3494 getOptionsOrBuilder() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public String getPackage() {
        Object obj = this.package_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.package_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public ByteString getPackageBytes() {
        Object obj = this.package_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.package_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getPublicDependency(int i) {
        return ((C3612) this.publicDependency_).m7827(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getPublicDependencyCount() {
        return ((C3612) this.publicDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.package_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.dependency_.f11033.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.dependency_.f11033.get(i2));
        }
        int size = getDependencyList().size() + iComputeStringSize + iComputeStringSizeNoTag;
        int size2 = this.messageType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC3461.m7656(this.messageType_.get(i3));
        }
        int iM7656 = size + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM7656 += AbstractC3461.m7656(this.enumType_.get(i4));
        }
        int iM76562 = iM7656 + size3;
        int size4 = this.service_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM76562 += AbstractC3461.m7656(this.service_.get(i5));
        }
        int iM76563 = iM76562 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM76563 += AbstractC3461.m7656(this.extension_.get(i6));
        }
        int iM7652 = iM76563 + size5;
        if ((this.bitField0_ & 4) != 0) {
            iM7652 += AbstractC3461.m7652(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7652 += AbstractC3461.m7652(9, getSourceCodeInfo());
        }
        int i7 = 0;
        int iM7651 = 0;
        while (true) {
            if (i7 >= ((C3612) this.publicDependency_).f11247) {
                break;
            }
            iM7651 += AbstractC3461.m7651(((C3612) r4).m7827(i7));
            i7++;
        }
        int size6 = getPublicDependencyList().size() + iM7652 + iM7651;
        int i8 = 0;
        int iM76512 = 0;
        while (true) {
            if (i8 >= ((C3612) this.weakDependency_).f11247) {
                break;
            }
            iM76512 += AbstractC3461.m7651(((C3612) r4).m7827(i8));
            i8++;
        }
        int size7 = getWeakDependencyList().size() + size6 + iM76512;
        if ((this.bitField0_ & 16) != 0) {
            size7 += GeneratedMessage.computeStringSize(12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            size7 += AbstractC3461.m7645(14, this.edition_);
        }
        int iComputeStringSizeNoTag2 = 0;
        for (int i9 = 0; i9 < this.optionDependency_.f11033.size(); i9++) {
            iComputeStringSizeNoTag2 += GeneratedMessage.computeStringSizeNoTag(this.optionDependency_.f11033.get(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getOptionDependencyList().size() + size7 + iComputeStringSizeNoTag2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$ServiceDescriptorProto getService(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3489 getServiceOrBuilder(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<? extends InterfaceC3489> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3649 getSourceCodeInfoOrBuilder() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public String getSyntax() {
        Object obj = this.syntax_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.syntax_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public ByteString getSyntaxBytes() {
        Object obj = this.syntax_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.syntax_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getWeakDependency(int i) {
        return ((C3612) this.weakDependency_).m7827(i);
    }

    @Override // com.google.protobuf.InterfaceC3492
    public int getWeakDependencyCount() {
        return ((C3612) this.weakDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC3492
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
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
        if (hasPackage()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getPackage().hashCode();
        }
        if (getDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getDependencyList().hashCode();
        }
        if (getPublicDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 10, 53) + getPublicDependencyList().hashCode();
        }
        if (getWeakDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 11, 53) + getWeakDependencyList().hashCode();
        }
        if (getOptionDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 15, 53) + getOptionDependencyList().hashCode();
        }
        if (getMessageTypeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getMessageTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + getEnumTypeList().hashCode();
        }
        if (getServiceCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + getServiceList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 7, 53) + getExtensionList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasSourceCodeInfo()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 9, 53) + getSourceCodeInfo().hashCode();
        }
        if (hasSyntax()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 12, 53) + getSyntax().hashCode();
        }
        if (hasEdition()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 14, 53) + this.edition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11424;
        c3618.m7840(DescriptorProtos$FileDescriptorProto.class, C3279.class);
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
        for (int i = 0; i < getMessageTypeCount(); i++) {
            if (!getMessageType(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
            if (!getEnumType(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getServiceCount(); i3++) {
            if (!getService(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getExtensionCount(); i4++) {
            if (!getExtension(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasOptions() && !getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (!hasSourceCodeInfo() || getSourceCodeInfo().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3279 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3279(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3279 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3279() : new C3279().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC3461, 2, this.package_);
        }
        for (int i = 0; i < this.dependency_.f11033.size(); i++) {
            GeneratedMessage.writeString(abstractC3461, 3, this.dependency_.f11033.get(i));
        }
        for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
            abstractC3461.mo7662(4, this.messageType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC3461.mo7662(5, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.service_.size(); i4++) {
            abstractC3461.mo7662(6, this.service_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC3461.mo7662(7, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7662(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7662(9, getSourceCodeInfo());
        }
        int i6 = 0;
        while (true) {
            C3612 c3612 = (C3612) this.publicDependency_;
            if (i6 >= c3612.f11247) {
                break;
            }
            abstractC3461.mo7664(10, c3612.m7827(i6));
            i6++;
        }
        int i7 = 0;
        while (true) {
            C3612 c36122 = (C3612) this.weakDependency_;
            if (i7 >= c36122.f11247) {
                break;
            }
            abstractC3461.mo7664(11, c36122.m7827(i7));
            i7++;
        }
        if ((this.bitField0_ & 16) != 0) {
            GeneratedMessage.writeString(abstractC3461, 12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3461.mo7664(14, this.edition_);
        }
        for (int i8 = 0; i8 < this.optionDependency_.f11033.size(); i8++) {
            GeneratedMessage.writeString(abstractC3461, 15, this.optionDependency_.f11033.get(i8));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3279 extends GeneratedMessage.AbstractC3304 implements InterfaceC3492 {
        private int bitField0_;
        private C3383 dependency_;
        private int edition_;
        private C3362 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C3362 extensionBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C3362 messageTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> messageType_;
        private Object name_;
        private C3383 optionDependency_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$FileOptions options_;
        private Object package_;
        private InterfaceC3394 publicDependency_;
        private C3362 serviceBuilder_;
        private List<DescriptorProtos$ServiceDescriptorProto> service_;
        private C3341 sourceCodeInfoBuilder_;
        private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
        private Object syntax_;
        private InterfaceC3394 weakDependency_;

        private C3279() {
            this.name_ = "";
            this.package_ = "";
            C3383 c3383 = C3383.f11032;
            this.dependency_ = c3383;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3383;
            List list = Collections.EMPTY_LIST;
            this.messageType_ = list;
            this.enumType_ = list;
            this.service_ = list;
            this.extension_ = list;
            this.syntax_ = "";
            this.edition_ = 0;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$FileDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$FileDescriptorProto.package_ = this.package_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                this.dependency_.m7800();
                descriptorProtos$FileDescriptorProto.dependency_ = this.dependency_;
            }
            if ((i2 & 8) != 0) {
                ((AbstractC3547) this.publicDependency_).m7800();
                descriptorProtos$FileDescriptorProto.publicDependency_ = this.publicDependency_;
            }
            if ((i2 & 16) != 0) {
                ((AbstractC3547) this.weakDependency_).m7800();
                descriptorProtos$FileDescriptorProto.weakDependency_ = this.weakDependency_;
            }
            if ((i2 & 32) != 0) {
                this.optionDependency_.m7800();
                descriptorProtos$FileDescriptorProto.optionDependency_ = this.optionDependency_;
            }
            if ((i2 & 1024) != 0) {
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$FileDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$FileOptions) c3341.m7397();
                i |= 4;
            }
            if ((i2 & 2048) != 0) {
                C3341 c33412 = this.sourceCodeInfoBuilder_;
                descriptorProtos$FileDescriptorProto.sourceCodeInfo_ = c33412 == null ? this.sourceCodeInfo_ : (DescriptorProtos$SourceCodeInfo) c33412.m7397();
                i |= 8;
            }
            if ((i2 & 4096) != 0) {
                descriptorProtos$FileDescriptorProto.syntax_ = this.syntax_;
                i |= 16;
            }
            if ((i2 & 8192) != 0) {
                descriptorProtos$FileDescriptorProto.edition_ = this.edition_;
                i |= 32;
            }
            DescriptorProtos$FileDescriptorProto.access$2576(descriptorProtos$FileDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.messageType_ = Collections.unmodifiableList(this.messageType_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$FileDescriptorProto.messageType_ = this.messageType_;
            } else {
                descriptorProtos$FileDescriptorProto.messageType_ = c3362.m7485();
            }
            C3362 c33622 = this.enumTypeBuilder_;
            if (c33622 == null) {
                if ((this.bitField0_ & 128) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -129;
                }
                descriptorProtos$FileDescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$FileDescriptorProto.enumType_ = c33622.m7485();
            }
            C3362 c33623 = this.serviceBuilder_;
            if (c33623 == null) {
                if ((this.bitField0_ & 256) != 0) {
                    this.service_ = Collections.unmodifiableList(this.service_);
                    this.bitField0_ &= -257;
                }
                descriptorProtos$FileDescriptorProto.service_ = this.service_;
            } else {
                descriptorProtos$FileDescriptorProto.service_ = c33623.m7485();
            }
            C3362 c33624 = this.extensionBuilder_;
            if (c33624 != null) {
                descriptorProtos$FileDescriptorProto.extension_ = c33624.m7485();
                return;
            }
            if ((this.bitField0_ & 512) != 0) {
                this.extension_ = Collections.unmodifiableList(this.extension_);
                this.bitField0_ &= -513;
            }
            descriptorProtos$FileDescriptorProto.extension_ = this.extension_;
        }

        private void ensureDependencyIsMutable() {
            if (!this.dependency_.f11194) {
                this.dependency_ = new C3383(this.dependency_);
            }
            this.bitField0_ |= 4;
        }

        private void ensureEnumTypeIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
                this.enumType_ = new ArrayList(this.enumType_);
                this.bitField0_ |= 128;
            }
        }

        private void ensureExtensionIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
                this.extension_ = new ArrayList(this.extension_);
                this.bitField0_ |= 512;
            }
        }

        private void ensureMessageTypeIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.messageType_ = new ArrayList(this.messageType_);
                this.bitField0_ |= 64;
            }
        }

        private void ensureOptionDependencyIsMutable() {
            if (!this.optionDependency_.f11194) {
                this.optionDependency_ = new C3383(this.optionDependency_);
            }
            this.bitField0_ |= 32;
        }

        private void ensurePublicDependencyIsMutable() {
            InterfaceC3402 interfaceC3402 = this.publicDependency_;
            if (!((AbstractC3547) interfaceC3402).f11194) {
                this.publicDependency_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
            }
            this.bitField0_ |= 8;
        }

        private void ensureServiceIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.service_ = new ArrayList(this.service_);
                this.bitField0_ |= 256;
            }
        }

        private void ensureWeakDependencyIsMutable() {
            InterfaceC3402 interfaceC3402 = this.weakDependency_;
            if (!((AbstractC3547) interfaceC3402).f11194) {
                this.weakDependency_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
            }
            this.bitField0_ |= 16;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11425;
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

        private C3362 internalGetMessageTypeFieldBuilder() {
            if (this.messageTypeBuilder_ == null) {
                this.messageTypeBuilder_ = new C3362(this.messageType_, getParentForChildren(), isClean());
                this.messageType_ = null;
            }
            return this.messageTypeBuilder_;
        }

        private C3341 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3362 internalGetServiceFieldBuilder() {
            if (this.serviceBuilder_ == null) {
                this.serviceBuilder_ = new C3362(this.service_, getParentForChildren(), isClean());
                this.service_ = null;
            }
            return this.serviceBuilder_;
        }

        private C3341 internalGetSourceCodeInfoFieldBuilder() {
            if (this.sourceCodeInfoBuilder_ == null) {
                this.sourceCodeInfoBuilder_ = new C3341(getSourceCodeInfo(), getParentForChildren(), isClean());
                this.sourceCodeInfo_ = null;
            }
            return this.sourceCodeInfoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetMessageTypeFieldBuilder();
                internalGetEnumTypeFieldBuilder();
                internalGetServiceFieldBuilder();
                internalGetExtensionFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceCodeInfoFieldBuilder();
            }
        }

        public C3279 addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.dependency_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3279 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
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

        public C3279 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
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

        public C3279 addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureMessageTypeIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.messageType_);
            onChanged();
            return this;
        }

        public C3279 addAllOptionDependency(Iterable<String> iterable) {
            ensureOptionDependencyIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.optionDependency_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3279 addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.publicDependency_);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3279 addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureServiceIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.service_);
            onChanged();
            return this;
        }

        public C3279 addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.weakDependency_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3279 addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.m7506(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3279 addDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureDependencyIsMutable();
            this.dependency_.mo7508(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3279 addEnumType(DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
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

        public C3279 addExtension(DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
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

        public C3279 addMessageType(DescriptorProtos$DescriptorProto.C3263 c3263) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3263.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.add(c3263.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$DescriptorProto.C3263 addMessageTypeBuilder() {
            return (DescriptorProtos$DescriptorProto.C3263) internalGetMessageTypeFieldBuilder().m7473(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C3279 addOptionDependency(String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.m7506(str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3279 addOptionDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.mo7508(byteString);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3279 addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            ((C3612) this.publicDependency_).m7825(i);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3279 addService(DescriptorProtos$ServiceDescriptorProto.C3289 c3289) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3289.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.add(c3289.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$ServiceDescriptorProto.C3289 addServiceBuilder() {
            return (DescriptorProtos$ServiceDescriptorProto.C3289) internalGetServiceFieldBuilder().m7473(DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C3279 addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            ((C3612) this.weakDependency_).m7825(i);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileDescriptorProto build() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FileDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileDescriptorProto buildPartial() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3279 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.package_ = "";
            C3383 c3383 = C3383.f11032;
            this.dependency_ = c3383;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3383;
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                this.messageType_ = Collections.EMPTY_LIST;
            } else {
                this.messageType_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -65;
            C3362 c33622 = this.enumTypeBuilder_;
            if (c33622 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -129;
            C3362 c33623 = this.serviceBuilder_;
            if (c33623 == null) {
                this.service_ = Collections.EMPTY_LIST;
            } else {
                this.service_ = null;
                c33623.m7484();
            }
            this.bitField0_ &= -257;
            C3362 c33624 = this.extensionBuilder_;
            if (c33624 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c33624.m7484();
            }
            this.bitField0_ &= -513;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            this.sourceCodeInfo_ = null;
            C3341 c33412 = this.sourceCodeInfoBuilder_;
            if (c33412 != null) {
                c33412.f10966 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            this.syntax_ = "";
            this.edition_ = 0;
            return this;
        }

        public C3279 clearDependency() {
            this.dependency_ = C3383.f11032;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3279 clearEdition() {
            this.bitField0_ &= -8193;
            this.edition_ = 0;
            onChanged();
            return this;
        }

        public C3279 clearEnumType() {
            C3362 c3362 = this.enumTypeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3279 clearExtension() {
            C3362 c3362 = this.extensionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3279 clearMessageType() {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.messageType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3279 clearName() {
            this.name_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3279 clearOptionDependency() {
            this.optionDependency_ = C3383.f11032;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3279 clearOptions() {
            this.bitField0_ &= -1025;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3279 clearPackage() {
            this.package_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getPackage();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3279 clearPublicDependency() {
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3279 clearService() {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.service_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3279 clearSourceCodeInfo() {
            this.bitField0_ &= -2049;
            this.sourceCodeInfo_ = null;
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3279 clearSyntax() {
            this.syntax_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getSyntax();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public C3279 clearWeakDependency() {
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public ByteString getDependencyBytes(int i) {
            return this.dependency_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getDependencyCount() {
            return this.dependency_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3376 getDependencyList() {
            this.dependency_.m7800();
            return this.dependency_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11425;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3492
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

        @Override // com.google.protobuf.InterfaceC3492
        public int getEnumTypeCount() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? this.enumType_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.enumType_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3572 getEnumTypeOrBuilder(int i) {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 == null ? this.enumType_.get(i) : (InterfaceC3572) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<? extends InterfaceC3572> getEnumTypeOrBuilderList() {
            C3362 c3362 = this.enumTypeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC3492
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

        @Override // com.google.protobuf.InterfaceC3492
        public int getExtensionCount() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? this.extension_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.extension_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3504 getExtensionOrBuilder(int i) {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 == null ? this.extension_.get(i) : (InterfaceC3504) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<? extends InterfaceC3504> getExtensionOrBuilderList() {
            C3362 c3362 = this.extensionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public DescriptorProtos$DescriptorProto getMessageType(int i) {
            C3362 c3362 = this.messageTypeBuilder_;
            return c3362 == null ? this.messageType_.get(i) : (DescriptorProtos$DescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$DescriptorProto.C3263 getMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C3263) internalGetMessageTypeFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$DescriptorProto.C3263> getMessageTypeBuilderList() {
            return internalGetMessageTypeFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getMessageTypeCount() {
            C3362 c3362 = this.messageTypeBuilder_;
            return c3362 == null ? this.messageType_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
            C3362 c3362 = this.messageTypeBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.messageType_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3571 getMessageTypeOrBuilder(int i) {
            C3362 c3362 = this.messageTypeBuilder_;
            return c3362 == null ? this.messageType_.get(i) : (InterfaceC3571) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<? extends InterfaceC3571> getMessageTypeOrBuilderList() {
            C3362 c3362 = this.messageTypeBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.messageType_);
        }

        @Override // com.google.protobuf.InterfaceC3492
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

        @Override // com.google.protobuf.InterfaceC3492
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public String getOptionDependency(int i) {
            return this.optionDependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public ByteString getOptionDependencyBytes(int i) {
            return this.optionDependency_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getOptionDependencyCount() {
            return this.optionDependency_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3376 getOptionDependencyList() {
            this.optionDependency_.m7800();
            return this.optionDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public DescriptorProtos$FileOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$FileOptions) c3341.m7393();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        public DescriptorProtos$FileOptions.C3281 getOptionsBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (DescriptorProtos$FileOptions.C3281) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3494 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3494) c3341.m7392();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public String getPackage() {
            Object obj = this.package_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.package_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public ByteString getPackageBytes() {
            Object obj = this.package_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.package_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getPublicDependency(int i) {
            return ((C3612) this.publicDependency_).m7827(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getPublicDependencyCount() {
            return ((C3612) this.publicDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<Integer> getPublicDependencyList() {
            ((AbstractC3547) this.publicDependency_).m7800();
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public DescriptorProtos$ServiceDescriptorProto getService(int i) {
            C3362 c3362 = this.serviceBuilder_;
            return c3362 == null ? this.service_.get(i) : (DescriptorProtos$ServiceDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$ServiceDescriptorProto.C3289 getServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C3289) internalGetServiceFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$ServiceDescriptorProto.C3289> getServiceBuilderList() {
            return internalGetServiceFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getServiceCount() {
            C3362 c3362 = this.serviceBuilder_;
            return c3362 == null ? this.service_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
            C3362 c3362 = this.serviceBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.service_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3489 getServiceOrBuilder(int i) {
            C3362 c3362 = this.serviceBuilder_;
            return c3362 == null ? this.service_.get(i) : (InterfaceC3489) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<? extends InterfaceC3489> getServiceOrBuilderList() {
            C3362 c3362 = this.serviceBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.service_);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$SourceCodeInfo) c3341.m7393();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        public DescriptorProtos$SourceCodeInfo.C3292 getSourceCodeInfoBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$SourceCodeInfo.C3292) internalGetSourceCodeInfoFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public InterfaceC3649 getSourceCodeInfoOrBuilder() {
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 != null) {
                return (InterfaceC3649) c3341.m7392();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public String getSyntax() {
            Object obj = this.syntax_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.syntax_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public ByteString getSyntaxBytes() {
            Object obj = this.syntax_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.syntax_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getWeakDependency(int i) {
            return ((C3612) this.weakDependency_).m7827(i);
        }

        @Override // com.google.protobuf.InterfaceC3492
        public int getWeakDependencyCount() {
            return ((C3612) this.weakDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC3492
        public List<Integer> getWeakDependencyList() {
            ((AbstractC3547) this.weakDependency_).m7800();
            return this.weakDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasEdition() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasOptions() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3492
        public boolean hasSyntax() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11424;
            c3618.m7840(DescriptorProtos$FileDescriptorProto.class, C3279.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getMessageTypeCount(); i++) {
                if (!getMessageType(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
                if (!getEnumType(i2).isInitialized()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < getServiceCount(); i3++) {
                if (!getService(i3).isInitialized()) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < getExtensionCount(); i4++) {
                if (!getExtension(i4).isInitialized()) {
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                return !hasSourceCodeInfo() || getSourceCodeInfo().isInitialized();
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C3279 mergeFrom(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            if (descriptorProtos$FileDescriptorProto == DescriptorProtos$FileDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$FileDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$FileDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$FileDescriptorProto.hasPackage()) {
                this.package_ = descriptorProtos$FileDescriptorProto.package_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.dependency_.isEmpty()) {
                if (this.dependency_.isEmpty()) {
                    this.dependency_ = descriptorProtos$FileDescriptorProto.dependency_;
                    this.bitField0_ |= 4;
                } else {
                    ensureDependencyIsMutable();
                    this.dependency_.addAll(descriptorProtos$FileDescriptorProto.dependency_);
                }
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.publicDependency_.isEmpty()) {
                if (this.publicDependency_.isEmpty()) {
                    InterfaceC3394 interfaceC3394 = descriptorProtos$FileDescriptorProto.publicDependency_;
                    this.publicDependency_ = interfaceC3394;
                    ((AbstractC3547) interfaceC3394).m7800();
                    this.bitField0_ |= 8;
                } else {
                    ensurePublicDependencyIsMutable();
                    ((C3612) this.publicDependency_).addAll(descriptorProtos$FileDescriptorProto.publicDependency_);
                }
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.weakDependency_.isEmpty()) {
                if (this.weakDependency_.isEmpty()) {
                    InterfaceC3394 interfaceC33942 = descriptorProtos$FileDescriptorProto.weakDependency_;
                    this.weakDependency_ = interfaceC33942;
                    ((AbstractC3547) interfaceC33942).m7800();
                    this.bitField0_ |= 16;
                } else {
                    ensureWeakDependencyIsMutable();
                    ((C3612) this.weakDependency_).addAll(descriptorProtos$FileDescriptorProto.weakDependency_);
                }
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.optionDependency_.isEmpty()) {
                if (this.optionDependency_.isEmpty()) {
                    this.optionDependency_ = descriptorProtos$FileDescriptorProto.optionDependency_;
                    this.bitField0_ |= 32;
                } else {
                    ensureOptionDependencyIsMutable();
                    this.optionDependency_.addAll(descriptorProtos$FileDescriptorProto.optionDependency_);
                }
                onChanged();
            }
            if (this.messageTypeBuilder_ == null) {
                if (!descriptorProtos$FileDescriptorProto.messageType_.isEmpty()) {
                    if (this.messageType_.isEmpty()) {
                        this.messageType_ = descriptorProtos$FileDescriptorProto.messageType_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureMessageTypeIsMutable();
                        this.messageType_.addAll(descriptorProtos$FileDescriptorProto.messageType_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileDescriptorProto.messageType_.isEmpty()) {
                boolean zIsEmpty = this.messageTypeBuilder_.f11007.isEmpty();
                C3362 c3362 = this.messageTypeBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.messageTypeBuilder_ = null;
                    this.messageType_ = descriptorProtos$FileDescriptorProto.messageType_;
                    this.bitField0_ &= -65;
                    this.messageTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMessageTypeFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$FileDescriptorProto.messageType_);
                }
            }
            if (this.enumTypeBuilder_ == null) {
                if (!descriptorProtos$FileDescriptorProto.enumType_.isEmpty()) {
                    if (this.enumType_.isEmpty()) {
                        this.enumType_ = descriptorProtos$FileDescriptorProto.enumType_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureEnumTypeIsMutable();
                        this.enumType_.addAll(descriptorProtos$FileDescriptorProto.enumType_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileDescriptorProto.enumType_.isEmpty()) {
                boolean zIsEmpty2 = this.enumTypeBuilder_.f11007.isEmpty();
                C3362 c33622 = this.enumTypeBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$FileDescriptorProto.enumType_;
                    this.bitField0_ &= -129;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c33622.m7475(descriptorProtos$FileDescriptorProto.enumType_);
                }
            }
            if (this.serviceBuilder_ == null) {
                if (!descriptorProtos$FileDescriptorProto.service_.isEmpty()) {
                    if (this.service_.isEmpty()) {
                        this.service_ = descriptorProtos$FileDescriptorProto.service_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureServiceIsMutable();
                        this.service_.addAll(descriptorProtos$FileDescriptorProto.service_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileDescriptorProto.service_.isEmpty()) {
                boolean zIsEmpty3 = this.serviceBuilder_.f11007.isEmpty();
                C3362 c33623 = this.serviceBuilder_;
                if (zIsEmpty3) {
                    c33623.f11008 = null;
                    this.serviceBuilder_ = null;
                    this.service_ = descriptorProtos$FileDescriptorProto.service_;
                    this.bitField0_ &= -257;
                    this.serviceBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetServiceFieldBuilder() : null;
                } else {
                    c33623.m7475(descriptorProtos$FileDescriptorProto.service_);
                }
            }
            if (this.extensionBuilder_ == null) {
                if (!descriptorProtos$FileDescriptorProto.extension_.isEmpty()) {
                    if (this.extension_.isEmpty()) {
                        this.extension_ = descriptorProtos$FileDescriptorProto.extension_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureExtensionIsMutable();
                        this.extension_.addAll(descriptorProtos$FileDescriptorProto.extension_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileDescriptorProto.extension_.isEmpty()) {
                boolean zIsEmpty4 = this.extensionBuilder_.f11007.isEmpty();
                C3362 c33624 = this.extensionBuilder_;
                if (zIsEmpty4) {
                    c33624.f11008 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$FileDescriptorProto.extension_;
                    this.bitField0_ &= -513;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c33624.m7475(descriptorProtos$FileDescriptorProto.extension_);
                }
            }
            if (descriptorProtos$FileDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$FileDescriptorProto.getOptions());
            }
            if (descriptorProtos$FileDescriptorProto.hasSourceCodeInfo()) {
                mergeSourceCodeInfo(descriptorProtos$FileDescriptorProto.getSourceCodeInfo());
            }
            if (descriptorProtos$FileDescriptorProto.hasSyntax()) {
                this.syntax_ = descriptorProtos$FileDescriptorProto.syntax_;
                this.bitField0_ |= 4096;
                onChanged();
            }
            if (descriptorProtos$FileDescriptorProto.hasEdition()) {
                setEdition(descriptorProtos$FileDescriptorProto.getEdition());
            }
            mergeUnknownFields(descriptorProtos$FileDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C3279 mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            DescriptorProtos$FileOptions descriptorProtos$FileOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$FileOptions);
            } else if ((this.bitField0_ & 1024) == 0 || (descriptorProtos$FileOptions2 = this.options_) == null || descriptorProtos$FileOptions2 == DescriptorProtos$FileOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$FileOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$FileOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 1024;
                onChanged();
            }
            return this;
        }

        public C3279 mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2;
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$SourceCodeInfo);
            } else if ((this.bitField0_ & 2048) == 0 || (descriptorProtos$SourceCodeInfo2 = this.sourceCodeInfo_) == null || descriptorProtos$SourceCodeInfo2 == DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
                this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
            } else {
                getSourceCodeInfoBuilder().mergeFrom(descriptorProtos$SourceCodeInfo);
            }
            if (this.sourceCodeInfo_ != null) {
                this.bitField0_ |= 2048;
                onChanged();
            }
            return this;
        }

        public C3279 removeEnumType(int i) {
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

        public C3279 removeExtension(int i) {
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

        public C3279 removeMessageType(int i) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
            onChanged();
            return this;
        }

        public C3279 removeService(int i) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureServiceIsMutable();
            this.service_.remove(i);
            onChanged();
            return this;
        }

        public C3279 setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3279 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 8192;
            this.edition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C3279 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
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

        public C3279 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
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

        public C3279 setMessageType(int i, DescriptorProtos$DescriptorProto.C3263 c3263) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3263.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, c3263.build());
            onChanged();
            return this;
        }

        public C3279 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3279 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3279 setOptionDependency(int i, String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.set(i, str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3279 setOptions(DescriptorProtos$FileOptions.C3281 c3281) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3281.build();
            } else {
                c3341.m7400(c3281.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C3279 setPackage(String str) {
            str.getClass();
            this.package_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3279 setPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.package_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3279 setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            ((C3612) this.publicDependency_).m7828(i, i2);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3279 setService(int i, DescriptorProtos$ServiceDescriptorProto.C3289 c3289) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3289.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.set(i, c3289.build());
            onChanged();
            return this;
        }

        public C3279 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo.C3292 c3292) {
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 == null) {
                this.sourceCodeInfo_ = c3292.build();
            } else {
                c3341.m7400(c3292.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3279 setSyntax(String str) {
            str.getClass();
            this.syntax_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3279 setSyntaxBytes(ByteString byteString) {
            byteString.getClass();
            this.syntax_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3279 setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            ((C3612) this.weakDependency_).m7828(i, i2);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C3265 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3265) internalGetEnumTypeFieldBuilder().m7474(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3275 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3275) internalGetExtensionFieldBuilder().m7474(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$DescriptorProto.C3263 addMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C3263) internalGetMessageTypeFieldBuilder().m7474(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$ServiceDescriptorProto.C3289 addServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C3289) internalGetServiceFieldBuilder().m7474(i, DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C3279 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3279 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3279 addMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3279 addService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3279 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3279 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3279 setMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3279 setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$FileOptions.getClass();
                this.options_ = descriptorProtos$FileOptions;
            } else {
                c3341.m7400(descriptorProtos$FileOptions);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C3279 setService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.set(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3279 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C3341 c3341 = this.sourceCodeInfoBuilder_;
            if (c3341 == null) {
                descriptorProtos$SourceCodeInfo.getClass();
                this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
            } else {
                c3341.m7400(descriptorProtos$SourceCodeInfo);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3279 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3279 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3279 addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$DescriptorProto);
            return this;
        }

        public C3279 addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3279 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3265 c3265) {
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

        public C3279 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C3275 c3275) {
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

        public C3279 addMessageType(int i, DescriptorProtos$DescriptorProto.C3263 c3263) {
            C3362 c3362 = this.messageTypeBuilder_;
            if (c3362 == null) {
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, c3263.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3263.build());
            return this;
        }

        public C3279 addService(int i, DescriptorProtos$ServiceDescriptorProto.C3289 c3289) {
            C3362 c3362 = this.serviceBuilder_;
            if (c3362 == null) {
                ensureServiceIsMutable();
                this.service_.add(i, c3289.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3289.build());
            return this;
        }

        private C3279(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.package_ = "";
            C3383 c3383 = C3383.f11032;
            this.dependency_ = c3383;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3383;
            List list = Collections.EMPTY_LIST;
            this.messageType_ = list;
            this.enumType_ = list;
            this.service_ = list;
            this.extension_ = list;
            this.syntax_ = "";
            this.edition_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3279 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FileDescriptorProto) {
                return mergeFrom((DescriptorProtos$FileDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3279 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                this.package_ = abstractC3473.mo7732();
                                this.bitField0_ |= 2;
                                break;
                            case 26:
                                ByteString byteStringMo7732 = abstractC3473.mo7732();
                                ensureDependencyIsMutable();
                                this.dependency_.mo7508(byteStringMo7732);
                                break;
                            case 34:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC3473.mo7728(DescriptorProtos$DescriptorProto.parser(), c3696);
                                C3362 c3362 = this.messageTypeBuilder_;
                                if (c3362 == null) {
                                    ensureMessageTypeIsMutable();
                                    this.messageType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 42:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC3473.mo7728(DescriptorProtos$EnumDescriptorProto.parser(), c3696);
                                C3362 c33622 = this.enumTypeBuilder_;
                                if (c33622 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c33622.m7471(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 50:
                                DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto) abstractC3473.mo7728(DescriptorProtos$ServiceDescriptorProto.parser(), c3696);
                                C3362 c33623 = this.serviceBuilder_;
                                if (c33623 == null) {
                                    ensureServiceIsMutable();
                                    this.service_.add(descriptorProtos$ServiceDescriptorProto);
                                } else {
                                    c33623.m7471(descriptorProtos$ServiceDescriptorProto);
                                }
                                break;
                            case 58:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FieldDescriptorProto.parser(), c3696);
                                C3362 c33624 = this.extensionBuilder_;
                                if (c33624 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c33624.m7471(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 66:
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 1024;
                                break;
                            case 74:
                                abstractC3473.mo7729(internalGetSourceCodeInfoFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 2048;
                                break;
                            case 80:
                                int iMo7730 = abstractC3473.mo7730();
                                ensurePublicDependencyIsMutable();
                                ((C3612) this.publicDependency_).m7825(iMo7730);
                                break;
                            case 82:
                                int iMo7740 = abstractC3473.mo7740(abstractC3473.mo7714());
                                ensurePublicDependencyIsMutable();
                                while (abstractC3473.mo7723() > 0) {
                                    ((C3612) this.publicDependency_).m7825(abstractC3473.mo7730());
                                }
                                abstractC3473.mo7739(iMo7740);
                                break;
                            case 88:
                                int iMo77302 = abstractC3473.mo7730();
                                ensureWeakDependencyIsMutable();
                                ((C3612) this.weakDependency_).m7825(iMo77302);
                                break;
                            case 90:
                                int iMo77402 = abstractC3473.mo7740(abstractC3473.mo7714());
                                ensureWeakDependencyIsMutable();
                                while (abstractC3473.mo7723() > 0) {
                                    ((C3612) this.weakDependency_).m7825(abstractC3473.mo7730());
                                }
                                abstractC3473.mo7739(iMo77402);
                                break;
                            case 98:
                                this.syntax_ = abstractC3473.mo7732();
                                this.bitField0_ |= 4096;
                                break;
                            case 112:
                                int iMo7737 = abstractC3473.mo7737();
                                if (DescriptorProtos$Edition.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(14, iMo7737);
                                } else {
                                    this.edition_ = iMo7737;
                                    this.bitField0_ |= 8192;
                                }
                                break;
                            case 122:
                                ByteString byteStringMo77322 = abstractC3473.mo7732();
                                ensureOptionDependencyIsMutable();
                                this.optionDependency_.mo7508(byteStringMo77322);
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

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3376 getDependencyList() {
        return this.dependency_;
    }

    @Override // com.google.protobuf.InterfaceC3492
    public InterfaceC3376 getOptionDependencyList() {
        return this.optionDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3279 newBuilderForType() {
        return newBuilder();
    }

    public static C3279 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private DescriptorProtos$FileDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.package_ = "";
        C3383 c3383 = C3383.f11032;
        this.dependency_ = c3383;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3383;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

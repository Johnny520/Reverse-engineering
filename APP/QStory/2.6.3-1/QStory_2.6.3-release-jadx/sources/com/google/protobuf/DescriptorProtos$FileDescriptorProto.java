package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessage implements InterfaceC4325 {
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
    private static final InterfaceC4207 PARSER;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private C4216 dependency_;
    private int edition_;
    private List<DescriptorProtos$EnumDescriptorProto> enumType_;
    private List<DescriptorProtos$FieldDescriptorProto> extension_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$DescriptorProto> messageType_;
    private volatile Object name_;
    private C4216 optionDependency_;
    private DescriptorProtos$FileOptions options_;
    private volatile Object package_;
    private InterfaceC4227 publicDependency_;
    private List<DescriptorProtos$ServiceDescriptorProto> service_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private volatile Object syntax_;
    private InterfaceC4227 weakDependency_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorProto();
        PARSER = new C4346();
    }

    private DescriptorProtos$FileDescriptorProto() {
        this.name_ = "";
        this.package_ = "";
        C4216 c4216 = C4216.f11382;
        this.dependency_ = c4216;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c4216;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.package_ = "";
        this.dependency_ = c4216;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c4216;
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11775;
    }

    public static C4112 newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.InterfaceC4325
    public String getDependency(int i) {
        return this.dependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public ByteString getDependencyBytes(int i) {
        return this.dependency_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getDependencyCount() {
        return this.dependency_.f11383.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11775;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$Edition getEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4405 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<? extends InterfaceC4405> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4337 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<? extends InterfaceC4337> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$DescriptorProto getMessageType(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4404 getMessageTypeOrBuilder(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<? extends InterfaceC4404> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC4325
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

    @Override // com.google.protobuf.InterfaceC4325
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public String getOptionDependency(int i) {
        return this.optionDependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public ByteString getOptionDependencyBytes(int i) {
        return this.optionDependency_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getOptionDependencyCount() {
        return this.optionDependency_.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4327 getOptionsOrBuilder() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC4325
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

    @Override // com.google.protobuf.InterfaceC4325
    public ByteString getPackageBytes() {
        Object obj = this.package_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.package_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getPublicDependency(int i) {
        return ((C4445) this.publicDependency_).m8373(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getPublicDependencyCount() {
        return ((C4445) this.publicDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
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
        for (int i2 = 0; i2 < this.dependency_.f11383.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.dependency_.f11383.get(i2));
        }
        int size = getDependencyList().size() + iComputeStringSize + iComputeStringSizeNoTag;
        int size2 = this.messageType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC4294.m8202(this.messageType_.get(i3));
        }
        int iM8202 = size + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM8202 += AbstractC4294.m8202(this.enumType_.get(i4));
        }
        int iM82022 = iM8202 + size3;
        int size4 = this.service_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM82022 += AbstractC4294.m8202(this.service_.get(i5));
        }
        int iM82023 = iM82022 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM82023 += AbstractC4294.m8202(this.extension_.get(i6));
        }
        int iM8198 = iM82023 + size5;
        if ((this.bitField0_ & 4) != 0) {
            iM8198 += AbstractC4294.m8198(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8198 += AbstractC4294.m8198(9, getSourceCodeInfo());
        }
        int i7 = 0;
        int iM8197 = 0;
        while (true) {
            if (i7 >= ((C4445) this.publicDependency_).f11597) {
                break;
            }
            iM8197 += AbstractC4294.m8197(((C4445) r4).m8373(i7));
            i7++;
        }
        int size6 = getPublicDependencyList().size() + iM8198 + iM8197;
        int i8 = 0;
        int iM81972 = 0;
        while (true) {
            if (i8 >= ((C4445) this.weakDependency_).f11597) {
                break;
            }
            iM81972 += AbstractC4294.m8197(((C4445) r4).m8373(i8));
            i8++;
        }
        int size7 = getWeakDependencyList().size() + size6 + iM81972;
        if ((this.bitField0_ & 16) != 0) {
            size7 += GeneratedMessage.computeStringSize(12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            size7 += AbstractC4294.m8191(14, this.edition_);
        }
        int iComputeStringSizeNoTag2 = 0;
        for (int i9 = 0; i9 < this.optionDependency_.f11383.size(); i9++) {
            iComputeStringSizeNoTag2 += GeneratedMessage.computeStringSizeNoTag(this.optionDependency_.f11383.get(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getOptionDependencyList().size() + size7 + iComputeStringSizeNoTag2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$ServiceDescriptorProto getService(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4322 getServiceOrBuilder(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<? extends InterfaceC4322> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4482 getSourceCodeInfoOrBuilder() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC4325
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

    @Override // com.google.protobuf.InterfaceC4325
    public ByteString getSyntaxBytes() {
        Object obj = this.syntax_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.syntax_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getWeakDependency(int i) {
        return ((C4445) this.weakDependency_).m8373(i);
    }

    @Override // com.google.protobuf.InterfaceC4325
    public int getWeakDependencyCount() {
        return ((C4445) this.weakDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC4325
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
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
        if (hasPackage()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getPackage().hashCode();
        }
        if (getDependencyCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getDependencyList().hashCode();
        }
        if (getPublicDependencyCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 10, 53) + getPublicDependencyList().hashCode();
        }
        if (getWeakDependencyCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 11, 53) + getWeakDependencyList().hashCode();
        }
        if (getOptionDependencyCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 15, 53) + getOptionDependencyList().hashCode();
        }
        if (getMessageTypeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getMessageTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + getEnumTypeList().hashCode();
        }
        if (getServiceCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + getServiceList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + getExtensionList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasSourceCodeInfo()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 9, 53) + getSourceCodeInfo().hashCode();
        }
        if (hasSyntax()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 12, 53) + getSyntax().hashCode();
        }
        if (hasEdition()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 14, 53) + this.edition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11774;
        c4451.m8386(DescriptorProtos$FileDescriptorProto.class, C4112.class);
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

    @Override // com.google.protobuf.AbstractC4365
    public C4112 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4112(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4112 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4112() : new C4112().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC4294, 2, this.package_);
        }
        for (int i = 0; i < this.dependency_.f11383.size(); i++) {
            GeneratedMessage.writeString(abstractC4294, 3, this.dependency_.f11383.get(i));
        }
        for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
            abstractC4294.mo8208(4, this.messageType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC4294.mo8208(5, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.service_.size(); i4++) {
            abstractC4294.mo8208(6, this.service_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC4294.mo8208(7, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8208(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8208(9, getSourceCodeInfo());
        }
        int i6 = 0;
        while (true) {
            C4445 c4445 = (C4445) this.publicDependency_;
            if (i6 >= c4445.f11597) {
                break;
            }
            abstractC4294.mo8210(10, c4445.m8373(i6));
            i6++;
        }
        int i7 = 0;
        while (true) {
            C4445 c44452 = (C4445) this.weakDependency_;
            if (i7 >= c44452.f11597) {
                break;
            }
            abstractC4294.mo8210(11, c44452.m8373(i7));
            i7++;
        }
        if ((this.bitField0_ & 16) != 0) {
            GeneratedMessage.writeString(abstractC4294, 12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC4294.mo8210(14, this.edition_);
        }
        for (int i8 = 0; i8 < this.optionDependency_.f11383.size(); i8++) {
            GeneratedMessage.writeString(abstractC4294, 15, this.optionDependency_.f11383.get(i8));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4112 extends GeneratedMessage.AbstractC4137 implements InterfaceC4325 {
        private int bitField0_;
        private C4216 dependency_;
        private int edition_;
        private C4195 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C4195 extensionBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C4195 messageTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> messageType_;
        private Object name_;
        private C4216 optionDependency_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$FileOptions options_;
        private Object package_;
        private InterfaceC4227 publicDependency_;
        private C4195 serviceBuilder_;
        private List<DescriptorProtos$ServiceDescriptorProto> service_;
        private C4174 sourceCodeInfoBuilder_;
        private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
        private Object syntax_;
        private InterfaceC4227 weakDependency_;

        private C4112() {
            this.name_ = "";
            this.package_ = "";
            C4216 c4216 = C4216.f11382;
            this.dependency_ = c4216;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c4216;
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
                this.dependency_.m8346();
                descriptorProtos$FileDescriptorProto.dependency_ = this.dependency_;
            }
            if ((i2 & 8) != 0) {
                ((AbstractC4380) this.publicDependency_).m8346();
                descriptorProtos$FileDescriptorProto.publicDependency_ = this.publicDependency_;
            }
            if ((i2 & 16) != 0) {
                ((AbstractC4380) this.weakDependency_).m8346();
                descriptorProtos$FileDescriptorProto.weakDependency_ = this.weakDependency_;
            }
            if ((i2 & 32) != 0) {
                this.optionDependency_.m8346();
                descriptorProtos$FileDescriptorProto.optionDependency_ = this.optionDependency_;
            }
            if ((i2 & 1024) != 0) {
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$FileDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$FileOptions) c4174.m7943();
                i |= 4;
            }
            if ((i2 & 2048) != 0) {
                C4174 c41742 = this.sourceCodeInfoBuilder_;
                descriptorProtos$FileDescriptorProto.sourceCodeInfo_ = c41742 == null ? this.sourceCodeInfo_ : (DescriptorProtos$SourceCodeInfo) c41742.m7943();
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
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.messageType_ = Collections.unmodifiableList(this.messageType_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$FileDescriptorProto.messageType_ = this.messageType_;
            } else {
                descriptorProtos$FileDescriptorProto.messageType_ = c4195.m8031();
            }
            C4195 c41952 = this.enumTypeBuilder_;
            if (c41952 == null) {
                if ((this.bitField0_ & 128) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -129;
                }
                descriptorProtos$FileDescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$FileDescriptorProto.enumType_ = c41952.m8031();
            }
            C4195 c41953 = this.serviceBuilder_;
            if (c41953 == null) {
                if ((this.bitField0_ & 256) != 0) {
                    this.service_ = Collections.unmodifiableList(this.service_);
                    this.bitField0_ &= -257;
                }
                descriptorProtos$FileDescriptorProto.service_ = this.service_;
            } else {
                descriptorProtos$FileDescriptorProto.service_ = c41953.m8031();
            }
            C4195 c41954 = this.extensionBuilder_;
            if (c41954 != null) {
                descriptorProtos$FileDescriptorProto.extension_ = c41954.m8031();
                return;
            }
            if ((this.bitField0_ & 512) != 0) {
                this.extension_ = Collections.unmodifiableList(this.extension_);
                this.bitField0_ &= -513;
            }
            descriptorProtos$FileDescriptorProto.extension_ = this.extension_;
        }

        private void ensureDependencyIsMutable() {
            if (!this.dependency_.f11544) {
                this.dependency_ = new C4216(this.dependency_);
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
            if (!this.optionDependency_.f11544) {
                this.optionDependency_ = new C4216(this.optionDependency_);
            }
            this.bitField0_ |= 32;
        }

        private void ensurePublicDependencyIsMutable() {
            InterfaceC4235 interfaceC4235 = this.publicDependency_;
            if (!((AbstractC4380) interfaceC4235).f11544) {
                this.publicDependency_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
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
            InterfaceC4235 interfaceC4235 = this.weakDependency_;
            if (!((AbstractC4380) interfaceC4235).f11544) {
                this.weakDependency_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
            }
            this.bitField0_ |= 16;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11775;
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

        private C4195 internalGetMessageTypeFieldBuilder() {
            if (this.messageTypeBuilder_ == null) {
                this.messageTypeBuilder_ = new C4195(this.messageType_, getParentForChildren(), isClean());
                this.messageType_ = null;
            }
            return this.messageTypeBuilder_;
        }

        private C4174 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C4195 internalGetServiceFieldBuilder() {
            if (this.serviceBuilder_ == null) {
                this.serviceBuilder_ = new C4195(this.service_, getParentForChildren(), isClean());
                this.service_ = null;
            }
            return this.serviceBuilder_;
        }

        private C4174 internalGetSourceCodeInfoFieldBuilder() {
            if (this.sourceCodeInfoBuilder_ == null) {
                this.sourceCodeInfoBuilder_ = new C4174(getSourceCodeInfo(), getParentForChildren(), isClean());
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

        public C4112 addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.dependency_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4112 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
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

        public C4112 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
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

        public C4112 addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureMessageTypeIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.messageType_);
            onChanged();
            return this;
        }

        public C4112 addAllOptionDependency(Iterable<String> iterable) {
            ensureOptionDependencyIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.optionDependency_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4112 addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.publicDependency_);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4112 addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureServiceIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.service_);
            onChanged();
            return this;
        }

        public C4112 addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.weakDependency_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4112 addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.m8052(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4112 addDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureDependencyIsMutable();
            this.dependency_.mo8054(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4112 addEnumType(DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
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

        public C4112 addExtension(DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
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

        public C4112 addMessageType(DescriptorProtos$DescriptorProto.C4096 c4096) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4096.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.add(c4096.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$DescriptorProto.C4096 addMessageTypeBuilder() {
            return (DescriptorProtos$DescriptorProto.C4096) internalGetMessageTypeFieldBuilder().m8019(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C4112 addOptionDependency(String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.m8052(str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4112 addOptionDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.mo8054(byteString);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4112 addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            ((C4445) this.publicDependency_).m8371(i);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4112 addService(DescriptorProtos$ServiceDescriptorProto.C4122 c4122) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4122.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.add(c4122.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$ServiceDescriptorProto.C4122 addServiceBuilder() {
            return (DescriptorProtos$ServiceDescriptorProto.C4122) internalGetServiceFieldBuilder().m8019(DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C4112 addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            ((C4445) this.weakDependency_).m8371(i);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FileDescriptorProto build() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FileDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FileDescriptorProto buildPartial() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4112 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.package_ = "";
            C4216 c4216 = C4216.f11382;
            this.dependency_ = c4216;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c4216;
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                this.messageType_ = Collections.EMPTY_LIST;
            } else {
                this.messageType_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -65;
            C4195 c41952 = this.enumTypeBuilder_;
            if (c41952 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -129;
            C4195 c41953 = this.serviceBuilder_;
            if (c41953 == null) {
                this.service_ = Collections.EMPTY_LIST;
            } else {
                this.service_ = null;
                c41953.m8030();
            }
            this.bitField0_ &= -257;
            C4195 c41954 = this.extensionBuilder_;
            if (c41954 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c41954.m8030();
            }
            this.bitField0_ &= -513;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            this.sourceCodeInfo_ = null;
            C4174 c41742 = this.sourceCodeInfoBuilder_;
            if (c41742 != null) {
                c41742.f11316 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            this.syntax_ = "";
            this.edition_ = 0;
            return this;
        }

        public C4112 clearDependency() {
            this.dependency_ = C4216.f11382;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4112 clearEdition() {
            this.bitField0_ &= -8193;
            this.edition_ = 0;
            onChanged();
            return this;
        }

        public C4112 clearEnumType() {
            C4195 c4195 = this.enumTypeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C4112 clearExtension() {
            C4195 c4195 = this.extensionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C4112 clearMessageType() {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.messageType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C4112 clearName() {
            this.name_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4112 clearOptionDependency() {
            this.optionDependency_ = C4216.f11382;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4112 clearOptions() {
            this.bitField0_ &= -1025;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4112 clearPackage() {
            this.package_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getPackage();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4112 clearPublicDependency() {
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C4112 clearService() {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.service_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C4112 clearSourceCodeInfo() {
            this.bitField0_ &= -2049;
            this.sourceCodeInfo_ = null;
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4112 clearSyntax() {
            this.syntax_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getSyntax();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public C4112 clearWeakDependency() {
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public ByteString getDependencyBytes(int i) {
            return this.dependency_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getDependencyCount() {
            return this.dependency_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4209 getDependencyList() {
            this.dependency_.m8346();
            return this.dependency_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11775;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4325
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

        @Override // com.google.protobuf.InterfaceC4325
        public int getEnumTypeCount() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? this.enumType_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.enumType_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4405 getEnumTypeOrBuilder(int i) {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 == null ? this.enumType_.get(i) : (InterfaceC4405) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<? extends InterfaceC4405> getEnumTypeOrBuilderList() {
            C4195 c4195 = this.enumTypeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC4325
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

        @Override // com.google.protobuf.InterfaceC4325
        public int getExtensionCount() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? this.extension_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.extension_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4337 getExtensionOrBuilder(int i) {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 == null ? this.extension_.get(i) : (InterfaceC4337) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<? extends InterfaceC4337> getExtensionOrBuilderList() {
            C4195 c4195 = this.extensionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public DescriptorProtos$DescriptorProto getMessageType(int i) {
            C4195 c4195 = this.messageTypeBuilder_;
            return c4195 == null ? this.messageType_.get(i) : (DescriptorProtos$DescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$DescriptorProto.C4096 getMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C4096) internalGetMessageTypeFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$DescriptorProto.C4096> getMessageTypeBuilderList() {
            return internalGetMessageTypeFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getMessageTypeCount() {
            C4195 c4195 = this.messageTypeBuilder_;
            return c4195 == null ? this.messageType_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
            C4195 c4195 = this.messageTypeBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.messageType_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4404 getMessageTypeOrBuilder(int i) {
            C4195 c4195 = this.messageTypeBuilder_;
            return c4195 == null ? this.messageType_.get(i) : (InterfaceC4404) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<? extends InterfaceC4404> getMessageTypeOrBuilderList() {
            C4195 c4195 = this.messageTypeBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.messageType_);
        }

        @Override // com.google.protobuf.InterfaceC4325
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

        @Override // com.google.protobuf.InterfaceC4325
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public String getOptionDependency(int i) {
            return this.optionDependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public ByteString getOptionDependencyBytes(int i) {
            return this.optionDependency_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getOptionDependencyCount() {
            return this.optionDependency_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4209 getOptionDependencyList() {
            this.optionDependency_.m8346();
            return this.optionDependency_;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public DescriptorProtos$FileOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FileOptions) c4174.m7939();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        public DescriptorProtos$FileOptions.C4114 getOptionsBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (DescriptorProtos$FileOptions.C4114) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4327 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4327) c4174.m7938();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        @Override // com.google.protobuf.InterfaceC4325
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

        @Override // com.google.protobuf.InterfaceC4325
        public ByteString getPackageBytes() {
            Object obj = this.package_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.package_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getPublicDependency(int i) {
            return ((C4445) this.publicDependency_).m8373(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getPublicDependencyCount() {
            return ((C4445) this.publicDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<Integer> getPublicDependencyList() {
            ((AbstractC4380) this.publicDependency_).m8346();
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public DescriptorProtos$ServiceDescriptorProto getService(int i) {
            C4195 c4195 = this.serviceBuilder_;
            return c4195 == null ? this.service_.get(i) : (DescriptorProtos$ServiceDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$ServiceDescriptorProto.C4122 getServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C4122) internalGetServiceFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$ServiceDescriptorProto.C4122> getServiceBuilderList() {
            return internalGetServiceFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getServiceCount() {
            C4195 c4195 = this.serviceBuilder_;
            return c4195 == null ? this.service_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
            C4195 c4195 = this.serviceBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.service_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4322 getServiceOrBuilder(int i) {
            C4195 c4195 = this.serviceBuilder_;
            return c4195 == null ? this.service_.get(i) : (InterfaceC4322) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<? extends InterfaceC4322> getServiceOrBuilderList() {
            C4195 c4195 = this.serviceBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.service_);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$SourceCodeInfo) c4174.m7939();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        public DescriptorProtos$SourceCodeInfo.C4125 getSourceCodeInfoBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$SourceCodeInfo.C4125) internalGetSourceCodeInfoFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public InterfaceC4482 getSourceCodeInfoOrBuilder() {
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 != null) {
                return (InterfaceC4482) c4174.m7938();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.InterfaceC4325
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

        @Override // com.google.protobuf.InterfaceC4325
        public ByteString getSyntaxBytes() {
            Object obj = this.syntax_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.syntax_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getWeakDependency(int i) {
            return ((C4445) this.weakDependency_).m8373(i);
        }

        @Override // com.google.protobuf.InterfaceC4325
        public int getWeakDependencyCount() {
            return ((C4445) this.weakDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC4325
        public List<Integer> getWeakDependencyList() {
            ((AbstractC4380) this.weakDependency_).m8346();
            return this.weakDependency_;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasEdition() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasOptions() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4325
        public boolean hasSyntax() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11774;
            c4451.m8386(DescriptorProtos$FileDescriptorProto.class, C4112.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
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
        public C4112 mergeFrom(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
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
                    InterfaceC4227 interfaceC4227 = descriptorProtos$FileDescriptorProto.publicDependency_;
                    this.publicDependency_ = interfaceC4227;
                    ((AbstractC4380) interfaceC4227).m8346();
                    this.bitField0_ |= 8;
                } else {
                    ensurePublicDependencyIsMutable();
                    ((C4445) this.publicDependency_).addAll(descriptorProtos$FileDescriptorProto.publicDependency_);
                }
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.weakDependency_.isEmpty()) {
                if (this.weakDependency_.isEmpty()) {
                    InterfaceC4227 interfaceC42272 = descriptorProtos$FileDescriptorProto.weakDependency_;
                    this.weakDependency_ = interfaceC42272;
                    ((AbstractC4380) interfaceC42272).m8346();
                    this.bitField0_ |= 16;
                } else {
                    ensureWeakDependencyIsMutable();
                    ((C4445) this.weakDependency_).addAll(descriptorProtos$FileDescriptorProto.weakDependency_);
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
                boolean zIsEmpty = this.messageTypeBuilder_.f11357.isEmpty();
                C4195 c4195 = this.messageTypeBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.messageTypeBuilder_ = null;
                    this.messageType_ = descriptorProtos$FileDescriptorProto.messageType_;
                    this.bitField0_ &= -65;
                    this.messageTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMessageTypeFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$FileDescriptorProto.messageType_);
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
                boolean zIsEmpty2 = this.enumTypeBuilder_.f11357.isEmpty();
                C4195 c41952 = this.enumTypeBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$FileDescriptorProto.enumType_;
                    this.bitField0_ &= -129;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c41952.m8021(descriptorProtos$FileDescriptorProto.enumType_);
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
                boolean zIsEmpty3 = this.serviceBuilder_.f11357.isEmpty();
                C4195 c41953 = this.serviceBuilder_;
                if (zIsEmpty3) {
                    c41953.f11358 = null;
                    this.serviceBuilder_ = null;
                    this.service_ = descriptorProtos$FileDescriptorProto.service_;
                    this.bitField0_ &= -257;
                    this.serviceBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetServiceFieldBuilder() : null;
                } else {
                    c41953.m8021(descriptorProtos$FileDescriptorProto.service_);
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
                boolean zIsEmpty4 = this.extensionBuilder_.f11357.isEmpty();
                C4195 c41954 = this.extensionBuilder_;
                if (zIsEmpty4) {
                    c41954.f11358 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$FileDescriptorProto.extension_;
                    this.bitField0_ &= -513;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c41954.m8021(descriptorProtos$FileDescriptorProto.extension_);
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

        public C4112 mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            DescriptorProtos$FileOptions descriptorProtos$FileOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FileOptions);
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

        public C4112 mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2;
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$SourceCodeInfo);
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

        public C4112 removeEnumType(int i) {
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

        public C4112 removeExtension(int i) {
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

        public C4112 removeMessageType(int i) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
            onChanged();
            return this;
        }

        public C4112 removeService(int i) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureServiceIsMutable();
            this.service_.remove(i);
            onChanged();
            return this;
        }

        public C4112 setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4112 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 8192;
            this.edition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C4112 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
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

        public C4112 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
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

        public C4112 setMessageType(int i, DescriptorProtos$DescriptorProto.C4096 c4096) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4096.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, c4096.build());
            onChanged();
            return this;
        }

        public C4112 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4112 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4112 setOptionDependency(int i, String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.set(i, str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4112 setOptions(DescriptorProtos$FileOptions.C4114 c4114) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4114.build();
            } else {
                c4174.m7946(c4114.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C4112 setPackage(String str) {
            str.getClass();
            this.package_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4112 setPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.package_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4112 setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            ((C4445) this.publicDependency_).m8374(i, i2);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4112 setService(int i, DescriptorProtos$ServiceDescriptorProto.C4122 c4122) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4122.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.set(i, c4122.build());
            onChanged();
            return this;
        }

        public C4112 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo.C4125 c4125) {
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 == null) {
                this.sourceCodeInfo_ = c4125.build();
            } else {
                c4174.m7946(c4125.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C4112 setSyntax(String str) {
            str.getClass();
            this.syntax_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C4112 setSyntaxBytes(ByteString byteString) {
            byteString.getClass();
            this.syntax_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C4112 setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            ((C4445) this.weakDependency_).m8374(i, i2);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C4098 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C4098) internalGetEnumTypeFieldBuilder().m8020(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C4108 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C4108) internalGetExtensionFieldBuilder().m8020(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$DescriptorProto.C4096 addMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C4096) internalGetMessageTypeFieldBuilder().m8020(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$ServiceDescriptorProto.C4122 addServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C4122) internalGetServiceFieldBuilder().m8020(i, DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C4112 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C4112 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C4112 addMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C4112 addService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C4112 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C4112 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C4112 setMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C4112 setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$FileOptions.getClass();
                this.options_ = descriptorProtos$FileOptions;
            } else {
                c4174.m7946(descriptorProtos$FileOptions);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C4112 setService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.set(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C4112 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C4174 c4174 = this.sourceCodeInfoBuilder_;
            if (c4174 == null) {
                descriptorProtos$SourceCodeInfo.getClass();
                this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
            } else {
                c4174.m7946(descriptorProtos$SourceCodeInfo);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C4112 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C4112 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C4112 addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$DescriptorProto);
            return this;
        }

        public C4112 addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C4112 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C4098 c4098) {
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

        public C4112 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C4108 c4108) {
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

        public C4112 addMessageType(int i, DescriptorProtos$DescriptorProto.C4096 c4096) {
            C4195 c4195 = this.messageTypeBuilder_;
            if (c4195 == null) {
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, c4096.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4096.build());
            return this;
        }

        public C4112 addService(int i, DescriptorProtos$ServiceDescriptorProto.C4122 c4122) {
            C4195 c4195 = this.serviceBuilder_;
            if (c4195 == null) {
                ensureServiceIsMutable();
                this.service_.add(i, c4122.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4122.build());
            return this;
        }

        private C4112(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.package_ = "";
            C4216 c4216 = C4216.f11382;
            this.dependency_ = c4216;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c4216;
            List list = Collections.EMPTY_LIST;
            this.messageType_ = list;
            this.enumType_ = list;
            this.service_ = list;
            this.extension_ = list;
            this.syntax_ = "";
            this.edition_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4112 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FileDescriptorProto) {
                return mergeFrom((DescriptorProtos$FileDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4112 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                this.package_ = abstractC4306.mo8278();
                                this.bitField0_ |= 2;
                                break;
                            case 26:
                                ByteString byteStringMo8278 = abstractC4306.mo8278();
                                ensureDependencyIsMutable();
                                this.dependency_.mo8054(byteStringMo8278);
                                break;
                            case 34:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC4306.mo8274(DescriptorProtos$DescriptorProto.parser(), c4529);
                                C4195 c4195 = this.messageTypeBuilder_;
                                if (c4195 == null) {
                                    ensureMessageTypeIsMutable();
                                    this.messageType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 42:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC4306.mo8274(DescriptorProtos$EnumDescriptorProto.parser(), c4529);
                                C4195 c41952 = this.enumTypeBuilder_;
                                if (c41952 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c41952.m8017(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 50:
                                DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto) abstractC4306.mo8274(DescriptorProtos$ServiceDescriptorProto.parser(), c4529);
                                C4195 c41953 = this.serviceBuilder_;
                                if (c41953 == null) {
                                    ensureServiceIsMutable();
                                    this.service_.add(descriptorProtos$ServiceDescriptorProto);
                                } else {
                                    c41953.m8017(descriptorProtos$ServiceDescriptorProto);
                                }
                                break;
                            case 58:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FieldDescriptorProto.parser(), c4529);
                                C4195 c41954 = this.extensionBuilder_;
                                if (c41954 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c41954.m8017(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 66:
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 1024;
                                break;
                            case 74:
                                abstractC4306.mo8275(internalGetSourceCodeInfoFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 2048;
                                break;
                            case 80:
                                int iMo8276 = abstractC4306.mo8276();
                                ensurePublicDependencyIsMutable();
                                ((C4445) this.publicDependency_).m8371(iMo8276);
                                break;
                            case 82:
                                int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                                ensurePublicDependencyIsMutable();
                                while (abstractC4306.mo8269() > 0) {
                                    ((C4445) this.publicDependency_).m8371(abstractC4306.mo8276());
                                }
                                abstractC4306.mo8285(iMo8286);
                                break;
                            case 88:
                                int iMo82762 = abstractC4306.mo8276();
                                ensureWeakDependencyIsMutable();
                                ((C4445) this.weakDependency_).m8371(iMo82762);
                                break;
                            case 90:
                                int iMo82862 = abstractC4306.mo8286(abstractC4306.mo8260());
                                ensureWeakDependencyIsMutable();
                                while (abstractC4306.mo8269() > 0) {
                                    ((C4445) this.weakDependency_).m8371(abstractC4306.mo8276());
                                }
                                abstractC4306.mo8285(iMo82862);
                                break;
                            case 98:
                                this.syntax_ = abstractC4306.mo8278();
                                this.bitField0_ |= 4096;
                                break;
                            case 112:
                                int iMo8283 = abstractC4306.mo8283();
                                if (DescriptorProtos$Edition.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(14, iMo8283);
                                } else {
                                    this.edition_ = iMo8283;
                                    this.bitField0_ |= 8192;
                                }
                                break;
                            case 122:
                                ByteString byteStringMo82782 = abstractC4306.mo8278();
                                ensureOptionDependencyIsMutable();
                                this.optionDependency_.mo8054(byteStringMo82782);
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

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4209 getDependencyList() {
        return this.dependency_;
    }

    @Override // com.google.protobuf.InterfaceC4325
    public InterfaceC4209 getOptionDependencyList() {
        return this.optionDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4112 newBuilderForType() {
        return newBuilder();
    }

    public static C4112 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private DescriptorProtos$FileDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.package_ = "";
        C4216 c4216 = C4216.f11382;
        this.dependency_ = c4216;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c4216;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

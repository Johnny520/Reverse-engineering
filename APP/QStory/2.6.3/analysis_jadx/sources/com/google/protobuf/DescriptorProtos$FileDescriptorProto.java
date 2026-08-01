package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
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
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessage implements InterfaceC3493 {
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
    private static final InterfaceC3375 PARSER;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private C3384 dependency_;
    private int edition_;
    private List<DescriptorProtos$EnumDescriptorProto> enumType_;
    private List<DescriptorProtos$FieldDescriptorProto> extension_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$DescriptorProto> messageType_;
    private volatile Object name_;
    private C3384 optionDependency_;
    private DescriptorProtos$FileOptions options_;
    private volatile Object package_;
    private InterfaceC3395 publicDependency_;
    private List<DescriptorProtos$ServiceDescriptorProto> service_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private volatile Object syntax_;
    private InterfaceC3395 weakDependency_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorProto();
        PARSER = new C3514();
    }

    private DescriptorProtos$FileDescriptorProto() {
        this.name_ = "";
        this.package_ = "";
        C3384 c3384 = C3384.f11037;
        this.dependency_ = c3384;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3384;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.package_ = "";
        this.dependency_ = c3384;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3384;
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11430;
    }

    public static C3280 newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3493
    public String getDependency(int i) {
        return this.dependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public ByteString getDependencyBytes(int i) {
        return this.dependency_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getDependencyCount() {
        return this.dependency_.f11038.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11430;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$Edition getEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3573 getEnumTypeOrBuilder(int i) {
        return this.enumType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<? extends InterfaceC3573> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$FieldDescriptorProto getExtension(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3505 getExtensionOrBuilder(int i) {
        return this.extension_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<? extends InterfaceC3505> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$DescriptorProto getMessageType(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3572 getMessageTypeOrBuilder(int i) {
        return this.messageType_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<? extends InterfaceC3572> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.InterfaceC3493
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

    @Override // com.google.protobuf.InterfaceC3493
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public String getOptionDependency(int i) {
        return this.optionDependency_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public ByteString getOptionDependencyBytes(int i) {
        return this.optionDependency_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getOptionDependencyCount() {
        return this.optionDependency_.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3495 getOptionsOrBuilder() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.InterfaceC3493
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

    @Override // com.google.protobuf.InterfaceC3493
    public ByteString getPackageBytes() {
        Object obj = this.package_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.package_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getPublicDependency(int i) {
        return ((C3613) this.publicDependency_).m7814(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getPublicDependencyCount() {
        return ((C3613) this.publicDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
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
        for (int i2 = 0; i2 < this.dependency_.f11038.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.dependency_.f11038.get(i2));
        }
        int size = getDependencyList().size() + iComputeStringSize + iComputeStringSizeNoTag;
        int size2 = this.messageType_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC3462.m7643(this.messageType_.get(i3));
        }
        int iM7643 = size + size2;
        int size3 = this.enumType_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM7643 += AbstractC3462.m7643(this.enumType_.get(i4));
        }
        int iM76432 = iM7643 + size3;
        int size4 = this.service_.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iM76432 += AbstractC3462.m7643(this.service_.get(i5));
        }
        int iM76433 = iM76432 + size4;
        int size5 = this.extension_.size();
        for (int i6 = 0; i6 < size5; i6++) {
            iM76433 += AbstractC3462.m7643(this.extension_.get(i6));
        }
        int iM7639 = iM76433 + size5;
        if ((this.bitField0_ & 4) != 0) {
            iM7639 += AbstractC3462.m7639(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7639 += AbstractC3462.m7639(9, getSourceCodeInfo());
        }
        int i7 = 0;
        int iM7638 = 0;
        while (true) {
            if (i7 >= ((C3613) this.publicDependency_).f11252) {
                break;
            }
            iM7638 += AbstractC3462.m7638(((C3613) r4).m7814(i7));
            i7++;
        }
        int size6 = getPublicDependencyList().size() + iM7639 + iM7638;
        int i8 = 0;
        int iM76382 = 0;
        while (true) {
            if (i8 >= ((C3613) this.weakDependency_).f11252) {
                break;
            }
            iM76382 += AbstractC3462.m7638(((C3613) r4).m7814(i8));
            i8++;
        }
        int size7 = getWeakDependencyList().size() + size6 + iM76382;
        if ((this.bitField0_ & 16) != 0) {
            size7 += GeneratedMessage.computeStringSize(12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            size7 += AbstractC3462.m7632(14, this.edition_);
        }
        int iComputeStringSizeNoTag2 = 0;
        for (int i9 = 0; i9 < this.optionDependency_.f11038.size(); i9++) {
            iComputeStringSizeNoTag2 += GeneratedMessage.computeStringSizeNoTag(this.optionDependency_.f11038.get(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getOptionDependencyList().size() + size7 + iComputeStringSizeNoTag2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$ServiceDescriptorProto getService(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3490 getServiceOrBuilder(int i) {
        return this.service_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<? extends InterfaceC3490> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3650 getSourceCodeInfoOrBuilder() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.InterfaceC3493
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

    @Override // com.google.protobuf.InterfaceC3493
    public ByteString getSyntaxBytes() {
        Object obj = this.syntax_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.syntax_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getWeakDependency(int i) {
        return ((C3613) this.weakDependency_).m7814(i);
    }

    @Override // com.google.protobuf.InterfaceC3493
    public int getWeakDependencyCount() {
        return ((C3613) this.weakDependency_).size();
    }

    @Override // com.google.protobuf.InterfaceC3493
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
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
        if (hasPackage()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getPackage().hashCode();
        }
        if (getDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getDependencyList().hashCode();
        }
        if (getPublicDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 10, 53) + getPublicDependencyList().hashCode();
        }
        if (getWeakDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 11, 53) + getWeakDependencyList().hashCode();
        }
        if (getOptionDependencyCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 15, 53) + getOptionDependencyList().hashCode();
        }
        if (getMessageTypeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getMessageTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + getEnumTypeList().hashCode();
        }
        if (getServiceCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + getServiceList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 7, 53) + getExtensionList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasSourceCodeInfo()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 9, 53) + getSourceCodeInfo().hashCode();
        }
        if (hasSyntax()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 12, 53) + getSyntax().hashCode();
        }
        if (hasEdition()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 14, 53) + this.edition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11429;
        c3619.m7827(DescriptorProtos$FileDescriptorProto.class, C3280.class);
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

    @Override // com.google.protobuf.AbstractC3533
    public C3280 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3280(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3280 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3280() : new C3280().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC3462, 2, this.package_);
        }
        for (int i = 0; i < this.dependency_.f11038.size(); i++) {
            GeneratedMessage.writeString(abstractC3462, 3, this.dependency_.f11038.get(i));
        }
        for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
            abstractC3462.mo7649(4, this.messageType_.get(i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC3462.mo7649(5, this.enumType_.get(i3));
        }
        for (int i4 = 0; i4 < this.service_.size(); i4++) {
            abstractC3462.mo7649(6, this.service_.get(i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC3462.mo7649(7, this.extension_.get(i5));
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7649(8, getOptions());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7649(9, getSourceCodeInfo());
        }
        int i6 = 0;
        while (true) {
            C3613 c3613 = (C3613) this.publicDependency_;
            if (i6 >= c3613.f11252) {
                break;
            }
            abstractC3462.mo7651(10, c3613.m7814(i6));
            i6++;
        }
        int i7 = 0;
        while (true) {
            C3613 c36132 = (C3613) this.weakDependency_;
            if (i7 >= c36132.f11252) {
                break;
            }
            abstractC3462.mo7651(11, c36132.m7814(i7));
            i7++;
        }
        if ((this.bitField0_ & 16) != 0) {
            GeneratedMessage.writeString(abstractC3462, 12, this.syntax_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3462.mo7651(14, this.edition_);
        }
        for (int i8 = 0; i8 < this.optionDependency_.f11038.size(); i8++) {
            GeneratedMessage.writeString(abstractC3462, 15, this.optionDependency_.f11038.get(i8));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3280 extends GeneratedMessage.AbstractC3305 implements InterfaceC3493 {
        private int bitField0_;
        private C3384 dependency_;
        private int edition_;
        private C3363 enumTypeBuilder_;
        private List<DescriptorProtos$EnumDescriptorProto> enumType_;
        private C3363 extensionBuilder_;
        private List<DescriptorProtos$FieldDescriptorProto> extension_;
        private C3363 messageTypeBuilder_;
        private List<DescriptorProtos$DescriptorProto> messageType_;
        private Object name_;
        private C3384 optionDependency_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$FileOptions options_;
        private Object package_;
        private InterfaceC3395 publicDependency_;
        private C3363 serviceBuilder_;
        private List<DescriptorProtos$ServiceDescriptorProto> service_;
        private C3342 sourceCodeInfoBuilder_;
        private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
        private Object syntax_;
        private InterfaceC3395 weakDependency_;

        private C3280() {
            this.name_ = "";
            this.package_ = "";
            C3384 c3384 = C3384.f11037;
            this.dependency_ = c3384;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3384;
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
                this.dependency_.m7787();
                descriptorProtos$FileDescriptorProto.dependency_ = this.dependency_;
            }
            if ((i2 & 8) != 0) {
                ((AbstractC3548) this.publicDependency_).m7787();
                descriptorProtos$FileDescriptorProto.publicDependency_ = this.publicDependency_;
            }
            if ((i2 & 16) != 0) {
                ((AbstractC3548) this.weakDependency_).m7787();
                descriptorProtos$FileDescriptorProto.weakDependency_ = this.weakDependency_;
            }
            if ((i2 & 32) != 0) {
                this.optionDependency_.m7787();
                descriptorProtos$FileDescriptorProto.optionDependency_ = this.optionDependency_;
            }
            if ((i2 & 1024) != 0) {
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$FileDescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$FileOptions) c3342.m7384();
                i |= 4;
            }
            if ((i2 & 2048) != 0) {
                C3342 c33422 = this.sourceCodeInfoBuilder_;
                descriptorProtos$FileDescriptorProto.sourceCodeInfo_ = c33422 == null ? this.sourceCodeInfo_ : (DescriptorProtos$SourceCodeInfo) c33422.m7384();
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
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 64) != 0) {
                    this.messageType_ = Collections.unmodifiableList(this.messageType_);
                    this.bitField0_ &= -65;
                }
                descriptorProtos$FileDescriptorProto.messageType_ = this.messageType_;
            } else {
                descriptorProtos$FileDescriptorProto.messageType_ = c3363.m7472();
            }
            C3363 c33632 = this.enumTypeBuilder_;
            if (c33632 == null) {
                if ((this.bitField0_ & 128) != 0) {
                    this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    this.bitField0_ &= -129;
                }
                descriptorProtos$FileDescriptorProto.enumType_ = this.enumType_;
            } else {
                descriptorProtos$FileDescriptorProto.enumType_ = c33632.m7472();
            }
            C3363 c33633 = this.serviceBuilder_;
            if (c33633 == null) {
                if ((this.bitField0_ & 256) != 0) {
                    this.service_ = Collections.unmodifiableList(this.service_);
                    this.bitField0_ &= -257;
                }
                descriptorProtos$FileDescriptorProto.service_ = this.service_;
            } else {
                descriptorProtos$FileDescriptorProto.service_ = c33633.m7472();
            }
            C3363 c33634 = this.extensionBuilder_;
            if (c33634 != null) {
                descriptorProtos$FileDescriptorProto.extension_ = c33634.m7472();
                return;
            }
            if ((this.bitField0_ & 512) != 0) {
                this.extension_ = Collections.unmodifiableList(this.extension_);
                this.bitField0_ &= -513;
            }
            descriptorProtos$FileDescriptorProto.extension_ = this.extension_;
        }

        private void ensureDependencyIsMutable() {
            if (!this.dependency_.f11199) {
                this.dependency_ = new C3384(this.dependency_);
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
            if (!this.optionDependency_.f11199) {
                this.optionDependency_ = new C3384(this.optionDependency_);
            }
            this.bitField0_ |= 32;
        }

        private void ensurePublicDependencyIsMutable() {
            InterfaceC3403 interfaceC3403 = this.publicDependency_;
            if (!((AbstractC3548) interfaceC3403).f11199) {
                this.publicDependency_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
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
            InterfaceC3403 interfaceC3403 = this.weakDependency_;
            if (!((AbstractC3548) interfaceC3403).f11199) {
                this.weakDependency_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
            }
            this.bitField0_ |= 16;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11430;
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

        private C3363 internalGetMessageTypeFieldBuilder() {
            if (this.messageTypeBuilder_ == null) {
                this.messageTypeBuilder_ = new C3363(this.messageType_, getParentForChildren(), isClean());
                this.messageType_ = null;
            }
            return this.messageTypeBuilder_;
        }

        private C3342 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3342(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3363 internalGetServiceFieldBuilder() {
            if (this.serviceBuilder_ == null) {
                this.serviceBuilder_ = new C3363(this.service_, getParentForChildren(), isClean());
                this.service_ = null;
            }
            return this.serviceBuilder_;
        }

        private C3342 internalGetSourceCodeInfoFieldBuilder() {
            if (this.sourceCodeInfoBuilder_ == null) {
                this.sourceCodeInfoBuilder_ = new C3342(getSourceCodeInfo(), getParentForChildren(), isClean());
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

        public C3280 addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.dependency_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3280 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
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

        public C3280 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
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

        public C3280 addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureMessageTypeIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.messageType_);
            onChanged();
            return this;
        }

        public C3280 addAllOptionDependency(Iterable<String> iterable) {
            ensureOptionDependencyIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.optionDependency_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3280 addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.publicDependency_);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3280 addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureServiceIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.service_);
            onChanged();
            return this;
        }

        public C3280 addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.weakDependency_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3280 addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.m7493(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3280 addDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureDependencyIsMutable();
            this.dependency_.mo7495(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3280 addEnumType(DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
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

        public C3280 addExtension(DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
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

        public C3280 addMessageType(DescriptorProtos$DescriptorProto.C3264 c3264) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3264.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.add(c3264.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$DescriptorProto.C3264 addMessageTypeBuilder() {
            return (DescriptorProtos$DescriptorProto.C3264) internalGetMessageTypeFieldBuilder().m7460(DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public C3280 addOptionDependency(String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.m7493(str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3280 addOptionDependencyBytes(ByteString byteString) {
            byteString.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.mo7495(byteString);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3280 addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            ((C3613) this.publicDependency_).m7812(i);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3280 addService(DescriptorProtos$ServiceDescriptorProto.C3290 c3290) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3290.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.add(c3290.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$ServiceDescriptorProto.C3290 addServiceBuilder() {
            return (DescriptorProtos$ServiceDescriptorProto.C3290) internalGetServiceFieldBuilder().m7460(DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C3280 addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            ((C3613) this.weakDependency_).m7812(i);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileDescriptorProto build() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FileDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileDescriptorProto buildPartial() {
            DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3280 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.package_ = "";
            C3384 c3384 = C3384.f11037;
            this.dependency_ = c3384;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3384;
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                this.messageType_ = Collections.EMPTY_LIST;
            } else {
                this.messageType_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -65;
            C3363 c33632 = this.enumTypeBuilder_;
            if (c33632 == null) {
                this.enumType_ = Collections.EMPTY_LIST;
            } else {
                this.enumType_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -129;
            C3363 c33633 = this.serviceBuilder_;
            if (c33633 == null) {
                this.service_ = Collections.EMPTY_LIST;
            } else {
                this.service_ = null;
                c33633.m7471();
            }
            this.bitField0_ &= -257;
            C3363 c33634 = this.extensionBuilder_;
            if (c33634 == null) {
                this.extension_ = Collections.EMPTY_LIST;
            } else {
                this.extension_ = null;
                c33634.m7471();
            }
            this.bitField0_ &= -513;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            this.sourceCodeInfo_ = null;
            C3342 c33422 = this.sourceCodeInfoBuilder_;
            if (c33422 != null) {
                c33422.f10971 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            this.syntax_ = "";
            this.edition_ = 0;
            return this;
        }

        public C3280 clearDependency() {
            this.dependency_ = C3384.f11037;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3280 clearEdition() {
            this.bitField0_ &= -8193;
            this.edition_ = 0;
            onChanged();
            return this;
        }

        public C3280 clearEnumType() {
            C3363 c3363 = this.enumTypeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.enumType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3280 clearExtension() {
            C3363 c3363 = this.extensionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.extension_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3280 clearMessageType() {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.messageType_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3280 clearName() {
            this.name_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3280 clearOptionDependency() {
            this.optionDependency_ = C3384.f11037;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3280 clearOptions() {
            this.bitField0_ &= -1025;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3280 clearPackage() {
            this.package_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getPackage();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3280 clearPublicDependency() {
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3280 clearService() {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.service_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C3280 clearSourceCodeInfo() {
            this.bitField0_ &= -2049;
            this.sourceCodeInfo_ = null;
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.sourceCodeInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3280 clearSyntax() {
            this.syntax_ = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getSyntax();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public C3280 clearWeakDependency() {
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public ByteString getDependencyBytes(int i) {
            return this.dependency_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getDependencyCount() {
            return this.dependency_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3377 getDependencyList() {
            this.dependency_.m7787();
            return this.dependency_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11430;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3493
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

        @Override // com.google.protobuf.InterfaceC3493
        public int getEnumTypeCount() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? this.enumType_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.enumType_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3573 getEnumTypeOrBuilder(int i) {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 == null ? this.enumType_.get(i) : (InterfaceC3573) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<? extends InterfaceC3573> getEnumTypeOrBuilderList() {
            C3363 c3363 = this.enumTypeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.enumType_);
        }

        @Override // com.google.protobuf.InterfaceC3493
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

        @Override // com.google.protobuf.InterfaceC3493
        public int getExtensionCount() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? this.extension_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.extension_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3505 getExtensionOrBuilder(int i) {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 == null ? this.extension_.get(i) : (InterfaceC3505) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<? extends InterfaceC3505> getExtensionOrBuilderList() {
            C3363 c3363 = this.extensionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.extension_);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public DescriptorProtos$DescriptorProto getMessageType(int i) {
            C3363 c3363 = this.messageTypeBuilder_;
            return c3363 == null ? this.messageType_.get(i) : (DescriptorProtos$DescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$DescriptorProto.C3264 getMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C3264) internalGetMessageTypeFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$DescriptorProto.C3264> getMessageTypeBuilderList() {
            return internalGetMessageTypeFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getMessageTypeCount() {
            C3363 c3363 = this.messageTypeBuilder_;
            return c3363 == null ? this.messageType_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
            C3363 c3363 = this.messageTypeBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.messageType_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3572 getMessageTypeOrBuilder(int i) {
            C3363 c3363 = this.messageTypeBuilder_;
            return c3363 == null ? this.messageType_.get(i) : (InterfaceC3572) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<? extends InterfaceC3572> getMessageTypeOrBuilderList() {
            C3363 c3363 = this.messageTypeBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.messageType_);
        }

        @Override // com.google.protobuf.InterfaceC3493
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

        @Override // com.google.protobuf.InterfaceC3493
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public String getOptionDependency(int i) {
            return this.optionDependency_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public ByteString getOptionDependencyBytes(int i) {
            return this.optionDependency_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getOptionDependencyCount() {
            return this.optionDependency_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3377 getOptionDependencyList() {
            this.optionDependency_.m7787();
            return this.optionDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public DescriptorProtos$FileOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FileOptions) c3342.m7380();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        public DescriptorProtos$FileOptions.C3282 getOptionsBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (DescriptorProtos$FileOptions.C3282) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3495 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3495) c3342.m7379();
            }
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
            return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
        }

        @Override // com.google.protobuf.InterfaceC3493
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

        @Override // com.google.protobuf.InterfaceC3493
        public ByteString getPackageBytes() {
            Object obj = this.package_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.package_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getPublicDependency(int i) {
            return ((C3613) this.publicDependency_).m7814(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getPublicDependencyCount() {
            return ((C3613) this.publicDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<Integer> getPublicDependencyList() {
            ((AbstractC3548) this.publicDependency_).m7787();
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public DescriptorProtos$ServiceDescriptorProto getService(int i) {
            C3363 c3363 = this.serviceBuilder_;
            return c3363 == null ? this.service_.get(i) : (DescriptorProtos$ServiceDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$ServiceDescriptorProto.C3290 getServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C3290) internalGetServiceFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$ServiceDescriptorProto.C3290> getServiceBuilderList() {
            return internalGetServiceFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getServiceCount() {
            C3363 c3363 = this.serviceBuilder_;
            return c3363 == null ? this.service_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
            C3363 c3363 = this.serviceBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.service_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3490 getServiceOrBuilder(int i) {
            C3363 c3363 = this.serviceBuilder_;
            return c3363 == null ? this.service_.get(i) : (InterfaceC3490) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<? extends InterfaceC3490> getServiceOrBuilderList() {
            C3363 c3363 = this.serviceBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.service_);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$SourceCodeInfo) c3342.m7380();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        public DescriptorProtos$SourceCodeInfo.C3293 getSourceCodeInfoBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$SourceCodeInfo.C3293) internalGetSourceCodeInfoFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public InterfaceC3650 getSourceCodeInfoOrBuilder() {
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 != null) {
                return (InterfaceC3650) c3342.m7379();
            }
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
            return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.InterfaceC3493
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

        @Override // com.google.protobuf.InterfaceC3493
        public ByteString getSyntaxBytes() {
            Object obj = this.syntax_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.syntax_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getWeakDependency(int i) {
            return ((C3613) this.weakDependency_).m7814(i);
        }

        @Override // com.google.protobuf.InterfaceC3493
        public int getWeakDependencyCount() {
            return ((C3613) this.weakDependency_).size();
        }

        @Override // com.google.protobuf.InterfaceC3493
        public List<Integer> getWeakDependencyList() {
            ((AbstractC3548) this.weakDependency_).m7787();
            return this.weakDependency_;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasEdition() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasOptions() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3493
        public boolean hasSyntax() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11429;
            c3619.m7827(DescriptorProtos$FileDescriptorProto.class, C3280.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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
        public C3280 mergeFrom(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
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
                    InterfaceC3395 interfaceC3395 = descriptorProtos$FileDescriptorProto.publicDependency_;
                    this.publicDependency_ = interfaceC3395;
                    ((AbstractC3548) interfaceC3395).m7787();
                    this.bitField0_ |= 8;
                } else {
                    ensurePublicDependencyIsMutable();
                    ((C3613) this.publicDependency_).addAll(descriptorProtos$FileDescriptorProto.publicDependency_);
                }
                onChanged();
            }
            if (!descriptorProtos$FileDescriptorProto.weakDependency_.isEmpty()) {
                if (this.weakDependency_.isEmpty()) {
                    InterfaceC3395 interfaceC33952 = descriptorProtos$FileDescriptorProto.weakDependency_;
                    this.weakDependency_ = interfaceC33952;
                    ((AbstractC3548) interfaceC33952).m7787();
                    this.bitField0_ |= 16;
                } else {
                    ensureWeakDependencyIsMutable();
                    ((C3613) this.weakDependency_).addAll(descriptorProtos$FileDescriptorProto.weakDependency_);
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
                boolean zIsEmpty = this.messageTypeBuilder_.f11012.isEmpty();
                C3363 c3363 = this.messageTypeBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.messageTypeBuilder_ = null;
                    this.messageType_ = descriptorProtos$FileDescriptorProto.messageType_;
                    this.bitField0_ &= -65;
                    this.messageTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMessageTypeFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$FileDescriptorProto.messageType_);
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
                boolean zIsEmpty2 = this.enumTypeBuilder_.f11012.isEmpty();
                C3363 c33632 = this.enumTypeBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.enumTypeBuilder_ = null;
                    this.enumType_ = descriptorProtos$FileDescriptorProto.enumType_;
                    this.bitField0_ &= -129;
                    this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumTypeFieldBuilder() : null;
                } else {
                    c33632.m7462(descriptorProtos$FileDescriptorProto.enumType_);
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
                boolean zIsEmpty3 = this.serviceBuilder_.f11012.isEmpty();
                C3363 c33633 = this.serviceBuilder_;
                if (zIsEmpty3) {
                    c33633.f11013 = null;
                    this.serviceBuilder_ = null;
                    this.service_ = descriptorProtos$FileDescriptorProto.service_;
                    this.bitField0_ &= -257;
                    this.serviceBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetServiceFieldBuilder() : null;
                } else {
                    c33633.m7462(descriptorProtos$FileDescriptorProto.service_);
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
                boolean zIsEmpty4 = this.extensionBuilder_.f11012.isEmpty();
                C3363 c33634 = this.extensionBuilder_;
                if (zIsEmpty4) {
                    c33634.f11013 = null;
                    this.extensionBuilder_ = null;
                    this.extension_ = descriptorProtos$FileDescriptorProto.extension_;
                    this.bitField0_ &= -513;
                    this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetExtensionFieldBuilder() : null;
                } else {
                    c33634.m7462(descriptorProtos$FileDescriptorProto.extension_);
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

        public C3280 mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            DescriptorProtos$FileOptions descriptorProtos$FileOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FileOptions);
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

        public C3280 mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2;
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$SourceCodeInfo);
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

        public C3280 removeEnumType(int i) {
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

        public C3280 removeExtension(int i) {
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

        public C3280 removeMessageType(int i) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
            onChanged();
            return this;
        }

        public C3280 removeService(int i) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureServiceIsMutable();
            this.service_.remove(i);
            onChanged();
            return this;
        }

        public C3280 setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3280 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 8192;
            this.edition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C3280 setEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
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

        public C3280 setExtension(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
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

        public C3280 setMessageType(int i, DescriptorProtos$DescriptorProto.C3264 c3264) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3264.build());
                return this;
            }
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, c3264.build());
            onChanged();
            return this;
        }

        public C3280 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3280 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3280 setOptionDependency(int i, String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.set(i, str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3280 setOptions(DescriptorProtos$FileOptions.C3282 c3282) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3282.build();
            } else {
                c3342.m7387(c3282.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C3280 setPackage(String str) {
            str.getClass();
            this.package_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3280 setPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.package_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3280 setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            ((C3613) this.publicDependency_).m7815(i, i2);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3280 setService(int i, DescriptorProtos$ServiceDescriptorProto.C3290 c3290) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3290.build());
                return this;
            }
            ensureServiceIsMutable();
            this.service_.set(i, c3290.build());
            onChanged();
            return this;
        }

        public C3280 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo.C3293 c3293) {
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 == null) {
                this.sourceCodeInfo_ = c3293.build();
            } else {
                c3342.m7387(c3293.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3280 setSyntax(String str) {
            str.getClass();
            this.syntax_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3280 setSyntaxBytes(ByteString byteString) {
            byteString.getClass();
            this.syntax_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3280 setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            ((C3613) this.weakDependency_).m7815(i, i2);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$EnumDescriptorProto.C3266 addEnumTypeBuilder(int i) {
            return (DescriptorProtos$EnumDescriptorProto.C3266) internalGetEnumTypeFieldBuilder().m7461(i, DescriptorProtos$EnumDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FieldDescriptorProto.C3276 addExtensionBuilder(int i) {
            return (DescriptorProtos$FieldDescriptorProto.C3276) internalGetExtensionFieldBuilder().m7461(i, DescriptorProtos$FieldDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$DescriptorProto.C3264 addMessageTypeBuilder(int i) {
            return (DescriptorProtos$DescriptorProto.C3264) internalGetMessageTypeFieldBuilder().m7461(i, DescriptorProtos$DescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$ServiceDescriptorProto.C3290 addServiceBuilder(int i) {
            return (DescriptorProtos$ServiceDescriptorProto.C3290) internalGetServiceFieldBuilder().m7461(i, DescriptorProtos$ServiceDescriptorProto.getDefaultInstance());
        }

        public C3280 addEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3280 addExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3280 addMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3280 addService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3280 setEnumType(int i, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3280 setExtension(int i, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3280 setMessageType(int i, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.set(i, descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$DescriptorProto);
            return this;
        }

        public C3280 setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$FileOptions.getClass();
                this.options_ = descriptorProtos$FileOptions;
            } else {
                c3342.m7387(descriptorProtos$FileOptions);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C3280 setService(int i, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.set(i, descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3280 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C3342 c3342 = this.sourceCodeInfoBuilder_;
            if (c3342 == null) {
                descriptorProtos$SourceCodeInfo.getClass();
                this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
            } else {
                c3342.m7387(descriptorProtos$SourceCodeInfo);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3280 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
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

        public C3280 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
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

        public C3280 addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                descriptorProtos$DescriptorProto.getClass();
                ensureMessageTypeIsMutable();
                this.messageType_.add(descriptorProtos$DescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$DescriptorProto);
            return this;
        }

        public C3280 addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 == null) {
                descriptorProtos$ServiceDescriptorProto.getClass();
                ensureServiceIsMutable();
                this.service_.add(descriptorProtos$ServiceDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public C3280 addEnumType(int i, DescriptorProtos$EnumDescriptorProto.C3266 c3266) {
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

        public C3280 addExtension(int i, DescriptorProtos$FieldDescriptorProto.C3276 c3276) {
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

        public C3280 addMessageType(int i, DescriptorProtos$DescriptorProto.C3264 c3264) {
            C3363 c3363 = this.messageTypeBuilder_;
            if (c3363 == null) {
                ensureMessageTypeIsMutable();
                this.messageType_.add(i, c3264.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3264.build());
            return this;
        }

        public C3280 addService(int i, DescriptorProtos$ServiceDescriptorProto.C3290 c3290) {
            C3363 c3363 = this.serviceBuilder_;
            if (c3363 == null) {
                ensureServiceIsMutable();
                this.service_.add(i, c3290.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3290.build());
            return this;
        }

        private C3280(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            this.package_ = "";
            C3384 c3384 = C3384.f11037;
            this.dependency_ = c3384;
            this.publicDependency_ = GeneratedMessage.emptyIntList();
            this.weakDependency_ = GeneratedMessage.emptyIntList();
            this.optionDependency_ = c3384;
            List list = Collections.EMPTY_LIST;
            this.messageType_ = list;
            this.enumType_ = list;
            this.service_ = list;
            this.extension_ = list;
            this.syntax_ = "";
            this.edition_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3280 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FileDescriptorProto) {
                return mergeFrom((DescriptorProtos$FileDescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3280 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                                this.package_ = abstractC3474.mo7719();
                                this.bitField0_ |= 2;
                                break;
                            case 26:
                                ByteString byteStringMo7719 = abstractC3474.mo7719();
                                ensureDependencyIsMutable();
                                this.dependency_.mo7495(byteStringMo7719);
                                break;
                            case 34:
                                DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto) abstractC3474.mo7715(DescriptorProtos$DescriptorProto.parser(), c3697);
                                C3363 c3363 = this.messageTypeBuilder_;
                                if (c3363 == null) {
                                    ensureMessageTypeIsMutable();
                                    this.messageType_.add(descriptorProtos$DescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$DescriptorProto);
                                }
                                break;
                            case 42:
                                DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto) abstractC3474.mo7715(DescriptorProtos$EnumDescriptorProto.parser(), c3697);
                                C3363 c33632 = this.enumTypeBuilder_;
                                if (c33632 == null) {
                                    ensureEnumTypeIsMutable();
                                    this.enumType_.add(descriptorProtos$EnumDescriptorProto);
                                } else {
                                    c33632.m7458(descriptorProtos$EnumDescriptorProto);
                                }
                                break;
                            case 50:
                                DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto) abstractC3474.mo7715(DescriptorProtos$ServiceDescriptorProto.parser(), c3697);
                                C3363 c33633 = this.serviceBuilder_;
                                if (c33633 == null) {
                                    ensureServiceIsMutable();
                                    this.service_.add(descriptorProtos$ServiceDescriptorProto);
                                } else {
                                    c33633.m7458(descriptorProtos$ServiceDescriptorProto);
                                }
                                break;
                            case 58:
                                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FieldDescriptorProto.parser(), c3697);
                                C3363 c33634 = this.extensionBuilder_;
                                if (c33634 == null) {
                                    ensureExtensionIsMutable();
                                    this.extension_.add(descriptorProtos$FieldDescriptorProto);
                                } else {
                                    c33634.m7458(descriptorProtos$FieldDescriptorProto);
                                }
                                break;
                            case 66:
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 1024;
                                break;
                            case 74:
                                abstractC3474.mo7716(internalGetSourceCodeInfoFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 2048;
                                break;
                            case 80:
                                int iMo7717 = abstractC3474.mo7717();
                                ensurePublicDependencyIsMutable();
                                ((C3613) this.publicDependency_).m7812(iMo7717);
                                break;
                            case 82:
                                int iMo7727 = abstractC3474.mo7727(abstractC3474.mo7701());
                                ensurePublicDependencyIsMutable();
                                while (abstractC3474.mo7710() > 0) {
                                    ((C3613) this.publicDependency_).m7812(abstractC3474.mo7717());
                                }
                                abstractC3474.mo7726(iMo7727);
                                break;
                            case 88:
                                int iMo77172 = abstractC3474.mo7717();
                                ensureWeakDependencyIsMutable();
                                ((C3613) this.weakDependency_).m7812(iMo77172);
                                break;
                            case 90:
                                int iMo77272 = abstractC3474.mo7727(abstractC3474.mo7701());
                                ensureWeakDependencyIsMutable();
                                while (abstractC3474.mo7710() > 0) {
                                    ((C3613) this.weakDependency_).m7812(abstractC3474.mo7717());
                                }
                                abstractC3474.mo7726(iMo77272);
                                break;
                            case 98:
                                this.syntax_ = abstractC3474.mo7719();
                                this.bitField0_ |= 4096;
                                break;
                            case 112:
                                int iMo7724 = abstractC3474.mo7724();
                                if (DescriptorProtos$Edition.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(14, iMo7724);
                                } else {
                                    this.edition_ = iMo7724;
                                    this.bitField0_ |= 8192;
                                }
                                break;
                            case 122:
                                ByteString byteStringMo77192 = abstractC3474.mo7719();
                                ensureOptionDependencyIsMutable();
                                this.optionDependency_.mo7495(byteStringMo77192);
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

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3377 getDependencyList() {
        return this.dependency_;
    }

    @Override // com.google.protobuf.InterfaceC3493
    public InterfaceC3377 getOptionDependencyList() {
        return this.optionDependency_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3280 newBuilderForType() {
        return newBuilder();
    }

    public static C3280 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private DescriptorProtos$FileDescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.package_ = "";
        C3384 c3384 = C3384.f11037;
        this.dependency_ = c3384;
        this.publicDependency_ = GeneratedMessage.emptyIntList();
        this.weakDependency_ = GeneratedMessage.emptyIntList();
        this.optionDependency_ = c3384;
        this.syntax_ = "";
        this.edition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}

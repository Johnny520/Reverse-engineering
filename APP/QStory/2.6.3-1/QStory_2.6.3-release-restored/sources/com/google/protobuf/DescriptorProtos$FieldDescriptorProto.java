package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FieldDescriptorProto extends GeneratedMessage implements InterfaceC4337 {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static final InterfaceC4207 PARSER;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object defaultValue_;
    private volatile Object extendee_;
    private volatile Object jsonName_;
    private int label_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private volatile Object typeName_;
    private int type_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$FieldDescriptorProto();
        PARSER = new C4341();
    }

    private DescriptorProtos$FieldDescriptorProto() {
        this.name_ = "";
        this.number_ = 0;
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.oneofIndex_ = 0;
        this.jsonName_ = "";
        this.proto3Optional_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.jsonName_ = "";
    }

    public static /* synthetic */ int access$9776(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, int i) {
        int i2 = i | descriptorProtos$FieldDescriptorProto.bitField0_;
        descriptorProtos$FieldDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11788;
    }

    public static C4108 newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FieldDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto) obj;
        if (hasName() != descriptorProtos$FieldDescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$FieldDescriptorProto.getName())) || hasNumber() != descriptorProtos$FieldDescriptorProto.hasNumber()) {
            return false;
        }
        if ((hasNumber() && getNumber() != descriptorProtos$FieldDescriptorProto.getNumber()) || hasLabel() != descriptorProtos$FieldDescriptorProto.hasLabel()) {
            return false;
        }
        if ((hasLabel() && this.label_ != descriptorProtos$FieldDescriptorProto.label_) || hasType() != descriptorProtos$FieldDescriptorProto.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != descriptorProtos$FieldDescriptorProto.type_) || hasTypeName() != descriptorProtos$FieldDescriptorProto.hasTypeName()) {
            return false;
        }
        if ((hasTypeName() && !getTypeName().equals(descriptorProtos$FieldDescriptorProto.getTypeName())) || hasExtendee() != descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            return false;
        }
        if ((hasExtendee() && !getExtendee().equals(descriptorProtos$FieldDescriptorProto.getExtendee())) || hasDefaultValue() != descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
            return false;
        }
        if ((hasDefaultValue() && !getDefaultValue().equals(descriptorProtos$FieldDescriptorProto.getDefaultValue())) || hasOneofIndex() != descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
            return false;
        }
        if ((hasOneofIndex() && getOneofIndex() != descriptorProtos$FieldDescriptorProto.getOneofIndex()) || hasJsonName() != descriptorProtos$FieldDescriptorProto.hasJsonName()) {
            return false;
        }
        if ((hasJsonName() && !getJsonName().equals(descriptorProtos$FieldDescriptorProto.getJsonName())) || hasOptions() != descriptorProtos$FieldDescriptorProto.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(descriptorProtos$FieldDescriptorProto.getOptions())) && hasProto3Optional() == descriptorProtos$FieldDescriptorProto.hasProto3Optional()) {
            return (!hasProto3Optional() || getProto3Optional() == descriptorProtos$FieldDescriptorProto.getProto3Optional()) && getUnknownFields().equals(descriptorProtos$FieldDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.defaultValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public ByteString getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.defaultValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11788;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public String getExtendee() {
        Object obj = this.extendee_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.extendee_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public ByteString getExtendeeBytes() {
        Object obj = this.extendee_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.extendee_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.jsonName_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public ByteString getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.jsonName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public Label getLabel() {
        Label labelForNumber = Label.forNumber(this.label_);
        return labelForNumber == null ? Label.LABEL_OPTIONAL : labelForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4337
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

    @Override // com.google.protobuf.InterfaceC4337
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public InterfaceC4347 getOptionsOrBuilder() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.extendee_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC4294.m8190(3, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC4294.m8191(4, this.label_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC4294.m8191(5, this.type_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(6, this.typeName_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(7, this.defaultValue_);
        }
        if ((this.bitField0_ & 512) != 0) {
            iComputeStringSize += AbstractC4294.m8198(8, getOptions());
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeStringSize += AbstractC4294.m8190(9, this.oneofIndex_);
        }
        if ((this.bitField0_ & 256) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(10, this.jsonName_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iComputeStringSize += AbstractC4294.m8193(17);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.TYPE_DOUBLE : typeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public String getTypeName() {
        Object obj = this.typeName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.typeName_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public ByteString getTypeNameBytes() {
        Object obj = this.typeName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasJsonName() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasOneofIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasProto3Optional() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4337
    public boolean hasTypeName() {
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
        if (hasNumber()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getNumber();
        }
        if (hasLabel()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + this.label_;
        }
        if (hasType()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.type_;
        }
        if (hasTypeName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + getTypeName().hashCode();
        }
        if (hasExtendee()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getExtendee().hashCode();
        }
        if (hasDefaultValue()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + getDefaultValue().hashCode();
        }
        if (hasOneofIndex()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 9, 53) + getOneofIndex();
        }
        if (hasJsonName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 10, 53) + getJsonName().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasProto3Optional()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 17, 53) + AbstractC4234.m8062(getProto3Optional());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11789;
        c4451.m8386(DescriptorProtos$FieldDescriptorProto.class, C4108.class);
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
    public C4108 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4108(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4108 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4108() : new C4108().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 32) != 0) {
            GeneratedMessage.writeString(abstractC4294, 2, this.extendee_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(3, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(4, this.label_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8210(5, this.type_);
        }
        if ((this.bitField0_ & 16) != 0) {
            GeneratedMessage.writeString(abstractC4294, 6, this.typeName_);
        }
        if ((this.bitField0_ & 64) != 0) {
            GeneratedMessage.writeString(abstractC4294, 7, this.defaultValue_);
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC4294.mo8208(8, getOptions());
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC4294.mo8210(9, this.oneofIndex_);
        }
        if ((this.bitField0_ & 256) != 0) {
            GeneratedMessage.writeString(abstractC4294, 10, this.jsonName_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC4294.mo8222(17, this.proto3Optional_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4108 extends GeneratedMessage.AbstractC4137 implements InterfaceC4337 {
        private int bitField0_;
        private Object defaultValue_;
        private Object extendee_;
        private Object jsonName_;
        private int label_;
        private Object name_;
        private int number_;
        private int oneofIndex_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$FieldOptions options_;
        private boolean proto3Optional_;
        private Object typeName_;
        private int type_;

        private C4108() {
            this.name_ = "";
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.jsonName_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$FieldDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$FieldDescriptorProto.number_ = this.number_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$FieldDescriptorProto.label_ = this.label_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$FieldDescriptorProto.type_ = this.type_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$FieldDescriptorProto.typeName_ = this.typeName_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$FieldDescriptorProto.extendee_ = this.extendee_;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                descriptorProtos$FieldDescriptorProto.defaultValue_ = this.defaultValue_;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                descriptorProtos$FieldDescriptorProto.oneofIndex_ = this.oneofIndex_;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                descriptorProtos$FieldDescriptorProto.jsonName_ = this.jsonName_;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$FieldDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$FieldOptions) c4174.m7943();
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                descriptorProtos$FieldDescriptorProto.proto3Optional_ = this.proto3Optional_;
                i |= 1024;
            }
            DescriptorProtos$FieldDescriptorProto.access$9776(descriptorProtos$FieldDescriptorProto, i);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11788;
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
        public DescriptorProtos$FieldDescriptorProto build() {
            DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$FieldDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$FieldDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FieldDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FieldDescriptorProto buildPartial() {
            DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FieldDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$FieldDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public C4108 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.number_ = 0;
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.oneofIndex_ = 0;
            this.jsonName_ = "";
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            this.proto3Optional_ = false;
            return this;
        }

        public C4108 clearDefaultValue() {
            this.defaultValue_ = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getDefaultValue();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C4108 clearExtendee() {
            this.extendee_ = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getExtendee();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4108 clearJsonName() {
            this.jsonName_ = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getJsonName();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public C4108 clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
            onChanged();
            return this;
        }

        public C4108 clearName() {
            this.name_ = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4108 clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
            onChanged();
            return this;
        }

        public C4108 clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
            onChanged();
            return this;
        }

        public C4108 clearOptions() {
            this.bitField0_ &= -513;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4108 clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
            onChanged();
            return this;
        }

        public C4108 clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
            onChanged();
            return this;
        }

        public C4108 clearTypeName() {
            this.typeName_ = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getTypeName();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11788;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public String getExtendee() {
            Object obj = this.extendee_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.extendee_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public ByteString getExtendeeBytes() {
            Object obj = this.extendee_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.extendee_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.jsonName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public ByteString getJsonNameBytes() {
            Object obj = this.jsonName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jsonName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public Label getLabel() {
            Label labelForNumber = Label.forNumber(this.label_);
            return labelForNumber == null ? Label.LABEL_OPTIONAL : labelForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4337
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

        @Override // com.google.protobuf.InterfaceC4337
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public DescriptorProtos$FieldOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FieldOptions) c4174.m7939();
            }
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
            return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
        }

        public DescriptorProtos$FieldOptions.C4111 getOptionsBuilder() {
            this.bitField0_ |= 512;
            onChanged();
            return (DescriptorProtos$FieldOptions.C4111) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4337
        public InterfaceC4347 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4347) c4174.m7938();
            }
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
            return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.TYPE_DOUBLE : typeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public String getTypeName() {
            Object obj = this.typeName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.typeName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public ByteString getTypeNameBytes() {
            Object obj = this.typeName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4337
        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11789;
            c4451.m8386(DescriptorProtos$FieldDescriptorProto.class, C4108.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4108 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                this.extendee_ = abstractC4306.mo8278();
                                this.bitField0_ |= 32;
                                break;
                            case 24:
                                this.number_ = abstractC4306.mo8276();
                                this.bitField0_ |= 2;
                                break;
                            case 32:
                                int iMo8283 = abstractC4306.mo8283();
                                if (Label.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(4, iMo8283);
                                } else {
                                    this.label_ = iMo8283;
                                    this.bitField0_ |= 4;
                                }
                                break;
                            case 40:
                                int iMo82832 = abstractC4306.mo8283();
                                if (Type.forNumber(iMo82832) == null) {
                                    mergeUnknownVarintField(5, iMo82832);
                                } else {
                                    this.type_ = iMo82832;
                                    this.bitField0_ |= 8;
                                }
                                break;
                            case 50:
                                this.typeName_ = abstractC4306.mo8278();
                                this.bitField0_ |= 16;
                                break;
                            case 58:
                                this.defaultValue_ = abstractC4306.mo8278();
                                this.bitField0_ |= 64;
                                break;
                            case 66:
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 512;
                                break;
                            case 72:
                                this.oneofIndex_ = abstractC4306.mo8276();
                                this.bitField0_ |= 128;
                                break;
                            case 82:
                                this.jsonName_ = abstractC4306.mo8278();
                                this.bitField0_ |= 256;
                                break;
                            case 136:
                                this.proto3Optional_ = abstractC4306.mo8279();
                                this.bitField0_ |= 1024;
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

        public C4108 mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FieldOptions);
            } else if ((this.bitField0_ & 512) == 0 || (descriptorProtos$FieldOptions2 = this.options_) == null || descriptorProtos$FieldOptions2 == DescriptorProtos$FieldOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$FieldOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$FieldOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 512;
                onChanged();
            }
            return this;
        }

        public C4108 setDefaultValue(String str) {
            str.getClass();
            this.defaultValue_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4108 setDefaultValueBytes(ByteString byteString) {
            byteString.getClass();
            this.defaultValue_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4108 setExtendee(String str) {
            str.getClass();
            this.extendee_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4108 setExtendeeBytes(ByteString byteString) {
            byteString.getClass();
            this.extendee_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4108 setJsonName(String str) {
            str.getClass();
            this.jsonName_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C4108 setJsonNameBytes(ByteString byteString) {
            byteString.getClass();
            this.jsonName_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C4108 setLabel(Label label) {
            label.getClass();
            this.bitField0_ |= 4;
            this.label_ = label.getNumber();
            onChanged();
            return this;
        }

        public C4108 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4108 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4108 setNumber(int i) {
            this.number_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4108 setOneofIndex(int i) {
            this.oneofIndex_ = i;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4108 setOptions(DescriptorProtos$FieldOptions.C4111 c4111) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4111.build();
            } else {
                c4174.m7946(c4111.build());
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C4108 setProto3Optional(boolean z) {
            this.proto3Optional_ = z;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public C4108 setType(Type type) {
            type.getClass();
            this.bitField0_ |= 8;
            this.type_ = type.getNumber();
            onChanged();
            return this;
        }

        public C4108 setTypeName(String str) {
            str.getClass();
            this.typeName_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4108 setTypeNameBytes(ByteString byteString) {
            byteString.getClass();
            this.typeName_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$FieldDescriptorProto.getDefaultInstance();
        }

        private C4108(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.jsonName_ = "";
            maybeForceBuilderInitialization();
        }

        public C4108 setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$FieldOptions.getClass();
                this.options_ = descriptorProtos$FieldOptions;
            } else {
                c4174.m7946(descriptorProtos$FieldOptions);
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4108 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FieldDescriptorProto) {
                return mergeFrom((DescriptorProtos$FieldDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4108 mergeFrom(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            if (descriptorProtos$FieldDescriptorProto == DescriptorProtos$FieldDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$FieldDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$FieldDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$FieldDescriptorProto.hasNumber()) {
                setNumber(descriptorProtos$FieldDescriptorProto.getNumber());
            }
            if (descriptorProtos$FieldDescriptorProto.hasLabel()) {
                setLabel(descriptorProtos$FieldDescriptorProto.getLabel());
            }
            if (descriptorProtos$FieldDescriptorProto.hasType()) {
                setType(descriptorProtos$FieldDescriptorProto.getType());
            }
            if (descriptorProtos$FieldDescriptorProto.hasTypeName()) {
                this.typeName_ = descriptorProtos$FieldDescriptorProto.typeName_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                this.extendee_ = descriptorProtos$FieldDescriptorProto.extendee_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
                this.defaultValue_ = descriptorProtos$FieldDescriptorProto.defaultValue_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                setOneofIndex(descriptorProtos$FieldDescriptorProto.getOneofIndex());
            }
            if (descriptorProtos$FieldDescriptorProto.hasJsonName()) {
                this.jsonName_ = descriptorProtos$FieldDescriptorProto.jsonName_;
                this.bitField0_ |= 256;
                onChanged();
            }
            if (descriptorProtos$FieldDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$FieldDescriptorProto.getOptions());
            }
            if (descriptorProtos$FieldDescriptorProto.hasProto3Optional()) {
                setProto3Optional(descriptorProtos$FieldDescriptorProto.getProto3Optional());
            }
            mergeUnknownFields(descriptorProtos$FieldDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4108 newBuilderForType() {
        return newBuilder();
    }

    public static C4108 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Label implements InterfaceC4213 {
        LABEL_OPTIONAL(1),
        LABEL_REPEATED(3),
        LABEL_REQUIRED(2);

        public static final int LABEL_OPTIONAL_VALUE = 1;
        public static final int LABEL_REPEATED_VALUE = 3;
        public static final int LABEL_REQUIRED_VALUE = 2;
        private static final Label[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Label");
            internalValueMap = new C4340();
            VALUES = values();
        }

        Label(int i) {
            this.value = i;
        }

        public static Label forNumber(int i) {
            if (i == 1) {
                return LABEL_OPTIONAL;
            }
            if (i == 2) {
                return LABEL_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return LABEL_REPEATED;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldDescriptorProto.getDescriptor().f11722[1];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Label valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                return VALUES[c4496.f11730];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            return this.value;
        }

        public final C4496 getValueDescriptor() {
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static Label valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Type implements InterfaceC4213 {
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        private static final Type[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Type");
            internalValueMap = new C4336();
            VALUES = values();
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldDescriptorProto.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Type valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                return VALUES[c4496.f11730];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            return this.value;
        }

        public final C4496 getValueDescriptor() {
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private DescriptorProtos$FieldDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.number_ = 0;
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.oneofIndex_ = 0;
        this.jsonName_ = "";
        this.proto3Optional_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }
}

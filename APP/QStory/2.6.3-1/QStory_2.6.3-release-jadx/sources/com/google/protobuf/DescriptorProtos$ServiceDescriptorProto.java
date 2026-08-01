package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessage implements InterfaceC4322 {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$MethodDescriptorProto> method_;
    private volatile Object name_;
    private DescriptorProtos$ServiceOptions options_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "ServiceDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$ServiceDescriptorProto();
        PARSER = new C4323();
    }

    private DescriptorProtos$ServiceDescriptorProto() {
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.method_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$14376(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, int i) {
        int i2 = i | descriptorProtos$ServiceDescriptorProto.bitField0_;
        descriptorProtos$ServiceDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11765;
    }

    public static C4122 newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$ServiceDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto) obj;
        if (hasName() != descriptorProtos$ServiceDescriptorProto.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(descriptorProtos$ServiceDescriptorProto.getName())) && getMethodList().equals(descriptorProtos$ServiceDescriptorProto.getMethodList()) && hasOptions() == descriptorProtos$ServiceDescriptorProto.hasOptions()) {
            return (!hasOptions() || getOptions().equals(descriptorProtos$ServiceDescriptorProto.getOptions())) && getUnknownFields().equals(descriptorProtos$ServiceDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11765;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4322
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // com.google.protobuf.InterfaceC4322
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public InterfaceC4331 getMethodOrBuilder(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4322
    public List<? extends InterfaceC4331> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC4322
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

    @Override // com.google.protobuf.InterfaceC4322
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public InterfaceC4486 getOptionsOrBuilder() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.method_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.method_.get(i2));
        }
        int iM8198 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM8198 += AbstractC4294.m8198(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8198;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4322
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
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
        if (getMethodCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getMethodList().hashCode();
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
        C4451 c4451 = AbstractC4502.f11764;
        c4451.m8386(DescriptorProtos$ServiceDescriptorProto.class, C4122.class);
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
        for (int i = 0; i < getMethodCount(); i++) {
            if (!getMethod(i).isInitialized()) {
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
    public C4122 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4122(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4122 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4122() : new C4122().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.method_.size(); i++) {
            abstractC4294.mo8208(2, this.method_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8208(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4122 extends GeneratedMessage.AbstractC4137 implements InterfaceC4322 {
        private int bitField0_;
        private C4195 methodBuilder_;
        private List<DescriptorProtos$MethodDescriptorProto> method_;
        private Object name_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$ServiceOptions options_;

        private C4122() {
            this.name_ = "";
            this.method_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$ServiceDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$ServiceDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$ServiceOptions) c4174.m7943();
                i |= 2;
            }
            DescriptorProtos$ServiceDescriptorProto.access$14376(descriptorProtos$ServiceDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                descriptorProtos$ServiceDescriptorProto.method_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.method_ = Collections.unmodifiableList(this.method_);
                this.bitField0_ &= -3;
            }
            descriptorProtos$ServiceDescriptorProto.method_ = this.method_;
        }

        private void ensureMethodIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.method_ = new ArrayList(this.method_);
                this.bitField0_ |= 2;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11765;
        }

        private C4195 internalGetMethodFieldBuilder() {
            if (this.methodBuilder_ == null) {
                this.methodBuilder_ = new C4195(this.method_, getParentForChildren(), isClean());
                this.method_ = null;
            }
            return this.methodBuilder_;
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
                internalGetMethodFieldBuilder();
                internalGetOptionsFieldBuilder();
            }
        }

        public C4122 addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureMethodIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.method_);
            onChanged();
            return this;
        }

        public C4122 addMethod(DescriptorProtos$MethodDescriptorProto.C4118 c4118) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4118.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.add(c4118.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$MethodDescriptorProto.C4118 addMethodBuilder() {
            return (DescriptorProtos$MethodDescriptorProto.C4118) internalGetMethodFieldBuilder().m8019(DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$ServiceDescriptorProto build() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$ServiceDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$ServiceDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$ServiceDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$ServiceDescriptorProto buildPartial() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$ServiceDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ServiceDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$ServiceDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4122 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.methodBuilder_;
            if (c4195 == null) {
                this.method_ = Collections.EMPTY_LIST;
            } else {
                this.method_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C4122 clearMethod() {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.method_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4122 clearName() {
            this.name_ = DescriptorProtos$ServiceDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4122 clearOptions() {
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11765;
        }

        @Override // com.google.protobuf.InterfaceC4322
        public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
            C4195 c4195 = this.methodBuilder_;
            return c4195 == null ? this.method_.get(i) : (DescriptorProtos$MethodDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$MethodDescriptorProto.C4118 getMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C4118) internalGetMethodFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$MethodDescriptorProto.C4118> getMethodBuilderList() {
            return internalGetMethodFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4322
        public int getMethodCount() {
            C4195 c4195 = this.methodBuilder_;
            return c4195 == null ? this.method_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4322
        public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
            C4195 c4195 = this.methodBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.method_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4322
        public InterfaceC4331 getMethodOrBuilder(int i) {
            C4195 c4195 = this.methodBuilder_;
            return c4195 == null ? this.method_.get(i) : (InterfaceC4331) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4322
        public List<? extends InterfaceC4331> getMethodOrBuilderList() {
            C4195 c4195 = this.methodBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.method_);
        }

        @Override // com.google.protobuf.InterfaceC4322
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

        @Override // com.google.protobuf.InterfaceC4322
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4322
        public DescriptorProtos$ServiceOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$ServiceOptions) c4174.m7939();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        public DescriptorProtos$ServiceOptions.C4123 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$ServiceOptions.C4123) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4322
        public InterfaceC4486 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4486) c4174.m7938();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        @Override // com.google.protobuf.InterfaceC4322
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4322
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11764;
            c4451.m8386(DescriptorProtos$ServiceDescriptorProto.class, C4122.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getMethodCount(); i++) {
                if (!getMethod(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C4122 mergeFrom(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            if (descriptorProtos$ServiceDescriptorProto == DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$ServiceDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$ServiceDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.methodBuilder_ == null) {
                if (!descriptorProtos$ServiceDescriptorProto.method_.isEmpty()) {
                    if (this.method_.isEmpty()) {
                        this.method_ = descriptorProtos$ServiceDescriptorProto.method_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodIsMutable();
                        this.method_.addAll(descriptorProtos$ServiceDescriptorProto.method_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$ServiceDescriptorProto.method_.isEmpty()) {
                boolean zIsEmpty = this.methodBuilder_.f11357.isEmpty();
                C4195 c4195 = this.methodBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.methodBuilder_ = null;
                    this.method_ = descriptorProtos$ServiceDescriptorProto.method_;
                    this.bitField0_ &= -3;
                    this.methodBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$ServiceDescriptorProto.method_);
                }
            }
            if (descriptorProtos$ServiceDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$ServiceDescriptorProto.getOptions());
            }
            mergeUnknownFields(descriptorProtos$ServiceDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C4122 mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$ServiceOptions);
            } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$ServiceOptions2 = this.options_) == null || descriptorProtos$ServiceOptions2 == DescriptorProtos$ServiceOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$ServiceOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$ServiceOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public C4122 removeMethod(int i) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureMethodIsMutable();
            this.method_.remove(i);
            onChanged();
            return this;
        }

        public C4122 setMethod(int i, DescriptorProtos$MethodDescriptorProto.C4118 c4118) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4118.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.set(i, c4118.build());
            onChanged();
            return this;
        }

        public C4122 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4122 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4122 setOptions(DescriptorProtos$ServiceOptions.C4123 c4123) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4123.build();
            } else {
                c4174.m7946(c4123.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$ServiceDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$MethodDescriptorProto.C4118 addMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C4118) internalGetMethodFieldBuilder().m8020(i, DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        private C4122(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.method_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C4122 addMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C4122 setMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.set(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C4122 setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$ServiceOptions.getClass();
                this.options_ = descriptorProtos$ServiceOptions;
            } else {
                c4174.m7946(descriptorProtos$ServiceOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4122 addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C4122 addMethod(int i, DescriptorProtos$MethodDescriptorProto.C4118 c4118) {
            C4195 c4195 = this.methodBuilder_;
            if (c4195 == null) {
                ensureMethodIsMutable();
                this.method_.add(i, c4118.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4118.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4122 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$ServiceDescriptorProto) {
                return mergeFrom((DescriptorProtos$ServiceDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4122 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = (DescriptorProtos$MethodDescriptorProto) abstractC4306.mo8274(DescriptorProtos$MethodDescriptorProto.parser(), c4529);
                                C4195 c4195 = this.methodBuilder_;
                                if (c4195 == null) {
                                    ensureMethodIsMutable();
                                    this.method_.add(descriptorProtos$MethodDescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$MethodDescriptorProto);
                                }
                            } else if (iMo8264 != 26) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4;
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
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4122 newBuilderForType() {
        return newBuilder();
    }

    public static C4122 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private DescriptorProtos$ServiceDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

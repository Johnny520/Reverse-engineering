package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
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
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessage implements InterfaceC3490 {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$MethodDescriptorProto> method_;
    private volatile Object name_;
    private DescriptorProtos$ServiceOptions options_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "ServiceDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$ServiceDescriptorProto();
        PARSER = new C3491();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11420;
    }

    public static C3290 newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11420;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3490
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // com.google.protobuf.InterfaceC3490
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public InterfaceC3499 getMethodOrBuilder(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3490
    public List<? extends InterfaceC3499> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC3490
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

    @Override // com.google.protobuf.InterfaceC3490
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public InterfaceC3654 getOptionsOrBuilder() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.method_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.method_.get(i2));
        }
        int iM7639 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM7639 += AbstractC3462.m7639(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7639;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3490
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
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
        if (getMethodCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getMethodList().hashCode();
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
        C3619 c3619 = AbstractC3670.f11419;
        c3619.m7827(DescriptorProtos$ServiceDescriptorProto.class, C3290.class);
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

    @Override // com.google.protobuf.AbstractC3533
    public C3290 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3290(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3290 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3290() : new C3290().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.method_.size(); i++) {
            abstractC3462.mo7649(2, this.method_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3290 extends GeneratedMessage.AbstractC3305 implements InterfaceC3490 {
        private int bitField0_;
        private C3363 methodBuilder_;
        private List<DescriptorProtos$MethodDescriptorProto> method_;
        private Object name_;
        private C3342 optionsBuilder_;
        private DescriptorProtos$ServiceOptions options_;

        private C3290() {
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
                C3342 c3342 = this.optionsBuilder_;
                descriptorProtos$ServiceDescriptorProto.options_ = c3342 == null ? this.options_ : (DescriptorProtos$ServiceOptions) c3342.m7384();
                i |= 2;
            }
            DescriptorProtos$ServiceDescriptorProto.access$14376(descriptorProtos$ServiceDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                descriptorProtos$ServiceDescriptorProto.method_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11420;
        }

        private C3363 internalGetMethodFieldBuilder() {
            if (this.methodBuilder_ == null) {
                this.methodBuilder_ = new C3363(this.method_, getParentForChildren(), isClean());
                this.method_ = null;
            }
            return this.methodBuilder_;
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
                internalGetMethodFieldBuilder();
                internalGetOptionsFieldBuilder();
            }
        }

        public C3290 addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureMethodIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.method_);
            onChanged();
            return this;
        }

        public C3290 addMethod(DescriptorProtos$MethodDescriptorProto.C3286 c3286) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3286.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.add(c3286.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$MethodDescriptorProto.C3286 addMethodBuilder() {
            return (DescriptorProtos$MethodDescriptorProto.C3286) internalGetMethodFieldBuilder().m7460(DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$ServiceDescriptorProto build() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$ServiceDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$ServiceDescriptorProtoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$ServiceDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$ServiceDescriptorProto buildPartial() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$ServiceDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ServiceDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$ServiceDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3290 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.methodBuilder_;
            if (c3363 == null) {
                this.method_ = Collections.EMPTY_LIST;
            } else {
                this.method_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3290 clearMethod() {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.method_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3290 clearName() {
            this.name_ = DescriptorProtos$ServiceDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3290 clearOptions() {
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11420;
        }

        @Override // com.google.protobuf.InterfaceC3490
        public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
            C3363 c3363 = this.methodBuilder_;
            return c3363 == null ? this.method_.get(i) : (DescriptorProtos$MethodDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$MethodDescriptorProto.C3286 getMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C3286) internalGetMethodFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$MethodDescriptorProto.C3286> getMethodBuilderList() {
            return internalGetMethodFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3490
        public int getMethodCount() {
            C3363 c3363 = this.methodBuilder_;
            return c3363 == null ? this.method_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3490
        public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
            C3363 c3363 = this.methodBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.method_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3490
        public InterfaceC3499 getMethodOrBuilder(int i) {
            C3363 c3363 = this.methodBuilder_;
            return c3363 == null ? this.method_.get(i) : (InterfaceC3499) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3490
        public List<? extends InterfaceC3499> getMethodOrBuilderList() {
            C3363 c3363 = this.methodBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.method_);
        }

        @Override // com.google.protobuf.InterfaceC3490
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

        @Override // com.google.protobuf.InterfaceC3490
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3490
        public DescriptorProtos$ServiceOptions getOptions() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$ServiceOptions) c3342.m7380();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        public DescriptorProtos$ServiceOptions.C3291 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$ServiceOptions.C3291) internalGetOptionsFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3490
        public InterfaceC3654 getOptionsOrBuilder() {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                return (InterfaceC3654) c3342.m7379();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        @Override // com.google.protobuf.InterfaceC3490
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3490
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11419;
            c3619.m7827(DescriptorProtos$ServiceDescriptorProto.class, C3290.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getMethodCount(); i++) {
                if (!getMethod(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C3290 mergeFrom(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
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
                boolean zIsEmpty = this.methodBuilder_.f11012.isEmpty();
                C3363 c3363 = this.methodBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.methodBuilder_ = null;
                    this.method_ = descriptorProtos$ServiceDescriptorProto.method_;
                    this.bitField0_ &= -3;
                    this.methodBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$ServiceDescriptorProto.method_);
                }
            }
            if (descriptorProtos$ServiceDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$ServiceDescriptorProto.getOptions());
            }
            mergeUnknownFields(descriptorProtos$ServiceDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C3290 mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2;
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$ServiceOptions);
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

        public C3290 removeMethod(int i) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureMethodIsMutable();
            this.method_.remove(i);
            onChanged();
            return this;
        }

        public C3290 setMethod(int i, DescriptorProtos$MethodDescriptorProto.C3286 c3286) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3286.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.set(i, c3286.build());
            onChanged();
            return this;
        }

        public C3290 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3290 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3290 setOptions(DescriptorProtos$ServiceOptions.C3291 c3291) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                this.options_ = c3291.build();
            } else {
                c3342.m7387(c3291.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$ServiceDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$MethodDescriptorProto.C3286 addMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C3286) internalGetMethodFieldBuilder().m7461(i, DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        private C3290(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            this.method_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C3290 addMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3290 setMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.set(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3290 setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            C3342 c3342 = this.optionsBuilder_;
            if (c3342 == null) {
                descriptorProtos$ServiceOptions.getClass();
                this.options_ = descriptorProtos$ServiceOptions;
            } else {
                c3342.m7387(descriptorProtos$ServiceOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3290 addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3290 addMethod(int i, DescriptorProtos$MethodDescriptorProto.C3286 c3286) {
            C3363 c3363 = this.methodBuilder_;
            if (c3363 == null) {
                ensureMethodIsMutable();
                this.method_.add(i, c3286.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3286.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3290 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$ServiceDescriptorProto) {
                return mergeFrom((DescriptorProtos$ServiceDescriptorProto) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3290 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = (DescriptorProtos$MethodDescriptorProto) abstractC3474.mo7715(DescriptorProtos$MethodDescriptorProto.parser(), c3697);
                                C3363 c3363 = this.methodBuilder_;
                                if (c3363 == null) {
                                    ensureMethodIsMutable();
                                    this.method_.add(descriptorProtos$MethodDescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$MethodDescriptorProto);
                                }
                            } else if (iMo7705 != 26) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                abstractC3474.mo7716(internalGetOptionsFieldBuilder().m7381(), c3697);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3290 newBuilderForType() {
        return newBuilder();
    }

    public static C3290 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private DescriptorProtos$ServiceDescriptorProto(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

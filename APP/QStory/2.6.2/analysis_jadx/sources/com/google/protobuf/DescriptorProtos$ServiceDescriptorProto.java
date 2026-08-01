package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessage implements InterfaceC3489 {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$MethodDescriptorProto> method_;
    private volatile Object name_;
    private DescriptorProtos$ServiceOptions options_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "ServiceDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$ServiceDescriptorProto();
        PARSER = new C3490();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11415;
    }

    public static C3289 newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11415;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3489
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // com.google.protobuf.InterfaceC3489
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public InterfaceC3498 getMethodOrBuilder(int i) {
        return this.method_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3489
    public List<? extends InterfaceC3498> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC3489
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

    @Override // com.google.protobuf.InterfaceC3489
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public InterfaceC3653 getOptionsOrBuilder() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.method_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.method_.get(i2));
        }
        int iM7652 = iComputeStringSize + size;
        if ((this.bitField0_ & 2) != 0) {
            iM7652 += AbstractC3461.m7652(3, getOptions());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7652;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3489
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
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
        if (getMethodCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getMethodList().hashCode();
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
        C3618 c3618 = AbstractC3669.f11414;
        c3618.m7840(DescriptorProtos$ServiceDescriptorProto.class, C3289.class);
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

    @Override // com.google.protobuf.AbstractC3532
    public C3289 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3289(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3289 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3289() : new C3289().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.method_.size(); i++) {
            abstractC3461.mo7662(2, this.method_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7662(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3289 extends GeneratedMessage.AbstractC3304 implements InterfaceC3489 {
        private int bitField0_;
        private C3362 methodBuilder_;
        private List<DescriptorProtos$MethodDescriptorProto> method_;
        private Object name_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$ServiceOptions options_;

        private C3289() {
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
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$ServiceDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$ServiceOptions) c3341.m7397();
                i |= 2;
            }
            DescriptorProtos$ServiceDescriptorProto.access$14376(descriptorProtos$ServiceDescriptorProto, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                descriptorProtos$ServiceDescriptorProto.method_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11415;
        }

        private C3362 internalGetMethodFieldBuilder() {
            if (this.methodBuilder_ == null) {
                this.methodBuilder_ = new C3362(this.method_, getParentForChildren(), isClean());
                this.method_ = null;
            }
            return this.methodBuilder_;
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
                internalGetMethodFieldBuilder();
                internalGetOptionsFieldBuilder();
            }
        }

        public C3289 addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureMethodIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.method_);
            onChanged();
            return this;
        }

        public C3289 addMethod(DescriptorProtos$MethodDescriptorProto.C3285 c3285) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3285.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.add(c3285.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$MethodDescriptorProto.C3285 addMethodBuilder() {
            return (DescriptorProtos$MethodDescriptorProto.C3285) internalGetMethodFieldBuilder().m7473(DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$ServiceDescriptorProto build() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$ServiceDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$ServiceDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$ServiceDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$ServiceDescriptorProto buildPartial() {
            DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto(this);
            buildPartialRepeatedFields(descriptorProtos$ServiceDescriptorProto);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$ServiceDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$ServiceDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3289 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.methodBuilder_;
            if (c3362 == null) {
                this.method_ = Collections.EMPTY_LIST;
            } else {
                this.method_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -3;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            return this;
        }

        public C3289 clearMethod() {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.method_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3289 clearName() {
            this.name_ = DescriptorProtos$ServiceDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3289 clearOptions() {
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11415;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public DescriptorProtos$MethodDescriptorProto getMethod(int i) {
            C3362 c3362 = this.methodBuilder_;
            return c3362 == null ? this.method_.get(i) : (DescriptorProtos$MethodDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$MethodDescriptorProto.C3285 getMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C3285) internalGetMethodFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$MethodDescriptorProto.C3285> getMethodBuilderList() {
            return internalGetMethodFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3489
        public int getMethodCount() {
            C3362 c3362 = this.methodBuilder_;
            return c3362 == null ? this.method_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3489
        public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
            C3362 c3362 = this.methodBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.method_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3489
        public InterfaceC3498 getMethodOrBuilder(int i) {
            C3362 c3362 = this.methodBuilder_;
            return c3362 == null ? this.method_.get(i) : (InterfaceC3498) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3489
        public List<? extends InterfaceC3498> getMethodOrBuilderList() {
            C3362 c3362 = this.methodBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.method_);
        }

        @Override // com.google.protobuf.InterfaceC3489
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

        @Override // com.google.protobuf.InterfaceC3489
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public DescriptorProtos$ServiceOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$ServiceOptions) c3341.m7393();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        public DescriptorProtos$ServiceOptions.C3290 getOptionsBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$ServiceOptions.C3290) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3489
        public InterfaceC3653 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3653) c3341.m7392();
            }
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
            return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3489
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11414;
            c3618.m7840(DescriptorProtos$ServiceDescriptorProto.class, C3289.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getMethodCount(); i++) {
                if (!getMethod(i).isInitialized()) {
                    return false;
                }
            }
            return !hasOptions() || getOptions().isInitialized();
        }

        public C3289 mergeFrom(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
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
                boolean zIsEmpty = this.methodBuilder_.f11007.isEmpty();
                C3362 c3362 = this.methodBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.methodBuilder_ = null;
                    this.method_ = descriptorProtos$ServiceDescriptorProto.method_;
                    this.bitField0_ &= -3;
                    this.methodBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$ServiceDescriptorProto.method_);
                }
            }
            if (descriptorProtos$ServiceDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$ServiceDescriptorProto.getOptions());
            }
            mergeUnknownFields(descriptorProtos$ServiceDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }

        public C3289 mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$ServiceOptions);
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

        public C3289 removeMethod(int i) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureMethodIsMutable();
            this.method_.remove(i);
            onChanged();
            return this;
        }

        public C3289 setMethod(int i, DescriptorProtos$MethodDescriptorProto.C3285 c3285) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3285.build());
                return this;
            }
            ensureMethodIsMutable();
            this.method_.set(i, c3285.build());
            onChanged();
            return this;
        }

        public C3289 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3289 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3289 setOptions(DescriptorProtos$ServiceOptions.C3290 c3290) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3290.build();
            } else {
                c3341.m7400(c3290.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$ServiceDescriptorProto.getDefaultInstance();
        }

        public DescriptorProtos$MethodDescriptorProto.C3285 addMethodBuilder(int i) {
            return (DescriptorProtos$MethodDescriptorProto.C3285) internalGetMethodFieldBuilder().m7474(i, DescriptorProtos$MethodDescriptorProto.getDefaultInstance());
        }

        private C3289(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.method_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C3289 addMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3289 setMethod(int i, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.set(i, descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3289 setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$ServiceOptions.getClass();
                this.options_ = descriptorProtos$ServiceOptions;
            } else {
                c3341.m7400(descriptorProtos$ServiceOptions);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3289 addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 == null) {
                descriptorProtos$MethodDescriptorProto.getClass();
                ensureMethodIsMutable();
                this.method_.add(descriptorProtos$MethodDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public C3289 addMethod(int i, DescriptorProtos$MethodDescriptorProto.C3285 c3285) {
            C3362 c3362 = this.methodBuilder_;
            if (c3362 == null) {
                ensureMethodIsMutable();
                this.method_.add(i, c3285.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3285.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3289 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$ServiceDescriptorProto) {
                return mergeFrom((DescriptorProtos$ServiceDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3289 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = (DescriptorProtos$MethodDescriptorProto) abstractC3473.mo7728(DescriptorProtos$MethodDescriptorProto.parser(), c3696);
                                C3362 c3362 = this.methodBuilder_;
                                if (c3362 == null) {
                                    ensureMethodIsMutable();
                                    this.method_.add(descriptorProtos$MethodDescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$MethodDescriptorProto);
                                }
                            } else if (iMo7718 != 26) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3289 newBuilderForType() {
        return newBuilder();
    }

    public static C3289 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private DescriptorProtos$ServiceDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

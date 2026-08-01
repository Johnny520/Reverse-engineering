package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FileDescriptorSet> implements InterfaceC3496 {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private List<DescriptorProtos$FileDescriptorProto> file_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorSet();
        PARSER = new C3492();
    }

    private DescriptorProtos$FileDescriptorSet() {
        this.memoizedIsInitialized = (byte) -1;
        this.file_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11432;
    }

    public static C3281 newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FileDescriptorSet)) {
            return super.equals(obj);
        }
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = (DescriptorProtos$FileDescriptorSet) obj;
        return getFileList().equals(descriptorProtos$FileDescriptorSet.getFileList()) && getUnknownFields().equals(descriptorProtos$FileDescriptorSet.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$FileDescriptorSet.getExtensionFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11432;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3496
    public DescriptorProtos$FileDescriptorProto getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3496
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.InterfaceC3496
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.InterfaceC3496
    public InterfaceC3493 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3496
    public List<? extends InterfaceC3493> getFileOrBuilderList() {
        return this.file_;
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
        int size = this.file_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7643 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11431;
        c3619.m7827(DescriptorProtos$FileDescriptorSet.class, C3281.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getFileCount(); i++) {
            if (!getFile(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3281 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3281(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3281 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3281() : new C3281().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC3462.mo7649(1, this.file_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536000001, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3281 extends GeneratedMessage.AbstractC3304 implements InterfaceC3496 {
        private int bitField0_;
        private C3363 fileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> file_;

        private C3281() {
            this.file_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                descriptorProtos$FileDescriptorSet.file_ = c3363.m7472();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.file_ = Collections.unmodifiableList(this.file_);
                this.bitField0_ &= -2;
            }
            descriptorProtos$FileDescriptorSet.file_ = this.file_;
        }

        private void ensureFileIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.file_ = new ArrayList(this.file_);
                this.bitField0_ |= 1;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11432;
        }

        private C3363 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C3363(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C3281 addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public <Type> C3281 addExtension(C3616 c3616, Type type) {
            return (C3281) addExtension((AbstractC3579) c3616, type);
        }

        public C3281 addFile(DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3280.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c3280.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetFileFieldBuilder().m7460(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileDescriptorSet build() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSetBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorSetBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorSetBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FileDescriptorSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileDescriptorSet buildPartial() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorSet);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorSet);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3281 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C3281 clearExtension(C3616 c3616) {
            return (C3281) clearExtension((AbstractC3579) c3616);
        }

        public C3281 clearFile() {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11432;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3496
        public DescriptorProtos$FileDescriptorProto getFile(int i) {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.get(i) : (DescriptorProtos$FileDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3280 getFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetFileFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3280> getFileBuilderList() {
            return internalGetFileFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3496
        public int getFileCount() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3496
        public List<DescriptorProtos$FileDescriptorProto> getFileList() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.file_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3496
        public InterfaceC3493 getFileOrBuilder(int i) {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.get(i) : (InterfaceC3493) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3496
        public List<? extends InterfaceC3493> getFileOrBuilderList() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11431;
            c3619.m7827(DescriptorProtos$FileDescriptorSet.class, C3281.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getFileCount(); i++) {
                if (!getFile(i).isInitialized()) {
                    return false;
                }
            }
            return extensionsAreInitialized();
        }

        public C3281 mergeFrom(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
            if (descriptorProtos$FileDescriptorSet == DescriptorProtos$FileDescriptorSet.getDefaultInstance()) {
                return this;
            }
            if (this.fileBuilder_ == null) {
                if (!descriptorProtos$FileDescriptorSet.file_.isEmpty()) {
                    if (this.file_.isEmpty()) {
                        this.file_ = descriptorProtos$FileDescriptorSet.file_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFileIsMutable();
                        this.file_.addAll(descriptorProtos$FileDescriptorSet.file_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileDescriptorSet.file_.isEmpty()) {
                boolean zIsEmpty = this.fileBuilder_.f11012.isEmpty();
                C3363 c3363 = this.fileBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.fileBuilder_ = null;
                    this.file_ = descriptorProtos$FileDescriptorSet.file_;
                    this.bitField0_ &= -2;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$FileDescriptorSet.file_);
                }
            }
            mergeExtensionFields(descriptorProtos$FileDescriptorSet);
            mergeUnknownFields(descriptorProtos$FileDescriptorSet.getUnknownFields());
            onChanged();
            return this;
        }

        public C3281 removeFile(int i) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C3281 setExtension(C3616 c3616, Type type) {
            return (C3281) setExtension((AbstractC3579) c3616, type);
        }

        public C3281 setFile(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3280.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c3280.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3281 setExtension(C3616 c3616, int i, Type type) {
            return (C3281) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3281(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.file_ = Collections.EMPTY_LIST;
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetFileFieldBuilder().m7461(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        }

        public C3281 addFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3281 setFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3281 addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3281 addFile(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c3280.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3280.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3281 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FileDescriptorSet) {
                return mergeFrom((DescriptorProtos$FileDescriptorSet) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3281 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 != 10) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FileDescriptorProto.parser(), c3697);
                                C3363 c3363 = this.fileBuilder_;
                                if (c3363 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$FileDescriptorProto);
                                }
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3281 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$FileDescriptorSet(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3281 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

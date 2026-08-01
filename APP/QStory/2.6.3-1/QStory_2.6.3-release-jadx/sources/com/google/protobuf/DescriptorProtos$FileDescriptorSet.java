package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FileDescriptorSet> implements InterfaceC4328 {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private List<DescriptorProtos$FileDescriptorProto> file_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorSet();
        PARSER = new C4324();
    }

    private DescriptorProtos$FileDescriptorSet() {
        this.memoizedIsInitialized = (byte) -1;
        this.file_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11777;
    }

    public static C4113 newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11777;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4328
    public DescriptorProtos$FileDescriptorProto getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4328
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.InterfaceC4328
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.InterfaceC4328
    public InterfaceC4325 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4328
    public List<? extends InterfaceC4325> getFileOrBuilderList() {
        return this.file_;
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
        int size = this.file_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM8202 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC4365.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11776;
        c4451.m8386(DescriptorProtos$FileDescriptorSet.class, C4113.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
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

    @Override // com.google.protobuf.AbstractC4365
    public C4113 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4113(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4113 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4113() : new C4113().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC4294.mo8208(1, this.file_.get(i));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536000001, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4113 extends GeneratedMessage.AbstractC4136 implements InterfaceC4328 {
        private int bitField0_;
        private C4195 fileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> file_;

        private C4113() {
            this.file_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                descriptorProtos$FileDescriptorSet.file_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11777;
        }

        private C4195 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C4195(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C4113 addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public <Type> C4113 addExtension(C4448 c4448, Type type) {
            return (C4113) addExtension((AbstractC4411) c4448, type);
        }

        public C4113 addFile(DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4112.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c4112.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetFileFieldBuilder().m8019(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FileDescriptorSet build() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSetBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorSetBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorSetBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FileDescriptorSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FileDescriptorSet buildPartial() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorSet);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorSet);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4113 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C4113 clearExtension(C4448 c4448) {
            return (C4113) clearExtension((AbstractC4411) c4448);
        }

        public C4113 clearFile() {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11777;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4328
        public DescriptorProtos$FileDescriptorProto getFile(int i) {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.get(i) : (DescriptorProtos$FileDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C4112 getFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetFileFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C4112> getFileBuilderList() {
            return internalGetFileFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4328
        public int getFileCount() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4328
        public List<DescriptorProtos$FileDescriptorProto> getFileList() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.file_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4328
        public InterfaceC4325 getFileOrBuilder(int i) {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.get(i) : (InterfaceC4325) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4328
        public List<? extends InterfaceC4325> getFileOrBuilderList() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11776;
            c4451.m8386(DescriptorProtos$FileDescriptorSet.class, C4113.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getFileCount(); i++) {
                if (!getFile(i).isInitialized()) {
                    return false;
                }
            }
            return extensionsAreInitialized();
        }

        public C4113 mergeFrom(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
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
                boolean zIsEmpty = this.fileBuilder_.f11357.isEmpty();
                C4195 c4195 = this.fileBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.fileBuilder_ = null;
                    this.file_ = descriptorProtos$FileDescriptorSet.file_;
                    this.bitField0_ &= -2;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$FileDescriptorSet.file_);
                }
            }
            mergeExtensionFields(descriptorProtos$FileDescriptorSet);
            mergeUnknownFields(descriptorProtos$FileDescriptorSet.getUnknownFields());
            onChanged();
            return this;
        }

        public C4113 removeFile(int i) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C4113 setExtension(C4448 c4448, Type type) {
            return (C4113) setExtension((AbstractC4411) c4448, type);
        }

        public C4113 setFile(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4112.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c4112.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4113 setExtension(C4448 c4448, int i, Type type) {
            return (C4113) setExtension((AbstractC4411) c4448, i, type);
        }

        private C4113(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.file_ = Collections.EMPTY_LIST;
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetFileFieldBuilder().m8020(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        }

        public C4113 addFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4113 setFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4113 addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4113 addFile(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c4112.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4112.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4113 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FileDescriptorSet) {
                return mergeFrom((DescriptorProtos$FileDescriptorSet) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4113 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 != 10) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FileDescriptorProto.parser(), c4529);
                                C4195 c4195 = this.fileBuilder_;
                                if (c4195 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$FileDescriptorProto);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
        return super.getExtension(abstractC4411, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
        return super.getExtensionCount(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
        return super.hasExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4113 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$FileDescriptorSet(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4113 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

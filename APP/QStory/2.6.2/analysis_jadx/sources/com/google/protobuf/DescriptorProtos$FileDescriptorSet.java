package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FileDescriptorSet> implements InterfaceC3495 {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private List<DescriptorProtos$FileDescriptorProto> file_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FileDescriptorSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorSet();
        PARSER = new C3491();
    }

    private DescriptorProtos$FileDescriptorSet() {
        this.memoizedIsInitialized = (byte) -1;
        this.file_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11427;
    }

    public static C3280 newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11427;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public DescriptorProtos$FileDescriptorProto getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.InterfaceC3495
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public InterfaceC3492 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public List<? extends InterfaceC3492> getFileOrBuilderList() {
        return this.file_;
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
        int size = this.file_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7656 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11426;
        c3618.m7840(DescriptorProtos$FileDescriptorSet.class, C3280.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3280 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3280(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3280 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3280() : new C3280().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC3461.mo7662(1, this.file_.get(i));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536000001, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3280 extends GeneratedMessage.AbstractC3303 implements InterfaceC3495 {
        private int bitField0_;
        private C3362 fileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> file_;

        private C3280() {
            this.file_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                descriptorProtos$FileDescriptorSet.file_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11427;
        }

        private C3362 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C3362(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C3280 addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public <Type> C3280 addExtension(C3615 c3615, Type type) {
            return (C3280) addExtension((AbstractC3578) c3615, type);
        }

        public C3280 addFile(DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3279.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c3279.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetFileFieldBuilder().m7473(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileDescriptorSet build() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSetBuildPartial = buildPartial();
            if (descriptorProtos$FileDescriptorSetBuildPartial.isInitialized()) {
                return descriptorProtos$FileDescriptorSetBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FileDescriptorSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileDescriptorSet buildPartial() {
            DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet(this);
            buildPartialRepeatedFields(descriptorProtos$FileDescriptorSet);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileDescriptorSet);
            }
            onBuilt();
            return descriptorProtos$FileDescriptorSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3280 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C3280 clearExtension(C3615 c3615) {
            return (C3280) clearExtension((AbstractC3578) c3615);
        }

        public C3280 clearFile() {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11427;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public DescriptorProtos$FileDescriptorProto getFile(int i) {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.get(i) : (DescriptorProtos$FileDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3279 getFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetFileFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3279> getFileBuilderList() {
            return internalGetFileFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public int getFileCount() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public List<DescriptorProtos$FileDescriptorProto> getFileList() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.file_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public InterfaceC3492 getFileOrBuilder(int i) {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.get(i) : (InterfaceC3492) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public List<? extends InterfaceC3492> getFileOrBuilderList() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11426;
            c3618.m7840(DescriptorProtos$FileDescriptorSet.class, C3280.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getFileCount(); i++) {
                if (!getFile(i).isInitialized()) {
                    return false;
                }
            }
            return extensionsAreInitialized();
        }

        public C3280 mergeFrom(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
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
                boolean zIsEmpty = this.fileBuilder_.f11007.isEmpty();
                C3362 c3362 = this.fileBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.fileBuilder_ = null;
                    this.file_ = descriptorProtos$FileDescriptorSet.file_;
                    this.bitField0_ &= -2;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$FileDescriptorSet.file_);
                }
            }
            mergeExtensionFields(descriptorProtos$FileDescriptorSet);
            mergeUnknownFields(descriptorProtos$FileDescriptorSet.getUnknownFields());
            onChanged();
            return this;
        }

        public C3280 removeFile(int i) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C3280 setExtension(C3615 c3615, Type type) {
            return (C3280) setExtension((AbstractC3578) c3615, type);
        }

        public C3280 setFile(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3279.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c3279.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
            return DescriptorProtos$FileDescriptorSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3280 setExtension(C3615 c3615, int i, Type type) {
            return (C3280) setExtension((AbstractC3578) c3615, i, type);
        }

        private C3280(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.file_ = Collections.EMPTY_LIST;
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetFileFieldBuilder().m7474(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        }

        public C3280 addFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3280 setFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3280 addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureFileIsMutable();
                this.file_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3280 addFile(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c3279.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3279.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3280 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FileDescriptorSet) {
                return mergeFrom((DescriptorProtos$FileDescriptorSet) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3280 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 != 10) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FileDescriptorProto.parser(), c3696);
                                C3362 c3362 = this.fileBuilder_;
                                if (c3362 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$FileDescriptorProto);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$FileDescriptorSet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3280 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$FileDescriptorSet(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3280 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

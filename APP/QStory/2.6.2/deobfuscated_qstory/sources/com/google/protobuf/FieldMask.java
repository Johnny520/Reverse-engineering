package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMask extends GeneratedMessage implements InterfaceC3685 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int PATHS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private C3383 paths_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldMask");
        DEFAULT_INSTANCE = new FieldMask();
        PARSER = new C3686();
    }

    private FieldMask(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.paths_ = C3383.f11032;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3688.f11484;
    }

    public static C3301 newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldMask)) {
            return super.equals(obj);
        }
        FieldMask fieldMask = (FieldMask) obj;
        return getPathsList().equals(fieldMask.getPathsList()) && getUnknownFields().equals(fieldMask.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3688.f11484;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3685
    public String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3685
    public ByteString getPathsBytes(int i) {
        return this.paths_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3685
    public int getPathsCount() {
        return this.paths_.f11033.size();
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.paths_.f11033.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.paths_.f11033.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPathsList().size() + iComputeStringSizeNoTag;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getPathsCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getPathsList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3688.f11483;
        c3618.m7840(FieldMask.class, C3301.class);
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3301 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3301(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3301 toBuilder() {
        C3686 c3686 = null;
        return this == DEFAULT_INSTANCE ? new C3301(c3686) : new C3301(c3686).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        for (int i = 0; i < this.paths_.f11033.size(); i++) {
            GeneratedMessage.writeString(abstractC3461, 1, this.paths_.f11033.get(i));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldMask$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3301 extends GeneratedMessage.AbstractC3304 implements InterfaceC3685 {
        private int bitField0_;
        private C3383 paths_;

        private C3301() {
            this.paths_ = C3383.f11032;
        }

        private void buildPartial0(FieldMask fieldMask) {
            if ((this.bitField0_ & 1) != 0) {
                this.paths_.m7800();
                fieldMask.paths_ = this.paths_;
            }
        }

        private void ensurePathsIsMutable() {
            if (!this.paths_.f11194) {
                this.paths_ = new C3383(this.paths_);
            }
            this.bitField0_ |= 1;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3688.f11484;
        }

        public C3301 addAllPaths(Iterable<String> iterable) {
            ensurePathsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.paths_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3301 addPaths(String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.m7506(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3301 addPathsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            ensurePathsIsMutable();
            this.paths_.mo7508(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public FieldMask build() {
            FieldMask fieldMaskBuildPartial = buildPartial();
            if (fieldMaskBuildPartial.isInitialized()) {
                return fieldMaskBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) fieldMaskBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public FieldMask buildPartial() {
            FieldMask fieldMask = new FieldMask(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(fieldMask);
            }
            onBuilt();
            return fieldMask;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3301 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.paths_ = C3383.f11032;
            return this;
        }

        public C3301 clearPaths() {
            this.paths_ = C3383.f11032;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3688.f11484;
        }

        @Override // com.google.protobuf.InterfaceC3685
        public String getPaths(int i) {
            return this.paths_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3685
        public ByteString getPathsBytes(int i) {
            return this.paths_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3685
        public int getPathsCount() {
            return this.paths_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3685
        public InterfaceC3376 getPathsList() {
            this.paths_.m7800();
            return this.paths_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3688.f11483;
            c3618.m7840(FieldMask.class, C3301.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3301 mergeFrom(FieldMask fieldMask) {
            if (fieldMask == FieldMask.getDefaultInstance()) {
                return this;
            }
            if (!fieldMask.paths_.isEmpty()) {
                if (this.paths_.isEmpty()) {
                    this.paths_ = fieldMask.paths_;
                    this.bitField0_ |= 1;
                } else {
                    ensurePathsIsMutable();
                    this.paths_.addAll(fieldMask.paths_);
                }
                onChanged();
            }
            mergeUnknownFields(fieldMask.getUnknownFields());
            onChanged();
            return this;
        }

        public C3301 setPaths(int i, String str) {
            str.getClass();
            ensurePathsIsMutable();
            this.paths_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public FieldMask getDefaultInstanceForType() {
            return FieldMask.getDefaultInstance();
        }

        public /* synthetic */ C3301(C3686 c3686) {
            this();
        }

        public /* synthetic */ C3301(InterfaceC3531 interfaceC3531, C3686 c3686) {
            this(interfaceC3531);
        }

        private C3301(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.paths_ = C3383.f11032;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3301 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof FieldMask) {
                return mergeFrom((FieldMask) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3301 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                ensurePathsIsMutable();
                                this.paths_.m7506(abstractC3473.mo7719());
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

    @Override // com.google.protobuf.InterfaceC3685
    public InterfaceC3376 getPathsList() {
        return this.paths_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public FieldMask getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (FieldMask) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3301 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FieldMask(GeneratedMessage.AbstractC3304 abstractC3304, C3686 c3686) {
        this(abstractC3304);
    }

    public static C3301 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private FieldMask() {
        C3383 c3383 = C3383.f11032;
        this.memoizedIsInitialized = (byte) -1;
        this.paths_ = c3383;
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (FieldMask) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static FieldMask parseFrom(ByteString byteString) {
        return (FieldMask) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static FieldMask parseFrom(ByteString byteString, C3696 c3696) {
        return (FieldMask) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static FieldMask parseFrom(byte[] bArr) {
        return (FieldMask) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static FieldMask parseFrom(byte[] bArr, C3696 c3696) {
        return (FieldMask) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, C3696 c3696) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static FieldMask parseFrom(AbstractC3473 abstractC3473) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static FieldMask parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (FieldMask) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

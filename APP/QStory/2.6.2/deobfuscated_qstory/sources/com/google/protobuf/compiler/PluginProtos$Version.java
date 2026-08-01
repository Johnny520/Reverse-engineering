package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3345;
import com.google.protobuf.AbstractC3461;
import com.google.protobuf.AbstractC3473;
import com.google.protobuf.AbstractC3527;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3618;
import com.google.protobuf.C3662;
import com.google.protobuf.C3696;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3374;
import com.google.protobuf.InterfaceC3452;
import com.google.protobuf.InterfaceC3531;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p262.AbstractC8248;
import p262.InterfaceC8249;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$Version extends GeneratedMessage implements InterfaceC8249 {
    private static final PluginProtos$Version DEFAULT_INSTANCE;
    public static final int MAJOR_FIELD_NUMBER = 1;
    public static final int MINOR_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    public static final int PATCH_FIELD_NUMBER = 3;
    public static final int SUFFIX_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int major_;
    private byte memoizedIsInitialized;
    private int minor_;
    private int patch_;
    private volatile Object suffix_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Version");
        DEFAULT_INSTANCE = new PluginProtos$Version();
        PARSER = new C3328();
    }

    private PluginProtos$Version() {
        this.major_ = 0;
        this.minor_ = 0;
        this.patch_ = 0;
        this.suffix_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.suffix_ = "";
    }

    public static /* synthetic */ int access$976(PluginProtos$Version pluginProtos$Version, int i) {
        int i2 = i | pluginProtos$Version.bitField0_;
        pluginProtos$Version.bitField0_ = i2;
        return i2;
    }

    public static PluginProtos$Version getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC8248.f22841;
    }

    public static C3327 newBuilder(PluginProtos$Version pluginProtos$Version) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$Version);
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PluginProtos$Version)) {
            return super.equals(obj);
        }
        PluginProtos$Version pluginProtos$Version = (PluginProtos$Version) obj;
        if (hasMajor() != pluginProtos$Version.hasMajor()) {
            return false;
        }
        if ((hasMajor() && getMajor() != pluginProtos$Version.getMajor()) || hasMinor() != pluginProtos$Version.hasMinor()) {
            return false;
        }
        if ((hasMinor() && getMinor() != pluginProtos$Version.getMinor()) || hasPatch() != pluginProtos$Version.hasPatch()) {
            return false;
        }
        if ((!hasPatch() || getPatch() == pluginProtos$Version.getPatch()) && hasSuffix() == pluginProtos$Version.hasSuffix()) {
            return (!hasSuffix() || getSuffix().equals(pluginProtos$Version.getSuffix())) && getUnknownFields().equals(pluginProtos$Version.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC8248.f22841;
    }

    @Override // p262.InterfaceC8249
    public int getMajor() {
        return this.major_;
    }

    @Override // p262.InterfaceC8249
    public int getMinor() {
        return this.minor_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // p262.InterfaceC8249
    public int getPatch() {
        return this.patch_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7644 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7644(1, this.major_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7644 += AbstractC3461.m7644(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7644 += AbstractC3461.m7644(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7644 += GeneratedMessage.computeStringSize(4, this.suffix_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7644;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p262.InterfaceC8249
    public String getSuffix() {
        Object obj = this.suffix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.suffix_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // p262.InterfaceC8249
    public ByteString getSuffixBytes() {
        Object obj = this.suffix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.suffix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // p262.InterfaceC8249
    public boolean hasMajor() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p262.InterfaceC8249
    public boolean hasMinor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p262.InterfaceC8249
    public boolean hasPatch() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p262.InterfaceC8249
    public boolean hasSuffix() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMajor()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getMajor();
        }
        if (hasMinor()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getMinor();
        }
        if (hasPatch()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getPatch();
        }
        if (hasSuffix()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getSuffix().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC8248.f22840;
        c3618.m7840(PluginProtos$Version.class, C3327.class);
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
    public C3327 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3327(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3327 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3327() : new C3327().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7664(1, this.major_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            GeneratedMessage.writeString(abstractC3461, 4, this.suffix_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$Version$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3327 extends GeneratedMessage.AbstractC3304 implements InterfaceC8249 {
        private int bitField0_;
        private int major_;
        private int minor_;
        private int patch_;
        private Object suffix_;

        private C3327() {
            this.suffix_ = "";
        }

        private void buildPartial0(PluginProtos$Version pluginProtos$Version) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                pluginProtos$Version.major_ = this.major_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                pluginProtos$Version.minor_ = this.minor_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                pluginProtos$Version.patch_ = this.patch_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                pluginProtos$Version.suffix_ = this.suffix_;
                i |= 8;
            }
            PluginProtos$Version.access$976(pluginProtos$Version, i);
        }

        public static final C3662 getDescriptor() {
            return AbstractC8248.f22841;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$Version build() {
            PluginProtos$Version pluginProtos$VersionBuildPartial = buildPartial();
            if (pluginProtos$VersionBuildPartial.isInitialized()) {
                return pluginProtos$VersionBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) pluginProtos$VersionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$Version buildPartial() {
            PluginProtos$Version pluginProtos$Version = new PluginProtos$Version(this);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$Version);
            }
            onBuilt();
            return pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3327 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.major_ = 0;
            this.minor_ = 0;
            this.patch_ = 0;
            this.suffix_ = "";
            return this;
        }

        public C3327 clearMajor() {
            this.bitField0_ &= -2;
            this.major_ = 0;
            onChanged();
            return this;
        }

        public C3327 clearMinor() {
            this.bitField0_ &= -3;
            this.minor_ = 0;
            onChanged();
            return this;
        }

        public C3327 clearPatch() {
            this.bitField0_ &= -5;
            this.patch_ = 0;
            onChanged();
            return this;
        }

        public C3327 clearSuffix() {
            this.suffix_ = PluginProtos$Version.getDefaultInstance().getSuffix();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC8248.f22841;
        }

        @Override // p262.InterfaceC8249
        public int getMajor() {
            return this.major_;
        }

        @Override // p262.InterfaceC8249
        public int getMinor() {
            return this.minor_;
        }

        @Override // p262.InterfaceC8249
        public int getPatch() {
            return this.patch_;
        }

        @Override // p262.InterfaceC8249
        public String getSuffix() {
            Object obj = this.suffix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.suffix_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // p262.InterfaceC8249
        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8249
        public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p262.InterfaceC8249
        public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p262.InterfaceC8249
        public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p262.InterfaceC8249
        public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC8248.f22840;
            c3618.m7840(PluginProtos$Version.class, C3327.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3327 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.major_ = abstractC3473.mo7730();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 16) {
                                this.minor_ = abstractC3473.mo7730();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 24) {
                                this.patch_ = abstractC3473.mo7730();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 34) {
                                this.suffix_ = abstractC3473.mo7732();
                                this.bitField0_ |= 8;
                            } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

        public C3327 setMajor(int i) {
            this.major_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3327 setMinor(int i) {
            this.minor_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3327 setPatch(int i) {
            this.patch_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3327 setSuffix(String str) {
            str.getClass();
            this.suffix_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3327 setSuffixBytes(ByteString byteString) {
            byteString.getClass();
            this.suffix_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public PluginProtos$Version getDefaultInstanceForType() {
            return PluginProtos$Version.getDefaultInstance();
        }

        private C3327(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.suffix_ = "";
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3327 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof PluginProtos$Version) {
                return mergeFrom((PluginProtos$Version) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3327 mergeFrom(PluginProtos$Version pluginProtos$Version) {
            if (pluginProtos$Version == PluginProtos$Version.getDefaultInstance()) {
                return this;
            }
            if (pluginProtos$Version.hasMajor()) {
                setMajor(pluginProtos$Version.getMajor());
            }
            if (pluginProtos$Version.hasMinor()) {
                setMinor(pluginProtos$Version.getMinor());
            }
            if (pluginProtos$Version.hasPatch()) {
                setPatch(pluginProtos$Version.getPatch());
            }
            if (pluginProtos$Version.hasSuffix()) {
                this.suffix_ = pluginProtos$Version.suffix_;
                this.bitField0_ |= 8;
                onChanged();
            }
            mergeUnknownFields(pluginProtos$Version.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public PluginProtos$Version getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3327 newBuilderForType() {
        return newBuilder();
    }

    public static C3327 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static PluginProtos$Version parseFrom(ByteString byteString) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private PluginProtos$Version(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.major_ = 0;
        this.minor_ = 0;
        this.patch_ = 0;
        this.suffix_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$Version parseFrom(ByteString byteString, C3696 c3696) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr, C3696 c3696) {
        return (PluginProtos$Version) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static PluginProtos$Version parseFrom(AbstractC3473 abstractC3473) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static PluginProtos$Version parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}

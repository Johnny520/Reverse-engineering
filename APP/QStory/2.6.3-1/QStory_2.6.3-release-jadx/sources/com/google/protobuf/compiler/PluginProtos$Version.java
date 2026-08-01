package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4178;
import com.google.protobuf.AbstractC4294;
import com.google.protobuf.AbstractC4306;
import com.google.protobuf.AbstractC4360;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.ByteString;
import com.google.protobuf.C4451;
import com.google.protobuf.C4495;
import com.google.protobuf.C4529;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC4207;
import com.google.protobuf.InterfaceC4285;
import com.google.protobuf.InterfaceC4364;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p278.AbstractC9078;
import p278.InterfaceC9079;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$Version extends GeneratedMessage implements InterfaceC9079 {
    private static final PluginProtos$Version DEFAULT_INSTANCE;
    public static final int MAJOR_FIELD_NUMBER = 1;
    public static final int MINOR_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Version");
        DEFAULT_INSTANCE = new PluginProtos$Version();
        PARSER = new C4161();
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

    public static final C4495 getDescriptor() {
        return AbstractC9078.f23185;
    }

    public static C4160 newBuilder(PluginProtos$Version pluginProtos$Version) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$Version);
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC9078.f23185;
    }

    @Override // p278.InterfaceC9079
    public int getMajor() {
        return this.major_;
    }

    @Override // p278.InterfaceC9079
    public int getMinor() {
        return this.minor_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // p278.InterfaceC9079
    public int getPatch() {
        return this.patch_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8190 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8190(1, this.major_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8190 += AbstractC4294.m8190(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8190 += AbstractC4294.m8190(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8190 += GeneratedMessage.computeStringSize(4, this.suffix_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8190;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p278.InterfaceC9079
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

    @Override // p278.InterfaceC9079
    public ByteString getSuffixBytes() {
        Object obj = this.suffix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.suffix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // p278.InterfaceC9079
    public boolean hasMajor() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p278.InterfaceC9079
    public boolean hasMinor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p278.InterfaceC9079
    public boolean hasPatch() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p278.InterfaceC9079
    public boolean hasSuffix() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMajor()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getMajor();
        }
        if (hasMinor()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getMinor();
        }
        if (hasPatch()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getPatch();
        }
        if (hasSuffix()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getSuffix().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC9078.f23184;
        c4451.m8386(PluginProtos$Version.class, C4160.class);
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4160 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4160(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4160 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4160() : new C4160().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8210(1, this.major_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            GeneratedMessage.writeString(abstractC4294, 4, this.suffix_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$Version$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4160 extends GeneratedMessage.AbstractC4137 implements InterfaceC9079 {
        private int bitField0_;
        private int major_;
        private int minor_;
        private int patch_;
        private Object suffix_;

        private C4160() {
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

        public static final C4495 getDescriptor() {
            return AbstractC9078.f23185;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$Version build() {
            PluginProtos$Version pluginProtos$VersionBuildPartial = buildPartial();
            if (pluginProtos$VersionBuildPartial.isInitialized()) {
                return pluginProtos$VersionBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) pluginProtos$VersionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$Version buildPartial() {
            PluginProtos$Version pluginProtos$Version = new PluginProtos$Version(this);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$Version);
            }
            onBuilt();
            return pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4160 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.major_ = 0;
            this.minor_ = 0;
            this.patch_ = 0;
            this.suffix_ = "";
            return this;
        }

        public C4160 clearMajor() {
            this.bitField0_ &= -2;
            this.major_ = 0;
            onChanged();
            return this;
        }

        public C4160 clearMinor() {
            this.bitField0_ &= -3;
            this.minor_ = 0;
            onChanged();
            return this;
        }

        public C4160 clearPatch() {
            this.bitField0_ &= -5;
            this.patch_ = 0;
            onChanged();
            return this;
        }

        public C4160 clearSuffix() {
            this.suffix_ = PluginProtos$Version.getDefaultInstance().getSuffix();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC9078.f23185;
        }

        @Override // p278.InterfaceC9079
        public int getMajor() {
            return this.major_;
        }

        @Override // p278.InterfaceC9079
        public int getMinor() {
            return this.minor_;
        }

        @Override // p278.InterfaceC9079
        public int getPatch() {
            return this.patch_;
        }

        @Override // p278.InterfaceC9079
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

        @Override // p278.InterfaceC9079
        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p278.InterfaceC9079
        public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p278.InterfaceC9079
        public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p278.InterfaceC9079
        public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p278.InterfaceC9079
        public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC9078.f23184;
            c4451.m8386(PluginProtos$Version.class, C4160.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4160 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.major_ = abstractC4306.mo8276();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 16) {
                                this.minor_ = abstractC4306.mo8276();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 24) {
                                this.patch_ = abstractC4306.mo8276();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 34) {
                                this.suffix_ = abstractC4306.mo8278();
                                this.bitField0_ |= 8;
                            } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

        public C4160 setMajor(int i) {
            this.major_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4160 setMinor(int i) {
            this.minor_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4160 setPatch(int i) {
            this.patch_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4160 setSuffix(String str) {
            str.getClass();
            this.suffix_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4160 setSuffixBytes(ByteString byteString) {
            byteString.getClass();
            this.suffix_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public PluginProtos$Version getDefaultInstanceForType() {
            return PluginProtos$Version.getDefaultInstance();
        }

        private C4160(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.suffix_ = "";
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4160 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof PluginProtos$Version) {
                return mergeFrom((PluginProtos$Version) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4160 mergeFrom(PluginProtos$Version pluginProtos$Version) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public PluginProtos$Version getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4160 newBuilderForType() {
        return newBuilder();
    }

    public static C4160 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static PluginProtos$Version parseFrom(ByteString byteString) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private PluginProtos$Version(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.major_ = 0;
        this.minor_ = 0;
        this.patch_ = 0;
        this.suffix_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$Version parseFrom(ByteString byteString, C4529 c4529) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr, C4529 c4529) {
        return (PluginProtos$Version) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static PluginProtos$Version parseFrom(AbstractC4306 abstractC4306) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static PluginProtos$Version parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}

package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3346;
import com.google.protobuf.AbstractC3462;
import com.google.protobuf.AbstractC3474;
import com.google.protobuf.AbstractC3528;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3619;
import com.google.protobuf.C3663;
import com.google.protobuf.C3697;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3375;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.InterfaceC3532;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p262.AbstractC8249;
import p262.InterfaceC8250;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$Version extends GeneratedMessage implements InterfaceC8250 {
    private static final PluginProtos$Version DEFAULT_INSTANCE;
    public static final int MAJOR_FIELD_NUMBER = 1;
    public static final int MINOR_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Version");
        DEFAULT_INSTANCE = new PluginProtos$Version();
        PARSER = new C3329();
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

    public static final C3663 getDescriptor() {
        return AbstractC8249.f22840;
    }

    public static C3328 newBuilder(PluginProtos$Version pluginProtos$Version) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$Version);
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC8249.f22840;
    }

    @Override // p262.InterfaceC8250
    public int getMajor() {
        return this.major_;
    }

    @Override // p262.InterfaceC8250
    public int getMinor() {
        return this.minor_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // p262.InterfaceC8250
    public int getPatch() {
        return this.patch_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7631 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7631(1, this.major_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7631 += AbstractC3462.m7631(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7631 += AbstractC3462.m7631(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7631 += GeneratedMessage.computeStringSize(4, this.suffix_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7631;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p262.InterfaceC8250
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

    @Override // p262.InterfaceC8250
    public ByteString getSuffixBytes() {
        Object obj = this.suffix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.suffix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // p262.InterfaceC8250
    public boolean hasMajor() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p262.InterfaceC8250
    public boolean hasMinor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p262.InterfaceC8250
    public boolean hasPatch() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p262.InterfaceC8250
    public boolean hasSuffix() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMajor()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getMajor();
        }
        if (hasMinor()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getMinor();
        }
        if (hasPatch()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getPatch();
        }
        if (hasSuffix()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getSuffix().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC8249.f22839;
        c3619.m7827(PluginProtos$Version.class, C3328.class);
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3328 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3328(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3328 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3328() : new C3328().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7651(1, this.major_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(2, this.minor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(3, this.patch_);
        }
        if ((this.bitField0_ & 8) != 0) {
            GeneratedMessage.writeString(abstractC3462, 4, this.suffix_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$Version$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3328 extends GeneratedMessage.AbstractC3305 implements InterfaceC8250 {
        private int bitField0_;
        private int major_;
        private int minor_;
        private int patch_;
        private Object suffix_;

        private C3328() {
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

        public static final C3663 getDescriptor() {
            return AbstractC8249.f22840;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$Version build() {
            PluginProtos$Version pluginProtos$VersionBuildPartial = buildPartial();
            if (pluginProtos$VersionBuildPartial.isInitialized()) {
                return pluginProtos$VersionBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) pluginProtos$VersionBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$Version buildPartial() {
            PluginProtos$Version pluginProtos$Version = new PluginProtos$Version(this);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$Version);
            }
            onBuilt();
            return pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3328 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.major_ = 0;
            this.minor_ = 0;
            this.patch_ = 0;
            this.suffix_ = "";
            return this;
        }

        public C3328 clearMajor() {
            this.bitField0_ &= -2;
            this.major_ = 0;
            onChanged();
            return this;
        }

        public C3328 clearMinor() {
            this.bitField0_ &= -3;
            this.minor_ = 0;
            onChanged();
            return this;
        }

        public C3328 clearPatch() {
            this.bitField0_ &= -5;
            this.patch_ = 0;
            onChanged();
            return this;
        }

        public C3328 clearSuffix() {
            this.suffix_ = PluginProtos$Version.getDefaultInstance().getSuffix();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC8249.f22840;
        }

        @Override // p262.InterfaceC8250
        public int getMajor() {
            return this.major_;
        }

        @Override // p262.InterfaceC8250
        public int getMinor() {
            return this.minor_;
        }

        @Override // p262.InterfaceC8250
        public int getPatch() {
            return this.patch_;
        }

        @Override // p262.InterfaceC8250
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

        @Override // p262.InterfaceC8250
        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8250
        public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC8249.f22839;
            c3619.m7827(PluginProtos$Version.class, C3328.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3328 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.major_ = abstractC3474.mo7717();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 16) {
                                this.minor_ = abstractC3474.mo7717();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 24) {
                                this.patch_ = abstractC3474.mo7717();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 34) {
                                this.suffix_ = abstractC3474.mo7719();
                                this.bitField0_ |= 8;
                            } else if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

        public C3328 setMajor(int i) {
            this.major_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3328 setMinor(int i) {
            this.minor_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3328 setPatch(int i) {
            this.patch_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3328 setSuffix(String str) {
            str.getClass();
            this.suffix_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3328 setSuffixBytes(ByteString byteString) {
            byteString.getClass();
            this.suffix_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public PluginProtos$Version getDefaultInstanceForType() {
            return PluginProtos$Version.getDefaultInstance();
        }

        private C3328(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.suffix_ = "";
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3328 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof PluginProtos$Version) {
                return mergeFrom((PluginProtos$Version) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3328 mergeFrom(PluginProtos$Version pluginProtos$Version) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public PluginProtos$Version getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$Version parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$Version) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3328 newBuilderForType() {
        return newBuilder();
    }

    public static C3328 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$Version parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static PluginProtos$Version parseFrom(ByteString byteString) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private PluginProtos$Version(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.major_ = 0;
        this.minor_ = 0;
        this.patch_ = 0;
        this.suffix_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$Version parseFrom(ByteString byteString, C3697 c3697) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static PluginProtos$Version parseFrom(byte[] bArr, C3697 c3697) {
        return (PluginProtos$Version) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$Version parseFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static PluginProtos$Version parseFrom(AbstractC3474 abstractC3474) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static PluginProtos$Version parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (PluginProtos$Version) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}

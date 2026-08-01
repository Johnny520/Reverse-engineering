package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(23);
    private static final ProtoBuf$VersionRequirement defaultInstance;
    private int bitField0_;
    private int errorCode_;
    private Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final AbstractC4709 unknownFields;
    private int versionFull_;
    private VersionKind versionKind_;
    private int version_;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Level implements InterfaceC4721 {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static InterfaceC4722 internalValueMap = new C4657();
        private final int value;

        Level(int i, int i2) {
            this.value = i2;
        }

        public static Level valueOf(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum VersionKind implements InterfaceC4721 {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static InterfaceC4722 internalValueMap = new C4656();
        private final int value;

        VersionKind(int i, int i2) {
            this.value = i2;
        }

        public static VersionKind valueOf(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(true);
        defaultInstance = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.initFields();
    }

    private ProtoBuf$VersionRequirement(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = c4708.m9407();
                        } else if (iM9397 == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = c4708.m9407();
                        } else if (iM9397 == 24) {
                            int iM9407 = c4708.m9407();
                            Level levelValueOf = Level.valueOf(iM9407);
                            if (levelValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM9407);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = levelValueOf;
                            }
                        } else if (iM9397 == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = c4708.m9407();
                        } else if (iM9397 == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = c4708.m9407();
                        } else if (iM9397 == 48) {
                            int iM94072 = c4708.m9407();
                            VersionKind versionKindValueOf = VersionKind.valueOf(iM94072);
                            if (versionKindValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM94072);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = versionKindValueOf;
                            }
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        c4707M9375.m9386();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c4710.m9413();
                        throw th2;
                    }
                    this.unknownFields = c4710.m9413();
                    makeExtensionsImmutable();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
        try {
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
        makeExtensionsImmutable();
    }

    public static ProtoBuf$VersionRequirement getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = Level.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = VersionKind.LANGUAGE_VERSION;
    }

    public static C4658 newBuilder() {
        C4658 c4658 = new C4658();
        c4658.f13602 = Level.ERROR;
        c4658.f13604 = VersionKind.LANGUAGE_VERSION;
        return c4658;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public Level getLevel() {
        return this.level_;
    }

    public int getMessage() {
        return this.message_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9372 += C4707.m9372(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9373(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9372(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9372 += C4707.m9372(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9372 += C4707.m9373(6, this.versionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9372;
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getVersion() {
        return this.version_;
    }

    public int getVersionFull() {
        return this.versionFull_;
    }

    public VersionKind getVersionKind() {
        return this.versionKind_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionFull() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasVersionKind() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9387(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9388(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9388(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4707.m9387(6, this.versionKind_.getNumber());
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirement getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4658 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4658 toBuilder() {
        return newBuilder(this);
    }

    public static C4658 newBuilder(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        C4658 c4658NewBuilder = newBuilder();
        c4658NewBuilder.m9285(protoBuf$VersionRequirement);
        return c4658NewBuilder;
    }

    private ProtoBuf$VersionRequirement(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$VersionRequirement(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

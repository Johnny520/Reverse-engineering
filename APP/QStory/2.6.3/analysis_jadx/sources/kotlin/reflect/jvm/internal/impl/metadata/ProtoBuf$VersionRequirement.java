package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(23);
    private static final ProtoBuf$VersionRequirement defaultInstance;
    private int bitField0_;
    private int errorCode_;
    private Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final AbstractC4710 unknownFields;
    private int versionFull_;
    private VersionKind versionKind_;
    private int version_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Level implements InterfaceC4722 {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static InterfaceC4723 internalValueMap = new C4658();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum VersionKind implements InterfaceC4722 {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static InterfaceC4723 internalValueMap = new C4657();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(true);
        defaultInstance = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.initFields();
    }

    private ProtoBuf$VersionRequirement(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = c4709.m9397();
                        } else if (iM9387 == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = c4709.m9397();
                        } else if (iM9387 == 24) {
                            int iM9397 = c4709.m9397();
                            Level levelValueOf = Level.valueOf(iM9397);
                            if (levelValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM9397);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = levelValueOf;
                            }
                        } else if (iM9387 == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = c4709.m9397();
                        } else if (iM9387 == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = c4709.m9397();
                        } else if (iM9387 == 48) {
                            int iM93972 = c4709.m9397();
                            VersionKind versionKindValueOf = VersionKind.valueOf(iM93972);
                            if (versionKindValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM93972);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = versionKindValueOf;
                            }
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        c4708M9365.m9376();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c4711.m9403();
                        throw th2;
                    }
                    this.unknownFields = c4711.m9403();
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
            c4708M9365.m9376();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4711.m9403();
            throw th3;
        }
        this.unknownFields = c4711.m9403();
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

    public static C4659 newBuilder() {
        C4659 c4659 = new C4659();
        c4659.f13606 = Level.ERROR;
        c4659.f13608 = VersionKind.LANGUAGE_VERSION;
        return c4659;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9362 += C4708.m9362(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9363(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9362(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9362(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9362 += C4708.m9363(6, this.versionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9362;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9377(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9378(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9378(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9377(6, this.versionKind_.getNumber());
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirement getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4659 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4659 toBuilder() {
        return newBuilder(this);
    }

    public static C4659 newBuilder(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        C4659 c4659NewBuilder = newBuilder();
        c4659NewBuilder.m9275(protoBuf$VersionRequirement);
        return c4659NewBuilder;
    }

    private ProtoBuf$VersionRequirement(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$VersionRequirement(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

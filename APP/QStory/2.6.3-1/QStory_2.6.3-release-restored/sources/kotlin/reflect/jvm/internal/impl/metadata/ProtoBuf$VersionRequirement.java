package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(23);
    private static final ProtoBuf$VersionRequirement defaultInstance;
    private int bitField0_;
    private int errorCode_;
    private Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final AbstractC5542 unknownFields;
    private int versionFull_;
    private VersionKind versionKind_;
    private int version_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Level implements InterfaceC5554 {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static InterfaceC5555 internalValueMap = new C5490();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum VersionKind implements InterfaceC5554 {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static InterfaceC5555 internalValueMap = new C5489();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(true);
        defaultInstance = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.initFields();
    }

    private ProtoBuf$VersionRequirement(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = c5541.m9956();
                        } else if (iM9946 == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = c5541.m9956();
                        } else if (iM9946 == 24) {
                            int iM9956 = c5541.m9956();
                            Level levelValueOf = Level.valueOf(iM9956);
                            if (levelValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM9956);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = levelValueOf;
                            }
                        } else if (iM9946 == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = c5541.m9956();
                        } else if (iM9946 == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = c5541.m9956();
                        } else if (iM9946 == 48) {
                            int iM99562 = c5541.m9956();
                            VersionKind versionKindValueOf = VersionKind.valueOf(iM99562);
                            if (versionKindValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM99562);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = versionKindValueOf;
                            }
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        c5540M9924.m9935();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c5543.m9962();
                        throw th2;
                    }
                    this.unknownFields = c5543.m9962();
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
            c5540M9924.m9935();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c5543.m9962();
            throw th3;
        }
        this.unknownFields = c5543.m9962();
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

    public static C5491 newBuilder() {
        C5491 c5491 = new C5491();
        c5491.f13951 = Level.ERROR;
        c5491.f13953 = VersionKind.LANGUAGE_VERSION;
        return c5491;
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
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9921 += C5540.m9921(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9922(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9921(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9921(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9921 += C5540.m9922(6, this.versionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9921;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9936(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9937(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9937(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9936(6, this.versionKind_.getNumber());
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirement getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5491 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5491 toBuilder() {
        return newBuilder(this);
    }

    public static C5491 newBuilder(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        C5491 c5491NewBuilder = newBuilder();
        c5491NewBuilder.m9834(protoBuf$VersionRequirement);
        return c5491NewBuilder;
    }

    private ProtoBuf$VersionRequirement(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$VersionRequirement(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

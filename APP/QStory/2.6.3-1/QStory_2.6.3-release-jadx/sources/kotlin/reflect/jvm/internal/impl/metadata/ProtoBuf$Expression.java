package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(11);
    private static final ProtoBuf$Expression defaultInstance;
    private List<ProtoBuf$Expression> andArgument_;
    private int bitField0_;
    private ConstantValue constantValue_;
    private int flags_;
    private int isInstanceTypeId_;
    private ProtoBuf$Type isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Expression> orArgument_;
    private final AbstractC5542 unknownFields;
    private int valueParameterReference_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum ConstantValue implements InterfaceC5554 {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

        private static InterfaceC5555 internalValueMap = new C5505();
        private final int value;

        ConstantValue(int i, int i2) {
            this.value = i2;
        }

        public static ConstantValue valueOf(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(true);
        defaultInstance = protoBuf$Expression;
        protoBuf$Expression.initFields();
    }

    private ProtoBuf$Expression(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c5541.m9956();
                        } else if (iM9946 == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = c5541.m9956();
                        } else if (iM9946 == 24) {
                            int iM9956 = c5541.m9956();
                            ConstantValue constantValueValueOf = ConstantValue.valueOf(iM9956);
                            if (constantValueValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM9956);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = constantValueValueOf;
                            }
                        } else if (iM9946 == 34) {
                            C5502 builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                            this.isInstanceType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.m9846(protoBuf$Type);
                                this.isInstanceType_ = builder.m9847();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9946 == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = c5541.m9956();
                        } else if (iM9946 == 50) {
                            if ((i & 32) != 32) {
                                this.andArgument_ = new ArrayList();
                                i |= 32;
                            }
                            this.andArgument_.add((ProtoBuf$Expression) c5541.m9939(PARSER, c5558));
                        } else if (iM9946 == 58) {
                            if ((i & 64) != 64) {
                                this.orArgument_ = new ArrayList();
                                i |= 64;
                            }
                            this.orArgument_.add((ProtoBuf$Expression) c5541.m9939(PARSER, c5558));
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    }
                    if ((i & 64) == 64) {
                        this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    }
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
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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

    public static ProtoBuf$Expression getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = ConstantValue.TRUE;
        this.isInstanceType_ = ProtoBuf$Type.getDefaultInstance();
        this.isInstanceTypeId_ = 0;
        List<ProtoBuf$Expression> list = Collections.EMPTY_LIST;
        this.andArgument_ = list;
        this.orArgument_ = list;
    }

    public static C5513 newBuilder() {
        C5513 c5513 = new C5513();
        c5513.f14025 = ConstantValue.TRUE;
        c5513.f14029 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c5513.f14027 = list;
        c5513.f14028 = list;
        return c5513;
    }

    public ProtoBuf$Expression getAndArgument(int i) {
        return this.andArgument_.get(i);
    }

    public int getAndArgumentCount() {
        return this.andArgument_.size();
    }

    public List<ProtoBuf$Expression> getAndArgumentList() {
        return this.andArgument_;
    }

    public ConstantValue getConstantValue() {
        return this.constantValue_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ProtoBuf$Type getIsInstanceType() {
        return this.isInstanceType_;
    }

    public int getIsInstanceTypeId() {
        return this.isInstanceTypeId_;
    }

    public ProtoBuf$Expression getOrArgument(int i) {
        return this.orArgument_.get(i);
    }

    public int getOrArgumentCount() {
        return this.orArgument_.size();
    }

    public List<ProtoBuf$Expression> getOrArgumentList() {
        return this.orArgument_;
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
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9921 += C5540.m9921(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9922(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9919(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9921(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iM9921 += C5540.m9919(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iM9921 += C5540.m9919(7, this.orArgument_.get(i3));
        }
        int size = this.unknownFields.size() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getValueParameterReference() {
        return this.valueParameterReference_;
    }

    public boolean hasConstantValue() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasIsInstanceType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasIsInstanceTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasValueParameterReference() {
        return (this.bitField0_ & 2) == 2;
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
        if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getAndArgumentCount(); i++) {
            if (!getAndArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
            if (!getOrArgument(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9936(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9929(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9937(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            c5540.m9929(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            c5540.m9929(7, this.orArgument_.get(i2));
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Expression getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5513 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5513 toBuilder() {
        return newBuilder(this);
    }

    public static C5513 newBuilder(ProtoBuf$Expression protoBuf$Expression) {
        C5513 c5513NewBuilder = newBuilder();
        c5513NewBuilder.m9856(protoBuf$Expression);
        return c5513NewBuilder;
    }

    private ProtoBuf$Expression(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$Expression(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

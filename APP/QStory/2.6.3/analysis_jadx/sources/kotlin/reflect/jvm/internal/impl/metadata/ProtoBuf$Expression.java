package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(11);
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
    private final AbstractC4710 unknownFields;
    private int valueParameterReference_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum ConstantValue implements InterfaceC4722 {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

        private static InterfaceC4723 internalValueMap = new C4673();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(true);
        defaultInstance = protoBuf$Expression;
        protoBuf$Expression.initFields();
    }

    private ProtoBuf$Expression(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c4709.m9397();
                        } else if (iM9387 == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = c4709.m9397();
                        } else if (iM9387 == 24) {
                            int iM9397 = c4709.m9397();
                            ConstantValue constantValueValueOf = ConstantValue.valueOf(iM9397);
                            if (constantValueValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM9397);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = constantValueValueOf;
                            }
                        } else if (iM9387 == 34) {
                            C4670 builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                            this.isInstanceType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.m9287(protoBuf$Type);
                                this.isInstanceType_ = builder.m9288();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9387 == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = c4709.m9397();
                        } else if (iM9387 == 50) {
                            if ((i & 32) != 32) {
                                this.andArgument_ = new ArrayList();
                                i |= 32;
                            }
                            this.andArgument_.add((ProtoBuf$Expression) c4709.m9380(PARSER, c4726));
                        } else if (iM9387 == 58) {
                            if ((i & 64) != 64) {
                                this.orArgument_ = new ArrayList();
                                i |= 64;
                            }
                            this.orArgument_.add((ProtoBuf$Expression) c4709.m9380(PARSER, c4726));
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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

    public static C4681 newBuilder() {
        C4681 c4681 = new C4681();
        c4681.f13680 = ConstantValue.TRUE;
        c4681.f13684 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c4681.f13682 = list;
        c4681.f13683 = list;
        return c4681;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9362 += C4708.m9362(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9363(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9360(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9362(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iM9362 += C4708.m9360(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iM9362 += C4708.m9360(7, this.orArgument_.get(i3));
        }
        int size = this.unknownFields.size() + iM9362;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9377(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9370(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9378(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            c4708.m9370(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            c4708.m9370(7, this.orArgument_.get(i2));
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Expression getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4681 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4681 toBuilder() {
        return newBuilder(this);
    }

    public static C4681 newBuilder(ProtoBuf$Expression protoBuf$Expression) {
        C4681 c4681NewBuilder = newBuilder();
        c4681NewBuilder.m9297(protoBuf$Expression);
        return c4681NewBuilder;
    }

    private ProtoBuf$Expression(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$Expression(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

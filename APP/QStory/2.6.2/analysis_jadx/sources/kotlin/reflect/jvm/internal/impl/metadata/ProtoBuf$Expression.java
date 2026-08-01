package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(11);
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
    private final AbstractC4709 unknownFields;
    private int valueParameterReference_;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum ConstantValue implements InterfaceC4721 {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

        private static InterfaceC4722 internalValueMap = new C4672();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(true);
        defaultInstance = protoBuf$Expression;
        protoBuf$Expression.initFields();
    }

    private ProtoBuf$Expression(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c4708.m9407();
                        } else if (iM9397 == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = c4708.m9407();
                        } else if (iM9397 == 24) {
                            int iM9407 = c4708.m9407();
                            ConstantValue constantValueValueOf = ConstantValue.valueOf(iM9407);
                            if (constantValueValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM9407);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = constantValueValueOf;
                            }
                        } else if (iM9397 == 34) {
                            C4669 builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725);
                            this.isInstanceType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.m9297(protoBuf$Type);
                                this.isInstanceType_ = builder.m9298();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9397 == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = c4708.m9407();
                        } else if (iM9397 == 50) {
                            if ((i & 32) != 32) {
                                this.andArgument_ = new ArrayList();
                                i |= 32;
                            }
                            this.andArgument_.add((ProtoBuf$Expression) c4708.m9390(PARSER, c4725));
                        } else if (iM9397 == 58) {
                            if ((i & 64) != 64) {
                                this.orArgument_ = new ArrayList();
                                i |= 64;
                            }
                            this.orArgument_.add((ProtoBuf$Expression) c4708.m9390(PARSER, c4725));
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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

    public static C4680 newBuilder() {
        C4680 c4680 = new C4680();
        c4680.f13676 = ConstantValue.TRUE;
        c4680.f13680 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c4680.f13678 = list;
        c4680.f13679 = list;
        return c4680;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9372 += C4707.m9372(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9373(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9370(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9372 += C4707.m9372(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iM9372 += C4707.m9370(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iM9372 += C4707.m9370(7, this.orArgument_.get(i3));
        }
        int size = this.unknownFields.size() + iM9372;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9387(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9380(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9388(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            c4707.m9380(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            c4707.m9380(7, this.orArgument_.get(i2));
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Expression getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4680 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4680 toBuilder() {
        return newBuilder(this);
    }

    public static C4680 newBuilder(ProtoBuf$Expression protoBuf$Expression) {
        C4680 c4680NewBuilder = newBuilder();
        c4680NewBuilder.m9307(protoBuf$Expression);
        return c4680NewBuilder;
    }

    private ProtoBuf$Expression(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$Expression(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

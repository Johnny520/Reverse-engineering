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
public final class ProtoBuf$Effect extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(9);
    private static final ProtoBuf$Effect defaultInstance;
    private int bitField0_;
    private ProtoBuf$Expression conclusionOfConditionalEffect_;
    private EffectConditionKind conditionKind_;
    private List<ProtoBuf$Expression> effectConstructorArgument_;
    private EffectType effectType_;
    private InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC5542 unknownFields;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EffectConditionKind implements InterfaceC5554 {
        CONCLUSION_CONDITION(0, 0),
        RETURNS_CONDITION(1, 1),
        HOLDSIN_CONDITION(2, 2);

        private static InterfaceC5555 internalValueMap = new C5514();
        private final int value;

        EffectConditionKind(int i, int i2) {
            this.value = i2;
        }

        public static EffectConditionKind valueOf(int i) {
            if (i == 0) {
                return CONCLUSION_CONDITION;
            }
            if (i == 1) {
                return RETURNS_CONDITION;
            }
            if (i != 2) {
                return null;
            }
            return HOLDSIN_CONDITION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EffectType implements InterfaceC5554 {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        private static InterfaceC5555 internalValueMap = new C5515();
        private final int value;

        EffectType(int i, int i2) {
            this.value = i2;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum InvocationKind implements InterfaceC5554 {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static InterfaceC5555 internalValueMap = new C5512();
        private final int value;

        InvocationKind(int i, int i2) {
            this.value = i2;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(true);
        defaultInstance = protoBuf$Effect;
        protoBuf$Effect.initFields();
    }

    private ProtoBuf$Effect(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 8) {
                            int iM9956 = c5541.m9956();
                            EffectType effectTypeValueOf = EffectType.valueOf(iM9956);
                            if (effectTypeValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM9956);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = effectTypeValueOf;
                            }
                        } else if (iM9946 == 18) {
                            if ((c & 2) != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c = 2;
                            }
                            this.effectConstructorArgument_.add((ProtoBuf$Expression) c5541.m9939(ProtoBuf$Expression.PARSER, c5558));
                        } else if (iM9946 == 26) {
                            C5513 builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            ProtoBuf$Expression protoBuf$Expression = (ProtoBuf$Expression) c5541.m9939(ProtoBuf$Expression.PARSER, c5558);
                            this.conclusionOfConditionalEffect_ = protoBuf$Expression;
                            if (builder != null) {
                                builder.m9856(protoBuf$Expression);
                                this.conclusionOfConditionalEffect_ = builder.m9857();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9946 == 32) {
                            int iM99562 = c5541.m9956();
                            InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM99562);
                            if (invocationKindValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM99562);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = invocationKindValueOf;
                            }
                        } else if (iM9946 == 40) {
                            int iM99563 = c5541.m9956();
                            EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(iM99563);
                            if (effectConditionKindValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM99563);
                            } else {
                                this.bitField0_ |= 8;
                                this.conditionKind_ = effectConditionKindValueOf;
                            }
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        if ((c & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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

    public static ProtoBuf$Effect getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.effectType_ = EffectType.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = ProtoBuf$Expression.getDefaultInstance();
        this.kind_ = InvocationKind.AT_MOST_ONCE;
        this.conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;
    }

    public static C5510 newBuilder() {
        C5510 c5510 = new C5510();
        c5510.f14024 = EffectType.RETURNS_CONSTANT;
        c5510.f14020 = Collections.EMPTY_LIST;
        c5510.f14019 = ProtoBuf$Expression.getDefaultInstance();
        c5510.f14021 = InvocationKind.AT_MOST_ONCE;
        c5510.f14022 = EffectConditionKind.CONCLUSION_CONDITION;
        return c5510;
    }

    public ProtoBuf$Expression getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    public EffectConditionKind getConditionKind() {
        return this.conditionKind_;
    }

    public ProtoBuf$Expression getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public List<ProtoBuf$Expression> getEffectConstructorArgumentList() {
        return this.effectConstructorArgument_;
    }

    public EffectType getEffectType() {
        return this.effectType_;
    }

    public InvocationKind getKind() {
        return this.kind_;
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
        int iM9922 = (this.bitField0_ & 1) == 1 ? C5540.m9922(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iM9922 += C5540.m9919(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9922 += C5540.m9919(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9922 += C5540.m9922(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9922 += C5540.m9922(5, this.conditionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9922;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasConclusionOfConditionalEffect() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasConditionKind() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasEffectType() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 4) == 4;
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
        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
            if (!getEffectConstructorArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9936(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            c5540.m9929(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9929(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9936(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9936(5, this.conditionKind_.getNumber());
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Effect getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5510 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5510 toBuilder() {
        return newBuilder(this);
    }

    public static C5510 newBuilder(ProtoBuf$Effect protoBuf$Effect) {
        C5510 c5510NewBuilder = newBuilder();
        c5510NewBuilder.m9854(protoBuf$Effect);
        return c5510NewBuilder;
    }

    private ProtoBuf$Effect(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$Effect(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

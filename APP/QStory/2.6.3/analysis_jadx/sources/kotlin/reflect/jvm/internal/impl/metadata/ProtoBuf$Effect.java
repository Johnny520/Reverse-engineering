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
public final class ProtoBuf$Effect extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(9);
    private static final ProtoBuf$Effect defaultInstance;
    private int bitField0_;
    private ProtoBuf$Expression conclusionOfConditionalEffect_;
    private EffectConditionKind conditionKind_;
    private List<ProtoBuf$Expression> effectConstructorArgument_;
    private EffectType effectType_;
    private InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC4710 unknownFields;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EffectConditionKind implements InterfaceC4722 {
        CONCLUSION_CONDITION(0, 0),
        RETURNS_CONDITION(1, 1),
        HOLDSIN_CONDITION(2, 2);

        private static InterfaceC4723 internalValueMap = new C4682();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EffectType implements InterfaceC4722 {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        private static InterfaceC4723 internalValueMap = new C4683();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum InvocationKind implements InterfaceC4722 {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static InterfaceC4723 internalValueMap = new C4680();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(true);
        defaultInstance = protoBuf$Effect;
        protoBuf$Effect.initFields();
    }

    private ProtoBuf$Effect(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 8) {
                            int iM9397 = c4709.m9397();
                            EffectType effectTypeValueOf = EffectType.valueOf(iM9397);
                            if (effectTypeValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM9397);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = effectTypeValueOf;
                            }
                        } else if (iM9387 == 18) {
                            if ((c & 2) != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c = 2;
                            }
                            this.effectConstructorArgument_.add((ProtoBuf$Expression) c4709.m9380(ProtoBuf$Expression.PARSER, c4726));
                        } else if (iM9387 == 26) {
                            C4681 builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            ProtoBuf$Expression protoBuf$Expression = (ProtoBuf$Expression) c4709.m9380(ProtoBuf$Expression.PARSER, c4726);
                            this.conclusionOfConditionalEffect_ = protoBuf$Expression;
                            if (builder != null) {
                                builder.m9297(protoBuf$Expression);
                                this.conclusionOfConditionalEffect_ = builder.m9298();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9387 == 32) {
                            int iM93972 = c4709.m9397();
                            InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM93972);
                            if (invocationKindValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM93972);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = invocationKindValueOf;
                            }
                        } else if (iM9387 == 40) {
                            int iM93973 = c4709.m9397();
                            EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(iM93973);
                            if (effectConditionKindValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM93973);
                            } else {
                                this.bitField0_ |= 8;
                                this.conditionKind_ = effectConditionKindValueOf;
                            }
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        if ((c & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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

    public static C4678 newBuilder() {
        C4678 c4678 = new C4678();
        c4678.f13679 = EffectType.RETURNS_CONSTANT;
        c4678.f13675 = Collections.EMPTY_LIST;
        c4678.f13674 = ProtoBuf$Expression.getDefaultInstance();
        c4678.f13676 = InvocationKind.AT_MOST_ONCE;
        c4678.f13677 = EffectConditionKind.CONCLUSION_CONDITION;
        return c4678;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9363 = (this.bitField0_ & 1) == 1 ? C4708.m9363(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iM9363 += C4708.m9360(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9363 += C4708.m9360(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9363 += C4708.m9363(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9363 += C4708.m9363(5, this.conditionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9363;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9377(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            c4708.m9370(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9370(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9377(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9377(5, this.conditionKind_.getNumber());
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Effect getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4678 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4678 toBuilder() {
        return newBuilder(this);
    }

    public static C4678 newBuilder(ProtoBuf$Effect protoBuf$Effect) {
        C4678 c4678NewBuilder = newBuilder();
        c4678NewBuilder.m9295(protoBuf$Effect);
        return c4678NewBuilder;
    }

    private ProtoBuf$Effect(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$Effect(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

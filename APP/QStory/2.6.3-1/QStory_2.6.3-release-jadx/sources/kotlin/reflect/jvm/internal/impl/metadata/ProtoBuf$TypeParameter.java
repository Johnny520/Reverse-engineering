package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5552;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {
    public static InterfaceC5531 PARSER = new C7746(20);
    private static final ProtoBuf$TypeParameter defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final AbstractC5542 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<ProtoBuf$Type> upperBound_;
    private Variance variance_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Variance implements InterfaceC5554 {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static InterfaceC5555 internalValueMap = new C5500();
        private final int value;

        Variance(int i, int i2) {
            this.value = i2;
        }

        public static Variance valueOf(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(true);
        defaultInstance = protoBuf$TypeParameter;
        protoBuf$TypeParameter.initFields();
    }

    private ProtoBuf$TypeParameter(C5541 c5541, C5558 c5558) {
        this.upperBoundIdMemoizedSerializedSize = -1;
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
                            this.id_ = c5541.m9956();
                        } else if (iM9946 == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = c5541.m9956();
                        } else if (iM9946 == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = c5541.m9953() != 0;
                        } else if (iM9946 == 32) {
                            int iM9956 = c5541.m9956();
                            Variance varianceValueOf = Variance.valueOf(iM9956);
                            if (varianceValueOf == null) {
                                c5540M9924.m9925(iM9946);
                                c5540M9924.m9925(iM9956);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = varianceValueOf;
                            }
                        } else if (iM9946 == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                        } else if (iM9946 == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(c5541.m9956()));
                        } else if (iM9946 == 50) {
                            int iM9942 = c5541.m9942(c5541.m9956());
                            if ((i & 32) != 32 && c5541.m9944() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (c5541.m9944() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(c5541.m9956()));
                            }
                            c5541.m9943(iM9942);
                        } else if (iM9946 == 802) {
                            if ((i & 64) != 64) {
                                this.annotation_ = new ArrayList();
                                i |= 64;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    }
                    if ((i & 64) == 64) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
        if ((i & 16) == 16) {
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if ((i & 32) == 32) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
        }
        if ((i & 64) == 64) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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

    public static ProtoBuf$TypeParameter getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = Variance.INV;
        List list = Collections.EMPTY_LIST;
        this.upperBound_ = list;
        this.upperBoundId_ = list;
        this.annotation_ = list;
    }

    public static C5503 newBuilder() {
        C5503 c5503 = new C5503();
        c5503.f14009 = Variance.INV;
        List list = Collections.EMPTY_LIST;
        c5503.f14010 = list;
        c5503.f14006 = list;
        c5503.f14005 = list;
        return c5503;
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public int getId() {
        return this.id_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9921 += C5540.m9921(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9923(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9922(4, this.variance_.getNumber());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            iM9921 += C5540.m9919(5, this.upperBound_.get(i2));
        }
        int iM9920 = 0;
        for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
            iM9920 += C5540.m9920(this.upperBoundId_.get(i3).intValue());
        }
        int iM9919 = iM9921 + iM9920;
        if (!getUpperBoundIdList().isEmpty()) {
            iM9919 = iM9919 + 1 + C5540.m9920(iM9920);
        }
        this.upperBoundIdMemoizedSerializedSize = iM9920;
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            iM9919 += C5540.m9919(100, this.annotation_.get(i4));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9919;
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$Type getUpperBound(int i) {
        return this.upperBound_.get(i);
    }

    public int getUpperBoundCount() {
        return this.upperBound_.size();
    }

    public List<Integer> getUpperBoundIdList() {
        return this.upperBoundId_;
    }

    public List<ProtoBuf$Type> getUpperBoundList() {
        return this.upperBound_;
    }

    public Variance getVariance() {
        return this.variance_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReified() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasVariance() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!hasId()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUpperBoundCount(); i++) {
            if (!getUpperBound(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        C5552 c5552NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            c5540.m9928(3, 0);
            c5540.m9933(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9936(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            c5540.m9929(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            c5540.m9925(50);
            c5540.m9925(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            c5540.m9930(this.upperBoundId_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            c5540.m9929(100, this.annotation_.get(i3));
        }
        c5552NewExtensionWriter.m9969(DescriptorProtos$Edition.EDITION_2023_VALUE, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5503 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5503 toBuilder() {
        return newBuilder(this);
    }

    public static C5503 newBuilder(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        C5503 c5503NewBuilder = newBuilder();
        c5503NewBuilder.m9848(protoBuf$TypeParameter);
        return c5503NewBuilder;
    }

    private ProtoBuf$TypeParameter(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$TypeParameter(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

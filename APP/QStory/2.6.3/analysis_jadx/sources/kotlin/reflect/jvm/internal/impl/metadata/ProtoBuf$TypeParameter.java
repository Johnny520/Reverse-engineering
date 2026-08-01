package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {
    public static InterfaceC4699 PARSER = new C6917(20);
    private static final ProtoBuf$TypeParameter defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final AbstractC4710 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<ProtoBuf$Type> upperBound_;
    private Variance variance_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Variance implements InterfaceC4722 {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static InterfaceC4723 internalValueMap = new C4668();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(true);
        defaultInstance = protoBuf$TypeParameter;
        protoBuf$TypeParameter.initFields();
    }

    private ProtoBuf$TypeParameter(C4709 c4709, C4726 c4726) {
        this.upperBoundIdMemoizedSerializedSize = -1;
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
                            this.id_ = c4709.m9397();
                        } else if (iM9387 == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = c4709.m9397();
                        } else if (iM9387 == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = c4709.m9394() != 0;
                        } else if (iM9387 == 32) {
                            int iM9397 = c4709.m9397();
                            Variance varianceValueOf = Variance.valueOf(iM9397);
                            if (varianceValueOf == null) {
                                c4708M9365.m9366(iM9387);
                                c4708M9365.m9366(iM9397);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = varianceValueOf;
                            }
                        } else if (iM9387 == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726));
                        } else if (iM9387 == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(c4709.m9397()));
                        } else if (iM9387 == 50) {
                            int iM9383 = c4709.m9383(c4709.m9397());
                            if ((i & 32) != 32 && c4709.m9385() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (c4709.m9385() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(c4709.m9397()));
                            }
                            c4709.m9384(iM9383);
                        } else if (iM9387 == 802) {
                            if ((i & 64) != 64) {
                                this.annotation_ = new ArrayList();
                                i |= 64;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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
            c4708M9365.m9376();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4711.m9403();
            throw th3;
        }
        this.unknownFields = c4711.m9403();
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

    public static C4671 newBuilder() {
        C4671 c4671 = new C4671();
        c4671.f13664 = Variance.INV;
        List list = Collections.EMPTY_LIST;
        c4671.f13665 = list;
        c4671.f13661 = list;
        c4671.f13660 = list;
        return c4671;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9362 += C4708.m9362(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9364(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9363(4, this.variance_.getNumber());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            iM9362 += C4708.m9360(5, this.upperBound_.get(i2));
        }
        int iM9361 = 0;
        for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
            iM9361 += C4708.m9361(this.upperBoundId_.get(i3).intValue());
        }
        int iM9360 = iM9362 + iM9361;
        if (!getUpperBoundIdList().isEmpty()) {
            iM9360 = iM9360 + 1 + C4708.m9361(iM9361);
        }
        this.upperBoundIdMemoizedSerializedSize = iM9361;
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            iM9360 += C4708.m9360(100, this.annotation_.get(i4));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9360;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            c4708.m9369(3, 0);
            c4708.m9374(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9377(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            c4708.m9370(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            c4708.m9366(50);
            c4708.m9366(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            c4708.m9371(this.upperBoundId_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            c4708.m9370(100, this.annotation_.get(i3));
        }
        c4720NewExtensionWriter.m9410(DescriptorProtos$Edition.EDITION_2023_VALUE, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4671 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4671 toBuilder() {
        return newBuilder(this);
    }

    public static C4671 newBuilder(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        C4671 c4671NewBuilder = newBuilder();
        c4671NewBuilder.m9289(protoBuf$TypeParameter);
        return c4671NewBuilder;
    }

    private ProtoBuf$TypeParameter(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$TypeParameter(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

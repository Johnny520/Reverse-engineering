package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {
    public static InterfaceC4698 PARSER = new C6916(20);
    private static final ProtoBuf$TypeParameter defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final AbstractC4709 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<ProtoBuf$Type> upperBound_;
    private Variance variance_;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Variance implements InterfaceC4721 {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static InterfaceC4722 internalValueMap = new C4667();
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(true);
        defaultInstance = protoBuf$TypeParameter;
        protoBuf$TypeParameter.initFields();
    }

    private ProtoBuf$TypeParameter(C4708 c4708, C4725 c4725) {
        this.upperBoundIdMemoizedSerializedSize = -1;
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
                            this.id_ = c4708.m9407();
                        } else if (iM9397 == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = c4708.m9407();
                        } else if (iM9397 == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = c4708.m9404() != 0;
                        } else if (iM9397 == 32) {
                            int iM9407 = c4708.m9407();
                            Variance varianceValueOf = Variance.valueOf(iM9407);
                            if (varianceValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM9407);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = varianceValueOf;
                            }
                        } else if (iM9397 == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725));
                        } else if (iM9397 == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(c4708.m9407()));
                        } else if (iM9397 == 50) {
                            int iM9393 = c4708.m9393(c4708.m9407());
                            if ((i & 32) != 32 && c4708.m9395() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (c4708.m9395() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(c4708.m9407()));
                            }
                            c4708.m9394(iM9393);
                        } else if (iM9397 == 802) {
                            if ((i & 64) != 64) {
                                this.annotation_ = new ArrayList();
                                i |= 64;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725));
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
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

    public static C4670 newBuilder() {
        C4670 c4670 = new C4670();
        c4670.f13660 = Variance.INV;
        List list = Collections.EMPTY_LIST;
        c4670.f13661 = list;
        c4670.f13657 = list;
        c4670.f13656 = list;
        return c4670;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9372 += C4707.m9372(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9374(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9373(4, this.variance_.getNumber());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            iM9372 += C4707.m9370(5, this.upperBound_.get(i2));
        }
        int iM9371 = 0;
        for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
            iM9371 += C4707.m9371(this.upperBoundId_.get(i3).intValue());
        }
        int iM9370 = iM9372 + iM9371;
        if (!getUpperBoundIdList().isEmpty()) {
            iM9370 = iM9370 + 1 + C4707.m9371(iM9371);
        }
        this.upperBoundIdMemoizedSerializedSize = iM9371;
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            iM9370 += C4707.m9370(100, this.annotation_.get(i4));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9370;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            c4707.m9379(3, 0);
            c4707.m9384(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9387(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            c4707.m9380(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            c4707.m9376(50);
            c4707.m9376(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            c4707.m9381(this.upperBoundId_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            c4707.m9380(100, this.annotation_.get(i3));
        }
        c4719NewExtensionWriter.m9420(DescriptorProtos$Edition.EDITION_2023_VALUE, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4670 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4670 toBuilder() {
        return newBuilder(this);
    }

    public static C4670 newBuilder(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        C4670 c4670NewBuilder = newBuilder();
        c4670NewBuilder.m9299(protoBuf$TypeParameter);
        return c4670NewBuilder;
    }

    private ProtoBuf$TypeParameter(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$TypeParameter(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

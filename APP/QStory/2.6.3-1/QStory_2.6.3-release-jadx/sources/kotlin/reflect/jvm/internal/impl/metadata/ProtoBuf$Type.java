package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5552;
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
public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {
    public static InterfaceC5531 PARSER = new C7746(18);
    private static final ProtoBuf$Type defaultInstance;
    private int abbreviatedTypeId_;
    private ProtoBuf$Type abbreviatedType_;
    private List<ProtoBuf$Annotation> annotation_;
    private List<Argument> argument_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private ProtoBuf$Type flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private boolean nullable_;
    private int outerTypeId_;
    private ProtoBuf$Type outerType_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(true);
        defaultInstance = protoBuf$Type;
        protoBuf$Type.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    private ProtoBuf$Type(C5541 c5541, C5558 c5558) {
        C5502 builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? unknownField = 16384;
            if (z) {
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                }
                if ((i & 16384) == 16384) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                try {
                    c5540M9924.m9935();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c5543.m9962();
                    throw th;
                }
                this.unknownFields = c5543.m9962();
                makeExtensionsImmutable();
                return;
            }
            try {
                try {
                    int iM9946 = c5541.m9946();
                    switch (iM9946) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = c5541.m9956();
                            break;
                        case 18:
                            if ((i & 1) != 1) {
                                this.argument_ = new ArrayList();
                                i |= 1;
                            }
                            this.argument_.add((Argument) c5541.m9939(Argument.PARSER, c5558));
                            break;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = c5541.m9953() != 0;
                            break;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = c5541.m9956();
                            break;
                        case 42:
                            builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(PARSER, c5558);
                            this.flexibleUpperBound_ = protoBuf$Type;
                            if (builder != null) {
                                builder.m9846(protoBuf$Type);
                                this.flexibleUpperBound_ = builder.m9847();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = c5541.m9956();
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = c5541.m9956();
                            break;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = c5541.m9956();
                            break;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = c5541.m9956();
                            break;
                        case 82:
                            builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c5541.m9939(PARSER, c5558);
                            this.outerType_ = protoBuf$Type2;
                            if (builder != null) {
                                builder.m9846(protoBuf$Type2);
                                this.outerType_ = builder.m9847();
                            }
                            this.bitField0_ |= 256;
                            break;
                        case 88:
                            this.bitField0_ |= 512;
                            this.outerTypeId_ = c5541.m9956();
                            break;
                        case 96:
                            this.bitField0_ |= 128;
                            this.typeAliasName_ = c5541.m9956();
                            break;
                        case 106:
                            builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) c5541.m9939(PARSER, c5558);
                            this.abbreviatedType_ = protoBuf$Type3;
                            if (builder != null) {
                                builder.m9846(protoBuf$Type3);
                                this.abbreviatedType_ = builder.m9847();
                            }
                            this.bitField0_ |= 1024;
                            break;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = c5541.m9956();
                            break;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.annotation_ = new ArrayList();
                                i |= 16384;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            break;
                        default:
                            unknownField = parseUnknownField(c5541, c5540M9924, c5558, iM9946);
                            if (unknownField == 0) {
                                z = true;
                            }
                            break;
                    }
                } catch (Throwable th2) {
                    if ((i & 1) == 1) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    if ((i & 16384) == unknownField) {
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
                    throw th2;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
    }

    public static ProtoBuf$Type getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        List list = Collections.EMPTY_LIST;
        this.argument_ = list;
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        this.flexibleUpperBound_ = getDefaultInstance();
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = getDefaultInstance();
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = getDefaultInstance();
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
        this.annotation_ = list;
    }

    public static C5502 newBuilder() {
        C5502 c5502 = new C5502();
        List list = Collections.EMPTY_LIST;
        c5502.f13999 = list;
        c5502.f14001 = getDefaultInstance();
        c5502.f13990 = getDefaultInstance();
        c5502.f13998 = getDefaultInstance();
        c5502.f13995 = list;
        return c5502;
    }

    public ProtoBuf$Type getAbbreviatedType() {
        return this.abbreviatedType_;
    }

    public int getAbbreviatedTypeId() {
        return this.abbreviatedTypeId_;
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

    public Argument getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    public List<Argument> getArgumentList() {
        return this.argument_;
    }

    public int getClassName() {
        return this.className_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFlexibleTypeCapabilitiesId() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public ProtoBuf$Type getFlexibleUpperBound() {
        return this.flexibleUpperBound_;
    }

    public int getFlexibleUpperBoundId() {
        return this.flexibleUpperBoundId_;
    }

    public boolean getNullable() {
        return this.nullable_;
    }

    public ProtoBuf$Type getOuterType() {
        return this.outerType_;
    }

    public int getOuterTypeId() {
        return this.outerTypeId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 4096) == 4096 ? C5540.m9921(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iM9921 += C5540.m9919(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9921 += C5540.m9923(3) + 1;
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9921 += C5540.m9921(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9919(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9921(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9921 += C5540.m9921(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9921(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9921 += C5540.m9921(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iM9921 += C5540.m9919(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iM9921 += C5540.m9921(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9921 += C5540.m9921(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            iM9921 += C5540.m9919(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iM9921 += C5540.m9921(14, this.abbreviatedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9921 += C5540.m9919(100, this.annotation_.get(i3));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getTypeAliasName() {
        return this.typeAliasName_;
    }

    public int getTypeParameter() {
        return this.typeParameter_;
    }

    public int getTypeParameterName() {
        return this.typeParameterName_;
    }

    public boolean hasAbbreviatedType() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasAbbreviatedTypeId() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasClassName() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 4096) == 4096;
    }

    public boolean hasFlexibleTypeCapabilitiesId() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasFlexibleUpperBound() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlexibleUpperBoundId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasNullable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasOuterType() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasOuterTypeId() {
        return (this.bitField0_ & 512) == 512;
    }

    public boolean hasTypeAliasName() {
        return (this.bitField0_ & 128) == 128;
    }

    public boolean hasTypeParameter() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeParameterName() {
        return (this.bitField0_ & 64) == 64;
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
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasOuterType() && !getOuterType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
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
        if ((this.bitField0_ & 4096) == 4096) {
            c5540.m9937(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            c5540.m9929(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            boolean z = this.nullable_;
            c5540.m9928(3, 0);
            c5540.m9933(z ? 1 : 0);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9929(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9937(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9937(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9937(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c5540.m9937(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            c5540.m9929(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            c5540.m9937(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            c5540.m9937(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            c5540.m9929(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            c5540.m9937(14, this.abbreviatedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c5540.m9929(100, this.annotation_.get(i2));
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Argument extends GeneratedMessageLite implements InterfaceC5532 {
        public static InterfaceC5531 PARSER = new C5507();
        private static final Argument defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Projection projection_;
        private int typeId_;
        private ProtoBuf$Type type_;
        private final AbstractC5542 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Projection implements InterfaceC5554 {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

            private static InterfaceC5555 internalValueMap = new C5498();
            private final int value;

            Projection(int i, int i2) {
                this.value = i2;
            }

            public static Projection valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Argument argument = new Argument(true);
            defaultInstance = argument;
            argument.initFields();
        }

        private Argument(C5541 c5541, C5558 c5558) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C5543 c5543 = new C5543();
            C5540 c5540M9924 = C5540.m9924(c5543, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM9946 = c5541.m9946();
                            if (iM9946 != 0) {
                                if (iM9946 == 8) {
                                    int iM9956 = c5541.m9956();
                                    Projection projectionValueOf = Projection.valueOf(iM9956);
                                    if (projectionValueOf == null) {
                                        c5540M9924.m9925(iM9946);
                                        c5540M9924.m9925(iM9956);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.projection_ = projectionValueOf;
                                    }
                                } else if (iM9946 == 18) {
                                    C5502 builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                                    this.type_ = protoBuf$Type;
                                    if (builder != null) {
                                        builder.m9846(protoBuf$Type);
                                        this.type_ = builder.m9847();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (iM9946 == 24) {
                                    this.bitField0_ |= 4;
                                    this.typeId_ = c5541.m9956();
                                } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
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

        public static Argument getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.projection_ = Projection.INV;
            this.type_ = ProtoBuf$Type.getDefaultInstance();
            this.typeId_ = 0;
        }

        public static C5499 newBuilder() {
            C5499 c5499 = new C5499();
            c5499.f13979 = Projection.INV;
            c5499.f13977 = ProtoBuf$Type.getDefaultInstance();
            return c5499;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public InterfaceC5531 getParserForType() {
            return PARSER;
        }

        public Projection getProjection() {
            return this.projection_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM9922 = (this.bitField0_ & 1) == 1 ? C5540.m9922(1, this.projection_.getNumber()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9922 += C5540.m9919(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM9922 += C5540.m9921(3, this.typeId_);
            }
            int size = this.unknownFields.size() + iM9922;
            this.memoizedSerializedSize = size;
            return size;
        }

        public ProtoBuf$Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public boolean hasProjection() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasType() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasTypeId() {
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
            if (!hasType() || getType().isInitialized()) {
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
                c5540.m9936(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                c5540.m9929(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                c5540.m9937(3, this.typeId_);
            }
            c5540.m9934(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5499 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5499 toBuilder() {
            return newBuilder(this);
        }

        public static C5499 newBuilder(Argument argument) {
            C5499 c5499NewBuilder = newBuilder();
            c5499NewBuilder.m9842(argument);
            return c5499NewBuilder;
        }

        private Argument(AbstractC5561 abstractC5561) {
            super(abstractC5561);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC5561.f14153;
        }

        private Argument(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC5542.f14119;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Type getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5502 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5502 toBuilder() {
        return newBuilder(this);
    }

    public static C5502 newBuilder(ProtoBuf$Type protoBuf$Type) {
        C5502 c5502NewBuilder = newBuilder();
        c5502NewBuilder.m9846(protoBuf$Type);
        return c5502NewBuilder;
    }

    private ProtoBuf$Type(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$Type(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

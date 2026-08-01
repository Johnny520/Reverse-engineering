package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
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
public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {
    public static InterfaceC4699 PARSER = new C6917(18);
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
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(true);
        defaultInstance = protoBuf$Type;
        protoBuf$Type.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    private ProtoBuf$Type(C4709 c4709, C4726 c4726) {
        C4670 builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
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
                    c4708M9365.m9376();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c4711.m9403();
                    throw th;
                }
                this.unknownFields = c4711.m9403();
                makeExtensionsImmutable();
                return;
            }
            try {
                try {
                    int iM9387 = c4709.m9387();
                    switch (iM9387) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = c4709.m9397();
                            break;
                        case 18:
                            if ((i & 1) != 1) {
                                this.argument_ = new ArrayList();
                                i |= 1;
                            }
                            this.argument_.add((Argument) c4709.m9380(Argument.PARSER, c4726));
                            break;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = c4709.m9394() != 0;
                            break;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = c4709.m9397();
                            break;
                        case 42:
                            builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4709.m9380(PARSER, c4726);
                            this.flexibleUpperBound_ = protoBuf$Type;
                            if (builder != null) {
                                builder.m9287(protoBuf$Type);
                                this.flexibleUpperBound_ = builder.m9288();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = c4709.m9397();
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = c4709.m9397();
                            break;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = c4709.m9397();
                            break;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = c4709.m9397();
                            break;
                        case 82:
                            builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c4709.m9380(PARSER, c4726);
                            this.outerType_ = protoBuf$Type2;
                            if (builder != null) {
                                builder.m9287(protoBuf$Type2);
                                this.outerType_ = builder.m9288();
                            }
                            this.bitField0_ |= 256;
                            break;
                        case 88:
                            this.bitField0_ |= 512;
                            this.outerTypeId_ = c4709.m9397();
                            break;
                        case 96:
                            this.bitField0_ |= 128;
                            this.typeAliasName_ = c4709.m9397();
                            break;
                        case 106:
                            builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) c4709.m9380(PARSER, c4726);
                            this.abbreviatedType_ = protoBuf$Type3;
                            if (builder != null) {
                                builder.m9287(protoBuf$Type3);
                                this.abbreviatedType_ = builder.m9288();
                            }
                            this.bitField0_ |= 1024;
                            break;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = c4709.m9397();
                            break;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.annotation_ = new ArrayList();
                                i |= 16384;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                            break;
                        default:
                            unknownField = parseUnknownField(c4709, c4708M9365, c4726, iM9387);
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
                        c4708M9365.m9376();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.unknownFields = c4711.m9403();
                        throw th3;
                    }
                    this.unknownFields = c4711.m9403();
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

    public static C4670 newBuilder() {
        C4670 c4670 = new C4670();
        List list = Collections.EMPTY_LIST;
        c4670.f13654 = list;
        c4670.f13656 = getDefaultInstance();
        c4670.f13645 = getDefaultInstance();
        c4670.f13653 = getDefaultInstance();
        c4670.f13650 = list;
        return c4670;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 4096) == 4096 ? C4708.m9362(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iM9362 += C4708.m9360(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9362 += C4708.m9364(3) + 1;
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9362 += C4708.m9362(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9360(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9362(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9362 += C4708.m9362(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9362(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9362 += C4708.m9362(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iM9362 += C4708.m9360(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iM9362 += C4708.m9362(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9362 += C4708.m9362(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            iM9362 += C4708.m9360(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iM9362 += C4708.m9362(14, this.abbreviatedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9362 += C4708.m9360(100, this.annotation_.get(i3));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9362;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 4096) == 4096) {
            c4708.m9378(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            c4708.m9370(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            boolean z = this.nullable_;
            c4708.m9369(3, 0);
            c4708.m9374(z ? 1 : 0);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9370(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9378(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9378(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9378(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c4708.m9378(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            c4708.m9370(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            c4708.m9378(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            c4708.m9378(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            c4708.m9370(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            c4708.m9378(14, this.abbreviatedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c4708.m9370(100, this.annotation_.get(i2));
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Argument extends GeneratedMessageLite implements InterfaceC4700 {
        public static InterfaceC4699 PARSER = new C4675();
        private static final Argument defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Projection projection_;
        private int typeId_;
        private ProtoBuf$Type type_;
        private final AbstractC4710 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Projection implements InterfaceC4722 {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

            private static InterfaceC4723 internalValueMap = new C4666();
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Argument argument = new Argument(true);
            defaultInstance = argument;
            argument.initFields();
        }

        private Argument(C4709 c4709, C4726 c4726) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C4711 c4711 = new C4711();
            C4708 c4708M9365 = C4708.m9365(c4711, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM9387 = c4709.m9387();
                            if (iM9387 != 0) {
                                if (iM9387 == 8) {
                                    int iM9397 = c4709.m9397();
                                    Projection projectionValueOf = Projection.valueOf(iM9397);
                                    if (projectionValueOf == null) {
                                        c4708M9365.m9366(iM9387);
                                        c4708M9365.m9366(iM9397);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.projection_ = projectionValueOf;
                                    }
                                } else if (iM9387 == 18) {
                                    C4670 builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                                    this.type_ = protoBuf$Type;
                                    if (builder != null) {
                                        builder.m9287(protoBuf$Type);
                                        this.type_ = builder.m9288();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (iM9387 == 24) {
                                    this.bitField0_ |= 4;
                                    this.typeId_ = c4709.m9397();
                                } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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

        public static Argument getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.projection_ = Projection.INV;
            this.type_ = ProtoBuf$Type.getDefaultInstance();
            this.typeId_ = 0;
        }

        public static C4667 newBuilder() {
            C4667 c4667 = new C4667();
            c4667.f13634 = Projection.INV;
            c4667.f13632 = ProtoBuf$Type.getDefaultInstance();
            return c4667;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public InterfaceC4699 getParserForType() {
            return PARSER;
        }

        public Projection getProjection() {
            return this.projection_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM9363 = (this.bitField0_ & 1) == 1 ? C4708.m9363(1, this.projection_.getNumber()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9363 += C4708.m9360(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM9363 += C4708.m9362(3, this.typeId_);
            }
            int size = this.unknownFields.size() + iM9363;
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public void writeTo(C4708 c4708) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4708.m9377(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                c4708.m9370(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                c4708.m9378(3, this.typeId_);
            }
            c4708.m9375(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4667 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4667 toBuilder() {
            return newBuilder(this);
        }

        public static C4667 newBuilder(Argument argument) {
            C4667 c4667NewBuilder = newBuilder();
            c4667NewBuilder.m9283(argument);
            return c4667NewBuilder;
        }

        private Argument(AbstractC4729 abstractC4729) {
            super(abstractC4729);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4729.f13808;
        }

        private Argument(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4710.f13774;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Type getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4670 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4670 toBuilder() {
        return newBuilder(this);
    }

    public static C4670 newBuilder(ProtoBuf$Type protoBuf$Type) {
        C4670 c4670NewBuilder = newBuilder();
        c4670NewBuilder.m9287(protoBuf$Type);
        return c4670NewBuilder;
    }

    private ProtoBuf$Type(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$Type(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

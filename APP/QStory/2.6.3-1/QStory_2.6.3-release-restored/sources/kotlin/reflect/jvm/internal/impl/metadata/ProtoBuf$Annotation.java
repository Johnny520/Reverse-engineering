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
public final class ProtoBuf$Annotation extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(4);
    private static final ProtoBuf$Annotation defaultInstance;
    private List<Argument> argument_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(true);
        defaultInstance = protoBuf$Annotation;
        protoBuf$Annotation.initFields();
    }

    private ProtoBuf$Annotation(C5541 c5541, C5558 c5558) {
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
                    try {
                        int iM9946 = c5541.m9946();
                        if (iM9946 != 0) {
                            if (iM9946 == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = c5541.m9956();
                            } else if (iM9946 == 18) {
                                if ((c & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c = 2;
                                }
                                this.argument_.add((Argument) c5541.m9939(Argument.PARSER, c5558));
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
                if ((c & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        }
        if ((c & 2) == 2) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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

    public static ProtoBuf$Annotation getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.id_ = 0;
        this.argument_ = Collections.EMPTY_LIST;
    }

    public static C5492 newBuilder() {
        C5492 c5492 = new C5492();
        c5492.f13958 = Collections.EMPTY_LIST;
        return c5492;
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

    public int getId() {
        return this.id_;
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
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.id_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iM9921 += C5540.m9919(2, this.argument_.get(i2));
        }
        int size = this.unknownFields.size() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
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
        if (!hasId()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
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
            c5540.m9937(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            c5540.m9929(2, this.argument_.get(i));
        }
        c5540.m9934(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Argument extends GeneratedMessageLite implements InterfaceC5532 {
        public static InterfaceC5531 PARSER = new C5497();
        private static final Argument defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nameId_;
        private final AbstractC5542 unknownFields;
        private Value value_;

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
                        int iM9946 = c5541.m9946();
                        if (iM9946 != 0) {
                            if (iM9946 == 8) {
                                this.bitField0_ |= 1;
                                this.nameId_ = c5541.m9956();
                            } else if (iM9946 == 18) {
                                C5494 builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                Value value = (Value) c5541.m9939(Value.PARSER, c5558);
                                this.value_ = value;
                                if (builder != null) {
                                    builder.m9838(value);
                                    this.value_ = builder.m9839();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                            }
                        }
                        z = true;
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
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
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
            this.nameId_ = 0;
            this.value_ = Value.getDefaultInstance();
        }

        public static C5496 newBuilder() {
            C5496 c5496 = new C5496();
            c5496.f13973 = Value.getDefaultInstance();
            return c5496;
        }

        public int getNameId() {
            return this.nameId_;
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
            int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.nameId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9921 += C5540.m9919(2, this.value_);
            }
            int size = this.unknownFields.size() + iM9921;
            this.memoizedSerializedSize = size;
            return size;
        }

        public Value getValue() {
            return this.value_;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasValue() {
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
            if (!hasNameId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasValue()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getValue().isInitialized()) {
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
                c5540.m9937(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c5540.m9929(2, this.value_);
            }
            c5540.m9934(this.unknownFields);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class Value extends GeneratedMessageLite implements InterfaceC5532 {
            public static InterfaceC5531 PARSER = new C5495();
            private static final Value defaultInstance;
            private ProtoBuf$Annotation annotation_;
            private int arrayDimensionCount_;
            private List<Value> arrayElement_;
            private int bitField0_;
            private int classId_;
            private double doubleValue_;
            private int enumValueId_;
            private int flags_;
            private float floatValue_;
            private long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int stringValue_;
            private Type type_;
            private final AbstractC5542 unknownFields;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Type implements InterfaceC5554 {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static InterfaceC5555 internalValueMap = new C5493();
                private final int value;

                Type(int i, int i2) {
                    this.value = i2;
                }

                public static Type valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                Value value = new Value(true);
                defaultInstance = value;
                value.initFields();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private Value(C5541 c5541, C5558 c5558) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                C5543 c5543 = new C5543();
                C5540 c5540M9924 = C5540.m9924(c5543, 1);
                boolean z = false;
                char c = 0;
                while (true) {
                    ?? unknownField = 256;
                    if (z) {
                        if ((c & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                                    int iM9956 = c5541.m9956();
                                    Type typeValueOf = Type.valueOf(iM9956);
                                    if (typeValueOf == null) {
                                        c5540M9924.m9925(iM9946);
                                        c5540M9924.m9925(iM9956);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.type_ = typeValueOf;
                                    }
                                    break;
                                case 16:
                                    this.bitField0_ |= 2;
                                    long jM9953 = c5541.m9953();
                                    this.intValue_ = (-(jM9953 & 1)) ^ (jM9953 >>> 1);
                                    break;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = Float.intBitsToFloat(c5541.m9951());
                                    break;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = Double.longBitsToDouble(c5541.m9955());
                                    break;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = c5541.m9956();
                                    break;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = c5541.m9956();
                                    break;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = c5541.m9956();
                                    break;
                                case 66:
                                    C5492 builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                    ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558);
                                    this.annotation_ = protoBuf$Annotation;
                                    if (builder != null) {
                                        builder.m9836(protoBuf$Annotation);
                                        this.annotation_ = builder.m9837();
                                    }
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    if ((c & 256) != 256) {
                                        this.arrayElement_ = new ArrayList();
                                        c = 256;
                                    }
                                    this.arrayElement_.add((Value) c5541.m9939(PARSER, c5558));
                                    break;
                                case 80:
                                    this.bitField0_ |= 512;
                                    this.flags_ = c5541.m9956();
                                    break;
                                case 88:
                                    this.bitField0_ |= 256;
                                    this.arrayDimensionCount_ = c5541.m9956();
                                    break;
                                default:
                                    unknownField = parseUnknownField(c5541, c5540M9924, c5558, iM9946);
                                    if (unknownField == 0) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (Throwable th2) {
                            if ((c & 256) == unknownField) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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

            public static Value getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.type_ = Type.BYTE;
                this.intValue_ = 0L;
                this.floatValue_ = 0.0f;
                this.doubleValue_ = 0.0d;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = ProtoBuf$Annotation.getDefaultInstance();
                this.arrayElement_ = Collections.EMPTY_LIST;
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            public static C5494 newBuilder() {
                C5494 c5494 = new C5494();
                c5494.f13972 = Type.BYTE;
                c5494.f13964 = ProtoBuf$Annotation.getDefaultInstance();
                c5494.f13963 = Collections.EMPTY_LIST;
                return c5494;
            }

            public ProtoBuf$Annotation getAnnotation() {
                return this.annotation_;
            }

            public int getArrayDimensionCount() {
                return this.arrayDimensionCount_;
            }

            public Value getArrayElement(int i) {
                return this.arrayElement_.get(i);
            }

            public int getArrayElementCount() {
                return this.arrayElement_.size();
            }

            public List<Value> getArrayElementList() {
                return this.arrayElement_;
            }

            public int getClassId() {
                return this.classId_;
            }

            public double getDoubleValue() {
                return this.doubleValue_;
            }

            public int getEnumValueId() {
                return this.enumValueId_;
            }

            public int getFlags() {
                return this.flags_;
            }

            public float getFloatValue() {
                return this.floatValue_;
            }

            public long getIntValue() {
                return this.intValue_;
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
                int iM9922 = (this.bitField0_ & 1) == 1 ? C5540.m9922(1, this.type_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    iM9922 += C5540.m9917((j >> 63) ^ (j << 1)) + C5540.m9923(2);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM9922 += C5540.m9923(3) + 4;
                }
                if ((this.bitField0_ & 8) == 8) {
                    iM9922 += C5540.m9923(4) + 8;
                }
                if ((this.bitField0_ & 16) == 16) {
                    iM9922 += C5540.m9921(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    iM9922 += C5540.m9921(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    iM9922 += C5540.m9921(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    iM9922 += C5540.m9919(8, this.annotation_);
                }
                for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                    iM9922 += C5540.m9919(9, this.arrayElement_.get(i2));
                }
                if ((this.bitField0_ & 512) == 512) {
                    iM9922 += C5540.m9921(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    iM9922 += C5540.m9921(11, this.arrayDimensionCount_);
                }
                int size = this.unknownFields.size() + iM9922;
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getStringValue() {
                return this.stringValue_;
            }

            public Type getType() {
                return this.type_;
            }

            public boolean hasAnnotation() {
                return (this.bitField0_ & 128) == 128;
            }

            public boolean hasArrayDimensionCount() {
                return (this.bitField0_ & 256) == 256;
            }

            public boolean hasClassId() {
                return (this.bitField0_ & 32) == 32;
            }

            public boolean hasDoubleValue() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasEnumValueId() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasFlags() {
                return (this.bitField0_ & 512) == 512;
            }

            public boolean hasFloatValue() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasIntValue() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasStringValue() {
                return (this.bitField0_ & 16) == 16;
            }

            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
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
                if (hasAnnotation() && !getAnnotation().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                for (int i = 0; i < getArrayElementCount(); i++) {
                    if (!getArrayElement(i).isInitialized()) {
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
                    c5540.m9936(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    c5540.m9928(2, 0);
                    c5540.m9927((j >> 63) ^ (j << 1));
                }
                if ((this.bitField0_ & 4) == 4) {
                    float f = this.floatValue_;
                    c5540.m9928(3, 5);
                    c5540.m9932(Float.floatToRawIntBits(f));
                }
                if ((this.bitField0_ & 8) == 8) {
                    double d = this.doubleValue_;
                    c5540.m9928(4, 1);
                    c5540.m9926(Double.doubleToRawLongBits(d));
                }
                if ((this.bitField0_ & 16) == 16) {
                    c5540.m9937(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    c5540.m9937(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    c5540.m9937(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    c5540.m9929(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    c5540.m9929(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & 512) == 512) {
                    c5540.m9937(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    c5540.m9937(11, this.arrayDimensionCount_);
                }
                c5540.m9934(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Value getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
            public C5494 newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
            public C5494 toBuilder() {
                return newBuilder(this);
            }

            public static C5494 newBuilder(Value value) {
                C5494 c5494NewBuilder = newBuilder();
                c5494NewBuilder.m9838(value);
                return c5494NewBuilder;
            }

            private Value(AbstractC5561 abstractC5561) {
                super(abstractC5561);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = abstractC5561.f14153;
            }

            private Value(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = AbstractC5542.f14119;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5496 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5496 toBuilder() {
            return newBuilder(this);
        }

        public static C5496 newBuilder(Argument argument) {
            C5496 c5496NewBuilder = newBuilder();
            c5496NewBuilder.m9840(argument);
            return c5496NewBuilder;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Annotation getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5492 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5492 toBuilder() {
        return newBuilder(this);
    }

    public static C5492 newBuilder(ProtoBuf$Annotation protoBuf$Annotation) {
        C5492 c5492NewBuilder = newBuilder();
        c5492NewBuilder.m9836(protoBuf$Annotation);
        return c5492NewBuilder;
    }

    private ProtoBuf$Annotation(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$Annotation(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

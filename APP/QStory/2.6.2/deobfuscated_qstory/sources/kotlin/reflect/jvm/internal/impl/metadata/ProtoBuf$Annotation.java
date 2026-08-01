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
public final class ProtoBuf$Annotation extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(4);
    private static final ProtoBuf$Annotation defaultInstance;
    private List<Argument> argument_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(true);
        defaultInstance = protoBuf$Annotation;
        protoBuf$Annotation.initFields();
    }

    private ProtoBuf$Annotation(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        if (iM9397 != 0) {
                            if (iM9397 == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = c4708.m9407();
                            } else if (iM9397 == 18) {
                                if ((c & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c = 2;
                                }
                                this.argument_.add((Argument) c4708.m9390(Argument.PARSER, c4725));
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
        }
        if ((c & 2) == 2) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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

    public static ProtoBuf$Annotation getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.id_ = 0;
        this.argument_ = Collections.EMPTY_LIST;
    }

    public static C4659 newBuilder() {
        C4659 c4659 = new C4659();
        c4659.f13609 = Collections.EMPTY_LIST;
        return c4659;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.id_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iM9372 += C4707.m9370(2, this.argument_.get(i2));
        }
        int size = this.unknownFields.size() + iM9372;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            c4707.m9380(2, this.argument_.get(i));
        }
        c4707.m9385(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Argument extends GeneratedMessageLite implements InterfaceC4699 {
        public static InterfaceC4698 PARSER = new C4664();
        private static final Argument defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nameId_;
        private final AbstractC4709 unknownFields;
        private Value value_;

        static {
            Argument argument = new Argument(true);
            defaultInstance = argument;
            argument.initFields();
        }

        private Argument(C4708 c4708, C4725 c4725) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C4710 c4710 = new C4710();
            C4707 c4707M9375 = C4707.m9375(c4710, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        if (iM9397 != 0) {
                            if (iM9397 == 8) {
                                this.bitField0_ |= 1;
                                this.nameId_ = c4708.m9407();
                            } else if (iM9397 == 18) {
                                C4661 builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                Value value = (Value) c4708.m9390(Value.PARSER, c4725);
                                this.value_ = value;
                                if (builder != null) {
                                    builder.m9289(value);
                                    this.value_ = builder.m9290();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
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

        public static Argument getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.nameId_ = 0;
            this.value_ = Value.getDefaultInstance();
        }

        public static C4663 newBuilder() {
            C4663 c4663 = new C4663();
            c4663.f13624 = Value.getDefaultInstance();
            return c4663;
        }

        public int getNameId() {
            return this.nameId_;
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
            int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.nameId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9372 += C4707.m9370(2, this.value_);
            }
            int size = this.unknownFields.size() + iM9372;
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public void writeTo(C4707 c4707) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4707.m9388(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c4707.m9380(2, this.value_);
            }
            c4707.m9385(this.unknownFields);
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class Value extends GeneratedMessageLite implements InterfaceC4699 {
            public static InterfaceC4698 PARSER = new C4662();
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
            private final AbstractC4709 unknownFields;

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public enum Type implements InterfaceC4721 {
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

                private static InterfaceC4722 internalValueMap = new C4660();
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

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
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
            private Value(C4708 c4708, C4725 c4725) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                C4710 c4710 = new C4710();
                C4707 c4707M9375 = C4707.m9375(c4710, 1);
                boolean z = false;
                char c = 0;
                while (true) {
                    ?? unknownField = 256;
                    if (z) {
                        if ((c & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                        }
                        try {
                            c4707M9375.m9386();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            this.unknownFields = c4710.m9413();
                            throw th;
                        }
                        this.unknownFields = c4710.m9413();
                        makeExtensionsImmutable();
                        return;
                    }
                    try {
                        try {
                            int iM9397 = c4708.m9397();
                            switch (iM9397) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    int iM9407 = c4708.m9407();
                                    Type typeValueOf = Type.valueOf(iM9407);
                                    if (typeValueOf == null) {
                                        c4707M9375.m9376(iM9397);
                                        c4707M9375.m9376(iM9407);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.type_ = typeValueOf;
                                    }
                                    break;
                                case 16:
                                    this.bitField0_ |= 2;
                                    long jM9404 = c4708.m9404();
                                    this.intValue_ = (-(jM9404 & 1)) ^ (jM9404 >>> 1);
                                    break;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = Float.intBitsToFloat(c4708.m9402());
                                    break;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = Double.longBitsToDouble(c4708.m9406());
                                    break;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = c4708.m9407();
                                    break;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = c4708.m9407();
                                    break;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = c4708.m9407();
                                    break;
                                case 66:
                                    C4659 builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                    ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725);
                                    this.annotation_ = protoBuf$Annotation;
                                    if (builder != null) {
                                        builder.m9287(protoBuf$Annotation);
                                        this.annotation_ = builder.m9288();
                                    }
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    if ((c & 256) != 256) {
                                        this.arrayElement_ = new ArrayList();
                                        c = 256;
                                    }
                                    this.arrayElement_.add((Value) c4708.m9390(PARSER, c4725));
                                    break;
                                case 80:
                                    this.bitField0_ |= 512;
                                    this.flags_ = c4708.m9407();
                                    break;
                                case 88:
                                    this.bitField0_ |= 256;
                                    this.arrayDimensionCount_ = c4708.m9407();
                                    break;
                                default:
                                    unknownField = parseUnknownField(c4708, c4707M9375, c4725, iM9397);
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
                                c4707M9375.m9386();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
                                this.unknownFields = c4710.m9413();
                                throw th3;
                            }
                            this.unknownFields = c4710.m9413();
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

            public static C4661 newBuilder() {
                C4661 c4661 = new C4661();
                c4661.f13623 = Type.BYTE;
                c4661.f13615 = ProtoBuf$Annotation.getDefaultInstance();
                c4661.f13614 = Collections.EMPTY_LIST;
                return c4661;
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
            public InterfaceC4698 getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM9373 = (this.bitField0_ & 1) == 1 ? C4707.m9373(1, this.type_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    iM9373 += C4707.m9368((j >> 63) ^ (j << 1)) + C4707.m9374(2);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iM9373 += C4707.m9374(3) + 4;
                }
                if ((this.bitField0_ & 8) == 8) {
                    iM9373 += C4707.m9374(4) + 8;
                }
                if ((this.bitField0_ & 16) == 16) {
                    iM9373 += C4707.m9372(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    iM9373 += C4707.m9372(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    iM9373 += C4707.m9372(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    iM9373 += C4707.m9370(8, this.annotation_);
                }
                for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                    iM9373 += C4707.m9370(9, this.arrayElement_.get(i2));
                }
                if ((this.bitField0_ & 512) == 512) {
                    iM9373 += C4707.m9372(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    iM9373 += C4707.m9372(11, this.arrayDimensionCount_);
                }
                int size = this.unknownFields.size() + iM9373;
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
            public void writeTo(C4707 c4707) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    c4707.m9387(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    c4707.m9379(2, 0);
                    c4707.m9378((j >> 63) ^ (j << 1));
                }
                if ((this.bitField0_ & 4) == 4) {
                    float f = this.floatValue_;
                    c4707.m9379(3, 5);
                    c4707.m9383(Float.floatToRawIntBits(f));
                }
                if ((this.bitField0_ & 8) == 8) {
                    double d = this.doubleValue_;
                    c4707.m9379(4, 1);
                    c4707.m9377(Double.doubleToRawLongBits(d));
                }
                if ((this.bitField0_ & 16) == 16) {
                    c4707.m9388(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    c4707.m9388(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    c4707.m9388(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    c4707.m9380(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    c4707.m9380(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & 512) == 512) {
                    c4707.m9388(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    c4707.m9388(11, this.arrayDimensionCount_);
                }
                c4707.m9385(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Value getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
            public C4661 newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
            public C4661 toBuilder() {
                return newBuilder(this);
            }

            public static C4661 newBuilder(Value value) {
                C4661 c4661NewBuilder = newBuilder();
                c4661NewBuilder.m9289(value);
                return c4661NewBuilder;
            }

            private Value(AbstractC4728 abstractC4728) {
                super(abstractC4728);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = abstractC4728.f13804;
            }

            private Value(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = AbstractC4709.f13770;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4663 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4663 toBuilder() {
            return newBuilder(this);
        }

        public static C4663 newBuilder(Argument argument) {
            C4663 c4663NewBuilder = newBuilder();
            c4663NewBuilder.m9291(argument);
            return c4663NewBuilder;
        }

        private Argument(AbstractC4728 abstractC4728) {
            super(abstractC4728);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4728.f13804;
        }

        private Argument(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4709.f13770;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Annotation getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4659 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4659 toBuilder() {
        return newBuilder(this);
    }

    public static C4659 newBuilder(ProtoBuf$Annotation protoBuf$Annotation) {
        C4659 c4659NewBuilder = newBuilder();
        c4659NewBuilder.m9287(protoBuf$Annotation);
        return c4659NewBuilder;
    }

    private ProtoBuf$Annotation(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$Annotation(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

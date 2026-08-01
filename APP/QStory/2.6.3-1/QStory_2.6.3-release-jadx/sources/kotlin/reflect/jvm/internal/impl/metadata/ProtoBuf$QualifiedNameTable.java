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
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(16);
    private static final ProtoBuf$QualifiedNameTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<QualifiedName> qualifiedName_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(true);
        defaultInstance = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.initFields();
    }

    private ProtoBuf$QualifiedNameTable(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 10) {
                            if (!z2) {
                                this.qualifiedName_ = new ArrayList();
                                z2 = true;
                            }
                            this.qualifiedName_.add((QualifiedName) c5541.m9939(QualifiedName.PARSER, c5558));
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
        if (z2) {
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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

    public static ProtoBuf$QualifiedNameTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.qualifiedName_ = Collections.EMPTY_LIST;
    }

    public static C5504 newBuilder() {
        C5504 c5504 = new C5504();
        c5504.f14014 = Collections.EMPTY_LIST;
        return c5504;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public QualifiedName getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9919 = 0;
        for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
            iM9919 += C5540.m9919(1, this.qualifiedName_.get(i2));
        }
        int size = this.unknownFields.size() + iM9919;
        this.memoizedSerializedSize = size;
        return size;
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
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            c5540.m9929(1, this.qualifiedName_.get(i));
        }
        c5540.m9934(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class QualifiedName extends GeneratedMessageLite implements InterfaceC5532 {
        public static InterfaceC5531 PARSER = new C5508();
        private static final QualifiedName defaultInstance;
        private int bitField0_;
        private Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int parentQualifiedName_;
        private int shortName_;
        private final AbstractC5542 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Kind implements InterfaceC5554 {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static InterfaceC5555 internalValueMap = new C5506();
            private final int value;

            Kind(int i, int i2) {
                this.value = i2;
            }

            public static Kind valueOf(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName(true);
            defaultInstance = qualifiedName;
            qualifiedName.initFields();
        }

        private QualifiedName(C5541 c5541, C5558 c5558) {
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
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = c5541.m9956();
                                } else if (iM9946 == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = c5541.m9956();
                                } else if (iM9946 == 24) {
                                    int iM9956 = c5541.m9956();
                                    Kind kindValueOf = Kind.valueOf(iM9956);
                                    if (kindValueOf == null) {
                                        c5540M9924.m9925(iM9946);
                                        c5540M9924.m9925(iM9956);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = kindValueOf;
                                    }
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

        public static QualifiedName getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
        }

        public static C5509 newBuilder() {
            C5509 c5509 = new C5509();
            c5509.f14018 = -1;
            c5509.f14015 = Kind.PACKAGE;
            return c5509;
        }

        public Kind getKind() {
            return this.kind_;
        }

        public int getParentQualifiedName() {
            return this.parentQualifiedName_;
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
            int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.parentQualifiedName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9921 += C5540.m9921(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM9921 += C5540.m9922(3, this.kind_.getNumber());
            }
            int size = this.unknownFields.size() + iM9921;
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getShortName() {
            return this.shortName_;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasParentQualifiedName() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasShortName() {
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
            if (hasShortName()) {
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
                c5540.m9937(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c5540.m9937(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                c5540.m9936(3, this.kind_.getNumber());
            }
            c5540.m9934(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public QualifiedName getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5509 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5509 toBuilder() {
            return newBuilder(this);
        }

        public static C5509 newBuilder(QualifiedName qualifiedName) {
            C5509 c5509NewBuilder = newBuilder();
            c5509NewBuilder.m9852(qualifiedName);
            return c5509NewBuilder;
        }

        private QualifiedName(AbstractC5561 abstractC5561) {
            super(abstractC5561);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC5561.f14153;
        }

        private QualifiedName(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC5542.f14119;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$QualifiedNameTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5504 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5504 toBuilder() {
        return newBuilder(this);
    }

    public static C5504 newBuilder(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        C5504 c5504NewBuilder = newBuilder();
        c5504NewBuilder.m9850(protoBuf$QualifiedNameTable);
        return c5504NewBuilder;
    }

    private ProtoBuf$QualifiedNameTable(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$QualifiedNameTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

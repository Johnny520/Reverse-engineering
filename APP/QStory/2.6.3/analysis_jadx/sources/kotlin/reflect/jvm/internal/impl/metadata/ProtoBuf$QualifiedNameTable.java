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
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(16);
    private static final ProtoBuf$QualifiedNameTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<QualifiedName> qualifiedName_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(true);
        defaultInstance = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.initFields();
    }

    private ProtoBuf$QualifiedNameTable(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 10) {
                            if (!z2) {
                                this.qualifiedName_ = new ArrayList();
                                z2 = true;
                            }
                            this.qualifiedName_.add((QualifiedName) c4709.m9380(QualifiedName.PARSER, c4726));
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
        if (z2) {
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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

    public static ProtoBuf$QualifiedNameTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.qualifiedName_ = Collections.EMPTY_LIST;
    }

    public static C4672 newBuilder() {
        C4672 c4672 = new C4672();
        c4672.f13669 = Collections.EMPTY_LIST;
        return c4672;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public QualifiedName getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = 0;
        for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
            iM9360 += C4708.m9360(1, this.qualifiedName_.get(i2));
        }
        int size = this.unknownFields.size() + iM9360;
        this.memoizedSerializedSize = size;
        return size;
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
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            c4708.m9370(1, this.qualifiedName_.get(i));
        }
        c4708.m9375(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class QualifiedName extends GeneratedMessageLite implements InterfaceC4700 {
        public static InterfaceC4699 PARSER = new C4676();
        private static final QualifiedName defaultInstance;
        private int bitField0_;
        private Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int parentQualifiedName_;
        private int shortName_;
        private final AbstractC4710 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Kind implements InterfaceC4722 {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static InterfaceC4723 internalValueMap = new C4674();
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName(true);
            defaultInstance = qualifiedName;
            qualifiedName.initFields();
        }

        private QualifiedName(C4709 c4709, C4726 c4726) {
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
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = c4709.m9397();
                                } else if (iM9387 == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = c4709.m9397();
                                } else if (iM9387 == 24) {
                                    int iM9397 = c4709.m9397();
                                    Kind kindValueOf = Kind.valueOf(iM9397);
                                    if (kindValueOf == null) {
                                        c4708M9365.m9366(iM9387);
                                        c4708M9365.m9366(iM9397);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = kindValueOf;
                                    }
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

        public static QualifiedName getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
        }

        public static C4677 newBuilder() {
            C4677 c4677 = new C4677();
            c4677.f13673 = -1;
            c4677.f13670 = Kind.PACKAGE;
            return c4677;
        }

        public Kind getKind() {
            return this.kind_;
        }

        public int getParentQualifiedName() {
            return this.parentQualifiedName_;
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
            int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.parentQualifiedName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9362 += C4708.m9362(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM9362 += C4708.m9363(3, this.kind_.getNumber());
            }
            int size = this.unknownFields.size() + iM9362;
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public void writeTo(C4708 c4708) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4708.m9378(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c4708.m9378(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                c4708.m9377(3, this.kind_.getNumber());
            }
            c4708.m9375(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public QualifiedName getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4677 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4677 toBuilder() {
            return newBuilder(this);
        }

        public static C4677 newBuilder(QualifiedName qualifiedName) {
            C4677 c4677NewBuilder = newBuilder();
            c4677NewBuilder.m9293(qualifiedName);
            return c4677NewBuilder;
        }

        private QualifiedName(AbstractC4729 abstractC4729) {
            super(abstractC4729);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4729.f13808;
        }

        private QualifiedName(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4710.f13774;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$QualifiedNameTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4672 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4672 toBuilder() {
        return newBuilder(this);
    }

    public static C4672 newBuilder(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        C4672 c4672NewBuilder = newBuilder();
        c4672NewBuilder.m9291(protoBuf$QualifiedNameTable);
        return c4672NewBuilder;
    }

    private ProtoBuf$QualifiedNameTable(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$QualifiedNameTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

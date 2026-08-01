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
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(16);
    private static final ProtoBuf$QualifiedNameTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<QualifiedName> qualifiedName_;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(true);
        defaultInstance = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.initFields();
    }

    private ProtoBuf$QualifiedNameTable(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 10) {
                            if (!z2) {
                                this.qualifiedName_ = new ArrayList();
                                z2 = true;
                            }
                            this.qualifiedName_.add((QualifiedName) c4708.m9390(QualifiedName.PARSER, c4725));
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
        if (z2) {
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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

    public static ProtoBuf$QualifiedNameTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.qualifiedName_ = Collections.EMPTY_LIST;
    }

    public static C4671 newBuilder() {
        C4671 c4671 = new C4671();
        c4671.f13665 = Collections.EMPTY_LIST;
        return c4671;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public QualifiedName getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9370 = 0;
        for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
            iM9370 += C4707.m9370(1, this.qualifiedName_.get(i2));
        }
        int size = this.unknownFields.size() + iM9370;
        this.memoizedSerializedSize = size;
        return size;
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
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            c4707.m9380(1, this.qualifiedName_.get(i));
        }
        c4707.m9385(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class QualifiedName extends GeneratedMessageLite implements InterfaceC4699 {
        public static InterfaceC4698 PARSER = new C4675();
        private static final QualifiedName defaultInstance;
        private int bitField0_;
        private Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int parentQualifiedName_;
        private int shortName_;
        private final AbstractC4709 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum Kind implements InterfaceC4721 {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static InterfaceC4722 internalValueMap = new C4673();
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName(true);
            defaultInstance = qualifiedName;
            qualifiedName.initFields();
        }

        private QualifiedName(C4708 c4708, C4725 c4725) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C4710 c4710 = new C4710();
            C4707 c4707M9375 = C4707.m9375(c4710, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iM9397 = c4708.m9397();
                            if (iM9397 != 0) {
                                if (iM9397 == 8) {
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = c4708.m9407();
                                } else if (iM9397 == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = c4708.m9407();
                                } else if (iM9397 == 24) {
                                    int iM9407 = c4708.m9407();
                                    Kind kindValueOf = Kind.valueOf(iM9407);
                                    if (kindValueOf == null) {
                                        c4707M9375.m9376(iM9397);
                                        c4707M9375.m9376(iM9407);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = kindValueOf;
                                    }
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

        public static QualifiedName getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
        }

        public static C4676 newBuilder() {
            C4676 c4676 = new C4676();
            c4676.f13669 = -1;
            c4676.f13666 = Kind.PACKAGE;
            return c4676;
        }

        public Kind getKind() {
            return this.kind_;
        }

        public int getParentQualifiedName() {
            return this.parentQualifiedName_;
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
            int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.parentQualifiedName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9372 += C4707.m9372(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iM9372 += C4707.m9373(3, this.kind_.getNumber());
            }
            int size = this.unknownFields.size() + iM9372;
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public void writeTo(C4707 c4707) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4707.m9388(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c4707.m9388(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                c4707.m9387(3, this.kind_.getNumber());
            }
            c4707.m9385(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public QualifiedName getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4676 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4676 toBuilder() {
            return newBuilder(this);
        }

        public static C4676 newBuilder(QualifiedName qualifiedName) {
            C4676 c4676NewBuilder = newBuilder();
            c4676NewBuilder.m9303(qualifiedName);
            return c4676NewBuilder;
        }

        private QualifiedName(AbstractC4728 abstractC4728) {
            super(abstractC4728);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4728.f13804;
        }

        private QualifiedName(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4709.f13770;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$QualifiedNameTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4671 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4671 toBuilder() {
        return newBuilder(this);
    }

    public static C4671 newBuilder(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        C4671 c4671NewBuilder = newBuilder();
        c4671NewBuilder.m9301(protoBuf$QualifiedNameTable);
        return c4671NewBuilder;
    }

    private ProtoBuf$QualifiedNameTable(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$QualifiedNameTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

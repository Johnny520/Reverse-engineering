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
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6957;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(24);
    private static final ProtoBuf$VersionRequirementTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$VersionRequirement> requirement_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(true);
        defaultInstance = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.initFields();
    }

    private ProtoBuf$VersionRequirementTable(C4709 c4709, C4726 c4726) {
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
                                this.requirement_ = new ArrayList();
                                z2 = true;
                            }
                            this.requirement_.add((ProtoBuf$VersionRequirement) c4709.m9380(ProtoBuf$VersionRequirement.PARSER, c4726));
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
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

    public static ProtoBuf$VersionRequirementTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.requirement_ = Collections.EMPTY_LIST;
    }

    public static C6957 newBuilder() {
        C6957 c6957 = new C6957();
        c6957.f18595 = Collections.EMPTY_LIST;
        return c6957;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public List<ProtoBuf$VersionRequirement> getRequirementList() {
        return this.requirement_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iM9360 += C4708.m9360(1, this.requirement_.get(i2));
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            c4708.m9370(1, this.requirement_.get(i));
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirementTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6957 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6957 toBuilder() {
        return newBuilder(this);
    }

    public static C6957 newBuilder(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        C6957 c6957NewBuilder = newBuilder();
        c6957NewBuilder.m12256(protoBuf$VersionRequirementTable);
        return c6957NewBuilder;
    }

    private ProtoBuf$VersionRequirementTable(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$VersionRequirementTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

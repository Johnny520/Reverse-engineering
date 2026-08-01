package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4714;
import kotlin.reflect.jvm.internal.impl.protobuf.C4716;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6954;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$StringTable extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(17);
    private static final ProtoBuf$StringTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private InterfaceC4718 string_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(true);
        defaultInstance = protoBuf$StringTable;
        protoBuf$StringTable.initFields();
    }

    private ProtoBuf$StringTable(C4709 c4709, C4726 c4726) {
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
                            C4716 c4716M9382 = c4709.m9382();
                            if (!z2) {
                                this.string_ = new C4714();
                                z2 = true;
                            }
                            this.string_.mo9336(c4716M9382);
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.string_ = this.string_.mo9338();
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
            this.string_ = this.string_.mo9338();
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

    public static ProtoBuf$StringTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.string_ = C4714.f13781;
    }

    public static C6954 newBuilder() {
        C6954 c6954 = new C6954();
        c6954.f18589 = C4714.f13781;
        return c6954;
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
        int size = 0;
        for (int i2 = 0; i2 < this.string_.size(); i2++) {
            AbstractC4710 abstractC4710Mo9337 = this.string_.mo9337(i2);
            size += abstractC4710Mo9337.size() + C4708.m9359(abstractC4710Mo9337.size());
        }
        int size2 = this.unknownFields.size() + getStringList().size() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public String getString(int i) {
        return (String) this.string_.get(i);
    }

    public InterfaceC4698 getStringList() {
        return this.string_;
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
        for (int i = 0; i < this.string_.size(); i++) {
            AbstractC4710 abstractC4710Mo9337 = this.string_.mo9337(i);
            c4708.m9369(1, 2);
            c4708.m9366(abstractC4710Mo9337.size());
            c4708.m9375(abstractC4710Mo9337);
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$StringTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6954 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6954 toBuilder() {
        return newBuilder(this);
    }

    public static C6954 newBuilder(ProtoBuf$StringTable protoBuf$StringTable) {
        C6954 c6954NewBuilder = newBuilder();
        c6954NewBuilder.m12252(protoBuf$StringTable);
        return c6954NewBuilder;
    }

    private ProtoBuf$StringTable(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$StringTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

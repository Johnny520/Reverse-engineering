package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
import p075.C6950;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$CompilerPluginData extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(6);
    private static final ProtoBuf$CompilerPluginData defaultInstance;
    private int bitField0_;
    private AbstractC4710 data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData = new ProtoBuf$CompilerPluginData(true);
        defaultInstance = protoBuf$CompilerPluginData;
        protoBuf$CompilerPluginData.initFields();
    }

    private ProtoBuf$CompilerPluginData(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 8) {
                            this.bitField0_ |= 1;
                            this.pluginId_ = c4709.m9397();
                        } else if (iM9387 == 18) {
                            this.bitField0_ |= 2;
                            this.data_ = c4709.m9382();
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
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
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
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

    public static ProtoBuf$CompilerPluginData getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.pluginId_ = 0;
        this.data_ = AbstractC4710.f13774;
    }

    public static C6950 newBuilder() {
        C6950 c6950 = new C6950();
        c6950.f18550 = AbstractC4710.f13774;
        return c6950;
    }

    public AbstractC4710 getData() {
        return this.data_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public int getPluginId() {
        return this.pluginId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.pluginId_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            AbstractC4710 abstractC4710 = this.data_;
            iM9362 += abstractC4710.size() + C4708.m9359(abstractC4710.size()) + C4708.m9364(2);
        }
        int size = this.unknownFields.size() + iM9362;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasPluginId() {
        return (this.bitField0_ & 1) == 1;
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
        if (!hasPluginId()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasData()) {
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
            c4708.m9378(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            AbstractC4710 abstractC4710 = this.data_;
            c4708.m9369(2, 2);
            c4708.m9366(abstractC4710.size());
            c4708.m9375(abstractC4710);
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$CompilerPluginData getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6950 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6950 toBuilder() {
        return newBuilder(this);
    }

    public static C6950 newBuilder(ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData) {
        C6950 c6950NewBuilder = newBuilder();
        c6950NewBuilder.m12244(protoBuf$CompilerPluginData);
        return c6950NewBuilder;
    }

    private ProtoBuf$CompilerPluginData(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private ProtoBuf$CompilerPluginData(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

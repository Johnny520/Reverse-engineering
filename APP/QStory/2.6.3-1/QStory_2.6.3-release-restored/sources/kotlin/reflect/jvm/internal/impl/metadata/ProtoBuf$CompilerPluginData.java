package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7779;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$CompilerPluginData extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(6);
    private static final ProtoBuf$CompilerPluginData defaultInstance;
    private int bitField0_;
    private AbstractC5542 data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData = new ProtoBuf$CompilerPluginData(true);
        defaultInstance = protoBuf$CompilerPluginData;
        protoBuf$CompilerPluginData.initFields();
    }

    private ProtoBuf$CompilerPluginData(C5541 c5541, C5558 c5558) {
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
                            this.pluginId_ = c5541.m9956();
                        } else if (iM9946 == 18) {
                            this.bitField0_ |= 2;
                            this.data_ = c5541.m9941();
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

    public static ProtoBuf$CompilerPluginData getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.pluginId_ = 0;
        this.data_ = AbstractC5542.f14119;
    }

    public static C7779 newBuilder() {
        C7779 c7779 = new C7779();
        c7779.f18895 = AbstractC5542.f14119;
        return c7779;
    }

    public AbstractC5542 getData() {
        return this.data_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public int getPluginId() {
        return this.pluginId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.pluginId_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            AbstractC5542 abstractC5542 = this.data_;
            iM9921 += abstractC5542.size() + C5540.m9918(abstractC5542.size()) + C5540.m9923(2);
        }
        int size = this.unknownFields.size() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasPluginId() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            AbstractC5542 abstractC5542 = this.data_;
            c5540.m9928(2, 2);
            c5540.m9925(abstractC5542.size());
            c5540.m9934(abstractC5542);
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$CompilerPluginData getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7779 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7779 toBuilder() {
        return newBuilder(this);
    }

    public static C7779 newBuilder(ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData) {
        C7779 c7779NewBuilder = newBuilder();
        c7779NewBuilder.m12803(protoBuf$CompilerPluginData);
        return c7779NewBuilder;
    }

    private ProtoBuf$CompilerPluginData(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$CompilerPluginData(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

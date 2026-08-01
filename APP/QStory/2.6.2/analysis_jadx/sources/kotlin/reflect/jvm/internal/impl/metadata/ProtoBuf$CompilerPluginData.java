package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6949;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$CompilerPluginData extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(6);
    private static final ProtoBuf$CompilerPluginData defaultInstance;
    private int bitField0_;
    private AbstractC4709 data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData = new ProtoBuf$CompilerPluginData(true);
        defaultInstance = protoBuf$CompilerPluginData;
        protoBuf$CompilerPluginData.initFields();
    }

    private ProtoBuf$CompilerPluginData(C4708 c4708, C4725 c4725) {
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
                            this.pluginId_ = c4708.m9407();
                        } else if (iM9397 == 18) {
                            this.bitField0_ |= 2;
                            this.data_ = c4708.m9392();
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

    public static ProtoBuf$CompilerPluginData getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.pluginId_ = 0;
        this.data_ = AbstractC4709.f13770;
    }

    public static C6949 newBuilder() {
        C6949 c6949 = new C6949();
        c6949.f18555 = AbstractC4709.f13770;
        return c6949;
    }

    public AbstractC4709 getData() {
        return this.data_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public int getPluginId() {
        return this.pluginId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.pluginId_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            AbstractC4709 abstractC4709 = this.data_;
            iM9372 += abstractC4709.size() + C4707.m9369(abstractC4709.size()) + C4707.m9374(2);
        }
        int size = this.unknownFields.size() + iM9372;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasPluginId() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            AbstractC4709 abstractC4709 = this.data_;
            c4707.m9379(2, 2);
            c4707.m9376(abstractC4709.size());
            c4707.m9385(abstractC4709);
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$CompilerPluginData getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6949 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6949 toBuilder() {
        return newBuilder(this);
    }

    public static C6949 newBuilder(ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData) {
        C6949 c6949NewBuilder = newBuilder();
        c6949NewBuilder.m12216(protoBuf$CompilerPluginData);
        return c6949NewBuilder;
    }

    private ProtoBuf$CompilerPluginData(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$CompilerPluginData(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

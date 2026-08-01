package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4713;
import kotlin.reflect.jvm.internal.impl.protobuf.C4715;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4697;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6953;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$StringTable extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(17);
    private static final ProtoBuf$StringTable defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private InterfaceC4717 string_;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(true);
        defaultInstance = protoBuf$StringTable;
        protoBuf$StringTable.initFields();
    }

    private ProtoBuf$StringTable(C4708 c4708, C4725 c4725) {
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
                            C4715 c4715M9392 = c4708.m9392();
                            if (!z2) {
                                this.string_ = new C4713();
                                z2 = true;
                            }
                            this.string_.mo9349(c4715M9392);
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.string_ = this.string_.mo9347();
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
            this.string_ = this.string_.mo9347();
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

    public static ProtoBuf$StringTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.string_ = C4713.f13777;
    }

    public static C6953 newBuilder() {
        C6953 c6953 = new C6953();
        c6953.f18594 = C4713.f13777;
        return c6953;
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
        int size = 0;
        for (int i2 = 0; i2 < this.string_.size(); i2++) {
            AbstractC4709 abstractC4709Mo9346 = this.string_.mo9346(i2);
            size += abstractC4709Mo9346.size() + C4707.m9369(abstractC4709Mo9346.size());
        }
        int size2 = this.unknownFields.size() + getStringList().size() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public String getString(int i) {
        return (String) this.string_.get(i);
    }

    public InterfaceC4697 getStringList() {
        return this.string_;
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.string_.size(); i++) {
            AbstractC4709 abstractC4709Mo9346 = this.string_.mo9346(i);
            c4707.m9379(1, 2);
            c4707.m9376(abstractC4709Mo9346.size());
            c4707.m9385(abstractC4709Mo9346);
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$StringTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6953 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6953 toBuilder() {
        return newBuilder(this);
    }

    public static C6953 newBuilder(ProtoBuf$StringTable protoBuf$StringTable) {
        C6953 c6953NewBuilder = newBuilder();
        c6953NewBuilder.m12224(protoBuf$StringTable);
        return c6953NewBuilder;
    }

    private ProtoBuf$StringTable(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$StringTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

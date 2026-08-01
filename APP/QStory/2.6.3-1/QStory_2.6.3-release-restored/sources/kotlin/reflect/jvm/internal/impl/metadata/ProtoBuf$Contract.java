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
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7777;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Contract extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(8);
    private static final ProtoBuf$Contract defaultInstance;
    private List<ProtoBuf$Effect> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(true);
        defaultInstance = protoBuf$Contract;
        protoBuf$Contract.initFields();
    }

    private ProtoBuf$Contract(C5541 c5541, C5558 c5558) {
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
                                this.effect_ = new ArrayList();
                                z2 = true;
                            }
                            this.effect_.add((ProtoBuf$Effect) c5541.m9939(ProtoBuf$Effect.PARSER, c5558));
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
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

    public static ProtoBuf$Contract getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.effect_ = Collections.EMPTY_LIST;
    }

    public static C7777 newBuilder() {
        C7777 c7777 = new C7777();
        c7777.f18888 = Collections.EMPTY_LIST;
        return c7777;
    }

    public ProtoBuf$Effect getEffect(int i) {
        return this.effect_.get(i);
    }

    public int getEffectCount() {
        return this.effect_.size();
    }

    public List<ProtoBuf$Effect> getEffectList() {
        return this.effect_;
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
        int iM9919 = 0;
        for (int i2 = 0; i2 < this.effect_.size(); i2++) {
            iM9919 += C5540.m9919(1, this.effect_.get(i2));
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
        for (int i = 0; i < getEffectCount(); i++) {
            if (!getEffect(i).isInitialized()) {
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
        for (int i = 0; i < this.effect_.size(); i++) {
            c5540.m9929(1, this.effect_.get(i));
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Contract getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7777 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7777 toBuilder() {
        return newBuilder(this);
    }

    public static C7777 newBuilder(ProtoBuf$Contract protoBuf$Contract) {
        C7777 c7777NewBuilder = newBuilder();
        c7777NewBuilder.m12799(protoBuf$Contract);
        return c7777NewBuilder;
    }

    private ProtoBuf$Contract(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$Contract(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

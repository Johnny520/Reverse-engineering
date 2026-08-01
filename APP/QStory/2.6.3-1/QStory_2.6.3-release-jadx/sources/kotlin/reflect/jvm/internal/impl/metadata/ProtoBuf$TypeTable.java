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
import p091.C7785;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(21);
    private static final ProtoBuf$TypeTable defaultInstance;
    private int bitField0_;
    private int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Type> type_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(true);
        defaultInstance = protoBuf$TypeTable;
        protoBuf$TypeTable.initFields();
    }

    private ProtoBuf$TypeTable(C5541 c5541, C5558 c5558) {
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
                                this.type_ = new ArrayList();
                                z2 = true;
                            }
                            this.type_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                        } else if (iM9946 == 16) {
                            this.bitField0_ |= 1;
                            this.firstNullable_ = c5541.m9956();
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
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

    public static ProtoBuf$TypeTable getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.type_ = Collections.EMPTY_LIST;
        this.firstNullable_ = -1;
    }

    public static C7785 newBuilder() {
        C7785 c7785 = new C7785();
        c7785.f18938 = Collections.EMPTY_LIST;
        c7785.f18936 = -1;
        return c7785;
    }

    public int getFirstNullable() {
        return this.firstNullable_;
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
        int iM9921 = 0;
        for (int i2 = 0; i2 < this.type_.size(); i2++) {
            iM9921 += C5540.m9919(1, this.type_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9921 += C5540.m9921(2, this.firstNullable_);
        }
        int size = this.unknownFields.size() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$Type getType(int i) {
        return this.type_.get(i);
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    public List<ProtoBuf$Type> getTypeList() {
        return this.type_;
    }

    public boolean hasFirstNullable() {
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
        for (int i = 0; i < getTypeCount(); i++) {
            if (!getType(i).isInitialized()) {
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
        for (int i = 0; i < this.type_.size(); i++) {
            c5540.m9929(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(2, this.firstNullable_);
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeTable getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7785 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7785 toBuilder() {
        return newBuilder(this);
    }

    public static C7785 newBuilder(ProtoBuf$TypeTable protoBuf$TypeTable) {
        C7785 c7785NewBuilder = newBuilder();
        c7785NewBuilder.m12813(protoBuf$TypeTable);
        return c7785NewBuilder;
    }

    private ProtoBuf$TypeTable(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private ProtoBuf$TypeTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

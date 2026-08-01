package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5552;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7776;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {
    public static InterfaceC5531 PARSER = new C7746(10);
    private static final ProtoBuf$EnumEntry defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(true);
        defaultInstance = protoBuf$EnumEntry;
        protoBuf$EnumEntry.initFields();
    }

    private ProtoBuf$EnumEntry(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9946 = c5541.m9946();
                        if (iM9946 != 0) {
                            if (iM9946 == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = c5541.m9956();
                            } else if (iM9946 == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
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
                if ((c & 2) == 2) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
        }
        if ((c & 2) == 2) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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

    public static ProtoBuf$EnumEntry getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static C7776 newBuilder() {
        C7776 c7776 = new C7776();
        c7776.f18886 = Collections.EMPTY_LIST;
        return c7776;
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9921 += C5540.m9919(2, this.annotation_.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9921;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getAnnotationCount(); i++) {
            if (!getAnnotation(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        C5552 c5552NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.name_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c5540.m9929(2, this.annotation_.get(i));
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$EnumEntry getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7776 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7776 toBuilder() {
        return newBuilder(this);
    }

    public static C7776 newBuilder(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C7776 c7776NewBuilder = newBuilder();
        c7776NewBuilder.m12797(protoBuf$EnumEntry);
        return c7776NewBuilder;
    }

    private ProtoBuf$EnumEntry(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$EnumEntry(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6947;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {
    public static InterfaceC4699 PARSER = new C6917(10);
    private static final ProtoBuf$EnumEntry defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(true);
        defaultInstance = protoBuf$EnumEntry;
        protoBuf$EnumEntry.initFields();
    }

    private ProtoBuf$EnumEntry(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9387 = c4709.m9387();
                        if (iM9387 != 0) {
                            if (iM9387 == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = c4709.m9397();
                            } else if (iM9387 == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                            } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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
        }
        if ((c & 2) == 2) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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

    public static ProtoBuf$EnumEntry getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static C6947 newBuilder() {
        C6947 c6947 = new C6947();
        c6947.f18541 = Collections.EMPTY_LIST;
        return c6947;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9362 += C4708.m9360(2, this.annotation_.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9362;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.name_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c4708.m9370(2, this.annotation_.get(i));
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$EnumEntry getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6947 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6947 toBuilder() {
        return newBuilder(this);
    }

    public static C6947 newBuilder(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C6947 c6947NewBuilder = newBuilder();
        c6947NewBuilder.m12238(protoBuf$EnumEntry);
        return c6947NewBuilder;
    }

    private ProtoBuf$EnumEntry(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$EnumEntry(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6946;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {
    public static InterfaceC4698 PARSER = new C6916(10);
    private static final ProtoBuf$EnumEntry defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(true);
        defaultInstance = protoBuf$EnumEntry;
        protoBuf$EnumEntry.initFields();
    }

    private ProtoBuf$EnumEntry(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        if (iM9397 != 0) {
                            if (iM9397 == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = c4708.m9407();
                            } else if (iM9397 == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725));
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
        }
        if ((c & 2) == 2) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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

    public static ProtoBuf$EnumEntry getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static C6946 newBuilder() {
        C6946 c6946 = new C6946();
        c6946.f18546 = Collections.EMPTY_LIST;
        return c6946;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9372 += C4707.m9370(2, this.annotation_.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9372;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.name_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c4707.m9380(2, this.annotation_.get(i));
        }
        c4719NewExtensionWriter.m9420(200, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$EnumEntry getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6946 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6946 toBuilder() {
        return newBuilder(this);
    }

    public static C6946 newBuilder(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C6946 c6946NewBuilder = newBuilder();
        c6946NewBuilder.m12210(protoBuf$EnumEntry);
        return c6946NewBuilder;
    }

    private ProtoBuf$EnumEntry(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$EnumEntry(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

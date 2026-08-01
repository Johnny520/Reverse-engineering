package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {
    public static InterfaceC4699 PARSER = new C6917(22);
    private static final ProtoBuf$ValueParameter defaultInstance;
    private ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue_;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int typeId_;
    private ProtoBuf$Type type_;
    private final AbstractC4710 unknownFields;
    private int varargElementTypeId_;
    private ProtoBuf$Type varargElementType_;

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(true);
        defaultInstance = protoBuf$ValueParameter;
        protoBuf$ValueParameter.initFields();
    }

    private ProtoBuf$ValueParameter(C4709 c4709, C4726 c4726) {
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
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c4709.m9397();
                        } else if (iM9387 != 16) {
                            if (iM9387 == 26) {
                                C4670 builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                                this.type_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9287(protoBuf$Type);
                                    this.type_ = builder.m9288();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM9387 == 34) {
                                C4670 builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                                this.varargElementType_ = protoBuf$Type2;
                                if (builder2 != null) {
                                    builder2.m9287(protoBuf$Type2);
                                    this.varargElementType_ = builder2.m9288();
                                }
                                this.bitField0_ |= 16;
                            } else if (iM9387 == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = c4709.m9397();
                            } else if (iM9387 == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = c4709.m9397();
                            } else if (iM9387 == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.annotation_ = new ArrayList();
                                    c = '@';
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                            } else if (iM9387 == 66) {
                                C4662 builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) c4709.m9380(ProtoBuf$Annotation.Argument.Value.PARSER, c4726);
                                this.annotationParameterDefaultValue_ = value;
                                if (builder3 != null) {
                                    builder3.m9279(value);
                                    this.annotationParameterDefaultValue_ = builder3.m9280();
                                }
                                this.bitField0_ |= 64;
                            } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = c4709.m9397();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
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
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (((c == true ? 1 : 0) & '@') == 64) {
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

    public static ProtoBuf$ValueParameter getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 0;
        this.name_ = 0;
        this.type_ = ProtoBuf$Type.getDefaultInstance();
        this.typeId_ = 0;
        this.varargElementType_ = ProtoBuf$Type.getDefaultInstance();
        this.varargElementTypeId_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
        this.annotationParameterDefaultValue_ = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
    }

    public static C4669 newBuilder() {
        C4669 c4669 = new C4669();
        c4669.f13643 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13641 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13636 = Collections.EMPTY_LIST;
        c4669.f13635 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        return c4669;
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

    public ProtoBuf$Annotation.Argument.Value getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue_;
    }

    public int getFlags() {
        return this.flags_;
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
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9362 += C4708.m9362(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9360(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9360(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9362(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9362 += C4708.m9362(6, this.varargElementTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9362 += C4708.m9360(7, this.annotation_.get(i2));
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9362 += C4708.m9360(8, this.annotationParameterDefaultValue_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9362;
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$Type getType() {
        return this.type_;
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public ProtoBuf$Type getVarargElementType() {
        return this.varargElementType_;
    }

    public int getVarargElementTypeId() {
        return this.varargElementTypeId_;
    }

    public boolean hasAnnotationParameterDefaultValue() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasVarargElementType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVarargElementTypeId() {
        return (this.bitField0_ & 32) == 32;
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasType() && !getType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getAnnotationCount(); i++) {
            if (!getAnnotation(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
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
            c4708.m9378(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9378(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9370(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9370(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9378(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9378(6, this.varargElementTypeId_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c4708.m9370(7, this.annotation_.get(i));
        }
        if ((this.bitField0_ & 64) == 64) {
            c4708.m9370(8, this.annotationParameterDefaultValue_);
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$ValueParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4669 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4669 toBuilder() {
        return newBuilder(this);
    }

    public static C4669 newBuilder(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        C4669 c4669NewBuilder = newBuilder();
        c4669NewBuilder.m9285(protoBuf$ValueParameter);
        return c4669NewBuilder;
    }

    private ProtoBuf$ValueParameter(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$ValueParameter(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

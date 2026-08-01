package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {
    public static InterfaceC5531 PARSER = new C7746(22);
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
    private final AbstractC5542 unknownFields;
    private int varargElementTypeId_;
    private ProtoBuf$Type varargElementType_;

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(true);
        defaultInstance = protoBuf$ValueParameter;
        protoBuf$ValueParameter.initFields();
    }

    private ProtoBuf$ValueParameter(C5541 c5541, C5558 c5558) {
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
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c5541.m9956();
                        } else if (iM9946 != 16) {
                            if (iM9946 == 26) {
                                C5502 builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                                this.type_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9846(protoBuf$Type);
                                    this.type_ = builder.m9847();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM9946 == 34) {
                                C5502 builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                                this.varargElementType_ = protoBuf$Type2;
                                if (builder2 != null) {
                                    builder2.m9846(protoBuf$Type2);
                                    this.varargElementType_ = builder2.m9847();
                                }
                                this.bitField0_ |= 16;
                            } else if (iM9946 == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = c5541.m9956();
                            } else if (iM9946 == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = c5541.m9956();
                            } else if (iM9946 == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.annotation_ = new ArrayList();
                                    c = '@';
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            } else if (iM9946 == 66) {
                                C5494 builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) c5541.m9939(ProtoBuf$Annotation.Argument.Value.PARSER, c5558);
                                this.annotationParameterDefaultValue_ = value;
                                if (builder3 != null) {
                                    builder3.m9838(value);
                                    this.annotationParameterDefaultValue_ = builder3.m9839();
                                }
                                this.bitField0_ |= 64;
                            } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = c5541.m9956();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
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
            c5540M9924.m9935();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c5543.m9962();
            throw th3;
        }
        this.unknownFields = c5543.m9962();
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

    public static C5501 newBuilder() {
        C5501 c5501 = new C5501();
        c5501.f13988 = ProtoBuf$Type.getDefaultInstance();
        c5501.f13986 = ProtoBuf$Type.getDefaultInstance();
        c5501.f13981 = Collections.EMPTY_LIST;
        c5501.f13980 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        return c5501;
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
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9921 += C5540.m9921(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9919(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9919(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9921(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9921 += C5540.m9921(6, this.varargElementTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9921 += C5540.m9919(7, this.annotation_.get(i2));
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9921 += C5540.m9919(8, this.annotationParameterDefaultValue_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9921;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        C5552 c5552NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9929(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9929(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9937(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9937(6, this.varargElementTypeId_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c5540.m9929(7, this.annotation_.get(i));
        }
        if ((this.bitField0_ & 64) == 64) {
            c5540.m9929(8, this.annotationParameterDefaultValue_);
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$ValueParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5501 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5501 toBuilder() {
        return newBuilder(this);
    }

    public static C5501 newBuilder(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        C5501 c5501NewBuilder = newBuilder();
        c5501NewBuilder.m9844(protoBuf$ValueParameter);
        return c5501NewBuilder;
    }

    private ProtoBuf$ValueParameter(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$ValueParameter(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

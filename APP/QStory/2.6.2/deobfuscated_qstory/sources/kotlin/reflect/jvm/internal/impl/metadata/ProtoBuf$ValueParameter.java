package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
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

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {
    public static InterfaceC4698 PARSER = new C6916(22);
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
    private final AbstractC4709 unknownFields;
    private int varargElementTypeId_;
    private ProtoBuf$Type varargElementType_;

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(true);
        defaultInstance = protoBuf$ValueParameter;
        protoBuf$ValueParameter.initFields();
    }

    private ProtoBuf$ValueParameter(C4708 c4708, C4725 c4725) {
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
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = c4708.m9407();
                        } else if (iM9397 != 16) {
                            if (iM9397 == 26) {
                                C4669 builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725);
                                this.type_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9297(protoBuf$Type);
                                    this.type_ = builder.m9298();
                                }
                                this.bitField0_ |= 4;
                            } else if (iM9397 == 34) {
                                C4669 builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725);
                                this.varargElementType_ = protoBuf$Type2;
                                if (builder2 != null) {
                                    builder2.m9297(protoBuf$Type2);
                                    this.varargElementType_ = builder2.m9298();
                                }
                                this.bitField0_ |= 16;
                            } else if (iM9397 == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = c4708.m9407();
                            } else if (iM9397 == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = c4708.m9407();
                            } else if (iM9397 == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.annotation_ = new ArrayList();
                                    c = '@';
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725));
                            } else if (iM9397 == 66) {
                                C4661 builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) c4708.m9390(ProtoBuf$Annotation.Argument.Value.PARSER, c4725);
                                this.annotationParameterDefaultValue_ = value;
                                if (builder3 != null) {
                                    builder3.m9289(value);
                                    this.annotationParameterDefaultValue_ = builder3.m9290();
                                }
                                this.bitField0_ |= 64;
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = c4708.m9407();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
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
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
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

    public static C4668 newBuilder() {
        C4668 c4668 = new C4668();
        c4668.f13639 = ProtoBuf$Type.getDefaultInstance();
        c4668.f13637 = ProtoBuf$Type.getDefaultInstance();
        c4668.f13632 = Collections.EMPTY_LIST;
        c4668.f13631 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        return c4668;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9372 += C4707.m9372(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9370(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9372 += C4707.m9370(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9372(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9372 += C4707.m9372(6, this.varargElementTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iM9372 += C4707.m9370(7, this.annotation_.get(i2));
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9372 += C4707.m9370(8, this.annotationParameterDefaultValue_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9372;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9380(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9380(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9388(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4707.m9388(6, this.varargElementTypeId_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            c4707.m9380(7, this.annotation_.get(i));
        }
        if ((this.bitField0_ & 64) == 64) {
            c4707.m9380(8, this.annotationParameterDefaultValue_);
        }
        c4719NewExtensionWriter.m9420(200, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$ValueParameter getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4668 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4668 toBuilder() {
        return newBuilder(this);
    }

    public static C4668 newBuilder(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        C4668 c4668NewBuilder = newBuilder();
        c4668NewBuilder.m9295(protoBuf$ValueParameter);
        return c4668NewBuilder;
    }

    private ProtoBuf$ValueParameter(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$ValueParameter(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

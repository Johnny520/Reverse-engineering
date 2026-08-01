package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.p002dx.p005io.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5544;
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
import p091.C7782;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {
    public static InterfaceC5531 PARSER = new C7746(19);
    private static final ProtoBuf$TypeAlias defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private int expandedTypeId_;
    private ProtoBuf$Type expandedType_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private int underlyingTypeId_;
    private ProtoBuf$Type underlyingType_;
    private final AbstractC5542 unknownFields;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(true);
        defaultInstance = protoBuf$TypeAlias;
        protoBuf$TypeAlias.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private ProtoBuf$TypeAlias(C5541 c5541, C5558 c5558) {
        C5502 builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? unknownField = 128;
            if (z) {
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 512) == 512) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                try {
                    c5540M9924.m9935();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c5543.m9962();
                    throw th;
                }
                this.unknownFields = c5543.m9962();
                makeExtensionsImmutable();
                return;
            }
            try {
                try {
                    try {
                        int iM9946 = c5541.m9946();
                        switch (iM9946) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = c5541.m9956();
                                break;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = c5541.m9956();
                                break;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add((ProtoBuf$TypeParameter) c5541.m9939(ProtoBuf$TypeParameter.PARSER, c5558));
                                break;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                                this.underlyingType_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9846(protoBuf$Type);
                                    this.underlyingType_ = builder.m9847();
                                }
                                this.bitField0_ |= 4;
                                break;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = c5541.m9956();
                                break;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                                this.expandedType_ = protoBuf$Type2;
                                if (builder != null) {
                                    builder.m9846(protoBuf$Type2);
                                    this.expandedType_ = builder.m9847();
                                }
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = c5541.m9956();
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                                break;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(c5541.m9956()));
                                break;
                            case Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                                int iM9942 = c5541.m9942(c5541.m9956());
                                if ((i & 256) != 256 && c5541.m9944() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (c5541.m9944() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(c5541.m9956()));
                                }
                                c5541.m9943(iM9942);
                                break;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c5541.m9939(ProtoBuf$CompilerPluginData.PARSER, c5558));
                                break;
                            default:
                                unknownField = parseUnknownField(c5541, c5540M9924, c5558, iM9946);
                                if (unknownField == 0) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 128) == unknownField) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 512) == 512) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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
                throw th2;
            }
        }
    }

    public static ProtoBuf$TypeAlias getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.name_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.underlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.underlyingTypeId_ = 0;
        this.expandedType_ = ProtoBuf$Type.getDefaultInstance();
        this.expandedTypeId_ = 0;
        this.annotation_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
    }

    public static C7782 newBuilder(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        C7782 c7782NewBuilder = newBuilder();
        c7782NewBuilder.m12809(protoBuf$TypeAlias);
        return c7782NewBuilder;
    }

    public static ProtoBuf$TypeAlias parseDelimitedFrom(InputStream inputStream, C5558 c5558) {
        return (ProtoBuf$TypeAlias) ((AbstractC5544) PARSER).m9966(inputStream, c5558);
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

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ProtoBuf$Type getExpandedType() {
        return this.expandedType_;
    }

    public int getExpandedTypeId() {
        return this.expandedTypeId_;
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
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9921 += C5540.m9919(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9919(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9921(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9919(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9921 += C5540.m9921(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9921 += C5540.m9919(8, this.annotation_.get(i3));
        }
        int iM9920 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iM9920 += C5540.m9920(this.versionRequirement_.get(i4).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9921 + iM9920;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size += C5540.m9919(32, this.compilerPluginData_.get(i5));
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$TypeParameter getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ProtoBuf$TypeParameter> getTypeParameterList() {
        return this.typeParameter_;
    }

    public ProtoBuf$Type getUnderlyingType() {
        return this.underlyingType_;
    }

    public int getUnderlyingTypeId() {
        return this.underlyingTypeId_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasExpandedType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasExpandedTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasUnderlyingType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasUnderlyingTypeId() {
        return (this.bitField0_ & 8) == 8;
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
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasExpandedType() && !getExpandedType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
            if (!getCompilerPluginData(i3).isInitialized()) {
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
            c5540.m9937(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c5540.m9929(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9929(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9937(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9929(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9937(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c5540.m9929(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            c5540.m9937(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            c5540.m9929(32, this.compilerPluginData_.get(i4));
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeAlias getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7782 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7782 toBuilder() {
        return newBuilder(this);
    }

    public static C7782 newBuilder() {
        return C7782.m12808();
    }

    private ProtoBuf$TypeAlias(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$TypeAlias(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.dx.io.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
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
import p075.C6953;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {
    public static InterfaceC4699 PARSER = new C6917(19);
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
    private final AbstractC4710 unknownFields;
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
    private ProtoBuf$TypeAlias(C4709 c4709, C4726 c4726) {
        C4670 builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
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
                    c4708M9365.m9376();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c4711.m9403();
                    throw th;
                }
                this.unknownFields = c4711.m9403();
                makeExtensionsImmutable();
                return;
            }
            try {
                try {
                    try {
                        int iM9387 = c4709.m9387();
                        switch (iM9387) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = c4709.m9397();
                                break;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = c4709.m9397();
                                break;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add((ProtoBuf$TypeParameter) c4709.m9380(ProtoBuf$TypeParameter.PARSER, c4726));
                                break;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                                this.underlyingType_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9287(protoBuf$Type);
                                    this.underlyingType_ = builder.m9288();
                                }
                                this.bitField0_ |= 4;
                                break;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = c4709.m9397();
                                break;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c4709.m9380(ProtoBuf$Type.PARSER, c4726);
                                this.expandedType_ = protoBuf$Type2;
                                if (builder != null) {
                                    builder.m9287(protoBuf$Type2);
                                    this.expandedType_ = builder.m9288();
                                }
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = c4709.m9397();
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                                break;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(c4709.m9397()));
                                break;
                            case Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                                int iM9383 = c4709.m9383(c4709.m9397());
                                if ((i & 256) != 256 && c4709.m9385() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (c4709.m9385() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(c4709.m9397()));
                                }
                                c4709.m9384(iM9383);
                                break;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c4709.m9380(ProtoBuf$CompilerPluginData.PARSER, c4726));
                                break;
                            default:
                                unknownField = parseUnknownField(c4709, c4708M9365, c4726, iM9387);
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
                    c4708M9365.m9376();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = c4711.m9403();
                    throw th3;
                }
                this.unknownFields = c4711.m9403();
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

    public static C6953 newBuilder(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        C6953 c6953NewBuilder = newBuilder();
        c6953NewBuilder.m12250(protoBuf$TypeAlias);
        return c6953NewBuilder;
    }

    public static ProtoBuf$TypeAlias parseDelimitedFrom(InputStream inputStream, C4726 c4726) {
        return (ProtoBuf$TypeAlias) ((AbstractC4712) PARSER).m9407(inputStream, c4726);
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
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9362 += C4708.m9360(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9362 += C4708.m9360(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9362 += C4708.m9362(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9362 += C4708.m9360(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9362 += C4708.m9362(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9362 += C4708.m9360(8, this.annotation_.get(i3));
        }
        int iM9361 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iM9361 += C4708.m9361(this.versionRequirement_.get(i4).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9362 + iM9361;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size += C4708.m9360(32, this.compilerPluginData_.get(i5));
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
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c4708.m9370(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9370(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9378(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9370(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4708.m9378(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c4708.m9370(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            c4708.m9378(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            c4708.m9370(32, this.compilerPluginData_.get(i4));
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeAlias getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6953 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6953 toBuilder() {
        return newBuilder(this);
    }

    public static C6953 newBuilder() {
        return C6953.m12249();
    }

    private ProtoBuf$TypeAlias(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$TypeAlias(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}

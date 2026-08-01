package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.dx.io.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4711;
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
import p075.C6952;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {
    public static InterfaceC4698 PARSER = new C6916(19);
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
    private final AbstractC4709 unknownFields;
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
    private ProtoBuf$TypeAlias(C4708 c4708, C4725 c4725) {
        C4669 builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
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
                    c4707M9375.m9386();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c4710.m9413();
                    throw th;
                }
                this.unknownFields = c4710.m9413();
                makeExtensionsImmutable();
                return;
            }
            try {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        switch (iM9397) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = c4708.m9407();
                                break;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = c4708.m9407();
                                break;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add((ProtoBuf$TypeParameter) c4708.m9390(ProtoBuf$TypeParameter.PARSER, c4725));
                                break;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725);
                                this.underlyingType_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.m9297(protoBuf$Type);
                                    this.underlyingType_ = builder.m9298();
                                }
                                this.bitField0_ |= 4;
                                break;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = c4708.m9407();
                                break;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c4708.m9390(ProtoBuf$Type.PARSER, c4725);
                                this.expandedType_ = protoBuf$Type2;
                                if (builder != null) {
                                    builder.m9297(protoBuf$Type2);
                                    this.expandedType_ = builder.m9298();
                                }
                                this.bitField0_ |= 16;
                                break;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = c4708.m9407();
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725));
                                break;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(c4708.m9407()));
                                break;
                            case Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                                int iM9393 = c4708.m9393(c4708.m9407());
                                if ((i & 256) != 256 && c4708.m9395() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (c4708.m9395() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(c4708.m9407()));
                                }
                                c4708.m9394(iM9393);
                                break;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c4708.m9390(ProtoBuf$CompilerPluginData.PARSER, c4725));
                                break;
                            default:
                                unknownField = parseUnknownField(c4708, c4707M9375, c4725, iM9397);
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
                    c4707M9375.m9386();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = c4710.m9413();
                    throw th3;
                }
                this.unknownFields = c4710.m9413();
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

    public static C6952 newBuilder(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        C6952 c6952NewBuilder = newBuilder();
        c6952NewBuilder.m12222(protoBuf$TypeAlias);
        return c6952NewBuilder;
    }

    public static ProtoBuf$TypeAlias parseDelimitedFrom(InputStream inputStream, C4725 c4725) {
        return (ProtoBuf$TypeAlias) ((AbstractC4711) PARSER).m9417(inputStream, c4725);
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
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9372 += C4707.m9370(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9372 += C4707.m9370(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9372 += C4707.m9372(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9372 += C4707.m9370(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9372 += C4707.m9372(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9372 += C4707.m9370(8, this.annotation_.get(i3));
        }
        int iM9371 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iM9371 += C4707.m9371(this.versionRequirement_.get(i4).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9372 + iM9371;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size += C4707.m9370(32, this.compilerPluginData_.get(i5));
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
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c4707.m9380(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9380(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9388(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9380(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c4707.m9388(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c4707.m9380(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            c4707.m9388(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            c4707.m9380(32, this.compilerPluginData_.get(i4));
        }
        c4719NewExtensionWriter.m9420(200, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeAlias getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6952 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6952 toBuilder() {
        return newBuilder(this);
    }

    public static C6952 newBuilder() {
        return C6952.m12221();
    }

    private ProtoBuf$TypeAlias(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$TypeAlias(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}

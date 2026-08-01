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
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7780;
import p091.C7785;
import p091.C7786;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {
    public static InterfaceC5531 PARSER = new C7746(5);
    private static final ProtoBuf$Class defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int companionObjectName_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$Constructor> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private List<ProtoBuf$EnumEntry> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<ProtoBuf$Function> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private ProtoBuf$Type inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<ProtoBuf$Property> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<ProtoBuf$Type> supertype_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC5542 unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;
    private List<Integer> versionRequirement_;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Kind implements InterfaceC5554 {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static InterfaceC5555 internalValueMap = new C5511();
        private final int value;

        Kind(int i, int i2) {
            this.value = i2;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(true);
        defaultInstance = protoBuf$Class;
        protoBuf$Class.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ProtoBuf$Class(C5541 c5541, C5558 c5558) throws Throwable {
        int i;
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543M9958 = AbstractC5542.m9958();
        boolean z = true;
        C5540 c5540M9924 = C5540.m9924(c5543M9958, 1);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i2 & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                }
                if ((i2 & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i2 & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                }
                if ((i2 & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                }
                if ((i2 & 512) == 512) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                }
                if ((i2 & 1024) == 1024) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                }
                if ((i2 & 2048) == 2048) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                }
                if ((i2 & 4096) == 4096) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                }
                if ((i2 & 8192) == 8192) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                }
                if ((i2 & 16384) == 16384) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                }
                if ((i2 & 128) == 128) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i2 & 256) == 256) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i2 & 262144) == 262144) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i2 & 1048576) == 1048576) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i2 & 4194304) == 4194304) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                try {
                    c5540M9924.m9935();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = c5543M9958.m9962();
                    throw th;
                }
                this.unknownFields = c5543M9958.m9962();
                makeExtensionsImmutable();
                return;
            }
            try {
                int iM9946 = c5541.m9946();
                switch (iM9946) {
                    case 0:
                        z2 = z3;
                        z = z3;
                        break;
                    case 8:
                        this.bitField0_ |= 1;
                        this.flags_ = c5541.m9940();
                        z = z3;
                        break;
                    case 16:
                        if ((i2 & 32) != 32) {
                            this.supertypeId_ = new ArrayList();
                            i2 |= 32;
                        }
                        this.supertypeId_.add(Integer.valueOf(c5541.m9940()));
                        z = z3;
                        break;
                    case 18:
                        int iM9942 = c5541.m9942(c5541.m9956());
                        if ((i2 & 32) != 32 && c5541.m9944() > 0) {
                            this.supertypeId_ = new ArrayList();
                            i2 |= 32;
                        }
                        while (c5541.m9944() > 0) {
                            this.supertypeId_.add(Integer.valueOf(c5541.m9940()));
                        }
                        c5541.m9943(iM9942);
                        z = z3;
                        break;
                    case 24:
                        this.bitField0_ |= 2;
                        this.fqName_ = c5541.m9940();
                        z = z3;
                        break;
                    case 32:
                        this.bitField0_ |= 4;
                        this.companionObjectName_ = c5541.m9940();
                        z = z3;
                        break;
                    case 42:
                        if ((i2 & 8) != 8) {
                            this.typeParameter_ = new ArrayList();
                            i2 |= 8;
                        }
                        this.typeParameter_.add((ProtoBuf$TypeParameter) c5541.m9939(ProtoBuf$TypeParameter.PARSER, c5558));
                        z = z3;
                        break;
                    case 50:
                        if ((i2 & 16) != 16) {
                            this.supertype_ = new ArrayList();
                            i2 |= 16;
                        }
                        this.supertype_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                        z = z3;
                        break;
                    case 56:
                        if ((i2 & 64) != 64) {
                            this.nestedClassName_ = new ArrayList();
                            i2 |= 64;
                        }
                        this.nestedClassName_.add(Integer.valueOf(c5541.m9940()));
                        z = z3;
                        break;
                    case 58:
                        int iM99422 = c5541.m9942(c5541.m9956());
                        if ((i2 & 64) != 64 && c5541.m9944() > 0) {
                            this.nestedClassName_ = new ArrayList();
                            i2 |= 64;
                        }
                        while (c5541.m9944() > 0) {
                            this.nestedClassName_.add(Integer.valueOf(c5541.m9940()));
                        }
                        c5541.m9943(iM99422);
                        z = z3;
                        break;
                    case 66:
                        if ((i2 & 512) != 512) {
                            this.constructor_ = new ArrayList();
                            i2 |= 512;
                        }
                        this.constructor_.add((ProtoBuf$Constructor) c5541.m9939(ProtoBuf$Constructor.PARSER, c5558));
                        z = z3;
                        break;
                    case 74:
                        if ((i2 & 1024) != 1024) {
                            this.function_ = new ArrayList();
                            i2 |= 1024;
                        }
                        this.function_.add((ProtoBuf$Function) c5541.m9939(ProtoBuf$Function.PARSER, c5558));
                        z = z3;
                        break;
                    case 82:
                        if ((i2 & 2048) != 2048) {
                            this.property_ = new ArrayList();
                            i2 |= 2048;
                        }
                        this.property_.add((ProtoBuf$Property) c5541.m9939(ProtoBuf$Property.PARSER, c5558));
                        z = z3;
                        break;
                    case 90:
                        if ((i2 & 4096) != 4096) {
                            this.typeAlias_ = new ArrayList();
                            i2 |= 4096;
                        }
                        this.typeAlias_.add((ProtoBuf$TypeAlias) c5541.m9939(ProtoBuf$TypeAlias.PARSER, c5558));
                        z = z3;
                        break;
                    case 106:
                        if ((i2 & 8192) != 8192) {
                            this.enumEntry_ = new ArrayList();
                            i2 |= 8192;
                        }
                        this.enumEntry_.add((ProtoBuf$EnumEntry) c5541.m9939(ProtoBuf$EnumEntry.PARSER, c5558));
                        z = z3;
                        break;
                    case 128:
                        if ((i2 & 16384) != 16384) {
                            this.sealedSubclassFqName_ = new ArrayList();
                            i2 |= 16384;
                        }
                        this.sealedSubclassFqName_.add(Integer.valueOf(c5541.m9940()));
                        z = z3;
                        break;
                    case 130:
                        int iM99423 = c5541.m9942(c5541.m9956());
                        if ((i2 & 16384) != 16384 && c5541.m9944() > 0) {
                            this.sealedSubclassFqName_ = new ArrayList();
                            i2 |= 16384;
                        }
                        while (c5541.m9944() > 0) {
                            this.sealedSubclassFqName_.add(Integer.valueOf(c5541.m9940()));
                        }
                        c5541.m9943(iM99423);
                        z = z3;
                        break;
                    case 136:
                        this.bitField0_ |= 8;
                        this.inlineClassUnderlyingPropertyName_ = c5541.m9940();
                        z = z3;
                        break;
                    case 146:
                        C5502 builder = (this.bitField0_ & 16) == 16 ? this.inlineClassUnderlyingType_.toBuilder() : null;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                        this.inlineClassUnderlyingType_ = protoBuf$Type;
                        if (builder != 0) {
                            builder.m9846(protoBuf$Type);
                            this.inlineClassUnderlyingType_ = builder.m9847();
                        }
                        this.bitField0_ |= 16;
                        z = z3;
                        break;
                    case 152:
                        this.bitField0_ |= 32;
                        this.inlineClassUnderlyingTypeId_ = c5541.m9940();
                        z = z3;
                        break;
                    case 162:
                        if ((i2 & 128) != 128) {
                            this.contextReceiverType_ = new ArrayList();
                            i2 |= 128;
                        }
                        this.contextReceiverType_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                        z = z3;
                        break;
                    case 168:
                        if ((i2 & 256) != 256) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i2 |= 256;
                        }
                        this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9940()));
                        z = z3;
                        break;
                    case 170:
                        int iM99424 = c5541.m9942(c5541.m9956());
                        if ((i2 & 256) != 256 && c5541.m9944() > 0) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i2 |= 256;
                        }
                        while (c5541.m9944() > 0) {
                            this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9940()));
                        }
                        c5541.m9943(iM99424);
                        z = z3;
                        break;
                    case Opcodes.REM_FLOAT_2ADDR /* 202 */:
                        if ((i2 & 262144) != 262144) {
                            this.annotation_ = new ArrayList();
                            i2 |= 262144;
                        }
                        this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                        z = z3;
                        break;
                    case 242:
                        C7785 builder2 = (this.bitField0_ & 64) == 64 ? this.typeTable_.toBuilder() : null;
                        ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c5541.m9939(ProtoBuf$TypeTable.PARSER, c5558);
                        this.typeTable_ = protoBuf$TypeTable;
                        if (builder2 != 0) {
                            builder2.m12813(protoBuf$TypeTable);
                            this.typeTable_ = builder2.m12814();
                        }
                        this.bitField0_ |= 64;
                        z = z3;
                        break;
                    case 248:
                        if ((i2 & 1048576) != 1048576) {
                            this.versionRequirement_ = new ArrayList();
                            i2 |= 1048576;
                        }
                        this.versionRequirement_.add(Integer.valueOf(c5541.m9940()));
                        z = z3;
                        break;
                    case Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                        int iM99425 = c5541.m9942(c5541.m9956());
                        if ((i2 & 1048576) != 1048576 && c5541.m9944() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            i2 |= 1048576;
                        }
                        while (c5541.m9944() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(c5541.m9940()));
                        }
                        c5541.m9943(iM99425);
                        z = z3;
                        break;
                    case 258:
                        C7786 builder3 = (this.bitField0_ & 128) == 128 ? this.versionRequirementTable_.toBuilder() : null;
                        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) c5541.m9939(ProtoBuf$VersionRequirementTable.PARSER, c5558);
                        this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                        if (builder3 != 0) {
                            builder3.m12815(protoBuf$VersionRequirementTable);
                            this.versionRequirementTable_ = builder3.m12816();
                        }
                        this.bitField0_ |= 128;
                        z = z3;
                        break;
                    case 266:
                        if ((i2 & 4194304) != 4194304) {
                            this.compilerPluginData_ = new ArrayList();
                            i2 |= 4194304;
                        }
                        i = 4194304;
                        try {
                            try {
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c5541.m9939(ProtoBuf$CompilerPluginData.PARSER, c5558));
                                z = z3;
                            } catch (Throwable th2) {
                                th = th2;
                                if ((i2 & 32) == 32) {
                                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                                }
                                if ((i2 & 8) == 8) {
                                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                }
                                if ((i2 & 16) == 16) {
                                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                                }
                                if ((i2 & 64) == 64) {
                                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                                }
                                if ((i2 & 512) == 512) {
                                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                                }
                                if ((i2 & 1024) == 1024) {
                                    this.function_ = Collections.unmodifiableList(this.function_);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.property_ = Collections.unmodifiableList(this.property_);
                                }
                                if ((i2 & 4096) == 4096) {
                                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                                }
                                if ((i2 & 8192) == 8192) {
                                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                                }
                                if ((i2 & 16384) == 16384) {
                                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                                }
                                if ((i2 & 128) == 128) {
                                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                }
                                if ((i2 & 256) == 256) {
                                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                }
                                if ((i2 & 262144) == 262144) {
                                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                }
                                if ((i2 & 1048576) == 1048576) {
                                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                }
                                if ((i2 & i) == i) {
                                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                }
                                try {
                                    c5540M9924.m9935();
                                    break;
                                } catch (IOException unused2) {
                                } catch (Throwable th3) {
                                    this.unknownFields = c5543M9958.m9962();
                                    throw th3;
                                }
                                this.unknownFields = c5543M9958.m9962();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e = e;
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            e = e2;
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                        break;
                    default:
                        if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                        z = z3;
                        break;
                }
            } catch (InvalidProtocolBufferException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th4) {
                th = th4;
                i = 4194304;
            }
        }
    }

    public static ProtoBuf$Class getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.supertype_ = list;
        this.supertypeId_ = list;
        this.nestedClassName_ = list;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.constructor_ = list;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.enumEntry_ = list;
        this.sealedSubclassFqName_ = list;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.annotation_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        this.compilerPluginData_ = list;
    }

    public static C7780 newBuilder(ProtoBuf$Class protoBuf$Class) {
        C7780 c7780NewBuilder = newBuilder();
        c7780NewBuilder.m12806(protoBuf$Class);
        return c7780NewBuilder;
    }

    public static ProtoBuf$Class parseFrom(InputStream inputStream, C5558 c5558) throws InvalidProtocolBufferException {
        AbstractC5544 abstractC5544 = (AbstractC5544) PARSER;
        abstractC5544.getClass();
        C5541 c5541 = new C5541(inputStream);
        InterfaceC5533 interfaceC5533 = (InterfaceC5533) abstractC5544.mo9831(c5541, c5558);
        try {
            if (c5541.f14110 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC5544.m9965(interfaceC5533);
            return (ProtoBuf$Class) interfaceC5533;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC5533);
        }
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

    public int getCompanionObjectName() {
        return this.companionObjectName_;
    }

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ProtoBuf$Constructor getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public List<ProtoBuf$Constructor> getConstructorList() {
        return this.constructor_;
    }

    public ProtoBuf$Type getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ProtoBuf$Type> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public ProtoBuf$EnumEntry getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public List<ProtoBuf$EnumEntry> getEnumEntryList() {
        return this.enumEntry_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFqName() {
        return this.fqName_;
    }

    public ProtoBuf$Function getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ProtoBuf$Function> getFunctionList() {
        return this.function_;
    }

    public int getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public ProtoBuf$Type getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public int getInlineClassUnderlyingTypeId() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public List<Integer> getNestedClassNameList() {
        return this.nestedClassName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Property getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ProtoBuf$Property> getPropertyList() {
        return this.property_;
    }

    public List<Integer> getSealedSubclassFqNameList() {
        return this.sealedSubclassFqName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.flags_) : 0;
        int iM9920 = 0;
        for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
            iM9920 += C5540.m9920(this.supertypeId_.get(i2).intValue());
        }
        int iM9919 = iM9921 + iM9920;
        if (!getSupertypeIdList().isEmpty()) {
            iM9919 = iM9919 + 1 + C5540.m9920(iM9920);
        }
        this.supertypeIdMemoizedSerializedSize = iM9920;
        if ((this.bitField0_ & 2) == 2) {
            iM9919 += C5540.m9921(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9919 += C5540.m9921(4, this.companionObjectName_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iM9919 += C5540.m9919(5, this.typeParameter_.get(i3));
        }
        for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
            iM9919 += C5540.m9919(6, this.supertype_.get(i4));
        }
        int iM99202 = 0;
        for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
            iM99202 += C5540.m9920(this.nestedClassName_.get(i5).intValue());
        }
        int iM99192 = iM9919 + iM99202;
        if (!getNestedClassNameList().isEmpty()) {
            iM99192 = iM99192 + 1 + C5540.m9920(iM99202);
        }
        this.nestedClassNameMemoizedSerializedSize = iM99202;
        for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
            iM99192 += C5540.m9919(8, this.constructor_.get(i6));
        }
        for (int i7 = 0; i7 < this.function_.size(); i7++) {
            iM99192 += C5540.m9919(9, this.function_.get(i7));
        }
        for (int i8 = 0; i8 < this.property_.size(); i8++) {
            iM99192 += C5540.m9919(10, this.property_.get(i8));
        }
        for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
            iM99192 += C5540.m9919(11, this.typeAlias_.get(i9));
        }
        for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
            iM99192 += C5540.m9919(13, this.enumEntry_.get(i10));
        }
        int iM99203 = 0;
        for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
            iM99203 += C5540.m9920(this.sealedSubclassFqName_.get(i11).intValue());
        }
        int iM99193 = iM99192 + iM99203;
        if (!getSealedSubclassFqNameList().isEmpty()) {
            iM99193 = iM99193 + 2 + C5540.m9920(iM99203);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iM99203;
        if ((this.bitField0_ & 8) == 8) {
            iM99193 += C5540.m9921(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM99193 += C5540.m9919(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iM99193 += C5540.m9921(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
            iM99193 += C5540.m9919(20, this.contextReceiverType_.get(i12));
        }
        int iM99204 = 0;
        for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
            iM99204 += C5540.m9920(this.contextReceiverTypeId_.get(i13).intValue());
        }
        int iM99194 = iM99193 + iM99204;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM99194 = iM99194 + 2 + C5540.m9920(iM99204);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM99204;
        for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
            iM99194 += C5540.m9919(25, this.annotation_.get(i14));
        }
        if ((this.bitField0_ & 64) == 64) {
            iM99194 += C5540.m9919(30, this.typeTable_);
        }
        int iM99205 = 0;
        for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
            iM99205 += C5540.m9920(this.versionRequirement_.get(i15).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM99194 + iM99205;
        if ((this.bitField0_ & 128) == 128) {
            size += C5540.m9919(32, this.versionRequirementTable_);
        }
        for (int i16 = 0; i16 < this.compilerPluginData_.size(); i16++) {
            size += C5540.m9919(33, this.compilerPluginData_.get(i16));
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$Type getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public List<Integer> getSupertypeIdList() {
        return this.supertypeId_;
    }

    public List<ProtoBuf$Type> getSupertypeList() {
        return this.supertype_;
    }

    public ProtoBuf$TypeAlias getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ProtoBuf$TypeAlias> getTypeAliasList() {
        return this.typeAlias_;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasCompanionObjectName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasFqName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasInlineClassUnderlyingPropertyName() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasInlineClassUnderlyingType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasInlineClassUnderlyingTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasVersionRequirementTable() {
        return (this.bitField0_ & 128) == 128;
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
        if (!hasFqName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
            if (!getSupertype(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
            if (!getContextReceiverType(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getConstructorCount(); i4++) {
            if (!getConstructor(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getFunctionCount(); i5++) {
            if (!getFunction(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getPropertyCount(); i6++) {
            if (!getProperty(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
            if (!getTypeAlias(i7).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
            if (!getEnumEntry(i8).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
            if (!getAnnotation(i9).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
            if (!getCompilerPluginData(i10).isInitialized()) {
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
        if (getSupertypeIdList().size() > 0) {
            c5540.m9925(18);
            c5540.m9925(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            c5540.m9930(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9937(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            c5540.m9929(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            c5540.m9929(6, this.supertype_.get(i3));
        }
        if (getNestedClassNameList().size() > 0) {
            c5540.m9925(58);
            c5540.m9925(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            c5540.m9930(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            c5540.m9929(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            c5540.m9929(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            c5540.m9929(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            c5540.m9929(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            c5540.m9929(13, this.enumEntry_.get(i9));
        }
        if (getSealedSubclassFqNameList().size() > 0) {
            c5540.m9925(130);
            c5540.m9925(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            c5540.m9930(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9937(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9929(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9937(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            c5540.m9929(20, this.contextReceiverType_.get(i11));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c5540.m9925(170);
            c5540.m9925(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            c5540.m9930(this.contextReceiverTypeId_.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
            c5540.m9929(25, this.annotation_.get(i13));
        }
        if ((this.bitField0_ & 64) == 64) {
            c5540.m9929(30, this.typeTable_);
        }
        for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
            c5540.m9937(31, this.versionRequirement_.get(i14).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            c5540.m9929(32, this.versionRequirementTable_);
        }
        for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
            c5540.m9929(33, this.compilerPluginData_.get(i15));
        }
        c5552NewExtensionWriter.m9969(19000, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Class getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7780 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7780 toBuilder() {
        return newBuilder(this);
    }

    public static C7780 newBuilder() {
        return C7780.m12805();
    }

    private ProtoBuf$Class(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$Class(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

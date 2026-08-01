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
import net.bytebuddy.jar.asm.Opcodes;
import p087.C7746;
import p091.C7777;
import p091.C7789;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {
    public static InterfaceC5531 PARSER = new C7746(15);
    private static final ProtoBuf$Property defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private List<ProtoBuf$Annotation> backingFieldAnnotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$ValueParameter> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private List<ProtoBuf$Annotation> delegateFieldAnnotation_;
    private List<ProtoBuf$Annotation> extensionReceiverAnnotation_;
    private int flags_;
    private List<ProtoBuf$Annotation> getterAnnotation_;
    private ProtoBuf$Contract getterContract_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private List<ProtoBuf$Annotation> setterAnnotation_;
    private ProtoBuf$Contract setterContract_;
    private int setterFlags_;
    private ProtoBuf$ValueParameter setterValueParameter_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private final AbstractC5542 unknownFields;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(true);
        defaultInstance = protoBuf$Property;
        protoBuf$Property.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ProtoBuf$Property(C5541 c5541, C5558 c5558) throws Throwable {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543M9958 = AbstractC5542.m9958();
        boolean z = true;
        C5540 c5540M9924 = C5540.m9924(c5543M9958, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 131072) == 131072) {
                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                }
                if ((i & 262144) == 262144) {
                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                }
                if ((i & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                }
                if ((i & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                if ((i & Opcodes.ASM8) == 524288) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                }
                if ((i & 1048576) == 1048576) {
                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                }
                if ((i & 2097152) == 2097152) {
                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
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
                try {
                    int iM9946 = c5541.m9946();
                    switch (iM9946) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = c5541.m9940();
                            z = z3;
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = c5541.m9940();
                            z = z3;
                            break;
                        case 26:
                            C5502 builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                            this.returnType_ = protoBuf$Type;
                            if (builder != 0) {
                                builder.m9846(protoBuf$Type);
                                this.returnType_ = builder.m9847();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i |= 32;
                            }
                            this.typeParameter_.add((ProtoBuf$TypeParameter) c5541.m9939(ProtoBuf$TypeParameter.PARSER, c5558));
                            z = z3;
                            break;
                        case 42:
                            C5502 builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558);
                            this.receiverType_ = protoBuf$Type2;
                            if (builder2 != 0) {
                                builder2.m9846(protoBuf$Type2);
                                this.receiverType_ = builder2.m9847();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            C5501 builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) c5541.m9939(ProtoBuf$ValueParameter.PARSER, c5558);
                            this.setterValueParameter_ = protoBuf$ValueParameter;
                            if (builder3 != 0) {
                                builder3.m9844(protoBuf$ValueParameter);
                                this.setterValueParameter_ = builder3.m9845();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = c5541.m9940();
                            z = z3;
                            break;
                        case 64:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = c5541.m9940();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = c5541.m9940();
                            z = z3;
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = c5541.m9940();
                            z = z3;
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = c5541.m9940();
                            z = z3;
                            break;
                        case 98:
                            if ((i & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i |= 256;
                            }
                            this.contextReceiverType_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                            z = z3;
                            break;
                        case 104:
                            if ((i & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9940()));
                            z = z3;
                            break;
                        case 106:
                            int iM9942 = c5541.m9942(c5541.m9956());
                            if ((i & 512) != 512 && c5541.m9944() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i |= 512;
                            }
                            while (c5541.m9944() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9940()));
                            }
                            c5541.m9943(iM9942);
                            z = z3;
                            break;
                        case 114:
                            if ((i & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i |= 65536;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.getterAnnotation_ = new ArrayList();
                                i |= 131072;
                            }
                            this.getterAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.setterAnnotation_ = new ArrayList();
                                i |= 262144;
                            }
                            this.setterAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 138:
                            if ((i & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i |= 1024;
                            }
                            this.contextParameter_.add((ProtoBuf$ValueParameter) c5541.m9939(ProtoBuf$ValueParameter.PARSER, c5558));
                            z = z3;
                            break;
                        case 248:
                            if ((i & 16384) != 16384) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 16384;
                            }
                            this.versionRequirement_.add(Integer.valueOf(c5541.m9940()));
                            z = z3;
                            break;
                        case com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                            int iM99422 = c5541.m9942(c5541.m9956());
                            if ((i & 16384) != 16384 && c5541.m9944() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 16384;
                            }
                            while (c5541.m9944() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(c5541.m9940()));
                            }
                            c5541.m9943(iM99422);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= 32768;
                            }
                            this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c5541.m9939(ProtoBuf$CompilerPluginData.PARSER, c5558));
                            z = z3;
                            break;
                        case 266:
                            if ((i & Opcodes.ASM8) != 524288) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i |= Opcodes.ASM8;
                            }
                            this.extensionReceiverAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.backingFieldAnnotation_ = new ArrayList();
                                i |= 1048576;
                            }
                            this.backingFieldAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.delegateFieldAnnotation_ = new ArrayList();
                                i |= 2097152;
                            }
                            this.delegateFieldAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                            break;
                        case 322:
                            C7777 builder4 = (this.bitField0_ & 1024) == 1024 ? this.getterContract_.toBuilder() : null;
                            ProtoBuf$Contract protoBuf$Contract = (ProtoBuf$Contract) c5541.m9939(ProtoBuf$Contract.PARSER, c5558);
                            this.getterContract_ = protoBuf$Contract;
                            if (builder4 != 0) {
                                builder4.m12799(protoBuf$Contract);
                                this.getterContract_ = builder4.m12800();
                            }
                            this.bitField0_ |= 1024;
                            z = z3;
                            break;
                        case 330:
                            try {
                                C7777 builder5 = (this.bitField0_ & 2048) == 2048 ? this.setterContract_.toBuilder() : null;
                                ProtoBuf$Contract protoBuf$Contract2 = (ProtoBuf$Contract) c5541.m9939(ProtoBuf$Contract.PARSER, c5558);
                                this.setterContract_ = protoBuf$Contract2;
                                if (builder5 != 0) {
                                    builder5.m12799(protoBuf$Contract2);
                                    this.setterContract_ = builder5.m12800();
                                }
                                this.bitField0_ |= 2048;
                                z = z3;
                            } catch (InvalidProtocolBufferException e) {
                                e = e;
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                            } catch (Throwable th2) {
                                th = th2;
                                if ((i & 32) == 32) {
                                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                }
                                if ((i & 256) == 256) {
                                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                }
                                if ((i & 512) == 512) {
                                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                }
                                if ((i & 65536) == 65536) {
                                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                }
                                if ((i & 131072) == 131072) {
                                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                }
                                if ((i & 262144) == 262144) {
                                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                }
                                if ((i & 1024) == 1024) {
                                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                }
                                if ((i & 16384) == 16384) {
                                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                }
                                if ((i & 32768) == 32768) {
                                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                }
                                if ((i & Opcodes.ASM8) == 524288) {
                                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                }
                                if ((i & 1048576) == 1048576) {
                                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                }
                                if ((i & 2097152) == 2097152) {
                                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
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
                            break;
                        default:
                            if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                            }
                            z = z3;
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (InvalidProtocolBufferException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        }
    }

    public static ProtoBuf$Property getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.contextParameter_ = list;
        this.setterValueParameter_ = ProtoBuf$ValueParameter.getDefaultInstance();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.getterAnnotation_ = list;
        this.setterAnnotation_ = list;
        this.extensionReceiverAnnotation_ = list;
        this.backingFieldAnnotation_ = list;
        this.delegateFieldAnnotation_ = list;
        this.getterContract_ = ProtoBuf$Contract.getDefaultInstance();
        this.setterContract_ = ProtoBuf$Contract.getDefaultInstance();
    }

    public static C7789 newBuilder(ProtoBuf$Property protoBuf$Property) {
        C7789 c7789NewBuilder = newBuilder();
        c7789NewBuilder.m12827(protoBuf$Property);
        return c7789NewBuilder;
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

    public ProtoBuf$Annotation getBackingFieldAnnotation(int i) {
        return this.backingFieldAnnotation_.get(i);
    }

    public int getBackingFieldAnnotationCount() {
        return this.backingFieldAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getBackingFieldAnnotationList() {
        return this.backingFieldAnnotation_;
    }

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ProtoBuf$ValueParameter getContextParameter(int i) {
        return this.contextParameter_.get(i);
    }

    public int getContextParameterCount() {
        return this.contextParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getContextParameterList() {
        return this.contextParameter_;
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

    public ProtoBuf$Annotation getDelegateFieldAnnotation(int i) {
        return this.delegateFieldAnnotation_.get(i);
    }

    public int getDelegateFieldAnnotationCount() {
        return this.delegateFieldAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getDelegateFieldAnnotationList() {
        return this.delegateFieldAnnotation_;
    }

    public ProtoBuf$Annotation getExtensionReceiverAnnotation(int i) {
        return this.extensionReceiverAnnotation_.get(i);
    }

    public int getExtensionReceiverAnnotationCount() {
        return this.extensionReceiverAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getExtensionReceiverAnnotationList() {
        return this.extensionReceiverAnnotation_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ProtoBuf$Annotation getGetterAnnotation(int i) {
        return this.getterAnnotation_.get(i);
    }

    public int getGetterAnnotationCount() {
        return this.getterAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getGetterAnnotationList() {
        return this.getterAnnotation_;
    }

    public ProtoBuf$Contract getGetterContract() {
        return this.getterContract_;
    }

    public int getGetterFlags() {
        return this.getterFlags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Type getReceiverType() {
        return this.receiverType_;
    }

    public int getReceiverTypeId() {
        return this.receiverTypeId_;
    }

    public ProtoBuf$Type getReturnType() {
        return this.returnType_;
    }

    public int getReturnTypeId() {
        return this.returnTypeId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9921 = (this.bitField0_ & 2) == 2 ? C5540.m9921(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iM9921 += C5540.m9921(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9921 += C5540.m9919(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iM9921 += C5540.m9919(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iM9921 += C5540.m9919(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9921 += C5540.m9919(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iM9921 += C5540.m9921(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iM9921 += C5540.m9921(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9921(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9921 += C5540.m9921(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9921 += C5540.m9921(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            iM9921 += C5540.m9919(12, this.contextReceiverType_.get(i3));
        }
        int iM9920 = 0;
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            iM9920 += C5540.m9920(this.contextReceiverTypeId_.get(i4).intValue());
        }
        int iM9919 = iM9921 + iM9920;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM9919 = iM9919 + 1 + C5540.m9920(iM9920);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM9920;
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            iM9919 += C5540.m9919(14, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
            iM9919 += C5540.m9919(15, this.getterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
            iM9919 += C5540.m9919(16, this.setterAnnotation_.get(i7));
        }
        for (int i8 = 0; i8 < this.contextParameter_.size(); i8++) {
            iM9919 += C5540.m9919(17, this.contextParameter_.get(i8));
        }
        int iM99202 = 0;
        for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
            iM99202 += C5540.m9920(this.versionRequirement_.get(i9).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9919 + iM99202;
        for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
            size += C5540.m9919(32, this.compilerPluginData_.get(i10));
        }
        for (int i11 = 0; i11 < this.extensionReceiverAnnotation_.size(); i11++) {
            size += C5540.m9919(33, this.extensionReceiverAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.backingFieldAnnotation_.size(); i12++) {
            size += C5540.m9919(34, this.backingFieldAnnotation_.get(i12));
        }
        for (int i13 = 0; i13 < this.delegateFieldAnnotation_.size(); i13++) {
            size += C5540.m9919(35, this.delegateFieldAnnotation_.get(i13));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            size += C5540.m9919(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            size += C5540.m9919(41, this.setterContract_);
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$Annotation getSetterAnnotation(int i) {
        return this.setterAnnotation_.get(i);
    }

    public int getSetterAnnotationCount() {
        return this.setterAnnotation_.size();
    }

    public List<ProtoBuf$Annotation> getSetterAnnotationList() {
        return this.setterAnnotation_;
    }

    public ProtoBuf$Contract getSetterContract() {
        return this.setterContract_;
    }

    public int getSetterFlags() {
        return this.setterFlags_;
    }

    public ProtoBuf$ValueParameter getSetterValueParameter() {
        return this.setterValueParameter_;
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

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetterContract() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasGetterFlags() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasOldFlags() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReceiverType() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasReceiverTypeId() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasReturnType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasReturnTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasSetterContract() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasSetterFlags() {
        return (this.bitField0_ & 512) == 512;
    }

    public boolean hasSetterValueParameter() {
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasReturnType() && !getReturnType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasReceiverType() && !getReceiverType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
            if (!getContextReceiverType(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
            if (!getContextParameter(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
            if (!getCompilerPluginData(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
            if (!getAnnotation(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
            if (!getGetterAnnotation(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
            if (!getSetterAnnotation(i7).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
            if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
            if (!getBackingFieldAnnotation(i9).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
            if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasGetterContract() && !getGetterContract().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasSetterContract() && !getSetterContract().isInitialized()) {
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
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9937(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9937(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9929(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            c5540.m9929(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            c5540.m9929(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            c5540.m9929(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            c5540.m9937(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            c5540.m9937(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9937(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c5540.m9937(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            c5540.m9929(12, this.contextReceiverType_.get(i2));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c5540.m9925(106);
            c5540.m9925(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            c5540.m9930(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            c5540.m9929(14, this.annotation_.get(i4));
        }
        for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
            c5540.m9929(15, this.getterAnnotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
            c5540.m9929(16, this.setterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            c5540.m9929(17, this.contextParameter_.get(i7));
        }
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            c5540.m9937(31, this.versionRequirement_.get(i8).intValue());
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            c5540.m9929(32, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            c5540.m9929(33, this.extensionReceiverAnnotation_.get(i10));
        }
        for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
            c5540.m9929(34, this.backingFieldAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
            c5540.m9929(35, this.delegateFieldAnnotation_.get(i12));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            c5540.m9929(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            c5540.m9929(41, this.setterContract_);
        }
        c5552NewExtensionWriter.m9969(19000, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Property getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7789 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7789 toBuilder() {
        return newBuilder(this);
    }

    public static C7789 newBuilder() {
        return C7789.m12826();
    }

    private ProtoBuf$Property(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$Property(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

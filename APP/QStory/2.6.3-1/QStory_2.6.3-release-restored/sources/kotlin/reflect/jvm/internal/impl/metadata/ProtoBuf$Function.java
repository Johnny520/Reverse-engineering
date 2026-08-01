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
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7788;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {
    public static InterfaceC5531 PARSER = new C7746(12);
    private static final ProtoBuf$Function defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private List<ProtoBuf$ValueParameter> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private ProtoBuf$Contract contract_;
    private List<ProtoBuf$Annotation> extensionReceiverAnnotation_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC5542 unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(true);
        defaultInstance = protoBuf$Function;
        protoBuf$Function.initFields();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0395  */
    /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r11v52, types: [飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v33, types: [飘花落叶言世楪哲苏子兰.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ProtoBuf$Function(C5541 c5541, C5558 c5558) throws Throwable {
        int i;
        int i2;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        boolean z = true;
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            int i4 = 32768;
            boolean z3 = z;
            ?? unknownField = 256;
             = 256;
            ?? r4 = 256;
            if (z2) {
                if ((i3 & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i3 & 2048) == 2048) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i3 & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i3 & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i3 & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i3 & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                }
                if ((i3 & 8192) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i3 & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                if ((i3 & 131072) == 131072) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
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
                int iM9946 = c5541.m9946();
                switch (iM9946) {
                    case 0:
                        z2 = z3;
                        z = z3;
                        break;
                    case 8:
                        this.bitField0_ |= 2;
                        this.oldFlags_ = c5541.m9956();
                        z = z3;
                        break;
                    case 16:
                        this.bitField0_ |= 4;
                        this.name_ = c5541.m9956();
                        z = z3;
                        break;
                    case 26:
                        ?? builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
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
                        if ((i3 & 32) != 32) {
                            this.typeParameter_ = new ArrayList();
                            i3 |= 32;
                        }
                        this.typeParameter_.add((ProtoBuf$TypeParameter) c5541.m9939(ProtoBuf$TypeParameter.PARSER, c5558));
                        z = z3;
                        break;
                    case 42:
                        ?? builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
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
                        if ((i3 & 2048) != 2048) {
                            this.valueParameter_ = new ArrayList();
                            i3 |= 2048;
                        }
                        this.valueParameter_.add((ProtoBuf$ValueParameter) c5541.m9939(ProtoBuf$ValueParameter.PARSER, c5558));
                        z = z3;
                        break;
                    case 56:
                        this.bitField0_ |= 16;
                        this.returnTypeId_ = c5541.m9956();
                        z = z3;
                        break;
                    case 64:
                        this.bitField0_ |= 64;
                        this.receiverTypeId_ = c5541.m9956();
                        z = z3;
                        break;
                    case 72:
                        this.bitField0_ |= 1;
                        this.flags_ = c5541.m9956();
                        z = z3;
                        break;
                    case 82:
                        if ((i3 & 256) != 256) {
                            this.contextReceiverType_ = new ArrayList();
                            i3 |= 256;
                        }
                        this.contextReceiverType_.add((ProtoBuf$Type) c5541.m9939(ProtoBuf$Type.PARSER, c5558));
                        z = z3;
                        break;
                    case 88:
                        if ((i3 & 512) != 512) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i3 |= 512;
                        }
                        this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9956()));
                        z = z3;
                        break;
                    case 90:
                        int iM9942 = c5541.m9942(c5541.m9956());
                        if ((i3 & 512) != 512 && c5541.m9944() > 0) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i3 |= 512;
                        }
                        while (c5541.m9944() > 0) {
                            this.contextReceiverTypeId_.add(Integer.valueOf(c5541.m9956()));
                        }
                        c5541.m9943(iM9942);
                        z = z3;
                        break;
                    case 98:
                        if ((i3 & 65536) != 65536) {
                            this.annotation_ = new ArrayList();
                            i3 |= 65536;
                        }
                        this.annotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                        z = z3;
                        break;
                    case 106:
                        if ((i3 & 1024) != 1024) {
                            this.contextParameter_ = new ArrayList();
                            i3 |= 1024;
                        }
                        this.contextParameter_.add((ProtoBuf$ValueParameter) c5541.m9939(ProtoBuf$ValueParameter.PARSER, c5558));
                        z = z3;
                        break;
                    case 242:
                        ?? builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                        ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c5541.m9939(ProtoBuf$TypeTable.PARSER, c5558);
                        this.typeTable_ = protoBuf$TypeTable;
                        if (builder3 != 0) {
                            builder3.m12813(protoBuf$TypeTable);
                            this.typeTable_ = builder3.m12814();
                        }
                        this.bitField0_ |= 128;
                        z = z3;
                        break;
                    case 248:
                        if ((i3 & 8192) != 8192) {
                            this.versionRequirement_ = new ArrayList();
                            i3 |= 8192;
                        }
                        this.versionRequirement_.add(Integer.valueOf(c5541.m9956()));
                        z = z3;
                        break;
                    case Opcodes.INVOKE_POLYMORPHIC /* 250 */:
                        i2 = 131072;
                        int iM99422 = c5541.m9942(c5541.m9956());
                        if ((i3 & 8192) != 8192 && c5541.m9944() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            i3 |= 8192;
                        }
                        while (c5541.m9944() > 0) {
                            i = i4;
                            try {
                                try {
                                    this.versionRequirement_.add(Integer.valueOf(c5541.m9956()));
                                    i4 = i;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if ((i3 & 32) == 32) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if ((i3 & 2048) == 2048) {
                                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                    }
                                    if ((i3 & 256) == r4) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if ((i3 & 512) == 512) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if ((i3 & 65536) == 65536) {
                                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                    }
                                    if ((i3 & 1024) == 1024) {
                                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                    }
                                    if ((i3 & 8192) == 8192) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if ((i3 & i) == i) {
                                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    if ((i3 & i2) == i2) {
                                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                    }
                                    try {
                                        c5540M9924.m9935();
                                        break;
                                    } catch (IOException unused2) {
                                    } catch (Throwable th3) {
                                        this.unknownFields = c5543.m9962();
                                        throw th3;
                                    }
                                    this.unknownFields = c5543.m9962();
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
                        }
                        c5541.m9943(iM99422);
                        z = z3;
                        break;
                    case 258:
                        ?? builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                        ProtoBuf$Contract protoBuf$Contract = (ProtoBuf$Contract) c5541.m9939(ProtoBuf$Contract.PARSER, c5558);
                        this.contract_ = protoBuf$Contract;
                        if (builder4 != 0) {
                            builder4.m12799(protoBuf$Contract);
                            this.contract_ = builder4.m12800();
                        }
                        this.bitField0_ |= 256;
                        z = z3;
                        break;
                    case 266:
                        if ((i3 & 32768) != 32768) {
                            this.compilerPluginData_ = new ArrayList();
                            i3 |= 32768;
                        }
                        this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c5541.m9939(ProtoBuf$CompilerPluginData.PARSER, c5558));
                        z = z3;
                        break;
                    case 274:
                        if ((i3 & 131072) != 131072) {
                            this.extensionReceiverAnnotation_ = new ArrayList();
                            i3 |= 131072;
                        }
                        try {
                            i2 = 131072;
                        } catch (InvalidProtocolBufferException e3) {
                            e = e3;
                        } catch (IOException e4) {
                            e = e4;
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = 131072;
                        }
                        try {
                            this.extensionReceiverAnnotation_.add((ProtoBuf$Annotation) c5541.m9939(ProtoBuf$Annotation.PARSER, c5558));
                            z = z3;
                        } catch (InvalidProtocolBufferException e5) {
                            e = e5;
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e6) {
                            e = e6;
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        } catch (Throwable th5) {
                            th = th5;
                            i = 32768;
                            if ((i3 & 32) == 32) {
                            }
                            if ((i3 & 2048) == 2048) {
                            }
                            if ((i3 & 256) == r4) {
                            }
                            if ((i3 & 512) == 512) {
                            }
                            if ((i3 & 65536) == 65536) {
                            }
                            if ((i3 & 1024) == 1024) {
                            }
                            if ((i3 & 8192) == 8192) {
                            }
                            if ((i3 & i) == i) {
                            }
                            if ((i3 & i2) == i2) {
                            }
                            c5540M9924.m9935();
                            this.unknownFields = c5543.m9962();
                            makeExtensionsImmutable();
                            throw th;
                        }
                        break;
                    default:
                        unknownField = parseUnknownField(c5541, c5540M9924, c5558, iM9946);
                        if (unknownField == 0) {
                        }
                        z = z3;
                        break;
                }
            } catch (InvalidProtocolBufferException e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th6) {
                th = th6;
                i = 32768;
                i2 = 131072;
                r4 = unknownField;
            }
        }
    }

    public static ProtoBuf$Function getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
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
        this.valueParameter_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.contract_ = ProtoBuf$Contract.getDefaultInstance();
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.extensionReceiverAnnotation_ = list;
    }

    public static C7788 newBuilder(ProtoBuf$Function protoBuf$Function) {
        C7788 c7788NewBuilder = newBuilder();
        c7788NewBuilder.m12824(protoBuf$Function);
        return c7788NewBuilder;
    }

    public static ProtoBuf$Function parseFrom(InputStream inputStream, C5558 c5558) throws InvalidProtocolBufferException {
        AbstractC5544 abstractC5544 = (AbstractC5544) PARSER;
        abstractC5544.getClass();
        C5541 c5541 = new C5541(inputStream);
        InterfaceC5533 interfaceC5533 = (InterfaceC5533) abstractC5544.mo9831(c5541, c5558);
        try {
            if (c5541.f14110 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC5544.m9965(interfaceC5533);
            return (ProtoBuf$Function) interfaceC5533;
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

    public ProtoBuf$Contract getContract() {
        return this.contract_;
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            iM9921 += C5540.m9919(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9921 += C5540.m9921(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iM9921 += C5540.m9921(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9921 += C5540.m9921(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            iM9921 += C5540.m9919(10, this.contextReceiverType_.get(i4));
        }
        int iM9920 = 0;
        for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
            iM9920 += C5540.m9920(this.contextReceiverTypeId_.get(i5).intValue());
        }
        int iM9919 = iM9921 + iM9920;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iM9919 = iM9919 + 1 + C5540.m9920(iM9920);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iM9920;
        for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
            iM9919 += C5540.m9919(12, this.annotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            iM9919 += C5540.m9919(13, this.contextParameter_.get(i7));
        }
        if ((this.bitField0_ & 128) == 128) {
            iM9919 += C5540.m9919(30, this.typeTable_);
        }
        int iM99202 = 0;
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            iM99202 += C5540.m9920(this.versionRequirement_.get(i8).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9919 + iM99202;
        if ((this.bitField0_ & 256) == 256) {
            size += C5540.m9919(32, this.contract_);
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            size += C5540.m9919(33, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            size += C5540.m9919(34, this.extensionReceiverAnnotation_.get(i10));
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public ProtoBuf$ValueParameter getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasContract() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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

    public boolean hasTypeTable() {
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
        for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
            if (!getValueParameter(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasContract() && !getContract().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
            if (!getCompilerPluginData(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
            if (!getAnnotation(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
            if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            c5540.m9929(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9937(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            c5540.m9937(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9937(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            c5540.m9929(10, this.contextReceiverType_.get(i3));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            c5540.m9925(90);
            c5540.m9925(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            c5540.m9930(this.contextReceiverTypeId_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            c5540.m9929(12, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
            c5540.m9929(13, this.contextParameter_.get(i6));
        }
        if ((this.bitField0_ & 128) == 128) {
            c5540.m9929(30, this.typeTable_);
        }
        for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
            c5540.m9937(31, this.versionRequirement_.get(i7).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            c5540.m9929(32, this.contract_);
        }
        for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
            c5540.m9929(33, this.compilerPluginData_.get(i8));
        }
        for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
            c5540.m9929(34, this.extensionReceiverAnnotation_.get(i9));
        }
        c5552NewExtensionWriter.m9969(19000, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Function getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7788 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7788 toBuilder() {
        return newBuilder(this);
    }

    public static C7788 newBuilder() {
        return C7788.m12823();
    }

    private ProtoBuf$Function(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$Function(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}

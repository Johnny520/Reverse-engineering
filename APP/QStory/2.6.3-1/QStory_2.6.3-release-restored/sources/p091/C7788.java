package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C5502;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7788 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f18942;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public List f18943;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18944;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f18946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ProtoBuf$Type f18947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f18948;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public List f18949;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public List f18950;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ProtoBuf$Contract f18951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public List f18952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f18954;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18955;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18959;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f18960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7788 m12823() {
        C7788 c7788 = new C7788();
        c7788.f18955 = 6;
        c7788.f18959 = 6;
        c7788.f18957 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c7788.f18948 = list;
        c7788.f18947 = ProtoBuf$Type.getDefaultInstance();
        c7788.f18945 = list;
        c7788.f18944 = list;
        c7788.f18943 = list;
        c7788.f18954 = list;
        c7788.f18953 = ProtoBuf$TypeTable.getDefaultInstance();
        c7788.f18952 = list;
        c7788.f18951 = ProtoBuf$Contract.getDefaultInstance();
        c7788.f18950 = list;
        c7788.f18949 = list;
        c7788.f18942 = list;
        return c7788;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Function protoBuf$FunctionM12825 = m12825();
        if (protoBuf$FunctionM12825.isInitialized()) {
            return protoBuf$FunctionM12825;
        }
        throw new UninitializedMessageException(protoBuf$FunctionM12825);
    }

    public final Object clone() {
        C7788 c7788M12823 = m12823();
        c7788M12823.m12824(m12825());
        return c7788M12823;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12824(ProtoBuf$Function protoBuf$Function) {
        if (protoBuf$Function == ProtoBuf$Function.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Function.hasFlags()) {
            int flags = protoBuf$Function.getFlags();
            this.f18956 |= 1;
            this.f18955 = flags;
        }
        if (protoBuf$Function.hasOldFlags()) {
            int oldFlags = protoBuf$Function.getOldFlags();
            this.f18956 |= 2;
            this.f18959 = oldFlags;
        }
        if (protoBuf$Function.hasName()) {
            int name = protoBuf$Function.getName();
            this.f18956 |= 4;
            this.f18960 = name;
        }
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            if ((this.f18956 & 8) != 8 || this.f18957 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18957 = returnType;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f18957);
                c5502NewBuilder.m9846(returnType);
                this.f18957 = c5502NewBuilder.m9847();
            }
            this.f18956 |= 8;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            int returnTypeId = protoBuf$Function.getReturnTypeId();
            this.f18956 |= 16;
            this.f18958 = returnTypeId;
        }
        if (!protoBuf$Function.typeParameter_.isEmpty()) {
            if (this.f18948.isEmpty()) {
                this.f18948 = protoBuf$Function.typeParameter_;
                this.f18956 &= -33;
            } else {
                if ((this.f18956 & 32) != 32) {
                    this.f18948 = new ArrayList(this.f18948);
                    this.f18956 |= 32;
                }
                this.f18948.addAll(protoBuf$Function.typeParameter_);
            }
        }
        if (protoBuf$Function.hasReceiverType()) {
            ProtoBuf$Type receiverType = protoBuf$Function.getReceiverType();
            if ((this.f18956 & 64) != 64 || this.f18947 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18947 = receiverType;
            } else {
                C5502 c5502NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18947);
                c5502NewBuilder2.m9846(receiverType);
                this.f18947 = c5502NewBuilder2.m9847();
            }
            this.f18956 |= 64;
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            int receiverTypeId = protoBuf$Function.getReceiverTypeId();
            this.f18956 |= 128;
            this.f18946 = receiverTypeId;
        }
        if (!protoBuf$Function.contextReceiverType_.isEmpty()) {
            if (this.f18945.isEmpty()) {
                this.f18945 = protoBuf$Function.contextReceiverType_;
                this.f18956 &= -257;
            } else {
                if ((this.f18956 & 256) != 256) {
                    this.f18945 = new ArrayList(this.f18945);
                    this.f18956 |= 256;
                }
                this.f18945.addAll(protoBuf$Function.contextReceiverType_);
            }
        }
        if (!protoBuf$Function.contextReceiverTypeId_.isEmpty()) {
            if (this.f18944.isEmpty()) {
                this.f18944 = protoBuf$Function.contextReceiverTypeId_;
                this.f18956 &= -513;
            } else {
                if ((this.f18956 & 512) != 512) {
                    this.f18944 = new ArrayList(this.f18944);
                    this.f18956 |= 512;
                }
                this.f18944.addAll(protoBuf$Function.contextReceiverTypeId_);
            }
        }
        if (!protoBuf$Function.contextParameter_.isEmpty()) {
            if (this.f18943.isEmpty()) {
                this.f18943 = protoBuf$Function.contextParameter_;
                this.f18956 &= -1025;
            } else {
                if ((this.f18956 & 1024) != 1024) {
                    this.f18943 = new ArrayList(this.f18943);
                    this.f18956 |= 1024;
                }
                this.f18943.addAll(protoBuf$Function.contextParameter_);
            }
        }
        if (!protoBuf$Function.valueParameter_.isEmpty()) {
            if (this.f18954.isEmpty()) {
                this.f18954 = protoBuf$Function.valueParameter_;
                this.f18956 &= -2049;
            } else {
                if ((this.f18956 & 2048) != 2048) {
                    this.f18954 = new ArrayList(this.f18954);
                    this.f18956 |= 2048;
                }
                this.f18954.addAll(protoBuf$Function.valueParameter_);
            }
        }
        if (protoBuf$Function.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            if ((this.f18956 & 4096) != 4096 || this.f18953 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18953 = typeTable;
            } else {
                C7785 c7785NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18953);
                c7785NewBuilder.m12813(typeTable);
                this.f18953 = c7785NewBuilder.m12814();
            }
            this.f18956 |= 4096;
        }
        if (!protoBuf$Function.versionRequirement_.isEmpty()) {
            if (this.f18952.isEmpty()) {
                this.f18952 = protoBuf$Function.versionRequirement_;
                this.f18956 &= -8193;
            } else {
                if ((this.f18956 & 8192) != 8192) {
                    this.f18952 = new ArrayList(this.f18952);
                    this.f18956 |= 8192;
                }
                this.f18952.addAll(protoBuf$Function.versionRequirement_);
            }
        }
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            if ((this.f18956 & 16384) != 16384 || this.f18951 == ProtoBuf$Contract.getDefaultInstance()) {
                this.f18951 = contract;
            } else {
                C7777 c7777NewBuilder = ProtoBuf$Contract.newBuilder(this.f18951);
                c7777NewBuilder.m12799(contract);
                this.f18951 = c7777NewBuilder.m12800();
            }
            this.f18956 |= 16384;
        }
        if (!protoBuf$Function.compilerPluginData_.isEmpty()) {
            if (this.f18950.isEmpty()) {
                this.f18950 = protoBuf$Function.compilerPluginData_;
                this.f18956 &= -32769;
            } else {
                if ((this.f18956 & 32768) != 32768) {
                    this.f18950 = new ArrayList(this.f18950);
                    this.f18956 |= 32768;
                }
                this.f18950.addAll(protoBuf$Function.compilerPluginData_);
            }
        }
        if (!protoBuf$Function.annotation_.isEmpty()) {
            if (this.f18949.isEmpty()) {
                this.f18949 = protoBuf$Function.annotation_;
                this.f18956 &= -65537;
            } else {
                if ((this.f18956 & 65536) != 65536) {
                    this.f18949 = new ArrayList(this.f18949);
                    this.f18956 |= 65536;
                }
                this.f18949.addAll(protoBuf$Function.annotation_);
            }
        }
        if (!protoBuf$Function.extensionReceiverAnnotation_.isEmpty()) {
            if (this.f18942.isEmpty()) {
                this.f18942 = protoBuf$Function.extensionReceiverAnnotation_;
                this.f18956 &= -131073;
            } else {
                if ((this.f18956 & 131072) != 131072) {
                    this.f18942 = new ArrayList(this.f18942);
                    this.f18956 |= 131072;
                }
                this.f18942.addAll(protoBuf$Function.extensionReceiverAnnotation_);
            }
        }
        m9970(protoBuf$Function);
        this.f14153 = this.f14153.m9960(protoBuf$Function.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Function m12825() {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
        int i = this.f18956;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Function.flags_ = this.f18955;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Function.oldFlags_ = this.f18959;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Function.name_ = this.f18960;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Function.returnType_ = this.f18957;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Function.returnTypeId_ = this.f18958;
        if ((this.f18956 & 32) == 32) {
            this.f18948 = Collections.unmodifiableList(this.f18948);
            this.f18956 &= -33;
        }
        protoBuf$Function.typeParameter_ = this.f18948;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Function.receiverType_ = this.f18947;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Function.receiverTypeId_ = this.f18946;
        if ((this.f18956 & 256) == 256) {
            this.f18945 = Collections.unmodifiableList(this.f18945);
            this.f18956 &= -257;
        }
        protoBuf$Function.contextReceiverType_ = this.f18945;
        if ((this.f18956 & 512) == 512) {
            this.f18944 = Collections.unmodifiableList(this.f18944);
            this.f18956 &= -513;
        }
        protoBuf$Function.contextReceiverTypeId_ = this.f18944;
        if ((this.f18956 & 1024) == 1024) {
            this.f18943 = Collections.unmodifiableList(this.f18943);
            this.f18956 &= -1025;
        }
        protoBuf$Function.contextParameter_ = this.f18943;
        if ((this.f18956 & 2048) == 2048) {
            this.f18954 = Collections.unmodifiableList(this.f18954);
            this.f18956 &= -2049;
        }
        protoBuf$Function.valueParameter_ = this.f18954;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        protoBuf$Function.typeTable_ = this.f18953;
        if ((this.f18956 & 8192) == 8192) {
            this.f18952 = Collections.unmodifiableList(this.f18952);
            this.f18956 &= -8193;
        }
        protoBuf$Function.versionRequirement_ = this.f18952;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        protoBuf$Function.contract_ = this.f18951;
        if ((this.f18956 & 32768) == 32768) {
            this.f18950 = Collections.unmodifiableList(this.f18950);
            this.f18956 &= -32769;
        }
        protoBuf$Function.compilerPluginData_ = this.f18950;
        if ((this.f18956 & 65536) == 65536) {
            this.f18949 = Collections.unmodifiableList(this.f18949);
            this.f18956 &= -65537;
        }
        protoBuf$Function.annotation_ = this.f18949;
        if ((this.f18956 & 131072) == 131072) {
            this.f18942 = Collections.unmodifiableList(this.f18942);
            this.f18956 &= -131073;
        }
        protoBuf$Function.extensionReceiverAnnotation_ = this.f18942;
        protoBuf$Function.bitField0_ = i2;
        return protoBuf$Function;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12824((ProtoBuf$Function) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Function protoBuf$Function = null;
        try {
            try {
                m12824((ProtoBuf$Function) ProtoBuf$Function.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Function protoBuf$Function2 = (ProtoBuf$Function) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Function = protoBuf$Function2;
                    if (protoBuf$Function != null) {
                        m12824(protoBuf$Function);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Function != null) {
            }
            throw th;
        }
    }
}

package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4669;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6958 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f18602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public List f18603;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18604;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18605;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f18606;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ProtoBuf$Type f18607;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f18608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public List f18609;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public List f18610;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ProtoBuf$Contract f18611;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public List f18612;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18613;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f18614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18615;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18616;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18617;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18618;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f18620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6958 m12239() {
        C6958 c6958 = new C6958();
        c6958.f18615 = 6;
        c6958.f18619 = 6;
        c6958.f18617 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c6958.f18608 = list;
        c6958.f18607 = ProtoBuf$Type.getDefaultInstance();
        c6958.f18605 = list;
        c6958.f18604 = list;
        c6958.f18603 = list;
        c6958.f18614 = list;
        c6958.f18613 = ProtoBuf$TypeTable.getDefaultInstance();
        c6958.f18612 = list;
        c6958.f18611 = ProtoBuf$Contract.getDefaultInstance();
        c6958.f18610 = list;
        c6958.f18609 = list;
        c6958.f18602 = list;
        return c6958;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Function protoBuf$FunctionM12241 = m12241();
        if (protoBuf$FunctionM12241.isInitialized()) {
            return protoBuf$FunctionM12241;
        }
        throw new UninitializedMessageException(protoBuf$FunctionM12241);
    }

    public final Object clone() {
        C6958 c6958M12239 = m12239();
        c6958M12239.m12240(m12241());
        return c6958M12239;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12240(ProtoBuf$Function protoBuf$Function) {
        if (protoBuf$Function == ProtoBuf$Function.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Function.hasFlags()) {
            int flags = protoBuf$Function.getFlags();
            this.f18616 |= 1;
            this.f18615 = flags;
        }
        if (protoBuf$Function.hasOldFlags()) {
            int oldFlags = protoBuf$Function.getOldFlags();
            this.f18616 |= 2;
            this.f18619 = oldFlags;
        }
        if (protoBuf$Function.hasName()) {
            int name = protoBuf$Function.getName();
            this.f18616 |= 4;
            this.f18620 = name;
        }
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            if ((this.f18616 & 8) != 8 || this.f18617 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18617 = returnType;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f18617);
                c4669NewBuilder.m9297(returnType);
                this.f18617 = c4669NewBuilder.m9298();
            }
            this.f18616 |= 8;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            int returnTypeId = protoBuf$Function.getReturnTypeId();
            this.f18616 |= 16;
            this.f18618 = returnTypeId;
        }
        if (!protoBuf$Function.typeParameter_.isEmpty()) {
            if (this.f18608.isEmpty()) {
                this.f18608 = protoBuf$Function.typeParameter_;
                this.f18616 &= -33;
            } else {
                if ((this.f18616 & 32) != 32) {
                    this.f18608 = new ArrayList(this.f18608);
                    this.f18616 |= 32;
                }
                this.f18608.addAll(protoBuf$Function.typeParameter_);
            }
        }
        if (protoBuf$Function.hasReceiverType()) {
            ProtoBuf$Type receiverType = protoBuf$Function.getReceiverType();
            if ((this.f18616 & 64) != 64 || this.f18607 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18607 = receiverType;
            } else {
                C4669 c4669NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18607);
                c4669NewBuilder2.m9297(receiverType);
                this.f18607 = c4669NewBuilder2.m9298();
            }
            this.f18616 |= 64;
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            int receiverTypeId = protoBuf$Function.getReceiverTypeId();
            this.f18616 |= 128;
            this.f18606 = receiverTypeId;
        }
        if (!protoBuf$Function.contextReceiverType_.isEmpty()) {
            if (this.f18605.isEmpty()) {
                this.f18605 = protoBuf$Function.contextReceiverType_;
                this.f18616 &= -257;
            } else {
                if ((this.f18616 & 256) != 256) {
                    this.f18605 = new ArrayList(this.f18605);
                    this.f18616 |= 256;
                }
                this.f18605.addAll(protoBuf$Function.contextReceiverType_);
            }
        }
        if (!protoBuf$Function.contextReceiverTypeId_.isEmpty()) {
            if (this.f18604.isEmpty()) {
                this.f18604 = protoBuf$Function.contextReceiverTypeId_;
                this.f18616 &= -513;
            } else {
                if ((this.f18616 & 512) != 512) {
                    this.f18604 = new ArrayList(this.f18604);
                    this.f18616 |= 512;
                }
                this.f18604.addAll(protoBuf$Function.contextReceiverTypeId_);
            }
        }
        if (!protoBuf$Function.contextParameter_.isEmpty()) {
            if (this.f18603.isEmpty()) {
                this.f18603 = protoBuf$Function.contextParameter_;
                this.f18616 &= -1025;
            } else {
                if ((this.f18616 & 1024) != 1024) {
                    this.f18603 = new ArrayList(this.f18603);
                    this.f18616 |= 1024;
                }
                this.f18603.addAll(protoBuf$Function.contextParameter_);
            }
        }
        if (!protoBuf$Function.valueParameter_.isEmpty()) {
            if (this.f18614.isEmpty()) {
                this.f18614 = protoBuf$Function.valueParameter_;
                this.f18616 &= -2049;
            } else {
                if ((this.f18616 & 2048) != 2048) {
                    this.f18614 = new ArrayList(this.f18614);
                    this.f18616 |= 2048;
                }
                this.f18614.addAll(protoBuf$Function.valueParameter_);
            }
        }
        if (protoBuf$Function.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            if ((this.f18616 & 4096) != 4096 || this.f18613 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18613 = typeTable;
            } else {
                C6955 c6955NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18613);
                c6955NewBuilder.m12226(typeTable);
                this.f18613 = c6955NewBuilder.m12227();
            }
            this.f18616 |= 4096;
        }
        if (!protoBuf$Function.versionRequirement_.isEmpty()) {
            if (this.f18612.isEmpty()) {
                this.f18612 = protoBuf$Function.versionRequirement_;
                this.f18616 &= -8193;
            } else {
                if ((this.f18616 & 8192) != 8192) {
                    this.f18612 = new ArrayList(this.f18612);
                    this.f18616 |= 8192;
                }
                this.f18612.addAll(protoBuf$Function.versionRequirement_);
            }
        }
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            if ((this.f18616 & 16384) != 16384 || this.f18611 == ProtoBuf$Contract.getDefaultInstance()) {
                this.f18611 = contract;
            } else {
                C6947 c6947NewBuilder = ProtoBuf$Contract.newBuilder(this.f18611);
                c6947NewBuilder.m12212(contract);
                this.f18611 = c6947NewBuilder.m12213();
            }
            this.f18616 |= 16384;
        }
        if (!protoBuf$Function.compilerPluginData_.isEmpty()) {
            if (this.f18610.isEmpty()) {
                this.f18610 = protoBuf$Function.compilerPluginData_;
                this.f18616 &= -32769;
            } else {
                if ((this.f18616 & 32768) != 32768) {
                    this.f18610 = new ArrayList(this.f18610);
                    this.f18616 |= 32768;
                }
                this.f18610.addAll(protoBuf$Function.compilerPluginData_);
            }
        }
        if (!protoBuf$Function.annotation_.isEmpty()) {
            if (this.f18609.isEmpty()) {
                this.f18609 = protoBuf$Function.annotation_;
                this.f18616 &= -65537;
            } else {
                if ((this.f18616 & 65536) != 65536) {
                    this.f18609 = new ArrayList(this.f18609);
                    this.f18616 |= 65536;
                }
                this.f18609.addAll(protoBuf$Function.annotation_);
            }
        }
        if (!protoBuf$Function.extensionReceiverAnnotation_.isEmpty()) {
            if (this.f18602.isEmpty()) {
                this.f18602 = protoBuf$Function.extensionReceiverAnnotation_;
                this.f18616 &= -131073;
            } else {
                if ((this.f18616 & 131072) != 131072) {
                    this.f18602 = new ArrayList(this.f18602);
                    this.f18616 |= 131072;
                }
                this.f18602.addAll(protoBuf$Function.extensionReceiverAnnotation_);
            }
        }
        m9421(protoBuf$Function);
        this.f13804 = this.f13804.m9411(protoBuf$Function.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Function m12241() {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
        int i = this.f18616;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Function.flags_ = this.f18615;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Function.oldFlags_ = this.f18619;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Function.name_ = this.f18620;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Function.returnType_ = this.f18617;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Function.returnTypeId_ = this.f18618;
        if ((this.f18616 & 32) == 32) {
            this.f18608 = Collections.unmodifiableList(this.f18608);
            this.f18616 &= -33;
        }
        protoBuf$Function.typeParameter_ = this.f18608;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Function.receiverType_ = this.f18607;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Function.receiverTypeId_ = this.f18606;
        if ((this.f18616 & 256) == 256) {
            this.f18605 = Collections.unmodifiableList(this.f18605);
            this.f18616 &= -257;
        }
        protoBuf$Function.contextReceiverType_ = this.f18605;
        if ((this.f18616 & 512) == 512) {
            this.f18604 = Collections.unmodifiableList(this.f18604);
            this.f18616 &= -513;
        }
        protoBuf$Function.contextReceiverTypeId_ = this.f18604;
        if ((this.f18616 & 1024) == 1024) {
            this.f18603 = Collections.unmodifiableList(this.f18603);
            this.f18616 &= -1025;
        }
        protoBuf$Function.contextParameter_ = this.f18603;
        if ((this.f18616 & 2048) == 2048) {
            this.f18614 = Collections.unmodifiableList(this.f18614);
            this.f18616 &= -2049;
        }
        protoBuf$Function.valueParameter_ = this.f18614;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        protoBuf$Function.typeTable_ = this.f18613;
        if ((this.f18616 & 8192) == 8192) {
            this.f18612 = Collections.unmodifiableList(this.f18612);
            this.f18616 &= -8193;
        }
        protoBuf$Function.versionRequirement_ = this.f18612;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        protoBuf$Function.contract_ = this.f18611;
        if ((this.f18616 & 32768) == 32768) {
            this.f18610 = Collections.unmodifiableList(this.f18610);
            this.f18616 &= -32769;
        }
        protoBuf$Function.compilerPluginData_ = this.f18610;
        if ((this.f18616 & 65536) == 65536) {
            this.f18609 = Collections.unmodifiableList(this.f18609);
            this.f18616 &= -65537;
        }
        protoBuf$Function.annotation_ = this.f18609;
        if ((this.f18616 & 131072) == 131072) {
            this.f18602 = Collections.unmodifiableList(this.f18602);
            this.f18616 &= -131073;
        }
        protoBuf$Function.extensionReceiverAnnotation_ = this.f18602;
        protoBuf$Function.bitField0_ = i2;
        return protoBuf$Function;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12240((ProtoBuf$Function) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716 mo9281(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12240(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12240(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6958.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

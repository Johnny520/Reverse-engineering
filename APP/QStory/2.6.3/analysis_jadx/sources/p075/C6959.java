package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4670;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6959 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f18597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public List f18598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f18601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ProtoBuf$Type f18602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f18603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public List f18604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public List f18605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public ProtoBuf$Contract f18606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public List f18607;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f18609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f18615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6959 m12264() {
        C6959 c6959 = new C6959();
        c6959.f18610 = 6;
        c6959.f18614 = 6;
        c6959.f18612 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c6959.f18603 = list;
        c6959.f18602 = ProtoBuf$Type.getDefaultInstance();
        c6959.f18600 = list;
        c6959.f18599 = list;
        c6959.f18598 = list;
        c6959.f18609 = list;
        c6959.f18608 = ProtoBuf$TypeTable.getDefaultInstance();
        c6959.f18607 = list;
        c6959.f18606 = ProtoBuf$Contract.getDefaultInstance();
        c6959.f18605 = list;
        c6959.f18604 = list;
        c6959.f18597 = list;
        return c6959;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Function protoBuf$FunctionM12266 = m12266();
        if (protoBuf$FunctionM12266.isInitialized()) {
            return protoBuf$FunctionM12266;
        }
        throw new UninitializedMessageException(protoBuf$FunctionM12266);
    }

    public final Object clone() {
        C6959 c6959M12264 = m12264();
        c6959M12264.m12265(m12266());
        return c6959M12264;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12265(ProtoBuf$Function protoBuf$Function) {
        if (protoBuf$Function == ProtoBuf$Function.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Function.hasFlags()) {
            int flags = protoBuf$Function.getFlags();
            this.f18611 |= 1;
            this.f18610 = flags;
        }
        if (protoBuf$Function.hasOldFlags()) {
            int oldFlags = protoBuf$Function.getOldFlags();
            this.f18611 |= 2;
            this.f18614 = oldFlags;
        }
        if (protoBuf$Function.hasName()) {
            int name = protoBuf$Function.getName();
            this.f18611 |= 4;
            this.f18615 = name;
        }
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            if ((this.f18611 & 8) != 8 || this.f18612 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18612 = returnType;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f18612);
                c4670NewBuilder.m9287(returnType);
                this.f18612 = c4670NewBuilder.m9288();
            }
            this.f18611 |= 8;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            int returnTypeId = protoBuf$Function.getReturnTypeId();
            this.f18611 |= 16;
            this.f18613 = returnTypeId;
        }
        if (!protoBuf$Function.typeParameter_.isEmpty()) {
            if (this.f18603.isEmpty()) {
                this.f18603 = protoBuf$Function.typeParameter_;
                this.f18611 &= -33;
            } else {
                if ((this.f18611 & 32) != 32) {
                    this.f18603 = new ArrayList(this.f18603);
                    this.f18611 |= 32;
                }
                this.f18603.addAll(protoBuf$Function.typeParameter_);
            }
        }
        if (protoBuf$Function.hasReceiverType()) {
            ProtoBuf$Type receiverType = protoBuf$Function.getReceiverType();
            if ((this.f18611 & 64) != 64 || this.f18602 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18602 = receiverType;
            } else {
                C4670 c4670NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18602);
                c4670NewBuilder2.m9287(receiverType);
                this.f18602 = c4670NewBuilder2.m9288();
            }
            this.f18611 |= 64;
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            int receiverTypeId = protoBuf$Function.getReceiverTypeId();
            this.f18611 |= 128;
            this.f18601 = receiverTypeId;
        }
        if (!protoBuf$Function.contextReceiverType_.isEmpty()) {
            if (this.f18600.isEmpty()) {
                this.f18600 = protoBuf$Function.contextReceiverType_;
                this.f18611 &= -257;
            } else {
                if ((this.f18611 & 256) != 256) {
                    this.f18600 = new ArrayList(this.f18600);
                    this.f18611 |= 256;
                }
                this.f18600.addAll(protoBuf$Function.contextReceiverType_);
            }
        }
        if (!protoBuf$Function.contextReceiverTypeId_.isEmpty()) {
            if (this.f18599.isEmpty()) {
                this.f18599 = protoBuf$Function.contextReceiverTypeId_;
                this.f18611 &= -513;
            } else {
                if ((this.f18611 & 512) != 512) {
                    this.f18599 = new ArrayList(this.f18599);
                    this.f18611 |= 512;
                }
                this.f18599.addAll(protoBuf$Function.contextReceiverTypeId_);
            }
        }
        if (!protoBuf$Function.contextParameter_.isEmpty()) {
            if (this.f18598.isEmpty()) {
                this.f18598 = protoBuf$Function.contextParameter_;
                this.f18611 &= -1025;
            } else {
                if ((this.f18611 & 1024) != 1024) {
                    this.f18598 = new ArrayList(this.f18598);
                    this.f18611 |= 1024;
                }
                this.f18598.addAll(protoBuf$Function.contextParameter_);
            }
        }
        if (!protoBuf$Function.valueParameter_.isEmpty()) {
            if (this.f18609.isEmpty()) {
                this.f18609 = protoBuf$Function.valueParameter_;
                this.f18611 &= -2049;
            } else {
                if ((this.f18611 & 2048) != 2048) {
                    this.f18609 = new ArrayList(this.f18609);
                    this.f18611 |= 2048;
                }
                this.f18609.addAll(protoBuf$Function.valueParameter_);
            }
        }
        if (protoBuf$Function.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            if ((this.f18611 & 4096) != 4096 || this.f18608 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18608 = typeTable;
            } else {
                C6956 c6956NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18608);
                c6956NewBuilder.m12254(typeTable);
                this.f18608 = c6956NewBuilder.m12255();
            }
            this.f18611 |= 4096;
        }
        if (!protoBuf$Function.versionRequirement_.isEmpty()) {
            if (this.f18607.isEmpty()) {
                this.f18607 = protoBuf$Function.versionRequirement_;
                this.f18611 &= -8193;
            } else {
                if ((this.f18611 & 8192) != 8192) {
                    this.f18607 = new ArrayList(this.f18607);
                    this.f18611 |= 8192;
                }
                this.f18607.addAll(protoBuf$Function.versionRequirement_);
            }
        }
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            if ((this.f18611 & 16384) != 16384 || this.f18606 == ProtoBuf$Contract.getDefaultInstance()) {
                this.f18606 = contract;
            } else {
                C6948 c6948NewBuilder = ProtoBuf$Contract.newBuilder(this.f18606);
                c6948NewBuilder.m12240(contract);
                this.f18606 = c6948NewBuilder.m12241();
            }
            this.f18611 |= 16384;
        }
        if (!protoBuf$Function.compilerPluginData_.isEmpty()) {
            if (this.f18605.isEmpty()) {
                this.f18605 = protoBuf$Function.compilerPluginData_;
                this.f18611 &= -32769;
            } else {
                if ((this.f18611 & 32768) != 32768) {
                    this.f18605 = new ArrayList(this.f18605);
                    this.f18611 |= 32768;
                }
                this.f18605.addAll(protoBuf$Function.compilerPluginData_);
            }
        }
        if (!protoBuf$Function.annotation_.isEmpty()) {
            if (this.f18604.isEmpty()) {
                this.f18604 = protoBuf$Function.annotation_;
                this.f18611 &= -65537;
            } else {
                if ((this.f18611 & 65536) != 65536) {
                    this.f18604 = new ArrayList(this.f18604);
                    this.f18611 |= 65536;
                }
                this.f18604.addAll(protoBuf$Function.annotation_);
            }
        }
        if (!protoBuf$Function.extensionReceiverAnnotation_.isEmpty()) {
            if (this.f18597.isEmpty()) {
                this.f18597 = protoBuf$Function.extensionReceiverAnnotation_;
                this.f18611 &= -131073;
            } else {
                if ((this.f18611 & 131072) != 131072) {
                    this.f18597 = new ArrayList(this.f18597);
                    this.f18611 |= 131072;
                }
                this.f18597.addAll(protoBuf$Function.extensionReceiverAnnotation_);
            }
        }
        m9411(protoBuf$Function);
        this.f13808 = this.f13808.m9401(protoBuf$Function.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Function m12266() {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
        int i = this.f18611;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Function.flags_ = this.f18610;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Function.oldFlags_ = this.f18614;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Function.name_ = this.f18615;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Function.returnType_ = this.f18612;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Function.returnTypeId_ = this.f18613;
        if ((this.f18611 & 32) == 32) {
            this.f18603 = Collections.unmodifiableList(this.f18603);
            this.f18611 &= -33;
        }
        protoBuf$Function.typeParameter_ = this.f18603;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Function.receiverType_ = this.f18602;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Function.receiverTypeId_ = this.f18601;
        if ((this.f18611 & 256) == 256) {
            this.f18600 = Collections.unmodifiableList(this.f18600);
            this.f18611 &= -257;
        }
        protoBuf$Function.contextReceiverType_ = this.f18600;
        if ((this.f18611 & 512) == 512) {
            this.f18599 = Collections.unmodifiableList(this.f18599);
            this.f18611 &= -513;
        }
        protoBuf$Function.contextReceiverTypeId_ = this.f18599;
        if ((this.f18611 & 1024) == 1024) {
            this.f18598 = Collections.unmodifiableList(this.f18598);
            this.f18611 &= -1025;
        }
        protoBuf$Function.contextParameter_ = this.f18598;
        if ((this.f18611 & 2048) == 2048) {
            this.f18609 = Collections.unmodifiableList(this.f18609);
            this.f18611 &= -2049;
        }
        protoBuf$Function.valueParameter_ = this.f18609;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        protoBuf$Function.typeTable_ = this.f18608;
        if ((this.f18611 & 8192) == 8192) {
            this.f18607 = Collections.unmodifiableList(this.f18607);
            this.f18611 &= -8193;
        }
        protoBuf$Function.versionRequirement_ = this.f18607;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        protoBuf$Function.contract_ = this.f18606;
        if ((this.f18611 & 32768) == 32768) {
            this.f18605 = Collections.unmodifiableList(this.f18605);
            this.f18611 &= -32769;
        }
        protoBuf$Function.compilerPluginData_ = this.f18605;
        if ((this.f18611 & 65536) == 65536) {
            this.f18604 = Collections.unmodifiableList(this.f18604);
            this.f18611 &= -65537;
        }
        protoBuf$Function.annotation_ = this.f18604;
        if ((this.f18611 & 131072) == 131072) {
            this.f18597 = Collections.unmodifiableList(this.f18597);
            this.f18611 &= -131073;
        }
        protoBuf$Function.extensionReceiverAnnotation_ = this.f18597;
        protoBuf$Function.bitField0_ = i2;
        return protoBuf$Function;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12265((ProtoBuf$Function) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12265(r3)
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
            r2.m12265(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6959.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4671 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13660;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f13661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeParameter.Variance f13664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f13665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f13667;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$TypeParameter protoBuf$TypeParameterM9290 = m9290();
        if (protoBuf$TypeParameterM9290.isInitialized()) {
            return protoBuf$TypeParameterM9290;
        }
        throw new UninitializedMessageException(protoBuf$TypeParameterM9290);
    }

    public final Object clone() {
        C4671 c4671 = new C4671();
        c4671.f13664 = ProtoBuf$TypeParameter.Variance.INV;
        List list = Collections.EMPTY_LIST;
        c4671.f13665 = list;
        c4671.f13661 = list;
        c4671.f13660 = list;
        c4671.m9289(m9290());
        return c4671;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9289(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeParameter.hasId()) {
            int id = protoBuf$TypeParameter.getId();
            this.f13663 |= 1;
            this.f13662 = id;
        }
        if (protoBuf$TypeParameter.hasName()) {
            int name = protoBuf$TypeParameter.getName();
            this.f13663 |= 2;
            this.f13666 = name;
        }
        if (protoBuf$TypeParameter.hasReified()) {
            boolean reified = protoBuf$TypeParameter.getReified();
            this.f13663 |= 4;
            this.f13667 = reified;
        }
        if (protoBuf$TypeParameter.hasVariance()) {
            ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
            variance.getClass();
            this.f13663 |= 8;
            this.f13664 = variance;
        }
        if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
            if (this.f13665.isEmpty()) {
                this.f13665 = protoBuf$TypeParameter.upperBound_;
                this.f13663 &= -17;
            } else {
                if ((this.f13663 & 16) != 16) {
                    this.f13665 = new ArrayList(this.f13665);
                    this.f13663 |= 16;
                }
                this.f13665.addAll(protoBuf$TypeParameter.upperBound_);
            }
        }
        if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
            if (this.f13661.isEmpty()) {
                this.f13661 = protoBuf$TypeParameter.upperBoundId_;
                this.f13663 &= -33;
            } else {
                if ((this.f13663 & 32) != 32) {
                    this.f13661 = new ArrayList(this.f13661);
                    this.f13663 |= 32;
                }
                this.f13661.addAll(protoBuf$TypeParameter.upperBoundId_);
            }
        }
        if (!protoBuf$TypeParameter.annotation_.isEmpty()) {
            if (this.f13660.isEmpty()) {
                this.f13660 = protoBuf$TypeParameter.annotation_;
                this.f13663 &= -65;
            } else {
                if ((this.f13663 & 64) != 64) {
                    this.f13660 = new ArrayList(this.f13660);
                    this.f13663 |= 64;
                }
                this.f13660.addAll(protoBuf$TypeParameter.annotation_);
            }
        }
        m9411(protoBuf$TypeParameter);
        this.f13808 = this.f13808.m9401(protoBuf$TypeParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter m9290() {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
        int i = this.f13663;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeParameter.id_ = this.f13662;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeParameter.name_ = this.f13666;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$TypeParameter.reified_ = this.f13667;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$TypeParameter.variance_ = this.f13664;
        if ((this.f13663 & 16) == 16) {
            this.f13665 = Collections.unmodifiableList(this.f13665);
            this.f13663 &= -17;
        }
        protoBuf$TypeParameter.upperBound_ = this.f13665;
        if ((this.f13663 & 32) == 32) {
            this.f13661 = Collections.unmodifiableList(this.f13661);
            this.f13663 &= -33;
        }
        protoBuf$TypeParameter.upperBoundId_ = this.f13661;
        if ((this.f13663 & 64) == 64) {
            this.f13660 = Collections.unmodifiableList(this.f13660);
            this.f13663 &= -65;
        }
        protoBuf$TypeParameter.annotation_ = this.f13660;
        protoBuf$TypeParameter.bitField0_ = i2;
        return protoBuf$TypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9289((ProtoBuf$TypeParameter) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9289(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9289(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4671.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

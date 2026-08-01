package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4670 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13656;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f13657;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13658;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeParameter.Variance f13660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f13661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f13663;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$TypeParameter protoBuf$TypeParameterM9300 = m9300();
        if (protoBuf$TypeParameterM9300.isInitialized()) {
            return protoBuf$TypeParameterM9300;
        }
        throw new UninitializedMessageException(protoBuf$TypeParameterM9300);
    }

    public final Object clone() {
        C4670 c4670 = new C4670();
        c4670.f13660 = ProtoBuf$TypeParameter.Variance.INV;
        List list = Collections.EMPTY_LIST;
        c4670.f13661 = list;
        c4670.f13657 = list;
        c4670.f13656 = list;
        c4670.m9299(m9300());
        return c4670;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9299(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeParameter.hasId()) {
            int id = protoBuf$TypeParameter.getId();
            this.f13659 |= 1;
            this.f13658 = id;
        }
        if (protoBuf$TypeParameter.hasName()) {
            int name = protoBuf$TypeParameter.getName();
            this.f13659 |= 2;
            this.f13662 = name;
        }
        if (protoBuf$TypeParameter.hasReified()) {
            boolean reified = protoBuf$TypeParameter.getReified();
            this.f13659 |= 4;
            this.f13663 = reified;
        }
        if (protoBuf$TypeParameter.hasVariance()) {
            ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
            variance.getClass();
            this.f13659 |= 8;
            this.f13660 = variance;
        }
        if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
            if (this.f13661.isEmpty()) {
                this.f13661 = protoBuf$TypeParameter.upperBound_;
                this.f13659 &= -17;
            } else {
                if ((this.f13659 & 16) != 16) {
                    this.f13661 = new ArrayList(this.f13661);
                    this.f13659 |= 16;
                }
                this.f13661.addAll(protoBuf$TypeParameter.upperBound_);
            }
        }
        if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
            if (this.f13657.isEmpty()) {
                this.f13657 = protoBuf$TypeParameter.upperBoundId_;
                this.f13659 &= -33;
            } else {
                if ((this.f13659 & 32) != 32) {
                    this.f13657 = new ArrayList(this.f13657);
                    this.f13659 |= 32;
                }
                this.f13657.addAll(protoBuf$TypeParameter.upperBoundId_);
            }
        }
        if (!protoBuf$TypeParameter.annotation_.isEmpty()) {
            if (this.f13656.isEmpty()) {
                this.f13656 = protoBuf$TypeParameter.annotation_;
                this.f13659 &= -65;
            } else {
                if ((this.f13659 & 64) != 64) {
                    this.f13656 = new ArrayList(this.f13656);
                    this.f13659 |= 64;
                }
                this.f13656.addAll(protoBuf$TypeParameter.annotation_);
            }
        }
        m9421(protoBuf$TypeParameter);
        this.f13804 = this.f13804.m9411(protoBuf$TypeParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter m9300() {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
        int i = this.f13659;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeParameter.id_ = this.f13658;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeParameter.name_ = this.f13662;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$TypeParameter.reified_ = this.f13663;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$TypeParameter.variance_ = this.f13660;
        if ((this.f13659 & 16) == 16) {
            this.f13661 = Collections.unmodifiableList(this.f13661);
            this.f13659 &= -17;
        }
        protoBuf$TypeParameter.upperBound_ = this.f13661;
        if ((this.f13659 & 32) == 32) {
            this.f13657 = Collections.unmodifiableList(this.f13657);
            this.f13659 &= -33;
        }
        protoBuf$TypeParameter.upperBoundId_ = this.f13657;
        if ((this.f13659 & 64) == 64) {
            this.f13656 = Collections.unmodifiableList(this.f13656);
            this.f13659 &= -65;
        }
        protoBuf$TypeParameter.annotation_ = this.f13656;
        protoBuf$TypeParameter.bitField0_ = i2;
        return protoBuf$TypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9299((ProtoBuf$TypeParameter) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9299(r3)
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
            r2.m9299(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4670.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

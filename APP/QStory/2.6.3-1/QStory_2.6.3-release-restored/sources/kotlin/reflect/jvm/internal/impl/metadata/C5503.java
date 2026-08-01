package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5503 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f14005;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f14006;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f14007;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14008;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeParameter.Variance f14009;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f14010;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f14011;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f14012;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$TypeParameter protoBuf$TypeParameterM9849 = m9849();
        if (protoBuf$TypeParameterM9849.isInitialized()) {
            return protoBuf$TypeParameterM9849;
        }
        throw new UninitializedMessageException(protoBuf$TypeParameterM9849);
    }

    public final Object clone() {
        C5503 c5503 = new C5503();
        c5503.f14009 = ProtoBuf$TypeParameter.Variance.INV;
        List list = Collections.EMPTY_LIST;
        c5503.f14010 = list;
        c5503.f14006 = list;
        c5503.f14005 = list;
        c5503.m9848(m9849());
        return c5503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9848(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeParameter.hasId()) {
            int id = protoBuf$TypeParameter.getId();
            this.f14008 |= 1;
            this.f14007 = id;
        }
        if (protoBuf$TypeParameter.hasName()) {
            int name = protoBuf$TypeParameter.getName();
            this.f14008 |= 2;
            this.f14011 = name;
        }
        if (protoBuf$TypeParameter.hasReified()) {
            boolean reified = protoBuf$TypeParameter.getReified();
            this.f14008 |= 4;
            this.f14012 = reified;
        }
        if (protoBuf$TypeParameter.hasVariance()) {
            ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
            variance.getClass();
            this.f14008 |= 8;
            this.f14009 = variance;
        }
        if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
            if (this.f14010.isEmpty()) {
                this.f14010 = protoBuf$TypeParameter.upperBound_;
                this.f14008 &= -17;
            } else {
                if ((this.f14008 & 16) != 16) {
                    this.f14010 = new ArrayList(this.f14010);
                    this.f14008 |= 16;
                }
                this.f14010.addAll(protoBuf$TypeParameter.upperBound_);
            }
        }
        if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
            if (this.f14006.isEmpty()) {
                this.f14006 = protoBuf$TypeParameter.upperBoundId_;
                this.f14008 &= -33;
            } else {
                if ((this.f14008 & 32) != 32) {
                    this.f14006 = new ArrayList(this.f14006);
                    this.f14008 |= 32;
                }
                this.f14006.addAll(protoBuf$TypeParameter.upperBoundId_);
            }
        }
        if (!protoBuf$TypeParameter.annotation_.isEmpty()) {
            if (this.f14005.isEmpty()) {
                this.f14005 = protoBuf$TypeParameter.annotation_;
                this.f14008 &= -65;
            } else {
                if ((this.f14008 & 64) != 64) {
                    this.f14005 = new ArrayList(this.f14005);
                    this.f14008 |= 64;
                }
                this.f14005.addAll(protoBuf$TypeParameter.annotation_);
            }
        }
        m9970(protoBuf$TypeParameter);
        this.f14153 = this.f14153.m9960(protoBuf$TypeParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter m9849() {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
        int i = this.f14008;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeParameter.id_ = this.f14007;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeParameter.name_ = this.f14011;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$TypeParameter.reified_ = this.f14012;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$TypeParameter.variance_ = this.f14009;
        if ((this.f14008 & 16) == 16) {
            this.f14010 = Collections.unmodifiableList(this.f14010);
            this.f14008 &= -17;
        }
        protoBuf$TypeParameter.upperBound_ = this.f14010;
        if ((this.f14008 & 32) == 32) {
            this.f14006 = Collections.unmodifiableList(this.f14006);
            this.f14008 &= -33;
        }
        protoBuf$TypeParameter.upperBoundId_ = this.f14006;
        if ((this.f14008 & 64) == 64) {
            this.f14005 = Collections.unmodifiableList(this.f14005);
            this.f14008 &= -65;
        }
        protoBuf$TypeParameter.annotation_ = this.f14005;
        protoBuf$TypeParameter.bitField0_ = i2;
        return protoBuf$TypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9848((ProtoBuf$TypeParameter) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = null;
        try {
            try {
                m9848((ProtoBuf$TypeParameter) ProtoBuf$TypeParameter.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter2 = (ProtoBuf$TypeParameter) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeParameter = protoBuf$TypeParameter2;
                    if (protoBuf$TypeParameter != null) {
                        m9848(protoBuf$TypeParameter);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$TypeParameter != null) {
            }
            throw th;
        }
    }
}

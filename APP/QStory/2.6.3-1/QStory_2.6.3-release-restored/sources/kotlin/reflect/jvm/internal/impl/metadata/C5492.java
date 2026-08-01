package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5492 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13960;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Annotation protoBuf$AnnotationM9837 = m9837();
        if (protoBuf$AnnotationM9837.isInitialized()) {
            return protoBuf$AnnotationM9837;
        }
        throw new UninitializedMessageException(protoBuf$AnnotationM9837);
    }

    public final Object clone() {
        C5492 c5492 = new C5492();
        c5492.f13958 = Collections.EMPTY_LIST;
        c5492.m9836(m9837());
        return c5492;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9836(ProtoBuf$Annotation protoBuf$Annotation) {
        if (protoBuf$Annotation == ProtoBuf$Annotation.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Annotation.hasId()) {
            int id = protoBuf$Annotation.getId();
            this.f13959 |= 1;
            this.f13960 = id;
        }
        if (!protoBuf$Annotation.argument_.isEmpty()) {
            if (this.f13958.isEmpty()) {
                this.f13958 = protoBuf$Annotation.argument_;
                this.f13959 &= -3;
            } else {
                if ((this.f13959 & 2) != 2) {
                    this.f13958 = new ArrayList(this.f13958);
                    this.f13959 |= 2;
                }
                this.f13958.addAll(protoBuf$Annotation.argument_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$Annotation.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Annotation m9837() {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this);
        int i = (this.f13959 & 1) != 1 ? 0 : 1;
        protoBuf$Annotation.id_ = this.f13960;
        if ((this.f13959 & 2) == 2) {
            this.f13958 = Collections.unmodifiableList(this.f13958);
            this.f13959 &= -3;
        }
        protoBuf$Annotation.argument_ = this.f13958;
        protoBuf$Annotation.bitField0_ = i;
        return protoBuf$Annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9836((ProtoBuf$Annotation) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Annotation protoBuf$Annotation = null;
        try {
            try {
                m9836((ProtoBuf$Annotation) ProtoBuf$Annotation.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Annotation = protoBuf$Annotation2;
                    if (protoBuf$Annotation != null) {
                        m9836(protoBuf$Annotation);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Annotation != null) {
            }
            throw th;
        }
    }
}

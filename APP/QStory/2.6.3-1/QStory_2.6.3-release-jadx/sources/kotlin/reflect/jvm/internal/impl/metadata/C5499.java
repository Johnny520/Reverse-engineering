package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5499 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13976;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13977;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13978;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Type.Argument.Projection f13979;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Type.Argument argumentM9843 = m9843();
        if (argumentM9843.isInitialized()) {
            return argumentM9843;
        }
        throw new UninitializedMessageException(argumentM9843);
    }

    public final Object clone() {
        C5499 c5499 = new C5499();
        c5499.f13979 = ProtoBuf$Type.Argument.Projection.INV;
        c5499.f13977 = ProtoBuf$Type.getDefaultInstance();
        c5499.m9842(m9843());
        return c5499;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9842(ProtoBuf$Type.Argument argument) {
        if (argument == ProtoBuf$Type.Argument.getDefaultInstance()) {
            return;
        }
        if (argument.hasProjection()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            projection.getClass();
            this.f13978 |= 1;
            this.f13979 = projection;
        }
        if (argument.hasType()) {
            ProtoBuf$Type type = argument.getType();
            if ((this.f13978 & 2) != 2 || this.f13977 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13977 = type;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f13977);
                c5502NewBuilder.m9846(type);
                this.f13977 = c5502NewBuilder.m9847();
            }
            this.f13978 |= 2;
        }
        if (argument.hasTypeId()) {
            int typeId = argument.getTypeId();
            this.f13978 |= 4;
            this.f13976 = typeId;
        }
        this.f14153 = this.f14153.m9960(argument.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Type.Argument m9843() {
        ProtoBuf$Type.Argument argument = new ProtoBuf$Type.Argument(this);
        int i = this.f13978;
        int i2 = (i & 1) != 1 ? 0 : 1;
        argument.projection_ = this.f13979;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        argument.type_ = this.f13977;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        argument.typeId_ = this.f13976;
        argument.bitField0_ = i2;
        return argument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9842((ProtoBuf$Type.Argument) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Type.Argument argument = null;
        try {
            try {
                m9842((ProtoBuf$Type.Argument) ProtoBuf$Type.Argument.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Type.Argument argument2 = (ProtoBuf$Type.Argument) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument = argument2;
                    if (argument != null) {
                        m9842(argument);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (argument != null) {
            }
            throw th;
        }
    }
}

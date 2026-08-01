package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4666 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13627;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Type.Argument.Projection f13630;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Type.Argument argumentM9294 = m9294();
        if (argumentM9294.isInitialized()) {
            return argumentM9294;
        }
        throw new UninitializedMessageException(argumentM9294);
    }

    public final Object clone() {
        C4666 c4666 = new C4666();
        c4666.f13630 = ProtoBuf$Type.Argument.Projection.INV;
        c4666.f13628 = ProtoBuf$Type.getDefaultInstance();
        c4666.m9293(m9294());
        return c4666;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9293(ProtoBuf$Type.Argument argument) {
        if (argument == ProtoBuf$Type.Argument.getDefaultInstance()) {
            return;
        }
        if (argument.hasProjection()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            projection.getClass();
            this.f13629 |= 1;
            this.f13630 = projection;
        }
        if (argument.hasType()) {
            ProtoBuf$Type type = argument.getType();
            if ((this.f13629 & 2) != 2 || this.f13628 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13628 = type;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f13628);
                c4669NewBuilder.m9297(type);
                this.f13628 = c4669NewBuilder.m9298();
            }
            this.f13629 |= 2;
        }
        if (argument.hasTypeId()) {
            int typeId = argument.getTypeId();
            this.f13629 |= 4;
            this.f13627 = typeId;
        }
        this.f13804 = this.f13804.m9411(argument.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Type.Argument m9294() {
        ProtoBuf$Type.Argument argument = new ProtoBuf$Type.Argument(this);
        int i = this.f13629;
        int i2 = (i & 1) != 1 ? 0 : 1;
        argument.projection_ = this.f13630;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        argument.type_ = this.f13628;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        argument.typeId_ = this.f13627;
        argument.bitField0_ = i2;
        return argument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9293((ProtoBuf$Type.Argument) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9293(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9293(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4666.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

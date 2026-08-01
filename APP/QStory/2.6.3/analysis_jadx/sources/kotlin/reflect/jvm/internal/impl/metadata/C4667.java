package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4667 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Type.Argument.Projection f13634;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Type.Argument argumentM9284 = m9284();
        if (argumentM9284.isInitialized()) {
            return argumentM9284;
        }
        throw new UninitializedMessageException(argumentM9284);
    }

    public final Object clone() {
        C4667 c4667 = new C4667();
        c4667.f13634 = ProtoBuf$Type.Argument.Projection.INV;
        c4667.f13632 = ProtoBuf$Type.getDefaultInstance();
        c4667.m9283(m9284());
        return c4667;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9283(ProtoBuf$Type.Argument argument) {
        if (argument == ProtoBuf$Type.Argument.getDefaultInstance()) {
            return;
        }
        if (argument.hasProjection()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            projection.getClass();
            this.f13633 |= 1;
            this.f13634 = projection;
        }
        if (argument.hasType()) {
            ProtoBuf$Type type = argument.getType();
            if ((this.f13633 & 2) != 2 || this.f13632 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13632 = type;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f13632);
                c4670NewBuilder.m9287(type);
                this.f13632 = c4670NewBuilder.m9288();
            }
            this.f13633 |= 2;
        }
        if (argument.hasTypeId()) {
            int typeId = argument.getTypeId();
            this.f13633 |= 4;
            this.f13631 = typeId;
        }
        this.f13808 = this.f13808.m9401(argument.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Type.Argument m9284() {
        ProtoBuf$Type.Argument argument = new ProtoBuf$Type.Argument(this);
        int i = this.f13633;
        int i2 = (i & 1) != 1 ? 0 : 1;
        argument.projection_ = this.f13634;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        argument.type_ = this.f13632;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        argument.typeId_ = this.f13631;
        argument.bitField0_ = i2;
        return argument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9283((ProtoBuf$Type.Argument) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9283(r3)
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
            r2.m9283(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4667.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

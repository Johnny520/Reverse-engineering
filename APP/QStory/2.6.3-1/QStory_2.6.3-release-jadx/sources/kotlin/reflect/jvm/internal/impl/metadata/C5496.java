package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5496 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value f13973;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13975;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Annotation.Argument argumentM9841 = m9841();
        if (argumentM9841.isInitialized()) {
            return argumentM9841;
        }
        throw new UninitializedMessageException(argumentM9841);
    }

    public final Object clone() {
        C5496 c5496 = new C5496();
        c5496.f13973 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        c5496.m9840(m9841());
        return c5496;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9840(ProtoBuf$Annotation.Argument argument) {
        if (argument == ProtoBuf$Annotation.Argument.getDefaultInstance()) {
            return;
        }
        if (argument.hasNameId()) {
            int nameId = argument.getNameId();
            this.f13974 |= 1;
            this.f13975 = nameId;
        }
        if (argument.hasValue()) {
            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
            if ((this.f13974 & 2) != 2 || this.f13973 == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
                this.f13973 = value;
            } else {
                C5494 c5494NewBuilder = ProtoBuf$Annotation.Argument.Value.newBuilder(this.f13973);
                c5494NewBuilder.m9838(value);
                this.f13973 = c5494NewBuilder.m9839();
            }
            this.f13974 |= 2;
        }
        this.f14153 = this.f14153.m9960(argument.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Annotation.Argument m9841() {
        ProtoBuf$Annotation.Argument argument = new ProtoBuf$Annotation.Argument(this);
        int i = this.f13974;
        int i2 = (i & 1) != 1 ? 0 : 1;
        argument.nameId_ = this.f13975;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        argument.value_ = this.f13973;
        argument.bitField0_ = i2;
        return argument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9840((ProtoBuf$Annotation.Argument) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Annotation.Argument argument = null;
        try {
            try {
                m9840((ProtoBuf$Annotation.Argument) ProtoBuf$Annotation.Argument.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Annotation.Argument argument2 = (ProtoBuf$Annotation.Argument) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument = argument2;
                    if (argument != null) {
                        m9840(argument);
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

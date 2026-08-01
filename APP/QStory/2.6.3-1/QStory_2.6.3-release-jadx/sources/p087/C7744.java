package p087;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7744 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18792;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignatureM12768 = m12768();
        if (jvmProtoBuf$JvmMethodSignatureM12768.isInitialized()) {
            return jvmProtoBuf$JvmMethodSignatureM12768;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmMethodSignatureM12768);
    }

    public final Object clone() {
        C7744 c7744 = new C7744();
        c7744.m12767(m12768());
        return c7744;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12767(JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature) {
        if (jvmProtoBuf$JvmMethodSignature == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmMethodSignature.hasName()) {
            int name = jvmProtoBuf$JvmMethodSignature.getName();
            this.f18791 |= 1;
            this.f18792 = name;
        }
        if (jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            int desc = jvmProtoBuf$JvmMethodSignature.getDesc();
            this.f18791 |= 2;
            this.f18790 = desc;
        }
        this.f14153 = this.f14153.m9960(jvmProtoBuf$JvmMethodSignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmMethodSignature m12768() {
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = new JvmProtoBuf$JvmMethodSignature(this);
        int i = this.f18791;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmMethodSignature.name_ = this.f18792;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmMethodSignature.desc_ = this.f18790;
        jvmProtoBuf$JvmMethodSignature.bitField0_ = i2;
        return jvmProtoBuf$JvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12767((JvmProtoBuf$JvmMethodSignature) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = null;
        try {
            try {
                m12767((JvmProtoBuf$JvmMethodSignature) JvmProtoBuf$JvmMethodSignature.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmProtoBuf$JvmMethodSignature) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmProtoBuf$JvmMethodSignature = jvmProtoBuf$JvmMethodSignature2;
                    if (jvmProtoBuf$JvmMethodSignature != null) {
                        m12767(jvmProtoBuf$JvmMethodSignature);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jvmProtoBuf$JvmMethodSignature != null) {
            }
            throw th;
        }
    }
}

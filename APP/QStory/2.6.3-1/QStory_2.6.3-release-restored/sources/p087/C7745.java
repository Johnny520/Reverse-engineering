package p087;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7745 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18795;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignatureM12770 = m12770();
        if (jvmProtoBuf$JvmFieldSignatureM12770.isInitialized()) {
            return jvmProtoBuf$JvmFieldSignatureM12770;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmFieldSignatureM12770);
    }

    public final Object clone() {
        C7745 c7745 = new C7745();
        c7745.m12769(m12770());
        return c7745;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12769(JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature) {
        if (jvmProtoBuf$JvmFieldSignature == JvmProtoBuf$JvmFieldSignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmFieldSignature.hasName()) {
            int name = jvmProtoBuf$JvmFieldSignature.getName();
            this.f18794 |= 1;
            this.f18795 = name;
        }
        if (jvmProtoBuf$JvmFieldSignature.hasDesc()) {
            int desc = jvmProtoBuf$JvmFieldSignature.getDesc();
            this.f18794 |= 2;
            this.f18793 = desc;
        }
        this.f14153 = this.f14153.m9960(jvmProtoBuf$JvmFieldSignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmFieldSignature m12770() {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = new JvmProtoBuf$JvmFieldSignature(this);
        int i = this.f18794;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmFieldSignature.name_ = this.f18795;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmFieldSignature.desc_ = this.f18793;
        jvmProtoBuf$JvmFieldSignature.bitField0_ = i2;
        return jvmProtoBuf$JvmFieldSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12769((JvmProtoBuf$JvmFieldSignature) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = null;
        try {
            try {
                m12769((JvmProtoBuf$JvmFieldSignature) JvmProtoBuf$JvmFieldSignature.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature2 = (JvmProtoBuf$JvmFieldSignature) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmProtoBuf$JvmFieldSignature = jvmProtoBuf$JvmFieldSignature2;
                    if (jvmProtoBuf$JvmFieldSignature != null) {
                        m12769(jvmProtoBuf$JvmFieldSignature);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jvmProtoBuf$JvmFieldSignature != null) {
            }
            throw th;
        }
    }
}

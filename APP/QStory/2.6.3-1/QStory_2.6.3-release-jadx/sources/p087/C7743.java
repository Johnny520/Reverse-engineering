package p087;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7743 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public JvmProtoBuf$JvmFieldSignature f18789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7743 m12764() {
        C7743 c7743 = new C7743();
        c7743.f18789 = JvmProtoBuf$JvmFieldSignature.getDefaultInstance();
        c7743.f18785 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c7743.f18784 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c7743.f18786 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c7743.f18787 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        return c7743;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignatureM12766 = m12766();
        if (jvmProtoBuf$JvmPropertySignatureM12766.isInitialized()) {
            return jvmProtoBuf$JvmPropertySignatureM12766;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmPropertySignatureM12766);
    }

    public final Object clone() {
        C7743 c7743M12764 = m12764();
        c7743M12764.m12765(m12766());
        return c7743M12764;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12765(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        if (jvmProtoBuf$JvmPropertySignature == JvmProtoBuf$JvmPropertySignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasField()) {
            JvmProtoBuf$JvmFieldSignature field = jvmProtoBuf$JvmPropertySignature.getField();
            if ((this.f18788 & 1) != 1 || this.f18789 == JvmProtoBuf$JvmFieldSignature.getDefaultInstance()) {
                this.f18789 = field;
            } else {
                C7745 c7745NewBuilder = JvmProtoBuf$JvmFieldSignature.newBuilder(this.f18789);
                c7745NewBuilder.m12769(field);
                this.f18789 = c7745NewBuilder.m12770();
            }
            this.f18788 |= 1;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) {
            JvmProtoBuf$JvmMethodSignature syntheticMethod = jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            if ((this.f18788 & 2) != 2 || this.f18785 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18785 = syntheticMethod;
            } else {
                C7744 c7744NewBuilder = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18785);
                c7744NewBuilder.m12767(syntheticMethod);
                this.f18785 = c7744NewBuilder.m12768();
            }
            this.f18788 |= 2;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasGetter()) {
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            if ((this.f18788 & 4) != 4 || this.f18784 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18784 = getter;
            } else {
                C7744 c7744NewBuilder2 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18784);
                c7744NewBuilder2.m12767(getter);
                this.f18784 = c7744NewBuilder2.m12768();
            }
            this.f18788 |= 4;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
            if ((this.f18788 & 8) != 8 || this.f18786 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18786 = setter;
            } else {
                C7744 c7744NewBuilder3 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18786);
                c7744NewBuilder3.m12767(setter);
                this.f18786 = c7744NewBuilder3.m12768();
            }
            this.f18788 |= 8;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
            JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            if ((this.f18788 & 16) != 16 || this.f18787 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18787 = delegateMethod;
            } else {
                C7744 c7744NewBuilder4 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18787);
                c7744NewBuilder4.m12767(delegateMethod);
                this.f18787 = c7744NewBuilder4.m12768();
            }
            this.f18788 |= 16;
        }
        this.f14153 = this.f14153.m9960(jvmProtoBuf$JvmPropertySignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmPropertySignature m12766() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(this);
        int i = this.f18788;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmPropertySignature.field_ = this.f18789;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmPropertySignature.syntheticMethod_ = this.f18785;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        jvmProtoBuf$JvmPropertySignature.getter_ = this.f18784;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        jvmProtoBuf$JvmPropertySignature.setter_ = this.f18786;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        jvmProtoBuf$JvmPropertySignature.delegateMethod_ = this.f18787;
        jvmProtoBuf$JvmPropertySignature.bitField0_ = i2;
        return jvmProtoBuf$JvmPropertySignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12765((JvmProtoBuf$JvmPropertySignature) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = null;
        try {
            try {
                m12765((JvmProtoBuf$JvmPropertySignature) JvmProtoBuf$JvmPropertySignature.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature2 = (JvmProtoBuf$JvmPropertySignature) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmProtoBuf$JvmPropertySignature = jvmProtoBuf$JvmPropertySignature2;
                    if (jvmProtoBuf$JvmPropertySignature != null) {
                        m12765(jvmProtoBuf$JvmPropertySignature);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jvmProtoBuf$JvmPropertySignature != null) {
            }
            throw th;
        }
    }
}

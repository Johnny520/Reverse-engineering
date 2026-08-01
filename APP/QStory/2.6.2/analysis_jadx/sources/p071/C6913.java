package p071;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6913 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18444;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18445;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18446;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18448;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public JvmProtoBuf$JvmFieldSignature f18449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6913 m12177() {
        C6913 c6913 = new C6913();
        c6913.f18449 = JvmProtoBuf$JvmFieldSignature.getDefaultInstance();
        c6913.f18445 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6913.f18444 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6913.f18446 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6913.f18447 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        return c6913;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignatureM12179 = m12179();
        if (jvmProtoBuf$JvmPropertySignatureM12179.isInitialized()) {
            return jvmProtoBuf$JvmPropertySignatureM12179;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmPropertySignatureM12179);
    }

    public final Object clone() {
        C6913 c6913M12177 = m12177();
        c6913M12177.m12178(m12179());
        return c6913M12177;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12178(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        if (jvmProtoBuf$JvmPropertySignature == JvmProtoBuf$JvmPropertySignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasField()) {
            JvmProtoBuf$JvmFieldSignature field = jvmProtoBuf$JvmPropertySignature.getField();
            if ((this.f18448 & 1) != 1 || this.f18449 == JvmProtoBuf$JvmFieldSignature.getDefaultInstance()) {
                this.f18449 = field;
            } else {
                C6915 c6915NewBuilder = JvmProtoBuf$JvmFieldSignature.newBuilder(this.f18449);
                c6915NewBuilder.m12182(field);
                this.f18449 = c6915NewBuilder.m12183();
            }
            this.f18448 |= 1;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) {
            JvmProtoBuf$JvmMethodSignature syntheticMethod = jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            if ((this.f18448 & 2) != 2 || this.f18445 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18445 = syntheticMethod;
            } else {
                C6914 c6914NewBuilder = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18445);
                c6914NewBuilder.m12180(syntheticMethod);
                this.f18445 = c6914NewBuilder.m12181();
            }
            this.f18448 |= 2;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasGetter()) {
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            if ((this.f18448 & 4) != 4 || this.f18444 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18444 = getter;
            } else {
                C6914 c6914NewBuilder2 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18444);
                c6914NewBuilder2.m12180(getter);
                this.f18444 = c6914NewBuilder2.m12181();
            }
            this.f18448 |= 4;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
            if ((this.f18448 & 8) != 8 || this.f18446 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18446 = setter;
            } else {
                C6914 c6914NewBuilder3 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18446);
                c6914NewBuilder3.m12180(setter);
                this.f18446 = c6914NewBuilder3.m12181();
            }
            this.f18448 |= 8;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
            JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            if ((this.f18448 & 16) != 16 || this.f18447 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18447 = delegateMethod;
            } else {
                C6914 c6914NewBuilder4 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18447);
                c6914NewBuilder4.m12180(delegateMethod);
                this.f18447 = c6914NewBuilder4.m12181();
            }
            this.f18448 |= 16;
        }
        this.f13804 = this.f13804.m9411(jvmProtoBuf$JvmPropertySignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmPropertySignature m12179() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(this);
        int i = this.f18448;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmPropertySignature.field_ = this.f18449;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmPropertySignature.syntheticMethod_ = this.f18445;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        jvmProtoBuf$JvmPropertySignature.getter_ = this.f18444;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        jvmProtoBuf$JvmPropertySignature.setter_ = this.f18446;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        jvmProtoBuf$JvmPropertySignature.delegateMethod_ = this.f18447;
        jvmProtoBuf$JvmPropertySignature.bitField0_ = i2;
        return jvmProtoBuf$JvmPropertySignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12178((JvmProtoBuf$JvmPropertySignature) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12178(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12178(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p071.C6913.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

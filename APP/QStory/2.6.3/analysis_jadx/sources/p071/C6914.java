package p071;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6914 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18439;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18441;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public JvmProtoBuf$JvmMethodSignature f18442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public JvmProtoBuf$JvmFieldSignature f18444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6914 m12205() {
        C6914 c6914 = new C6914();
        c6914.f18444 = JvmProtoBuf$JvmFieldSignature.getDefaultInstance();
        c6914.f18440 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6914.f18439 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6914.f18441 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        c6914.f18442 = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        return c6914;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignatureM12207 = m12207();
        if (jvmProtoBuf$JvmPropertySignatureM12207.isInitialized()) {
            return jvmProtoBuf$JvmPropertySignatureM12207;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmPropertySignatureM12207);
    }

    public final Object clone() {
        C6914 c6914M12205 = m12205();
        c6914M12205.m12206(m12207());
        return c6914M12205;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12206(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        if (jvmProtoBuf$JvmPropertySignature == JvmProtoBuf$JvmPropertySignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasField()) {
            JvmProtoBuf$JvmFieldSignature field = jvmProtoBuf$JvmPropertySignature.getField();
            if ((this.f18443 & 1) != 1 || this.f18444 == JvmProtoBuf$JvmFieldSignature.getDefaultInstance()) {
                this.f18444 = field;
            } else {
                C6916 c6916NewBuilder = JvmProtoBuf$JvmFieldSignature.newBuilder(this.f18444);
                c6916NewBuilder.m12210(field);
                this.f18444 = c6916NewBuilder.m12211();
            }
            this.f18443 |= 1;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) {
            JvmProtoBuf$JvmMethodSignature syntheticMethod = jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            if ((this.f18443 & 2) != 2 || this.f18440 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18440 = syntheticMethod;
            } else {
                C6915 c6915NewBuilder = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18440);
                c6915NewBuilder.m12208(syntheticMethod);
                this.f18440 = c6915NewBuilder.m12209();
            }
            this.f18443 |= 2;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasGetter()) {
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            if ((this.f18443 & 4) != 4 || this.f18439 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18439 = getter;
            } else {
                C6915 c6915NewBuilder2 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18439);
                c6915NewBuilder2.m12208(getter);
                this.f18439 = c6915NewBuilder2.m12209();
            }
            this.f18443 |= 4;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
            if ((this.f18443 & 8) != 8 || this.f18441 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18441 = setter;
            } else {
                C6915 c6915NewBuilder3 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18441);
                c6915NewBuilder3.m12208(setter);
                this.f18441 = c6915NewBuilder3.m12209();
            }
            this.f18443 |= 8;
        }
        if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
            JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            if ((this.f18443 & 16) != 16 || this.f18442 == JvmProtoBuf$JvmMethodSignature.getDefaultInstance()) {
                this.f18442 = delegateMethod;
            } else {
                C6915 c6915NewBuilder4 = JvmProtoBuf$JvmMethodSignature.newBuilder(this.f18442);
                c6915NewBuilder4.m12208(delegateMethod);
                this.f18442 = c6915NewBuilder4.m12209();
            }
            this.f18443 |= 16;
        }
        this.f13808 = this.f13808.m9401(jvmProtoBuf$JvmPropertySignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmPropertySignature m12207() {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(this);
        int i = this.f18443;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmPropertySignature.field_ = this.f18444;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmPropertySignature.syntheticMethod_ = this.f18440;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        jvmProtoBuf$JvmPropertySignature.getter_ = this.f18439;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        jvmProtoBuf$JvmPropertySignature.setter_ = this.f18441;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        jvmProtoBuf$JvmPropertySignature.delegateMethod_ = this.f18442;
        jvmProtoBuf$JvmPropertySignature.bitField0_ = i2;
        return jvmProtoBuf$JvmPropertySignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12206((JvmProtoBuf$JvmPropertySignature) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12206(r3)
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
            r2.m12206(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p071.C6914.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

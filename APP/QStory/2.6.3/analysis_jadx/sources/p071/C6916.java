package p071;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6916 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18448;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18449;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18450;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignatureM12211 = m12211();
        if (jvmProtoBuf$JvmFieldSignatureM12211.isInitialized()) {
            return jvmProtoBuf$JvmFieldSignatureM12211;
        }
        throw new UninitializedMessageException(jvmProtoBuf$JvmFieldSignatureM12211);
    }

    public final Object clone() {
        C6916 c6916 = new C6916();
        c6916.m12210(m12211());
        return c6916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12210(JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature) {
        if (jvmProtoBuf$JvmFieldSignature == JvmProtoBuf$JvmFieldSignature.getDefaultInstance()) {
            return;
        }
        if (jvmProtoBuf$JvmFieldSignature.hasName()) {
            int name = jvmProtoBuf$JvmFieldSignature.getName();
            this.f18449 |= 1;
            this.f18450 = name;
        }
        if (jvmProtoBuf$JvmFieldSignature.hasDesc()) {
            int desc = jvmProtoBuf$JvmFieldSignature.getDesc();
            this.f18449 |= 2;
            this.f18448 = desc;
        }
        this.f13808 = this.f13808.m9401(jvmProtoBuf$JvmFieldSignature.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$JvmFieldSignature m12211() {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = new JvmProtoBuf$JvmFieldSignature(this);
        int i = this.f18449;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jvmProtoBuf$JvmFieldSignature.name_ = this.f18450;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jvmProtoBuf$JvmFieldSignature.desc_ = this.f18448;
        jvmProtoBuf$JvmFieldSignature.bitField0_ = i2;
        return jvmProtoBuf$JvmFieldSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12210((JvmProtoBuf$JvmFieldSignature) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12210(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12210(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p071.C6916.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

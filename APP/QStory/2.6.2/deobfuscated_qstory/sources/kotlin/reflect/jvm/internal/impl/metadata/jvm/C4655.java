package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4655 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f13601;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypesM9284 = m9284();
        if (jvmProtoBuf$StringTableTypesM9284.isInitialized()) {
            return jvmProtoBuf$StringTableTypesM9284;
        }
        throw new UninitializedMessageException(jvmProtoBuf$StringTableTypesM9284);
    }

    public final Object clone() {
        C4655 c4655 = new C4655();
        List list = Collections.EMPTY_LIST;
        c4655.f13601 = list;
        c4655.f13599 = list;
        c4655.m9283(m9284());
        return c4655;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9283(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        if (jvmProtoBuf$StringTableTypes == JvmProtoBuf$StringTableTypes.getDefaultInstance()) {
            return;
        }
        if (!jvmProtoBuf$StringTableTypes.record_.isEmpty()) {
            if (this.f13601.isEmpty()) {
                this.f13601 = jvmProtoBuf$StringTableTypes.record_;
                this.f13600 &= -2;
            } else {
                if ((this.f13600 & 1) != 1) {
                    this.f13601 = new ArrayList(this.f13601);
                    this.f13600 |= 1;
                }
                this.f13601.addAll(jvmProtoBuf$StringTableTypes.record_);
            }
        }
        if (!jvmProtoBuf$StringTableTypes.localName_.isEmpty()) {
            if (this.f13599.isEmpty()) {
                this.f13599 = jvmProtoBuf$StringTableTypes.localName_;
                this.f13600 &= -3;
            } else {
                if ((this.f13600 & 2) != 2) {
                    this.f13599 = new ArrayList(this.f13599);
                    this.f13600 |= 2;
                }
                this.f13599.addAll(jvmProtoBuf$StringTableTypes.localName_);
            }
        }
        this.f13804 = this.f13804.m9411(jvmProtoBuf$StringTableTypes.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes m9284() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(this);
        if ((this.f13600 & 1) == 1) {
            this.f13601 = Collections.unmodifiableList(this.f13601);
            this.f13600 &= -2;
        }
        jvmProtoBuf$StringTableTypes.record_ = this.f13601;
        if ((this.f13600 & 2) == 2) {
            this.f13599 = Collections.unmodifiableList(this.f13599);
            this.f13600 &= -3;
        }
        jvmProtoBuf$StringTableTypes.localName_ = this.f13599;
        return jvmProtoBuf$StringTableTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9283((JvmProtoBuf$StringTableTypes) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9283(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.C4655.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

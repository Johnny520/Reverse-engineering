package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4656 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13603;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f13605;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypesM9274 = m9274();
        if (jvmProtoBuf$StringTableTypesM9274.isInitialized()) {
            return jvmProtoBuf$StringTableTypesM9274;
        }
        throw new UninitializedMessageException(jvmProtoBuf$StringTableTypesM9274);
    }

    public final Object clone() {
        C4656 c4656 = new C4656();
        List list = Collections.EMPTY_LIST;
        c4656.f13605 = list;
        c4656.f13603 = list;
        c4656.m9273(m9274());
        return c4656;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9273(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        if (jvmProtoBuf$StringTableTypes == JvmProtoBuf$StringTableTypes.getDefaultInstance()) {
            return;
        }
        if (!jvmProtoBuf$StringTableTypes.record_.isEmpty()) {
            if (this.f13605.isEmpty()) {
                this.f13605 = jvmProtoBuf$StringTableTypes.record_;
                this.f13604 &= -2;
            } else {
                if ((this.f13604 & 1) != 1) {
                    this.f13605 = new ArrayList(this.f13605);
                    this.f13604 |= 1;
                }
                this.f13605.addAll(jvmProtoBuf$StringTableTypes.record_);
            }
        }
        if (!jvmProtoBuf$StringTableTypes.localName_.isEmpty()) {
            if (this.f13603.isEmpty()) {
                this.f13603 = jvmProtoBuf$StringTableTypes.localName_;
                this.f13604 &= -3;
            } else {
                if ((this.f13604 & 2) != 2) {
                    this.f13603 = new ArrayList(this.f13603);
                    this.f13604 |= 2;
                }
                this.f13603.addAll(jvmProtoBuf$StringTableTypes.localName_);
            }
        }
        this.f13808 = this.f13808.m9401(jvmProtoBuf$StringTableTypes.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes m9274() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(this);
        if ((this.f13604 & 1) == 1) {
            this.f13605 = Collections.unmodifiableList(this.f13605);
            this.f13604 &= -2;
        }
        jvmProtoBuf$StringTableTypes.record_ = this.f13605;
        if ((this.f13604 & 2) == 2) {
            this.f13603 = Collections.unmodifiableList(this.f13603);
            this.f13604 &= -3;
        }
        jvmProtoBuf$StringTableTypes.localName_ = this.f13603;
        return jvmProtoBuf$StringTableTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9273((JvmProtoBuf$StringTableTypes) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9273(r3)
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
            r2.m9273(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.C4656.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6948 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18549;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f18552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18553;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18554;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Constructor protoBuf$ConstructorM12215 = m12215();
        if (protoBuf$ConstructorM12215.isInitialized()) {
            return protoBuf$ConstructorM12215;
        }
        throw new UninitializedMessageException(protoBuf$ConstructorM12215);
    }

    public final Object clone() {
        C6948 c6948 = new C6948();
        c6948.f18549 = 6;
        List list = Collections.EMPTY_LIST;
        c6948.f18553 = list;
        c6948.f18554 = list;
        c6948.f18551 = list;
        c6948.f18552 = list;
        c6948.m12214(m12215());
        return c6948;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12214(ProtoBuf$Constructor protoBuf$Constructor) {
        if (protoBuf$Constructor == ProtoBuf$Constructor.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Constructor.hasFlags()) {
            int flags = protoBuf$Constructor.getFlags();
            this.f18550 |= 1;
            this.f18549 = flags;
        }
        if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
            if (this.f18553.isEmpty()) {
                this.f18553 = protoBuf$Constructor.valueParameter_;
                this.f18550 &= -3;
            } else {
                if ((this.f18550 & 2) != 2) {
                    this.f18553 = new ArrayList(this.f18553);
                    this.f18550 |= 2;
                }
                this.f18553.addAll(protoBuf$Constructor.valueParameter_);
            }
        }
        if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
            if (this.f18554.isEmpty()) {
                this.f18554 = protoBuf$Constructor.versionRequirement_;
                this.f18550 &= -5;
            } else {
                if ((this.f18550 & 4) != 4) {
                    this.f18554 = new ArrayList(this.f18554);
                    this.f18550 |= 4;
                }
                this.f18554.addAll(protoBuf$Constructor.versionRequirement_);
            }
        }
        if (!protoBuf$Constructor.compilerPluginData_.isEmpty()) {
            if (this.f18551.isEmpty()) {
                this.f18551 = protoBuf$Constructor.compilerPluginData_;
                this.f18550 &= -9;
            } else {
                if ((this.f18550 & 8) != 8) {
                    this.f18551 = new ArrayList(this.f18551);
                    this.f18550 |= 8;
                }
                this.f18551.addAll(protoBuf$Constructor.compilerPluginData_);
            }
        }
        if (!protoBuf$Constructor.annotation_.isEmpty()) {
            if (this.f18552.isEmpty()) {
                this.f18552 = protoBuf$Constructor.annotation_;
                this.f18550 &= -17;
            } else {
                if ((this.f18550 & 16) != 16) {
                    this.f18552 = new ArrayList(this.f18552);
                    this.f18550 |= 16;
                }
                this.f18552.addAll(protoBuf$Constructor.annotation_);
            }
        }
        m9421(protoBuf$Constructor);
        this.f13804 = this.f13804.m9411(protoBuf$Constructor.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Constructor m12215() {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
        int i = (this.f18550 & 1) != 1 ? 0 : 1;
        protoBuf$Constructor.flags_ = this.f18549;
        if ((this.f18550 & 2) == 2) {
            this.f18553 = Collections.unmodifiableList(this.f18553);
            this.f18550 &= -3;
        }
        protoBuf$Constructor.valueParameter_ = this.f18553;
        if ((this.f18550 & 4) == 4) {
            this.f18554 = Collections.unmodifiableList(this.f18554);
            this.f18550 &= -5;
        }
        protoBuf$Constructor.versionRequirement_ = this.f18554;
        if ((this.f18550 & 8) == 8) {
            this.f18551 = Collections.unmodifiableList(this.f18551);
            this.f18550 &= -9;
        }
        protoBuf$Constructor.compilerPluginData_ = this.f18551;
        if ((this.f18550 & 16) == 16) {
            this.f18552 = Collections.unmodifiableList(this.f18552);
            this.f18550 &= -17;
        }
        protoBuf$Constructor.annotation_ = this.f18552;
        protoBuf$Constructor.bitField0_ = i;
        return protoBuf$Constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12214((ProtoBuf$Constructor) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12214(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12214(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6948.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

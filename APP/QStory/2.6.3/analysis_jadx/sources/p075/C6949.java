package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6949 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18544;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18545;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18546;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f18547;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18548;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18549;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Constructor protoBuf$ConstructorM12243 = m12243();
        if (protoBuf$ConstructorM12243.isInitialized()) {
            return protoBuf$ConstructorM12243;
        }
        throw new UninitializedMessageException(protoBuf$ConstructorM12243);
    }

    public final Object clone() {
        C6949 c6949 = new C6949();
        c6949.f18544 = 6;
        List list = Collections.EMPTY_LIST;
        c6949.f18548 = list;
        c6949.f18549 = list;
        c6949.f18546 = list;
        c6949.f18547 = list;
        c6949.m12242(m12243());
        return c6949;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12242(ProtoBuf$Constructor protoBuf$Constructor) {
        if (protoBuf$Constructor == ProtoBuf$Constructor.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Constructor.hasFlags()) {
            int flags = protoBuf$Constructor.getFlags();
            this.f18545 |= 1;
            this.f18544 = flags;
        }
        if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
            if (this.f18548.isEmpty()) {
                this.f18548 = protoBuf$Constructor.valueParameter_;
                this.f18545 &= -3;
            } else {
                if ((this.f18545 & 2) != 2) {
                    this.f18548 = new ArrayList(this.f18548);
                    this.f18545 |= 2;
                }
                this.f18548.addAll(protoBuf$Constructor.valueParameter_);
            }
        }
        if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
            if (this.f18549.isEmpty()) {
                this.f18549 = protoBuf$Constructor.versionRequirement_;
                this.f18545 &= -5;
            } else {
                if ((this.f18545 & 4) != 4) {
                    this.f18549 = new ArrayList(this.f18549);
                    this.f18545 |= 4;
                }
                this.f18549.addAll(protoBuf$Constructor.versionRequirement_);
            }
        }
        if (!protoBuf$Constructor.compilerPluginData_.isEmpty()) {
            if (this.f18546.isEmpty()) {
                this.f18546 = protoBuf$Constructor.compilerPluginData_;
                this.f18545 &= -9;
            } else {
                if ((this.f18545 & 8) != 8) {
                    this.f18546 = new ArrayList(this.f18546);
                    this.f18545 |= 8;
                }
                this.f18546.addAll(protoBuf$Constructor.compilerPluginData_);
            }
        }
        if (!protoBuf$Constructor.annotation_.isEmpty()) {
            if (this.f18547.isEmpty()) {
                this.f18547 = protoBuf$Constructor.annotation_;
                this.f18545 &= -17;
            } else {
                if ((this.f18545 & 16) != 16) {
                    this.f18547 = new ArrayList(this.f18547);
                    this.f18545 |= 16;
                }
                this.f18547.addAll(protoBuf$Constructor.annotation_);
            }
        }
        m9411(protoBuf$Constructor);
        this.f13808 = this.f13808.m9401(protoBuf$Constructor.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Constructor m12243() {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
        int i = (this.f18545 & 1) != 1 ? 0 : 1;
        protoBuf$Constructor.flags_ = this.f18544;
        if ((this.f18545 & 2) == 2) {
            this.f18548 = Collections.unmodifiableList(this.f18548);
            this.f18545 &= -3;
        }
        protoBuf$Constructor.valueParameter_ = this.f18548;
        if ((this.f18545 & 4) == 4) {
            this.f18549 = Collections.unmodifiableList(this.f18549);
            this.f18545 &= -5;
        }
        protoBuf$Constructor.versionRequirement_ = this.f18549;
        if ((this.f18545 & 8) == 8) {
            this.f18546 = Collections.unmodifiableList(this.f18546);
            this.f18545 &= -9;
        }
        protoBuf$Constructor.compilerPluginData_ = this.f18546;
        if ((this.f18545 & 16) == 16) {
            this.f18547 = Collections.unmodifiableList(this.f18547);
            this.f18545 &= -17;
        }
        protoBuf$Constructor.annotation_ = this.f18547;
        protoBuf$Constructor.bitField0_ = i;
        return protoBuf$Constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12242((ProtoBuf$Constructor) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12242(r3)
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
            r2.m12242(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6949.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6947 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18539;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18540;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18541;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$EnumEntry protoBuf$EnumEntryM12239 = m12239();
        if (protoBuf$EnumEntryM12239.isInitialized()) {
            return protoBuf$EnumEntryM12239;
        }
        throw new UninitializedMessageException(protoBuf$EnumEntryM12239);
    }

    public final Object clone() {
        C6947 c6947 = new C6947();
        c6947.f18541 = Collections.EMPTY_LIST;
        c6947.m12238(m12239());
        return c6947;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12238(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.getDefaultInstance()) {
            return;
        }
        if (protoBuf$EnumEntry.hasName()) {
            int name = protoBuf$EnumEntry.getName();
            this.f18540 |= 1;
            this.f18539 = name;
        }
        if (!protoBuf$EnumEntry.annotation_.isEmpty()) {
            if (this.f18541.isEmpty()) {
                this.f18541 = protoBuf$EnumEntry.annotation_;
                this.f18540 &= -3;
            } else {
                if ((this.f18540 & 2) != 2) {
                    this.f18541 = new ArrayList(this.f18541);
                    this.f18540 |= 2;
                }
                this.f18541.addAll(protoBuf$EnumEntry.annotation_);
            }
        }
        m9411(protoBuf$EnumEntry);
        this.f13808 = this.f13808.m9401(protoBuf$EnumEntry.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$EnumEntry m12239() {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
        int i = (this.f18540 & 1) != 1 ? 0 : 1;
        protoBuf$EnumEntry.name_ = this.f18539;
        if ((this.f18540 & 2) == 2) {
            this.f18541 = Collections.unmodifiableList(this.f18541);
            this.f18540 &= -3;
        }
        protoBuf$EnumEntry.annotation_ = this.f18541;
        protoBuf$EnumEntry.bitField0_ = i;
        return protoBuf$EnumEntry;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12238((ProtoBuf$EnumEntry) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12238(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12238(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6947.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

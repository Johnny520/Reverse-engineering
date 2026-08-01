package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6955 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f18598;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$TypeTable protoBuf$TypeTableM12227 = m12227();
        if (protoBuf$TypeTableM12227.isInitialized()) {
            return protoBuf$TypeTableM12227;
        }
        throw new UninitializedMessageException(protoBuf$TypeTableM12227);
    }

    public final Object clone() {
        C6955 c6955 = new C6955();
        c6955.f18598 = Collections.EMPTY_LIST;
        c6955.f18596 = -1;
        c6955.m12226(m12227());
        return c6955;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12226(ProtoBuf$TypeTable protoBuf$TypeTable) {
        if (protoBuf$TypeTable == ProtoBuf$TypeTable.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$TypeTable.type_.isEmpty()) {
            if (this.f18598.isEmpty()) {
                this.f18598 = protoBuf$TypeTable.type_;
                this.f18597 &= -2;
            } else {
                if ((this.f18597 & 1) != 1) {
                    this.f18598 = new ArrayList(this.f18598);
                    this.f18597 |= 1;
                }
                this.f18598.addAll(protoBuf$TypeTable.type_);
            }
        }
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            this.f18597 |= 2;
            this.f18596 = firstNullable;
        }
        this.f13804 = this.f13804.m9411(protoBuf$TypeTable.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$TypeTable m12227() {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this);
        int i = this.f18597;
        if ((i & 1) == 1) {
            this.f18598 = Collections.unmodifiableList(this.f18598);
            this.f18597 &= -2;
        }
        protoBuf$TypeTable.type_ = this.f18598;
        int i2 = (i & 2) != 2 ? 0 : 1;
        protoBuf$TypeTable.firstNullable_ = this.f18596;
        protoBuf$TypeTable.bitField0_ = i2;
        return protoBuf$TypeTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12226((ProtoBuf$TypeTable) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12226(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12226(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6955.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

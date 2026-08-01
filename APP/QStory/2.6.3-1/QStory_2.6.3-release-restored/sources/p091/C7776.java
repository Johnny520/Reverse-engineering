package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7776 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18885;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18886;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$EnumEntry protoBuf$EnumEntryM12798 = m12798();
        if (protoBuf$EnumEntryM12798.isInitialized()) {
            return protoBuf$EnumEntryM12798;
        }
        throw new UninitializedMessageException(protoBuf$EnumEntryM12798);
    }

    public final Object clone() {
        C7776 c7776 = new C7776();
        c7776.f18886 = Collections.EMPTY_LIST;
        c7776.m12797(m12798());
        return c7776;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12797(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.getDefaultInstance()) {
            return;
        }
        if (protoBuf$EnumEntry.hasName()) {
            int name = protoBuf$EnumEntry.getName();
            this.f18885 |= 1;
            this.f18884 = name;
        }
        if (!protoBuf$EnumEntry.annotation_.isEmpty()) {
            if (this.f18886.isEmpty()) {
                this.f18886 = protoBuf$EnumEntry.annotation_;
                this.f18885 &= -3;
            } else {
                if ((this.f18885 & 2) != 2) {
                    this.f18886 = new ArrayList(this.f18886);
                    this.f18885 |= 2;
                }
                this.f18886.addAll(protoBuf$EnumEntry.annotation_);
            }
        }
        m9970(protoBuf$EnumEntry);
        this.f14153 = this.f14153.m9960(protoBuf$EnumEntry.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$EnumEntry m12798() {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
        int i = (this.f18885 & 1) != 1 ? 0 : 1;
        protoBuf$EnumEntry.name_ = this.f18884;
        if ((this.f18885 & 2) == 2) {
            this.f18886 = Collections.unmodifiableList(this.f18886);
            this.f18885 &= -3;
        }
        protoBuf$EnumEntry.annotation_ = this.f18886;
        protoBuf$EnumEntry.bitField0_ = i;
        return protoBuf$EnumEntry;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12797((ProtoBuf$EnumEntry) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = null;
        try {
            try {
                m12797((ProtoBuf$EnumEntry) ProtoBuf$EnumEntry.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$EnumEntry protoBuf$EnumEntry2 = (ProtoBuf$EnumEntry) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$EnumEntry = protoBuf$EnumEntry2;
                    if (protoBuf$EnumEntry != null) {
                        m12797(protoBuf$EnumEntry);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$EnumEntry != null) {
            }
            throw th;
        }
    }
}

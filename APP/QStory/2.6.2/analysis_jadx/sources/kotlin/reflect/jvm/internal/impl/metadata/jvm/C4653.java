package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4653 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f13592;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13593;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f13594;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$StringTableTypes.Record.Operation f13595;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f13596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13598;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        JvmProtoBuf$StringTableTypes.Record recordM9279 = m9279();
        if (recordM9279.isInitialized()) {
            return recordM9279;
        }
        throw new UninitializedMessageException(recordM9279);
    }

    public final Object clone() {
        C4653 c4653 = new C4653();
        c4653.f13598 = 1;
        c4653.f13592 = "";
        c4653.f13595 = JvmProtoBuf$StringTableTypes.Record.Operation.NONE;
        List list = Collections.EMPTY_LIST;
        c4653.f13596 = list;
        c4653.f13594 = list;
        c4653.m9278(m9279());
        return c4653;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9278(JvmProtoBuf$StringTableTypes.Record record) {
        if (record == JvmProtoBuf$StringTableTypes.Record.getDefaultInstance()) {
            return;
        }
        if (record.hasRange()) {
            int range = record.getRange();
            this.f13597 |= 1;
            this.f13598 = range;
        }
        if (record.hasPredefinedIndex()) {
            int predefinedIndex = record.getPredefinedIndex();
            this.f13597 |= 2;
            this.f13593 = predefinedIndex;
        }
        if (record.hasString()) {
            this.f13597 |= 4;
            this.f13592 = record.string_;
        }
        if (record.hasOperation()) {
            JvmProtoBuf$StringTableTypes.Record.Operation operation = record.getOperation();
            operation.getClass();
            this.f13597 |= 8;
            this.f13595 = operation;
        }
        if (!record.substringIndex_.isEmpty()) {
            if (this.f13596.isEmpty()) {
                this.f13596 = record.substringIndex_;
                this.f13597 &= -17;
            } else {
                if ((this.f13597 & 16) != 16) {
                    this.f13596 = new ArrayList(this.f13596);
                    this.f13597 |= 16;
                }
                this.f13596.addAll(record.substringIndex_);
            }
        }
        if (!record.replaceChar_.isEmpty()) {
            if (this.f13594.isEmpty()) {
                this.f13594 = record.replaceChar_;
                this.f13597 &= -33;
            } else {
                if ((this.f13597 & 32) != 32) {
                    this.f13594 = new ArrayList(this.f13594);
                    this.f13597 |= 32;
                }
                this.f13594.addAll(record.replaceChar_);
            }
        }
        this.f13804 = this.f13804.m9411(record.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes.Record m9279() {
        JvmProtoBuf$StringTableTypes.Record record = new JvmProtoBuf$StringTableTypes.Record(this);
        int i = this.f13597;
        int i2 = (i & 1) != 1 ? 0 : 1;
        record.range_ = this.f13598;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        record.predefinedIndex_ = this.f13593;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        record.string_ = this.f13592;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        record.operation_ = this.f13595;
        if ((this.f13597 & 16) == 16) {
            this.f13596 = Collections.unmodifiableList(this.f13596);
            this.f13597 &= -17;
        }
        record.substringIndex_ = this.f13596;
        if ((this.f13597 & 32) == 32) {
            this.f13594 = Collections.unmodifiableList(this.f13594);
            this.f13597 &= -33;
        }
        record.replaceChar_ = this.f13594;
        record.bitField0_ = i2;
        return record;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9278((JvmProtoBuf$StringTableTypes.Record) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716 mo9281(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.Record.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9278(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9278(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.C4653.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

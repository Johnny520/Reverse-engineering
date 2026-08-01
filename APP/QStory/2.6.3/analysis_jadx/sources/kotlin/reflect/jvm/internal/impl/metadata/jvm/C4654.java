package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4654 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f13596;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f13598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$StringTableTypes.Record.Operation f13599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f13600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13601;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13602;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        JvmProtoBuf$StringTableTypes.Record recordM9269 = m9269();
        if (recordM9269.isInitialized()) {
            return recordM9269;
        }
        throw new UninitializedMessageException(recordM9269);
    }

    public final Object clone() {
        C4654 c4654 = new C4654();
        c4654.f13602 = 1;
        c4654.f13596 = "";
        c4654.f13599 = JvmProtoBuf$StringTableTypes.Record.Operation.NONE;
        List list = Collections.EMPTY_LIST;
        c4654.f13600 = list;
        c4654.f13598 = list;
        c4654.m9268(m9269());
        return c4654;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9268(JvmProtoBuf$StringTableTypes.Record record) {
        if (record == JvmProtoBuf$StringTableTypes.Record.getDefaultInstance()) {
            return;
        }
        if (record.hasRange()) {
            int range = record.getRange();
            this.f13601 |= 1;
            this.f13602 = range;
        }
        if (record.hasPredefinedIndex()) {
            int predefinedIndex = record.getPredefinedIndex();
            this.f13601 |= 2;
            this.f13597 = predefinedIndex;
        }
        if (record.hasString()) {
            this.f13601 |= 4;
            this.f13596 = record.string_;
        }
        if (record.hasOperation()) {
            JvmProtoBuf$StringTableTypes.Record.Operation operation = record.getOperation();
            operation.getClass();
            this.f13601 |= 8;
            this.f13599 = operation;
        }
        if (!record.substringIndex_.isEmpty()) {
            if (this.f13600.isEmpty()) {
                this.f13600 = record.substringIndex_;
                this.f13601 &= -17;
            } else {
                if ((this.f13601 & 16) != 16) {
                    this.f13600 = new ArrayList(this.f13600);
                    this.f13601 |= 16;
                }
                this.f13600.addAll(record.substringIndex_);
            }
        }
        if (!record.replaceChar_.isEmpty()) {
            if (this.f13598.isEmpty()) {
                this.f13598 = record.replaceChar_;
                this.f13601 &= -33;
            } else {
                if ((this.f13601 & 32) != 32) {
                    this.f13598 = new ArrayList(this.f13598);
                    this.f13601 |= 32;
                }
                this.f13598.addAll(record.replaceChar_);
            }
        }
        this.f13808 = this.f13808.m9401(record.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes.Record m9269() {
        JvmProtoBuf$StringTableTypes.Record record = new JvmProtoBuf$StringTableTypes.Record(this);
        int i = this.f13601;
        int i2 = (i & 1) != 1 ? 0 : 1;
        record.range_ = this.f13602;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        record.predefinedIndex_ = this.f13597;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        record.string_ = this.f13596;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        record.operation_ = this.f13599;
        if ((this.f13601 & 16) == 16) {
            this.f13600 = Collections.unmodifiableList(this.f13600);
            this.f13601 &= -17;
        }
        record.substringIndex_ = this.f13600;
        if ((this.f13601 & 32) == 32) {
            this.f13598 = Collections.unmodifiableList(this.f13598);
            this.f13601 &= -33;
        }
        record.replaceChar_ = this.f13598;
        record.bitField0_ = i2;
        return record;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9268((JvmProtoBuf$StringTableTypes.Record) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.Record.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9268(r3)
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
            r2.m9268(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.C4654.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}

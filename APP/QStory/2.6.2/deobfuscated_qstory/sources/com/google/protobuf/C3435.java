package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏兰楪哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3435 implements InterfaceC3344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3693 f11092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3709 f11094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3440 f11095;

    public C3435(AbstractC3709 abstractC3709, AbstractC3693 abstractC3693, InterfaceC3440 interfaceC3440) {
        this.f11094 = abstractC3709;
        this.f11093 = abstractC3693.mo7899(interfaceC3440);
        this.f11092 = abstractC3693;
        this.f11095 = interfaceC3440;
    }

    @Override // com.google.protobuf.InterfaceC3344
    public final Object newInstance() {
        InterfaceC3440 interfaceC3440 = this.f11095;
        return interfaceC3440 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) interfaceC3440).newMutableInstance() : interfaceC3440.newBuilderForType().buildPartial();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7404(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.C3545 r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3435.mo7404(java.lang.Object, byte[], int, int, com.google.protobuf.飘花落叶言子楪哲苏兰世):void");
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7405(Object obj, InterfaceC3358 interfaceC3358, C3696 c3696) {
        AbstractC3709 abstractC3709 = this.f11094;
        C3706 c3706Mo7963 = abstractC3709.mo7963(obj);
        AbstractC3693 abstractC3693 = this.f11092;
        C3679 c3679Mo7900 = abstractC3693.mo7900(obj);
        while (interfaceC3358.mo7433() != Integer.MAX_VALUE) {
            try {
                C3435 c3435 = this;
                InterfaceC3358 interfaceC33582 = interfaceC3358;
                C3696 c36962 = c3696;
                if (!c3435.m7582(interfaceC33582, c36962, abstractC3693, c3679Mo7900, abstractC3709, c3706Mo7963)) {
                    break;
                }
                this = c3435;
                interfaceC3358 = interfaceC33582;
                c3696 = c36962;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = c3706Mo7963;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo7406(Object obj) {
        return this.f11092.mo7901(obj).m7931();
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7407(Object obj) {
        ((C3705) this.f11094).getClass();
        C3706 c3706 = ((GeneratedMessageLite) obj).unknownFields;
        if (c3706.f11512) {
            c3706.f11512 = false;
        }
        this.f11092.mo7898(obj);
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7408(Object obj, C3426 c3426) {
        Iterator itM7924 = this.f11092.mo7901(obj).m7924();
        while (itM7924.hasNext()) {
            Map.Entry entry = (Map.Entry) itM7924.next();
            InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
            if (interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE || interfaceC3680.mo7819() || interfaceC3680.isPacked()) {
                C5919.m11250("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof C3387) {
                c3426.m7564(interfaceC3680.getNumber(), ((C3382) ((C3387) entry).f11041.getValue()).m7500());
            } else {
                c3426.m7564(interfaceC3680.getNumber(), entry.getValue());
            }
        }
        ((C3705) this.f11094).getClass();
        C3706 c3706 = ((GeneratedMessageLite) obj).unknownFields;
        c3706.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = c3706.f11516 - 1; i >= 0; i--) {
                c3426.m7564(c3706.f11515[i] >>> 3, c3706.f11514[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < c3706.f11516; i2++) {
            c3426.m7564(c3706.f11515[i2] >>> 3, c3706.f11514[i2]);
        }
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7409(Object obj, Object obj2) {
        AbstractC3340.m7389(this.f11094, obj, obj2);
        if (this.f11093) {
            AbstractC3693 abstractC3693 = this.f11092;
            C3679 c3679Mo7901 = abstractC3693.mo7901(obj2);
            if (c3679Mo7901.f11475.isEmpty()) {
                return;
            }
            abstractC3693.mo7900(obj).m7928(c3679Mo7901);
        }
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7410(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        C3705 c3705 = (C3705) this.f11094;
        c3705.getClass();
        C3706 c3706 = generatedMessageLite.unknownFields;
        c3705.getClass();
        if (!c3706.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f11093) {
            return true;
        }
        AbstractC3693 abstractC3693 = this.f11092;
        return abstractC3693.mo7901(generatedMessageLite).equals(abstractC3693.mo7901(generatedMessageLite2));
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo7411(GeneratedMessageLite generatedMessageLite) {
        ((C3705) this.f11094).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f11093) {
            return iHashCode;
        }
        return this.f11092.mo7901(generatedMessageLite).f11475.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.InterfaceC3344
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo7412(AbstractC3528 abstractC3528) {
        ((C3705) this.f11094).getClass();
        C3706 c3706 = ((GeneratedMessageLite) abstractC3528).unknownFields;
        int i = c3706.f11513;
        if (i == -1) {
            int iM7646 = 0;
            for (int i2 = 0; i2 < c3706.f11516; i2++) {
                iM7646 += AbstractC3461.m7646(3, (ByteString) c3706.f11514[i2]) + AbstractC3461.m7649(2, c3706.f11515[i2] >>> 3) + (AbstractC3461.m7655(1) * 2);
            }
            c3706.f11513 = iM7646;
            i = iM7646;
        }
        return this.f11093 ? this.f11092.mo7901(abstractC3528).m7934() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7582(InterfaceC3358 interfaceC3358, C3696 c3696, AbstractC3693 abstractC3693, C3679 c3679, AbstractC3709 abstractC3709, C3706 c3706) throws InvalidProtocolBufferException {
        int iMo7455 = interfaceC3358.mo7455();
        int iMo7461 = 0;
        InterfaceC3440 interfaceC3440 = this.f11095;
        if (iMo7455 != 11) {
            if ((iMo7455 & 7) != 2) {
                return interfaceC3358.mo7438();
            }
            Object objMo7902 = abstractC3693.mo7902(c3696, interfaceC3440, iMo7455 >>> 3);
            if (objMo7902 == null) {
                return abstractC3709.m7977(0, interfaceC3358, c3706);
            }
            abstractC3693.mo7904(interfaceC3358, objMo7902, c3696, c3679);
            return true;
        }
        Object objMo79022 = null;
        ByteString byteStringMo7441 = null;
        while (interfaceC3358.mo7433() != Integer.MAX_VALUE) {
            int iMo74552 = interfaceC3358.mo7455();
            if (iMo74552 != 16) {
                if (iMo74552 != 26) {
                    if (iMo74552 == 12 || !interfaceC3358.mo7438()) {
                        break;
                    }
                } else if (objMo79022 != null) {
                    abstractC3693.mo7904(interfaceC3358, objMo79022, c3696, c3679);
                } else {
                    byteStringMo7441 = interfaceC3358.mo7441();
                }
            } else {
                iMo7461 = interfaceC3358.mo7461();
                objMo79022 = abstractC3693.mo7902(c3696, interfaceC3440, iMo7461);
            }
        }
        if (interfaceC3358.mo7455() != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringMo7441 != null) {
            if (objMo79022 != null) {
                abstractC3693.mo7906(byteStringMo7441, objMo79022, c3696, c3679);
                return true;
            }
            ((C3705) abstractC3709).getClass();
            c3706.m7965((iMo7461 << 3) | 2, byteStringMo7441);
        }
        return true;
    }
}

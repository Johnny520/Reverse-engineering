package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏兰楪哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3436 implements InterfaceC3345 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3694 f11097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3710 f11099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3441 f11100;

    public C3436(AbstractC3710 abstractC3710, AbstractC3694 abstractC3694, InterfaceC3441 interfaceC3441) {
        this.f11099 = abstractC3710;
        this.f11098 = abstractC3694.mo7886(interfaceC3441);
        this.f11097 = abstractC3694;
        this.f11100 = interfaceC3441;
    }

    @Override // com.google.protobuf.InterfaceC3345
    public final Object newInstance() {
        InterfaceC3441 interfaceC3441 = this.f11100;
        return interfaceC3441 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) interfaceC3441).newMutableInstance() : interfaceC3441.newBuilderForType().buildPartial();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7391(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.C3546 r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3436.mo7391(java.lang.Object, byte[], int, int, com.google.protobuf.飘花落叶言子楪哲苏兰世):void");
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7392(Object obj, InterfaceC3359 interfaceC3359, C3697 c3697) {
        AbstractC3710 abstractC3710 = this.f11099;
        C3707 c3707Mo7950 = abstractC3710.mo7950(obj);
        AbstractC3694 abstractC3694 = this.f11097;
        C3680 c3680Mo7887 = abstractC3694.mo7887(obj);
        while (interfaceC3359.mo7420() != Integer.MAX_VALUE) {
            try {
                C3436 c3436 = this;
                InterfaceC3359 interfaceC33592 = interfaceC3359;
                C3697 c36972 = c3697;
                if (!c3436.m7569(interfaceC33592, c36972, abstractC3694, c3680Mo7887, abstractC3710, c3707Mo7950)) {
                    break;
                }
                this = c3436;
                interfaceC3359 = interfaceC33592;
                c3697 = c36972;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = c3707Mo7950;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo7393(Object obj) {
        return this.f11097.mo7888(obj).m7918();
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7394(Object obj) {
        ((C3706) this.f11099).getClass();
        C3707 c3707 = ((GeneratedMessageLite) obj).unknownFields;
        if (c3707.f11517) {
            c3707.f11517 = false;
        }
        this.f11097.mo7885(obj);
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7395(Object obj, C3427 c3427) {
        Iterator itM7911 = this.f11097.mo7888(obj).m7911();
        while (itM7911.hasNext()) {
            Map.Entry entry = (Map.Entry) itM7911.next();
            InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
            if (interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE || interfaceC3681.mo7806() || interfaceC3681.isPacked()) {
                C5925.m11311("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof C3388) {
                c3427.m7551(interfaceC3681.getNumber(), ((C3383) ((C3388) entry).f11046.getValue()).m7487());
            } else {
                c3427.m7551(interfaceC3681.getNumber(), entry.getValue());
            }
        }
        ((C3706) this.f11099).getClass();
        C3707 c3707 = ((GeneratedMessageLite) obj).unknownFields;
        c3707.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = c3707.f11521 - 1; i >= 0; i--) {
                c3427.m7551(c3707.f11520[i] >>> 3, c3707.f11519[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < c3707.f11521; i2++) {
            c3427.m7551(c3707.f11520[i2] >>> 3, c3707.f11519[i2]);
        }
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7396(Object obj, Object obj2) {
        AbstractC3341.m7376(this.f11099, obj, obj2);
        if (this.f11098) {
            AbstractC3694 abstractC3694 = this.f11097;
            C3680 c3680Mo7888 = abstractC3694.mo7888(obj2);
            if (c3680Mo7888.f11480.isEmpty()) {
                return;
            }
            abstractC3694.mo7887(obj).m7915(c3680Mo7888);
        }
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7397(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        C3706 c3706 = (C3706) this.f11099;
        c3706.getClass();
        C3707 c3707 = generatedMessageLite.unknownFields;
        c3706.getClass();
        if (!c3707.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f11098) {
            return true;
        }
        AbstractC3694 abstractC3694 = this.f11097;
        return abstractC3694.mo7888(generatedMessageLite).equals(abstractC3694.mo7888(generatedMessageLite2));
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo7398(GeneratedMessageLite generatedMessageLite) {
        ((C3706) this.f11099).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f11098) {
            return iHashCode;
        }
        return this.f11097.mo7888(generatedMessageLite).f11480.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.InterfaceC3345
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo7399(AbstractC3529 abstractC3529) {
        ((C3706) this.f11099).getClass();
        C3707 c3707 = ((GeneratedMessageLite) abstractC3529).unknownFields;
        int i = c3707.f11518;
        if (i == -1) {
            int iM7633 = 0;
            for (int i2 = 0; i2 < c3707.f11521; i2++) {
                iM7633 += AbstractC3462.m7633(3, (ByteString) c3707.f11519[i2]) + AbstractC3462.m7636(2, c3707.f11520[i2] >>> 3) + (AbstractC3462.m7642(1) * 2);
            }
            c3707.f11518 = iM7633;
            i = iM7633;
        }
        return this.f11098 ? this.f11097.mo7888(abstractC3529).m7921() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7569(InterfaceC3359 interfaceC3359, C3697 c3697, AbstractC3694 abstractC3694, C3680 c3680, AbstractC3710 abstractC3710, C3707 c3707) throws InvalidProtocolBufferException {
        int iMo7442 = interfaceC3359.mo7442();
        int iMo7448 = 0;
        InterfaceC3441 interfaceC3441 = this.f11100;
        if (iMo7442 != 11) {
            if ((iMo7442 & 7) != 2) {
                return interfaceC3359.mo7425();
            }
            Object objMo7889 = abstractC3694.mo7889(c3697, interfaceC3441, iMo7442 >>> 3);
            if (objMo7889 == null) {
                return abstractC3710.m7964(0, interfaceC3359, c3707);
            }
            abstractC3694.mo7891(interfaceC3359, objMo7889, c3697, c3680);
            return true;
        }
        Object objMo78892 = null;
        ByteString byteStringMo7428 = null;
        while (interfaceC3359.mo7420() != Integer.MAX_VALUE) {
            int iMo74422 = interfaceC3359.mo7442();
            if (iMo74422 != 16) {
                if (iMo74422 != 26) {
                    if (iMo74422 == 12 || !interfaceC3359.mo7425()) {
                        break;
                    }
                } else if (objMo78892 != null) {
                    abstractC3694.mo7891(interfaceC3359, objMo78892, c3697, c3680);
                } else {
                    byteStringMo7428 = interfaceC3359.mo7428();
                }
            } else {
                iMo7448 = interfaceC3359.mo7448();
                objMo78892 = abstractC3694.mo7889(c3697, interfaceC3441, iMo7448);
            }
        }
        if (interfaceC3359.mo7442() != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringMo7428 != null) {
            if (objMo78892 != null) {
                abstractC3694.mo7893(byteStringMo7428, objMo78892, c3697, c3680);
                return true;
            }
            ((C3706) abstractC3710).getClass();
            c3707.m7952((iMo7448 << 3) | 2, byteStringMo7428);
        }
        return true;
    }
}

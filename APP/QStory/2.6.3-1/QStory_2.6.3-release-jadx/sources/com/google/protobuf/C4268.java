package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏兰楪哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4268 implements InterfaceC4177 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4526 f11442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4542 f11444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4273 f11445;

    public C4268(AbstractC4542 abstractC4542, AbstractC4526 abstractC4526, InterfaceC4273 interfaceC4273) {
        this.f11444 = abstractC4542;
        this.f11443 = abstractC4526.mo8445(interfaceC4273);
        this.f11442 = abstractC4526;
        this.f11445 = interfaceC4273;
    }

    @Override // com.google.protobuf.InterfaceC4177
    public final Object newInstance() {
        InterfaceC4273 interfaceC4273 = this.f11445;
        return interfaceC4273 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) interfaceC4273).newMutableInstance() : interfaceC4273.newBuilderForType().buildPartial();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7950(Object obj, byte[] bArr, int i, int i2, C4378 c4378) throws InvalidProtocolBufferException {
        C4268 c4268 = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C4539 c4539 = generatedMessageLite.unknownFields;
        if (c4539 == C4539.f11861) {
            c4539 = new C4539();
            generatedMessageLite.unknownFields = c4539;
        }
        C4539 c45392 = c4539;
        C4512 c4512EnsureExtensionsAreMutable = ((GeneratedMessageLite.AbstractC4138) obj).ensureExtensionsAreMutable();
        int iM8330 = i;
        C4435 c4435 = null;
        while (iM8330 < i2) {
            C4435 c44352 = c4435;
            int iM8336 = AbstractC4375.m8336(bArr, iM8330, c4378);
            int i3 = c4378.f11541;
            C4529 c4529 = c4378.f11538;
            InterfaceC4273 interfaceC4273 = c4268.f11445;
            AbstractC4526 abstractC4526 = c4268.f11442;
            int i4 = 2;
            if (i3 == 11) {
                int i5 = 0;
                ByteString byteString = null;
                while (iM8336 < i2) {
                    iM8336 = AbstractC4375.m8336(bArr, iM8336, c4378);
                    int i6 = c4378.f11541;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == i4) {
                        if (i8 == 0) {
                            iM8336 = AbstractC4375.m8336(bArr, iM8336, c4378);
                            i5 = c4378.f11541;
                            c44352 = (C4435) abstractC4526.mo8448(c4529, interfaceC4273, i5);
                        }
                        i4 = 2;
                    } else if (i7 == 3) {
                        if (c44352 != null) {
                            iM8336 = AbstractC4375.m8323(C4204.f11363.m8039(c44352.f11588.getClass()), bArr, iM8336, i2, c4378);
                            c4512EnsureExtensionsAreMutable.m8472(c44352.f11587, c4378.f11539);
                        } else if (i8 == 2) {
                            iM8336 = AbstractC4375.m8327(bArr, iM8336, c4378);
                            byteString = (ByteString) c4378.f11539;
                        } else if (i6 == 12) {
                            break;
                        } else {
                            iM8336 = AbstractC4375.m8330(i6, bArr, iM8336, i2, c4378);
                        }
                        i4 = 2;
                    }
                }
                if (byteString != null) {
                    c45392.m8511((i5 << 3) | 2, byteString);
                }
                c4268 = this;
                iM8330 = iM8336;
            } else if ((i3 & 7) == 2) {
                c44352 = (C4435) abstractC4526.mo8448(c4529, interfaceC4273, i3 >>> 3);
                if (c44352 != null) {
                    iM8330 = AbstractC4375.m8323(C4204.f11363.m8039(c44352.f11588.getClass()), bArr, iM8336, i2, c4378);
                    c4512EnsureExtensionsAreMutable.m8472(c44352.f11587, c4378.f11539);
                } else {
                    iM8330 = AbstractC4375.m8338(i3, bArr, iM8336, i2, c45392, c4378);
                }
            } else {
                iM8330 = AbstractC4375.m8330(i3, bArr, iM8336, i2, c4378);
            }
            c4435 = c44352;
        }
        if (iM8330 != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7951(Object obj, InterfaceC4191 interfaceC4191, C4529 c4529) {
        AbstractC4542 abstractC4542 = this.f11444;
        C4539 c4539Mo8509 = abstractC4542.mo8509(obj);
        AbstractC4526 abstractC4526 = this.f11442;
        C4512 c4512Mo8446 = abstractC4526.mo8446(obj);
        while (interfaceC4191.mo7979() != Integer.MAX_VALUE) {
            try {
                C4268 c4268 = this;
                InterfaceC4191 interfaceC41912 = interfaceC4191;
                C4529 c45292 = c4529;
                if (!c4268.m8128(interfaceC41912, c45292, abstractC4526, c4512Mo8446, abstractC4542, c4539Mo8509)) {
                    break;
                }
                this = c4268;
                interfaceC4191 = interfaceC41912;
                c4529 = c45292;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = c4539Mo8509;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo7952(Object obj) {
        return this.f11442.mo8447(obj).m8477();
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7953(Object obj) {
        ((C4538) this.f11444).getClass();
        C4539 c4539 = ((GeneratedMessageLite) obj).unknownFields;
        if (c4539.f11862) {
            c4539.f11862 = false;
        }
        this.f11442.mo8444(obj);
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7954(Object obj, C4259 c4259) {
        Iterator itM8470 = this.f11442.mo8447(obj).m8470();
        while (itM8470.hasNext()) {
            Map.Entry entry = (Map.Entry) itM8470.next();
            InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
            if (interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE || interfaceC4513.mo8365() || interfaceC4513.isPacked()) {
                C6755.m11870("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof C4220) {
                c4259.m8110(interfaceC4513.getNumber(), ((C4215) ((C4220) entry).f11391.getValue()).m8046());
            } else {
                c4259.m8110(interfaceC4513.getNumber(), entry.getValue());
            }
        }
        ((C4538) this.f11444).getClass();
        C4539 c4539 = ((GeneratedMessageLite) obj).unknownFields;
        c4539.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = c4539.f11866 - 1; i >= 0; i--) {
                c4259.m8110(c4539.f11865[i] >>> 3, c4539.f11864[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < c4539.f11866; i2++) {
            c4259.m8110(c4539.f11865[i2] >>> 3, c4539.f11864[i2]);
        }
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7955(Object obj, Object obj2) {
        AbstractC4173.m7935(this.f11444, obj, obj2);
        if (this.f11443) {
            AbstractC4526 abstractC4526 = this.f11442;
            C4512 c4512Mo8447 = abstractC4526.mo8447(obj2);
            if (c4512Mo8447.f11825.isEmpty()) {
                return;
            }
            abstractC4526.mo8446(obj).m8474(c4512Mo8447);
        }
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7956(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        C4538 c4538 = (C4538) this.f11444;
        c4538.getClass();
        C4539 c4539 = generatedMessageLite.unknownFields;
        c4538.getClass();
        if (!c4539.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f11443) {
            return true;
        }
        AbstractC4526 abstractC4526 = this.f11442;
        return abstractC4526.mo8447(generatedMessageLite).equals(abstractC4526.mo8447(generatedMessageLite2));
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo7957(GeneratedMessageLite generatedMessageLite) {
        ((C4538) this.f11444).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f11443) {
            return iHashCode;
        }
        return this.f11442.mo8447(generatedMessageLite).f11825.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo7958(AbstractC4361 abstractC4361) {
        ((C4538) this.f11444).getClass();
        C4539 c4539 = ((GeneratedMessageLite) abstractC4361).unknownFields;
        int i = c4539.f11863;
        if (i == -1) {
            int iM8192 = 0;
            for (int i2 = 0; i2 < c4539.f11866; i2++) {
                iM8192 += AbstractC4294.m8192(3, (ByteString) c4539.f11864[i2]) + AbstractC4294.m8195(2, c4539.f11865[i2] >>> 3) + (AbstractC4294.m8201(1) * 2);
            }
            c4539.f11863 = iM8192;
            i = iM8192;
        }
        return this.f11443 ? this.f11442.mo8447(abstractC4361).m8480() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m8128(InterfaceC4191 interfaceC4191, C4529 c4529, AbstractC4526 abstractC4526, C4512 c4512, AbstractC4542 abstractC4542, C4539 c4539) throws InvalidProtocolBufferException {
        int iMo8001 = interfaceC4191.mo8001();
        int iMo8007 = 0;
        InterfaceC4273 interfaceC4273 = this.f11445;
        if (iMo8001 != 11) {
            if ((iMo8001 & 7) != 2) {
                return interfaceC4191.mo7984();
            }
            Object objMo8448 = abstractC4526.mo8448(c4529, interfaceC4273, iMo8001 >>> 3);
            if (objMo8448 == null) {
                return abstractC4542.m8523(0, interfaceC4191, c4539);
            }
            abstractC4526.mo8450(interfaceC4191, objMo8448, c4529, c4512);
            return true;
        }
        Object objMo84482 = null;
        ByteString byteStringMo7987 = null;
        while (interfaceC4191.mo7979() != Integer.MAX_VALUE) {
            int iMo80012 = interfaceC4191.mo8001();
            if (iMo80012 != 16) {
                if (iMo80012 != 26) {
                    if (iMo80012 == 12 || !interfaceC4191.mo7984()) {
                        break;
                    }
                } else if (objMo84482 != null) {
                    abstractC4526.mo8450(interfaceC4191, objMo84482, c4529, c4512);
                } else {
                    byteStringMo7987 = interfaceC4191.mo7987();
                }
            } else {
                iMo8007 = interfaceC4191.mo8007();
                objMo84482 = abstractC4526.mo8448(c4529, interfaceC4273, iMo8007);
            }
        }
        if (interfaceC4191.mo8001() != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringMo7987 != null) {
            if (objMo84482 != null) {
                abstractC4526.mo8452(byteStringMo7987, objMo84482, c4529, c4512);
                return true;
            }
            ((C4538) abstractC4542).getClass();
            c4539.m8511((iMo8007 << 3) | 2, byteStringMo7987);
        }
        return true;
    }
}

package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p144.C7546;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏兰子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3426 implements InterfaceC3434, InterfaceC3727, InterfaceC3647, InterfaceC3624 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3604 f11083 = new C3604(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11084;

    public C3426(int i) {
        InterfaceC3450 interfaceC3450;
        switch (i) {
            case 2:
                this.f11084 = new ArrayDeque();
                break;
            default:
                Class cls = AbstractC3546.f11193;
                try {
                    int i2 = AbstractC3462.f11126;
                    interfaceC3450 = (InterfaceC3450) AbstractC3462.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC3450 = f11083;
                }
                InterfaceC3450[] interfaceC3450Arr = {C3604.f11242, interfaceC3450};
                C3427 c3427 = new C3427();
                c3427.f11085 = interfaceC3450Arr;
                Charset charset = AbstractC3401.f11054;
                this.f11084 = c3427;
                break;
        }
    }

    @Override // com.google.protobuf.InterfaceC3434
    public InterfaceC3434 addRepeatedField(C3656 c3656, Object obj) {
        ((C3684) this.f11084).m7949(c3656, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3647
    public C3656 getDescriptor() {
        return (C3656) this.f11084;
    }

    @Override // com.google.protobuf.InterfaceC3434
    public boolean hasField(C3656 c3656) {
        return ((C3684) this.f11084).m7958(c3656);
    }

    @Override // com.google.protobuf.InterfaceC3434
    public InterfaceC3434 setField(C3656 c3656, Object obj) {
        ((C3684) this.f11084).m7951(c3656, obj);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m7550(int i, long j) {
        ((AbstractC3461) this.f11084).mo7661(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m7551(int i, int i2) {
        ((AbstractC3461) this.f11084).mo7659(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m7552(int i, long j) {
        ((AbstractC3461) this.f11084).mo7661(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m7553(int i, int i2) {
        ((AbstractC3461) this.f11084).mo7659(i, (i2 >> 31) ^ (i2 << 1));
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo7554(AbstractC3473 abstractC3473, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3449 builder;
        C3684 c3684 = (C3684) this.f11084;
        if (c3656.mo7819()) {
            InterfaceC3453 interfaceC3453NewBuilderForType = interfaceC3452.newBuilderForType();
            abstractC3473.mo7729(interfaceC3453NewBuilderForType, c3696);
            addRepeatedField(c3656, interfaceC3453NewBuilderForType.buildPartial());
        } else if (!c3684.m7958(c3656)) {
            InterfaceC3453 interfaceC3453NewBuilderForType2 = interfaceC3452.newBuilderForType();
            abstractC3473.mo7729(interfaceC3453NewBuilderForType2, c3696);
            setField(c3656, interfaceC3453NewBuilderForType2);
        } else {
            Object objM7954 = c3684.m7954(c3656);
            if (objM7954 instanceof InterfaceC3449) {
                builder = (InterfaceC3449) objM7954;
            } else {
                builder = ((InterfaceC3440) objM7954).toBuilder();
                c3684.m7951(c3656, builder);
            }
            abstractC3473.mo7729(builder, c3696);
        }
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC3452 mo7555(ByteString byteString, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3452 interfaceC34522;
        InterfaceC3453 interfaceC3453NewBuilderForType = interfaceC3452.newBuilderForType();
        if (!c3656.mo7819() && (interfaceC34522 = (InterfaceC3452) ((C3684) this.f11084).m7944(c3656)) != null) {
            interfaceC3453NewBuilderForType.mergeFrom(interfaceC34522);
        }
        interfaceC3453NewBuilderForType.mergeFrom(byteString, c3696);
        return interfaceC3453NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public WireFormat$Utf8Validation mo7556(C3656 c3656) {
        return c3656.m7865() ? WireFormat$Utf8Validation.STRICT : WireFormat$Utf8Validation.LOOSE;
    }

    @Override // com.google.protobuf.InterfaceC3531
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo7395() {
        ((InterfaceC3531) this.f11084).mo7395();
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public MessageReflection$MergeTarget$ContainerType mo7557() {
        return MessageReflection$MergeTarget$ContainerType.EXTENSION_SET;
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3577 mo7558(C3692 c3692, C3662 c3662, int i) {
        return (C3577) c3692.f11488.get(new C3576(c3662, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m7559(int i, List list, boolean z) {
        boolean z2 = list instanceof C3429;
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7661(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7651 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7651 += AbstractC3461.m7651(((Long) list.get(i3)).longValue());
            }
            abstractC3461.mo7658(iM7651);
            while (i2 < list.size()) {
                abstractC3461.mo7660(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3429 c3429 = (C3429) list;
        if (!z) {
            while (i2 < c3429.f11090) {
                abstractC3461.mo7661(i, c3429.m7581(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76512 = 0;
        for (int i4 = 0; i4 < c3429.f11090; i4++) {
            iM76512 += AbstractC3461.m7651(c3429.m7581(i4));
        }
        abstractC3461.mo7658(iM76512);
        while (i2 < c3429.f11090) {
            abstractC3461.mo7660(c3429.m7581(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m7560(int i, long j) {
        ((AbstractC3461) this.f11084).mo7661(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m7561(int i, int i2) {
        ((AbstractC3461) this.f11084).mo7678(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m7562(int i, long j) {
        ((AbstractC3461) this.f11084).mo7666(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m7563(int i, Object obj, InterfaceC3344 interfaceC3344) {
        AbstractC3528 abstractC3528 = (AbstractC3528) obj;
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        abstractC3461.mo7668(i, 2);
        abstractC3461.mo7658(abstractC3528.getSerializedSize(interfaceC3344));
        interfaceC3344.mo7408(abstractC3528, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m7564(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        if (z) {
            abstractC3461.mo7671(i, (ByteString) obj);
        } else {
            abstractC3461.mo7672(i, (InterfaceC3440) obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m7565(int i, long j) {
        ((AbstractC3461) this.f11084).mo7666(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m7566(int i, List list, boolean z) {
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7678(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 4;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7667(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                abstractC3461.mo7678(i, c3612.m7827(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3612.f11247; i6++) {
            c3612.m7827(i6);
            boolean z4 = AbstractC3461.f11124;
            i5 += 4;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3612.f11247) {
            abstractC3461.mo7667(c3612.m7827(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m7567(int i, Object obj, InterfaceC3344 interfaceC3344) {
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        abstractC3461.mo7668(i, 3);
        interfaceC3344.mo7408((AbstractC3528) obj, this);
        abstractC3461.mo7668(i, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m7568(int i, int i2) {
        ((AbstractC3461) this.f11084).mo7664(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m7569(int i, List list, boolean z) {
        boolean z2 = list instanceof C3429;
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7666(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 8;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7665(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3429 c3429 = (C3429) list;
        if (!z) {
            while (i2 < c3429.f11090) {
                abstractC3461.mo7666(i, c3429.m7581(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3429.f11090; i6++) {
            c3429.m7581(i6);
            boolean z4 = AbstractC3461.f11124;
            i5 += 8;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3429.f11090) {
            abstractC3461.mo7665(c3429.m7581(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m7570(float f, int i) {
        AbstractC3461 abstractC3461 = (AbstractC3461) this.f11084;
        abstractC3461.getClass();
        abstractC3461.mo7678(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m7571(ByteString byteString) {
        C3363 c3363;
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof RopeByteString)) {
                C7546.m12735(byteString.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            m7571(ropeByteString.left);
            m7571(ropeByteString.right);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iMinLength = RopeByteString.minLength(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f11084;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength) {
            arrayDeque.push(byteString);
            return;
        }
        int iMinLength2 = RopeByteString.minLength(iBinarySearch);
        ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
        while (true) {
            c3363 = null;
            if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength2) {
                break;
            } else {
                ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2, c3363);
            }
        }
        RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString, c3363);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, ropeByteString3.size());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= RopeByteString.minLength(iBinarySearch2 + 1)) {
                break;
            } else {
                ropeByteString3 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString3, c3363);
            }
        }
        arrayDeque.push(ropeByteString3);
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo7572(AbstractC3473 abstractC3473, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3449 builder;
        C3684 c3684 = (C3684) this.f11084;
        boolean zMo7819 = c3656.mo7819();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
        if (zMo7819) {
            InterfaceC3453 interfaceC3453NewBuilderForType = interfaceC3452.newBuilderForType();
            abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3453NewBuilderForType, c3696);
            addRepeatedField(c3656, interfaceC3453NewBuilderForType.buildPartial());
        } else if (!c3684.m7958(c3656)) {
            InterfaceC3453 interfaceC3453NewBuilderForType2 = interfaceC3452.newBuilderForType();
            abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3453NewBuilderForType2, c3696);
            setField(c3656, interfaceC3453NewBuilderForType2);
        } else {
            Object objM7954 = c3684.m7954(c3656);
            if (objM7954 instanceof InterfaceC3449) {
                builder = (InterfaceC3449) objM7954;
            } else {
                builder = ((InterfaceC3440) objM7954).toBuilder();
                c3684.m7951(c3656, builder);
            }
            abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), builder, c3696);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m7573(int i, double d) {
        ((AbstractC3461) this.f11084).m7677(i, d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m7574(int i, int i2) {
        ((AbstractC3461) this.f11084).mo7678(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m7575(int i, boolean z) {
        ((AbstractC3461) this.f11084).mo7676(i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m7576(int i, ByteString byteString) {
        ((AbstractC3461) this.f11084).mo7679(i, byteString);
    }

    public C3426(AbstractC3461 abstractC3461) {
        AbstractC3401.m7518(abstractC3461, "output");
        this.f11084 = abstractC3461;
        abstractC3461.f11125 = this;
    }

    public /* synthetic */ C3426(Object obj) {
        this.f11084 = obj;
    }
}

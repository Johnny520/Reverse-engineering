package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p160.C8376;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏兰子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4259 implements InterfaceC4267, InterfaceC4560, InterfaceC4480, InterfaceC4457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4437 f11433 = new C4437(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11434;

    public C4259(int i) {
        InterfaceC4283 interfaceC4283;
        switch (i) {
            case 2:
                this.f11434 = new ArrayDeque();
                break;
            default:
                Class cls = AbstractC4379.f11543;
                try {
                    int i2 = AbstractC4295.f11476;
                    interfaceC4283 = (InterfaceC4283) AbstractC4295.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC4283 = f11433;
                }
                InterfaceC4283[] interfaceC4283Arr = {C4437.f11592, interfaceC4283};
                C4260 c4260 = new C4260();
                c4260.f11435 = interfaceC4283Arr;
                Charset charset = AbstractC4234.f11404;
                this.f11434 = c4260;
                break;
        }
    }

    @Override // com.google.protobuf.InterfaceC4267
    public InterfaceC4267 addRepeatedField(C4489 c4489, Object obj) {
        ((C4517) this.f11434).m8495(c4489, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC4480
    public C4489 getDescriptor() {
        return (C4489) this.f11434;
    }

    @Override // com.google.protobuf.InterfaceC4267
    public boolean hasField(C4489 c4489) {
        return ((C4517) this.f11434).m8504(c4489);
    }

    @Override // com.google.protobuf.InterfaceC4267
    public InterfaceC4267 setField(C4489 c4489, Object obj) {
        ((C4517) this.f11434).m8497(c4489, obj);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m8096(int i, long j) {
        ((AbstractC4294) this.f11434).mo8207(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m8097(int i, int i2) {
        ((AbstractC4294) this.f11434).mo8205(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m8098(int i, long j) {
        ((AbstractC4294) this.f11434).mo8207(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m8099(int i, int i2) {
        ((AbstractC4294) this.f11434).mo8205(i, (i2 >> 31) ^ (i2 << 1));
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo8100(AbstractC4306 abstractC4306, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4282 builder;
        C4517 c4517 = (C4517) this.f11434;
        if (c4489.mo8365()) {
            InterfaceC4286 interfaceC4286NewBuilderForType = interfaceC4285.newBuilderForType();
            abstractC4306.mo8275(interfaceC4286NewBuilderForType, c4529);
            addRepeatedField(c4489, interfaceC4286NewBuilderForType.buildPartial());
        } else if (!c4517.m8504(c4489)) {
            InterfaceC4286 interfaceC4286NewBuilderForType2 = interfaceC4285.newBuilderForType();
            abstractC4306.mo8275(interfaceC4286NewBuilderForType2, c4529);
            setField(c4489, interfaceC4286NewBuilderForType2);
        } else {
            Object objM8500 = c4517.m8500(c4489);
            if (objM8500 instanceof InterfaceC4282) {
                builder = (InterfaceC4282) objM8500;
            } else {
                builder = ((InterfaceC4273) objM8500).toBuilder();
                c4517.m8497(c4489, builder);
            }
            abstractC4306.mo8275(builder, c4529);
        }
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC4285 mo8101(ByteString byteString, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4285 interfaceC42852;
        InterfaceC4286 interfaceC4286NewBuilderForType = interfaceC4285.newBuilderForType();
        if (!c4489.mo8365() && (interfaceC42852 = (InterfaceC4285) ((C4517) this.f11434).m8490(c4489)) != null) {
            interfaceC4286NewBuilderForType.mergeFrom(interfaceC42852);
        }
        interfaceC4286NewBuilderForType.mergeFrom(byteString, c4529);
        return interfaceC4286NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public WireFormat$Utf8Validation mo8102(C4489 c4489) {
        return c4489.m8411() ? WireFormat$Utf8Validation.STRICT : WireFormat$Utf8Validation.LOOSE;
    }

    @Override // com.google.protobuf.InterfaceC4364
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo7941() {
        ((InterfaceC4364) this.f11434).mo7941();
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public MessageReflection$MergeTarget$ContainerType mo8103() {
        return MessageReflection$MergeTarget$ContainerType.EXTENSION_SET;
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4410 mo8104(C4525 c4525, C4495 c4495, int i) {
        return (C4410) c4525.f11838.get(new C4409(c4495, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m8105(int i, List list, boolean z) {
        boolean z2 = list instanceof C4262;
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8207(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8197 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8197 += AbstractC4294.m8197(((Long) list.get(i3)).longValue());
            }
            abstractC4294.mo8204(iM8197);
            while (i2 < list.size()) {
                abstractC4294.mo8206(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4262 c4262 = (C4262) list;
        if (!z) {
            while (i2 < c4262.f11440) {
                abstractC4294.mo8207(i, c4262.m8127(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM81972 = 0;
        for (int i4 = 0; i4 < c4262.f11440; i4++) {
            iM81972 += AbstractC4294.m8197(c4262.m8127(i4));
        }
        abstractC4294.mo8204(iM81972);
        while (i2 < c4262.f11440) {
            abstractC4294.mo8206(c4262.m8127(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m8106(int i, long j) {
        ((AbstractC4294) this.f11434).mo8207(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m8107(int i, int i2) {
        ((AbstractC4294) this.f11434).mo8224(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m8108(int i, long j) {
        ((AbstractC4294) this.f11434).mo8212(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m8109(int i, Object obj, InterfaceC4177 interfaceC4177) {
        AbstractC4361 abstractC4361 = (AbstractC4361) obj;
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        abstractC4294.mo8214(i, 2);
        abstractC4294.mo8204(abstractC4361.getSerializedSize(interfaceC4177));
        interfaceC4177.mo7954(abstractC4361, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m8110(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        if (z) {
            abstractC4294.mo8217(i, (ByteString) obj);
        } else {
            abstractC4294.mo8218(i, (InterfaceC4273) obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m8111(int i, long j) {
        ((AbstractC4294) this.f11434).mo8212(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m8112(int i, List list, boolean z) {
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8224(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 4;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8213(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                abstractC4294.mo8224(i, c4445.m8373(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4445.f11597; i6++) {
            c4445.m8373(i6);
            boolean z4 = AbstractC4294.f11474;
            i5 += 4;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4445.f11597) {
            abstractC4294.mo8213(c4445.m8373(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m8113(int i, Object obj, InterfaceC4177 interfaceC4177) {
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        abstractC4294.mo8214(i, 3);
        interfaceC4177.mo7954((AbstractC4361) obj, this);
        abstractC4294.mo8214(i, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m8114(int i, int i2) {
        ((AbstractC4294) this.f11434).mo8210(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m8115(int i, List list, boolean z) {
        boolean z2 = list instanceof C4262;
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8212(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 8;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8211(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4262 c4262 = (C4262) list;
        if (!z) {
            while (i2 < c4262.f11440) {
                abstractC4294.mo8212(i, c4262.m8127(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4262.f11440; i6++) {
            c4262.m8127(i6);
            boolean z4 = AbstractC4294.f11474;
            i5 += 8;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4262.f11440) {
            abstractC4294.mo8211(c4262.m8127(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m8116(float f, int i) {
        AbstractC4294 abstractC4294 = (AbstractC4294) this.f11434;
        abstractC4294.getClass();
        abstractC4294.mo8224(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m8117(ByteString byteString) {
        C4196 c4196;
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof RopeByteString)) {
                C8376.m13323(byteString.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            m8117(ropeByteString.left);
            m8117(ropeByteString.right);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iMinLength = RopeByteString.minLength(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f11434;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength) {
            arrayDeque.push(byteString);
            return;
        }
        int iMinLength2 = RopeByteString.minLength(iBinarySearch);
        ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
        while (true) {
            c4196 = null;
            if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength2) {
                break;
            } else {
                ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2, c4196);
            }
        }
        RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString, c4196);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, ropeByteString3.size());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= RopeByteString.minLength(iBinarySearch2 + 1)) {
                break;
            } else {
                ropeByteString3 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString3, c4196);
            }
        }
        arrayDeque.push(ropeByteString3);
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo8118(AbstractC4306 abstractC4306, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4282 builder;
        C4517 c4517 = (C4517) this.f11434;
        boolean zMo8365 = c4489.mo8365();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        if (zMo8365) {
            InterfaceC4286 interfaceC4286NewBuilderForType = interfaceC4285.newBuilderForType();
            abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC4286NewBuilderForType, c4529);
            addRepeatedField(c4489, interfaceC4286NewBuilderForType.buildPartial());
        } else if (!c4517.m8504(c4489)) {
            InterfaceC4286 interfaceC4286NewBuilderForType2 = interfaceC4285.newBuilderForType();
            abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC4286NewBuilderForType2, c4529);
            setField(c4489, interfaceC4286NewBuilderForType2);
        } else {
            Object objM8500 = c4517.m8500(c4489);
            if (objM8500 instanceof InterfaceC4282) {
                builder = (InterfaceC4282) objM8500;
            } else {
                builder = ((InterfaceC4273) objM8500).toBuilder();
                c4517.m8497(c4489, builder);
            }
            abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), builder, c4529);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m8119(int i, double d) {
        ((AbstractC4294) this.f11434).m8223(i, d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m8120(int i, int i2) {
        ((AbstractC4294) this.f11434).mo8224(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m8121(int i, boolean z) {
        ((AbstractC4294) this.f11434).mo8222(i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m8122(int i, ByteString byteString) {
        ((AbstractC4294) this.f11434).mo8225(i, byteString);
    }

    public C4259(AbstractC4294 abstractC4294) {
        AbstractC4234.m8064(abstractC4294, "output");
        this.f11434 = abstractC4294;
        abstractC4294.f11475 = this;
    }

    public /* synthetic */ C4259(Object obj) {
        this.f11434 = obj;
    }
}

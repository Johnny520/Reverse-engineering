package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p144.C7547;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏兰子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3427 implements InterfaceC3435, InterfaceC3728, InterfaceC3648, InterfaceC3625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3605 f11088 = new C3605(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11089;

    public C3427(int i) {
        InterfaceC3451 interfaceC3451;
        switch (i) {
            case 2:
                this.f11089 = new ArrayDeque();
                break;
            default:
                Class cls = AbstractC3547.f11198;
                try {
                    int i2 = AbstractC3463.f11131;
                    interfaceC3451 = (InterfaceC3451) AbstractC3463.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC3451 = f11088;
                }
                InterfaceC3451[] interfaceC3451Arr = {C3605.f11247, interfaceC3451};
                C3428 c3428 = new C3428();
                c3428.f11090 = interfaceC3451Arr;
                Charset charset = AbstractC3402.f11059;
                this.f11089 = c3428;
                break;
        }
    }

    @Override // com.google.protobuf.InterfaceC3435
    public InterfaceC3435 addRepeatedField(C3657 c3657, Object obj) {
        ((C3685) this.f11089).m7936(c3657, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3648
    public C3657 getDescriptor() {
        return (C3657) this.f11089;
    }

    @Override // com.google.protobuf.InterfaceC3435
    public boolean hasField(C3657 c3657) {
        return ((C3685) this.f11089).m7945(c3657);
    }

    @Override // com.google.protobuf.InterfaceC3435
    public InterfaceC3435 setField(C3657 c3657, Object obj) {
        ((C3685) this.f11089).m7938(c3657, obj);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m7537(int i, long j) {
        ((AbstractC3462) this.f11089).mo7648(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m7538(int i, int i2) {
        ((AbstractC3462) this.f11089).mo7646(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m7539(int i, long j) {
        ((AbstractC3462) this.f11089).mo7648(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m7540(int i, int i2) {
        ((AbstractC3462) this.f11089).mo7646(i, (i2 >> 31) ^ (i2 << 1));
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo7541(AbstractC3474 abstractC3474, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3450 builder;
        C3685 c3685 = (C3685) this.f11089;
        if (c3657.mo7806()) {
            InterfaceC3454 interfaceC3454NewBuilderForType = interfaceC3453.newBuilderForType();
            abstractC3474.mo7716(interfaceC3454NewBuilderForType, c3697);
            addRepeatedField(c3657, interfaceC3454NewBuilderForType.buildPartial());
        } else if (!c3685.m7945(c3657)) {
            InterfaceC3454 interfaceC3454NewBuilderForType2 = interfaceC3453.newBuilderForType();
            abstractC3474.mo7716(interfaceC3454NewBuilderForType2, c3697);
            setField(c3657, interfaceC3454NewBuilderForType2);
        } else {
            Object objM7941 = c3685.m7941(c3657);
            if (objM7941 instanceof InterfaceC3450) {
                builder = (InterfaceC3450) objM7941;
            } else {
                builder = ((InterfaceC3441) objM7941).toBuilder();
                c3685.m7938(c3657, builder);
            }
            abstractC3474.mo7716(builder, c3697);
        }
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC3453 mo7542(ByteString byteString, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3453 interfaceC34532;
        InterfaceC3454 interfaceC3454NewBuilderForType = interfaceC3453.newBuilderForType();
        if (!c3657.mo7806() && (interfaceC34532 = (InterfaceC3453) ((C3685) this.f11089).m7931(c3657)) != null) {
            interfaceC3454NewBuilderForType.mergeFrom(interfaceC34532);
        }
        interfaceC3454NewBuilderForType.mergeFrom(byteString, c3697);
        return interfaceC3454NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public WireFormat$Utf8Validation mo7543(C3657 c3657) {
        return c3657.m7852() ? WireFormat$Utf8Validation.STRICT : WireFormat$Utf8Validation.LOOSE;
    }

    @Override // com.google.protobuf.InterfaceC3532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo7382() {
        ((InterfaceC3532) this.f11089).mo7382();
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public MessageReflection$MergeTarget$ContainerType mo7544() {
        return MessageReflection$MergeTarget$ContainerType.EXTENSION_SET;
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3578 mo7545(C3693 c3693, C3663 c3663, int i) {
        return (C3578) c3693.f11493.get(new C3577(c3663, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m7546(int i, List list, boolean z) {
        boolean z2 = list instanceof C3430;
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7648(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7638 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7638 += AbstractC3462.m7638(((Long) list.get(i3)).longValue());
            }
            abstractC3462.mo7645(iM7638);
            while (i2 < list.size()) {
                abstractC3462.mo7647(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3430 c3430 = (C3430) list;
        if (!z) {
            while (i2 < c3430.f11095) {
                abstractC3462.mo7648(i, c3430.m7568(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76382 = 0;
        for (int i4 = 0; i4 < c3430.f11095; i4++) {
            iM76382 += AbstractC3462.m7638(c3430.m7568(i4));
        }
        abstractC3462.mo7645(iM76382);
        while (i2 < c3430.f11095) {
            abstractC3462.mo7647(c3430.m7568(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m7547(int i, long j) {
        ((AbstractC3462) this.f11089).mo7648(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m7548(int i, int i2) {
        ((AbstractC3462) this.f11089).mo7665(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m7549(int i, long j) {
        ((AbstractC3462) this.f11089).mo7653(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m7550(int i, Object obj, InterfaceC3345 interfaceC3345) {
        AbstractC3529 abstractC3529 = (AbstractC3529) obj;
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        abstractC3462.mo7655(i, 2);
        abstractC3462.mo7645(abstractC3529.getSerializedSize(interfaceC3345));
        interfaceC3345.mo7395(abstractC3529, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m7551(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        if (z) {
            abstractC3462.mo7658(i, (ByteString) obj);
        } else {
            abstractC3462.mo7659(i, (InterfaceC3441) obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m7552(int i, long j) {
        ((AbstractC3462) this.f11089).mo7653(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m7553(int i, List list, boolean z) {
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7665(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 4;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7654(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                abstractC3462.mo7665(i, c3613.m7814(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3613.f11252; i6++) {
            c3613.m7814(i6);
            boolean z4 = AbstractC3462.f11129;
            i5 += 4;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3613.f11252) {
            abstractC3462.mo7654(c3613.m7814(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m7554(int i, Object obj, InterfaceC3345 interfaceC3345) {
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        abstractC3462.mo7655(i, 3);
        interfaceC3345.mo7395((AbstractC3529) obj, this);
        abstractC3462.mo7655(i, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m7555(int i, int i2) {
        ((AbstractC3462) this.f11089).mo7651(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m7556(int i, List list, boolean z) {
        boolean z2 = list instanceof C3430;
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7653(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 8;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7652(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3430 c3430 = (C3430) list;
        if (!z) {
            while (i2 < c3430.f11095) {
                abstractC3462.mo7653(i, c3430.m7568(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3430.f11095; i6++) {
            c3430.m7568(i6);
            boolean z4 = AbstractC3462.f11129;
            i5 += 8;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3430.f11095) {
            abstractC3462.mo7652(c3430.m7568(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m7557(float f, int i) {
        AbstractC3462 abstractC3462 = (AbstractC3462) this.f11089;
        abstractC3462.getClass();
        abstractC3462.mo7665(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m7558(ByteString byteString) {
        C3364 c3364;
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof RopeByteString)) {
                C7547.m12764(byteString.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            m7558(ropeByteString.left);
            m7558(ropeByteString.right);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iMinLength = RopeByteString.minLength(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f11089;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength) {
            arrayDeque.push(byteString);
            return;
        }
        int iMinLength2 = RopeByteString.minLength(iBinarySearch);
        ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
        while (true) {
            c3364 = null;
            if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iMinLength2) {
                break;
            } else {
                ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2, c3364);
            }
        }
        RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString, c3364);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, ropeByteString3.size());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= RopeByteString.minLength(iBinarySearch2 + 1)) {
                break;
            } else {
                ropeByteString3 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString3, c3364);
            }
        }
        arrayDeque.push(ropeByteString3);
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo7559(AbstractC3474 abstractC3474, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3450 builder;
        C3685 c3685 = (C3685) this.f11089;
        boolean zMo7806 = c3657.mo7806();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
        if (zMo7806) {
            InterfaceC3454 interfaceC3454NewBuilderForType = interfaceC3453.newBuilderForType();
            abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3454NewBuilderForType, c3697);
            addRepeatedField(c3657, interfaceC3454NewBuilderForType.buildPartial());
        } else if (!c3685.m7945(c3657)) {
            InterfaceC3454 interfaceC3454NewBuilderForType2 = interfaceC3453.newBuilderForType();
            abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3454NewBuilderForType2, c3697);
            setField(c3657, interfaceC3454NewBuilderForType2);
        } else {
            Object objM7941 = c3685.m7941(c3657);
            if (objM7941 instanceof InterfaceC3450) {
                builder = (InterfaceC3450) objM7941;
            } else {
                builder = ((InterfaceC3441) objM7941).toBuilder();
                c3685.m7938(c3657, builder);
            }
            abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), builder, c3697);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m7560(int i, double d) {
        ((AbstractC3462) this.f11089).m7664(i, d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m7561(int i, int i2) {
        ((AbstractC3462) this.f11089).mo7665(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m7562(int i, boolean z) {
        ((AbstractC3462) this.f11089).mo7663(i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m7563(int i, ByteString byteString) {
        ((AbstractC3462) this.f11089).mo7666(i, byteString);
    }

    public C3427(AbstractC3462 abstractC3462) {
        AbstractC3402.m7505(abstractC3462, "output");
        this.f11089 = abstractC3462;
        abstractC3462.f11130 = this;
    }

    public /* synthetic */ C3427(Object obj) {
        this.f11089 = obj;
    }
}

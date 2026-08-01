package com.google.protobuf;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3666 extends AbstractC3658 implements InterfaceC3398 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f11393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3664[] f11394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC3658 f11395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f11396 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ReferenceQueue f11397 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3664[] f11398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f11399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumDescriptorProto f11400;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11401;

    public C3666(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, C3656 c3656, C3663 c3663) throws Descriptors$DescriptorValidationException {
        C3664[] c3664Arr;
        AbstractC3671 abstractC3671 = null;
        if (c3663 == null) {
            this.f11395 = c3656;
        } else {
            this.f11395 = c3663;
        }
        this.f11400 = descriptorProtos$EnumDescriptorProto;
        int i = 0;
        this.f11393 = false;
        this.f11401 = AbstractC3592.m7797(c3656, c3663, descriptorProtos$EnumDescriptorProto.getName());
        if (descriptorProtos$EnumDescriptorProto.getValueCount() == 0) {
            throw new Descriptors$DescriptorValidationException(this, "Enums must contain at least one value.");
        }
        this.f11394 = new C3664[descriptorProtos$EnumDescriptorProto.getValueCount()];
        int i2 = 0;
        while (true) {
            int valueCount = descriptorProtos$EnumDescriptorProto.getValueCount();
            c3664Arr = this.f11394;
            if (i2 >= valueCount) {
                break;
            }
            c3664Arr[i2] = new C3664(descriptorProtos$EnumDescriptorProto.getValue(i2), this, i2);
            i2++;
        }
        C3664[] c3664Arr2 = (C3664[]) c3664Arr.clone();
        this.f11398 = c3664Arr2;
        Arrays.sort(c3664Arr2, C3664.f11381);
        for (int i3 = 1; i3 < descriptorProtos$EnumDescriptorProto.getValueCount(); i3++) {
            C3664[] c3664Arr3 = this.f11398;
            C3664 c3664 = c3664Arr3[i];
            C3664 c36642 = c3664Arr3[i3];
            if (c3664.f11386.getNumber() != c36642.f11386.getNumber()) {
                i++;
                this.f11398[i] = c36642;
            }
        }
        int i4 = i + 1;
        this.f11399 = i4;
        Arrays.fill(this.f11398, i4, descriptorProtos$EnumDescriptorProto.getValueCount(), (Object) null);
        c3656.f11336.m7871(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7881(C3666 c3666) {
        c3666.m7867(c3666.f11400.getOptions().getFeatures());
        for (C3664 c3664 : c3666.f11394) {
            c3664.m7867(c3664.f11386.getOptions().getFeatures());
        }
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return this.f11395;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11400.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11401;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this.f11395.mo7802();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3664 m7882(int i) {
        C3664 c3664;
        C3664 c3664Mo7346 = mo7346(i);
        if (c3664Mo7346 != null) {
            return c3664Mo7346;
        }
        synchronized (this) {
            try {
                if (this.f11397 == null) {
                    this.f11397 = new ReferenceQueue();
                    this.f11396 = new HashMap();
                } else {
                    while (true) {
                        C3662 c3662 = (C3662) this.f11397.poll();
                        if (c3662 == null) {
                            break;
                        }
                        this.f11396.remove(Integer.valueOf(c3662.f11366));
                    }
                }
                WeakReference weakReference = (WeakReference) this.f11396.get(Integer.valueOf(i));
                c3664 = weakReference == null ? null : (C3664) weakReference.get();
                if (c3664 == null) {
                    c3664 = new C3664(this, Integer.valueOf(i));
                    this.f11396.put(Integer.valueOf(i), new C3662(i, c3664));
                }
            } finally {
            }
        }
        return c3664;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3664 m7883(String str) {
        C3661 c3661 = this.f11395.mo7802().f11336;
        String str2 = this.f11401 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c3661.getClass();
        AbstractC3658 abstractC3658M7870 = c3661.m7870(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC3658M7870 instanceof C3664) {
            return (C3664) abstractC3658M7870;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3398
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3664 mo7346(int i) {
        return (C3664) AbstractC3592.m7798(this.f11398, this.f11399, C3664.f11380, i);
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11400;
    }

    public C3666(String str) {
        String strSubstring;
        String strSubstring2;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iLastIndexOf + 1);
            strSubstring = str.substring(0, iLastIndexOf);
        } else {
            strSubstring = "";
            strSubstring2 = str;
        }
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProtoBuild = DescriptorProtos$EnumDescriptorProto.newBuilder().setName(strSubstring2).addValue(DescriptorProtos$EnumValueDescriptorProto.newBuilder().setName("PLACEHOLDER_VALUE").setNumber(0).build()).build();
        this.f11400 = descriptorProtos$EnumDescriptorProtoBuild;
        this.f11401 = str;
        C3664[] c3664Arr = {new C3664(this, 0)};
        this.f11394 = c3664Arr;
        this.f11398 = (C3664[]) c3664Arr.clone();
        this.f11399 = 1;
        this.f11395 = new C3656(strSubstring, AbstractC3592.f11217, new C3666[]{this}, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addEnumType(descriptorProtos$EnumDescriptorProtoBuild).build());
        this.f11393 = true;
    }
}

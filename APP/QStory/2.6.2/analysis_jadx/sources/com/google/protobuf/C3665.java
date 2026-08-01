package com.google.protobuf;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3665 extends AbstractC3657 implements InterfaceC3397 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f11388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3663[] f11389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC3657 f11390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f11391 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ReferenceQueue f11392 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3663[] f11393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f11394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumDescriptorProto f11395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11396;

    public C3665(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, C3655 c3655, C3662 c3662) throws Descriptors$DescriptorValidationException {
        C3663[] c3663Arr;
        AbstractC3670 abstractC3670 = null;
        if (c3662 == null) {
            this.f11390 = c3655;
        } else {
            this.f11390 = c3662;
        }
        this.f11395 = descriptorProtos$EnumDescriptorProto;
        int i = 0;
        this.f11388 = false;
        this.f11396 = AbstractC3591.m7810(c3655, c3662, descriptorProtos$EnumDescriptorProto.getName());
        if (descriptorProtos$EnumDescriptorProto.getValueCount() == 0) {
            throw new Descriptors$DescriptorValidationException(this, "Enums must contain at least one value.");
        }
        this.f11389 = new C3663[descriptorProtos$EnumDescriptorProto.getValueCount()];
        int i2 = 0;
        while (true) {
            int valueCount = descriptorProtos$EnumDescriptorProto.getValueCount();
            c3663Arr = this.f11389;
            if (i2 >= valueCount) {
                break;
            }
            c3663Arr[i2] = new C3663(descriptorProtos$EnumDescriptorProto.getValue(i2), this, i2);
            i2++;
        }
        C3663[] c3663Arr2 = (C3663[]) c3663Arr.clone();
        this.f11393 = c3663Arr2;
        Arrays.sort(c3663Arr2, C3663.f11376);
        for (int i3 = 1; i3 < descriptorProtos$EnumDescriptorProto.getValueCount(); i3++) {
            C3663[] c3663Arr3 = this.f11393;
            C3663 c3663 = c3663Arr3[i];
            C3663 c36632 = c3663Arr3[i3];
            if (c3663.f11381.getNumber() != c36632.f11381.getNumber()) {
                i++;
                this.f11393[i] = c36632;
            }
        }
        int i4 = i + 1;
        this.f11394 = i4;
        Arrays.fill(this.f11393, i4, descriptorProtos$EnumDescriptorProto.getValueCount(), (Object) null);
        c3655.f11331.m7884(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7894(C3665 c3665) {
        c3665.m7880(c3665.f11395.getOptions().getFeatures());
        for (C3663 c3663 : c3665.f11389) {
            c3663.m7880(c3663.f11381.getOptions().getFeatures());
        }
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return this.f11390;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11395.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11396;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this.f11390.mo7815();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3663 m7895(int i) {
        C3663 c3663;
        C3663 c3663Mo7359 = mo7359(i);
        if (c3663Mo7359 != null) {
            return c3663Mo7359;
        }
        synchronized (this) {
            try {
                if (this.f11392 == null) {
                    this.f11392 = new ReferenceQueue();
                    this.f11391 = new HashMap();
                } else {
                    while (true) {
                        C3661 c3661 = (C3661) this.f11392.poll();
                        if (c3661 == null) {
                            break;
                        }
                        this.f11391.remove(Integer.valueOf(c3661.f11361));
                    }
                }
                WeakReference weakReference = (WeakReference) this.f11391.get(Integer.valueOf(i));
                c3663 = weakReference == null ? null : (C3663) weakReference.get();
                if (c3663 == null) {
                    c3663 = new C3663(this, Integer.valueOf(i));
                    this.f11391.put(Integer.valueOf(i), new C3661(i, c3663));
                }
            } finally {
            }
        }
        return c3663;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3663 m7896(String str) {
        C3660 c3660 = this.f11390.mo7815().f11331;
        String str2 = this.f11396 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c3660.getClass();
        AbstractC3657 abstractC3657M7883 = c3660.m7883(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC3657M7883 instanceof C3663) {
            return (C3663) abstractC3657M7883;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3397
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3663 mo7359(int i) {
        return (C3663) AbstractC3591.m7811(this.f11393, this.f11394, C3663.f11375, i);
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11395;
    }

    public C3665(String str) {
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
        this.f11395 = descriptorProtos$EnumDescriptorProtoBuild;
        this.f11396 = str;
        C3663[] c3663Arr = {new C3663(this, 0)};
        this.f11389 = c3663Arr;
        this.f11393 = (C3663[]) c3663Arr.clone();
        this.f11394 = 1;
        this.f11390 = new C3655(strSubstring, AbstractC3591.f11212, new C3665[]{this}, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addEnumType(descriptorProtos$EnumDescriptorProtoBuild).build());
        this.f11388 = true;
    }
}

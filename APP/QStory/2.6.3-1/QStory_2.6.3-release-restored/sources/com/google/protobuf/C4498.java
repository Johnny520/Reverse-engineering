package com.google.protobuf;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4498 extends AbstractC4490 implements InterfaceC4230 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f11738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4496[] f11739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4490 f11740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f11741 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ReferenceQueue f11742 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4496[] f11743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f11744;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumDescriptorProto f11745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11746;

    public C4498(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, C4488 c4488, C4495 c4495) throws Descriptors$DescriptorValidationException {
        C4496[] c4496Arr;
        AbstractC4503 abstractC4503 = null;
        if (c4495 == null) {
            this.f11740 = c4488;
        } else {
            this.f11740 = c4495;
        }
        this.f11745 = descriptorProtos$EnumDescriptorProto;
        int i = 0;
        this.f11738 = false;
        this.f11746 = AbstractC4424.m8356(c4488, c4495, descriptorProtos$EnumDescriptorProto.getName());
        if (descriptorProtos$EnumDescriptorProto.getValueCount() == 0) {
            throw new Descriptors$DescriptorValidationException(this, "Enums must contain at least one value.");
        }
        this.f11739 = new C4496[descriptorProtos$EnumDescriptorProto.getValueCount()];
        int i2 = 0;
        while (true) {
            int valueCount = descriptorProtos$EnumDescriptorProto.getValueCount();
            c4496Arr = this.f11739;
            if (i2 >= valueCount) {
                break;
            }
            c4496Arr[i2] = new C4496(descriptorProtos$EnumDescriptorProto.getValue(i2), this, i2);
            i2++;
        }
        C4496[] c4496Arr2 = (C4496[]) c4496Arr.clone();
        this.f11743 = c4496Arr2;
        Arrays.sort(c4496Arr2, C4496.f11726);
        for (int i3 = 1; i3 < descriptorProtos$EnumDescriptorProto.getValueCount(); i3++) {
            C4496[] c4496Arr3 = this.f11743;
            C4496 c4496 = c4496Arr3[i];
            C4496 c44962 = c4496Arr3[i3];
            if (c4496.f11731.getNumber() != c44962.f11731.getNumber()) {
                i++;
                this.f11743[i] = c44962;
            }
        }
        int i4 = i + 1;
        this.f11744 = i4;
        Arrays.fill(this.f11743, i4, descriptorProtos$EnumDescriptorProto.getValueCount(), (Object) null);
        c4488.f11681.m8430(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m8440(C4498 c4498) {
        c4498.m8426(c4498.f11745.getOptions().getFeatures());
        for (C4496 c4496 : c4498.f11739) {
            c4496.m8426(c4496.f11731.getOptions().getFeatures());
        }
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return this.f11740;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11745.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11746;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this.f11740.mo8361();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4496 m8441(int i) {
        C4496 c4496;
        C4496 c4496Mo7905 = mo7905(i);
        if (c4496Mo7905 != null) {
            return c4496Mo7905;
        }
        synchronized (this) {
            try {
                if (this.f11742 == null) {
                    this.f11742 = new ReferenceQueue();
                    this.f11741 = new HashMap();
                } else {
                    while (true) {
                        C4494 c4494 = (C4494) this.f11742.poll();
                        if (c4494 == null) {
                            break;
                        }
                        this.f11741.remove(Integer.valueOf(c4494.f11711));
                    }
                }
                WeakReference weakReference = (WeakReference) this.f11741.get(Integer.valueOf(i));
                c4496 = weakReference == null ? null : (C4496) weakReference.get();
                if (c4496 == null) {
                    c4496 = new C4496(this, Integer.valueOf(i));
                    this.f11741.put(Integer.valueOf(i), new C4494(i, c4496));
                }
            } finally {
            }
        }
        return c4496;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4496 m8442(String str) {
        C4493 c4493 = this.f11740.mo8361().f11681;
        String str2 = this.f11746 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c4493.getClass();
        AbstractC4490 abstractC4490M8429 = c4493.m8429(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC4490M8429 instanceof C4496) {
            return (C4496) abstractC4490M8429;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4230
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4496 mo7905(int i) {
        return (C4496) AbstractC4424.m8357(this.f11743, this.f11744, C4496.f11725, i);
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11745;
    }

    public C4498(String str) {
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
        this.f11745 = descriptorProtos$EnumDescriptorProtoBuild;
        this.f11746 = str;
        C4496[] c4496Arr = {new C4496(this, 0)};
        this.f11739 = c4496Arr;
        this.f11743 = (C4496[]) c4496Arr.clone();
        this.f11744 = 1;
        this.f11740 = new C4488(strSubstring, AbstractC4424.f11562, new C4498[]{this}, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addEnumType(descriptorProtos$EnumDescriptorProtoBuild).build());
        this.f11738 = true;
    }
}

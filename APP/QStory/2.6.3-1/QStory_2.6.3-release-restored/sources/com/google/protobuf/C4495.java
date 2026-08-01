package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4495 extends AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f11712;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int[] f11713;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f11714;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4426[] f11715;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4489[] f11716;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC4490 f11717;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11718;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4489[] f11719;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4489[] f11720;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4495[] f11721;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4498[] f11722;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$DescriptorProto f11723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile DescriptorProtos$MessageOptions f11724;

    public C4495(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, C4488 c4488, C4495 c4495) throws Descriptors$DescriptorValidationException {
        if (c4495 == null) {
            this.f11717 = c4488;
        } else {
            this.f11717 = c4495;
        }
        this.f11723 = descriptorProtos$DescriptorProto;
        this.f11718 = AbstractC4424.m8356(c4488, c4495, descriptorProtos$DescriptorProto.getName());
        this.f11715 = descriptorProtos$DescriptorProto.getOneofDeclCount() > 0 ? new C4426[descriptorProtos$DescriptorProto.getOneofDeclCount()] : AbstractC4424.f11566;
        int i = 0;
        for (int i2 = 0; i2 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i2++) {
            this.f11715[i2] = new C4426(descriptorProtos$DescriptorProto.getOneofDecl(i2), this, i2);
        }
        this.f11721 = descriptorProtos$DescriptorProto.getNestedTypeCount() > 0 ? new C4495[descriptorProtos$DescriptorProto.getNestedTypeCount()] : AbstractC4424.f11562;
        for (int i3 = 0; i3 < descriptorProtos$DescriptorProto.getNestedTypeCount(); i3++) {
            this.f11721[i3] = new C4495(descriptorProtos$DescriptorProto.getNestedType(i3), c4488, this);
        }
        this.f11722 = descriptorProtos$DescriptorProto.getEnumTypeCount() > 0 ? new C4498[descriptorProtos$DescriptorProto.getEnumTypeCount()] : AbstractC4424.f11560;
        for (int i4 = 0; i4 < descriptorProtos$DescriptorProto.getEnumTypeCount(); i4++) {
            this.f11722[i4] = new C4498(descriptorProtos$DescriptorProto.getEnumType(i4), c4488, this);
        }
        this.f11719 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? new C4489[descriptorProtos$DescriptorProto.getFieldCount()] : AbstractC4424.f11561;
        for (int i5 = 0; i5 < descriptorProtos$DescriptorProto.getFieldCount(); i5++) {
            this.f11719[i5] = new C4489(descriptorProtos$DescriptorProto.getField(i5), c4488, this, i5, false);
        }
        this.f11720 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? (C4489[]) this.f11719.clone() : AbstractC4424.f11561;
        this.f11716 = descriptorProtos$DescriptorProto.getExtensionCount() > 0 ? new C4489[descriptorProtos$DescriptorProto.getExtensionCount()] : AbstractC4424.f11561;
        for (int i6 = 0; i6 < descriptorProtos$DescriptorProto.getExtensionCount(); i6++) {
            this.f11716[i6] = new C4489(descriptorProtos$DescriptorProto.getExtension(i6), c4488, this, i6, true);
        }
        for (int i7 = 0; i7 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i7++) {
            C4426 c4426 = this.f11715[i7];
            c4426.f11575 = new C4489[c4426.f11574];
            c4426.f11574 = 0;
        }
        for (int i8 = 0; i8 < descriptorProtos$DescriptorProto.getFieldCount(); i8++) {
            C4489 c4489 = this.f11719[i8];
            C4426 c44262 = c4489.f11690;
            if (c44262 != null) {
                C4489[] c4489Arr = c44262.f11575;
                int i9 = c44262.f11574;
                c44262.f11574 = i9 + 1;
                c4489Arr[i9] = c4489;
            }
        }
        int i10 = 0;
        for (C4426 c44263 : this.f11715) {
            C4489[] c4489Arr2 = c44263.f11575;
            if (c4489Arr2.length == 1 && c4489Arr2[0].f11695) {
                i10++;
            } else if (i10 > 0) {
                throw new Descriptors$DescriptorValidationException(this, "Synthetic oneofs must come last.");
            }
        }
        this.f11714 = this.f11715.length - i10;
        c4488.f11681.m8430(this);
        if (descriptorProtos$DescriptorProto.getExtensionRangeCount() <= 0) {
            int[] iArr = AbstractC4424.f11563;
            this.f11713 = iArr;
            this.f11712 = iArr;
            return;
        }
        this.f11713 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        this.f11712 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        for (DescriptorProtos$DescriptorProto.ExtensionRange extensionRange : descriptorProtos$DescriptorProto.getExtensionRangeList()) {
            this.f11713[i] = extensionRange.getStart();
            this.f11712[i] = extensionRange.getEnd();
            i++;
        }
        Arrays.sort(this.f11713);
        Arrays.sort(this.f11712);
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return this.f11717;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11723.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11718;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this.f11717.mo8361();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m8432() {
        m8426(this.f11723.getOptions().getFeatures());
        for (C4495 c4495 : this.f11721) {
            c4495.m8432();
        }
        for (C4498 c4498 : this.f11722) {
            C4498.m8440(c4498);
        }
        for (C4426 c4426 : this.f11715) {
            c4426.m8426(c4426.f11577.getOptions().getFeatures());
        }
        for (C4489 c4489 : this.f11719) {
            c4489.m8426(c4489.f11700.getOptions().getFeatures());
        }
        for (C4489 c44892 : this.f11716) {
            c44892.m8426(c44892.f11700.getOptions().getFeatures());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m8433() throws Descriptors$DescriptorValidationException {
        for (C4495 c4495 : this.f11721) {
            c4495.m8433();
        }
        for (C4489 c4489 : this.f11719) {
            C4489.m8410(c4489);
        }
        C4489[] c4489Arr = this.f11720;
        Arrays.sort(c4489Arr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= c4489Arr.length) {
                for (C4489 c44892 : this.f11716) {
                    C4489.m8410(c44892);
                }
                return;
            }
            C4489 c44893 = c4489Arr[i];
            C4489 c44894 = c4489Arr[i2];
            if (c44893.f11700.getNumber() == c44894.f11700.getNumber()) {
                throw new Descriptors$DescriptorValidationException(c44894, "Field number " + c44894.f11700.getNumber() + " has already been used in \"" + c44894.f11691.f11718 + "\" by field \"" + c44893.f11700.getName() + "\".");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List m8434() {
        return Collections.unmodifiableList(Arrays.asList(this.f11719));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$MessageOptions m8435() {
        if (this.f11724 == null) {
            DescriptorProtos$MessageOptions options = this.f11723.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11724 == null) {
                        this.f11724 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11724;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4489 m8436(String str) {
        C4493 c4493 = this.f11717.mo8361().f11681;
        String str2 = this.f11718 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c4493.getClass();
        AbstractC4490 abstractC4490M8429 = c4493.m8429(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC4490M8429 instanceof C4489) {
            return (C4489) abstractC4490M8429;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4489 m8437(int i) {
        C4489[] c4489Arr = this.f11720;
        return (C4489) AbstractC4424.m8357(c4489Arr, c4489Arr.length, C4489.f11686, i);
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11723;
    }

    public C4495(String str) {
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
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProtoBuild = DescriptorProtos$DescriptorProto.newBuilder().setName(strSubstring2).addExtensionRange(DescriptorProtos$DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(Integer.MAX_VALUE).build()).build();
        this.f11723 = descriptorProtos$DescriptorProtoBuild;
        this.f11718 = str;
        this.f11721 = AbstractC4424.f11562;
        C4498[] c4498Arr = AbstractC4424.f11560;
        this.f11722 = c4498Arr;
        C4489[] c4489Arr = AbstractC4424.f11561;
        this.f11719 = c4489Arr;
        this.f11720 = c4489Arr;
        this.f11716 = c4489Arr;
        this.f11715 = AbstractC4424.f11566;
        this.f11714 = 0;
        this.f11717 = new C4488(strSubstring, new C4495[]{this}, c4498Arr, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addMessageType(descriptorProtos$DescriptorProtoBuild).build());
        this.f11713 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getStart()};
        this.f11712 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getEnd()};
    }
}

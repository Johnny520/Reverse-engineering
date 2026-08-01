package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3663 extends AbstractC3658 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f11367;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int[] f11368;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f11369;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3594[] f11370;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3657[] f11371;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC3658 f11372;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11373;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3657[] f11374;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3657[] f11375;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3663[] f11376;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3666[] f11377;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$DescriptorProto f11378;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile DescriptorProtos$MessageOptions f11379;

    public C3663(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, C3656 c3656, C3663 c3663) throws Descriptors$DescriptorValidationException {
        if (c3663 == null) {
            this.f11372 = c3656;
        } else {
            this.f11372 = c3663;
        }
        this.f11378 = descriptorProtos$DescriptorProto;
        this.f11373 = AbstractC3592.m7797(c3656, c3663, descriptorProtos$DescriptorProto.getName());
        this.f11370 = descriptorProtos$DescriptorProto.getOneofDeclCount() > 0 ? new C3594[descriptorProtos$DescriptorProto.getOneofDeclCount()] : AbstractC3592.f11221;
        int i = 0;
        for (int i2 = 0; i2 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i2++) {
            this.f11370[i2] = new C3594(descriptorProtos$DescriptorProto.getOneofDecl(i2), this, i2);
        }
        this.f11376 = descriptorProtos$DescriptorProto.getNestedTypeCount() > 0 ? new C3663[descriptorProtos$DescriptorProto.getNestedTypeCount()] : AbstractC3592.f11217;
        for (int i3 = 0; i3 < descriptorProtos$DescriptorProto.getNestedTypeCount(); i3++) {
            this.f11376[i3] = new C3663(descriptorProtos$DescriptorProto.getNestedType(i3), c3656, this);
        }
        this.f11377 = descriptorProtos$DescriptorProto.getEnumTypeCount() > 0 ? new C3666[descriptorProtos$DescriptorProto.getEnumTypeCount()] : AbstractC3592.f11215;
        for (int i4 = 0; i4 < descriptorProtos$DescriptorProto.getEnumTypeCount(); i4++) {
            this.f11377[i4] = new C3666(descriptorProtos$DescriptorProto.getEnumType(i4), c3656, this);
        }
        this.f11374 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? new C3657[descriptorProtos$DescriptorProto.getFieldCount()] : AbstractC3592.f11216;
        for (int i5 = 0; i5 < descriptorProtos$DescriptorProto.getFieldCount(); i5++) {
            this.f11374[i5] = new C3657(descriptorProtos$DescriptorProto.getField(i5), c3656, this, i5, false);
        }
        this.f11375 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? (C3657[]) this.f11374.clone() : AbstractC3592.f11216;
        this.f11371 = descriptorProtos$DescriptorProto.getExtensionCount() > 0 ? new C3657[descriptorProtos$DescriptorProto.getExtensionCount()] : AbstractC3592.f11216;
        for (int i6 = 0; i6 < descriptorProtos$DescriptorProto.getExtensionCount(); i6++) {
            this.f11371[i6] = new C3657(descriptorProtos$DescriptorProto.getExtension(i6), c3656, this, i6, true);
        }
        for (int i7 = 0; i7 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i7++) {
            C3594 c3594 = this.f11370[i7];
            c3594.f11230 = new C3657[c3594.f11229];
            c3594.f11229 = 0;
        }
        for (int i8 = 0; i8 < descriptorProtos$DescriptorProto.getFieldCount(); i8++) {
            C3657 c3657 = this.f11374[i8];
            C3594 c35942 = c3657.f11345;
            if (c35942 != null) {
                C3657[] c3657Arr = c35942.f11230;
                int i9 = c35942.f11229;
                c35942.f11229 = i9 + 1;
                c3657Arr[i9] = c3657;
            }
        }
        int i10 = 0;
        for (C3594 c35943 : this.f11370) {
            C3657[] c3657Arr2 = c35943.f11230;
            if (c3657Arr2.length == 1 && c3657Arr2[0].f11350) {
                i10++;
            } else if (i10 > 0) {
                throw new Descriptors$DescriptorValidationException(this, "Synthetic oneofs must come last.");
            }
        }
        this.f11369 = this.f11370.length - i10;
        c3656.f11336.m7871(this);
        if (descriptorProtos$DescriptorProto.getExtensionRangeCount() <= 0) {
            int[] iArr = AbstractC3592.f11218;
            this.f11368 = iArr;
            this.f11367 = iArr;
            return;
        }
        this.f11368 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        this.f11367 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        for (DescriptorProtos$DescriptorProto.ExtensionRange extensionRange : descriptorProtos$DescriptorProto.getExtensionRangeList()) {
            this.f11368[i] = extensionRange.getStart();
            this.f11367[i] = extensionRange.getEnd();
            i++;
        }
        Arrays.sort(this.f11368);
        Arrays.sort(this.f11367);
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return this.f11372;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11378.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11373;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this.f11372.mo7802();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7873() {
        m7867(this.f11378.getOptions().getFeatures());
        for (C3663 c3663 : this.f11376) {
            c3663.m7873();
        }
        for (C3666 c3666 : this.f11377) {
            C3666.m7881(c3666);
        }
        for (C3594 c3594 : this.f11370) {
            c3594.m7867(c3594.f11232.getOptions().getFeatures());
        }
        for (C3657 c3657 : this.f11374) {
            c3657.m7867(c3657.f11355.getOptions().getFeatures());
        }
        for (C3657 c36572 : this.f11371) {
            c36572.m7867(c36572.f11355.getOptions().getFeatures());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7874() throws Descriptors$DescriptorValidationException {
        for (C3663 c3663 : this.f11376) {
            c3663.m7874();
        }
        for (C3657 c3657 : this.f11374) {
            C3657.m7851(c3657);
        }
        C3657[] c3657Arr = this.f11375;
        Arrays.sort(c3657Arr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= c3657Arr.length) {
                for (C3657 c36572 : this.f11371) {
                    C3657.m7851(c36572);
                }
                return;
            }
            C3657 c36573 = c3657Arr[i];
            C3657 c36574 = c3657Arr[i2];
            if (c36573.f11355.getNumber() == c36574.f11355.getNumber()) {
                throw new Descriptors$DescriptorValidationException(c36574, "Field number " + c36574.f11355.getNumber() + " has already been used in \"" + c36574.f11346.f11373 + "\" by field \"" + c36573.f11355.getName() + "\".");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List m7875() {
        return Collections.unmodifiableList(Arrays.asList(this.f11374));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$MessageOptions m7876() {
        if (this.f11379 == null) {
            DescriptorProtos$MessageOptions options = this.f11378.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11379 == null) {
                        this.f11379 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11379;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3657 m7877(String str) {
        C3661 c3661 = this.f11372.mo7802().f11336;
        String str2 = this.f11373 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c3661.getClass();
        AbstractC3658 abstractC3658M7870 = c3661.m7870(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC3658M7870 instanceof C3657) {
            return (C3657) abstractC3658M7870;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3657 m7878(int i) {
        C3657[] c3657Arr = this.f11375;
        return (C3657) AbstractC3592.m7798(c3657Arr, c3657Arr.length, C3657.f11341, i);
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11378;
    }

    public C3663(String str) {
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
        this.f11378 = descriptorProtos$DescriptorProtoBuild;
        this.f11373 = str;
        this.f11376 = AbstractC3592.f11217;
        C3666[] c3666Arr = AbstractC3592.f11215;
        this.f11377 = c3666Arr;
        C3657[] c3657Arr = AbstractC3592.f11216;
        this.f11374 = c3657Arr;
        this.f11375 = c3657Arr;
        this.f11371 = c3657Arr;
        this.f11370 = AbstractC3592.f11221;
        this.f11369 = 0;
        this.f11372 = new C3656(strSubstring, new C3663[]{this}, c3666Arr, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addMessageType(descriptorProtos$DescriptorProtoBuild).build());
        this.f11368 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getStart()};
        this.f11367 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getEnd()};
    }
}

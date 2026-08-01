package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3662 extends AbstractC3657 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f11362;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int[] f11363;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f11364;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3593[] f11365;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3656[] f11366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC3657 f11367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3656[] f11369;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3656[] f11370;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3662[] f11371;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3665[] f11372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$DescriptorProto f11373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile DescriptorProtos$MessageOptions f11374;

    public C3662(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, C3655 c3655, C3662 c3662) throws Descriptors$DescriptorValidationException {
        if (c3662 == null) {
            this.f11367 = c3655;
        } else {
            this.f11367 = c3662;
        }
        this.f11373 = descriptorProtos$DescriptorProto;
        this.f11368 = AbstractC3591.m7810(c3655, c3662, descriptorProtos$DescriptorProto.getName());
        this.f11365 = descriptorProtos$DescriptorProto.getOneofDeclCount() > 0 ? new C3593[descriptorProtos$DescriptorProto.getOneofDeclCount()] : AbstractC3591.f11216;
        int i = 0;
        for (int i2 = 0; i2 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i2++) {
            this.f11365[i2] = new C3593(descriptorProtos$DescriptorProto.getOneofDecl(i2), this, i2);
        }
        this.f11371 = descriptorProtos$DescriptorProto.getNestedTypeCount() > 0 ? new C3662[descriptorProtos$DescriptorProto.getNestedTypeCount()] : AbstractC3591.f11212;
        for (int i3 = 0; i3 < descriptorProtos$DescriptorProto.getNestedTypeCount(); i3++) {
            this.f11371[i3] = new C3662(descriptorProtos$DescriptorProto.getNestedType(i3), c3655, this);
        }
        this.f11372 = descriptorProtos$DescriptorProto.getEnumTypeCount() > 0 ? new C3665[descriptorProtos$DescriptorProto.getEnumTypeCount()] : AbstractC3591.f11210;
        for (int i4 = 0; i4 < descriptorProtos$DescriptorProto.getEnumTypeCount(); i4++) {
            this.f11372[i4] = new C3665(descriptorProtos$DescriptorProto.getEnumType(i4), c3655, this);
        }
        this.f11369 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? new C3656[descriptorProtos$DescriptorProto.getFieldCount()] : AbstractC3591.f11211;
        for (int i5 = 0; i5 < descriptorProtos$DescriptorProto.getFieldCount(); i5++) {
            this.f11369[i5] = new C3656(descriptorProtos$DescriptorProto.getField(i5), c3655, this, i5, false);
        }
        this.f11370 = descriptorProtos$DescriptorProto.getFieldCount() > 0 ? (C3656[]) this.f11369.clone() : AbstractC3591.f11211;
        this.f11366 = descriptorProtos$DescriptorProto.getExtensionCount() > 0 ? new C3656[descriptorProtos$DescriptorProto.getExtensionCount()] : AbstractC3591.f11211;
        for (int i6 = 0; i6 < descriptorProtos$DescriptorProto.getExtensionCount(); i6++) {
            this.f11366[i6] = new C3656(descriptorProtos$DescriptorProto.getExtension(i6), c3655, this, i6, true);
        }
        for (int i7 = 0; i7 < descriptorProtos$DescriptorProto.getOneofDeclCount(); i7++) {
            C3593 c3593 = this.f11365[i7];
            c3593.f11225 = new C3656[c3593.f11224];
            c3593.f11224 = 0;
        }
        for (int i8 = 0; i8 < descriptorProtos$DescriptorProto.getFieldCount(); i8++) {
            C3656 c3656 = this.f11369[i8];
            C3593 c35932 = c3656.f11340;
            if (c35932 != null) {
                C3656[] c3656Arr = c35932.f11225;
                int i9 = c35932.f11224;
                c35932.f11224 = i9 + 1;
                c3656Arr[i9] = c3656;
            }
        }
        int i10 = 0;
        for (C3593 c35933 : this.f11365) {
            C3656[] c3656Arr2 = c35933.f11225;
            if (c3656Arr2.length == 1 && c3656Arr2[0].f11345) {
                i10++;
            } else if (i10 > 0) {
                throw new Descriptors$DescriptorValidationException(this, "Synthetic oneofs must come last.");
            }
        }
        this.f11364 = this.f11365.length - i10;
        c3655.f11331.m7884(this);
        if (descriptorProtos$DescriptorProto.getExtensionRangeCount() <= 0) {
            int[] iArr = AbstractC3591.f11213;
            this.f11363 = iArr;
            this.f11362 = iArr;
            return;
        }
        this.f11363 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        this.f11362 = new int[descriptorProtos$DescriptorProto.getExtensionRangeCount()];
        for (DescriptorProtos$DescriptorProto.ExtensionRange extensionRange : descriptorProtos$DescriptorProto.getExtensionRangeList()) {
            this.f11363[i] = extensionRange.getStart();
            this.f11362[i] = extensionRange.getEnd();
            i++;
        }
        Arrays.sort(this.f11363);
        Arrays.sort(this.f11362);
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return this.f11367;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11373.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11368;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this.f11367.mo7815();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7886() {
        m7880(this.f11373.getOptions().getFeatures());
        for (C3662 c3662 : this.f11371) {
            c3662.m7886();
        }
        for (C3665 c3665 : this.f11372) {
            C3665.m7894(c3665);
        }
        for (C3593 c3593 : this.f11365) {
            c3593.m7880(c3593.f11227.getOptions().getFeatures());
        }
        for (C3656 c3656 : this.f11369) {
            c3656.m7880(c3656.f11350.getOptions().getFeatures());
        }
        for (C3656 c36562 : this.f11366) {
            c36562.m7880(c36562.f11350.getOptions().getFeatures());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7887() throws Descriptors$DescriptorValidationException {
        for (C3662 c3662 : this.f11371) {
            c3662.m7887();
        }
        for (C3656 c3656 : this.f11369) {
            C3656.m7864(c3656);
        }
        C3656[] c3656Arr = this.f11370;
        Arrays.sort(c3656Arr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= c3656Arr.length) {
                for (C3656 c36562 : this.f11366) {
                    C3656.m7864(c36562);
                }
                return;
            }
            C3656 c36563 = c3656Arr[i];
            C3656 c36564 = c3656Arr[i2];
            if (c36563.f11350.getNumber() == c36564.f11350.getNumber()) {
                throw new Descriptors$DescriptorValidationException(c36564, "Field number " + c36564.f11350.getNumber() + " has already been used in \"" + c36564.f11341.f11368 + "\" by field \"" + c36563.f11350.getName() + "\".");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List m7888() {
        return Collections.unmodifiableList(Arrays.asList(this.f11369));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$MessageOptions m7889() {
        if (this.f11374 == null) {
            DescriptorProtos$MessageOptions options = this.f11373.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11374 == null) {
                        this.f11374 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11374;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3656 m7890(String str) {
        C3660 c3660 = this.f11367.mo7815().f11331;
        String str2 = this.f11368 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
        c3660.getClass();
        AbstractC3657 abstractC3657M7883 = c3660.m7883(str2, Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS);
        if (abstractC3657M7883 instanceof C3656) {
            return (C3656) abstractC3657M7883;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3656 m7891(int i) {
        C3656[] c3656Arr = this.f11370;
        return (C3656) AbstractC3591.m7811(c3656Arr, c3656Arr.length, C3656.f11336, i);
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11373;
    }

    public C3662(String str) {
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
        this.f11373 = descriptorProtos$DescriptorProtoBuild;
        this.f11368 = str;
        this.f11371 = AbstractC3591.f11212;
        C3665[] c3665Arr = AbstractC3591.f11210;
        this.f11372 = c3665Arr;
        C3656[] c3656Arr = AbstractC3591.f11211;
        this.f11369 = c3656Arr;
        this.f11370 = c3656Arr;
        this.f11366 = c3656Arr;
        this.f11365 = AbstractC3591.f11216;
        this.f11364 = 0;
        this.f11367 = new C3655(strSubstring, new C3662[]{this}, c3665Arr, DescriptorProtos$FileDescriptorProto.newBuilder().setName(str.concat(".placeholder.proto")).setPackage(strSubstring).addMessageType(descriptorProtos$DescriptorProtoBuild).build());
        this.f11363 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getStart()};
        this.f11362 = new int[]{descriptorProtos$DescriptorProtoBuild.getExtensionRange(0).getEnd()};
    }
}

package com.materialkolor.dynamiccolor;

import androidx.window.area.AbstractC3400;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C4718;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p279.AbstractC9085;
import p279.C9084;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4644 extends C4649 {
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C4638 m8696() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_dim";
        c4637.f12324 = new C4642(8);
        c4637.f12323 = new C4642(9);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 14);
        c4637.f12326 = new C4642(11);
        c4637.f12328 = new C4651(this, 15);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4638 m8697() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_container_highest";
        c4637.f12324 = new C4641(29);
        c4637.f12323 = new C4646(0);
        c4637.f12322 = true;
        c4637.f12321 = new C4646(1);
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "surface_container_highest";
        c46372.f12324 = new C4632(11);
        c46372.f12323 = new C4632(12);
        c46372.f12322 = true;
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4638 m8698() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "inverse_on_surface";
        c4637.f12324 = new C4641(8);
        int i = 0;
        c4637.f12320 = new C4645(this, i);
        int i2 = 9;
        c4637.f12326 = new C4641(i2);
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "inverse_on_surface";
        c46372.f12324 = new C4647(7);
        c46372.f12323 = new C4647(i2);
        c46372.f12320 = new C4651(this, i);
        c46372.f12326 = new C4647(10);
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C4638 m8699() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "error_dim";
        c4637.f12324 = new C4642(15);
        c4637.f12323 = new C4642(16);
        c4637.f12322 = true;
        int i = 18;
        c4637.f12320 = new C4651(this, i);
        c4637.f12326 = new C4642(i);
        c4637.f12328 = new C4651(this, 19);
        return c4637.m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4638 mo8700() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_fixed_dim";
        int i = 3;
        c4637.f12324 = new C4650(i);
        c4637.f12323 = new C4651(this, 2);
        c4637.f12322 = true;
        c4637.f12328 = new C4651(this, i);
        return super.mo8700().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4638 mo8701() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_fixed";
        c4637.f12324 = new C4641(13);
        c4637.f12323 = new C4645(this, 1);
        c4637.f12322 = true;
        c4637.f12320 = new C4645(this, 2);
        c4637.f12326 = new C4641(15);
        return super.mo8701().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4638 mo8702() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_container";
        c4637.f12324 = new C4646(28);
        c4637.f12323 = new C4646(29);
        c4637.f12322 = true;
        c4637.f12320 = new C4645(this, 8);
        c4637.f12328 = new C4645(this, 9);
        c4637.f12326 = new C4647(19);
        return super.mo8702().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4638 mo8703() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary";
        c4637.f12324 = new C4650(9);
        c4637.f12323 = new C4650(10);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 4);
        c4637.f12326 = new C4650(11);
        c4637.f12328 = new C4651(this, 5);
        return super.mo8703().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4638 m8704() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_container_high";
        c4637.f12324 = new C4646(11);
        c4637.f12323 = new C4646(12);
        c4637.f12322 = true;
        c4637.f12321 = new C4646(13);
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "surface_container_high";
        c46372.f12324 = new C4647(5);
        c46372.f12323 = new C4647(6);
        c46372.f12322 = true;
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4638 m8705() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface";
        c4637.f12324 = new C4642(22);
        c4637.f12323 = new C4642(23);
        c4637.f12322 = true;
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "surface";
        c46372.f12324 = new C4631(13);
        c46372.f12323 = new C4631(15);
        c46372.f12322 = true;
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4638 m8706() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_dim";
        c4637.f12324 = new C4642(5);
        c4637.f12323 = new C4642(6);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 12);
        c4637.f12326 = new C4642(7);
        c4637.f12328 = new C4651(this, 13);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4638 m8707() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_dim";
        c4637.f12324 = new C4642(12);
        c4637.f12323 = new C4642(13);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 16);
        c4637.f12326 = new C4642(14);
        c4637.f12328 = new C4651(this, 17);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C4638 m8708() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "on_surface_variant";
        c4637.f12324 = new C4650(0);
        int i = 1;
        c4637.f12321 = new C4650(i);
        c4637.f12320 = new C4651(this, i);
        c4637.f12326 = new C4650(2);
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "on_surface_variant";
        c46372.f12324 = new C4630(13);
        c46372.f12323 = new C4630(14);
        c46372.f12320 = new ColorSpec2021$onSurfaceVariant$3(this);
        c46372.f12326 = new C4630(15);
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C4638 m8709() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "on_surface";
        c4637.f12324 = new C4641(3);
        c4637.f12323 = new C4651(this, 27);
        c4637.f12321 = new C4641(4);
        c4637.f12320 = new C4651(this, 28);
        c4637.f12326 = new C4641(5);
        C4638 c4638M8693 = c4637.m8693();
        C4637 c46372 = new C4637();
        c46372.f12325 = "on_surface";
        c46372.f12324 = new C4632(17);
        c46372.f12323 = new C4632(18);
        c46372.f12320 = new ColorSpec2021$onSurface$3(this);
        c46372.f12326 = new C4632(19);
        return c46372.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9092 mo8710(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        int i = AbstractC4643.f12348[variant.ordinal()];
        if (i == 1) {
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8710(variant, c9084, z, dynamicScheme$Platform) : AbstractC7390.m12607(C4718.m8828(c9084), C4718.m8825(c9084, dynamicScheme$Platform)) : AbstractC7390.m12607(C4718.m8829(c9084), C4718.m8826(c9084, z, dynamicScheme$Platform));
        }
        return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d);
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9084 mo8711(C9089 c9089, C4638 c4638) {
        Number number;
        C9092 c9092 = (C9092) c4638.f12334.invoke(c9089);
        double dMo8729 = mo8729(c9089, c4638);
        double d = c9092.f23223;
        InterfaceC7387 interfaceC7387 = c4638.f12331;
        if (interfaceC7387 == null || (number = (Double) interfaceC7387.invoke(c9089)) == null) {
            number = 1;
        }
        return AbstractC9085.m14382(d, number.doubleValue() * c9092.f23222, dMo8729);
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9092 mo8712(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d = c9084.f23201;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            if (d < dArr[i] || d >= dArr[i + 1]) {
                i++;
            } else {
                double d2 = dArr2[i] % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                d = d2;
            }
        }
        int i2 = AbstractC4643.f12348[variant.ordinal()];
        if (i2 == 1) {
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 50.0d : 40.0d);
        }
        if (i2 == 2) {
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 60.0d : 48.0d);
        }
        if (i2 == 3) {
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 64.0d : 48.0d);
        }
        if (i2 == 4) {
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 80.0d : 60.0d);
        }
        super.mo8712(variant, c9084, z, dynamicScheme$Platform);
        return null;
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4638 mo8713() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "error_container";
        c4637.f12324 = new C4647(18);
        c4637.f12323 = new C4642(21);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 24);
        c4637.f12328 = new C4651(this, 29);
        c4637.f12326 = new C4641(14);
        return super.mo8713().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4638 mo8714() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "error";
        c4637.f12324 = new C4642(24);
        c4637.f12323 = new C4642(25);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 22);
        c4637.f12326 = new C4642(26);
        c4637.f12328 = new C4651(this, 23);
        return super.mo8714().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4638 mo8715() {
        C4637 c4637M8694 = m8705().m8694();
        c4637M8694.f12325 = "background";
        return super.mo8715().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637M8694.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4638 mo8716() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_container";
        c4637.f12324 = new C4646(20);
        c4637.f12323 = new C4646(21);
        c4637.f12322 = true;
        c4637.f12320 = new C4645(this, 6);
        c4637.f12328 = new C4645(this, 7);
        c4637.f12326 = new C4646(23);
        return super.mo8716().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4638 mo8717() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary";
        c4637.f12324 = new C4641(21);
        c4637.f12323 = new C4646(2);
        c4637.f12322 = true;
        c4637.f12320 = new C4645(this, 5);
        c4637.f12326 = new C4646(22);
        c4637.f12328 = new C4645(this, 10);
        return super.mo8717().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4638 mo8718() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_bright";
        c4637.f12324 = new C4650(25);
        c4637.f12323 = new C4650(26);
        c4637.f12322 = true;
        c4637.f12321 = new C4650(27);
        return super.mo8718().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4638 mo8719() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_dim";
        c4637.f12324 = new C4641(23);
        c4637.f12323 = new C4641(24);
        c4637.f12322 = true;
        c4637.f12321 = new C4641(25);
        return super.mo8719().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4638 mo8720() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_fixed";
        c4637.f12324 = new C4650(15);
        c4637.f12323 = new C4651(this, 10);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 11);
        c4637.f12326 = new C4650(16);
        return super.mo8720().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4638 mo8721() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_fixed_dim";
        c4637.f12324 = new C4650(12);
        c4637.f12323 = new C4651(this, 6);
        c4637.f12322 = true;
        c4637.f12328 = new C4651(this, 7);
        return super.mo8721().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C4638 mo8722() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "inverse_surface";
        c4637.f12324 = new C4646(9);
        c4637.f12323 = new C4646(10);
        c4637.f12322 = true;
        return super.mo8722().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4638 mo8723() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_fixed";
        c4637.f12324 = new C4641(1);
        c4637.f12323 = new C4651(this, 25);
        c4637.f12322 = true;
        c4637.f12320 = new C4651(this, 26);
        c4637.f12326 = new C4641(2);
        return super.mo8723().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4638 mo8724() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_fixed_dim";
        c4637.f12324 = new C4650(13);
        c4637.f12323 = new C4651(this, 8);
        c4637.f12322 = true;
        c4637.f12328 = new C4651(this, 9);
        return super.mo8724().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4638 mo8725() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary";
        c4637.f12324 = new C4642(17);
        c4637.f12323 = new C4642(19);
        c4637.f12322 = true;
        int i = 20;
        c4637.f12320 = new C4651(this, i);
        c4637.f12326 = new C4642(i);
        c4637.f12328 = new C4651(this, 21);
        return super.mo8725().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4638 mo8726() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_container";
        c4637.f12324 = new C4641(19);
        c4637.f12323 = new C4641(20);
        c4637.f12322 = true;
        c4637.f12320 = new C4645(this, 3);
        c4637.f12328 = new C4645(this, 4);
        c4637.f12326 = new C4641(22);
        return super.mo8726().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4637.m8693()).m8693();
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9092 mo8727(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        int i = AbstractC4643.f12348[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC7390.m12607(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 26.0d : 32.0d);
            }
            if (i == 3) {
                return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? 36.0d : 48.0d : 40.0d);
            }
            if (i != 4) {
                return super.mo8727(variant, c9084, z, dynamicScheme$Platform);
            }
            return AbstractC7390.m12607(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 74.0d : 56.0d);
        }
        double d2 = 12.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 8.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 16.0d;
        }
        return AbstractC7390.m12607(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9092 mo8728(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        int i = AbstractC4643.f12348[variant.ordinal()];
        if (i == 1) {
            return AbstractC7390.m12607(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d) * 2.2d);
        }
        if (i == 2) {
            return AbstractC7390.m12607(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d) * 1.7d);
        }
        if (i != 3) {
            return i != 4 ? super.mo8728(variant, c9084, z, dynamicScheme$Platform) : AbstractC7390.m12607(C4718.m8828(c9084), C4718.m8825(c9084, dynamicScheme$Platform) * 1.29d);
        }
        double dM8829 = C4718.m8829(c9084);
        return AbstractC7390.m12607(dM8829, C4718.m8826(c9084, z, dynamicScheme$Platform) * ((dM8829 < 105.0d || dM8829 >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final double mo8729(C9089 c9089, C4638 c4638) {
        C4638 c46382;
        C4635 c4635;
        C4638 c46383;
        double dM5632;
        c9089.getClass();
        boolean z = c9089.f23211;
        boolean z2 = c4638.f12332;
        InterfaceC7387 interfaceC7387 = c4638.f12330;
        InterfaceC7387 interfaceC73872 = c4638.f12336;
        String str = c4638.f12335;
        InterfaceC7387 interfaceC73873 = c4638.f12339;
        Double dValueOf = null;
        C4627 c4627 = interfaceC73873 != null ? (C4627) interfaceC73873.invoke(c9089) : null;
        if (c4627 != null) {
            double d = c4627.f12304;
            C4638 c46384 = c4627.f12306;
            C4638 c46385 = c4627.f12305;
            TonePolarity tonePolarity = c4627.f12303;
            ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint = c4627.f12301;
            if (tonePolarity == TonePolarity.DARKER || ((tonePolarity == TonePolarity.RELATIVE_LIGHTER && z) || (tonePolarity == TonePolarity.RELATIVE_DARKER && !z))) {
                d = -d;
            }
            boolean zM9466 = AbstractC5227.m9466(str, c46384.f12335);
            C4638 c46386 = zM9466 ? c46384 : c46385;
            if (zM9466) {
                c46384 = c46385;
            }
            double dDoubleValue = ((Number) c46386.f12333.invoke(c9089)).doubleValue();
            double dM8695 = c46384.m8695(c9089);
            double d2 = d * ((double) (zM9466 ? 1 : -1));
            int i = AbstractC4643.f12349[toneDeltaPair$DeltaConstraint.ordinal()];
            if (i == 1) {
                dM5632 = AbstractC3400.m5632(dM8695 + d2, 0.0d, 100.0d);
            } else if (i == 2) {
                dM5632 = d2 > 0.0d ? AbstractC3400.m5632(AbstractC3400.m5632(dDoubleValue, dM8695, dM8695 + d2), 0.0d, 100.0d) : AbstractC3400.m5632(AbstractC3400.m5632(dDoubleValue, dM8695 + d2, dM8695), 0.0d, 100.0d);
            } else {
                if (i != 3) {
                    C5043.m9170();
                    return 0.0d;
                }
                dM5632 = d2 > 0.0d ? AbstractC3400.m5632(dDoubleValue, dM8695 + d2, 100.0d) : AbstractC3400.m5632(dDoubleValue, 0.0d, dM8695 + d2);
            }
            if (interfaceC7387 != null && interfaceC73872 != null) {
                C4638 c46387 = (C4638) interfaceC7387.invoke(c9089);
                C4635 c46352 = (C4635) interfaceC73872.invoke(c9089);
                if (c46387 != null && c46352 != null) {
                    double dM86952 = c46387.m8695(c9089);
                    double dM8690 = c46352.m8690();
                    if (AbstractC7173.m12439(dM86952, dM5632) < dM8690) {
                        dM5632 = AbstractC4636.m8691(dM86952, dM8690);
                    }
                }
            }
            double d3 = dM5632;
            return (!z2 || AbstractC5971.m10690(str, "_fixed_dim")) ? d3 : d3 >= 57.0d ? AbstractC3400.m5632(d3, 65.0d, 100.0d) : AbstractC3400.m5632(d3, 0.0d, 49.0d);
        }
        double dDoubleValue2 = ((Number) c4638.f12333.invoke(c9089)).doubleValue();
        Double dValueOf2 = (interfaceC7387 == null || (c46383 = (C4638) interfaceC7387.invoke(c9089)) == null) ? null : Double.valueOf(c46383.m8695(c9089));
        if (interfaceC73872 != null && (c4635 = (C4635) interfaceC73872.invoke(c9089)) != null) {
            dValueOf = Double.valueOf(c4635.m8690());
        }
        if (dValueOf2 == null || dValueOf == null) {
            return dDoubleValue2;
        }
        if (AbstractC7173.m12439(dValueOf2.doubleValue(), dDoubleValue2) < dValueOf.doubleValue()) {
            dDoubleValue2 = AbstractC4636.m8691(dValueOf2.doubleValue(), dValueOf.doubleValue());
        }
        double dM56322 = dDoubleValue2;
        if (z2 && !AbstractC5971.m10690(str, "_fixed_dim")) {
            dM56322 = dM56322 >= 57.0d ? AbstractC3400.m5632(dM56322, 65.0d, 100.0d) : AbstractC3400.m5632(dM56322, 0.0d, 49.0d);
        }
        double d4 = dM56322;
        InterfaceC7387 interfaceC73874 = c4638.f12337;
        if (interfaceC73874 != null && (c46382 = (C4638) interfaceC73874.invoke(c9089)) != null) {
            double dM86953 = c46382.m8695(c9089);
            double dMax = Math.max(dValueOf2.doubleValue(), dM86953);
            double dMin = Math.min(dValueOf2.doubleValue(), dM86953);
            if (AbstractC7173.m12439(dMax, d4) < dValueOf.doubleValue() || AbstractC7173.m12439(dMin, d4) < dValueOf.doubleValue()) {
                double dM12443 = AbstractC7173.m12443(dMax, dValueOf.doubleValue());
                double dM12441 = AbstractC7173.m12441(dMin, dValueOf.doubleValue());
                ArrayList arrayList = new ArrayList();
                if (dM12443 != -1.0d) {
                    arrayList.add(Double.valueOf(dM12443));
                }
                if (dM12441 != -1.0d) {
                    arrayList.add(Double.valueOf(dM12441));
                }
                if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dM86953) < 60.0d) {
                    if (dM12443 < 0.0d) {
                        return 100.0d;
                    }
                    return dM12443;
                }
                if (arrayList.size() == 1) {
                    return ((Number) AbstractC5176.m9379(arrayList)).doubleValue();
                }
                if (dM12441 < 0.0d) {
                    return 0.0d;
                }
                return dM12441;
            }
        }
        return d4;
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9092 mo8730(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        int i = AbstractC4643.f12348[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC7390.m12607(d, 16.0d);
            }
            if (i == 3) {
                return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 16.0d : 24.0d);
            }
            if (i != 4) {
                return super.mo8730(variant, c9084, z, dynamicScheme$Platform);
            }
            return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 56.0d : 36.0d);
        }
        double d2 = 6.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 4.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 10.0d;
        }
        return AbstractC7390.m12607(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C4649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C9092 mo8731(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        int i = AbstractC4643.f12348[variant.ordinal()];
        if (i == 1) {
            return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 20.0d : 36.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8731(variant, c9084, z, dynamicScheme$Platform) : AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d) : AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d);
        }
        return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 28.0d : 32.0d);
    }
}

package com.materialkolor.dynamiccolor;

import androidx.window.area.AbstractC2567;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3886;
import io.ktor.util.C4211;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import p034.AbstractC6344;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p263.AbstractC8256;
import p263.C8255;
import p265.C8260;
import p266.C8263;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3812 extends C3817 {
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3806 m8137() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_dim";
        c3805.f11979 = new C3810(8);
        c3805.f11978 = new C3810(9);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 14);
        c3805.f11981 = new C3810(11);
        c3805.f11983 = new C3819(this, 15);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3806 m8138() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_container_highest";
        c3805.f11979 = new C3809(29);
        c3805.f11978 = new C3814(0);
        c3805.f11977 = true;
        c3805.f11976 = new C3814(1);
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "surface_container_highest";
        c38052.f11979 = new C3800(11);
        c38052.f11978 = new C3800(12);
        c38052.f11977 = true;
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3806 m8139() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "inverse_on_surface";
        c3805.f11979 = new C3809(8);
        int i = 0;
        c3805.f11975 = new C3813(this, i);
        int i2 = 9;
        c3805.f11981 = new C3809(i2);
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "inverse_on_surface";
        c38052.f11979 = new C3815(7);
        c38052.f11978 = new C3815(i2);
        c38052.f11975 = new C3819(this, i);
        c38052.f11981 = new C3815(10);
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C3806 m8140() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "error_dim";
        c3805.f11979 = new C3810(15);
        c3805.f11978 = new C3810(16);
        c3805.f11977 = true;
        int i = 18;
        c3805.f11975 = new C3819(this, i);
        c3805.f11981 = new C3810(i);
        c3805.f11983 = new C3819(this, 19);
        return c3805.m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3806 mo8141() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_fixed_dim";
        int i = 3;
        c3805.f11979 = new C3818(i);
        c3805.f11978 = new C3819(this, 2);
        c3805.f11977 = true;
        c3805.f11983 = new C3819(this, i);
        return super.mo8141().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C3806 mo8142() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_fixed";
        c3805.f11979 = new C3809(13);
        c3805.f11978 = new C3813(this, 1);
        c3805.f11977 = true;
        c3805.f11975 = new C3813(this, 2);
        c3805.f11981 = new C3809(15);
        return super.mo8142().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3806 mo8143() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_container";
        c3805.f11979 = new C3814(28);
        c3805.f11978 = new C3814(29);
        c3805.f11977 = true;
        c3805.f11975 = new C3813(this, 8);
        c3805.f11983 = new C3813(this, 9);
        c3805.f11981 = new C3815(19);
        return super.mo8143().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3806 mo8144() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary";
        c3805.f11979 = new C3818(9);
        c3805.f11978 = new C3818(10);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 4);
        c3805.f11981 = new C3818(11);
        c3805.f11983 = new C3819(this, 5);
        return super.mo8144().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C3806 m8145() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_container_high";
        c3805.f11979 = new C3814(11);
        c3805.f11978 = new C3814(12);
        c3805.f11977 = true;
        c3805.f11976 = new C3814(13);
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "surface_container_high";
        c38052.f11979 = new C3815(5);
        c38052.f11978 = new C3815(6);
        c38052.f11977 = true;
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3806 m8146() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface";
        c3805.f11979 = new C3810(22);
        c3805.f11978 = new C3810(23);
        c3805.f11977 = true;
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "surface";
        c38052.f11979 = new C3799(13);
        c38052.f11978 = new C3799(15);
        c38052.f11977 = true;
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3806 m8147() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_dim";
        c3805.f11979 = new C3810(5);
        c3805.f11978 = new C3810(6);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 12);
        c3805.f11981 = new C3810(7);
        c3805.f11983 = new C3819(this, 13);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C3806 m8148() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_dim";
        c3805.f11979 = new C3810(12);
        c3805.f11978 = new C3810(13);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 16);
        c3805.f11981 = new C3810(14);
        c3805.f11983 = new C3819(this, 17);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3806 m8149() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "on_surface_variant";
        c3805.f11979 = new C3818(0);
        int i = 1;
        c3805.f11976 = new C3818(i);
        c3805.f11975 = new C3819(this, i);
        c3805.f11981 = new C3818(2);
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "on_surface_variant";
        c38052.f11979 = new C3798(13);
        c38052.f11978 = new C3798(14);
        c38052.f11975 = new ColorSpec2021$onSurfaceVariant$3(this);
        c38052.f11981 = new C3798(15);
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C3806 m8150() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "on_surface";
        c3805.f11979 = new C3809(3);
        c3805.f11978 = new C3819(this, 27);
        c3805.f11976 = new C3809(4);
        c3805.f11975 = new C3819(this, 28);
        c3805.f11981 = new C3809(5);
        C3806 c3806M8134 = c3805.m8134();
        C3805 c38052 = new C3805();
        c38052.f11980 = "on_surface";
        c38052.f11979 = new C3800(17);
        c38052.f11978 = new C3800(18);
        c38052.f11975 = new ColorSpec2021$onSurface$3(this);
        c38052.f11981 = new C3800(19);
        return c38052.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8263 mo8151(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        int i = AbstractC3811.f12003[variant.ordinal()];
        if (i == 1) {
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8151(variant, c8255, z, dynamicScheme$Platform) : AbstractC6561.m12048(C3886.m8269(c8255), C3886.m8266(c8255, dynamicScheme$Platform)) : AbstractC6561.m12048(C3886.m8270(c8255), C3886.m8267(c8255, z, dynamicScheme$Platform));
        }
        return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d);
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8255 mo8152(C8260 c8260, C3806 c3806) {
        Number number;
        C8263 c8263 = (C8263) c3806.f11989.invoke(c8260);
        double dMo8170 = mo8170(c8260, c3806);
        double d = c8263.f22878;
        InterfaceC6558 interfaceC6558 = c3806.f11986;
        if (interfaceC6558 == null || (number = (Double) interfaceC6558.invoke(c8260)) == null) {
            number = 1;
        }
        return AbstractC8256.m13823(d, number.doubleValue() * c8263.f22877, dMo8170);
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8263 mo8153(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d = c8255.f22856;
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
        int i2 = AbstractC3811.f12003[variant.ordinal()];
        if (i2 == 1) {
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 50.0d : 40.0d);
        }
        if (i2 == 2) {
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 60.0d : 48.0d);
        }
        if (i2 == 3) {
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 64.0d : 48.0d);
        }
        if (i2 == 4) {
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 80.0d : 60.0d);
        }
        super.mo8153(variant, c8255, z, dynamicScheme$Platform);
        return null;
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3806 mo8154() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "error_container";
        c3805.f11979 = new C3815(18);
        c3805.f11978 = new C3810(21);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 24);
        c3805.f11983 = new C3819(this, 29);
        c3805.f11981 = new C3809(14);
        return super.mo8154().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3806 mo8155() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "error";
        c3805.f11979 = new C3810(24);
        c3805.f11978 = new C3810(25);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 22);
        c3805.f11981 = new C3810(26);
        c3805.f11983 = new C3819(this, 23);
        return super.mo8155().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3806 mo8156() {
        C3805 c3805M8135 = m8146().m8135();
        c3805M8135.f11980 = "background";
        return super.mo8156().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805M8135.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3806 mo8157() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_container";
        c3805.f11979 = new C3814(20);
        c3805.f11978 = new C3814(21);
        c3805.f11977 = true;
        c3805.f11975 = new C3813(this, 6);
        c3805.f11983 = new C3813(this, 7);
        c3805.f11981 = new C3814(23);
        return super.mo8157().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3806 mo8158() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary";
        c3805.f11979 = new C3809(21);
        c3805.f11978 = new C3814(2);
        c3805.f11977 = true;
        c3805.f11975 = new C3813(this, 5);
        c3805.f11981 = new C3814(22);
        c3805.f11983 = new C3813(this, 10);
        return super.mo8158().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3806 mo8159() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_bright";
        c3805.f11979 = new C3818(25);
        c3805.f11978 = new C3818(26);
        c3805.f11977 = true;
        c3805.f11976 = new C3818(27);
        return super.mo8159().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3806 mo8160() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_dim";
        c3805.f11979 = new C3809(23);
        c3805.f11978 = new C3809(24);
        c3805.f11977 = true;
        c3805.f11976 = new C3809(25);
        return super.mo8160().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3806 mo8161() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_fixed";
        c3805.f11979 = new C3818(15);
        c3805.f11978 = new C3819(this, 10);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 11);
        c3805.f11981 = new C3818(16);
        return super.mo8161().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3806 mo8162() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_fixed_dim";
        c3805.f11979 = new C3818(12);
        c3805.f11978 = new C3819(this, 6);
        c3805.f11977 = true;
        c3805.f11983 = new C3819(this, 7);
        return super.mo8162().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C3806 mo8163() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "inverse_surface";
        c3805.f11979 = new C3814(9);
        c3805.f11978 = new C3814(10);
        c3805.f11977 = true;
        return super.mo8163().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3806 mo8164() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_fixed";
        c3805.f11979 = new C3809(1);
        c3805.f11978 = new C3819(this, 25);
        c3805.f11977 = true;
        c3805.f11975 = new C3819(this, 26);
        c3805.f11981 = new C3809(2);
        return super.mo8164().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3806 mo8165() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_fixed_dim";
        c3805.f11979 = new C3818(13);
        c3805.f11978 = new C3819(this, 8);
        c3805.f11977 = true;
        c3805.f11983 = new C3819(this, 9);
        return super.mo8165().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3806 mo8166() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary";
        c3805.f11979 = new C3810(17);
        c3805.f11978 = new C3810(19);
        c3805.f11977 = true;
        int i = 20;
        c3805.f11975 = new C3819(this, i);
        c3805.f11981 = new C3810(i);
        c3805.f11983 = new C3819(this, 21);
        return super.mo8166().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3806 mo8167() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_container";
        c3805.f11979 = new C3809(19);
        c3805.f11978 = new C3809(20);
        c3805.f11977 = true;
        c3805.f11975 = new C3813(this, 3);
        c3805.f11983 = new C3813(this, 4);
        c3805.f11981 = new C3809(22);
        return super.mo8167().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3805.m8134()).m8134();
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8263 mo8168(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        int i = AbstractC3811.f12003[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC6561.m12048(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 26.0d : 32.0d);
            }
            if (i == 3) {
                return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? 36.0d : 48.0d : 40.0d);
            }
            if (i != 4) {
                return super.mo8168(variant, c8255, z, dynamicScheme$Platform);
            }
            return AbstractC6561.m12048(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 74.0d : 56.0d);
        }
        double d2 = 12.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 8.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 16.0d;
        }
        return AbstractC6561.m12048(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8263 mo8169(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        int i = AbstractC3811.f12003[variant.ordinal()];
        if (i == 1) {
            return AbstractC6561.m12048(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d) * 2.2d);
        }
        if (i == 2) {
            return AbstractC6561.m12048(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d) * 1.7d);
        }
        if (i != 3) {
            return i != 4 ? super.mo8169(variant, c8255, z, dynamicScheme$Platform) : AbstractC6561.m12048(C3886.m8269(c8255), C3886.m8266(c8255, dynamicScheme$Platform) * 1.29d);
        }
        double dM8270 = C3886.m8270(c8255);
        return AbstractC6561.m12048(dM8270, C3886.m8267(c8255, z, dynamicScheme$Platform) * ((dM8270 < 105.0d || dM8270 >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final double mo8170(C8260 c8260, C3806 c3806) {
        C3806 c38062;
        C3803 c3803;
        C3806 c38063;
        double dM5072;
        c8260.getClass();
        boolean z = c8260.f22866;
        boolean z2 = c3806.f11987;
        InterfaceC6558 interfaceC6558 = c3806.f11985;
        InterfaceC6558 interfaceC65582 = c3806.f11991;
        String str = c3806.f11990;
        InterfaceC6558 interfaceC65583 = c3806.f11994;
        Double dValueOf = null;
        C3795 c3795 = interfaceC65583 != null ? (C3795) interfaceC65583.invoke(c8260) : null;
        if (c3795 != null) {
            double d = c3795.f11959;
            C3806 c38064 = c3795.f11961;
            C3806 c38065 = c3795.f11960;
            TonePolarity tonePolarity = c3795.f11958;
            ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint = c3795.f11956;
            if (tonePolarity == TonePolarity.DARKER || ((tonePolarity == TonePolarity.RELATIVE_LIGHTER && z) || (tonePolarity == TonePolarity.RELATIVE_DARKER && !z))) {
                d = -d;
            }
            boolean zM8907 = AbstractC4395.m8907(str, c38064.f11990);
            C3806 c38066 = zM8907 ? c38064 : c38065;
            if (zM8907) {
                c38064 = c38065;
            }
            double dDoubleValue = ((Number) c38066.f11988.invoke(c8260)).doubleValue();
            double dM8136 = c38064.m8136(c8260);
            double d2 = d * ((double) (zM8907 ? 1 : -1));
            int i = AbstractC3811.f12004[toneDeltaPair$DeltaConstraint.ordinal()];
            if (i == 1) {
                dM5072 = AbstractC2567.m5072(dM8136 + d2, 0.0d, 100.0d);
            } else if (i == 2) {
                dM5072 = d2 > 0.0d ? AbstractC2567.m5072(AbstractC2567.m5072(dDoubleValue, dM8136, dM8136 + d2), 0.0d, 100.0d) : AbstractC2567.m5072(AbstractC2567.m5072(dDoubleValue, dM8136 + d2, dM8136), 0.0d, 100.0d);
            } else {
                if (i != 3) {
                    C4211.m8611();
                    return 0.0d;
                }
                dM5072 = d2 > 0.0d ? AbstractC2567.m5072(dDoubleValue, dM8136 + d2, 100.0d) : AbstractC2567.m5072(dDoubleValue, 0.0d, dM8136 + d2);
            }
            if (interfaceC6558 != null && interfaceC65582 != null) {
                C3806 c38067 = (C3806) interfaceC6558.invoke(c8260);
                C3803 c38032 = (C3803) interfaceC65582.invoke(c8260);
                if (c38067 != null && c38032 != null) {
                    double dM81362 = c38067.m8136(c8260);
                    double dM8131 = c38032.m8131();
                    if (AbstractC6344.m11880(dM81362, dM5072) < dM8131) {
                        dM5072 = AbstractC3804.m8132(dM81362, dM8131);
                    }
                }
            }
            double d3 = dM5072;
            return (!z2 || AbstractC5139.m10131(str, "_fixed_dim")) ? d3 : d3 >= 57.0d ? AbstractC2567.m5072(d3, 65.0d, 100.0d) : AbstractC2567.m5072(d3, 0.0d, 49.0d);
        }
        double dDoubleValue2 = ((Number) c3806.f11988.invoke(c8260)).doubleValue();
        Double dValueOf2 = (interfaceC6558 == null || (c38063 = (C3806) interfaceC6558.invoke(c8260)) == null) ? null : Double.valueOf(c38063.m8136(c8260));
        if (interfaceC65582 != null && (c3803 = (C3803) interfaceC65582.invoke(c8260)) != null) {
            dValueOf = Double.valueOf(c3803.m8131());
        }
        if (dValueOf2 == null || dValueOf == null) {
            return dDoubleValue2;
        }
        if (AbstractC6344.m11880(dValueOf2.doubleValue(), dDoubleValue2) < dValueOf.doubleValue()) {
            dDoubleValue2 = AbstractC3804.m8132(dValueOf2.doubleValue(), dValueOf.doubleValue());
        }
        double dM50722 = dDoubleValue2;
        if (z2 && !AbstractC5139.m10131(str, "_fixed_dim")) {
            dM50722 = dM50722 >= 57.0d ? AbstractC2567.m5072(dM50722, 65.0d, 100.0d) : AbstractC2567.m5072(dM50722, 0.0d, 49.0d);
        }
        double d4 = dM50722;
        InterfaceC6558 interfaceC65584 = c3806.f11992;
        if (interfaceC65584 != null && (c38062 = (C3806) interfaceC65584.invoke(c8260)) != null) {
            double dM81363 = c38062.m8136(c8260);
            double dMax = Math.max(dValueOf2.doubleValue(), dM81363);
            double dMin = Math.min(dValueOf2.doubleValue(), dM81363);
            if (AbstractC6344.m11880(dMax, d4) < dValueOf.doubleValue() || AbstractC6344.m11880(dMin, d4) < dValueOf.doubleValue()) {
                double dM11884 = AbstractC6344.m11884(dMax, dValueOf.doubleValue());
                double dM11882 = AbstractC6344.m11882(dMin, dValueOf.doubleValue());
                ArrayList arrayList = new ArrayList();
                if (dM11884 != -1.0d) {
                    arrayList.add(Double.valueOf(dM11884));
                }
                if (dM11882 != -1.0d) {
                    arrayList.add(Double.valueOf(dM11882));
                }
                if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dM81363) < 60.0d) {
                    if (dM11884 < 0.0d) {
                        return 100.0d;
                    }
                    return dM11884;
                }
                if (arrayList.size() == 1) {
                    return ((Number) AbstractC4344.m8820(arrayList)).doubleValue();
                }
                if (dM11882 < 0.0d) {
                    return 0.0d;
                }
                return dM11882;
            }
        }
        return d4;
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8263 mo8171(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        int i = AbstractC3811.f12003[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC6561.m12048(d, 16.0d);
            }
            if (i == 3) {
                return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 16.0d : 24.0d);
            }
            if (i != 4) {
                return super.mo8171(variant, c8255, z, dynamicScheme$Platform);
            }
            return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 56.0d : 36.0d);
        }
        double d2 = 6.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 4.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 10.0d;
        }
        return AbstractC6561.m12048(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C3817
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8263 mo8172(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        int i = AbstractC3811.f12003[variant.ordinal()];
        if (i == 1) {
            return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 20.0d : 36.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8172(variant, c8255, z, dynamicScheme$Platform) : AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d) : AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d);
        }
        return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 28.0d : 32.0d);
    }
}

package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3885;
import io.ktor.util.C4210;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p263.AbstractC8255;
import p263.C8254;
import p265.C8259;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3811 extends C3816 {
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3805 m8150() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_dim";
        c3804.f11974 = new C3809(8);
        c3804.f11973 = new C3809(9);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 14);
        c3804.f11976 = new C3809(11);
        c3804.f11978 = new C3818(this, 15);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3805 m8151() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_container_highest";
        c3804.f11974 = new C3808(29);
        c3804.f11973 = new C3813(0);
        c3804.f11972 = true;
        c3804.f11971 = new C3813(1);
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "surface_container_highest";
        c38042.f11974 = new C3799(11);
        c38042.f11973 = new C3799(12);
        c38042.f11972 = true;
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3805 m8152() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "inverse_on_surface";
        c3804.f11974 = new C3808(8);
        int i = 0;
        c3804.f11970 = new C3812(this, i);
        int i2 = 9;
        c3804.f11976 = new C3808(i2);
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "inverse_on_surface";
        c38042.f11974 = new C3814(7);
        c38042.f11973 = new C3814(i2);
        c38042.f11970 = new C3818(this, i);
        c38042.f11976 = new C3814(10);
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C3805 m8153() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "error_dim";
        c3804.f11974 = new C3809(15);
        c3804.f11973 = new C3809(16);
        c3804.f11972 = true;
        int i = 18;
        c3804.f11970 = new C3818(this, i);
        c3804.f11976 = new C3809(i);
        c3804.f11978 = new C3818(this, 19);
        return c3804.m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3805 mo8154() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_fixed_dim";
        int i = 3;
        c3804.f11974 = new C3817(i);
        c3804.f11973 = new C3818(this, 2);
        c3804.f11972 = true;
        c3804.f11978 = new C3818(this, i);
        return super.mo8154().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C3805 mo8155() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_fixed";
        c3804.f11974 = new C3808(13);
        c3804.f11973 = new C3812(this, 1);
        c3804.f11972 = true;
        c3804.f11970 = new C3812(this, 2);
        c3804.f11976 = new C3808(15);
        return super.mo8155().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3805 mo8156() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_container";
        c3804.f11974 = new C3813(28);
        c3804.f11973 = new C3813(29);
        c3804.f11972 = true;
        c3804.f11970 = new C3812(this, 8);
        c3804.f11978 = new C3812(this, 9);
        c3804.f11976 = new C3814(19);
        return super.mo8156().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3805 mo8157() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary";
        c3804.f11974 = new C3817(9);
        c3804.f11973 = new C3817(10);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 4);
        c3804.f11976 = new C3817(11);
        c3804.f11978 = new C3818(this, 5);
        return super.mo8157().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C3805 m8158() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_container_high";
        c3804.f11974 = new C3813(11);
        c3804.f11973 = new C3813(12);
        c3804.f11972 = true;
        c3804.f11971 = new C3813(13);
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "surface_container_high";
        c38042.f11974 = new C3814(5);
        c38042.f11973 = new C3814(6);
        c38042.f11972 = true;
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3805 m8159() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface";
        c3804.f11974 = new C3809(22);
        c3804.f11973 = new C3809(23);
        c3804.f11972 = true;
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "surface";
        c38042.f11974 = new C3798(13);
        c38042.f11973 = new C3798(15);
        c38042.f11972 = true;
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3805 m8160() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_dim";
        c3804.f11974 = new C3809(5);
        c3804.f11973 = new C3809(6);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 12);
        c3804.f11976 = new C3809(7);
        c3804.f11978 = new C3818(this, 13);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C3805 m8161() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_dim";
        c3804.f11974 = new C3809(12);
        c3804.f11973 = new C3809(13);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 16);
        c3804.f11976 = new C3809(14);
        c3804.f11978 = new C3818(this, 17);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3805 m8162() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "on_surface_variant";
        c3804.f11974 = new C3817(0);
        int i = 1;
        c3804.f11971 = new C3817(i);
        c3804.f11970 = new C3818(this, i);
        c3804.f11976 = new C3817(2);
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "on_surface_variant";
        c38042.f11974 = new C3797(13);
        c38042.f11973 = new C3797(14);
        c38042.f11970 = new ColorSpec2021$onSurfaceVariant$3(this);
        c38042.f11976 = new C3797(15);
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C3805 m8163() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "on_surface";
        c3804.f11974 = new C3808(3);
        c3804.f11973 = new C3818(this, 27);
        c3804.f11971 = new C3808(4);
        c3804.f11970 = new C3818(this, 28);
        c3804.f11976 = new C3808(5);
        C3805 c3805M8147 = c3804.m8147();
        C3804 c38042 = new C3804();
        c38042.f11975 = "on_surface";
        c38042.f11974 = new C3799(17);
        c38042.f11973 = new C3799(18);
        c38042.f11970 = new ColorSpec2021$onSurface$3(this);
        c38042.f11976 = new C3799(19);
        return c38042.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8262 mo8164(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        int i = AbstractC3810.f11998[variant.ordinal()];
        if (i == 1) {
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8164(variant, c8254, z, dynamicScheme$Platform) : AbstractC6560.m12032(C3885.m8282(c8254), C3885.m8278(c8254, dynamicScheme$Platform)) : AbstractC6560.m12032(C3885.m8274(c8254), C3885.m8279(c8254, z, dynamicScheme$Platform));
        }
        return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d);
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8254 mo8165(C8259 c8259, C3805 c3805) {
        Number number;
        C8262 c8262 = (C8262) c3805.f11984.invoke(c8259);
        double dMo8183 = mo8183(c8259, c3805);
        double d = c8262.f22879;
        InterfaceC6557 interfaceC6557 = c3805.f11981;
        if (interfaceC6557 == null || (number = (Double) interfaceC6557.invoke(c8259)) == null) {
            number = 1;
        }
        return AbstractC8255.m13806(d, number.doubleValue() * c8262.f22878, dMo8183);
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8262 mo8166(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d = c8254.f22857;
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
        int i2 = AbstractC3810.f11998[variant.ordinal()];
        if (i2 == 1) {
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 50.0d : 40.0d);
        }
        if (i2 == 2) {
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 60.0d : 48.0d);
        }
        if (i2 == 3) {
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 64.0d : 48.0d);
        }
        if (i2 == 4) {
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 80.0d : 60.0d);
        }
        super.mo8166(variant, c8254, z, dynamicScheme$Platform);
        return null;
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3805 mo8167() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "error_container";
        c3804.f11974 = new C3814(18);
        c3804.f11973 = new C3809(21);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 24);
        c3804.f11978 = new C3818(this, 29);
        c3804.f11976 = new C3808(14);
        return super.mo8167().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3805 mo8168() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "error";
        c3804.f11974 = new C3809(24);
        c3804.f11973 = new C3809(25);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 22);
        c3804.f11976 = new C3809(26);
        c3804.f11978 = new C3818(this, 23);
        return super.mo8168().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3805 mo8169() {
        C3804 c3804M8148 = m8159().m8148();
        c3804M8148.f11975 = "background";
        return super.mo8169().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804M8148.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3805 mo8170() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_container";
        c3804.f11974 = new C3813(20);
        c3804.f11973 = new C3813(21);
        c3804.f11972 = true;
        c3804.f11970 = new C3812(this, 6);
        c3804.f11978 = new C3812(this, 7);
        c3804.f11976 = new C3813(23);
        return super.mo8170().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3805 mo8171() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary";
        c3804.f11974 = new C3808(21);
        c3804.f11973 = new C3813(2);
        c3804.f11972 = true;
        c3804.f11970 = new C3812(this, 5);
        c3804.f11976 = new C3813(22);
        c3804.f11978 = new C3812(this, 10);
        return super.mo8171().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3805 mo8172() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_bright";
        c3804.f11974 = new C3817(25);
        c3804.f11973 = new C3817(26);
        c3804.f11972 = true;
        c3804.f11971 = new C3817(27);
        return super.mo8172().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3805 mo8173() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_dim";
        c3804.f11974 = new C3808(23);
        c3804.f11973 = new C3808(24);
        c3804.f11972 = true;
        c3804.f11971 = new C3808(25);
        return super.mo8173().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3805 mo8174() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_fixed";
        c3804.f11974 = new C3817(15);
        c3804.f11973 = new C3818(this, 10);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 11);
        c3804.f11976 = new C3817(16);
        return super.mo8174().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3805 mo8175() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_fixed_dim";
        c3804.f11974 = new C3817(12);
        c3804.f11973 = new C3818(this, 6);
        c3804.f11972 = true;
        c3804.f11978 = new C3818(this, 7);
        return super.mo8175().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C3805 mo8176() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "inverse_surface";
        c3804.f11974 = new C3813(9);
        c3804.f11973 = new C3813(10);
        c3804.f11972 = true;
        return super.mo8176().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3805 mo8177() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_fixed";
        c3804.f11974 = new C3808(1);
        c3804.f11973 = new C3818(this, 25);
        c3804.f11972 = true;
        c3804.f11970 = new C3818(this, 26);
        c3804.f11976 = new C3808(2);
        return super.mo8177().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3805 mo8178() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_fixed_dim";
        c3804.f11974 = new C3817(13);
        c3804.f11973 = new C3818(this, 8);
        c3804.f11972 = true;
        c3804.f11978 = new C3818(this, 9);
        return super.mo8178().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3805 mo8179() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary";
        c3804.f11974 = new C3809(17);
        c3804.f11973 = new C3809(19);
        c3804.f11972 = true;
        int i = 20;
        c3804.f11970 = new C3818(this, i);
        c3804.f11976 = new C3809(i);
        c3804.f11978 = new C3818(this, 21);
        return super.mo8179().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3805 mo8180() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_container";
        c3804.f11974 = new C3808(19);
        c3804.f11973 = new C3808(20);
        c3804.f11972 = true;
        c3804.f11970 = new C3812(this, 3);
        c3804.f11978 = new C3812(this, 4);
        c3804.f11976 = new C3808(22);
        return super.mo8180().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3804.m8147()).m8147();
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8262 mo8181(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        int i = AbstractC3810.f11998[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC6560.m12032(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 26.0d : 32.0d);
            }
            if (i == 3) {
                return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? 36.0d : 48.0d : 40.0d);
            }
            if (i != 4) {
                return super.mo8181(variant, c8254, z, dynamicScheme$Platform);
            }
            return AbstractC6560.m12032(d, dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 74.0d : 56.0d);
        }
        double d2 = 12.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 8.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 16.0d;
        }
        return AbstractC6560.m12032(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8262 mo8182(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        int i = AbstractC3810.f11998[variant.ordinal()];
        if (i == 1) {
            return AbstractC6560.m12032(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 1.4d : 6.0d) * 2.2d);
        }
        if (i == 2) {
            return AbstractC6560.m12032(d, (dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 5.0d : 10.0d) * 1.7d);
        }
        if (i != 3) {
            return i != 4 ? super.mo8182(variant, c8254, z, dynamicScheme$Platform) : AbstractC6560.m12032(C3885.m8282(c8254), C3885.m8278(c8254, dynamicScheme$Platform) * 1.29d);
        }
        double dM8274 = C3885.m8274(c8254);
        return AbstractC6560.m12032(dM8274, C3885.m8279(c8254, z, dynamicScheme$Platform) * ((dM8274 < 105.0d || dM8274 >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final double mo8183(C8259 c8259, C3805 c3805) {
        C3805 c38052;
        C3802 c3802;
        C3805 c38053;
        double dM11415;
        c8259.getClass();
        boolean z = c8259.f22867;
        boolean z2 = c3805.f11982;
        InterfaceC6557 interfaceC6557 = c3805.f11980;
        InterfaceC6557 interfaceC65572 = c3805.f11986;
        String str = c3805.f11985;
        InterfaceC6557 interfaceC65573 = c3805.f11989;
        Double dValueOf = null;
        C3794 c3794 = interfaceC65573 != null ? (C3794) interfaceC65573.invoke(c8259) : null;
        if (c3794 != null) {
            double d = c3794.f11954;
            C3805 c38054 = c3794.f11956;
            C3805 c38055 = c3794.f11955;
            TonePolarity tonePolarity = c3794.f11953;
            ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint = c3794.f11951;
            if (tonePolarity == TonePolarity.DARKER || ((tonePolarity == TonePolarity.RELATIVE_LIGHTER && z) || (tonePolarity == TonePolarity.RELATIVE_DARKER && !z))) {
                d = -d;
            }
            boolean zM8917 = AbstractC4394.m8917(str, c38054.f11985);
            C3805 c38056 = zM8917 ? c38054 : c38055;
            if (zM8917) {
                c38054 = c38055;
            }
            double dDoubleValue = ((Number) c38056.f11983.invoke(c8259)).doubleValue();
            double dM8149 = c38054.m8149(c8259);
            double d2 = d * ((double) (zM8917 ? 1 : -1));
            int i = AbstractC3810.f11999[toneDeltaPair$DeltaConstraint.ordinal()];
            if (i == 1) {
                dM11415 = AbstractC6087.m11415(dM8149 + d2, 0.0d, 100.0d);
            } else if (i == 2) {
                dM11415 = d2 > 0.0d ? AbstractC6087.m11415(AbstractC6087.m11415(dDoubleValue, dM8149, dM8149 + d2), 0.0d, 100.0d) : AbstractC6087.m11415(AbstractC6087.m11415(dDoubleValue, dM8149 + d2, dM8149), 0.0d, 100.0d);
            } else {
                if (i != 3) {
                    C4210.m8621();
                    return 0.0d;
                }
                dM11415 = d2 > 0.0d ? AbstractC6087.m11415(dDoubleValue, dM8149 + d2, 100.0d) : AbstractC6087.m11415(dDoubleValue, 0.0d, dM8149 + d2);
            }
            if (interfaceC6557 != null && interfaceC65572 != null) {
                C3805 c38057 = (C3805) interfaceC6557.invoke(c8259);
                C3802 c38022 = (C3802) interfaceC65572.invoke(c8259);
                if (c38057 != null && c38022 != null) {
                    double dM81492 = c38057.m8149(c8259);
                    double dM8144 = c38022.m8144();
                    if (AbstractC6087.m11387(dM81492, dM11415) < dM8144) {
                        dM11415 = AbstractC3803.m8145(dM81492, dM8144);
                    }
                }
            }
            double d3 = dM11415;
            return (!z2 || AbstractC5138.m10133(str, "_fixed_dim")) ? d3 : d3 >= 57.0d ? AbstractC6087.m11415(d3, 65.0d, 100.0d) : AbstractC6087.m11415(d3, 0.0d, 49.0d);
        }
        double dDoubleValue2 = ((Number) c3805.f11983.invoke(c8259)).doubleValue();
        Double dValueOf2 = (interfaceC6557 == null || (c38053 = (C3805) interfaceC6557.invoke(c8259)) == null) ? null : Double.valueOf(c38053.m8149(c8259));
        if (interfaceC65572 != null && (c3802 = (C3802) interfaceC65572.invoke(c8259)) != null) {
            dValueOf = Double.valueOf(c3802.m8144());
        }
        if (dValueOf2 == null || dValueOf == null) {
            return dDoubleValue2;
        }
        if (AbstractC6087.m11387(dValueOf2.doubleValue(), dDoubleValue2) < dValueOf.doubleValue()) {
            dDoubleValue2 = AbstractC3803.m8145(dValueOf2.doubleValue(), dValueOf.doubleValue());
        }
        double dM114152 = dDoubleValue2;
        if (z2 && !AbstractC5138.m10133(str, "_fixed_dim")) {
            dM114152 = dM114152 >= 57.0d ? AbstractC6087.m11415(dM114152, 65.0d, 100.0d) : AbstractC6087.m11415(dM114152, 0.0d, 49.0d);
        }
        double d4 = dM114152;
        InterfaceC6557 interfaceC65574 = c3805.f11987;
        if (interfaceC65574 != null && (c38052 = (C3805) interfaceC65574.invoke(c8259)) != null) {
            double dM81493 = c38052.m8149(c8259);
            double dMax = Math.max(dValueOf2.doubleValue(), dM81493);
            double dMin = Math.min(dValueOf2.doubleValue(), dM81493);
            if (AbstractC6087.m11387(dMax, d4) < dValueOf.doubleValue() || AbstractC6087.m11387(dMin, d4) < dValueOf.doubleValue()) {
                double dM11394 = AbstractC6087.m11394(dMax, dValueOf.doubleValue());
                double dM11404 = AbstractC6087.m11404(dMin, dValueOf.doubleValue());
                ArrayList arrayList = new ArrayList();
                if (dM11394 != -1.0d) {
                    arrayList.add(Double.valueOf(dM11394));
                }
                if (dM11404 != -1.0d) {
                    arrayList.add(Double.valueOf(dM11404));
                }
                if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dM81493) < 60.0d) {
                    if (dM11394 < 0.0d) {
                        return 100.0d;
                    }
                    return dM11394;
                }
                if (arrayList.size() == 1) {
                    return ((Number) AbstractC4343.m8827(arrayList)).doubleValue();
                }
                if (dM11404 < 0.0d) {
                    return 0.0d;
                }
                return dM11404;
            }
        }
        return d4;
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8262 mo8184(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        int i = AbstractC3810.f11998[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC6560.m12032(d, 16.0d);
            }
            if (i == 3) {
                return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (dynamicScheme$Platform == DynamicScheme$Platform.PHONE && z) ? 16.0d : 24.0d);
            }
            if (i != 4) {
                return super.mo8184(variant, c8254, z, dynamicScheme$Platform);
            }
            return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 56.0d : 36.0d);
        }
        double d2 = 6.0d;
        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
            if (d < 250.0d || d >= 270.0d) {
                d2 = 4.0d;
            }
        } else if (d >= 250.0d && d < 270.0d) {
            d2 = 10.0d;
        }
        return AbstractC6560.m12032(d, d2);
    }

    @Override // com.materialkolor.dynamiccolor.C3816
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8262 mo8185(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        int i = AbstractC3810.f11998[variant.ordinal()];
        if (i == 1) {
            return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 20.0d : 36.0d);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? super.mo8185(variant, c8254, z, dynamicScheme$Platform) : AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d) : AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d);
        }
        return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? 28.0d : 32.0d);
    }
}

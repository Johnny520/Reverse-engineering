package com.materialkolor.dynamiccolor;

import androidx.compose.foundation.text.C0995;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C4210;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p263.AbstractC8255;
import p263.C8254;
import p265.C8259;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3816 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m8186(C8259 c8259) {
        Variant variant = c8259.f22868;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public C3805 mo8154() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_fixed_dim";
        c3804.f11974 = new C3799(20);
        c3804.f11973 = new C3799(21);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$tertiaryFixedDim$3(this);
        c3804.f11976 = new C3799(22);
        c3804.f11978 = new C3800(this, 3);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C3805 mo8155() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_fixed";
        int i = 4;
        c3804.f11974 = new C3798(i);
        c3804.f11973 = new C3798(6);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$tertiaryFixed$3(this);
        c3804.f11976 = new C3798(7);
        c3804.f11978 = new C3800(this, i);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C3805 mo8156() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary_container";
        c3804.f11974 = new C3797(22);
        c3804.f11973 = new C3797(this);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$tertiaryContainer$3(this);
        c3804.f11976 = new C3797(24);
        c3804.f11978 = new C3800(this, 7);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public C3805 mo8157() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "tertiary";
        c3804.f11974 = new C3815(20);
        c3804.f11973 = new C3815(21);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$tertiary$3(this);
        c3804.f11976 = new C3815(22);
        c3804.f11978 = new C3800(this, 11);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C8262 mo8164(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        switch (AbstractC3819.f12008[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC6560.m12032(d, c8254.f22856 / 8.0d);
            case 3:
                return AbstractC6560.m12032(d, 10.0d);
            case 4:
                return AbstractC6560.m12032(d, 0.0d);
            case 5:
                return AbstractC6560.m12032(d, 2.0d);
            case 6:
                return AbstractC6560.m12032(d, 0.0d);
            case 7:
                return AbstractC6560.m12032(d, 6.0d);
            case 8:
                double d2 = (d + 15.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC6560.m12032(d2, 8.0d);
            case 9:
                return AbstractC6560.m12032(d, 10.0d);
            default:
                C4210.m8621();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C8254 mo8165(C8259 c8259, C3805 c3805) {
        double dMo8183 = mo8183(c8259, c3805);
        C8262 c8262 = (C8262) c3805.f11984.invoke(c8259);
        return AbstractC8255.m13806(c8262.f22879, c8262.f22878, dMo8183);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C8262 mo8166(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        switch (AbstractC3819.f12008[variant.ordinal()]) {
            default:
                C4210.m8621();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C3805 mo8167() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "error_container";
        c3804.f11974 = new C3815(23);
        c3804.f11973 = new C3815(24);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$errorContainer$3(this);
        c3804.f11976 = new C3815(25);
        c3804.f11978 = new C3800(this, 12);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3805 mo8168() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "error";
        c3804.f11974 = new C3815(6);
        c3804.f11973 = new C3815(7);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$error$3(this);
        c3804.f11976 = new C3815(9);
        c3804.f11978 = new C3800(this, 10);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C3805 mo8169() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "background";
        c3804.f11974 = new C3799(24);
        c3804.f11973 = new C3798(5);
        c3804.f11972 = true;
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public C3805 mo8170() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_container";
        c3804.f11974 = new C3799(13);
        c3804.f11973 = new C3799(this);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$secondaryContainer$3(this);
        c3804.f11976 = new C3799(16);
        c3804.f11978 = new C3800(this, 2);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public C3805 mo8171() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary";
        c3804.f11974 = new C3796(27);
        c3804.f11973 = new C3796(29);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$secondary$3(this);
        c3804.f11976 = new C3815(0);
        c3804.f11978 = new C3800(this, 9);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public C3805 mo8172() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_bright";
        c3804.f11974 = new C3796(9);
        c3804.f11973 = new C3796(10);
        c3804.f11972 = true;
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C3805 mo8173() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_dim";
        c3804.f11974 = new C3796(28);
        c3804.f11973 = new C3815(8);
        c3804.f11972 = true;
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public C3805 mo8174() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_fixed";
        c3804.f11974 = new C3814(11);
        c3804.f11973 = new C3814(12);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$secondaryFixed$3(this);
        int i = 13;
        c3804.f11976 = new C3814(i);
        c3804.f11978 = new C3800(this, i);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public C3805 mo8175() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "secondary_fixed_dim";
        c3804.f11974 = new C0995(25);
        c3804.f11973 = new C0995(26);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$secondaryFixedDim$3(this);
        c3804.f11976 = new C0995(27);
        c3804.f11978 = new C3800(this, 1);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C3805 mo8176() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "inverse_surface";
        c3804.f11974 = new C3796(22);
        c3804.f11973 = new C3796(23);
        c3804.f11972 = true;
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public C3805 mo8177() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_fixed";
        c3804.f11974 = new C3798(16);
        c3804.f11973 = new C3798(17);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$primaryFixed$3(this);
        c3804.f11976 = new C3798(18);
        c3804.f11978 = new C3800(this, 6);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C3805 mo8178() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_fixed_dim";
        c3804.f11974 = new C0995(21);
        c3804.f11973 = new C0995(22);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$primaryFixedDim$3(this);
        c3804.f11976 = new C0995(23);
        c3804.f11978 = new C3800(this, 0);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C3805 mo8179() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary";
        c3804.f11974 = new C3798(8);
        c3804.f11973 = new C3798(9);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$primary$3(this);
        c3804.f11976 = new C3798(10);
        c3804.f11978 = new C3800(this, 5);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C3805 mo8180() {
        C3804 c3804 = new C3804();
        c3804.f11975 = "primary_container";
        c3804.f11974 = new C3796(24);
        c3804.f11973 = new C3796(this);
        c3804.f11972 = true;
        c3804.f11970 = new ColorSpec2021$primaryContainer$3(this);
        c3804.f11976 = new C3796(26);
        c3804.f11978 = new C3800(this, 8);
        return c3804.m8147();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C8262 mo8181(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        switch (AbstractC3819.f12008[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC6560.m12032(d, c8254.f22856);
            case 3:
                double d2 = (d - 50.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC6560.m12032(d2, 48.0d);
            case 4:
                return AbstractC6560.m12032(d, 0.0d);
            case 5:
                return AbstractC6560.m12032(d, 12.0d);
            case 6:
                return AbstractC6560.m12032(d, 48.0d);
            case 7:
                return AbstractC6560.m12032(d, 36.0d);
            case 8:
                double d3 = (d + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6560.m12032(d3, 40.0d);
            case 9:
                return AbstractC6560.m12032(d, 200.0d);
            default:
                C4210.m8621();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public C8262 mo8182(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22856;
        double d2 = c8254.f22857;
        switch (AbstractC3819.f12008[variant.ordinal()]) {
            case 1:
                return AbstractC6560.m12032(d2, (d / 8.0d) + 4.0d);
            case 2:
                return AbstractC6560.m12032(d2, (d / 8.0d) + 4.0d);
            case 3:
                return AbstractC6560.m12032(d2, 16.0d);
            case 4:
                return AbstractC6560.m12032(d2, 0.0d);
            case 5:
                return AbstractC6560.m12032(d2, 2.0d);
            case 6:
                return AbstractC6560.m12032(d2, 0.0d);
            case 7:
                return AbstractC6560.m12032(d2, 8.0d);
            case 8:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6560.m12032(d3, 12.0d);
            case 9:
                return AbstractC6560.m12032(d2, 12.0d);
            default:
                C4210.m8621();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double mo8183(p265.C8259 r31, com.materialkolor.dynamiccolor.C3805 r32) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.dynamiccolor.C3816.mo8183(飘花落叶言楪哲兰苏世子.飘花落叶言子楪世哲苏兰, com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲苏世):double");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3805 m8187(C8259 c8259) {
        return c8259.f22867 ? mo8172() : mo8173();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C8262 mo8184(Variant variant, C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8254.f22857;
        switch (AbstractC3819.f12008[variant.ordinal()]) {
            case 1:
            case 2:
                double d2 = c8254.f22856;
                return AbstractC6560.m12032(d, Math.max(d2 - 32.0d, d2 * 0.5d));
            case 3:
                double d3 = (d - 50.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6560.m12032(d3, 36.0d);
            case 4:
                return AbstractC6560.m12032(d, 0.0d);
            case 5:
                return AbstractC6560.m12032(d, 8.0d);
            case 6:
                return AbstractC6560.m12032(d, 16.0d);
            case 7:
                return AbstractC6560.m12032(d, 16.0d);
            case 8:
                return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 9:
                return AbstractC6560.m12032(AbstractC6325.m11867(c8254, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            default:
                C4210.m8621();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p266.C8262 mo8185(com.materialkolor.scheme.Variant r22, p263.C8254 r23, boolean r24, com.materialkolor.scheme.DynamicScheme$Platform r25) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.dynamiccolor.C3816.mo8185(com.materialkolor.scheme.Variant, 飘花落叶言楪哲兰世苏子.飘花落叶言子楪世苏兰哲, boolean, com.materialkolor.scheme.DynamicScheme$Platform):飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏兰哲");
    }
}
